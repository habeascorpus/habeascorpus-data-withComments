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
/** * A single instance for a learner. * This is basically a weighted set of features. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A single instance for a learner. This is basically a weighted set of features. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Instance	TokenNameIdentifier	 Instance
extends	TokenNameextends	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
/** Get the weight assigned to a feature in this instance. */	TokenNameCOMMENT_JAVADOC	 Get the weight assigned to a feature in this instance. 
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over all binary features. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all binary features. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over all numeric features. */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all numeric features. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an iterator over all features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all features 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of all the features */	TokenNameCOMMENT_JAVADOC	 Return the number of all the features 
public	TokenNamepublic	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the underlying object used that this instance describes */	TokenNameCOMMENT_JAVADOC	 Get the underlying object used that this instance describes 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the subpopulation from which this instance was drawn. * A null id is considered to be a unique subpopulation---different * from every other subpopulation, including other nulls. * A subpopulation is a subset of the training data which is * expected to contain additional regularities - for instance, * pages from the same site, or spans from the same document. * Testing routines may use subpopulation's to more correctly * spit datasets into train/test subsets. */	TokenNameCOMMENT_JAVADOC	 Get the subpopulation from which this instance was drawn. A null id is considered to be a unique subpopulation---different from every other subpopulation, including other nulls. A subpopulation is a subset of the training data which is expected to contain additional regularities - for instance, pages from the same site, or spans from the same document. Testing routines may use subpopulation's to more correctly spit datasets into train/test subsets. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
