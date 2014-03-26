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
sequential	TokenNameIdentifier	 sequential
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
Explanation	TokenNameIdentifier	 Explanation
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
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
/** * A conditional markov model classifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A conditional markov model classifier. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
BeamSearcher	TokenNameIdentifier	 Beam Searcher
implements	TokenNameimplements	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
boolean	TokenNameboolean	
OLD_VERSION	TokenNameIdentifier	 OLD  VERSION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
BeamSearcher	TokenNameIdentifier	 Beam Searcher
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// parameters of beam searcher 	TokenNameCOMMENT_LINE	parameters of beam searcher 
private	TokenNameprivate	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
beamSize	TokenNameIdentifier	 beam Size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// caches current beam search 	TokenNameCOMMENT_LINE	caches current beam search 
transient	TokenNametransient	
private	TokenNameprivate	
Beam	TokenNameIdentifier	 Beam
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
new	TokenNamenew	
Beam	TokenNameIdentifier	 Beam
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caching	TokenNameIdentifier	 caching
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
private	TokenNameprivate	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
instances	TokenNameIdentifier	 instances
;	TokenNameSEMICOLON	
transient	TokenNametransient	
private	TokenNameprivate	
int	TokenNameint	
numInstances	TokenNameIdentifier	 num Instances
;	TokenNameSEMICOLON	
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BeamSearcher	TokenNameIdentifier	 Beam Searcher
(	TokenNameLPAREN	
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
historySize	TokenNameIdentifier	 history Size
=	TokenNameEQUAL	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
validClassNames	TokenNameIdentifier	 valid Class Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(Arrays.toString(possibleClassLabels)); 	TokenNameCOMMENT_LINE	System.out.println(Arrays.toString(possibleClassLabels)); 
if	TokenNameif	
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"possibleClassLabels.length="	TokenNameStringLiteral	possibleClassLabels.length=
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" <2 ???"	TokenNameStringLiteral	 <2 ???
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxBeamSize	TokenNameIdentifier	 get Max Beam Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beamSize	TokenNameIdentifier	 beam Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxBeamSize	TokenNameIdentifier	 set Max Beam Size
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beamSize	TokenNameIdentifier	 beam Size
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCaching	TokenNameIdentifier	 is Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
caching	TokenNameIdentifier	 caching
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCaching	TokenNameIdentifier	 set Caching
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
caching	TokenNameIdentifier	 caching
=	TokenNameEQUAL	
caching	TokenNameIdentifier	 caching
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the best label sequence, as determined by the beam search */	TokenNameCOMMENT_JAVADOC	 Get the best label sequence, as determined by the beam search 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bestLabelSequence	TokenNameIdentifier	 best Label Sequence
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
instances	TokenNameIdentifier	 instances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
instances	TokenNameIdentifier	 instances
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
viterbi	TokenNameIdentifier	 viterbi
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
historySize	TokenNameIdentifier	 history Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
.	TokenNameDOT	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Do a beam search. */	TokenNameCOMMENT_JAVADOC	 Do a beam search. 
public	TokenNamepublic	
void	TokenNamevoid	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"searching over a "	TokenNameStringLiteral	searching over a 
+	TokenNamePLUS	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
"-instance sequence"	TokenNameStringLiteral	-instance sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"beamSize="	TokenNameStringLiteral	beamSize=
+	TokenNamePLUS	
beamSize	TokenNameIdentifier	 beam Size
+	TokenNamePLUS	
" classes="	TokenNameStringLiteral	 classes=
+	TokenNamePLUS	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"possibleClassLabels.length="	TokenNameStringLiteral	possibleClassLabels.length=
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" <2 ???"	TokenNameStringLiteral	 <2 ???
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
historySize	TokenNameIdentifier	 history Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
new	TokenNamenew	
Beam	TokenNameIdentifier	 Beam
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BeamEntry	TokenNameIdentifier	 Beam Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"predicting class for instance["	TokenNameStringLiteral	predicting class for instance[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
instances	TokenNameIdentifier	 instances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Beam	TokenNameIdentifier	 Beam
nextBeam	TokenNameIdentifier	 next Beam
=	TokenNameEQUAL	
new	TokenNamenew	
Beam	TokenNameIdentifier	 Beam
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
beamSize	TokenNameIdentifier	 beam Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"beam entry["	TokenNameStringLiteral	beam entry[
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// classify example based on this history 	TokenNameCOMMENT_LINE	classify example based on this history 
Instance	TokenNameIdentifier	 Instance
beamInstance	TokenNameIdentifier	 beam Instance
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
instances	TokenNameIdentifier	 instances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
beamInstance	TokenNameIdentifier	 beam Instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"class for "	TokenNameStringLiteral	class for 
+	TokenNamePLUS	
beamInstance	TokenNameIdentifier	 beam Instance
+	TokenNamePLUS	
" => "	TokenNameStringLiteral	 => 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add all possible classifications to the beam for the next iteration 	TokenNameCOMMENT_LINE	add all possible classifications to the beam for the next iteration 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
<	TokenNameLESS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextBeam	TokenNameIdentifier	 next Beam
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"extending beam with "	TokenNameStringLiteral	extending beam with 
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" score: "	TokenNameStringLiteral	 score: 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextBeam	TokenNameIdentifier	 next Beam
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
nextBeam	TokenNameIdentifier	 next Beam
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numInstances	TokenNameIdentifier	 num Instances
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do a beam search, constraining the bestLabel for each classification to * match the non-null values in the template. * *<p> * This would be better folded in with the one-arg version of doSearch, but is * kept separate for backward compatibility. */	TokenNameCOMMENT_JAVADOC	 Do a beam search, constraining the bestLabel for each classification to match the non-null values in the template. *<p> This would be better folded in with the one-arg version of doSearch, but is kept separate for backward compatibility. 
public	TokenNamepublic	
void	TokenNamevoid	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"searching over a "	TokenNameStringLiteral	searching over a 
+	TokenNamePLUS	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
"-instance sequence"	TokenNameStringLiteral	-instance sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"beamSize="	TokenNameStringLiteral	beamSize=
+	TokenNamePLUS	
beamSize	TokenNameIdentifier	 beam Size
+	TokenNamePLUS	
" classes="	TokenNameStringLiteral	 classes=
+	TokenNamePLUS	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"possibleClassLabels.length="	TokenNameStringLiteral	possibleClassLabels.length=
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" <2 ???"	TokenNameStringLiteral	 <2 ???
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
historySize	TokenNameIdentifier	 history Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
new	TokenNamenew	
Beam	TokenNameIdentifier	 Beam
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BeamEntry	TokenNameIdentifier	 Beam Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"predicting class for instance["	TokenNameStringLiteral	predicting class for instance[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
instances	TokenNameIdentifier	 instances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Beam	TokenNameIdentifier	 Beam
nextBeam	TokenNameIdentifier	 next Beam
=	TokenNameEQUAL	
new	TokenNamenew	
Beam	TokenNameIdentifier	 Beam
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
beamSize	TokenNameIdentifier	 beam Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"beam entry["	TokenNameStringLiteral	beam entry[
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// classify example based on this history 	TokenNameCOMMENT_LINE	classify example based on this history 
Instance	TokenNameIdentifier	 Instance
beamInstance	TokenNameIdentifier	 beam Instance
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
instances	TokenNameIdentifier	 instances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
beamInstance	TokenNameIdentifier	 beam Instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"class for "	TokenNameStringLiteral	class for 
+	TokenNamePLUS	
beamInstance	TokenNameIdentifier	 beam Instance
+	TokenNamePLUS	
" => "	TokenNameStringLiteral	 => 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add all possible classifications to the beam for the next iteration 	TokenNameCOMMENT_LINE	add all possible classifications to the beam for the next iteration 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
<	TokenNameLESS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
template	TokenNameIdentifier	 template
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
template	TokenNameIdentifier	 template
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
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextBeam	TokenNameIdentifier	 next Beam
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"extending beam with "	TokenNameStringLiteral	extending beam with 
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" score: "	TokenNameStringLiteral	 score: 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"discarding "	TokenNameStringLiteral	discarding 
+	TokenNamePLUS	
possibleClassLabels	TokenNameIdentifier	 possible Class Labels
[	TokenNameLBRACKET	
el	TokenNameIdentifier	 el
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" as template mismatch"	TokenNameStringLiteral	 as template mismatch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextBeam	TokenNameIdentifier	 next Beam
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
nextBeam	TokenNameIdentifier	 next Beam
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numInstances	TokenNameIdentifier	 num Instances
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return the number of solutions found in the beam. */	TokenNameCOMMENT_JAVADOC	 Return the number of solutions found in the beam. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfSolutionsFound	TokenNameIdentifier	 get Number Of Solutions Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the k-th best result of the previous beam search. To get the best, * use viterbi(0), the second best is viterbi(1), etc. */	TokenNameCOMMENT_JAVADOC	 Retrieve the k-th best result of the previous beam search. To get the best, use viterbi(0), the second best is viterbi(1), etc. 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
numInstances	TokenNameIdentifier	 num Instances
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
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
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
toClassLabel	TokenNameIdentifier	 to Class Label
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
targetEntry	TokenNameIdentifier	 target Entry
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
BeamEntry	TokenNameIdentifier	 Beam Entry
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
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Classification for instance "	TokenNameStringLiteral	Classification for instance 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is "	TokenNameStringLiteral	 is 
+	TokenNamePLUS	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" (score "	TokenNameStringLiteral	 (score 
+	TokenNamePLUS	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"): "	TokenNameStringLiteral	): 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" Running total score: "	TokenNameStringLiteral	 Running total score: 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
targetEntry	TokenNameIdentifier	 target Entry
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
BeamEntry	TokenNameIdentifier	 Beam Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"BeamSearcher Classification"	TokenNameStringLiteral	BeamSearcher Classification
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
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
seqEx	TokenNameIdentifier	 seq Ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"Classification for instance "	TokenNameStringLiteral	Classification for instance 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is "	TokenNameStringLiteral	 is 
+	TokenNamePLUS	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" (score "	TokenNameStringLiteral	 (score 
+	TokenNamePLUS	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"): "	TokenNameStringLiteral	): 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
explan	TokenNameIdentifier	 explan
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
explan	TokenNameIdentifier	 explan
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
explan	TokenNameIdentifier	 explan
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seqEx	TokenNameIdentifier	 seq Ex
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
explan	TokenNameIdentifier	 explan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
targetEntry	TokenNameIdentifier	 target Entry
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
" Running total score: "	TokenNameStringLiteral	 Running total score: 
+	TokenNamePLUS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seqEx	TokenNameIdentifier	 seq Ex
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
seqEx	TokenNameIdentifier	 seq Ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The search space. */	TokenNameCOMMENT_JAVADOC	 The search space. 
private	TokenNameprivate	
class	TokenNameclass	
Beam	TokenNameIdentifier	 Beam
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
BeamEntry	TokenNameIdentifier	 Beam Entry
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
BeamEntry	TokenNameIdentifier	 Beam Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maps last historySize labels -> 	TokenNameCOMMENT_LINE	maps last historySize labels -> 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
BeamKey	TokenNameIdentifier	 Beam Key
,	TokenNameCOMMA	
BeamEntry	TokenNameIdentifier	 Beam Entry
>	TokenNameGREATER	
keyMap	TokenNameIdentifier	 key Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
BeamKey	TokenNameIdentifier	 Beam Key
,	TokenNameCOMMA	
BeamEntry	TokenNameIdentifier	 Beam Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BeamEntry	TokenNameIdentifier	 Beam Entry
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BeamKey	TokenNameIdentifier	 Beam Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
BeamKey	TokenNameIdentifier	 Beam Key
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BeamEntry	TokenNameIdentifier	 Beam Entry
existingEntry	TokenNameIdentifier	 existing Entry
=	TokenNameEQUAL	
keyMap	TokenNameIdentifier	 key Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
existingEntry	TokenNameIdentifier	 existing Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
existingEntry	TokenNameIdentifier	 existing Entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
existingEntry	TokenNameIdentifier	 existing Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
existingEntry	TokenNameIdentifier	 existing Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyMap	TokenNameIdentifier	 key Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A single entry in the beam */	TokenNameCOMMENT_JAVADOC	 A single entry in the beam 
private	TokenNameprivate	
class	TokenNameclass	
BeamEntry	TokenNameIdentifier	 Beam Entry
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
BeamEntry	TokenNameIdentifier	 Beam Entry
>	TokenNameGREATER	
{	TokenNameLBRACE	
/* Labels assigned so far. */	TokenNameCOMMENT_BLOCK	 Labels assigned so far. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/* Score associated with each label assigned so far. */	TokenNameCOMMENT_BLOCK	 Score associated with each label assigned so far. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Total score of labels so far */	TokenNameCOMMENT_JAVADOC	 Total score of labels so far 
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** Implement Comparable */	TokenNameCOMMENT_JAVADOC	 Implement Comparable 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BeamEntry	TokenNameIdentifier	 Beam Entry
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MathUtil	TokenNameIdentifier	 Math Util
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
score	TokenNameIdentifier	 score
-	TokenNameMINUS	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert i-th label stored to a class label */	TokenNameCOMMENT_JAVADOC	 Convert i-th label stored to a class label 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
toClassLabel	TokenNameIdentifier	 to Class Label
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Extend the beam with one additional label */	TokenNameCOMMENT_JAVADOC	 Extend the beam with one additional label 
public	TokenNamepublic	
BeamEntry	TokenNameIdentifier	 Beam Entry
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
labelScore	TokenNameIdentifier	 label Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BeamEntry	TokenNameIdentifier	 Beam Entry
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BeamEntry	TokenNameIdentifier	 Beam Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
labelScore	TokenNameIdentifier	 label Score
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
labelScore	TokenNameIdentifier	 label Score
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
getBeamInstance	TokenNameIdentifier	 get Beam Instance
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
.	TokenNameDOT	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
"[entry: "	TokenNameStringLiteral	[entry: 
+	TokenNamePLUS	
labels	TokenNameIdentifier	 labels
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
scores	TokenNameIdentifier	 scores
+	TokenNamePLUS	
"; score:"	TokenNameStringLiteral	; score:
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Used to look for BeamEntry's that should be combined. BeamEntrys should be * combined in the beam (with the higher score being retained) if their * history is the same. */	TokenNameCOMMENT_JAVADOC	 Used to look for BeamEntry's that should be combined. BeamEntrys should be combined in the beam (with the higher score being retained) if their history is the same. 
private	TokenNameprivate	
class	TokenNameclass	
BeamKey	TokenNameIdentifier	 Beam Key
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyHistory	TokenNameIdentifier	 key History
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
historySize	TokenNameIdentifier	 history Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BeamKey	TokenNameIdentifier	 Beam Key
(	TokenNameLPAREN	
BeamEntry	TokenNameIdentifier	 Beam Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
keyHistory	TokenNameIdentifier	 key History
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
73643674	TokenNameIntegerLiteral	
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
keyHistory	TokenNameIdentifier	 key History
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
OLD_VERSION	TokenNameIdentifier	 OLD  VERSION
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
^	TokenNameXOR	
keyHistory	TokenNameIdentifier	 key History
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
^	TokenNameXOR	
keyHistory	TokenNameIdentifier	 key History
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
BeamKey	TokenNameIdentifier	 Beam Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
BeamKey	TokenNameIdentifier	 Beam Key
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BeamKey	TokenNameIdentifier	 Beam Key
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
keyHistory	TokenNameIdentifier	 key History
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
keyHistory	TokenNameIdentifier	 key History
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
keyHistory	TokenNameIdentifier	 key History
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
keyHistory	TokenNameIdentifier	 key History
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
keyHistory	TokenNameIdentifier	 key History
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
"[Key "	TokenNameStringLiteral	[Key 
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
keyHistory	TokenNameIdentifier	 key History
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
keyHistory	TokenNameIdentifier	 key History
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
path	TokenNameIdentifier	 path
+=	TokenNamePLUS_EQUAL	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
