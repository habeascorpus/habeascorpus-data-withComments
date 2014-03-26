/* Copyright 2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
Classifier	TokenNameIdentifier	 Classifier
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
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
Hyperplane	TokenNameIdentifier	 Hyperplane
;	TokenNameSEMICOLON	
/** * Adjust the precision-recall of a CMM that is based on an array of hyperplanes, * by adjusting the bias term of the hyperplane associated with the background (NEG) * class. This is intended mainly for adjusting precision-recall performance of * extractors learned by CollinsPerceptronLearner and CRFLearner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Adjust the precision-recall of a CMM that is based on an array of hyperplanes, by adjusting the bias term of the hyperplane associated with the background (NEG) class. This is intended mainly for adjusting precision-recall performance of extractors learned by CollinsPerceptronLearner and CRFLearner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CMMTweaker	TokenNameIdentifier	 CMM Tweaker
implements	TokenNameimplements	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
CMMTweaker	TokenNameIdentifier	 CMM Tweaker
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
double	TokenNamedouble	
oldBias	TokenNameIdentifier	 old Bias
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
double	TokenNamedouble	
newBias	TokenNameIdentifier	 new Bias
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Return the value of bias term before the last tweak. */	TokenNameCOMMENT_JAVADOC	 Return the value of bias term before the last tweak. 
public	TokenNamepublic	
double	TokenNamedouble	
oldBias	TokenNameIdentifier	 old Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
oldBias	TokenNameIdentifier	 old Bias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the value of bias term after tweaking. */	TokenNameCOMMENT_JAVADOC	 Return the value of bias term after tweaking. 
public	TokenNamepublic	
double	TokenNamedouble	
newBias	TokenNameIdentifier	 new Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newBias	TokenNameIdentifier	 new Bias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a copy of a CMM in which the one bias term, for the * hyperplane corresponding to the NEG class, has been changed. * The original CMM will not be modified. */	TokenNameCOMMENT_JAVADOC	 Return a copy of a CMM in which the one bias term, for the hyperplane corresponding to the NEG class, has been changed. The original CMM will not be modified. 
public	TokenNamepublic	
CMM	TokenNameIdentifier	 CMM
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
CMM	TokenNameIdentifier	 CMM
cmm	TokenNameIdentifier	 cmm
,	TokenNameCOMMA	
double	TokenNamedouble	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cmm	TokenNameIdentifier	 cmm
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
.	TokenNameDOT	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
.	TokenNameDOT	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
mc	TokenNameIdentifier	 mc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
.	TokenNameDOT	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
getHyperplanes	TokenNameIdentifier	 get Hyperplanes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
histSize	TokenNameIdentifier	 hist Size
=	TokenNameEQUAL	
cmm	TokenNameIdentifier	 cmm
.	TokenNameDOT	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CMM	TokenNameIdentifier	 CMM
(	TokenNameLPAREN	
new	TokenNamenew	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
histSize	TokenNameIdentifier	 hist Size
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
mc	TokenNameIdentifier	 mc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
getBinaryClassifiers	TokenNameIdentifier	 get Binary Classifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
bc	TokenNameIdentifier	 bc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
bc	TokenNameIdentifier	 bc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
bc	TokenNameIdentifier	 bc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Hyperplane	TokenNameIdentifier	 Hyperplane
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"invalid type of MultiClassClassifier: contains "	TokenNameStringLiteral	invalid type of MultiClassClassifier: contains 
+	TokenNamePLUS	
bc	TokenNameIdentifier	 bc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
)	TokenNameRPAREN	
bc	TokenNameIdentifier	 bc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
histSize	TokenNameIdentifier	 hist Size
=	TokenNameEQUAL	
cmm	TokenNameIdentifier	 cmm
.	TokenNameDOT	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CMM	TokenNameIdentifier	 CMM
(	TokenNameLPAREN	
new	TokenNamenew	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
histSize	TokenNameIdentifier	 hist Size
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"invalid type of CMM classifier "	TokenNameStringLiteral	invalid type of CMM classifier 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tweak	TokenNameIdentifier	 tweak
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
double	TokenNamedouble	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tweakedH	TokenNameIdentifier	 tweaked H
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
h	TokenNameIdentifier	 h
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tweakedH	TokenNameIdentifier	 tweaked H
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tweakedH	TokenNameIdentifier	 tweaked H
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tweakedH	TokenNameIdentifier	 tweaked H
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tweakedH	TokenNameIdentifier	 tweaked H
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
.	TokenNameDOT	
setBias	TokenNameIdentifier	 set Bias
(	TokenNameLPAREN	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldBias	TokenNameIdentifier	 old Bias
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
.	TokenNameDOT	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newBias	TokenNameIdentifier	 new Bias
=	TokenNameEQUAL	
bias	TokenNameIdentifier	 bias
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"bias term for NEG hyperplane: "	TokenNameStringLiteral	bias term for NEG hyperplane: 
+	TokenNamePLUS	
oldBias	TokenNameIdentifier	 old Bias
+	TokenNamePLUS	
" => "	TokenNameStringLiteral	 => 
+	TokenNamePLUS	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tweakedH	TokenNameIdentifier	 tweaked H
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
