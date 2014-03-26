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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
ClassLabel	TokenNameIdentifier	 Class Label
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
/** * A label which is associated with an instance---either by a classifier, * or in training data. * *<p> * MultiClassLabels should be weighted to that the weight for a class name * is (approximately) the log-odds having that class name, ie if * the probability of class "POS" is p, the getWeight("POS") should * return Math.log( p/(1-p) ). * * The POS and NEG class labels (as defined in * ExampleSchema.POS_CLASS_NAME and ExampleSchema.NEG_CLASS_NAME) are * special. Binary class labels should be created with the * positiveLabel(posWeight) and negativeLabel(negWeight) routines, or * else the binaryLabel routine. The numericLabel() returns +1 or -1 * for binary classLabels. The posWeight() method returns the score * of the positive class. * The classLabel.numericLabel() method ignores the underlying score. * For testing binary examples, classLabel.isPositive(), * classLabel.isNegative(), and classLabel.bestWeight() should be * used. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 A label which is associated with an instance---either by a classifier, or in training data. *<p> MultiClassLabels should be weighted to that the weight for a class name is (approximately) the log-odds having that class name, ie if the probability of class "POS" is p, the getWeight("POS") should return Math.log( p/(1-p) ). * The POS and NEG class labels (as defined in ExampleSchema.POS_CLASS_NAME and ExampleSchema.NEG_CLASS_NAME) are special. Binary class labels should be created with the positiveLabel(posWeight) and negativeLabel(negWeight) routines, or else the binaryLabel routine. The numericLabel() returns +1 or -1 for binary classLabels. The posWeight() method returns the score of the positive class. The classLabel.numericLabel() method ignores the underlying score. For testing binary examples, classLabel.isPositive(), classLabel.isNegative(), and classLabel.bestWeight() should be used. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
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
dimensions	TokenNameIdentifier	 dimensions
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the number of dimensions in the multiLabel */	TokenNameCOMMENT_JAVADOC	 Return the number of dimensions in the multiLabel 
public	TokenNamepublic	
int	TokenNameint	
numDimensions	TokenNameIdentifier	 num Dimensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is one of the distinguished binary labels. */	TokenNameCOMMENT_JAVADOC	 See if this is one of the distinguished binary labels. 
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binary	TokenNameIdentifier	 binary
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
binary	TokenNameIdentifier	 binary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is the distinguished positive label. */	TokenNameCOMMENT_JAVADOC	 See if this is the distinguished positive label. 
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positive	TokenNameIdentifier	 positive
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
positive	TokenNameIdentifier	 positive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is the distinguished negative label. */	TokenNameCOMMENT_JAVADOC	 See if this is the distinguished negative label. 
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negative	TokenNameIdentifier	 negative
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
negative	TokenNameIdentifier	 negative
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
negative	TokenNameIdentifier	 negative
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a numeric score of +1, or -1 for a binary example */	TokenNameCOMMENT_JAVADOC	 Return a numeric score of +1, or -1 for a binary example 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
numLabel	TokenNameIdentifier	 num Label
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numLabel	TokenNameIdentifier	 num Label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numLabel	TokenNameIdentifier	 num Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the highest-ranking label. */	TokenNameCOMMENT_JAVADOC	 Returns the highest-ranking label. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestName	TokenNameIdentifier	 best Name
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestName	TokenNameIdentifier	 best Name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bestName	TokenNameIdentifier	 best Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the highest-ranking label. */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the highest-ranking label. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestWeight	TokenNameIdentifier	 best Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestWeight	TokenNameIdentifier	 best Weight
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestWeight	TokenNameIdentifier	 best Weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestWeight	TokenNameIdentifier	 best Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bestWeight	TokenNameIdentifier	 best Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the positive class name */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the positive class name 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posWeight	TokenNameIdentifier	 pos Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posWeight	TokenNameIdentifier	 pos Weight
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posWeight	TokenNameIdentifier	 pos Weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
posWeight	TokenNameIdentifier	 pos Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the probability of the positive class name */	TokenNameCOMMENT_JAVADOC	 Returns the probability of the positive class name 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posProbability	TokenNameIdentifier	 pos Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posProb	TokenNameIdentifier	 pos Prob
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posProb	TokenNameIdentifier	 pos Prob
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getProbability	TokenNameIdentifier	 get Probability
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
posProb	TokenNameIdentifier	 pos Prob
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the label. */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the label. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the probability of a label. */	TokenNameCOMMENT_JAVADOC	 Returns the probability of a label. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getProbability	TokenNameIdentifier	 get Probability
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
odds	TokenNameIdentifier	 odds
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
expOdds	TokenNameIdentifier	 exp Odds
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
odds	TokenNameIdentifier	 odds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
expOdds	TokenNameIdentifier	 exp Odds
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
expOdds	TokenNameIdentifier	 exp Odds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
odds	TokenNameIdentifier	 odds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the set of labels that appear in the ranking. */	TokenNameCOMMENT_JAVADOC	 Returns the set of labels that appear in the ranking. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
possibleLabels	TokenNameIdentifier	 possible Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
sets	TokenNameIdentifier	 sets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
dimensions	TokenNameIdentifier	 dimensions
)	TokenNameRPAREN	
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sets	TokenNameIdentifier	 sets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
possibleLabels	TokenNameIdentifier	 possible Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sets	TokenNameIdentifier	 sets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Is this label correct, relative to another label? */	TokenNameCOMMENT_JAVADOC	 Is this label correct, relative to another label? 
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isMultiCorrect	TokenNameIdentifier	 is Multi Correct
(	TokenNameLPAREN	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
otherLabel	TokenNameIdentifier	 other Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherLabel	TokenNameIdentifier	 other Label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"null otherLabel?"	TokenNameStringLiteral	null otherLabel?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"null bestClassName?"	TokenNameStringLiteral	null bestClassName?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dimensions	TokenNameIdentifier	 dimensions
!=	TokenNameNOT_EQUAL	
otherLabel	TokenNameIdentifier	 other Label
.	TokenNameDOT	
numDimensions	TokenNameIdentifier	 num Dimensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Number of Dimensions do not match"	TokenNameStringLiteral	Number of Dimensions do not match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
dimensions	TokenNameIdentifier	 dimensions
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
correct	TokenNameIdentifier	 correct
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherLabel	TokenNameIdentifier	 other Label
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
correct	TokenNameIdentifier	 correct
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Is this label correct, relative to another label? */	TokenNameCOMMENT_JAVADOC	 Is this label correct, relative to another label? 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
otherLabel	TokenNameIdentifier	 other Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherLabel	TokenNameIdentifier	 other Label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"null otherLabel?"	TokenNameStringLiteral	null otherLabel?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"null bestClassName?"	TokenNameStringLiteral	null bestClassName?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dimensions	TokenNameIdentifier	 dimensions
!=	TokenNameNOT_EQUAL	
otherLabel	TokenNameIdentifier	 other Label
.	TokenNameDOT	
numDimensions	TokenNameIdentifier	 num Dimensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Number of Dimensions do not match"	TokenNameStringLiteral	Number of Dimensions do not match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
true	TokenNametrue	
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
correct	TokenNameIdentifier	 correct
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherLabel	TokenNameIdentifier	 other Label
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
correct	TokenNameIdentifier	 correct
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
String	TokenNameIdentifier	 String
labelString	TokenNameIdentifier	 label String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labelString	TokenNameIdentifier	 label String
=	TokenNameEQUAL	
labelString	TokenNameIdentifier	 label String
+	TokenNamePLUS	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
labelString	TokenNameIdentifier	 label String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toDetails	TokenNameIdentifier	 to Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
dimensions	TokenNameIdentifier	 dimensions
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
details	TokenNameIdentifier	 details
=	TokenNameEQUAL	
details	TokenNameIdentifier	 details
+	TokenNamePLUS	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toDetails	TokenNameIdentifier	 to Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
details	TokenNameIdentifier	 details
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
