package antlr.impl;

import antlr.generated.SimpleLogoListener;
import antlr.generated.SimpleLogoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.logging.Logger;

public class LogoImpl implements SimpleLogoListener {

    private final static Logger LOGGER = Logger.getLogger(LogoImpl.class.getName());

    @Override
    public void enterProg(SimpleLogoParser.ProgContext ctx) {
        LOGGER.info("ENTER PROG");
    }

    @Override
    public void exitProg(SimpleLogoParser.ProgContext ctx) {
        LOGGER.info("EXIT PROG");
    }

    @Override
    public void enterLine(SimpleLogoParser.LineContext ctx) {
//        LOGGER.info("ENTER LINE");
    }

    @Override
    public void exitLine(SimpleLogoParser.LineContext ctx) {
//        LOGGER.info("EXIT PROG");
    }

    @Override
    public void enterCmd(SimpleLogoParser.CmdContext ctx) {
        LOGGER.info("ENTER CMD");
    }

    @Override
    public void exitCmd(SimpleLogoParser.CmdContext ctx) {
        LOGGER.info("EXIT CMD");
    }

    @Override
    public void enterProcedureInvocation(SimpleLogoParser.ProcedureInvocationContext ctx) {

    }

    @Override
    public void exitProcedureInvocation(SimpleLogoParser.ProcedureInvocationContext ctx) {

    }

    @Override
    public void enterProcedureDeclaration(SimpleLogoParser.ProcedureDeclarationContext ctx) {

    }

    @Override
    public void exitProcedureDeclaration(SimpleLogoParser.ProcedureDeclarationContext ctx) {

    }

    @Override
    public void enterParameterDeclarations(SimpleLogoParser.ParameterDeclarationsContext ctx) {

    }

    @Override
    public void exitParameterDeclarations(SimpleLogoParser.ParameterDeclarationsContext ctx) {

    }

    @Override
    public void enterFunc(SimpleLogoParser.FuncContext ctx) {

    }

    @Override
    public void exitFunc(SimpleLogoParser.FuncContext ctx) {

    }

    @Override
    public void enterRepeat(SimpleLogoParser.RepeatContext ctx) {
        LOGGER.info("ENTER REPEAT");
    }

    @Override
    public void exitRepeat(SimpleLogoParser.RepeatContext ctx) {
        LOGGER.info("EXIT REPEAT");
    }

