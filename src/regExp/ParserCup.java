
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Apr 12 18:01:37 CEST 2015
//----------------------------------------------------

package regExp;


/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Apr 12 18:01:37 CEST 2015
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\005\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\010\006\006\013\010\015\005\001\002\000" +
    "\012\002\uffff\006\uffff\013\uffff\015\uffff\001\002\000\020" +
    "\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6\014" +
    "\ufff6\001\002\000\010\006\006\013\010\015\005\001\002" +
    "\000\012\002\030\006\006\013\010\015\005\001\002\000" +
    "\010\006\006\013\010\015\005\001\002\000\016\004\014" +
    "\005\013\006\015\007\017\010\016\011\012\001\002\000" +
    "\010\006\006\013\010\015\005\001\002\000\010\006\006" +
    "\013\010\015\005\001\002\000\012\002\ufffe\006\ufffe\013" +
    "\ufffe\015\ufffe\001\002\000\010\006\006\013\010\015\005" +
    "\001\002\000\010\006\006\013\010\015\005\001\002\000" +
    "\010\006\006\013\010\015\005\001\002\000\020\004\ufffb" +
    "\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\014\ufffb\001" +
    "\002\000\020\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa" +
    "\011\ufffa\014\ufffa\001\002\000\020\004\ufffc\005\ufffc\006" +
    "\ufffc\007\017\010\016\011\012\014\ufffc\001\002\000\020" +
    "\004\ufffd\005\ufffd\006\ufffd\007\017\010\016\011\012\014" +
    "\ufffd\001\002\000\020\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\010\ufff9\011\ufff9\014\ufff9\001\002\000\016\005\013\006" +
    "\015\007\017\010\016\011\012\014\026\001\002\000\020" +
    "\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\014" +
    "\ufff7\001\002\000\012\002\001\006\001\013\001\015\001" +
    "\001\002\000\004\002\000\001\002\000\020\004\ufff8\005" +
    "\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8\014\ufff8\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\010\002\006\003\003\004\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\030\001\001" +
    "\000\006\003\026\004\010\001\001\000\004\004\024\001" +
    "\001\000\002\001\001\000\004\004\023\001\001\000\004" +
    "\004\022\001\001\000\002\001\001\000\004\004\021\001" +
    "\001\000\004\004\020\001\001\000\004\004\017\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= NUMBER 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = n; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= LPAREN expr RPAREN 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		 RESULT = e1; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= MINUS expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = -e1.intValue(); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr MOD expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e1 % e2; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr DIVIDE expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e1 / e2; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr TIMES expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e1 * e2; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr MINUS expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e1 - e2; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= expr PLUS expr 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = e1 + e2; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_part ::= expr SEMI 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		 System.out.println( e1 ); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

