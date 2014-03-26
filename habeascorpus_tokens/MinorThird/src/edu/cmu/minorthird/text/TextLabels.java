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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Access assertions about 'types' and 'properties' of * contiguous Spans of these Seq's. TextLabels's are immutable. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Access assertions about 'types' and 'properties' of contiguous Spans of these Seq's. TextLabels's are immutable. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
TextLabels	TokenNameIdentifier	 Text Labels
{	TokenNameLBRACE	
/** See if the TextLabels contains a particular type of annotation */	TokenNameCOMMENT_JAVADOC	 See if the TextLabels contains a particular type of annotation 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnnotatedBy	TokenNameIdentifier	 is Annotated By
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Ensure that this TextLabels contains a particular type of * annotation. If the annotation is not present, then either load * it (if possible) or throw an error. */	TokenNameCOMMENT_JAVADOC	 Ensure that this TextLabels contains a particular type of annotation. If the annotation is not present, then either load it (if possible) or throw an error. 
public	TokenNamepublic	
void	TokenNamevoid	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Annotate labels with annotator named fileToLoad */	TokenNameCOMMENT_JAVADOC	 Annotate labels with annotator named fileToLoad 
public	TokenNamepublic	
void	TokenNamevoid	
annotateWith	TokenNameIdentifier	 annotate With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Ensure that this TextLabels contains a particular type of * annotation. If the annotation is not present, then either load * it (if possible) or throw an error. Use the provided * annotatorLoader to find annotators rather than the default * one. */	TokenNameCOMMENT_JAVADOC	 Ensure that this TextLabels contains a particular type of annotation. If the annotation is not present, then either load it (if possible) or throw an error. Use the provided annotatorLoader to find annotators rather than the default one. 
public	TokenNamepublic	
void	TokenNamevoid	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileToLoad	TokenNameIdentifier	 file To Load
,	TokenNameCOMMA	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the TextBase which is annotated by this TextLabels, or null if that * isn't set yet. */	TokenNameCOMMENT_JAVADOC	 Returns the TextBase which is annotated by this TextLabels, or null if that isn't set yet. 
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * * @param dictionary String name of the dictionary * @return true if the dictionary is defined for these labels */	TokenNameCOMMENT_JAVADOC	 * @param dictionary String name of the dictionary @return true if the dictionary is defined for these labels 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDictionary	TokenNameIdentifier	 has Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns true if the value of the Token is in the named dictionary. */	TokenNameCOMMENT_JAVADOC	 Returns true if the value of the Token is in the named dictionary. 
public	TokenNamepublic	
boolean	TokenNameboolean	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dict	TokenNameIdentifier	 dict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the property value associated with this TextToken. */	TokenNameCOMMENT_JAVADOC	 Get the property value associated with this TextToken. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get a set of all properties. */	TokenNameCOMMENT_JAVADOC	 Get a set of all properties. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokenProperties	TokenNameIdentifier	 get Token Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the value of the named property which has been associated with this Span. */	TokenNameCOMMENT_JAVADOC	 Get the value of the named property which has been associated with this Span. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find all spans that have a non-null value for this property. */	TokenNameCOMMENT_JAVADOC	 Find all spans that have a non-null value for this property. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find all spans in the named document that have a non-null value * for this property. */	TokenNameCOMMENT_JAVADOC	 Find all spans in the named document that have a non-null value for this property. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get a set of all previously-defined properties. */	TokenNameCOMMENT_JAVADOC	 Get a set of all previously-defined properties. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSpanProperties	TokenNameIdentifier	 get Span Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Query if a span has a given type. */	TokenNameCOMMENT_JAVADOC	 Query if a span has a given type. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get all instances of a given type. */	TokenNameCOMMENT_JAVADOC	 Get all instances of a given type. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get all instances of a given type. */	TokenNameCOMMENT_JAVADOC	 Get all instances of a given type. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a set of all type names. */	TokenNameCOMMENT_JAVADOC	 Return a set of all type names. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the Set of all Spans with a given type in a given document */	TokenNameCOMMENT_JAVADOC	 Return the Set of all Spans with a given type in a given document 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
getTypeSet	TokenNameIdentifier	 get Type Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True if the given string names a type. */	TokenNameCOMMENT_JAVADOC	 True if the given string names a type. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the spans s for in the given type is 'closed'. If type T * is close inside S, this means that one can apply the 'closed * world assumption' and assume that the known set of spans of type * T is complete, except for areas of the text that are not * contained by any closure span S. */	TokenNameCOMMENT_JAVADOC	 Returns the spans s for in the given type is 'closed'. If type T is close inside S, this means that one can apply the 'closed world assumption' and assume that the known set of spans of type T is complete, except for areas of the text that are not contained by any closure span S. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the spans S inside the given document in which the * given type is 'closed'. */	TokenNameCOMMENT_JAVADOC	 Returns the spans S inside the given document in which the given type is 'closed'. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** For debugging. Returns a dump of all strings that have tokens * with the given property. */	TokenNameCOMMENT_JAVADOC	 For debugging. Returns a dump of all strings that have tokens with the given property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showTokenProp	TokenNameIdentifier	 show Token Prop
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Retrieve additional information associated with an assertion * 'span S has type T'. Returns null if the span doesn't have the * stated type. */	TokenNameCOMMENT_JAVADOC	 Retrieve additional information associated with an assertion 'span S has type T'. Returns null if the span doesn't have the stated type. 
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
