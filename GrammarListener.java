// Generated from Grammar.g4 by ANTLR 4.8

     import java.util.HashMap; 
     import java.lang.Math;
     import java.util.Scanner;
     
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarBlock(GrammarParser.VarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarBlock(GrammarParser.VarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varDecs}.
	 * @param ctx the parse tree
	 */
	void enterVarDecs(GrammarParser.VarDecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varDecs}.
	 * @param ctx the parse tree
	 */
	void exitVarDecs(GrammarParser.VarDecsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterInitDec(GrammarParser.InitDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitInitDec(GrammarParser.InitDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterNormDec(GrammarParser.NormDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normDec}
	 * labeled alternative in {@link GrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitNormDec(GrammarParser.NormDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(GrammarParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(GrammarParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#readLn}.
	 * @param ctx the parse tree
	 */
	void enterReadLn(GrammarParser.ReadLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#readLn}.
	 * @param ctx the parse tree
	 */
	void exitReadLn(GrammarParser.ReadLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#writeLn}.
	 * @param ctx the parse tree
	 */
	void enterWriteLn(GrammarParser.WriteLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#writeLn}.
	 * @param ctx the parse tree
	 */
	void exitWriteLn(GrammarParser.WriteLnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(GrammarParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(GrammarParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterStrLine(GrammarParser.StrLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLine}
	 * labeled alternative in {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitStrLine(GrammarParser.StrLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condBlock}.
	 * @param ctx the parse tree
	 */
	void enterCondBlock(GrammarParser.CondBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condBlock}.
	 * @param ctx the parse tree
	 */
	void exitCondBlock(GrammarParser.CondBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stateBlock}.
	 * @param ctx the parse tree
	 */
	void enterStateBlock(GrammarParser.StateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stateBlock}.
	 * @param ctx the parse tree
	 */
	void exitStateBlock(GrammarParser.StateBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(GrammarParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(GrammarParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(GrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(GrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterElementExpr(GrammarParser.ElementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitElementExpr(GrammarParser.ElementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(GrammarParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(GrammarParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equationExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquationExpr(GrammarParser.EquationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equationExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquationExpr(GrammarParser.EquationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(GrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(GrammarParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(GrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(GrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterParElement(GrammarParser.ParElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitParElement(GrammarParser.ParElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterIdElement(GrammarParser.IdElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitIdElement(GrammarParser.IdElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitBoolElement(GrammarParser.BoolElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterRealElement(GrammarParser.RealElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realElement}
	 * labeled alternative in {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitRealElement(GrammarParser.RealElementContext ctx);
}