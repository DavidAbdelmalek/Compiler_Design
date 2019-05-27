// Generated from milestone_2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link milestone_2Parser}.
 */
public interface milestone_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(milestone_2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(milestone_2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void enterColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void exitColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(milestone_2Parser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(milestone_2Parser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#section_variable}.
	 * @param ctx the parse tree
	 */
	void enterSection_variable(milestone_2Parser.Section_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#section_variable}.
	 * @param ctx the parse tree
	 */
	void exitSection_variable(milestone_2Parser.Section_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(milestone_2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(milestone_2Parser.StmtContext ctx);
}