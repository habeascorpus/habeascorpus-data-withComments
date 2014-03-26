package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A scheme for reducing an extraction task to a tagging task. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A scheme for reducing an extraction task to a tagging task. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
{	TokenNameLBRACE	
/** Convert the information in a single annotation example to token * 'tags' (token properties, assigned to every token). */	TokenNameCOMMENT_JAVADOC	 Convert the information in a single annotation example to token 'tags' (token properties, assigned to every token). 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
reduceExtraction2Tagging	TokenNameIdentifier	 reduce Extraction2 Tagging
(	TokenNameLPAREN	
AnnotationExample	TokenNameIdentifier	 Annotation Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the token property used for the tags which encode the * extraction task. */	TokenNameCOMMENT_JAVADOC	 Return the token property used for the tags which encode the extraction task. 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTokenProp	TokenNameIdentifier	 get Token Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get all the tag values that were used. */	TokenNameCOMMENT_JAVADOC	 Get all the tag values that were used. 
abstract	TokenNameabstract	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getNonDefaultTagValues	TokenNameIdentifier	 get Non Default Tag Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the TextLabels holding the tags which encode the * extraction task. */	TokenNameCOMMENT_JAVADOC	 Return the TextLabels holding the tags which encode the extraction task. 
abstract	TokenNameabstract	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
getTaggedLabels	TokenNameIdentifier	 get Tagged Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Alter a TextLabels object with tagged tokens by using them to * solve the extraction problem. */	TokenNameCOMMENT_JAVADOC	 Alter a TextLabels object with tagged tokens by using them to solve the extraction problem. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
extractFromTags	TokenNameIdentifier	 extract From Tags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// convenience methods 	TokenNameCOMMENT_LINE	convenience methods 
// 	TokenNameCOMMENT_LINE	 
/** * Label all tokens as negative, including ones which are inside a * span to be extracted. This is intended to be used before labeling * the positive tokens appropriately. */	TokenNameCOMMENT_JAVADOC	 Label all tokens as negative, including ones which are inside a span to be extracted. This is intended to be used before labeling the positive tokens appropriately. 
protected	TokenNameprotected	
void	TokenNamevoid	
assignDefaultLabels	TokenNameIdentifier	 assign Default Labels
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
taggedLabels	TokenNameIdentifier	 tagged Labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// label every token as negative, since there's no CW information for properties.... 	TokenNameCOMMENT_LINE	label every token as negative, since there's no CW information for properties.... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getTokenProp	TokenNameIdentifier	 get Token Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use the closed world information 	TokenNameCOMMENT_LINE	use the closed world information 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getTokenProp	TokenNameIdentifier	 get Token Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
