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
	 * Visit a parse tree produced by {@link GrammarParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(GrammarParser.VarAssignContext ctx);
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
}