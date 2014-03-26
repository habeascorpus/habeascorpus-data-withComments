package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * This class holds a single text 'document'. * It holds the real text, plus all the tokens. * * This is the only direct pointer to the documentText. * @author ksteppe */	TokenNameCOMMENT_JAVADOC	 This class holds a single text 'document'. It holds the real text, plus all the tokens. * This is the only direct pointer to the documentText. @author ksteppe 
public	TokenNamepublic	
class	TokenNameclass	
Document	TokenNameIdentifier	 Document
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
// name of document 	TokenNameCOMMENT_LINE	name of document 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
documentText	TokenNameIdentifier	 document Text
;	TokenNameSEMICOLON	
// string version of text 	TokenNameCOMMENT_LINE	string version of text 
public	TokenNamepublic	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used when the document is a subdocument of another 	TokenNameCOMMENT_LINE	used when the document is a subdocument of another 
private	TokenNameprivate	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
// tokenized version of text 	TokenNameCOMMENT_LINE	tokenized version of text 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentText	TokenNameIdentifier	 document Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
documentText	TokenNameIdentifier	 document Text
=	TokenNameEQUAL	
documentText	TokenNameIdentifier	 document Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentText	TokenNameIdentifier	 document Text
,	TokenNameCOMMA	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
documentText	TokenNameIdentifier	 document Text
=	TokenNameEQUAL	
documentText	TokenNameIdentifier	 document Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
documentText	TokenNameIdentifier	 document Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenArray	TokenNameIdentifier	 token Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
tokenArray	TokenNameIdentifier	 token Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