    @Override
    public void enterBlock(SimpleLogoParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(SimpleLogoParser.BlockContext ctx) {

    }

    @Override
    public void enterIfe(SimpleLogoParser.IfeContext ctx) {

    }

    @Override
    public void exitIfe(SimpleLogoParser.IfeContext ctx) {

    }

    @Override
    public void enterComparison(SimpleLogoParser.ComparisonContext ctx) {

    }

    @Override
    public void exitComparison(SimpleLogoParser.ComparisonContext ctx) {

    }

    @Override
    public void enterComparisonOperator(SimpleLogoParser.ComparisonOperatorContext ctx) {

    }

    @Override
    public void exitComparisonOperator(SimpleLogoParser.ComparisonOperatorContext ctx) {

    }

    @Override
    public void enterMake(SimpleLogoParser.MakeContext ctx) {

    }

    @Override
    public void exitMake(SimpleLogoParser.MakeContext ctx) {

    }

    @Override
    public void enterPrint(SimpleLogoParser.PrintContext ctx) {

    }

    @Override
    public void exitPrint(SimpleLogoParser.PrintContext ctx) {

    }

    @Override
    public void enterQuotedstring(SimpleLogoParser.QuotedstringContext ctx) {

    }

    @Override
    public void exitQuotedstring(SimpleLogoParser.QuotedstringContext ctx) {

    }

    @Override
    public void enterName(SimpleLogoParser.NameContext ctx) {

    }

    @Override
    public void exitName(SimpleLogoParser.NameContext ctx) {

    }

    @Override
    public void enterValue(SimpleLogoParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(SimpleLogoParser.ValueContext ctx) {

    }

    @Override
    public void enterSignExpression(SimpleLogoParser.SignExpressionContext ctx) {

    }

    @Override
    public void exitSignExpression(SimpleLogoParser.SignExpressionContext ctx) {

    }

    @Override
    public void enterMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx) {

    }

    @Override
    public void exitMultiplyingExpression(SimpleLogoParser.MultiplyingExpressionContext ctx) {

    }

    @Override
    public void enterExpression(SimpleLogoParser.ExpressionContext ctx) {
        LOGGER.info("ENTER EXPRESSION");
    }

    @Override
    public void exitExpression(SimpleLogoParser.ExpressionContext ctx) {
        LOGGER.info("EXIT EXPRESSION");
    }

    @Override
    public void enterDeref(SimpleLogoParser.DerefContext ctx) {

    }

    @Override
    public void exitDeref(SimpleLogoParser.DerefContext ctx) {

    }

    @Override
    public void enterFd(SimpleLogoParser.FdContext ctx) {
        LOGGER.info("ENTER FD");
    }

    @Override
    public void exitFd(SimpleLogoParser.FdContext ctx) {
        LOGGER.info("EXIT FD");
    }

    @Override
    public void enterBk(SimpleLogoParser.BkContext ctx) {

    }

    @Override
    public void exitBk(SimpleLogoParser.BkContext ctx) {

    }

    @Override
    public void enterRt(SimpleLogoParser.RtContext ctx) {

    }

    @Override
    public void exitRt(SimpleLogoParser.RtContext ctx) {

    }

    @Override
    public void enterLt(SimpleLogoParser.LtContext ctx) {

    }

    @Override
    public void exitLt(SimpleLogoParser.LtContext ctx) {

    }

    @Override
    public void enterCs(SimpleLogoParser.CsContext ctx) {

    }

    @Override
    public void exitCs(SimpleLogoParser.CsContext ctx) {

    }

    @Override
    public void enterPu(SimpleLogoParser.PuContext ctx) {

    }

    @Override
    public void exitPu(SimpleLogoParser.PuContext ctx) {

    }

    @Override
    public void enterPd(SimpleLogoParser.PdContext ctx) {

    }

    @Override
    public void exitPd(SimpleLogoParser.PdContext ctx) {

    }

    @Override
    public void enterHt(SimpleLogoParser.HtContext ctx) {

    }

    @Override
    public void exitHt(SimpleLogoParser.HtContext ctx) {

    }

    @Override
    public void enterSt(SimpleLogoParser.StContext ctx) {

    }

    @Override
    public void exitSt(SimpleLogoParser.StContext ctx) {

    }

    @Override
    public void enterHome(SimpleLogoParser.HomeContext ctx) {

    }

    @Override
    public void exitHome(SimpleLogoParser.HomeContext ctx) {

    }

    @Override
    public void enterStop(SimpleLogoParser.StopContext ctx) {

    }

    @Override
    public void exitStop(SimpleLogoParser.StopContext ctx) {

    }

    @Override
    public void enterLabel(SimpleLogoParser.LabelContext ctx) {

    }

    @Override
    public void exitLabel(SimpleLogoParser.LabelContext ctx) {

    }

    @Override
    public void enterSetxy(SimpleLogoParser.SetxyContext ctx) {

    }

    @Override
    public void exitSetxy(SimpleLogoParser.SetxyContext ctx) {

    }

    @Override
    public void enterRandom(SimpleLogoParser.RandomContext ctx) {

    }

    @Override
    public void exitRandom(SimpleLogoParser.RandomContext ctx) {

    }

    @Override
    public void enterFore(SimpleLogoParser.ForeContext ctx) {

    }

    @Override
    public void exitFore(SimpleLogoParser.ForeContext ctx) {

    }

    @Override
    public void enterNumber(SimpleLogoParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(SimpleLogoParser.NumberContext ctx) {

    }

    @Override
    public void enterComment(SimpleLogoParser.CommentContext ctx) {

    }

    @Override
    public void exitComment(SimpleLogoParser.CommentContext ctx) {

    }

    @Override
    public void enterL_bucket(SimpleLogoParser.L_bucketContext ctx) {

    }

    @Override
    public void exitL_bucket(SimpleLogoParser.L_bucketContext ctx) {

    }

    @Override
    public void enterR_bucket(SimpleLogoParser.R_bucketContext ctx) {

    }

    @Override
    public void exitR_bucket(SimpleLogoParser.R_bucketContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
