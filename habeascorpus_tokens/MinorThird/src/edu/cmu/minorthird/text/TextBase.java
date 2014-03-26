/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
/** Maintains information about what's in a set of documents. * Specifically, this contains a set of character sequences (TextToken's) * from some sort of set of containing documents - typically found by * tokenization. * * @author William Cohen * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 Maintains information about what's in a set of documents. Specifically, this contains a set of character sequences (TextToken's) from some sort of set of containing documents - typically found by tokenization. * @author William Cohen @author Quinten Mercer 
public	TokenNamepublic	
interface	TokenNameinterface	
TextBase	TokenNameIdentifier	 Text Base
{	TokenNameLBRACE	
/** Returns the {@link edu.cmu.minorthird.text.Tokenizer} used on the documents in this text base. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link edu.cmu.minorthird.text.Tokenizer} used on the documents in this text base. 
Tokenizer	TokenNameIdentifier	 Tokenizer
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the number of documents contained in this TextBase. */	TokenNameCOMMENT_JAVADOC	 Returns the number of documents contained in this TextBase. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the {@link Document} with the given ID */	TokenNameCOMMENT_JAVADOC	 Returns the {@link Document} with the given ID 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns an iterator over the documents in this TextBase. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the documents in this TextBase. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Looks up the document Span for the given documentId. Returns the Span or null if a document with documentId was not found in this TextBase. */	TokenNameCOMMENT_JAVADOC	 Looks up the document Span for the given documentId. Returns the Span or null if a document with documentId was not found in this TextBase. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
