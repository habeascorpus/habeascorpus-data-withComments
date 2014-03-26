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
multi	TokenNameIdentifier	 multi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
/** * Trains a MultiClassifierLearner using the information in a labeled Dataset. * * @author Cameron Williams * */	TokenNameCOMMENT_JAVADOC	 Trains a MultiClassifierLearner using the information in a labeled Dataset. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
MultiDatasetClassifierTeacher	TokenNameIdentifier	 Multi Dataset Classifier Teacher
extends	TokenNameextends	
MultiClassifierTeacher	TokenNameIdentifier	 Multi Classifier Teacher
{	TokenNameLBRACE	
private	TokenNameprivate	
MultiDataset	TokenNameIdentifier	 Multi Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
activeLearning	TokenNameIdentifier	 active Learning
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiDatasetClassifierTeacher	TokenNameIdentifier	 Multi Dataset Classifier Teacher
(	TokenNameLPAREN	
MultiDataset	TokenNameIdentifier	 Multi Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MultiExampleSchema	TokenNameIdentifier	 Multi Example Schema
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getMultiSchema	TokenNameIdentifier	 get Multi Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
examplePool	TokenNameIdentifier	 example Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeLearning	TokenNameIdentifier	 active Learning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
multiIterator	TokenNameIdentifier	 multi Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
instancePool	TokenNameIdentifier	 instance Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeLearning	TokenNameIdentifier	 active Learning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
toInstanceIterator	TokenNameIdentifier	 to Instance Iterator
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
multiIterator	TokenNameIdentifier	 multi Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
instanceof	TokenNameinstanceof	
MultiDataset	TokenNameIdentifier	 Multi Dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MultiExample	TokenNameIdentifier	 Multi Example
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
MultiExample	TokenNameIdentifier	 Multi Example
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
MultiExample	TokenNameIdentifier	 Multi Example
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
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
activeLearning	TokenNameIdentifier	 active Learning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
