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
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
;	TokenNameSEMICOLON	
/** * @author Edoardo M. Airoldi * Date: Feb 6, 2004 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo M. Airoldi Date: Feb 6, 2004 
/** * A simple feature filter based on Ingormation Gain. * The frequency model is resposible for deciding 'what to count'. If set to * "document" this filter counts the number of documents which contain a Feature; * if set to "word" this filter counts the number of times a Feature appears in * the whole dataset. */	TokenNameCOMMENT_JAVADOC	 A simple feature filter based on Ingormation Gain. The frequency model is resposible for deciding 'what to count'. If set to "document" this filter counts the number of documents which contain a Feature; if set to "word" this filter counts the number of times a Feature appears in the whole dataset. 
public	TokenNamepublic	
class	TokenNameclass	
InfoGainTransformLearner	TokenNameIdentifier	 Info Gain Transform Learner
implements	TokenNameimplements	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
{	TokenNameLBRACE	
// static private Logger log = Logger.getLogger(T1InstanceTransformLearner.class); 	TokenNameCOMMENT_LINE	static private Logger log = Logger.getLogger(T1InstanceTransformLearner.class); 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
frequencyModel	TokenNameIdentifier	 frequency Model
;	TokenNameSEMICOLON	
/** Constructors */	TokenNameCOMMENT_JAVADOC	 Constructors 
public	TokenNamepublic	
InfoGainTransformLearner	TokenNameIdentifier	 Info Gain Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frequencyModel	TokenNameIdentifier	 frequency Model
=	TokenNameEQUAL	
"document"	TokenNameStringLiteral	document
;	TokenNameSEMICOLON	
// Default 	TokenNameCOMMENT_LINE	Default 
}	TokenNameRBRACE	
public	TokenNamepublic	
InfoGainTransformLearner	TokenNameIdentifier	 Info Gain Transform Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frequencyModel	TokenNameIdentifier	 frequency Model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Accept an ExampleSchema - constraints on what the * Examples will be. */	TokenNameCOMMENT_JAVADOC	 Accept an ExampleSchema - constraints on what the Examples will be. 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"can only learn binary example data"	TokenNameStringLiteral	can only learn binary example data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Examine data, build an instance transformer */	TokenNameCOMMENT_JAVADOC	 Examine data, build an instance transformer 
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
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
dCntPos	TokenNameIdentifier	 d Cnt Pos
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dCntNeg	TokenNameIdentifier	 d Cnt Neg
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
dCntPos	TokenNameIdentifier	 d Cnt Pos
;	TokenNameSEMICOLON	
double	TokenNamedouble	
totalEntropy	TokenNameIdentifier	 total Entropy
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
dCntPos	TokenNameIdentifier	 d Cnt Pos
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntPos	TokenNameIdentifier	 d Cnt Pos
+	TokenNamePLUS	
dCntNeg	TokenNameIdentifier	 d Cnt Neg
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dCntNeg	TokenNameIdentifier	 d Cnt Neg
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntPos	TokenNameIdentifier	 d Cnt Pos
+	TokenNamePLUS	
dCntNeg	TokenNameIdentifier	 d Cnt Neg
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
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// [0] neg, [1] pos 	TokenNameCOMMENT_LINE	[0] neg, [1] pos 
double	TokenNamedouble	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// [0] neg, [1] pos 	TokenNameCOMMENT_LINE	[0] neg, [1] pos 
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
-	TokenNameMINUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dCntNeg	TokenNameIdentifier	 d Cnt Neg
-	TokenNameMINUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dCntPos	TokenNameIdentifier	 d Cnt Pos
-	TokenNameMINUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
entropyWithF	TokenNameIdentifier	 entropy With F
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
entropyWithoutF	TokenNameIdentifier	 entropy Without F
=	TokenNameEQUAL	
Entropy	TokenNameIdentifier	 Entropy
(	TokenNameLPAREN	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dCntWithoutF	TokenNameIdentifier	 d Cnt Without F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wf	TokenNameIdentifier	 wf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dCntWithF	TokenNameIdentifier	 d Cnt With F
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
addFeatureIG	TokenNameIdentifier	 add Feature IG
(	TokenNameLPAREN	
infoGain	TokenNameIdentifier	 info Gain
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
//System.out.println("dCntPos="+dCntPos+" dCntNeg="+dCntNeg+" totEnt="+totalEntropy+"\n"); 	TokenNameCOMMENT_LINE	System.out.println("dCntPos="+dCntPos+" dCntNeg="+dCntNeg+" totEnt="+totalEntropy+"\n"); 
//System.out.println("feature="+f+" dCntWithF+="+dCntWithF[1]+" dCntWithF-="+dCntWithF[0]); 	TokenNameCOMMENT_LINE	System.out.println("feature="+f+" dCntWithF+="+dCntWithF[1]+" dCntWithF-="+dCntWithF[0]); 
//System.out.println("dCntWithoutF+="+dCntWithoutF[1]+" dCntWithoutF-="+dCntWithoutF[0]); 	TokenNameCOMMENT_LINE	System.out.println("dCntWithoutF+="+dCntWithoutF[1]+" dCntWithoutF-="+dCntWithoutF[0]); 
//System.out.println("entropyWithF="+entropyWithF+" entropyWithoutF="+entropyWithoutF+"\n"); 	TokenNameCOMMENT_LINE	System.out.println("entropyWithF="+entropyWithF+" entropyWithoutF="+entropyWithoutF+"\n"); 
//System.out.println("feature: "+((Pair)igValues.get(j)).feature+", ig="+((Pair)igValues.get(j)).value); 	TokenNameCOMMENT_LINE	System.out.println("feature: "+((Pair)igValues.get(j)).feature+", ig="+((Pair)igValues.get(j)).value); 
/*for (Example.Looper j=dataset.iterator(); j.hasNext(); ) { Example e = j.nextExample(); if (e.getLabel().bestClassName().equals("POS")) { dCnt[1] += 1.0; dCntWithF[1] += ( e.getWeight(f)>0 ) ? 1.0 : 0.0; dCntWithoutF[1] += ( e.getWeight(f)>0 ) ? 0.0 : 1.0; } else if (e.getLabel().bestClassName().equals("NEG")) { dCnt[0] += 1.0; dCntWithF[0] += ( e.getWeight(f)>0 ) ? 1.0 : 0.0; dCntWithoutF[0] += ( e.getWeight(f)>0 ) ? 0.0 : 1.0; } else { System.out.println( "error: unlabeled example!" ); System.exit(1); } }*/	TokenNameCOMMENT_BLOCK	for (Example.Looper j=dataset.iterator(); j.hasNext(); ) { Example e = j.nextExample(); if (e.getLabel().bestClassName().equals("POS")) { dCnt[1] += 1.0; dCntWithF[1] += ( e.getWeight(f)>0 ) ? 1.0 : 0.0; dCntWithoutF[1] += ( e.getWeight(f)>0 ) ? 0.0 : 1.0; } else if (e.getLabel().bestClassName().equals("NEG")) { dCnt[0] += 1.0; dCntWithF[0] += ( e.getWeight(f)>0 ) ? 1.0 : 0.0; dCntWithoutF[0] += ( e.getWeight(f)>0 ) ? 0.0 : 1.0; } else { System.out.println( "error: unlabeled example!" ); System.exit(1); } }
/*// fill array of <counts_ex(feature), length_ex> for POS class double[] xPos = new double[ index.size(f,"POS") ]; double[] omegaPos = new double[ index.size(f,"POS") ]; int position=0; for (int j=0; j<index.size(f); j++) { Example e = index.getExample(f,j); if ( "POS".equals( e.getLabel().bestClassName() ) ) { xPos[position] = e.getWeight(f); omegaPos[position] = getLength(e); position += 1; } } // fill array of <counts(example,feature), length(example)> for NEG class double[] xNeg = new double[ index.size(f,"NEG") ]; double[] omegaNeg = new double[ index.size(f,"NEG") ]; position=0; for (int j=0; j<index.size(f); j++) { Example e = index.getExample(f,j); if ( "NEG".equals( e.getLabel().bestClassName() ) ) { xNeg[position] = e.getWeight(f); omegaNeg[position] = getLength(e); position += 1; } }*/	TokenNameCOMMENT_BLOCK	// fill array of <counts_ex(feature), length_ex> for POS class double[] xPos = new double[ index.size(f,"POS") ]; double[] omegaPos = new double[ index.size(f,"POS") ]; int position=0; for (int j=0; j<index.size(f); j++) { Example e = index.getExample(f,j); if ( "POS".equals( e.getLabel().bestClassName() ) ) { xPos[position] = e.getWeight(f); omegaPos[position] = getLength(e); position += 1; } } // fill array of <counts(example,feature), length(example)> for NEG class double[] xNeg = new double[ index.size(f,"NEG") ]; double[] omegaNeg = new double[ index.size(f,"NEG") ]; position=0; for (int j=0; j<index.size(f); j++) { Example e = index.getExample(f,j); if ( "NEG".equals( e.getLabel().bestClassName() ) ) { xNeg[position] = e.getWeight(f); omegaNeg[position] = getLength(e); position += 1; } }
// estimate Parameters for the two classes and update the T1-Filter 	TokenNameCOMMENT_LINE	estimate Parameters for the two classes and update the T1-Filter 
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
" not implemented yet!"	TokenNameStringLiteral	 not implemented yet!
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
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Accessory Methods 	TokenNameCOMMENT_LINE	Accessory Methods 
/** compute the entropy of a binary attribute */	TokenNameCOMMENT_JAVADOC	 compute the entropy of a binary attribute 
public	TokenNamepublic	
double	TokenNamedouble	
Entropy	TokenNameIdentifier	 Entropy
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
/** Get the total number of words in an Example */	TokenNameCOMMENT_JAVADOC	 Get the total number of words in an Example 
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
len	TokenNameIdentifier	 len
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
e	TokenNameIdentifier	 e
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
len	TokenNameIdentifier	 len
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test Info-Gain Transform 	TokenNameCOMMENT_LINE	Test Info-Gain Transform 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
"toy"	TokenNameStringLiteral	toy
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"old data: "	TokenNameStringLiteral	old data: 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InfoGainTransformLearner	TokenNameIdentifier	 Info Gain Transform Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
new	TokenNamenew	
InfoGainTransformLearner	TokenNameIdentifier	 Info Gain Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
)	TokenNameRPAREN	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setNumberOfFeatures	TokenNameIdentifier	 set Number Of Features
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"new data: "	TokenNameStringLiteral	new data: 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
