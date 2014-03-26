/* Generated By:JavaCC: Do not edit this line. TokenMgrError.java Version 5.0 */	TokenNameCOMMENT_BLOCK	 Generated By:JavaCC: Do not edit this line. TokenMgrError.java Version 5.0 
/* JavaCCOptions: */	TokenNameCOMMENT_BLOCK	 JavaCCOptions: 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
;	TokenNameSEMICOLON	
/** Token Manager Error. */	TokenNameCOMMENT_JAVADOC	 Token Manager Error. 
public	TokenNamepublic	
class	TokenNameclass	
TokenMgrError	TokenNameIdentifier	 Token Mgr Error
extends	TokenNameextends	
Error	TokenNameIdentifier	 Error
{	TokenNameLBRACE	
/** * The version identifier for this Serializable class. * Increment only if the <i>serialized</i> form of the * class changes. */	TokenNameCOMMENT_JAVADOC	 The version identifier for this Serializable class. Increment only if the <i>serialized</i> form of the class changes. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/* * Ordinals for various reasons why an Error of this type can be thrown. */	TokenNameCOMMENT_BLOCK	 Ordinals for various reasons why an Error of this type can be thrown. 
/** * Lexical error occurred. */	TokenNameCOMMENT_JAVADOC	 Lexical error occurred. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEXICAL_ERROR	TokenNameIdentifier	 LEXICAL  ERROR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * An attempt was made to create a second instance of a static token manager. */	TokenNameCOMMENT_JAVADOC	 An attempt was made to create a second instance of a static token manager. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATIC_LEXER_ERROR	TokenNameIdentifier	 STATIC  LEXER  ERROR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Tried to change to an invalid lexical state. */	TokenNameCOMMENT_JAVADOC	 Tried to change to an invalid lexical state. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INVALID_LEXICAL_STATE	TokenNameIdentifier	 INVALID  LEXICAL  STATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Detected (and bailed out of) an infinite loop in the token manager. */	TokenNameCOMMENT_JAVADOC	 Detected (and bailed out of) an infinite loop in the token manager. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOOP_DETECTED	TokenNameIdentifier	 LOOP  DETECTED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates the reason why the exception is thrown. It will have * one of the above 4 values. */	TokenNameCOMMENT_JAVADOC	 Indicates the reason why the exception is thrown. It will have one of the above 4 values. 
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
;	TokenNameSEMICOLON	
/** * Replaces unprintable characters by their escaped (or unicode escaped) * equivalents in the given string */	TokenNameCOMMENT_JAVADOC	 Replaces unprintable characters by their escaped (or unicode escaped) equivalents in the given string 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
addEscapes	TokenNameIdentifier	 add Escapes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\b"	TokenNameStringLiteral	\b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\t"	TokenNameStringLiteral	\t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\n"	TokenNameStringLiteral	\n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\f"	TokenNameStringLiteral	\f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\r"	TokenNameStringLiteral	\r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\""	TokenNameStringLiteral	\"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\'"	TokenNameStringLiteral	\'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\\"	TokenNameStringLiteral	\\
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x7e	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"0000"	TokenNameStringLiteral	0000
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\u"	TokenNameStringLiteral	\u
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a detailed message for the Error when it is thrown by the * token manager to indicate a lexical error. * Parameters : * EOFSeen : indicates if EOF caused the lexical error * curLexState : lexical state in which this error occurred * errorLine : line number when the error occurred * errorColumn : column number when the error occurred * errorAfter : prefix that was seen before this error occurred * curchar : the offending character * Note: You can customize the lexical error message by modifying this method. */	TokenNameCOMMENT_JAVADOC	 Returns a detailed message for the Error when it is thrown by the token manager to indicate a lexical error. Parameters : EOFSeen : indicates if EOF caused the lexical error curLexState : lexical state in which this error occurred errorLine : line number when the error occurred errorColumn : column number when the error occurred errorAfter : prefix that was seen before this error occurred curchar : the offending character Note: You can customize the lexical error message by modifying this method. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LexicalError	TokenNameIdentifier	 Lexical Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
EOFSeen	TokenNameIdentifier	 EOF Seen
,	TokenNameCOMMA	
int	TokenNameint	
lexState	TokenNameIdentifier	 lex State
,	TokenNameCOMMA	
int	TokenNameint	
errorLine	TokenNameIdentifier	 error Line
,	TokenNameCOMMA	
int	TokenNameint	
errorColumn	TokenNameIdentifier	 error Column
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
errorAfter	TokenNameIdentifier	 error After
,	TokenNameCOMMA	
char	TokenNamechar	
curChar	TokenNameIdentifier	 cur Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
"Lexical error at line "	TokenNameStringLiteral	Lexical error at line 
+	TokenNamePLUS	
errorLine	TokenNameIdentifier	 error Line
+	TokenNamePLUS	
", column "	TokenNameStringLiteral	, column 
+	TokenNamePLUS	
errorColumn	TokenNameIdentifier	 error Column
+	TokenNamePLUS	
". Encountered: "	TokenNameStringLiteral	. Encountered: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
EOFSeen	TokenNameIdentifier	 EOF Seen
?	TokenNameQUESTION	
"<EOF> "	TokenNameStringLiteral	<EOF> 
:	TokenNameCOLON	
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
addEscapes	TokenNameIdentifier	 add Escapes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
curChar	TokenNameIdentifier	 cur Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
curChar	TokenNameIdentifier	 cur Char
+	TokenNamePLUS	
"), "	TokenNameStringLiteral	), 
)	TokenNameRPAREN	
+	TokenNamePLUS	
"after : ""	TokenNameStringLiteral	after : "
+	TokenNamePLUS	
addEscapes	TokenNameIdentifier	 add Escapes
(	TokenNameLPAREN	
errorAfter	TokenNameIdentifier	 error After
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * You can also modify the body of this method to customize your error messages. * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not * of end-users concern, so you can return something like : * * "Internal Error : Please file a bug report .... " * * from this method for such cases in the release version of your parser. */	TokenNameCOMMENT_JAVADOC	 You can also modify the body of this method to customize your error messages. For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not of end-users concern, so you can return something like : * "Internal Error : Please file a bug report .... " * from this method for such cases in the release version of your parser. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Constructors of various flavors follow. */	TokenNameCOMMENT_BLOCK	 Constructors of various flavors follow. 
/** No arg constructor. */	TokenNameCOMMENT_JAVADOC	 No arg constructor. 
public	TokenNamepublic	
TokenMgrError	TokenNameIdentifier	 Token Mgr Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Constructor with message and reason. */	TokenNameCOMMENT_JAVADOC	 Constructor with message and reason. 
public	TokenNamepublic	
TokenMgrError	TokenNameIdentifier	 Token Mgr Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
reason	TokenNameIdentifier	 reason
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorCode	TokenNameIdentifier	 error Code
=	TokenNameEQUAL	
reason	TokenNameIdentifier	 reason
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Full Constructor. */	TokenNameCOMMENT_JAVADOC	 Full Constructor. 
public	TokenNamepublic	
TokenMgrError	TokenNameIdentifier	 Token Mgr Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
EOFSeen	TokenNameIdentifier	 EOF Seen
,	TokenNameCOMMA	
int	TokenNameint	
lexState	TokenNameIdentifier	 lex State
,	TokenNameCOMMA	
int	TokenNameint	
errorLine	TokenNameIdentifier	 error Line
,	TokenNameCOMMA	
int	TokenNameint	
errorColumn	TokenNameIdentifier	 error Column
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
errorAfter	TokenNameIdentifier	 error After
,	TokenNameCOMMA	
char	TokenNamechar	
curChar	TokenNameIdentifier	 cur Char
,	TokenNameCOMMA	
int	TokenNameint	
reason	TokenNameIdentifier	 reason
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
LexicalError	TokenNameIdentifier	 Lexical Error
(	TokenNameLPAREN	
EOFSeen	TokenNameIdentifier	 EOF Seen
,	TokenNameCOMMA	
lexState	TokenNameIdentifier	 lex State
,	TokenNameCOMMA	
errorLine	TokenNameIdentifier	 error Line
,	TokenNameCOMMA	
errorColumn	TokenNameIdentifier	 error Column
,	TokenNameCOMMA	
errorAfter	TokenNameIdentifier	 error After
,	TokenNameCOMMA	
curChar	TokenNameIdentifier	 cur Char
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reason	TokenNameIdentifier	 reason
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* JavaCC - OriginalChecksum=03df10dce345f1870429faa756473d14 (do not edit this line) */	TokenNameCOMMENT_BLOCK	 JavaCC - OriginalChecksum=03df10dce345f1870429faa756473d14 (do not edit this line) 