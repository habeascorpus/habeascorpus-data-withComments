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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** Maintains assertions about 'types' and 'properties' of contiguous * Spans of these Seq's. Assertions can never be deleted from a * MonotonicTextLabels, but they can be added. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Maintains assertions about 'types' and 'properties' of contiguous Spans of these Seq's. Assertions can never be deleted from a MonotonicTextLabels, but they can be added. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
extends	TokenNameextends	
TextLabels	TokenNameIdentifier	 Text Labels
{	TokenNameLBRACE	
/** Associate a dictionary with this labeling. */	TokenNameCOMMENT_JAVADOC	 Associate a dictionary with this labeling. 
public	TokenNamepublic	
void	TokenNamevoid	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Associate a dictionary from this file */	TokenNameCOMMENT_JAVADOC	 Associate a dictionary from this file 
public	TokenNamepublic	
void	TokenNamevoid	
defineDictionary	TokenNameIdentifier	 define Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictName	TokenNameIdentifier	 dict Name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fileNames	TokenNameIdentifier	 file Names
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a trie if defined */	TokenNameCOMMENT_JAVADOC	 Return a trie if defined 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
getTrie	TokenNameIdentifier	 get Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Define a trie */	TokenNameCOMMENT_JAVADOC	 Define a trie 
public	TokenNamepublic	
void	TokenNamevoid	
defineTrie	TokenNameIdentifier	 define Trie
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phraseList	TokenNameIdentifier	 phrase List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that TextToken textToken has the given value of the given property. */	TokenNameCOMMENT_JAVADOC	 Assert that TextToken textToken has the given value of the given property. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that a token has a given property value, and associate that * with some detailed information. * If details==null, this should have the same effect as setProperty(span,prop,value). */	TokenNameCOMMENT_JAVADOC	 Assert that a token has a given property value, and associate that with some detailed information. If details==null, this should have the same effect as setProperty(span,prop,value). 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that Span span has the given value of the given property */	TokenNameCOMMENT_JAVADOC	 Assert that Span span has the given value of the given property 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that Span span has the given value of the given property, * and associate that with some detailed information */	TokenNameCOMMENT_JAVADOC	 Assert that Span span has the given value of the given property, and associate that with some detailed information 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that a span has a given type. */	TokenNameCOMMENT_JAVADOC	 Assert that a span has a given type. 
public	TokenNamepublic	
void	TokenNamevoid	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Assert that a span has a given type, and associate that * assertion with some detailed information. * If details==null, this should have the same effect as addToType(span,type). */	TokenNameCOMMENT_JAVADOC	 Assert that a span has a given type, and associate that assertion with some detailed information. If details==null, this should have the same effect as addToType(span,type). 
public	TokenNamepublic	
void	TokenNamevoid	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Details	TokenNameIdentifier	 Details
details	TokenNameIdentifier	 details
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Declare a new type, without asserting any spans as members. */	TokenNameCOMMENT_JAVADOC	 Declare a new type, without asserting any spans as members. 
public	TokenNamepublic	
void	TokenNamevoid	
declareType	TokenNameIdentifier	 declare Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Record that this TextLabels was annotated with some type of annotation. */	TokenNameCOMMENT_JAVADOC	 Record that this TextLabels was annotated with some type of annotation. 
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotatedBy	TokenNameIdentifier	 set Annotated By
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Specify the AnnotatorLoader used to find Annotations when a 'require' * call is made. */	TokenNameCOMMENT_JAVADOC	 Specify the AnnotatorLoader used to find Annotations when a 'require' call is made. 
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotatorLoader	TokenNameIdentifier	 set Annotator Loader
(	TokenNameLPAREN	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the current AnnotatorLoader. */	TokenNameCOMMENT_JAVADOC	 Get the current AnnotatorLoader. 
public	TokenNamepublic	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
getAnnotatorLoader	TokenNameIdentifier	 get Annotator Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
