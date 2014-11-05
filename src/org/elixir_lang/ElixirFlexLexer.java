/* The following code was generated by JFlex 1.4.3 on 11/4/14 5:41 PM */

package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.lexer.group.*;
import org.elixir_lang.psi.ElixirTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/4/14 5:41 PM from the specification file
 * <tt>/Users/luke.imhoff/git/KronicDeth/intellij-elixir/src/org/elixir_lang/Elixir.flex</tt>
 */
public class ElixirFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int GROUP_HEREDOC_END = 8;
  public static final int INTERPOLATION = 16;
  public static final int GROUP_HEREDOC_LINE_START = 12;
  public static final int SIGIL_MODIFIERS = 22;
  public static final int SIGIL = 20;
  public static final int GROUP_HEREDOC_START = 14;
  public static final int GROUP = 6;
  public static final int ATOM_START = 4;
  public static final int YYINITIAL = 0;
  public static final int GROUP_HEREDOC_LINE_BODY = 10;
  public static final int NAMED_SIGIL = 18;
  public static final int ATOM_BODY = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\41\1\0\1\45\1\42\22\0\1\45\1\14\1\54"+
    "\1\46\1\0\1\21\1\7\1\53\1\60\1\61\1\33\1\30\1\0"+
    "\1\25\1\24\1\34\1\47\1\51\6\52\2\36\1\31\1\43\1\5"+
    "\1\15\1\6\1\35\1\32\6\40\24\57\1\60\1\26\1\61\1\16"+
    "\1\37\1\0\1\10\1\50\1\56\1\11\1\3\1\56\1\55\1\2"+
    "\5\55\1\4\1\17\2\55\1\27\1\55\1\20\2\55\1\1\1\44"+
    "\2\55\1\22\1\13\1\23\1\12\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\14\0\3\1\2\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\6\2\1\1\10\1\1\1\10\1\11\1\12"+
    "\1\13\1\1\1\14\1\1\1\15\1\16\1\1\2\17"+
    "\1\20\1\21\1\22\1\20\3\23\3\24\1\23\1\1"+
    "\4\24\1\23\1\24\1\1\2\24\1\1\1\24\1\1"+
    "\1\24\1\1\1\25\1\26\1\27\3\26\1\0\1\30"+
    "\1\26\4\31\1\32\1\1\1\33\2\34\1\35\1\36"+
    "\1\37\1\36\3\0\1\40\1\41\1\0\1\2\1\42"+
    "\1\43\2\0\1\41\1\44\1\45\1\46\1\45\1\0"+
    "\1\44\1\47\1\15\1\0\1\50\2\51\10\0\1\24"+
    "\1\0\1\24\2\0\2\24\2\0\1\24\3\52\1\53"+
    "\6\0\1\6\1\43\1\54\1\55\2\51\3\56\1\17"+
    "\1\0\1\52\1\0\1\57\1\0\1\60\1\61\1\62"+
    "\1\51\2\0\1\63\13\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e"+
    "\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa\0\u0258\0\u0258"+
    "\0\u05dc\0\u0258\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708"+
    "\0\u0258\0\u073a\0\u0258\0\u076c\0\u079e\0\u0258\0\u07d0\0\u0802"+
    "\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992"+
    "\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22"+
    "\0\u0258\0\u0b54\0\u0258\0\u0258\0\u0258\0\u0b86\0\u0bb8\0\u0bea"+
    "\0\u0c1c\0\u0258\0\u0c4e\0\u0258\0\u0c80\0\u0cb2\0\u0ce4\0\u0258"+
    "\0\u0d16\0\u0258\0\u0258\0\u0d48\0\u0258\0\u0258\0\u0258\0\u0d7a"+
    "\0\u0dac\0\u0dde\0\u0e10\0\u0258\0\u0e42\0\u0e42\0\u0258\0\u0258"+
    "\0\u0e74\0\u0ea6\0\u0ed8\0\u0258\0\u0f0a\0\u0f3c\0\u0258\0\u0258"+
    "\0\u0f6e\0\u0258\0\u0258\0\u0258\0\u0fa0\0\u0fd2\0\u0258\0\u1004"+
    "\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162\0\u1194"+
    "\0\u11c6\0\u11c6\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\u12f2"+
    "\0\u0a28\0\u1324\0\u0258\0\u1356\0\u1388\0\u0258\0\u13ba\0\u0cb2"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u0258\0\u0258\0\u0258\0\u0258"+
    "\0\u14b4\0\u14e6\0\u1036\0\u1068\0\u109a\0\u0258\0\u1518\0\u154a"+
    "\0\u157c\0\u0258\0\u15ae\0\u0258\0\u0258\0\u0258\0\u15e0\0\u1612"+
    "\0\u1644\0\u0258\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e\0\u1770"+
    "\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u186a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\15\1\16\2\15\1\17\1\20\1\21\1\22\1\23"+
    "\1\15\1\24\1\25\1\26\1\27\1\30\1\31\4\15"+
    "\1\32\1\33\1\34\1\15\1\35\1\36\1\37\2\40"+
    "\1\41\3\15\1\42\1\43\1\42\1\15\1\44\1\45"+
    "\1\46\3\15\1\47\1\50\5\15\1\51\4\52\3\51"+
    "\2\52\2\51\1\53\2\51\2\52\6\51\1\52\2\51"+
    "\1\52\2\51\1\53\3\52\1\51\1\54\1\51\1\52"+
    "\2\51\4\52\2\51\3\52\2\51\1\15\1\55\2\56"+
    "\1\57\1\60\1\61\1\62\1\63\1\56\1\64\1\65"+
    "\1\66\1\67\1\70\1\71\1\56\1\72\1\73\1\15"+
    "\1\74\1\75\1\76\1\56\1\77\1\100\3\101\2\15"+
    "\2\56\1\15\1\102\1\15\1\56\3\15\1\56\2\15"+
    "\2\103\3\56\2\15\6\104\1\105\4\104\1\105\7\104"+
    "\1\105\2\104\1\106\5\104\1\105\5\104\1\107\3\104"+
    "\1\110\4\104\2\105\4\104\1\105\53\0\2\111\5\0"+
    "\26\104\1\106\12\104\1\112\1\113\1\112\2\104\1\110"+
    "\13\104\42\114\1\115\2\114\1\116\5\114\2\117\5\114"+
    "\41\15\1\120\1\121\1\120\17\15\1\16\2\15\1\17"+
    "\1\20\1\21\1\22\1\23\1\15\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\3\15\1\122\1\32\1\33\1\34"+
    "\1\15\1\35\1\36\1\37\2\40\1\41\3\15\1\42"+
    "\1\43\1\42\1\15\1\44\1\45\1\46\3\15\1\47"+
    "\1\50\12\15\1\123\5\15\1\123\6\15\1\123\11\15"+
    "\1\123\4\15\1\0\11\15\2\124\3\15\1\123\2\15"+
    "\4\125\3\15\2\125\5\15\2\125\6\15\1\125\10\15"+
    "\1\125\1\15\1\102\1\15\1\125\3\15\1\125\4\15"+
    "\3\125\2\15\1\126\4\127\3\126\2\127\5\126\2\127"+
    "\6\126\1\127\12\126\1\130\1\126\1\127\3\126\1\127"+
    "\4\126\2\127\3\126\64\0\1\131\76\0\1\132\47\0"+
    "\1\133\1\134\3\0\1\135\1\136\1\0\1\137\7\0"+
    "\1\140\42\0\1\136\6\0\1\137\53\0\1\141\56\0"+
    "\1\142\63\0\1\135\3\0\1\143\55\0\1\144\4\0"+
    "\1\145\63\0\1\146\52\0\1\147\3\0\1\150\2\0"+
    "\1\146\62\0\1\151\72\0\1\152\56\0\1\134\43\0"+
    "\1\153\16\0\1\134\62\0\1\140\12\0\1\154\1\155"+
    "\47\0\1\134\62\0\1\156\30\0\26\157\1\160\12\157"+
    "\1\0\20\157\41\0\1\42\65\0\1\44\14\0\41\45"+
    "\2\0\17\45\17\0\1\161\24\0\1\162\3\0\1\163"+
    "\64\0\1\164\62\0\1\165\6\0\4\52\3\0\2\52"+
    "\5\0\2\52\6\0\1\52\2\0\1\52\3\0\3\52"+
    "\3\0\1\52\2\0\4\52\2\0\3\52\43\0\1\51"+
    "\22\0\1\166\76\0\1\167\47\0\1\170\1\101\3\0"+
    "\1\171\1\172\1\0\1\101\7\0\1\101\42\0\1\172"+
    "\6\0\1\101\53\0\1\173\56\0\1\174\63\0\1\171"+
    "\3\0\1\175\55\0\1\101\4\0\1\176\63\0\1\177"+
    "\52\0\1\101\3\0\1\101\2\0\1\177\62\0\1\200"+
    "\72\0\1\101\54\0\1\201\62\0\1\101\62\0\1\202"+
    "\43\0\1\101\16\0\1\101\62\0\1\101\63\0\1\101"+
    "\62\0\1\101\71\0\1\15\20\0\42\203\1\204\1\203"+
    "\1\205\15\203\41\0\1\104\42\0\1\206\112\0\2\207"+
    "\46\0\1\112\61\0\1\114\65\0\1\210\5\0\2\211"+
    "\60\0\2\212\46\0\1\120\73\0\2\213\46\0\1\126"+
    "\23\0\1\214\76\0\1\215\46\0\1\144\4\0\1\144"+
    "\55\0\1\144\62\0\1\216\63\0\1\216\62\0\1\215"+
    "\62\0\1\152\63\0\1\150\62\0\1\217\104\0\1\154"+
    "\51\0\1\220\30\0\42\157\1\221\1\157\1\222\15\157"+
    "\47\0\1\223\1\0\2\223\12\0\1\224\4\0\2\224"+
    "\24\0\1\224\1\0\1\224\6\0\4\224\3\0\1\224"+
    "\52\0\1\225\1\0\1\225\63\0\1\226\62\0\1\226"+
    "\10\0\1\227\76\0\1\101\46\0\1\101\1\172\3\0"+
    "\1\101\55\0\1\101\62\0\1\101\63\0\1\101\62\0"+
    "\1\101\62\0\1\101\63\0\1\101\62\0\1\101\67\0"+
    "\1\101\76\0\1\203\23\0\1\230\4\0\2\230\10\0"+
    "\1\231\13\0\1\230\1\0\1\230\6\0\4\230\3\0"+
    "\1\230\56\0\2\232\60\0\2\233\60\0\2\234\60\0"+
    "\2\235\11\0\1\236\116\0\1\157\23\0\1\237\4\0"+
    "\2\237\10\0\1\240\13\0\1\237\1\0\1\237\6\0"+
    "\4\237\3\0\1\237\7\0\1\101\60\0\1\203\4\0"+
    "\2\203\24\0\1\203\1\0\1\203\6\0\4\203\3\0"+
    "\1\203\6\0\1\241\4\0\2\241\24\0\1\241\1\0"+
    "\1\241\6\0\4\241\3\0\1\241\56\0\2\242\10\0"+
    "\1\157\4\0\2\157\24\0\1\157\1\0\1\157\6\0"+
    "\4\157\3\0\1\157\6\0\1\243\4\0\2\243\24\0"+
    "\1\243\1\0\1\243\6\0\4\243\3\0\1\243\6\0"+
    "\1\244\4\0\2\244\11\0\1\203\12\0\1\244\1\0"+
    "\1\244\6\0\4\244\3\0\1\244\6\0\1\245\4\0"+
    "\2\245\11\0\1\157\12\0\1\245\1\0\1\245\6\0"+
    "\4\245\3\0\1\245\6\0\1\246\4\0\2\246\11\0"+
    "\1\203\12\0\1\246\1\0\1\246\6\0\4\246\3\0"+
    "\1\246\6\0\1\247\4\0\2\247\11\0\1\157\12\0"+
    "\1\247\1\0\1\247\6\0\4\247\3\0\1\247\6\0"+
    "\1\250\4\0\2\250\11\0\1\203\12\0\1\250\1\0"+
    "\1\250\6\0\4\250\3\0\1\250\6\0\1\251\4\0"+
    "\2\251\11\0\1\157\12\0\1\251\1\0\1\251\6\0"+
    "\4\251\3\0\1\251\6\0\1\252\4\0\2\252\11\0"+
    "\1\203\12\0\1\252\1\0\1\252\6\0\4\252\3\0"+
    "\1\252\6\0\1\253\4\0\2\253\11\0\1\157\12\0"+
    "\1\253\1\0\1\253\6\0\4\253\3\0\1\253\6\0"+
    "\1\254\4\0\2\254\11\0\1\203\12\0\1\254\1\0"+
    "\1\254\6\0\4\254\3\0\1\254\6\0\1\255\4\0"+
    "\2\255\11\0\1\157\12\0\1\255\1\0\1\255\6\0"+
    "\4\255\3\0\1\255\26\0\1\203\61\0\1\157\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6300];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\14\0\1\11\21\1\2\11\1\1\1\11\6\1\1\11"+
    "\1\1\1\11\2\1\1\11\22\1\1\11\1\1\3\11"+
    "\3\1\1\0\1\11\1\1\1\11\3\1\1\11\1\1"+
    "\2\11\1\1\3\11\1\1\3\0\1\11\1\1\1\0"+
    "\2\11\1\1\2\0\1\11\2\1\2\11\1\0\3\11"+
    "\1\0\1\1\1\11\1\1\10\0\1\1\1\0\1\1"+
    "\2\0\2\1\2\0\1\1\1\11\2\1\1\11\6\0"+
    "\4\11\5\1\1\11\1\0\1\1\1\0\1\11\1\0"+
    "\3\11\1\1\2\0\1\11\13\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private org.elixir_lang.lexer.Stack stack = new org.elixir_lang.lexer.Stack();

  private void startQuote(CharSequence quotePromoterCharSequence) {
    String quotePromoter = quotePromoterCharSequence.toString();
    stack.push(quotePromoter, yystate());

    if (Base.isHeredocPromoter(quotePromoter)) {
      yybegin(GROUP_HEREDOC_START);
    } else {
      yybegin(GROUP);
    }
  }

  private IElementType fragmentType() {
    return stack.fragmentType();
  }

  private void handleInState(int nextLexicalState) {
    yypushback(yylength());
    yybegin(nextLexicalState);
  }

  private boolean isTerminator(CharSequence terminator) {
    return stack.terminator().equals(terminator.toString());
  }

  private boolean isInterpolating() {
    return stack.isInterpolating();
  }

  private boolean isInterpolatingSigil(CharSequence sigilName) {
    if (sigilName.length() != 1) {
      throw new IllegalArgumentException("sigil names can only be 1 character long");
    }

    return isInterpolatingSigil(sigilName.charAt(0));
  }

  private boolean isInterpolatingSigil(char sigilName) {
    return (sigilName >= 'a' && sigilName <= 'z');
  }

  private boolean isSigil() {
    return stack.isSigil();
  }

  private void nameSigil(CharSequence sigilName) {
    stack.nameSigil(sigilName.charAt(0));
  }

  private org.elixir_lang.lexer.StackFrame pop() {
    return stack.pop();
  }

  private org.elixir_lang.lexer.group.Quote promotedQuote(CharSequence promoterCharSequence) {
    // CharSequences don't look up correctly, so convert to String, which do.
    String promoter = promoterCharSequence.toString();
    org.elixir_lang.lexer.group.Quote quote = org.elixir_lang.lexer.group.Quote.fetch(promoter);

    return quote;
  }

  private IElementType promoterType() {
    return stack.promoterType();
  }

  private void setPromoter(CharSequence promoter) {
    stack.setPromoter(promoter.toString());
  }

  private IElementType sigilNameType() {
    return stack.sigilNameType();
  }

  // public for testing
  public void pushAndBegin(int lexicalState) {
    stack.push(yystate());
    yybegin(lexicalState);
  }

  private IElementType terminatorType() {
    return stack.terminatorType();
  }


  public ElixirFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ElixirFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 23: 
          { if (isTerminator(yytext())) {
                         if (isSigil()) {
                           yybegin(SIGIL_MODIFIERS);
                           return terminatorType();
                         } else {
                           org.elixir_lang.lexer.StackFrame stackFrame = pop();
                           yybegin(stackFrame.getLastLexicalState());
                           return stackFrame.terminatorType();
                         }
                       } else {
                         return fragmentType();
                       }
          }
        case 52: break;
        case 36: 
          { return ElixirTypes.OR_OPERATOR;
          }
        case 53: break;
        case 51: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(GROUP_HEREDOC_END);
                                                  return TokenType.WHITE_SPACE;
          }
        case 54: break;
        case 38: 
          { return ElixirTypes.ASSOCIATION_OPERATOR;
          }
        case 55: break;
        case 5: 
          { return ElixirTypes.PIPE_OPERATOR;
          }
        case 56: break;
        case 24: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return fragmentType();
          }
        case 57: break;
        case 13: 
          { return TokenType.WHITE_SPACE;
          }
        case 58: break;
        case 40: 
          { return ElixirTypes.TYPE_OPERATOR;
          }
        case 59: break;
        case 6: 
          { return ElixirTypes.UNARY_OPERATOR;
          }
        case 60: break;
        case 42: 
          { if (isInterpolating()) {
                              return ElixirTypes.VALID_ESCAPE_SEQUENCE;
                            } else {
                              return fragmentType();
                            }
          }
        case 61: break;
        case 22: 
          { return fragmentType();
          }
        case 62: break;
        case 10: 
          { return ElixirTypes.AT_OPERATOR;
          }
        case 63: break;
        case 12: 
          { return ElixirTypes.EOL;
          }
        case 64: break;
        case 45: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { pushAndBegin(ATOM_START);
                                         return ElixirTypes.COLON;
          }
        case 65: break;
        case 9: 
          { pushAndBegin(ATOM_START);
                                         return ElixirTypes.COLON;
          }
        case 66: break;
        case 37: 
          { return ElixirTypes.COMPARISON_OPERATOR;
          }
        case 67: break;
        case 20: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 68: break;
        case 33: 
          { return ElixirTypes.ARROW_OPERATOR;
          }
        case 69: break;
        case 25: 
          { handleInState(GROUP_HEREDOC_LINE_BODY);
          }
        case 70: break;
        case 17: 
          { return ElixirTypes.ATOM_FRAGMENT;
          }
        case 71: break;
        case 47: 
          { if (isTerminator(yytext())) {
                                      if (isSigil()) {
                                        yybegin(SIGIL_MODIFIERS);
                                        return terminatorType();
                                      } else {
                                        org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                        yybegin(stackFrame.getLastLexicalState());
                                        return stackFrame.terminatorType();
                                      }
                                   } else {
                                      handleInState(GROUP_HEREDOC_LINE_BODY);
                                   }
          }
        case 72: break;
        case 27: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                yybegin(stackFrame.getLastLexicalState());
                                return ElixirTypes.INTERPOLATION_END;
          }
        case 73: break;
        case 50: 
          { return ElixirTypes.WHEN_OPERATOR;
          }
        case 74: break;
        case 19: 
          { yybegin(ATOM_BODY);
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 75: break;
        case 29: 
          { nameSigil(yytext());
                               yybegin(NAMED_SIGIL);
                               return sigilNameType();
          }
        case 76: break;
        case 11: 
          { return ElixirTypes.MULTIPLICATION_OPERATOR;
          }
        case 77: break;
        case 44: 
          { return ElixirTypes.HAT_OPERATOR;
          }
        case 78: break;
        case 3: 
          { return ElixirTypes.CAPTURE_OPERATOR;
          }
        case 79: break;
        case 39: 
          { return ElixirTypes.STAB_OPERATOR;
          }
        case 80: break;
        case 26: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return ElixirTypes.EOL;
          }
        case 81: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 82: break;
        case 30: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     handleInState(stackFrame.getLastLexicalState());
          }
        case 83: break;
        case 32: 
          { return ElixirTypes.TWO_OPERATOR;
          }
        case 84: break;
        case 46: 
          { return ElixirTypes.NUMBER;
          }
        case 85: break;
        case 35: 
          { return ElixirTypes.AND_OPERATOR;
          }
        case 86: break;
        case 14: 
          { return ElixirTypes.COMMENT;
          }
        case 87: break;
        case 16: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   handleInState(stackFrame.getLastLexicalState());
          }
        case 88: break;
        case 18: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   yybegin(stackFrame.getLastLexicalState());
                   return ElixirTypes.ATOM_FRAGMENT;
          }
        case 89: break;
        case 28: 
          { setPromoter(yytext());
                             yybegin(GROUP);
                             return promoterType();
          }
        case 90: break;
        case 34: 
          { return ElixirTypes.IN_MATCH_OPERATOR;
          }
        case 91: break;
        case 8: 
          { return ElixirTypes.DUAL_OPERATOR;
          }
        case 92: break;
        case 49: 
          { setPromoter(yytext());
                             yybegin(GROUP_HEREDOC_START);
                             return promoterType();
          }
        case 93: break;
        case 43: 
          { if (isInterpolating()) {
                             pushAndBegin(INTERPOLATION);
                             return ElixirTypes.INTERPOLATION_START;
                            } else {
                             return fragmentType();
                            }
          }
        case 94: break;
        case 4: 
          { pushAndBegin(SIGIL);
                                         return ElixirTypes.TILDE;
          }
        case 95: break;
        case 7: 
          { return ElixirTypes.MATCH_OPERATOR;
          }
        case 96: break;
        case 41: 
          { return ElixirTypes.CHAR_TOKEN;
          }
        case 97: break;
        case 31: 
          { return ElixirTypes.SIGIL_MODIFIER;
          }
        case 98: break;
        case 15: 
          { startQuote(yytext());
                                         return promoterType();
          }
        case 99: break;
        case 2: 
          { return ElixirTypes.RELATIONAL_OPERATOR;
          }
        case 100: break;
        case 48: 
          { handleInState(GROUP_HEREDOC_END);
          }
        case 101: break;
        case 21: 
          { /* At the end of the quote, return the state (YYINITIAL or INTERPOLATION) before ATOM_START as
                        anything after the closing quote should be handle by the state prior to ATOM_START.  Without
                        this, EOL and WHITESPACE won't be handled correctly */
                     org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     startQuote(yytext());
                     return promoterType();
          }
        case 102: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
