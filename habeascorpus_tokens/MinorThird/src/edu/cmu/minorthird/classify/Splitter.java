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
/** * Split iterators into train/test partitions. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Split iterators into train/test partitions. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Split the iterator into a number of train/test partitions. */	TokenNameCOMMENT_JAVADOC	 Split the iterator into a number of train/test partitions. 
public	TokenNamepublic	
void	TokenNamevoid	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of partitions produced by the last call to split() */	TokenNameCOMMENT_JAVADOC	 Return the number of partitions produced by the last call to split() 
public	TokenNamepublic	
int	TokenNameint	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over the training cases in the k-th split. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over the training cases in the k-th split. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over the test cases in the k-th split. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over the test cases in the k-th split. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
