// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
}