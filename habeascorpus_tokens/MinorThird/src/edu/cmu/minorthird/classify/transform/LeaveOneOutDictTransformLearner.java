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
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
DistanceLearnerFactory	TokenNameIdentifier	 Distance Learner Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
api	TokenNameIdentifier	 api
.	TokenNameDOT	
StringDistance	TokenNameIdentifier	 String Distance
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
api	TokenNameIdentifier	 api
.	TokenNameDOT	
StringDistanceLearner	TokenNameIdentifier	 String Distance Learner
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
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
Dataset	TokenNameIdentifier	 Dataset
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
Example	TokenNameIdentifier	 Example
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
ExampleSchema	TokenNameIdentifier	 Example Schema
;	TokenNameSEMICOLON	
/** * Construct a transformation of a dataset that includes "leave one out dictionary". * * <p> The value of some feature for of all training examples will be stored in a soft * dictionary, and distance to the closest dictionary entry will be * used as an additional feature. For more information, see Sarawagi * and Cohen, "Semi-Markov Conditional Random Fields for Information * Extraction", 2004. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Construct a transformation of a dataset that includes "leave one out dictionary". * <p> The value of some feature for of all training examples will be stored in a soft dictionary, and distance to the closest dictionary entry will be used as an additional feature. For more information, see Sarawagi and Cohen, "Semi-Markov Conditional Random Fields for Information Extraction", 2004. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
{	TokenNameLBRACE	
final	TokenNamefinal	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DEFAULT_PATTERN	TokenNameIdentifier	 DEFAULT  PATTERN
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"eq"	TokenNameStringLiteral	eq
,	TokenNameCOMMA	
"lc"	TokenNameStringLiteral	lc
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
buildDictionaryForNegativeClass	TokenNameIdentifier	 build Dictionary For Negative Class
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringDistance	TokenNameIdentifier	 String Distance
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
"SoftTFIDF"	TokenNameStringLiteral	SoftTFIDF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_PATTERN	TokenNameIdentifier	 DEFAULT  PATTERN
,	TokenNameCOMMA	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
"SoftTFIDF"	TokenNameStringLiteral	SoftTFIDF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
featurePattern	TokenNameIdentifier	 feature Pattern
=	TokenNameEQUAL	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
distanceNames	TokenNameIdentifier	 distance Names
=	TokenNameEQUAL	
distanceNames	TokenNameIdentifier	 distance Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trainDistances	TokenNameIdentifier	 train Distances
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
softDict	TokenNameIdentifier	 soft Dict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
new	TokenNamenew	
StringDistance	TokenNameIdentifier	 String Distance
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DistanceLearnerFactory	TokenNameIdentifier	 Distance Learner Factory
.	TokenNameDOT	
buildArray	TokenNameIdentifier	 build Array
(	TokenNameLPAREN	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
StringDistanceLearner	TokenNameIdentifier	 String Distance Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
softDict	TokenNameIdentifier	 soft Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTeacher	TokenNameIdentifier	 get Teacher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringDistanceLearner	TokenNameIdentifier	 String Distance Learner
)	TokenNameRPAREN	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Examine data, build an instance transformer */	TokenNameCOMMENT_JAVADOC	 Examine data, build an instance transformer 
public	TokenNamepublic	
InstanceTransform	TokenNameIdentifier	 Instance Transform
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// build a soft dictionary for each example 	TokenNameCOMMENT_LINE	build a soft dictionary for each example 
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yNeg	TokenNameIdentifier	 y Neg
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
softDict	TokenNameIdentifier	 soft Dict
=	TokenNameEQUAL	
new	TokenNamenew	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
softDict	TokenNameIdentifier	 soft Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
.	TokenNameDOT	
getFeatureValue	TokenNameIdentifier	 get Feature Value
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("adding text '"+text+"' for dict "+ex.getLabel().bestClassName()); 	TokenNameCOMMENT_LINE	System.out.println("adding text '"+text+"' for dict "+ex.getLabel().bestClassName()); 
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buildDictionaryForNegativeClass	TokenNameIdentifier	 build Dictionary For Negative Class
||	TokenNameOR_OR	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
yNeg	TokenNameIdentifier	 y Neg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
softDict	TokenNameIdentifier	 soft Dict
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
trainDistances	TokenNameIdentifier	 train Distances
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
softDict	TokenNameIdentifier	 soft Dict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
softDict	TokenNameIdentifier	 soft Dict
,	TokenNameCOMMA	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
distances	TokenNameIdentifier	 distances
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
