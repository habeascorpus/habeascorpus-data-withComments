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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
semisupervised	TokenNameIdentifier	 semisupervised
.	TokenNameDOT	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
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
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
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
MathUtil	TokenNameIdentifier	 Math Util
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
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
/** Some sample inputs for learners. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Some sample inputs for learners. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posTrain	TokenNameIdentifier	 pos Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a pricy doll house"	TokenNameStringLiteral	a pricy doll house
,	TokenNameCOMMA	
"a little red fire truck"	TokenNameStringLiteral	a little red fire truck
,	TokenNameCOMMA	
"a red wagon"	TokenNameStringLiteral	a red wagon
,	TokenNameCOMMA	
"a pricy red sports car"	TokenNameStringLiteral	a pricy red sports car
,	TokenNameCOMMA	
"punk queen barbie and ken"	TokenNameStringLiteral	punk queen barbie and ken
,	TokenNameCOMMA	
"a little red bike"	TokenNameStringLiteral	a little red bike
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negTrain	TokenNameIdentifier	 neg Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a a a a big 7-seater minivan with an automatic transmission"	TokenNameStringLiteral	a a a a big 7-seater minivan with an automatic transmission
,	TokenNameCOMMA	
"a big house in the suburbs with a crushing mortgage"	TokenNameStringLiteral	a big house in the suburbs with a crushing mortgage
,	TokenNameCOMMA	
"a job for life at IBM"	TokenNameStringLiteral	a job for life at IBM
,	TokenNameCOMMA	
"a huge pile of tax forms, due yesterday"	TokenNameStringLiteral	a huge pile of tax forms, due yesterday
,	TokenNameCOMMA	
"huge pile of junk mail, bills, and catalogs"	TokenNameStringLiteral	huge pile of junk mail, bills, and catalogs
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posTest	TokenNameIdentifier	 pos Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a pricy barbie doll"	TokenNameStringLiteral	a pricy barbie doll
,	TokenNameCOMMA	
"a little yellow toy car"	TokenNameStringLiteral	a little yellow toy car
,	TokenNameCOMMA	
"a red 10 speed bike"	TokenNameStringLiteral	a red 10 speed bike
,	TokenNameCOMMA	
"a red convertible porshe"	TokenNameStringLiteral	a red convertible porshe
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negTest	TokenNameIdentifier	 neg Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a big pile of paperwork"	TokenNameStringLiteral	a big pile of paperwork
,	TokenNameCOMMA	
"a huge backlog of email"	TokenNameStringLiteral	a huge backlog of email
,	TokenNameCOMMA	
"a life of woe and trouble"	TokenNameStringLiteral	a life of woe and trouble
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeData	TokenNameIdentifier	 make Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
neg	TokenNameIdentifier	 neg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeExample	TokenNameIdentifier	 make Example
(	TokenNameLPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
neg	TokenNameIdentifier	 neg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeExample	TokenNameIdentifier	 make Example
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
neg	TokenNameIdentifier	 neg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Example	TokenNameIdentifier	 Example
makeExample	TokenNameIdentifier	 make Example
(	TokenNameLPAREN	
double	TokenNamedouble	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Training data for a trivial classification problem. */	TokenNameCOMMENT_JAVADOC	 Training data for a trivial classification problem. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyTrain	TokenNameIdentifier	 toy Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeData	TokenNameIdentifier	 make Data
(	TokenNameLPAREN	
posTrain	TokenNameIdentifier	 pos Train
,	TokenNameCOMMA	
negTrain	TokenNameIdentifier	 neg Train
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test data for a trivial classification problem. */	TokenNameCOMMENT_JAVADOC	 Test data for a trivial classification problem. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyTest	TokenNameIdentifier	 toy Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeData	TokenNameIdentifier	 make Data
(	TokenNameLPAREN	
posTest	TokenNameIdentifier	 pos Test
,	TokenNameCOMMA	
negTest	TokenNameIdentifier	 neg Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posBayesTrain	TokenNameIdentifier	 pos Bayes Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a a pricy doll house"	TokenNameStringLiteral	a a pricy doll house
,	TokenNameCOMMA	
"a a little red red fire truck"	TokenNameStringLiteral	a a little red red fire truck
,	TokenNameCOMMA	
"a red wagon"	TokenNameStringLiteral	a red wagon
,	TokenNameCOMMA	
"a pricy red sports car"	TokenNameStringLiteral	a pricy red sports car
,	TokenNameCOMMA	
"punk queen barbie and and ken"	TokenNameStringLiteral	punk queen barbie and and ken
,	TokenNameCOMMA	
"a little red bike"	TokenNameStringLiteral	a little red bike
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negBayesTrain	TokenNameIdentifier	 neg Bayes Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a big big 7-seater minivan with with an an automatic transmission"	TokenNameStringLiteral	a big big 7-seater minivan with with an an automatic transmission
,	TokenNameCOMMA	
"a big house in the suburbs with a a crushing mortgage"	TokenNameStringLiteral	a big house in the suburbs with a a crushing mortgage
,	TokenNameCOMMA	
"a job for for life at at IBM"	TokenNameStringLiteral	a job for for life at at IBM
,	TokenNameCOMMA	
"a huge pile of of tax forms, due yesterday"	TokenNameStringLiteral	a huge pile of of tax forms, due yesterday
,	TokenNameCOMMA	
"huge pile of of junk mail, bills, and catalogs"	TokenNameStringLiteral	huge pile of of junk mail, bills, and catalogs
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posBayesTest	TokenNameIdentifier	 pos Bayes Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a a pricy barbie doll"	TokenNameStringLiteral	a a pricy barbie doll
,	TokenNameCOMMA	
"a little yellow toy car"	TokenNameStringLiteral	a little yellow toy car
,	TokenNameCOMMA	
"a a red 10 speed bike"	TokenNameStringLiteral	a a red 10 speed bike
,	TokenNameCOMMA	
"a red convertible porshe"	TokenNameStringLiteral	a red convertible porshe
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negBayesTest	TokenNameIdentifier	 neg Bayes Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a big pile of of paperwork"	TokenNameStringLiteral	a big pile of of paperwork
,	TokenNameCOMMA	
"a huge backlog of email"	TokenNameStringLiteral	a huge backlog of email
,	TokenNameCOMMA	
"a life of woe and and trouble"	TokenNameStringLiteral	a life of woe and and trouble
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posBayesExtremeTrain	TokenNameIdentifier	 pos Bayes Extreme Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"p1 p1 p1 p2 p2 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5"	TokenNameStringLiteral	p1 p1 p1 p2 p2 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5
,	TokenNameCOMMA	
"p1 p1 p2 p2 p2 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5"	TokenNameStringLiteral	p1 p1 p2 p2 p2 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5
,	TokenNameCOMMA	
"p1 p1 p2 p2 p3 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5"	TokenNameStringLiteral	p1 p1 p2 p2 p3 p3 p3 p4 p4 p5 p5 n1 n2 n3 n4 n5
,	TokenNameCOMMA	
"p1 p1 p2 p2 p3 p3 p4 p4 p4 p5 p5 n1 n2 n3 n4 n5"	TokenNameStringLiteral	p1 p1 p2 p2 p3 p3 p4 p4 p4 p5 p5 n1 n2 n3 n4 n5
,	TokenNameCOMMA	
"p1 p1 p2 p2 p3 p3 p4 p4 p5 p5 p5 n1 n2 n3 n4 n5"	TokenNameStringLiteral	p1 p1 p2 p2 p3 p3 p4 p4 p5 p5 p5 n1 n2 n3 n4 n5
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negBayesExtremeTrain	TokenNameIdentifier	 neg Bayes Extreme Train
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"p1 p2 p3 p4 p5 n1 n1 n1 n2 n2 n3 n3 n4 n4 n5 n5"	TokenNameStringLiteral	p1 p2 p3 p4 p5 n1 n1 n1 n2 n2 n3 n3 n4 n4 n5 n5
,	TokenNameCOMMA	
"p1 p2 p3 p4 p5 n1 n1 n2 n2 n2 n3 n3 n4 n4 n5 n5"	TokenNameStringLiteral	p1 p2 p3 p4 p5 n1 n1 n2 n2 n2 n3 n3 n4 n4 n5 n5
,	TokenNameCOMMA	
"p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n3 n4 n4 n5 n5"	TokenNameStringLiteral	p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n3 n4 n4 n5 n5
,	TokenNameCOMMA	
"p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n4 n4 n4 n5 n5"	TokenNameStringLiteral	p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n4 n4 n4 n5 n5
,	TokenNameCOMMA	
"p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n4 n4 n5 n5 n5"	TokenNameStringLiteral	p1 p2 p3 p4 p5 n1 n1 n2 n2 n3 n3 n4 n4 n5 n5 n5
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posBayesExtremeTest	TokenNameIdentifier	 pos Bayes Extreme Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"p1 p1 n1"	TokenNameStringLiteral	p1 p1 n1
,	TokenNameCOMMA	
"p2 p2 n2"	TokenNameStringLiteral	p2 p2 n2
,	TokenNameCOMMA	
"p3 p3 n3"	TokenNameStringLiteral	p3 p3 n3
,	TokenNameCOMMA	
"p4 p4 n4"	TokenNameStringLiteral	p4 p4 n4
,	TokenNameCOMMA	
"p5 p5 n5"	TokenNameStringLiteral	p5 p5 n5
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
negBayesExtremeTest	TokenNameIdentifier	 neg Bayes Extreme Test
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"p1 n1 n1"	TokenNameStringLiteral	p1 n1 n1
,	TokenNameCOMMA	
"p2 n2 n2"	TokenNameStringLiteral	p2 n2 n2
,	TokenNameCOMMA	
"p3 n3 n3"	TokenNameStringLiteral	p3 n3 n3
,	TokenNameCOMMA	
"p4 n4 n4"	TokenNameStringLiteral	p4 n4 n4
,	TokenNameCOMMA	
"p5 n5 n5"	TokenNameStringLiteral	p5 n5 n5
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyBayesExtremeTrain	TokenNameIdentifier	 toy Bayes Extreme Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeBayesData	TokenNameIdentifier	 make Bayes Data
(	TokenNameLPAREN	
posBayesExtremeTrain	TokenNameIdentifier	 pos Bayes Extreme Train
,	TokenNameCOMMA	
negBayesExtremeTrain	TokenNameIdentifier	 neg Bayes Extreme Train
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyBayesExtremeTest	TokenNameIdentifier	 toy Bayes Extreme Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeBayesData	TokenNameIdentifier	 make Bayes Data
(	TokenNameLPAREN	
posBayesExtremeTest	TokenNameIdentifier	 pos Bayes Extreme Test
,	TokenNameCOMMA	
negBayesExtremeTest	TokenNameIdentifier	 neg Bayes Extreme Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unlabeledBayesExtreme	TokenNameIdentifier	 unlabeled Bayes Extreme
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"p1 n1 n1"	TokenNameStringLiteral	p1 n1 n1
,	TokenNameCOMMA	
"p2 n2 n2"	TokenNameStringLiteral	p2 n2 n2
,	TokenNameCOMMA	
"p3 n3 n3"	TokenNameStringLiteral	p3 n3 n3
,	TokenNameCOMMA	
"p1 p1 n1"	TokenNameStringLiteral	p1 p1 n1
,	TokenNameCOMMA	
"p2 p2 n2"	TokenNameStringLiteral	p2 p2 n2
,	TokenNameCOMMA	
"p3 p3 n3"	TokenNameStringLiteral	p3 p3 n3
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyBayesExtremeUnlabeledTrain	TokenNameIdentifier	 toy Bayes Extreme Unlabeled Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeUnlabeledBayesData	TokenNameIdentifier	 make Unlabeled Bayes Data
(	TokenNameLPAREN	
posBayesExtremeTrain	TokenNameIdentifier	 pos Bayes Extreme Train
,	TokenNameCOMMA	
negBayesExtremeTrain	TokenNameIdentifier	 neg Bayes Extreme Train
,	TokenNameCOMMA	
unlabeledBayesExtreme	TokenNameIdentifier	 unlabeled Bayes Extreme
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Makes test-data for generative Bayesian models */	TokenNameCOMMENT_JAVADOC	 Makes test-data for generative Bayesian models 
private	TokenNameprivate	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeUnlabeledBayesData	TokenNameIdentifier	 make Unlabeled Bayes Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
neg	TokenNameIdentifier	 neg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unlabeled	TokenNameIdentifier	 unlabeled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
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
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeLabeledBayesExample	TokenNameIdentifier	 make Labeled Bayes Example
(	TokenNameLPAREN	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
neg	TokenNameIdentifier	 neg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeLabeledBayesExample	TokenNameIdentifier	 make Labeled Bayes Example
(	TokenNameLPAREN	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
,	TokenNameCOMMA	
neg	TokenNameIdentifier	 neg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addUnlabeled	TokenNameIdentifier	 add Unlabeled
(	TokenNameLPAREN	
makeUnlabeledBayesExample	TokenNameIdentifier	 make Unlabeled Bayes Example
(	TokenNameLPAREN	
unlabeled	TokenNameIdentifier	 unlabeled
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Makes test-example for generative Bayesian models */	TokenNameCOMMENT_JAVADOC	 Makes test-example for generative Bayesian models 
private	TokenNameprivate	
static	TokenNamestatic	
Example	TokenNameIdentifier	 Example
makeLabeledBayesExample	TokenNameIdentifier	 make Labeled Bayes Example
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Makes test-example for generative Bayesian models */	TokenNameCOMMENT_JAVADOC	 Makes test-example for generative Bayesian models 
private	TokenNameprivate	
static	TokenNamestatic	
Instance	TokenNameIdentifier	 Instance
makeUnlabeledBayesExample	TokenNameIdentifier	 make Unlabeled Bayes Example
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Makes test-data for generative Bayesian models */	TokenNameCOMMENT_JAVADOC	 Makes test-data for generative Bayesian models 
private	TokenNameprivate	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeBayesData	TokenNameIdentifier	 make Bayes Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
neg	TokenNameIdentifier	 neg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeBayesExample	TokenNameIdentifier	 make Bayes Example
(	TokenNameLPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
neg	TokenNameIdentifier	 neg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeBayesExample	TokenNameIdentifier	 make Bayes Example
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
neg	TokenNameIdentifier	 neg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Makes test-example for generative Bayesian models */	TokenNameCOMMENT_JAVADOC	 Makes test-example for generative Bayesian models 
private	TokenNameprivate	
static	TokenNamestatic	
Example	TokenNameIdentifier	 Example
makeBayesExample	TokenNameIdentifier	 make Bayes Example
(	TokenNameLPAREN	
double	TokenNamedouble	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Training data for a trivial classification problem. */	TokenNameCOMMENT_JAVADOC	 Training data for a trivial classification problem. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyBayesTrain	TokenNameIdentifier	 toy Bayes Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeBayesData	TokenNameIdentifier	 make Bayes Data
(	TokenNameLPAREN	
posBayesTrain	TokenNameIdentifier	 pos Bayes Train
,	TokenNameCOMMA	
negBayesTrain	TokenNameIdentifier	 neg Bayes Train
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test data for a trivial classification problem. */	TokenNameCOMMENT_JAVADOC	 Test data for a trivial classification problem. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
toyBayesTest	TokenNameIdentifier	 toy Bayes Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeBayesData	TokenNameIdentifier	 make Bayes Data
(	TokenNameLPAREN	
posBayesTest	TokenNameIdentifier	 pos Bayes Test
,	TokenNameCOMMA	
negBayesTest	TokenNameIdentifier	 neg Bayes Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sparse numeric data - some values are 1.0, and some are zero. */	TokenNameCOMMENT_JAVADOC	 Sparse numeric data - some values are 1.0, and some are zero. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeSparseNumericData	TokenNameIdentifier	 make Sparse Numeric Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
fx	TokenNameIdentifier	 fx
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
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
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0.7	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
fx	TokenNameIdentifier	 fx
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Random data, defined by a simple boolean combination of thresholds * over two dimensions, with up to 5 irrelevant dimensions, and m * examples. */	TokenNameCOMMENT_JAVADOC	 Random data, defined by a simple boolean combination of thresholds over two dimensions, with up to 5 irrelevant dimensions, and m examples. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeNumericData	TokenNameIdentifier	 make Numeric Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
dim	TokenNameIdentifier	 dim
,	TokenNameCOMMA	
int	TokenNameint	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
fx	TokenNameIdentifier	 fx
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
fy	TokenNameIdentifier	 fy
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
,	TokenNameCOMMA	
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
"w"	TokenNameStringLiteral	w
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dim	TokenNameIdentifier	 dim
>	TokenNameGREATER	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"dim to big!"	TokenNameStringLiteral	dim to big!
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
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
dim	TokenNameIdentifier	 dim
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for testing purposes, leave the 'x' feature out of the first 	TokenNameCOMMENT_LINE	for testing purposes, leave the 'x' feature out of the first 
// example, and the 'y' feature out of the second 	TokenNameCOMMENT_LINE	example, and the 'y' feature out of the second 
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
fx	TokenNameIdentifier	 fx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
fy	TokenNameIdentifier	 fy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//double label = x<3 ? +1 : -1; 	TokenNameCOMMENT_LINE	double label = x<3 ? +1 : -1; 
double	TokenNamedouble	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
y	TokenNameIdentifier	 y
>	TokenNameGREATER	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//if (r.nextDouble() < 0.5) label *= -1; 	TokenNameCOMMENT_LINE	if (r.nextDouble() < 0.5) label *= -1; 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
binaryLabel	TokenNameIdentifier	 binary Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Data useful for testing univariate logistic regression. The * dataset will contain m examples, each with a single * uniformly-distributed numeric feature x. The probability of the * positive class will be chosen according to logistic(a*x + b). */	TokenNameCOMMENT_JAVADOC	 Data useful for testing univariate logistic regression. The dataset will contain m examples, each with a single uniformly-distributed numeric feature x. The probability of the positive class will be chosen according to logistic(a*x + b). 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeLogisticRegressionData	TokenNameIdentifier	 make Logistic Regression Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
int	TokenNameint	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numPos	TokenNameIdentifier	 num Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
MathUtil	TokenNameIdentifier	 Math Util
.	TokenNameDOT	
logistic	TokenNameIdentifier	 logistic
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
?	TokenNameQUESTION	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
numPos	TokenNameIdentifier	 num Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
else	TokenNameelse	
numNeg	TokenNameIdentifier	 num Neg
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"bias"	TokenNameStringLiteral	bias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
" examples: "	TokenNameStringLiteral	 examples: 
+	TokenNamePLUS	
numPos	TokenNameIdentifier	 num Pos
+	TokenNamePLUS	
" pos, "	TokenNameStringLiteral	 pos, 
+	TokenNamePLUS	
numNeg	TokenNameIdentifier	 num Neg
+	TokenNamePLUS	
" neg"	TokenNameStringLiteral	 neg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
makeToySequenceData	TokenNameIdentifier	 make Toy Sequence Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeToySequenceData	TokenNameIdentifier	 make Toy Sequence Data
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"you're a good man Charlie Brown"	TokenNameStringLiteral	you're a good man Charlie Brown
,	TokenNameCOMMA	
"where's Waldo?"	TokenNameStringLiteral	where's Waldo?
,	TokenNameCOMMA	
"alas dear Yorick, I knew him well"	TokenNameStringLiteral	alas dear Yorick, I knew him well
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
makeToySequenceTestData	TokenNameIdentifier	 make Toy Sequence Test Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeToySequenceData	TokenNameIdentifier	 make Toy Sequence Data
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"hello, World War III"	TokenNameStringLiteral	hello, World War III
,	TokenNameCOMMA	
"to be or 2B, that is a question"	TokenNameStringLiteral	to be or 2B, that is a question
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
makeToySequenceData	TokenNameIdentifier	 make Toy Sequence Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lines	TokenNameIdentifier	 lines
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
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
lines	TokenNameIdentifier	 lines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seq	TokenNameIdentifier	 seq
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
lab	TokenNameIdentifier	 lab
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isUpperCase	TokenNameIdentifier	 is Upper Case
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
"line"	TokenNameStringLiteral	line
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"here "	TokenNameStringLiteral	here 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"prev "	TokenNameStringLiteral	prev 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"next "	TokenNameStringLiteral	next 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"casePattern "	TokenNameStringLiteral	casePattern 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"[A-Z]+"	TokenNameStringLiteral	[A-Z]+
,	TokenNameCOMMA	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"[a-z]+"	TokenNameStringLiteral	[a-z]+
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seq	TokenNameIdentifier	 seq
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
,	TokenNameCOMMA	
lab	TokenNameIdentifier	 lab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
addSequence	TokenNameIdentifier	 add Sequence
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes a sample 3 class dataset * * @param random A random number generator for building the dataset. * @param numInstances The number of instances to be created. * */	TokenNameCOMMENT_JAVADOC	 Makes a sample 3 class dataset * @param random A random number generator for building the dataset. @param numInstances The number of instances to be created. 
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
makeToy3ClassData	TokenNameIdentifier	 make Toy3 Class Data
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
int	TokenNameint	
numInstances	TokenNameIdentifier	 num Instances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
"money"	TokenNameStringLiteral	money
,	TokenNameCOMMA	
"cash"	TokenNameStringLiteral	cash
,	TokenNameCOMMA	
"sleep"	TokenNameStringLiteral	sleep
,	TokenNameCOMMA	
"booze"	TokenNameStringLiteral	booze
,	TokenNameCOMMA	
"chocolate"	TokenNameStringLiteral	chocolate
,	TokenNameCOMMA	
"fun"	TokenNameStringLiteral	fun
,	TokenNameCOMMA	
"beer"	TokenNameStringLiteral	beer
,	TokenNameCOMMA	
"pizza"	TokenNameStringLiteral	pizza
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"stocks"	TokenNameStringLiteral	stocks
,	TokenNameCOMMA	
"bonds"	TokenNameStringLiteral	bonds
,	TokenNameCOMMA	
"money"	TokenNameStringLiteral	money
,	TokenNameCOMMA	
"cash"	TokenNameStringLiteral	cash
,	TokenNameCOMMA	
"influence"	TokenNameStringLiteral	influence
,	TokenNameCOMMA	
"power"	TokenNameStringLiteral	power
,	TokenNameCOMMA	
"fame"	TokenNameStringLiteral	fame
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"chocolate"	TokenNameStringLiteral	chocolate
,	TokenNameCOMMA	
"beer"	TokenNameStringLiteral	beer
,	TokenNameCOMMA	
"pizza"	TokenNameStringLiteral	pizza
,	TokenNameCOMMA	
"pringles"	TokenNameStringLiteral	pringles
,	TokenNameCOMMA	
"popcorn"	TokenNameStringLiteral	popcorn
,	TokenNameCOMMA	
"spam"	TokenNameStringLiteral	spam
,	TokenNameCOMMA	
"crisco"	TokenNameStringLiteral	crisco
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"homer"	TokenNameStringLiteral	homer
,	TokenNameCOMMA	
"marge"	TokenNameStringLiteral	marge
,	TokenNameCOMMA	
"bart"	TokenNameStringLiteral	bart
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
numInstances	TokenNameIdentifier	 num Instances
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
classLabel	TokenNameIdentifier	 class Label
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numFeatures	TokenNameIdentifier	 num Features
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
classLabel	TokenNameIdentifier	 class Label
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"word"	TokenNameStringLiteral	word
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
classLabel	TokenNameIdentifier	 class Label
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
feature	TokenNameIdentifier	 feature
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
classLabel	TokenNameIdentifier	 class Label
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Dataset	TokenNameIdentifier	 Dataset
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"toy"	TokenNameStringLiteral	toy
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
toyTest	TokenNameIdentifier	 toy Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
toyTrain	TokenNameIdentifier	 toy Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"bayes"	TokenNameStringLiteral	bayes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
toyBayesTest	TokenNameIdentifier	 toy Bayes Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
toyBayesTrain	TokenNameIdentifier	 toy Bayes Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"bayesExtreme"	TokenNameStringLiteral	bayesExtreme
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
toyBayesExtremeTest	TokenNameIdentifier	 toy Bayes Extreme Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
toyBayesExtremeTrain	TokenNameIdentifier	 toy Bayes Extreme Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"bayesUnlabeled"	TokenNameStringLiteral	bayesUnlabeled
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
toyBayesExtremeTest	TokenNameIdentifier	 toy Bayes Extreme Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
toyBayesExtremeUnlabeledTrain	TokenNameIdentifier	 toy Bayes Extreme Unlabeled Train
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"num"	TokenNameStringLiteral	num
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNumericData	TokenNameIdentifier	 make Numeric Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeNumericData	TokenNameIdentifier	 make Numeric Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
999	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"logistic"	TokenNameStringLiteral	logistic
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeLogisticRegressionData	TokenNameIdentifier	 make Logistic Regression Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeLogisticRegressionData	TokenNameIdentifier	 make Logistic Regression Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
999	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"bigLogistic"	TokenNameStringLiteral	bigLogistic
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeLogisticRegressionData	TokenNameIdentifier	 make Logistic Regression Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeLogisticRegressionData	TokenNameIdentifier	 make Logistic Regression Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
999	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"sparseNum"	TokenNameStringLiteral	sparseNum
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeSparseNumericData	TokenNameIdentifier	 make Sparse Numeric Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeSparseNumericData	TokenNameIdentifier	 make Sparse Numeric Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
999	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"toy3"	TokenNameStringLiteral	toy3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeToy3ClassData	TokenNameIdentifier	 make Toy3 Class Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
666	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeToy3ClassData	TokenNameIdentifier	 make Toy3 Class Data
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
999	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"toySeq"	TokenNameStringLiteral	toySeq
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTest	TokenNameIdentifier	 is Test
)	TokenNameRPAREN	
return	TokenNamereturn	
makeToySequenceTestData	TokenNameIdentifier	 make Toy Sequence Test Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
makeToySequenceData	TokenNameIdentifier	 make Toy Sequence Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"illegal dataset name '"	TokenNameStringLiteral	illegal dataset name '
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
Dataset	TokenNameIdentifier	 Dataset
train	TokenNameIdentifier	 train
=	TokenNameEQUAL	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Train dataset is: "	TokenNameStringLiteral	Train dataset is: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Test dataset is:"	TokenNameStringLiteral	Test dataset is:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
)	TokenNameRPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
"active"	TokenNameStringLiteral	active
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassifierTeacher	TokenNameIdentifier	 Classifier Teacher
teacher	TokenNameIdentifier	 teacher
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
teacher	TokenNameIdentifier	 teacher
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Classifier: "	TokenNameStringLiteral	Classifier: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
traceClassifier	TokenNameIdentifier	 trace Classifier
(	TokenNameLPAREN	
"Train"	TokenNameStringLiteral	Train
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
traceClassifier	TokenNameIdentifier	 trace Classifier
(	TokenNameLPAREN	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
Visible	TokenNameIdentifier	 Visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Visible	TokenNameIdentifier	 Visible
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: [toy|num] edu.cmu.minorthird.classify.SomeLearner [active]"	TokenNameStringLiteral	usage: [toy|num] edu.cmu.minorthird.classify.SomeLearner [active]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
void	TokenNamevoid	
traceClassifier	TokenNameIdentifier	 trace Classifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
datasetName	TokenNameIdentifier	 dataset Name
,	TokenNameCOMMA	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
Dataset	TokenNameIdentifier	 Dataset
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Performance on dataset "	TokenNameStringLiteral	Performance on dataset 
+	TokenNamePLUS	
datasetName	TokenNameIdentifier	 dataset Name
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
predicted	TokenNameIdentifier	 predicted
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
posWeight	TokenNameIdentifier	 pos Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
predicted	TokenNameIdentifier	 predicted
*	TokenNameMULTIPLY	
actual	TokenNameIdentifier	 actual
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
"Y"	TokenNameStringLiteral	Y
:	TokenNameCOLON	
"N"	TokenNameStringLiteral	N
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
+	TokenNamePLUS	
" pred="	TokenNameStringLiteral	 pred=
+	TokenNamePLUS	
predicted	TokenNameIdentifier	 predicted
+	TokenNamePLUS	
" actual="	TokenNameStringLiteral	 actual=
+	TokenNamePLUS	
actual	TokenNameIdentifier	 actual
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
predicted	TokenNameIdentifier	 predicted
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
predicted	TokenNameIdentifier	 predicted
.	TokenNameDOT	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"Y"	TokenNameStringLiteral	Y
:	TokenNameCOLON	
"N"	TokenNameStringLiteral	N
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
+	TokenNamePLUS	
" pred="	TokenNameStringLiteral	 pred=
+	TokenNamePLUS	
predicted	TokenNameIdentifier	 predicted
+	TokenNamePLUS	
" actual="	TokenNameStringLiteral	 actual=
+	TokenNamePLUS	
actual	TokenNameIdentifier	 actual
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
