/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
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
Random	TokenNameIdentifier	 Random
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
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * A set of examples for learning. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A set of examples for learning. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Dataset	TokenNameIdentifier	 Dataset
extends	TokenNameextends	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
/** Get the FeatureFactory associated with the dataset */	TokenNameCOMMENT_JAVADOC	 Get the FeatureFactory associated with the dataset 
public	TokenNamepublic	
FeatureFactory	TokenNameIdentifier	 Feature Factory
getFeatureFactory	TokenNameIdentifier	 get Feature Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the schema associated with the dataset */	TokenNameCOMMENT_JAVADOC	 Get the schema associated with the dataset 
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Add a new example to the dataset. */	TokenNameCOMMENT_JAVADOC	 Add a new example to the dataset. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Add a new example to the dataset. Specifying whether or not to compress it. */	TokenNameCOMMENT_JAVADOC	 Add a new example to the dataset. Specifying whether or not to compress it. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return an iterator over all examples. This iterator must always * return examples in the order in which they were added, unless the * data has been shuffled. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all examples. This iterator must always return examples in the order in which they were added, unless the data has been shuffled. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of examples. */	TokenNameCOMMENT_JAVADOC	 Return the number of examples. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these operations are mostly to support train/testing experiments 	TokenNameCOMMENT_LINE	these operations are mostly to support train/testing experiments 
/** Randomly re-order the examples. */	TokenNameCOMMENT_JAVADOC	 Randomly re-order the examples. 
public	TokenNamepublic	
void	TokenNamevoid	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Randomly re-order the examples. */	TokenNameCOMMENT_JAVADOC	 Randomly re-order the examples. 
public	TokenNamepublic	
void	TokenNamevoid	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Make a shallow copy of the dataset. Examples are shared, but not the * ordering of the examples. */	TokenNameCOMMENT_JAVADOC	 Make a shallow copy of the dataset. Examples are shared, but not the ordering of the examples. 
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
shallowCopy	TokenNameIdentifier	 shallow Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Partition the dataset as required by the splitter. */	TokenNameCOMMENT_JAVADOC	 Partition the dataset as required by the splitter. 
public	TokenNamepublic	
Split	TokenNameIdentifier	 Split
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A partitioning of the dataset into a number of train/test partitions */	TokenNameCOMMENT_JAVADOC	 A partitioning of the dataset into a number of train/test partitions 
public	TokenNamepublic	
interface	TokenNameinterface	
Split	TokenNameIdentifier	 Split
{	TokenNameLBRACE	
/** Return the number of partitions */	TokenNameCOMMENT_JAVADOC	 Return the number of partitions 
public	TokenNamepublic	
int	TokenNameint	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a dataset containing the training cases in the k-th split */	TokenNameCOMMENT_JAVADOC	 Return a dataset containing the training cases in the k-th split 
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a dataset containing the test cases in the k-th split */	TokenNameCOMMENT_JAVADOC	 Return a dataset containing the test cases in the k-th split 
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
