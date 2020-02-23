import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.io.*;

public class InterpretVisitor extends GrammarBaseVisitor<Value>{

    Scanner io = new Scanner(System.in);
    private HashMap<String, Value> globalMem = new HashMap<String, Value>();
    private Stack<HashMap<String, Value>> scopes = new Stack<HashMap<String, Value>>();

    public static final float SMALL_VALUE = 0.0000001f;

    @Override 
    public Value visitStart(GrammarParser.StartContext ctx) {
        scopes.push(globalMem);
        System.out.println(ctx.program());
        return visitChildren(ctx); 
    }

	

    // Variable declaration overrides
    @Override 
    public Value visitInitDec(GrammarParser.InitDecContext ctx) { 
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());

        return scopes.peek().put(id, value);
    }
	
    @Override 
    public Value visitNormDec(GrammarParser.NormDecContext ctx) { 
        String id = ctx.ID().getText();
        Value value = null;

        switch(ctx.type.getType()){

            case GrammarParser.BOOLEAN:
                value = new Value(true);
            case GrammarParser.REAL:
                value = new Value(0.0f);
            default:
                value = null;
        }
        return scopes.peek().put(id, value); 
    }


    // Variable assignment override
    @Override 
    public Value visitVarAssign(GrammarParser.VarAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());

        scopes.peek().put(id, value);
        System.out.println("In table: " + scopes.peek());

        return Value.VOID;
    }

    @Override 
    public Value visitVarForAssign(GrammarParser.VarForAssignContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());

        scopes.peek().put(id, value);
        System.out.println("In table: " + scopes.peek());

        return value; 
    }
	

    // readln override
    @Override 
    public Value visitReadLn(GrammarParser.ReadLnContext ctx) {
        String id = ctx.ID().getText();
        Value a = new Value(io.nextLine());

        scopes.peek().put(id, a);
        
        System.out.println("In table: " + scopes.peek());

        return Value.VOID;
    }
	

    //writeln override
    @Override 
    public Value visitWriteLn(GrammarParser.WriteLnContext ctx) {
        List<GrammarParser.LineContext> lines = ctx.line();
        String printStr = "";

        for(GrammarParser.LineContext line : lines){
            Value a = this.visit(line);
            printStr += a.asString();
        }

        System.out.println(printStr);

        return Value.VOID;
    }
    

    @Override 
    public Value visitExprLine(GrammarParser.ExprLineContext ctx) {
        return this.visit(ctx.expr()); 
    }
    
    
    @Override 
    public Value visitStrLine(GrammarParser.StrLineContext ctx) {
        return new Value(ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1));
    }


    // while loop override
    @Override 
    public Value visitWhileLoop(GrammarParser.WhileLoopContext ctx) {
        HashMap<String, Value> newScope = new HashMap<String, Value>();
        newScope.putAll(scopes.peek());
        scopes.push(newScope);

        Value value = this.visit(ctx.expr());

        //INSERT SAVE SCOPE HERE

        while(value.asBoolean()){
            this.visit(ctx.loopBlock());

            value = this.visit(ctx.expr());
        }

        AdjustScope();

        return Value.VOID;
    }
    
    
    // for loop
    @Override 
    public Value visitForLoop(GrammarParser.ForLoopContext ctx) {
        HashMap<String, Value> newScope = new HashMap<String, Value>();
        newScope.putAll(scopes.peek());
        scopes.push(newScope);

        Value value = this.visit(ctx.varForAssign());
        Value compareElement = this.visit(ctx.element());
        float i = value.asFloat();
        float iMax = compareElement.asFloat();

        //INSERT SAVE SCOPE HERE

        while(i <= iMax){
            this.visit(ctx.loopBlock());

            i++;
        }

        AdjustScope();

        return Value.VOID;
    }
	
	

    // if statement override
    @Override 
    public Value visitIfStatement(GrammarParser.IfStatementContext ctx) {
        List<GrammarParser.CondBlockContext> conditions = ctx.condBlock();

        boolean completed = false;

        for(GrammarParser.CondBlockContext condition : conditions){

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()){
                completed = true;
                this.visit(condition.stateBlock());
                break;
            }
        }

        if(!completed && ctx.stateBlock() != null){
            this.visit(ctx.stateBlock());
        }

        return Value.VOID;
    }
	


    //expr overrides
    @Override 
    public Value visitEquationExpr(GrammarParser.EquationExprContext ctx) {
        Value value = this.visit(ctx.expr());

        switch(ctx.type.getType()){
            case GrammarParser.SQRT:
                return new Value((float)Math.sqrt(value.asFloat()));
            case GrammarParser.LN:
                return new Value((float)Math.log(value.asFloat()));
            case GrammarParser.EXP:
                return new Value((float)Math.exp(value.asFloat()));
            case GrammarParser.SIN:
                return new Value((float)Math.sin(Math.toRadians(value.asFloat())));
            case GrammarParser.COS:
                return new Value((float)Math.cos(Math.toRadians(value.asFloat())));
        }
        return Value.VOID;
    }
    
    @Override
    public Value visitUnaryExpr(GrammarParser.UnaryExprContext ctx){
        Value value = this.visit(ctx.expr());
        return new Value(-value.asFloat());
    }

    @Override	
	public Value visitNotExpr(GrammarParser.NotExprContext ctx){
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }
	
    @Override
    public Value visitMultExpr(GrammarParser.MultExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case GrammarParser.MULT:
                return new Value(left.asFloat() * right.asFloat());
            case GrammarParser.DIV:
                return new Value(left.asFloat() / right.asFloat());
            case GrammarParser.MOD:
                return new Value(left.asFloat() % right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }
	
    @Override
    public Value visitAddExpr(GrammarParser.AddExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        // System.out.println(ctx.hashCode());
        // System.out.println(ctx.getRuleIndex());
        // System.out.println(ctx.toString());
        // System.out.println(ctx.getParent());

        switch(ctx.op.getType()){
            case GrammarParser.ADD:
                return new Value(left.asFloat() + right.asFloat());
            case GrammarParser.SUBT:
                return new Value(left.asFloat() - right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }
    
    @Override
    public Value visitCompareExpr(GrammarParser.CompareExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case GrammarParser.LTE:
                return new Value(left.asFloat() <= right.asFloat());
            case GrammarParser.GTE:
                return new Value(left.asFloat() >= right.asFloat());
            case GrammarParser.LT:
                return new Value(left.asFloat() < right.asFloat());
            case GrammarParser.GT:
                return new Value(left.asFloat() > right.asFloat());
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }
    
    @Override
    public Value visitEqualityExpr(GrammarParser.EqualityExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        switch(ctx.op.getType()){
            case GrammarParser.EQ:
                return left.isFloat() && right.isFloat() ?
                    new Value(Math.abs(left.asFloat() - right.asFloat()) < SMALL_VALUE) :
                    new Value(left.equals(right));
            case GrammarParser.NEQ:
                return left.isFloat() && right.isFloat() ?
                    new Value(Math.abs(left.asFloat() - right.asFloat()) >= SMALL_VALUE) :
                    new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: ");
        }
    }
    
    @Override
    public Value visitAndExpr(GrammarParser.AndExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        return new Value(left.asBoolean() && right.asBoolean());
    }
	
    @Override
    public Value visitOrExpr(GrammarParser.OrExprContext ctx){
        Value left = this.visit(ctx.lEx);
        Value right = this.visit(ctx.rEx);

        return new Value(left.asBoolean() || right.asBoolean());
    }
	
   
	
    // Element overrides
    @Override 
    public Value visitParElement(GrammarParser.ParElementContext ctx) { 
        return this.visit(ctx.expr());
    }
	
    @Override 
    public Value visitIdElement(GrammarParser.IdElementContext ctx) { 
        String id = ctx.getText();
        String value = scopes.peek().get(id).toString();



        try{
            return new Value(Float.parseFloat(value));
        }
        catch(Exception e){
            return new Value(Boolean.parseBoolean(value));
        }
        // if(value == null) {
        //     throw new RuntimeException("no such variable: " + id);
        // }
        //return value;
    }
	
    @Override 
    public Value visitBoolElement(GrammarParser.BoolElementContext ctx) { 
        return new Value(Boolean.valueOf(ctx.getText()));
    }
	
    @Override 
    public Value visitRealElement(GrammarParser.RealElementContext ctx) {
        return new Value(Float.valueOf(ctx.getText())); 
    }
	

    private void AdjustScope(){
        HashMap<String, Value> currScope = scopes.pop();
        HashMap<String, Value> oldScope = scopes.peek();
        for(Map.Entry<String, Value> entry : oldScope.entrySet()){
            if(currScope.containsKey(entry.getKey())){
                Value val = currScope.get(entry.getKey());
                oldScope.put(entry.getKey(), val);
            }
        }
    }




}