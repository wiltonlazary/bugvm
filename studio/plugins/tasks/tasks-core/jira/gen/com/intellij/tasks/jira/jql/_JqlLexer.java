/* The following code was generated by JFlex 1.4.3 on 5/19/14 12:08 AM */

package com.intellij.tasks.jira.jql;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/19/14 12:08 AM from the specification file
 * <tt>/Users/ignatov/src/ultimate/tools/lexer/../../community/plugins/tasks/tasks-core/jira/src/com/intellij/tasks/jira/jql/JqlLexer.flex</tt>
 */
class _JqlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\10\2\0\1\10\22\0\1\6\1\43\1\12\3\10"+
    "\1\51\1\11\1\47\1\50\2\10\1\53\1\13\1\10\1\0\12\2"+
    "\1\0\1\10\1\44\1\42\1\45\2\10\1\20\1\3\1\14\1\23"+
    "\1\30\1\15\1\40\1\37\1\41\2\0\1\34\1\31\1\21\1\24"+
    "\1\32\1\0\1\25\1\36\1\27\1\7\1\0\1\35\1\0\1\33"+
    "\1\0\1\16\1\4\1\17\1\10\2\0\1\20\1\3\1\14\1\23"+
    "\1\30\1\15\1\40\1\37\1\41\2\0\1\34\1\31\1\22\1\24"+
    "\1\32\1\0\1\26\1\36\1\5\1\7\1\0\1\35\1\0\1\33"+
    "\1\0\1\10\1\52\1\10\1\46\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\1\3\4"+
    "\12\1\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\0\1\1\1\17\1\0\1\20"+
    "\2\0\1\1\2\0\12\1\1\21\1\22\2\1\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\1"+
    "\4\0\3\1\1\33\1\34\1\1\1\35\4\1\1\36"+
    "\1\1\4\0\1\1\1\37\1\1\1\40\1\1\1\41"+
    "\3\1\3\0\1\42\1\1\1\43\1\1\1\44\1\45"+
    "\1\46\2\0\1\1\1\47\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\204\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0134\0\u0344\0\u0370\0\u039c"+
    "\0\u0134\0\u0134\0\u0134\0\u03c8\0\u03f4\0\u0134\0\334\0\u0420"+
    "\0\54\0\u044c\0\54\0\u0160\0\u0478\0\u0134\0\u018c\0\u04a4"+
    "\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604"+
    "\0\u0630\0\u065c\0\54\0\u0688\0\u06b4\0\u06e0\0\54\0\54"+
    "\0\u0134\0\u0134\0\u0134\0\u0134\0\u0134\0\u0134\0\u070c\0\u0738"+
    "\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840\0\54\0\54"+
    "\0\u086c\0\54\0\u0898\0\u08c4\0\u08f0\0\u091c\0\54\0\u0948"+
    "\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\54\0\u0a50\0\54"+
    "\0\u0a7c\0\54\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\u0b84"+
    "\0\u0134\0\u0bb0\0\54\0\u0bdc\0\54\0\54\0\54\0\u0c08"+
    "\0\u0c34\0\u0c60\0\54\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\2"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\2\10\1\16"+
    "\2\17\1\20\1\21\2\2\1\7\1\22\4\2\1\23"+
    "\3\2\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\2\0\22\2\13\0"+
    "\1\3\4\0\1\3\45\0\1\2\1\0\1\4\1\2"+
    "\1\37\1\2\1\0\1\2\3\0\3\2\2\0\22\2"+
    "\12\0\1\2\1\0\2\2\1\37\1\2\1\0\1\2"+
    "\3\0\3\2\2\0\10\2\1\40\2\2\1\41\6\2"+
    "\16\0\3\2\1\42\1\0\2\2\7\0\1\2\3\0"+
    "\1\2\25\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\4\2\1\43\15\2\66\0"+
    "\4\44\1\45\4\44\1\46\42\44\4\47\1\50\5\47"+
    "\1\46\41\47\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\2\2\1\51\2\0\17\2\1\52\2\2"+
    "\12\0\1\2\1\0\2\2\1\37\1\2\1\0\1\2"+
    "\3\0\3\2\2\0\5\2\2\53\13\2\12\0\1\2"+
    "\1\0\2\2\1\37\1\2\1\0\1\2\3\0\2\2"+
    "\1\54\2\0\1\2\2\55\13\2\1\56\3\2\12\0"+
    "\1\2\1\0\2\2\1\37\1\2\1\0\1\57\3\0"+
    "\3\2\2\0\4\2\1\60\15\2\12\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\61\3\0\3\2\2\0"+
    "\10\2\1\62\11\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\2\0\1\2\2\63"+
    "\2\2\2\64\13\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\2\0\11\2\1\65"+
    "\10\2\12\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\1\66\21\2\12\0\1\2"+
    "\1\0\2\2\1\37\1\2\1\0\1\2\3\0\3\2"+
    "\2\0\1\2\2\67\13\2\1\70\3\2\54\0\1\71"+
    "\3\0\1\72\47\0\1\73\53\0\1\74\62\0\1\75"+
    "\54\0\1\76\1\0\1\2\1\0\2\2\1\37\1\2"+
    "\1\0\1\2\3\0\2\2\1\77\2\0\22\2\14\0"+
    "\2\100\10\0\2\100\2\0\1\100\2\0\1\100\4\0"+
    "\1\100\27\0\3\44\1\101\1\0\2\44\7\0\1\44"+
    "\3\0\1\44\31\0\3\47\1\102\1\0\2\47\7\0"+
    "\1\47\3\0\1\47\25\0\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\1\103\1\0\22\2"+
    "\12\0\1\2\1\0\2\2\1\37\1\2\1\0\1\2"+
    "\3\0\3\2\2\0\1\104\21\2\12\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\2\3\0\3\2\2\0"+
    "\4\2\1\105\15\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\106\1\0\1\2\3\0\3\2\2\0\7\2\1\106"+
    "\12\2\12\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\3\2\1\107\16\2\12\0"+
    "\1\2\1\0\2\2\1\37\1\2\1\0\1\2\3\0"+
    "\1\2\1\110\1\2\2\0\22\2\12\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\2\3\0\3\2\2\0"+
    "\14\2\1\111\5\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\112\1\0\1\2\3\0\3\2\2\0\7\2\1\112"+
    "\12\2\12\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\5\2\2\113\13\2\12\0"+
    "\1\2\1\0\2\2\1\37\1\2\1\0\1\2\3\0"+
    "\3\2\2\0\16\2\1\114\3\2\12\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\2\3\0\3\2\2\0"+
    "\3\2\1\115\16\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\2\0\12\2\1\116"+
    "\7\2\12\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\16\2\1\117\3\2\12\0"+
    "\1\2\1\0\2\2\1\37\1\2\1\0\1\2\3\0"+
    "\3\2\2\0\4\2\1\120\15\2\14\0\2\121\10\0"+
    "\2\121\2\0\1\121\2\0\1\121\4\0\1\121\25\0"+
    "\2\122\10\0\2\122\2\0\1\122\2\0\1\122\4\0"+
    "\1\122\25\0\2\123\10\0\2\123\2\0\1\123\2\0"+
    "\1\123\4\0\1\123\25\0\1\124\51\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\2\3\0\3\2\2\0"+
    "\1\2\2\125\17\2\12\0\1\2\1\0\2\2\1\37"+
    "\1\2\1\0\1\2\3\0\3\2\2\0\11\2\1\126"+
    "\10\2\12\0\1\2\1\0\2\2\1\37\1\2\1\0"+
    "\1\2\3\0\3\2\2\0\10\2\1\127\11\2\12\0"+
    "\1\2\1\0\2\2\1\37\1\2\1\0\1\2\3\0"+
    "\3\2\2\0\14\2\1\130\5\2\12\0\1\2\1\0"+
    "\2\2\1\37\1\2\1\0\1\2\3\0\3\2\2\0"+
    "\21\2\1\131\12\0\1\2\1\0\2\2\1\37\1\2"+
    "\1\0\1\2\3\0\1\2\1\132\1\2\2\0\22\2"+
    "\12\0\1\2\1\0\2\2\1\37\1\2\1\0\1\2"+
    "\3\0\3\2\2\0\10\2\1\133\11\2\12\0\1\2"+
    "\1\0\2\2\1\37\1\134\1\0\1\2\3\0\3\2"+
    "\2\0\7\2\1\134\12\2\12\0\1\2\1\0\2\2"+
    "\1\37\1\2\1\0\1\2\3\0\3\2\2\0\5\2"+
    "\2\135\13\2\14\0\2\136\10\0\2\136\2\0\1\136"+
    "\2\0\1\136\4\0\1\136\25\0\2\137\10\0\2\137"+
    "\2\0\1\137\2\0\1\137\4\0\1\137\25\0\2\140"+
    "\10\0\2\140\2\0\1\140\2\0\1\140\4\0\1\140"+
    "\25\0\1\124\14\0\1\141\34\0\1\2\1\0\2\2"+
    "\1\37\1\2\1\0\1\2\3\0\3\2\2\0\20\2"+
    "\1\142\1\2\12\0\1\2\1\0\2\2\1\37\1\2"+
    "\1\0\1\2\3\0\3\2\2\0\5\2\2\143\13\2"+
    "\12\0\1\2\1\0\2\2\1\37\1\2\1\0\1\2"+
    "\3\0\3\2\2\0\1\2\2\144\17\2\12\0\1\2"+
    "\1\0\2\2\1\37\1\2\1\0\1\2\3\0\3\2"+
    "\2\0\5\2\2\145\13\2\12\0\1\2\1\0\2\2"+
    "\1\37\1\2\1\0\1\2\3\0\3\2\2\0\13\2"+
    "\1\146\6\2\12\0\1\2\1\0\2\2\1\37\1\2"+
    "\1\0\1\2\3\0\3\2\2\0\10\2\1\147\11\2"+
    "\14\0\2\2\10\0\2\2\2\0\1\2\2\0\1\2"+
    "\4\0\1\2\25\0\2\150\10\0\2\150\2\0\1\150"+
    "\2\0\1\150\4\0\1\150\25\0\2\151\10\0\2\151"+
    "\2\0\1\151\2\0\1\151\4\0\1\151\23\0\1\2"+
    "\1\0\2\2\1\37\1\2\1\0\1\2\3\0\3\2"+
    "\2\0\10\2\1\152\11\2\12\0\1\2\1\0\2\2"+
    "\1\37\1\2\1\0\1\2\3\0\3\2\2\0\20\2"+
    "\1\153\1\2\14\0\2\44\10\0\2\44\2\0\1\44"+
    "\2\0\1\44\4\0\1\44\25\0\2\47\10\0\2\47"+
    "\2\0\1\47\2\0\1\47\4\0\1\47\23\0\1\2"+
    "\1\0\2\2\1\37\1\2\1\0\1\2\3\0\3\2"+
    "\2\0\3\2\1\154\16\2\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3212];
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
    "\1\0\6\1\1\11\14\1\1\11\3\1\3\11\2\1"+
    "\1\11\1\0\2\1\1\0\1\1\2\0\1\11\2\0"+
    "\20\1\6\11\1\1\4\0\15\1\4\0\11\1\3\0"+
    "\1\11\6\1\2\0\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
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


  _JqlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _JqlLexer(java.io.InputStream in) {
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
    while (i < 172) {
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
        case 3: 
          { return JqlTokenTypes.NUMBER_LITERAL;
          }
        case 41: break;
        case 13: 
          { return JqlTokenTypes.PIPE;
          }
        case 42: break;
        case 38: 
          { return JqlTokenTypes.BEFORE_KEYWORD;
          }
        case 43: break;
        case 28: 
          { return JqlTokenTypes.ASC_KEYWORD;
          }
        case 44: break;
        case 27: 
          { return JqlTokenTypes.AND_KEYWORD;
          }
        case 45: break;
        case 19: 
          { return JqlTokenTypes.IN_KEYWORD;
          }
        case 46: break;
        case 20: 
          { return JqlTokenTypes.IS_KEYWORD;
          }
        case 47: break;
        case 16: 
          { return JqlTokenTypes.TO_KEYWORD;
          }
        case 48: break;
        case 14: 
          { return JqlTokenTypes.COMMA;
          }
        case 49: break;
        case 6: 
          { return JqlTokenTypes.BANG;
          }
        case 50: break;
        case 32: 
          { return JqlTokenTypes.NULL_KEYWORD;
          }
        case 51: break;
        case 1: 
          { return JqlTokenTypes.STRING_LITERAL;
          }
        case 52: break;
        case 36: 
          { return JqlTokenTypes.ORDER_KEYWORD;
          }
        case 53: break;
        case 35: 
          { return JqlTokenTypes.AFTER_KEYWORD;
          }
        case 54: break;
        case 34: 
          { return JqlTokenTypes.CUSTOM_FIELD;
          }
        case 55: break;
        case 15: 
          { return JqlTokenTypes.BY_KEYWORD;
          }
        case 56: break;
        case 24: 
          { return JqlTokenTypes.GE;
          }
        case 57: break;
        case 30: 
          { return JqlTokenTypes.WAS_KEYWORD;
          }
        case 58: break;
        case 22: 
          { return JqlTokenTypes.NOT_CONTAINS;
          }
        case 59: break;
        case 8: 
          { return JqlTokenTypes.GT;
          }
        case 60: break;
        case 10: 
          { return JqlTokenTypes.LPAR;
          }
        case 61: break;
        case 9: 
          { return JqlTokenTypes.CONTAINS;
          }
        case 62: break;
        case 21: 
          { return JqlTokenTypes.NE;
          }
        case 63: break;
        case 31: 
          { return JqlTokenTypes.FROM_KEYWORD;
          }
        case 64: break;
        case 18: 
          { return JqlTokenTypes.OR_KEYWORD;
          }
        case 65: break;
        case 4: 
          { return JqlTokenTypes.BAD_CHARACTER;
          }
        case 66: break;
        case 26: 
          { return JqlTokenTypes.PIPE_PIPE;
          }
        case 67: break;
        case 5: 
          { return JqlTokenTypes.EQ;
          }
        case 68: break;
        case 17: 
          { return JqlTokenTypes.ON_KEYWORD;
          }
        case 69: break;
        case 40: 
          { return JqlTokenTypes.CHANGED_KEYWORD;
          }
        case 70: break;
        case 2: 
          { return JqlTokenTypes.WHITE_SPACE;
          }
        case 71: break;
        case 23: 
          { return JqlTokenTypes.LE;
          }
        case 72: break;
        case 39: 
          { return JqlTokenTypes.DURING_KEYWORD;
          }
        case 73: break;
        case 12: 
          { return JqlTokenTypes.AMP;
          }
        case 74: break;
        case 33: 
          { return JqlTokenTypes.DESC_KEYWORD;
          }
        case 75: break;
        case 29: 
          { return JqlTokenTypes.NOT_KEYWORD;
          }
        case 76: break;
        case 11: 
          { return JqlTokenTypes.RPAR;
          }
        case 77: break;
        case 7: 
          { return JqlTokenTypes.LT;
          }
        case 78: break;
        case 37: 
          { return JqlTokenTypes.EMPTY_KEYWORD;
          }
        case 79: break;
        case 25: 
          { return JqlTokenTypes.AMP_AMP;
          }
        case 80: break;
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
