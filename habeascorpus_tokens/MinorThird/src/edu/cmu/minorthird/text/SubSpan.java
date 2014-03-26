package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * A span that is a subset of another span * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 A span that is a subset of another span * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
SubSpan	TokenNameIdentifier	 Sub Span
extends	TokenNameextends	
BasicSpan	TokenNameIdentifier	 Basic Span
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080305L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SubSpan	TokenNameIdentifier	 Sub Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
int	TokenNameint	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
,	TokenNameCOMMA	
int	TokenNameint	
spanLen	TokenNameIdentifier	 span Len
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentGroupId	TokenNameIdentifier	 document Group Id
,	TokenNameCOMMA	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
,	TokenNameCOMMA	
spanLen	TokenNameIdentifier	 span Len
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStartIndex	TokenNameIdentifier	 get Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
