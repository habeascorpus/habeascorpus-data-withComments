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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Feature	TokenNameIdentifier	 Feature
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
Instance	TokenNameIdentifier	 Instance
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
MutableInstance	TokenNameIdentifier	 Mutable Instance
;	TokenNameSEMICOLON	
import	TokenNameimport	
gnu	TokenNameIdentifier	 gnu
.	TokenNameDOT	
trove	TokenNameIdentifier	 trove
.	TokenNameDOT	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
;	TokenNameSEMICOLON	
/** * Replaces feature counts by a TFIDF version of counts. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Replaces feature counts by a TFIDF version of counts. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TFIDFTransformLearner	TokenNameIdentifier	 TFIDF Transform Learner
implements	TokenNameimplements	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080201L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
featureFreq	TokenNameIdentifier	 feature Freq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numDocuments	TokenNameIdentifier	 num Documents
;	TokenNameSEMICOLON	
/** The schema's not used here... */	TokenNameCOMMENT_JAVADOC	 The schema's not used here... 
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
InstanceTransform	TokenNameIdentifier	 Instance Transform
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// figure out frequency of each feature 	TokenNameCOMMENT_LINE	figure out frequency of each feature 
numDocuments	TokenNameIdentifier	 num Documents
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureFreq	TokenNameIdentifier	 feature Freq
=	TokenNameEQUAL	
new	TokenNamenew	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
featureFreq	TokenNameIdentifier	 feature Freq
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureFreq	TokenNameIdentifier	 feature Freq
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// build an InstanceTransform that removes low-frequency features 	TokenNameCOMMENT_LINE	build an InstanceTransform that removes low-frequency features 
return	TokenNamereturn	
new	TokenNamenew	
TFIDFWeighter	TokenNameIdentifier	 TFIDF Weighter
(	TokenNameLPAREN	
numDocuments	TokenNameIdentifier	 num Documents
,	TokenNameCOMMA	
featureFreq	TokenNameIdentifier	 feature Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
TFIDFWeighter	TokenNameIdentifier	 TFIDF Weighter
extends	TokenNameextends	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080201L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numDocuments	TokenNameIdentifier	 num Documents
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
featureFreq	TokenNameIdentifier	 feature Freq
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TFIDFWeighter	TokenNameIdentifier	 TFIDF Weighter
(	TokenNameLPAREN	
double	TokenNamedouble	
numDocuments	TokenNameIdentifier	 num Documents
,	TokenNameCOMMA	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
featureFreq	TokenNameIdentifier	 feature Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numDocuments	TokenNameIdentifier	 num Documents
=	TokenNameEQUAL	
numDocuments	TokenNameIdentifier	 num Documents
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
featureFreq	TokenNameIdentifier	 feature Freq
=	TokenNameEQUAL	
featureFreq	TokenNameIdentifier	 feature Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
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
Feature	TokenNameIdentifier	 Feature
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
unnormalized	TokenNameIdentifier	 unnormalized
=	TokenNameEQUAL	
unnormalizedTFIDFWeight	TokenNameIdentifier	 unnormalized TFIDF Weight
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
norm	TokenNameIdentifier	 norm
+=	TokenNamePLUS_EQUAL	
unnormalized	TokenNameIdentifier	 unnormalized
*	TokenNameMULTIPLY	
unnormalized	TokenNameIdentifier	 unnormalized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
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
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
unnormalizedTFIDFWeight	TokenNameIdentifier	 unnormalized TFIDF Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
unnormalizedTFIDFWeight	TokenNameIdentifier	 unnormalized TFIDF Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
featureFreq	TokenNameIdentifier	 feature Freq
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// assume new words are important 	TokenNameCOMMENT_LINE	assume new words are important 
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
numDocuments	TokenNameIdentifier	 num Documents
/	TokenNameDIVIDE	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[TFIDFWeighter]"	TokenNameStringLiteral	[TFIDFWeighter]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
