// Generated from Grammar.g4 by ANTLR 4.8

     import java.util.HashMap; 
     import java.lang.Math;
     import java.util.Scanner;
     
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(GrammarParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#varDecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecs(GrammarParser.VarDecsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDec(GrammarParser.InitDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormDec(GrammarParser.NormDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecs(GrammarParser.FunctionDecsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#funcOrProcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOrProcDec(GrammarParser.FuncOrProcDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(GrammarParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#procDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDec(GrammarParser.ProcDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(GrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#paramGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamGroup(GrammarParser.ParamGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(GrammarParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(GrammarParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(GrammarParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcAssignment}
	 * labeled alternative in {@link GrammarParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAssignment(GrammarParser.FuncAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link GrammarParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(GrammarParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#readLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLn(GrammarParser.ReadLnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#writeLn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteLn(GrammarParser.WriteLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLine(GrammarParser.ExprLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLine(GrammarParser.StrLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loopType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopType(GrammarParser.LoopTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(GrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#varForAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarForAssign(GrammarParser.VarForAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(GrammarParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatements(GrammarParser.LoopStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(GrammarParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eval_break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_break(GrammarParser.Eval_breakContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eval_continue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_continue(GrammarParser.Eval_continueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBlock(GrammarParser.CondBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stateBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBlock(GrammarParser.StateBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(GrammarParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(GrammarParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(GrammarParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(GrammarParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpr(GrammarParser.ElementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(GrammarParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equationExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationExpr(GrammarParser.EquationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(GrammarParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(GrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functCallExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctCallExpr(GrammarParser.FunctCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#func_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_identifier(GrammarParser.Func_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParElement(GrammarParser.ParElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdElement(GrammarParser.IdElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealElement(GrammarParser.RealElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GrammarParser.IdentifierContext ctx);
}