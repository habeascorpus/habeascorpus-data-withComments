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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Span	TokenNameIdentifier	 Span
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
TextLabels	TokenNameIdentifier	 Text Labels
;	TokenNameSEMICOLON	
/** * Train an AnnotationExample from a previously annotated corpus (stored in a * TextLabels). * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Train an AnnotationExample from a previously annotated corpus (stored in a TextLabels). * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TextLabelsAnnotatorTeacher	TokenNameIdentifier	 Text Labels Annotator Teacher
extends	TokenNameextends	
AnnotatorTeacher	TokenNameIdentifier	 Annotator Teacher
{	TokenNameLBRACE	
private	TokenNameprivate	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userLabelType	TokenNameIdentifier	 user Label Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userLabelProp	TokenNameIdentifier	 user Label Prop
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextLabelsAnnotatorTeacher	TokenNameIdentifier	 Text Labels Annotator Teacher
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
userLabelType	TokenNameIdentifier	 user Label Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
userLabelType	TokenNameIdentifier	 user Label Type
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabelsAnnotatorTeacher	TokenNameIdentifier	 Text Labels Annotator Teacher
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
userLabelType	TokenNameIdentifier	 user Label Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
userLabelProp	TokenNameIdentifier	 user Label Prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userLabelType	TokenNameIdentifier	 user Label Type
=	TokenNameEQUAL	
userLabelType	TokenNameIdentifier	 user Label Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userLabelProp	TokenNameIdentifier	 user Label Prop
=	TokenNameEQUAL	
userLabelProp	TokenNameIdentifier	 user Label Prop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentPool	TokenNameIdentifier	 document Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
AnnotationExample	TokenNameIdentifier	 Annotation Example
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't label a partial document"	TokenNameStringLiteral	can't label a partial document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// should really generate a restricted view of this labels, containing just 	TokenNameCOMMENT_LINE	should really generate a restricted view of this labels, containing just 
// one document... 	TokenNameCOMMENT_LINE	one document... 
AnnotationExample	TokenNameIdentifier	 Annotation Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
new	TokenNamenew	
AnnotationExample	TokenNameIdentifier	 Annotation Example
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
userLabelType	TokenNameIdentifier	 user Label Type
,	TokenNameCOMMA	
userLabelProp	TokenNameIdentifier	 user Label Prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
availableLabels	TokenNameIdentifier	 available Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
