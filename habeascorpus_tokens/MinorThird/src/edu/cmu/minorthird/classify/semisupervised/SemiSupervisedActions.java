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
semisupervised	TokenNameIdentifier	 semisupervised
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
/** * A set of semisupervised examples available for semi-supervised learning. * * @author Edoardo Airoldi * Date: Mar 15, 2004 */	TokenNameCOMMENT_JAVADOC	 A set of semisupervised examples available for semi-supervised learning. * @author Edoardo Airoldi Date: Mar 15, 2004 
public	TokenNamepublic	
interface	TokenNameinterface	
SemiSupervisedActions	TokenNameIdentifier	 Semi Supervised Actions
{	TokenNameLBRACE	
/** Add a new semisupervised example to the dataset. */	TokenNameCOMMENT_JAVADOC	 Add a new semisupervised example to the dataset. 
public	TokenNamepublic	
void	TokenNamevoid	
addUnlabeled	TokenNameIdentifier	 add Unlabeled
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over all the semisupervised examples. This iterator * must always return examples in the order in which they were added, * unless the data has been shuffled. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all the semisupervised examples. This iterator must always return examples in the order in which they were added, unless the data has been shuffled. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of semisupervised examples. */	TokenNameCOMMENT_JAVADOC	 Return the number of semisupervised examples. 
public	TokenNamepublic	
int	TokenNameint	
sizeUnlabeled	TokenNameIdentifier	 size Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return whether the Dataset contains semisupervised examples available * for semi-supervisedd learning. */	TokenNameCOMMENT_JAVADOC	 Return whether the Dataset contains semisupervised examples available for semi-supervisedd learning. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasUnlabeled	TokenNameIdentifier	 has Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
