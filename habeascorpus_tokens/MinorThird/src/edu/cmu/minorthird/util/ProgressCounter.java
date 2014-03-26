package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Indicates intermediate progress for a trainer, etc. * */	TokenNameCOMMENT_JAVADOC	 Indicates intermediate progress for a trainer, etc. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JProgressBar	TokenNameIdentifier	 J Progress Bar
;	TokenNameSEMICOLON	
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
ProgressCounter	TokenNameIdentifier	 Progress Counter
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
DecimalFormat	TokenNameIdentifier	 Decimal Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.00"	TokenNameStringLiteral	0.00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
JProgressBar	TokenNameIdentifier	 J Progress Bar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
graphicContext	TokenNameIdentifier	 graphic Context
=	TokenNameEQUAL	
new	TokenNamenew	
JProgressBar	TokenNameIdentifier	 J Progress Bar
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setGraphicContext	TokenNameIdentifier	 set Graphic Context
(	TokenNameLPAREN	
JProgressBar	TokenNameIdentifier	 J Progress Bar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphicContext	TokenNameIdentifier	 graphic Context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clearGraphicContext	TokenNameIdentifier	 clear Graphic Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphicContext	TokenNameIdentifier	 graphic Context
=	TokenNameEQUAL	
new	TokenNamenew	
JProgressBar	TokenNameIdentifier	 J Progress Bar
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// keep track of the global depth of progress counters 	TokenNameCOMMENT_LINE	keep track of the global depth of progress counters 
static	TokenNamestatic	
int	TokenNameint	
currentDepth	TokenNameIdentifier	 current Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIME_BTWN_OUTPUTS_IN_MS	TokenNameIdentifier	 TIME  BTWN  OUTPUTS  IN  MS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastOutputTime	TokenNameIdentifier	 last Output Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
stepsCompleted	TokenNameIdentifier	 steps Completed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JProgressBar	TokenNameIdentifier	 J Progress Bar
graphicCounter	TokenNameIdentifier	 graphic Counter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
step	TokenNameIdentifier	 step
,	TokenNameCOMMA	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stepsCompleted	TokenNameIdentifier	 steps Completed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numSteps	TokenNameIdentifier	 num Steps
=	TokenNameEQUAL	
numSteps	TokenNameIdentifier	 num Steps
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
currentDepth	TokenNameIdentifier	 current Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
lastOutputTime	TokenNameIdentifier	 last Output Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
<	TokenNameLESS	
graphicContext	TokenNameIdentifier	 graphic Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
graphicContext	TokenNameIdentifier	 graphic Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphicCounter	TokenNameIdentifier	 graphic Counter
=	TokenNameEQUAL	
graphicContext	TokenNameIdentifier	 graphic Context
[	TokenNameLBRACKET	
depth	TokenNameIdentifier	 depth
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSteps	TokenNameIdentifier	 num Steps
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setMaximum	TokenNameIdentifier	 set Maximum
(	TokenNameLPAREN	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setIndeterminate	TokenNameIdentifier	 set Indeterminate
(	TokenNameLPAREN	
numSteps	TokenNameIdentifier	 num Steps
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
numSteps	TokenNameIdentifier	 num Steps
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
task	TokenNameIdentifier	 task
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
numSteps	TokenNameIdentifier	 num Steps
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
step	TokenNameIdentifier	 step
+	TokenNamePLUS	
"s "	TokenNameStringLiteral	s 
)	TokenNameRPAREN	
:	TokenNameCOLON	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setStringPainted	TokenNameIdentifier	 set String Painted
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
graphicCounter	TokenNameIdentifier	 graphic Counter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
"step"	TokenNameStringLiteral	step
,	TokenNameCOMMA	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
step	TokenNameIdentifier	 step
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
"step"	TokenNameStringLiteral	step
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Record one step of progress on the task */	TokenNameCOMMENT_JAVADOC	 Record one step of progress on the task 
final	TokenNamefinal	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stepsCompleted	TokenNameIdentifier	 steps Completed
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
lastOutputTime	TokenNameIdentifier	 last Output Time
>	TokenNameGREATER	
TIME_BTWN_OUTPUTS_IN_MS	TokenNameIdentifier	 TIME  BTWN  OUTPUTS  IN  MS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
graphicCounter	TokenNameIdentifier	 graphic Counter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
graphicContext	TokenNameIdentifier	 graphic Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
stepsCompleted	TokenNameIdentifier	 steps Completed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// if (errorArea == null) { 	TokenNameCOMMENT_LINE	if (errorArea == null) { 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"| "	TokenNameStringLiteral	| 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSteps	TokenNameIdentifier	 num Steps
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Task "	TokenNameStringLiteral	Task 
+	TokenNamePLUS	
task	TokenNameIdentifier	 task
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
100.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
stepsCompleted	TokenNameIdentifier	 steps Completed
/	TokenNameDIVIDE	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
+	TokenNamePLUS	
"% ("	TokenNameStringLiteral	% (
+	TokenNamePLUS	
stepsCompleted	TokenNameIdentifier	 steps Completed
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
numSteps	TokenNameIdentifier	 num Steps
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
step	TokenNameIdentifier	 step
+	TokenNamePLUS	
"s) in "	TokenNameStringLiteral	s) in 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" sec"	TokenNameStringLiteral	 sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Task "	TokenNameStringLiteral	Task 
+	TokenNamePLUS	
task	TokenNameIdentifier	 task
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
stepsCompleted	TokenNameIdentifier	 steps Completed
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
step	TokenNameIdentifier	 step
+	TokenNamePLUS	
"(s) in "	TokenNameStringLiteral	(s) in 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" sec"	TokenNameStringLiteral	 sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastOutputTime	TokenNameIdentifier	 last Output Time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Record this task as completed. */	TokenNameCOMMENT_JAVADOC	 Record this task as completed. 
public	TokenNamepublic	
void	TokenNamevoid	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
graphicCounter	TokenNameIdentifier	 graphic Counter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
isIndeterminate	TokenNameIdentifier	 is Indeterminate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
graphicContext	TokenNameIdentifier	 graphic Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setIndeterminate	TokenNameIdentifier	 set Indeterminate
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setMaximum	TokenNameIdentifier	 set Maximum
(	TokenNameLPAREN	
stepsCompleted	TokenNameIdentifier	 steps Completed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
stepsCompleted	TokenNameIdentifier	 steps Completed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicCounter	TokenNameIdentifier	 graphic Counter
.	TokenNameDOT	
setStringPainted	TokenNameIdentifier	 set String Painted
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currentDepth	TokenNameIdentifier	 current Depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
