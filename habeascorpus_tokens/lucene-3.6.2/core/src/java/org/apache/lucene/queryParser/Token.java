/* Generated By:JavaCC: Do not edit this line. Token.java Version 5.0 */	TokenNameCOMMENT_BLOCK	 Generated By:JavaCC: Do not edit this line. Token.java Version 5.0 
/* JavaCCOptions:TOKEN_EXTENDS=,KEEP_LINE_COL=null,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */	TokenNameCOMMENT_BLOCK	 JavaCCOptions:TOKEN_EXTENDS=,KEEP_LINE_COL=null,SUPPORT_CLASS_VISIBILITY_PUBLIC=true 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
;	TokenNameSEMICOLON	
/** * Describes the input token stream. */	TokenNameCOMMENT_JAVADOC	 Describes the input token stream. 
public	TokenNamepublic	
class	TokenNameclass	
Token	TokenNameIdentifier	 Token
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
/** * An integer that describes the kind of this token. This numbering * system is determined by JavaCCParser, and a table of these numbers is * stored in the file ...Constants.java. */	TokenNameCOMMENT_JAVADOC	 An integer that describes the kind of this token. This numbering system is determined by JavaCCParser, and a table of these numbers is stored in the file ...Constants.java. 
public	TokenNamepublic	
int	TokenNameint	
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
/** The line number of the first character of this Token. */	TokenNameCOMMENT_JAVADOC	 The line number of the first character of this Token. 
public	TokenNamepublic	
int	TokenNameint	
beginLine	TokenNameIdentifier	 begin Line
;	TokenNameSEMICOLON	
/** The column number of the first character of this Token. */	TokenNameCOMMENT_JAVADOC	 The column number of the first character of this Token. 
public	TokenNamepublic	
int	TokenNameint	
beginColumn	TokenNameIdentifier	 begin Column
;	TokenNameSEMICOLON	
/** The line number of the last character of this Token. */	TokenNameCOMMENT_JAVADOC	 The line number of the last character of this Token. 
public	TokenNamepublic	
int	TokenNameint	
endLine	TokenNameIdentifier	 end Line
;	TokenNameSEMICOLON	
/** The column number of the last character of this Token. */	TokenNameCOMMENT_JAVADOC	 The column number of the last character of this Token. 
public	TokenNamepublic	
int	TokenNameint	
endColumn	TokenNameIdentifier	 end Column
;	TokenNameSEMICOLON	
/** * The string image of the token. */	TokenNameCOMMENT_JAVADOC	 The string image of the token. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
/** * A reference to the next regular (non-special) token from the input * stream. If this is the last token from the input stream, or if the * token manager has not read tokens beyond this one, this field is * set to null. This is true only if this token is also a regular * token. Otherwise, see below for a description of the contents of * this field. */	TokenNameCOMMENT_JAVADOC	 A reference to the next regular (non-special) token from the input stream. If this is the last token from the input stream, or if the token manager has not read tokens beyond this one, this field is set to null. This is true only if this token is also a regular token. Otherwise, see below for a description of the contents of this field. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * This field is used to access special tokens that occur prior to this * token, but after the immediately preceding regular (non-special) token. * If there are no such special tokens, this field is set to null. * When there are more than one such special token, this field refers * to the last of these special tokens, which in turn refers to the next * previous special token through its specialToken field, and so on * until the first special token (whose specialToken field is null). * The next fields of special tokens refer to other special tokens that * immediately follow it (without an intervening regular token). If there * is no such token, this field is null. */	TokenNameCOMMENT_JAVADOC	 This field is used to access special tokens that occur prior to this token, but after the immediately preceding regular (non-special) token. If there are no such special tokens, this field is set to null. When there are more than one such special token, this field refers to the last of these special tokens, which in turn refers to the next previous special token through its specialToken field, and so on until the first special token (whose specialToken field is null). The next fields of special tokens refer to other special tokens that immediately follow it (without an intervening regular token). If there is no such token, this field is null. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
specialToken	TokenNameIdentifier	 special Token
;	TokenNameSEMICOLON	
/** * An optional attribute value of the Token. * Tokens which are not used as syntactic sugar will often contain * meaningful values that will be used later on by the compiler or * interpreter. This attribute value is often different from the image. * Any subclass of Token that actually wants to return a non-null value can * override this method as appropriate. */	TokenNameCOMMENT_JAVADOC	 An optional attribute value of the Token. Tokens which are not used as syntactic sugar will often contain meaningful values that will be used later on by the compiler or interpreter. This attribute value is often different from the image. Any subclass of Token that actually wants to return a non-null value can override this method as appropriate. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No-argument constructor */	TokenNameCOMMENT_JAVADOC	 No-argument constructor 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new token for the specified Image. */	TokenNameCOMMENT_JAVADOC	 Constructs a new token for the specified Image. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
int	TokenNameint	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new token for the specified Image and Kind. */	TokenNameCOMMENT_JAVADOC	 Constructs a new token for the specified Image and Kind. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
int	TokenNameint	
kind	TokenNameIdentifier	 kind
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the image. */	TokenNameCOMMENT_JAVADOC	 Returns the image. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new Token object, by default. However, if you want, you * can create and return subclass objects based on the value of ofKind. * Simply add the cases to the switch for all those special cases. * For example, if you have a subclass of Token called IDToken that * you want to create if ofKind is ID, simply add something like : * * case MyParserConstants.ID : return new IDToken(ofKind, image); * * to the following switch statement. Then you can cast matchedToken * variable to the appropriate type and use sit in your lexical actions. */	TokenNameCOMMENT_JAVADOC	 Returns a new Token object, by default. However, if you want, you can create and return subclass objects based on the value of ofKind. Simply add the cases to the switch for all those special cases. For example, if you have a subclass of Token called IDToken that you want to create if ofKind is ID, simply add something like : * case MyParserConstants.ID : return new IDToken(ofKind, image); * to the following switch statement. Then you can cast matchedToken variable to the appropriate type and use sit in your lexical actions. 
public	TokenNamepublic	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
int	TokenNameint	
ofKind	TokenNameIdentifier	 of Kind
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ofKind	TokenNameIdentifier	 of Kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
ofKind	TokenNameIdentifier	 of Kind
,	TokenNameCOMMA	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
int	TokenNameint	
ofKind	TokenNameIdentifier	 of Kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newToken	TokenNameIdentifier	 new Token
(	TokenNameLPAREN	
ofKind	TokenNameIdentifier	 of Kind
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* JavaCC - OriginalChecksum=da95d0ec7daad286fab4e748b17294d8 (do not edit this line) */	TokenNameCOMMENT_BLOCK	 JavaCC - OriginalChecksum=da95d0ec7daad286fab4e748b17294d8 (do not edit this line) 
