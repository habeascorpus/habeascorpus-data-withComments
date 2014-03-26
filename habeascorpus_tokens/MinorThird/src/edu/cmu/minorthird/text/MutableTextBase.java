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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * * * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 * @author Quinten Mercer 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
extends	TokenNameextends	
AbstractTextBase	TokenNameIdentifier	 Abstract Text Base
{	TokenNameLBRACE	
public	TokenNamepublic	
MutableTextBase	TokenNameIdentifier	 Mutable Text Base
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
/** Creates a new document for the document contained in documentString and referenced by documentId. <br> * Tokenizes documentString using the Tokenizer set for this TextBase. <br> * New document is stored in the TextBase. */	TokenNameCOMMENT_JAVADOC	 Creates a new document for the document contained in documentString and referenced by documentId. <br> Tokenizes documentString using the Tokenizer set for this TextBase. <br> New document is stored in the TextBase. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Creates a new document for the document contained in documentString and referenced by documentId. <br> * Also, sets the char offset to indicate that this document is a subdocument of another. <br> * Tokenizes documentString using the Tokenizer set for this TextBase. <br> * New document is stored in the TextBase. */	TokenNameCOMMENT_JAVADOC	 Creates a new document for the document contained in documentString and referenced by documentId. <br> Also, sets the char offset to indicate that this document is a subdocument of another. <br> Tokenizes documentString using the Tokenizer set for this TextBase. <br> New document is stored in the TextBase. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** Sets the group that a document belongs to */	TokenNameCOMMENT_JAVADOC	 Sets the group that a document belongs to 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
setDocumentGroupId	TokenNameIdentifier	 set Document Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// TextBase interface methods 	TokenNameCOMMENT_LINE	TextBase interface methods 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
