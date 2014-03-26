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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * A label which is associated with an instance---either by a classifier, * or in training data. * *<p> * ClassLabels should be weighted to that the weight for a class name * is (approximately) the log-odds having that class name, ie if * the probability of class "POS" is p, the getWeight("POS") should * return Math.log( p/(1-p) ). * * The POS and NEG class labels (as defined in * ExampleSchema.POS_CLASS_NAME and ExampleSchema.NEG_CLASS_NAME) are * special. Binary class labels should be created with the * positiveLabel(posWeight) and negativeLabel(negWeight) routines, or * else the binaryLabel routine. The numericLabel() returns +1 or -1 * for binary classLabels. The posWeight() method returns the score * of the positive class. * The classLabel.numericLabel() method ignores the underlying score. * For testing binary examples, classLabel.isPositive(), * classLabel.isNegative(), and classLabel.bestWeight() should be * used. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A label which is associated with an instance---either by a classifier, or in training data. *<p> ClassLabels should be weighted to that the weight for a class name is (approximately) the log-odds having that class name, ie if the probability of class "POS" is p, the getWeight("POS") should return Math.log( p/(1-p) ). * The POS and NEG class labels (as defined in ExampleSchema.POS_CLASS_NAME and ExampleSchema.NEG_CLASS_NAME) are special. Binary class labels should be created with the positiveLabel(posWeight) and negativeLabel(negWeight) routines, or else the binaryLabel routine. The numericLabel() returns +1 or -1 for binary classLabels. The posWeight() method returns the score of the positive class. The classLabel.numericLabel() method ignores the underlying score. For testing binary examples, classLabel.isPositive(), classLabel.isNegative(), and classLabel.bestWeight() should be used. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ClassLabel	TokenNameIdentifier	 Class Label
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
WeightedSet	TokenNameIdentifier	 Weighted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
wset	TokenNameIdentifier	 wset
=	TokenNameEQUAL	
new	TokenNamenew	
WeightedSet	TokenNameIdentifier	 Weighted Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
bestLabel	TokenNameIdentifier	 best Label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
bestWeight	TokenNameIdentifier	 best Weight
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Create a positive binary label, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a positive binary label, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
multiPosLabel	TokenNameIdentifier	 multi Pos Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//String negLabel = "NOT" + label; 	TokenNameCOMMENT_LINE	String negLabel = "NOT" + label; 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a positive binary label, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a positive binary label, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
multiNegLabel	TokenNameIdentifier	 multi Neg Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a binary label, either positive or negative, as appropriate, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a binary label, either positive or negative, as appropriate, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
multiLabel	TokenNameIdentifier	 multi Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
multiPosLabel	TokenNameIdentifier	 multi Pos Label
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
:	TokenNameCOLON	
multiNegLabel	TokenNameIdentifier	 multi Neg Label
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a positive binary label, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a positive binary label, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"positiveLabel should have positive score"	TokenNameStringLiteral	positiveLabel should have positive score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
,	TokenNameCOMMA	
-	TokenNameMINUS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a negative binary label, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a negative binary label, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"negativeLabel should have negative score"	TokenNameStringLiteral	negativeLabel should have negative score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
,	TokenNameCOMMA	
-	TokenNameMINUS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a binary label, either positive or negative, as appropriate, with the associated score (in logits). */	TokenNameCOMMENT_JAVADOC	 Create a binary label, either positive or negative, as appropriate, with the associated score (in logits). 
static	TokenNamestatic	
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
:	TokenNameCOLON	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is one of the distinguished binary labels. */	TokenNameCOMMENT_JAVADOC	 See if this is one of the distinguished binary labels. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
.	TokenNameDOT	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is the distinguished positive label. */	TokenNameCOMMENT_JAVADOC	 See if this is the distinguished positive label. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
bestLabel	TokenNameIdentifier	 best Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** See if this is the distinguished negative label. */	TokenNameCOMMENT_JAVADOC	 See if this is the distinguished negative label. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
bestLabel	TokenNameIdentifier	 best Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a numeric score of +1, or -1 for a binary example */	TokenNameCOMMENT_JAVADOC	 Return a numeric score of +1, or -1 for a binary example 
public	TokenNamepublic	
double	TokenNamedouble	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"not binary label"	TokenNameStringLiteral	not binary label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the highest-ranking label. */	TokenNameCOMMENT_JAVADOC	 Returns the highest-ranking label. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bestLabel	TokenNameIdentifier	 best Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the highest-ranking label. */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the highest-ranking label. 
public	TokenNamepublic	
double	TokenNamedouble	
bestWeight	TokenNameIdentifier	 best Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bestWeight	TokenNameIdentifier	 best Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the positive class name */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the positive class name 
public	TokenNamepublic	
double	TokenNamedouble	
posWeight	TokenNameIdentifier	 pos Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the probability of the positive class name */	TokenNameCOMMENT_JAVADOC	 Returns the probability of the positive class name 
public	TokenNamepublic	
double	TokenNamedouble	
posProbability	TokenNameIdentifier	 pos Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProbability	TokenNameIdentifier	 get Probability
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the weight of the label. */	TokenNameCOMMENT_JAVADOC	 Returns the weight of the label. 
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wset	TokenNameIdentifier	 wset
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
-	TokenNameMINUS	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the probability of a label. */	TokenNameCOMMENT_JAVADOC	 Returns the probability of a label. 
public	TokenNamepublic	
double	TokenNamedouble	
getProbability	TokenNameIdentifier	 get Probability
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// same as MathUtil.logistic, I think 	TokenNameCOMMENT_LINE	same as MathUtil.logistic, I think 
double	TokenNamedouble	
expOdds	TokenNameIdentifier	 exp Odds
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expOdds	TokenNameIdentifier	 exp Odds
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
expOdds	TokenNameIdentifier	 exp Odds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the set of labels that appear in the ranking. */	TokenNameCOMMENT_JAVADOC	 Returns the set of labels that appear in the ranking. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
possibleLabels	TokenNameIdentifier	 possible Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wset	TokenNameIdentifier	 wset
.	TokenNameDOT	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Is this label correct, relative to another label? */	TokenNameCOMMENT_JAVADOC	 Is this label correct, relative to another label? 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
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
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherLabel	TokenNameIdentifier	 other Label
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Is this label correct, relative to a numeric label? */	TokenNameCOMMENT_JAVADOC	 Is this label correct, relative to a numeric label? 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
double	TokenNamedouble	
otherLabel	TokenNameIdentifier	 other Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
otherLabel	TokenNameIdentifier	 other Label
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"not a binary label"	TokenNameStringLiteral	not a binary label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a label with the given weight to this ClassLabel. */	TokenNameCOMMENT_JAVADOC	 Add a label with the given weight to this ClassLabel. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
>	TokenNameGREATER	
bestWeight	TokenNameIdentifier	 best Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestWeight	TokenNameIdentifier	 best Weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
bestLabel	TokenNameIdentifier	 best Label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wset	TokenNameIdentifier	 wset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
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
"[Class: "	TokenNameStringLiteral	[Class: 
+	TokenNamePLUS	
bestLabel	TokenNameIdentifier	 best Label
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
bestWeight	TokenNameIdentifier	 best Weight
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toDetails	TokenNameIdentifier	 to Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[ClassLabel: "	TokenNameStringLiteral	[ClassLabel: 
+	TokenNamePLUS	
wset	TokenNameIdentifier	 wset
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
