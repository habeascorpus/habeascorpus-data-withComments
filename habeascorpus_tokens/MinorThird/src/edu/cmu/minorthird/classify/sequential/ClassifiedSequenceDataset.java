/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A SequenceDataset that has been classified with a * SequenceClassifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A SequenceDataset that has been classified with a SequenceClassifier. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
// private SequenceClassifier sequenceClassifier; 	TokenNameCOMMENT_LINE	private SequenceClassifier sequenceClassifier; 
private	TokenNameprivate	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
sequenceDataset	TokenNameIdentifier	 sequence Dataset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Classifier	TokenNameIdentifier	 Classifier
adaptedClassifier	TokenNameIdentifier	 adapted Classifier
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
(	TokenNameLPAREN	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
,	TokenNameCOMMA	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
sequenceDataset	TokenNameIdentifier	 sequence Dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this.sequenceClassifier = sequenceClassifier; 	TokenNameCOMMENT_LINE	this.sequenceClassifier = sequenceClassifier; 
this	TokenNamethis	
.	TokenNameDOT	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
=	TokenNameEQUAL	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
adaptedClassifier	TokenNameIdentifier	 adapted Classifier
=	TokenNameEQUAL	
new	TokenNamenew	
AdaptedSequenceClassifier	TokenNameIdentifier	 Adapted Sequence Classifier
(	TokenNameLPAREN	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
,	TokenNameCOMMA	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
adaptedClassifier	TokenNameIdentifier	 adapted Classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
cdv	TokenNameIdentifier	 cdv
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
(	TokenNameLPAREN	
adaptedClassifier	TokenNameIdentifier	 adapted Classifier
,	TokenNameCOMMA	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
)	TokenNameRPAREN	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
cdv	TokenNameIdentifier	 cdv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
csd	TokenNameIdentifier	 csd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
(	TokenNameLPAREN	
csd	TokenNameIdentifier	 csd
.	TokenNameDOT	
adaptedClassifier	TokenNameIdentifier	 adapted Classifier
,	TokenNameCOMMA	
csd	TokenNameIdentifier	 csd
.	TokenNameDOT	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Classifies examples from the sequenceDataset, by (a) mapping an * example to it position in the containing sequence (b) classifying the * containing sequence - caching it if necessary. */	TokenNameCOMMENT_JAVADOC	 Classifies examples from the sequenceDataset, by (a) mapping an example to it position in the containing sequence (b) classifying the containing sequence - caching it if necessary. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
AdaptedSequenceClassifier	TokenNameIdentifier	 Adapted Sequence Classifier
implements	TokenNameimplements	
Classifier	TokenNameIdentifier	 Classifier
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
private	TokenNameprivate	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
Place	TokenNameIdentifier	 Place
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seq	TokenNameIdentifier	 seq
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Place	TokenNameIdentifier	 Place
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
=	TokenNameEQUAL	
seq	TokenNameIdentifier	 seq
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Place	TokenNameIdentifier	 Place
>	TokenNameGREATER	
instanceToPlace	TokenNameIdentifier	 instance To Place
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Place	TokenNameIdentifier	 Place
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
classifiedSeq	TokenNameIdentifier	 classified Seq
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
explainedSeq	TokenNameIdentifier	 explained Seq
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AdaptedSequenceClassifier	TokenNameIdentifier	 Adapted Sequence Classifier
(	TokenNameLPAREN	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
,	TokenNameCOMMA	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
sequenceDataset	TokenNameIdentifier	 sequence Dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
=	TokenNameEQUAL	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
sequenceDataset	TokenNameIdentifier	 sequence Dataset
.	TokenNameDOT	
sequenceIterator	TokenNameIdentifier	 sequence Iterator
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
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seq	TokenNameIdentifier	 seq
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
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instanceToPlace	TokenNameIdentifier	 instance To Place
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Place	TokenNameIdentifier	 Place
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Place	TokenNameIdentifier	 Place
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
instanceToPlace	TokenNameIdentifier	 instance To Place
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"instance src"	TokenNameStringLiteral	instance src
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not in "	TokenNameStringLiteral	 not in 
+	TokenNamePLUS	
instanceToPlace	TokenNameIdentifier	 instance To Place
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labelSeq	TokenNameIdentifier	 label Seq
=	TokenNameEQUAL	
classifiedSeq	TokenNameIdentifier	 classified Seq
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
labelSeq	TokenNameIdentifier	 label Seq
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifiedSeq	TokenNameIdentifier	 classified Seq
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
(	TokenNameLPAREN	
labelSeq	TokenNameIdentifier	 label Seq
=	TokenNameEQUAL	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
labelSeq	TokenNameIdentifier	 label Seq
[	TokenNameLBRACKET	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Place	TokenNameIdentifier	 Place
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
instanceToPlace	TokenNameIdentifier	 instance To Place
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no explanation available"	TokenNameStringLiteral	no explanation available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
explanation	TokenNameIdentifier	 explanation
=	TokenNameEQUAL	
explainedSeq	TokenNameIdentifier	 explained Seq
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
explanation	TokenNameIdentifier	 explanation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
explainedSeq	TokenNameIdentifier	 explained Seq
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
(	TokenNameLPAREN	
explanation	TokenNameIdentifier	 explanation
=	TokenNameEQUAL	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
explanation	TokenNameIdentifier	 explanation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Place	TokenNameIdentifier	 Place
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
instanceToPlace	TokenNameIdentifier	 instance To Place
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no explanation available"	TokenNameStringLiteral	no explanation available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
sequenceClassifier	TokenNameIdentifier	 sequence Classifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
