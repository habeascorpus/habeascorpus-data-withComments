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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
ExampleSchema	TokenNameIdentifier	 Example Schema
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
InstanceTransform	TokenNameIdentifier	 Instance Transform
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
;	TokenNameSEMICOLON	
/** * Extend a SegmenterLearner by including a dictionary. * * Distance to the closest dictionary entry will be used as an * additional feature. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Extend a SegmenterLearner by including a dictionary. * Distance to the closest dictionary entry will be used as an additional feature. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
DictVersion	TokenNameIdentifier	 Dict Version
implements	TokenNameimplements	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
softDictionary	TokenNameIdentifier	 soft Dictionary
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringDistance	TokenNameIdentifier	 String Distance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DictVersion	TokenNameIdentifier	 Dict Version
(	TokenNameLPAREN	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dictFile	TokenNameIdentifier	 dict File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
.	TokenNameDOT	
DEFAULT_PATTERN	TokenNameIdentifier	 DEFAULT  PATTERN
,	TokenNameCOMMA	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
dictFile	TokenNameIdentifier	 dict File
,	TokenNameCOMMA	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DictVersion	TokenNameIdentifier	 Dict Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dictFile	TokenNameIdentifier	 dict File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
featurePattern	TokenNameIdentifier	 feature Pattern
=	TokenNameEQUAL	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
softDictionary	TokenNameIdentifier	 soft Dictionary
=	TokenNameEQUAL	
new	TokenNamenew	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
softDictionary	TokenNameIdentifier	 soft Dictionary
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
dictFile	TokenNameIdentifier	 dict File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DictVersion	TokenNameIdentifier	 Dict Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
softDictionary	TokenNameIdentifier	 soft Dictionary
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
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
softDictionary	TokenNameIdentifier	 soft Dictionary
=	TokenNameEQUAL	
softDictionary	TokenNameIdentifier	 soft Dictionary
;	TokenNameSEMICOLON	
// set up the array of distances 	TokenNameCOMMENT_LINE	set up the array of distances 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
DistanceLearnerFactory	TokenNameIdentifier	 Distance Learner Factory
.	TokenNameDOT	
buildArray	TokenNameIdentifier	 build Array
(	TokenNameLPAREN	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
StringDistanceLearner	TokenNameIdentifier	 String Distance Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
softDictionary	TokenNameIdentifier	 soft Dictionary
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
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Segmenter	TokenNameIdentifier	 Segmenter
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// in this case, we don't need to learn a transform, we can just construct it... 	TokenNameCOMMENT_LINE	in this case, we don't need to learn a transform, we can just construct it... 
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the constructor requires one dictionary and one set of distances per class 	TokenNameCOMMENT_LINE	the constructor requires one dictionary and one set of distances per class 
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictPerClass	TokenNameIdentifier	 dict Per Class
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
dictPerClass	TokenNameIdentifier	 dict Per Class
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
softDictionary	TokenNameIdentifier	 soft Dictionary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringDistance	TokenNameIdentifier	 String Distance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
distPerClass	TokenNameIdentifier	 dist Per Class
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
distances	TokenNameIdentifier	 distances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
distances	TokenNameIdentifier	 distances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distPerClass	TokenNameIdentifier	 dist Per Class
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InstanceTransform	TokenNameIdentifier	 Instance Transform
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
dictPerClass	TokenNameIdentifier	 dict Per Class
,	TokenNameCOMMA	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
distPerClass	TokenNameIdentifier	 dist Per Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentTransform	TokenNameIdentifier	 Segment Transform
segmentTransform	TokenNameIdentifier	 segment Transform
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTransform	TokenNameIdentifier	 Segment Transform
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now train on the transformed dataset 	TokenNameCOMMENT_LINE	now train on the transformed dataset 
SegmentDataset	TokenNameIdentifier	 Segment Dataset
transformedDataset	TokenNameIdentifier	 transformed Dataset
=	TokenNameEQUAL	
segmentTransform	TokenNameIdentifier	 segment Transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//new ViewerFrame("transformedDataset", new SmartVanillaViewer(transformedDataset)); 	TokenNameCOMMENT_LINE	new ViewerFrame("transformedDataset", new SmartVanillaViewer(transformedDataset)); 
Segmenter	TokenNameIdentifier	 Segmenter
segmenter	TokenNameIdentifier	 segmenter
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
transformedDataset	TokenNameIdentifier	 transformed Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return a transforming version of the learned segmenter 	TokenNameCOMMENT_LINE	return a transforming version of the learned segmenter 
return	TokenNamereturn	
new	TokenNamenew	
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
segmenter	TokenNameIdentifier	 segmenter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
new	TokenNamenew	
DictVersion	TokenNameIdentifier	 Dict Version
(	TokenNameLPAREN	
new	TokenNamenew	
SegmentCRFLearner	TokenNameIdentifier	 Segment CRF Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
