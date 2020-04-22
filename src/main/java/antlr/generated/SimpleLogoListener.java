// Generated from C:/Users/micha/IdeaProjects/Kompilatory-Logo/src/main/java/antlr/grammar\SimpleLogo.g4 by ANTLR 4.8
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLogoParser}.
 */
public interface SimpleLogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleLogoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleLogoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SimpleLogoParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SimpleLogoParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SimpleLogoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SimpleLogoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInvocation(SimpleLogoParser.ProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInvocation(SimpleLogoParser.ProcedureInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(SimpleLogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(SimpleLogoParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarations(SimpleLogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarations(SimpleLogoParser.ParameterDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SimpleLogoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SimpleLogoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(SimpleLogoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(SimpleLogoParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleLogoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleLogoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(SimpleLogoParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(SimpleLogoParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SimpleLogoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SimpleLogoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SimpleLogoParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SimpleLogoParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#make}.
	 * @param ctx the parse tree
	 */
	void enterMake(SimpleLogoParser.MakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#make}.
	 * @param ctx the parse tree
	 */
	void exitMake(SimpleLogoParser.MakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleLogoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleLogoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void enterQuotedstring(SimpleLogoParser.QuotedstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void exitQuotedstring(SimpleLogoParser.QuotedstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SimpleLogoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SimpleLogoParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SimpleLogoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SimpleLogoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void enterSignExpression(SimpleLogoParser.SignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#signExpression}.
	 * @param ctx the parse tree
	 */
	void exitSignExpression(SimpleLogoParser.SignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleLogoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleLogoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinus(SimpleLogoParser.PlusOrMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinus(SimpleLogoParser.PlusOrMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#mulOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulOrDiv(SimpleLogoParser.MulOrDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#mulOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulOrDiv(SimpleLogoParser.MulOrDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(SimpleLogoParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(SimpleLogoParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void enterFd(SimpleLogoParser.FdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#fd}.
	 * @param ctx the parse tree
	 */
	void exitFd(SimpleLogoParser.FdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void enterBk(SimpleLogoParser.BkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#bk}.
	 * @param ctx the parse tree
	 */
	void exitBk(SimpleLogoParser.BkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterRt(SimpleLogoParser.RtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitRt(SimpleLogoParser.RtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(SimpleLogoParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(SimpleLogoParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void enterCs(SimpleLogoParser.CsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#cs}.
	 * @param ctx the parse tree
	 */
	void exitCs(SimpleLogoParser.CsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void enterPu(SimpleLogoParser.PuContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#pu}.
	 * @param ctx the parse tree
	 */
	void exitPu(SimpleLogoParser.PuContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(SimpleLogoParser.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(SimpleLogoParser.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void enterHt(SimpleLogoParser.HtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#ht}.
	 * @param ctx the parse tree
	 */
	void exitHt(SimpleLogoParser.HtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(SimpleLogoParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(SimpleLogoParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#home}.
	 * @param ctx the parse tree
	 */
	void enterHome(SimpleLogoParser.HomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#home}.
	 * @param ctx the parse tree
	 */
	void exitHome(SimpleLogoParser.HomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(SimpleLogoParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(SimpleLogoParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SimpleLogoParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SimpleLogoParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void enterSetxy(SimpleLogoParser.SetxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#setxy}.
	 * @param ctx the parse tree
	 */
	void exitSetxy(SimpleLogoParser.SetxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(SimpleLogoParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(SimpleLogoParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void enterFore(SimpleLogoParser.ForeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#fore}.
	 * @param ctx the parse tree
	 */
	void exitFore(SimpleLogoParser.ForeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimpleLogoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimpleLogoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SimpleLogoParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLogoParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SimpleLogoParser.CommentContext ctx);
}