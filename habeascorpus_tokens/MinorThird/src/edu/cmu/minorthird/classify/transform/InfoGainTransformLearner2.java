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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * @author William Cohen * Date: Nov 21, 2003 * @author Edoardo Airoldi * Date: Feb 05, 2004 */	TokenNameCOMMENT_JAVADOC	 @author William Cohen Date: Nov 21, 2003 @author Edoardo Airoldi Date: Feb 05, 2004 
public	TokenNamepublic	
class	TokenNameclass	
InfoGainTransformLearner2	TokenNameIdentifier	 Info Gain Transform Learner2
implements	TokenNameimplements	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
frequencyModel	TokenNameIdentifier	 frequency Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
/** Default constructor, limits to 100 features */	TokenNameCOMMENT_JAVADOC	 Default constructor, limits to 100 features 
public	TokenNamepublic	
InfoGainTransformLearner2	TokenNameIdentifier	 Info Gain Transform Learner2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This will "learn" an InstanceTransform that discards with low info gain. */	TokenNameCOMMENT_JAVADOC	 This will "learn" an InstanceTransform that discards with low info gain. 
public	TokenNamepublic	
InfoGainTransformLearner2	TokenNameIdentifier	 Info Gain Transform Learner2
(	TokenNameLPAREN	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
numFeatures	TokenNameIdentifier	 num Features
,	TokenNameCOMMA	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InfoGainTransformLearner2	TokenNameIdentifier	 Info Gain Transform Learner2
(	TokenNameLPAREN	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
frequencyModel	TokenNameIdentifier	 frequency Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frequencyModel	TokenNameIdentifier	 frequency Model
=	TokenNameEQUAL	
frequencyModel	TokenNameIdentifier	 frequency Model
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numFeatures	TokenNameIdentifier	 num Features
=	TokenNameEQUAL	
numFeatures	TokenNameIdentifier	 num Features
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** A class that we use to sort a TreeMap by values */	TokenNameCOMMENT_JAVADOC	 A class that we use to sort a TreeMap by values 
private	TokenNameprivate	
class	TokenNameclass	
IGPair	TokenNameIdentifier	 IG Pair
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
IGPair	TokenNameIdentifier	 IG Pair
>	TokenNameGREATER	
{	TokenNameLBRACE	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IGPair	TokenNameIdentifier	 IG Pair
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
IGPair	TokenNameIdentifier	 IG Pair
ig2	TokenNameIdentifier	 ig2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
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
"[ "	TokenNameStringLiteral	[ 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
+	TokenNamePLUS	
" ]"	TokenNameStringLiteral	 ]
;	TokenNameSEMICOLON	
//this.key + " ]"; 	TokenNameCOMMENT_LINE	this.key + " ]"; 
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// figure out what features have high gain 	TokenNameCOMMENT_LINE	figure out what features have high gain 
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IGPair	TokenNameIdentifier	 IG Pair
>	TokenNameGREATER	
igValues	TokenNameIdentifier	 ig Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IGPair	TokenNameIdentifier	 IG Pair
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if (!dataset.getSchema().equals(ExampleSchema.BINARY_EXAMPLE_SCHEMA)) 	TokenNameCOMMENT_LINE	if (!dataset.getSchema().equals(ExampleSchema.BINARY_EXAMPLE_SCHEMA)) 
// throw new IllegalArgumentException("only works for binary data!"); 	TokenNameCOMMENT_LINE	throw new IllegalArgumentException("only works for binary data!"); 
if	TokenNameif	
(	TokenNameLPAREN	
frequencyModel	TokenNameIdentifier	 frequency Model
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
classCnt	TokenNameIdentifier	 class Cnt
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
N	TokenNameIdentifier	 N
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
totalCnt	TokenNameIdentifier	 total Cnt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classCnt	TokenNameIdentifier	 class Cnt
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalCnt	TokenNameIdentifier	 total Cnt
+=	TokenNamePLUS_EQUAL	
classCnt	TokenNameIdentifier	 class Cnt
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
totalEntropy	TokenNameIdentifier	 total Entropy
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
classCnt	TokenNameIdentifier	 class Cnt
,	TokenNameCOMMA	
totalCnt	TokenNameIdentifier	 total Cnt
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
index	TokenNameIdentifier	 index
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureCntWithF	TokenNameIdentifier	 feature Cnt With F
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
N	TokenNameIdentifier	 N
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureCntWithoutF	TokenNameIdentifier	 feature Cnt Without F
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
N	TokenNameIdentifier	 N
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
totalCntWithF	TokenNameIdentifier	 total Cnt With F
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
totalCntWithoutF	TokenNameIdentifier	 total Cnt Without F
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
featureCntWithF	TokenNameIdentifier	 feature Cnt With F
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureCntWithoutF	TokenNameIdentifier	 feature Cnt Without F
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
classCnt	TokenNameIdentifier	 class Cnt
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
-	TokenNameMINUS	
featureCntWithF	TokenNameIdentifier	 feature Cnt With F
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
totalCntWithF	TokenNameIdentifier	 total Cnt With F
+=	TokenNamePLUS_EQUAL	
featureCntWithF	TokenNameIdentifier	 feature Cnt With F
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
totalCntWithoutF	TokenNameIdentifier	 total Cnt Without F
+=	TokenNamePLUS_EQUAL	
featureCntWithoutF	TokenNameIdentifier	 feature Cnt Without F
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
entropyWithF	TokenNameIdentifier	 entropy With F
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
featureCntWithF	TokenNameIdentifier	 feature Cnt With F
,	TokenNameCOMMA	
totalCntWithF	TokenNameIdentifier	 total Cnt With F
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
entropyWithoutF	TokenNameIdentifier	 entropy Without F
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
featureCntWithoutF	TokenNameIdentifier	 feature Cnt Without F
,	TokenNameCOMMA	
totalCntWithoutF	TokenNameIdentifier	 total Cnt Without F
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wf	TokenNameIdentifier	 wf
=	TokenNameEQUAL	
totalCntWithF	TokenNameIdentifier	 total Cnt With F
/	TokenNameDIVIDE	
totalCnt	TokenNameIdentifier	 total Cnt
;	TokenNameSEMICOLON	
// (double)dataset.size(); 	TokenNameCOMMENT_LINE	(double)dataset.size(); 
double	TokenNamedouble	
infoGain	TokenNameIdentifier	 info Gain
=	TokenNameEQUAL	
totalEntropy	TokenNameIdentifier	 total Entropy
-	TokenNameMINUS	
wf	TokenNameIdentifier	 wf
*	TokenNameMULTIPLY	
entropyWithF	TokenNameIdentifier	 entropy With F
-	TokenNameMINUS	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
wf	TokenNameIdentifier	 wf
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
entropyWithoutF	TokenNameIdentifier	 entropy Without F
;	TokenNameSEMICOLON	
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
IGPair	TokenNameIdentifier	 IG Pair
(	TokenNameLPAREN	
infoGain	TokenNameIdentifier	 info Gain
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*if ( frequencyModel.equals("document") ) { double dCntPos = (double)index.size(ExampleSchema.POS_CLASS_NAME); double dCntNeg = (double)dataset.size() -dCntPos; double totalEntropy = entropy( dCntPos/(dCntPos+dCntNeg),dCntNeg/(dCntPos+dCntNeg) ); for (Feature.Looper i=index.featureIterator(); i.hasNext(); ) { Feature f = i.nextFeature(); double dCntWithF[] = new double[2]; // [0] neg, [1] pos double dCntWithoutF[] = new double[2]; // [0] neg, [1] pos dCntWithF[0] = (double)index.size(f,"NEG"); dCntWithF[1] = (double)index.size(f) -dCntWithF[0]; dCntWithoutF[0] = dCntNeg -dCntWithF[0]; dCntWithoutF[1] = dCntPos -dCntWithF[1]; double entropyWithF = entropy( dCntWithF[1]/(dCntWithF[0]+dCntWithF[1]),dCntWithF[0]/(dCntWithF[0]+dCntWithF[1]) ); double entropyWithoutF = entropy( dCntWithoutF[1]/(dCntWithoutF[0]+dCntWithoutF[1]),dCntWithoutF[0]/(dCntWithoutF[0]+dCntWithoutF[1]) ); double wf = (dCntWithF[0]+dCntWithF[1]) / (double)dataset.size(); double infoGain = totalEntropy -wf*entropyWithF -(1.0-wf)*entropyWithoutF; igValues.add( new IGPair(infoGain,f) ); } }*/	TokenNameCOMMENT_BLOCK	if ( frequencyModel.equals("document") ) { double dCntPos = (double)index.size(ExampleSchema.POS_CLASS_NAME); double dCntNeg = (double)dataset.size() -dCntPos; double totalEntropy = entropy( dCntPos/(dCntPos+dCntNeg),dCntNeg/(dCntPos+dCntNeg) ); for (Feature.Looper i=index.featureIterator(); i.hasNext(); ) { Feature f = i.nextFeature(); double dCntWithF[] = new double[2]; // [0] neg, [1] pos double dCntWithoutF[] = new double[2]; // [0] neg, [1] pos dCntWithF[0] = (double)index.size(f,"NEG"); dCntWithF[1] = (double)index.size(f) -dCntWithF[0]; dCntWithoutF[0] = dCntNeg -dCntWithF[0]; dCntWithoutF[1] = dCntPos -dCntWithF[1]; double entropyWithF = entropy( dCntWithF[1]/(dCntWithF[0]+dCntWithF[1]),dCntWithF[0]/(dCntWithF[0]+dCntWithF[1]) ); double entropyWithoutF = entropy( dCntWithoutF[1]/(dCntWithoutF[0]+dCntWithoutF[1]),dCntWithoutF[0]/(dCntWithoutF[0]+dCntWithoutF[1]) ); double wf = (dCntWithF[0]+dCntWithF[1]) / (double)dataset.size(); double infoGain = totalEntropy -wf*entropyWithF -(1.0-wf)*entropyWithoutF; igValues.add( new IGPair(infoGain,f) ); } }
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
frequencyModel	TokenNameIdentifier	 frequency Model
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"word"	TokenNameStringLiteral	word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: "	TokenNameStringLiteral	warning: 
+	TokenNamePLUS	
frequencyModel	TokenNameIdentifier	 frequency Model
+	TokenNamePLUS	
" is an unknown model for frequency!"	TokenNameStringLiteral	 is an unknown model for frequency!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
numFeatures	TokenNameIdentifier	 num Features
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build an InstanceTransform that removes low-frequency features 	TokenNameCOMMENT_LINE	build an InstanceTransform that removes low-frequency features 
return	TokenNamereturn	
new	TokenNamenew	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
new	TokenNamenew	
MaskedInstance	TokenNameIdentifier	 Masked Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
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
"[InstanceTransform: model = "	TokenNameStringLiteral	[InstanceTransform: model = 
+	TokenNamePLUS	
frequencyModel	TokenNameIdentifier	 frequency Model
+	TokenNamePLUS	
", top "	TokenNameStringLiteral	, top 
+	TokenNamePLUS	
numFeatures	TokenNameIdentifier	 num Features
+	TokenNamePLUS	
" by InfoGain]"	TokenNameStringLiteral	 by InfoGain]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** compute the entropy of a binary attribute */	TokenNameCOMMENT_JAVADOC	 compute the entropy of a binary attribute 
public	TokenNamepublic	
double	TokenNamedouble	
entropy	TokenNameIdentifier	 entropy
(	TokenNameLPAREN	
double	TokenNamedouble	
P1	TokenNameIdentifier	 P1
,	TokenNameCOMMA	
double	TokenNamedouble	
P2	TokenNameIdentifier	 P2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
entropy	TokenNameIdentifier	 entropy
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
P1	TokenNameIdentifier	 P1
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
|	TokenNameOR	
P2	TokenNameIdentifier	 P2
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entropy	TokenNameIdentifier	 entropy
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entropy	TokenNameIdentifier	 entropy
=	TokenNameEQUAL	
-	TokenNameMINUS	
P1	TokenNameIdentifier	 P1
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
P1	TokenNameIdentifier	 P1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
P2	TokenNameIdentifier	 P2
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
P2	TokenNameIdentifier	 P2
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
entropy	TokenNameIdentifier	 entropy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** compute the entropy of a non-binary attribute */	TokenNameCOMMENT_JAVADOC	 compute the entropy of a non-binary attribute 
public	TokenNamepublic	
double	TokenNamedouble	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
double	TokenNamedouble	
tot	TokenNameIdentifier	 tot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
entropy	TokenNameIdentifier	 entropy
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
p	TokenNameIdentifier	 p
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entropy	TokenNameIdentifier	 entropy
+=	TokenNamePLUS_EQUAL	
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
entropy	TokenNameIdentifier	 entropy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
