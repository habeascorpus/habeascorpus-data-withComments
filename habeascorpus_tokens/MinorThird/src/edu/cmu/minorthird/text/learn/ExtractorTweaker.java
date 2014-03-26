/* Copyright 2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
lgc	TokenNameIdentifier	 lgc
.	TokenNameDOT	
wsh	TokenNameIdentifier	 wsh
.	TokenNameDOT	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
ScalarSolver	TokenNameIdentifier	 Scalar Solver
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
sequential	TokenNameIdentifier	 sequential
.	TokenNameDOT	
CMM	TokenNameIdentifier	 CMM
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
sequential	TokenNameIdentifier	 sequential
.	TokenNameDOT	
CMMTweaker	TokenNameIdentifier	 CMM Tweaker
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
sequential	TokenNameIdentifier	 sequential
.	TokenNameDOT	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
FancyLoader	TokenNameIdentifier	 Fancy Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SpanDifference	TokenNameIdentifier	 Span Difference
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
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
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
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
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
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
IOUtil	TokenNameIdentifier	 IO Util
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
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
/** * Allows one to adjust the parameters of a learned extractor. * * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Allows one to adjust the parameters of a learned extractor. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ExtractorTweaker	TokenNameIdentifier	 Extractor Tweaker
{	TokenNameLBRACE	
private	TokenNameprivate	
CMMTweaker	TokenNameIdentifier	 CMM Tweaker
cmmTweaker	TokenNameIdentifier	 cmm Tweaker
=	TokenNameEQUAL	
new	TokenNamenew	
CMMTweaker	TokenNameIdentifier	 CMM Tweaker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// the getNewBias, getOldBias are here if anyone wants to use the 	TokenNameCOMMENT_LINE	the getNewBias, getOldBias are here if anyone wants to use the 
// tweak(annotator,biasValue) interface as part of their own 	TokenNameCOMMENT_LINE	tweak(annotator,biasValue) interface as part of their own 
// optimization routine. Notice there's no easy way to find out 	TokenNameCOMMENT_LINE	optimization routine. Notice there's no easy way to find out 
// what the existing bias is. 	TokenNameCOMMENT_LINE	what the existing bias is. 
// 	TokenNameCOMMENT_LINE	 
/** * Return the value of bias term before the last tweak. */	TokenNameCOMMENT_JAVADOC	 Return the value of bias term before the last tweak. 
public	TokenNamepublic	
double	TokenNamedouble	
getOldBias	TokenNameIdentifier	 get Old Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmmTweaker	TokenNameIdentifier	 cmm Tweaker
.	TokenNameDOT	
oldBias	TokenNameIdentifier	 old Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the value of bias term after the last tweak. */	TokenNameCOMMENT_JAVADOC	 Return the value of bias term after the last tweak. 
public	TokenNamepublic	
double	TokenNamedouble	
getNewBias	TokenNameIdentifier	 get New Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmmTweaker	TokenNameIdentifier	 cmm Tweaker
.	TokenNameDOT	
newBias	TokenNameIdentifier	 new Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a modified copy of the annotator. Only works for annotators learned * by the voted perceptron and/or CRF learners. */	TokenNameCOMMENT_JAVADOC	 Return a modified copy of the annotator. Only works for annotators learned by the voted perceptron and/or CRF learners. 
public	TokenNamepublic	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
double	TokenNamedouble	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
instanceof	TokenNameinstanceof	
SequenceAnnotatorLearner	TokenNameIdentifier	 Sequence Annotator Learner
.	TokenNameDOT	
SequenceAnnotator	TokenNameIdentifier	 Sequence Annotator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SequenceAnnotatorLearner	TokenNameIdentifier	 Sequence Annotator Learner
.	TokenNameDOT	
SequenceAnnotator	TokenNameIdentifier	 Sequence Annotator
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SequenceAnnotatorLearner	TokenNameIdentifier	 Sequence Annotator Learner
.	TokenNameDOT	
SequenceAnnotator	TokenNameIdentifier	 Sequence Annotator
)	TokenNameRPAREN	
annotator	TokenNameIdentifier	 annotator
;	TokenNameSEMICOLON	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
getSequenceClassifier	TokenNameIdentifier	 get Sequence Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
instanceof	TokenNameinstanceof	
CMM	TokenNameIdentifier	 CMM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CMM	TokenNameIdentifier	 CMM
cmm	TokenNameIdentifier	 cmm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CMM	TokenNameIdentifier	 CMM
)	TokenNameRPAREN	
sc	TokenNameIdentifier	 sc
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SequenceAnnotatorLearner	TokenNameIdentifier	 Sequence Annotator Learner
.	TokenNameDOT	
SequenceAnnotator	TokenNameIdentifier	 Sequence Annotator
(	TokenNameLPAREN	
cmmTweaker	TokenNameIdentifier	 cmm Tweaker
.	TokenNameDOT	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
cmm	TokenNameIdentifier	 cmm
,	TokenNameCOMMA	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
getSpanFeatureExtractor	TokenNameIdentifier	 get Span Feature Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
getReduction	TokenNameIdentifier	 get Reduction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
getSpanType	TokenNameIdentifier	 get Span Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't tweak annotator based on sequence classifier of type "	TokenNameStringLiteral	can't tweak annotator based on sequence classifier of type 
+	TokenNamePLUS	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't tweak annotator of type "	TokenNameStringLiteral	can't tweak annotator of type 
+	TokenNamePLUS	
annotator	TokenNameIdentifier	 annotator
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// command-line processing 	TokenNameCOMMENT_LINE	command-line processing 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
fromFile	TokenNameIdentifier	 from File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
toFile	TokenNameIdentifier	 to File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextLabels	TokenNameIdentifier	 Text Labels
textLabels	TokenNameIdentifier	 text Labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
newBias	TokenNameIdentifier	 new Bias
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
-	TokenNameMINUS	
999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
999	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
biasSpecified	TokenNameIdentifier	 bias Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
loSpecified	TokenNameIdentifier	 lo Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
hiSpecified	TokenNameIdentifier	 hi Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MyCLP	TokenNameIdentifier	 My CLP
extends	TokenNameextends	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
loadFrom	TokenNameIdentifier	 load From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromFile	TokenNameIdentifier	 from File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toFile	TokenNameIdentifier	 to File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
labels	TokenNameIdentifier	 labels
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textLabels	TokenNameIdentifier	 text Labels
=	TokenNameEQUAL	
FancyLoader	TokenNameIdentifier	 Fancy Loader
.	TokenNameDOT	
loadTextLabels	TokenNameIdentifier	 load Text Labels
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
spanType	TokenNameIdentifier	 span Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spanType	TokenNameIdentifier	 span Type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
newBias	TokenNameIdentifier	 new Bias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newBias	TokenNameIdentifier	 new Bias
=	TokenNameEQUAL	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
biasSpecified	TokenNameIdentifier	 bias Specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
loBias	TokenNameIdentifier	 lo Bias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loSpecified	TokenNameIdentifier	 lo Specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
hiBias	TokenNameIdentifier	 hi Bias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hiSpecified	TokenNameIdentifier	 hi Specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
beta	TokenNameIdentifier	 beta
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atof	TokenNameIdentifier	 atof
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
USAGE	TokenNameIdentifier	 USAGE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
USAGE	TokenNameIdentifier	 USAGE
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyCLP	TokenNameIdentifier	 My CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
USAGE	TokenNameIdentifier	 USAGE
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"ExtractorTweaker: modify the recall/precision of a previously-learned extractor"	TokenNameStringLiteral	ExtractorTweaker: modify the recall/precision of a previously-learned extractor
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"Parameters:"	TokenNameStringLiteral	Parameters:
,	TokenNameCOMMA	
" -loadFrom FILE where to load a previously-learner extractor from"	TokenNameStringLiteral	 -loadFrom FILE where to load a previously-learner extractor from
,	TokenNameCOMMA	
" [-saveAs FILE] where to save the 'tweaked' version of the extractor"	TokenNameStringLiteral	 [-saveAs FILE] where to save the 'tweaked' version of the extractor
,	TokenNameCOMMA	
" [-newBias NUM] new value that replaces the hyperplane_bias term of the NEG hyperplane"	TokenNameStringLiteral	 [-newBias NUM] new value that replaces the hyperplane_bias term of the NEG hyperplane
,	TokenNameCOMMA	
" [-loBias NUM] lower limit of search for best bias term"	TokenNameStringLiteral	 [-loBias NUM] lower limit of search for best bias term
,	TokenNameCOMMA	
" [-hiBias NUM] lower limit of search for best bias term"	TokenNameStringLiteral	 [-hiBias NUM] lower limit of search for best bias term
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"If -newBias is NOT specified, then ExtractorTweaker will try and find a 'good' value"	TokenNameStringLiteral	If -newBias is NOT specified, then ExtractorTweaker will try and find a 'good' value
,	TokenNameCOMMA	
"on its own, using bisection search, guided by the following additional parameters:"	TokenNameStringLiteral	on its own, using bisection search, guided by the following additional parameters:
,	TokenNameCOMMA	
" -labels KEY -spanType TYPE [-beta BETA]"	TokenNameStringLiteral	 -labels KEY -spanType TYPE [-beta BETA]
,	TokenNameCOMMA	
"where -labels KEY -spanType TYPE specifies the dataset to use in opimizing the extractor"	TokenNameStringLiteral	where -labels KEY -spanType TYPE specifies the dataset to use in opimizing the extractor
,	TokenNameCOMMA	
"and -beta BETA determines the function to optimize, namely token-level F_beta (default, beta=1)"	TokenNameStringLiteral	and -beta BETA determines the function to optimize, namely token-level F_beta (default, beta=1)
,	TokenNameCOMMA	
"It seems to work ok to optimize performance on the dataset used for training."	TokenNameStringLiteral	It seems to work ok to optimize performance on the dataset used for training.
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"need to specify -loadFrom"	TokenNameStringLiteral	need to specify -loadFrom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
annotator	TokenNameIdentifier	 annotator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"loading from: "	TokenNameStringLiteral	loading from: 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
annotator	TokenNameIdentifier	 annotator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
fromFile	TokenNameIdentifier	 from File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"can't load "	TokenNameStringLiteral	can't load 
+	TokenNamePLUS	
fromFile	TokenNameIdentifier	 from File
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
tweaked	TokenNameIdentifier	 tweaked
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
biasSpecified	TokenNameIdentifier	 bias Specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// just tweak the bias as given 	TokenNameCOMMENT_LINE	just tweak the bias as given 
tweaked	TokenNameIdentifier	 tweaked
=	TokenNameEQUAL	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
newBias	TokenNameIdentifier	 new Bias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
biasSpecified	TokenNameIdentifier	 bias Specified
&&	TokenNameAND_AND	
textLabels	TokenNameIdentifier	 text Labels
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
spanType	TokenNameIdentifier	 span Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try and optimize f1 on the provided set of text labels 	TokenNameCOMMENT_LINE	try and optimize f1 on the provided set of text labels 
// figure out initial bounds 	TokenNameCOMMENT_LINE	figure out initial bounds 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
loSpecified	TokenNameIdentifier	 lo Specified
||	TokenNameOR_OR	
!	TokenNameNOT	
hiSpecified	TokenNameIdentifier	 hi Specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getOldBias	TokenNameIdentifier	 get Old Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
-	TokenNameMINUS	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
loSpecified	TokenNameIdentifier	 lo Specified
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hiSpecified	TokenNameIdentifier	 hi Specified
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"oldBias term was "	TokenNameStringLiteral	oldBias term was 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
" testing between "	TokenNameStringLiteral	 testing between 
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"try to maximize token F[beta] for beta="	TokenNameStringLiteral	try to maximize token F[beta] for beta=
+	TokenNamePLUS	
beta	TokenNameIdentifier	 beta
+	TokenNamePLUS	
" (b>1 rewards recall, b<1 precision)"	TokenNameStringLiteral	 (b>1 rewards recall, b<1 precision)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnnTester	TokenNameIdentifier	 Ann Tester
annTester	TokenNameIdentifier	 ann Tester
=	TokenNameEQUAL	
new	TokenNamenew	
AnnTester	TokenNameIdentifier	 Ann Tester
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScalarSolver	TokenNameIdentifier	 Scalar Solver
solver	TokenNameIdentifier	 solver
=	TokenNameEQUAL	
new	TokenNamenew	
ScalarSolver	TokenNameIdentifier	 Scalar Solver
(	TokenNameLPAREN	
annTester	TokenNameIdentifier	 ann Tester
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
optBias	TokenNameIdentifier	 opt Bias
=	TokenNameEQUAL	
solver	TokenNameIdentifier	 solver
.	TokenNameDOT	
solve	TokenNameIdentifier	 solve
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.01	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tweaked	TokenNameIdentifier	 tweaked
=	TokenNameEQUAL	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
optBias	TokenNameIdentifier	 opt Bias
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
"illegal usage, use -help for help"	TokenNameStringLiteral	illegal usage, use -help for help
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toFile	TokenNameIdentifier	 to File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
saveSerialized	TokenNameIdentifier	 save Serialized
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Serializable	TokenNameIdentifier	 Serializable
)	TokenNameRPAREN	
tweaked	TokenNameIdentifier	 tweaked
,	TokenNameCOMMA	
toFile	TokenNameIdentifier	 to File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"can't save to "	TokenNameStringLiteral	can't save to 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
toFile	TokenNameIdentifier	 to File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// a function to optimize - returns token-level F_beta 	TokenNameCOMMENT_LINE	a function to optimize - returns token-level F_beta 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
class	TokenNameclass	
AnnTester	TokenNameIdentifier	 Ann Tester
implements	TokenNameimplements	
ScalarSolver	TokenNameIdentifier	 Scalar Solver
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
{	TokenNameLBRACE	
private	TokenNameprivate	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
ann	TokenNameIdentifier	 ann
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AnnTester	TokenNameIdentifier	 Ann Tester
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
annotator	TokenNameIdentifier	 annotator
,	TokenNameCOMMA	
double	TokenNamedouble	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
annotator	TokenNameIdentifier	 annotator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
beta	TokenNameIdentifier	 beta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
function	TokenNameIdentifier	 function
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
tweakedAnn	TokenNameIdentifier	 tweaked Ann
=	TokenNameEQUAL	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabels	TokenNameIdentifier	 Text Labels
annLabels	TokenNameIdentifier	 ann Labels
=	TokenNameEQUAL	
tweakedAnn	TokenNameIdentifier	 tweaked Ann
.	TokenNameDOT	
annotatedCopy	TokenNameIdentifier	 annotated Copy
(	TokenNameLPAREN	
textLabels	TokenNameIdentifier	 text Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanDifference	TokenNameIdentifier	 Span Difference
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
new	TokenNamenew	
SpanDifference	TokenNameIdentifier	 Span Difference
(	TokenNameLPAREN	
annLabels	TokenNameIdentifier	 ann Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getSpanType	TokenNameIdentifier	 get Span Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
annLabels	TokenNameIdentifier	 ann Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
annLabels	TokenNameIdentifier	 ann Labels
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
*	TokenNameMULTIPLY	
beta	TokenNameIdentifier	 beta
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
*	TokenNameMULTIPLY	
beta	TokenNameIdentifier	 beta
*	TokenNameMULTIPLY	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"after testing bias "	TokenNameStringLiteral	after testing bias 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
" yields f["	TokenNameStringLiteral	 yields f[
+	TokenNamePLUS	
beta	TokenNameIdentifier	 beta
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" for p/r of "	TokenNameStringLiteral	 for p/r of 
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
// scalar solver tries to minimize this 	TokenNameCOMMENT_LINE	scalar solver tries to minimize this 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ExtractorTweaker	TokenNameIdentifier	 Extractor Tweaker
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
new	TokenNamenew	
ExtractorTweaker	TokenNameIdentifier	 Extractor Tweaker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
.	TokenNameDOT	
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xt	TokenNameIdentifier	 xt
.	TokenNameDOT	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
