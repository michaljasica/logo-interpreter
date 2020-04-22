// Generated from C:/Users/micha/IdeaProjects/Kompilatory-Logo/src/main/java/antlr/grammar\SimpleLogo.g4 by ANTLR 4.8
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleLogoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SimpleLogoParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SimpleLogoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInvocation(SimpleLogoParser.ProcedureInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(SimpleLogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(SimpleLogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SimpleLogoParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(SimpleLogoParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleLogoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#ife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfe(SimpleLogoParser.IfeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SimpleLogoParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SimpleLogoParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(SimpleLogoParser.MakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpleLogoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#quotedstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedstring(SimpleLogoParser.QuotedstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SimpleLogoParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SimpleLogoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(SimpleLogoParser.SignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLogoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(SimpleLogoParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#mulOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOrDiv(SimpleLogoParser.MulOrDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(SimpleLogoParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(SimpleLogoParser.FdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk(SimpleLogoParser.BkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(SimpleLogoParser.RtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(SimpleLogoParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#cs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs(SimpleLogoParser.CsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(SimpleLogoParser.PuContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(SimpleLogoParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#ht}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt(SimpleLogoParser.HtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(SimpleLogoParser.StContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(SimpleLogoParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(SimpleLogoParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SimpleLogoParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#setxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy(SimpleLogoParser.SetxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(SimpleLogoParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#fore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFore(SimpleLogoParser.ForeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SimpleLogoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLogoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SimpleLogoParser.CommentContext ctx);
}