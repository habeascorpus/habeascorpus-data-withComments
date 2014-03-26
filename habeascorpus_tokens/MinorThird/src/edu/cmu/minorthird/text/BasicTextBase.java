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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * Maintains information about what's in a set of documents. Specifically, this * contains a set of character sequences (TextToken's) from some sort of set of * containing documents - typically found by tokenization. * * @author William Cohen * @author Cameron Williams * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 Maintains information about what's in a set of documents. Specifically, this contains a set of character sequences (TextToken's) from some sort of set of containing documents - typically found by tokenization. * @author William Cohen @author Cameron Williams @author Quinten Mercer 
public	TokenNamepublic	
class	TokenNameclass	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
extends	TokenNameextends	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
// Minorthird administrative stuff 	TokenNameCOMMENT_LINE	Minorthird administrative stuff 
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080202L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// Underlying document store. 	TokenNameCOMMENT_LINE	Underlying document store. 
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
>	TokenNameGREATER	
documentMap	TokenNameIdentifier	 document Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// map documentId to name of 'group' of documents it belongs to 	TokenNameCOMMENT_LINE	map documentId to name of 'group' of documents it belongs to 
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
documentGroupMap	TokenNameIdentifier	 document Group Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Default constructor creates a new TextBase with the default Tokenizer. */	TokenNameCOMMENT_JAVADOC	 Default constructor creates a new TextBase with the default Tokenizer. 
public	TokenNamepublic	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
RegexTokenizer	TokenNameIdentifier	 Regex Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor that specifies a custom Tokenizer to be used with this * TextBase. */	TokenNameCOMMENT_JAVADOC	 Constructor that specifies a custom Tokenizer to be used with this TextBase. 
public	TokenNamepublic	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Implementations of MutableTextBase abstract methods 	TokenNameCOMMENT_LINE	Implementations of MutableTextBase abstract methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds a document to this TextBase with documentId as its identifier and with * text specified by documentString. */	TokenNameCOMMENT_JAVADOC	 Adds a document to this TextBase with documentId as its identifier and with text specified by documentString. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentString	TokenNameIdentifier	 document String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create the document and add the tokens to that document 	TokenNameCOMMENT_LINE	create the document and add the tokens to that document 
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
documentString	TokenNameIdentifier	 document String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenArray	TokenNameIdentifier	 token Array
=	TokenNameEQUAL	
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
tokenArray	TokenNameIdentifier	 token Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a document to this TextBase with documentId as its identifier and with * text specified by documentString. Also, this method sets the offset * parameter in the new Document to the specified charOffset. */	TokenNameCOMMENT_JAVADOC	 Adds a document to this TextBase with documentId as its identifier and with text specified by documentString. Also, this method sets the offset parameter in the new Document to the specified charOffset. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentString	TokenNameIdentifier	 document String
,	TokenNameCOMMA	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create the document and add the tokens to that document 	TokenNameCOMMENT_LINE	create the document and add the tokens to that document 
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
documentString	TokenNameIdentifier	 document String
,	TokenNameCOMMA	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenArray	TokenNameIdentifier	 token Array
=	TokenNameEQUAL	
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
tokenArray	TokenNameIdentifier	 token Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the document group id for the specified documentId to the specified * document group id. */	TokenNameCOMMENT_JAVADOC	 Sets the document group id for the specified documentId to the specified document group id. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentGroupId	TokenNameIdentifier	 set Document Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
documentGroupMap	TokenNameIdentifier	 document Group Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of documents currently in this TextBase. */	TokenNameCOMMENT_JAVADOC	 Returns the number of documents currently in this TextBase. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Document instance that corresponds to the specified documentId * or null if no document exists with the specified documentId. */	TokenNameCOMMENT_JAVADOC	 Returns the Document instance that corresponds to the specified documentId or null if no document exists with the specified documentId. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Span instance that encloses all of the tokens in the document * specified by documentId. Note that this Span instance will NOT include any * white space that comes before the first token or after the last token. */	TokenNameCOMMENT_JAVADOC	 Returns a Span instance that encloses all of the tokens in the document specified by documentId. Note that this Span instance will NOT include any white space that comes before the first token or after the last token. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textTokens	TokenNameIdentifier	 text Tokens
=	TokenNameEQUAL	
getTokenArray	TokenNameIdentifier	 get Token Array
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textTokens	TokenNameIdentifier	 text Tokens
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
documentGroupMap	TokenNameIdentifier	 document Group Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Span.Looper instance that includes a document span for every * document in this TextBase. */	TokenNameCOMMENT_JAVADOC	 Returns a Span.Looper instance that includes a document span for every document in this TextBase. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyDocumentSpanIterator	TokenNameIdentifier	 My Document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Helper class that is used to iterate through document spans. */	TokenNameCOMMENT_JAVADOC	 Helper class that is used to iterate through document spans. 
private	TokenNameprivate	
class	TokenNameclass	
MyDocumentSpanIterator	TokenNameIdentifier	 My Document Span Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Cannot remove documents from a TextBase."	TokenNameStringLiteral	Cannot remove documents from a TextBase.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textTokens	TokenNameIdentifier	 text Tokens
=	TokenNameEQUAL	
getTokenArray	TokenNameIdentifier	 get Token Array
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
documentGroupMap	TokenNameIdentifier	 document Group Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setCharOffset	TokenNameIdentifier	 set Char Offset
(	TokenNameLPAREN	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int estimatedSize(){ 	TokenNameCOMMENT_LINE	public int estimatedSize(){ 
// return documentMap.keySet().size(); 	TokenNameCOMMENT_LINE	return documentMap.keySet().size(); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method used internally to make getting at the token array for a * specific document id easier. */	TokenNameCOMMENT_JAVADOC	 Helper method used internally to make getting at the token array for a specific document id easier. 
private	TokenNameprivate	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTokenArray	TokenNameIdentifier	 get Token Array
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
documentMap	TokenNameIdentifier	 document Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// basic test routine that loads each argument as a document, then iterates 	TokenNameCOMMENT_LINE	basic test routine that loads each argument as a document, then iterates 
// through them printing them out. 	TokenNameCOMMENT_LINE	through them printing them out. 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"arg_"	TokenNameStringLiteral	arg_
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
