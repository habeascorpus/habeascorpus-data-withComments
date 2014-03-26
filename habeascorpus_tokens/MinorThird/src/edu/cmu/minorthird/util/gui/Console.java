package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
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
PipedInputStream	TokenNameIdentifier	 Piped Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JButton	TokenNameIdentifier	 J Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTextArea	TokenNameIdentifier	 J Text Area
;	TokenNameSEMICOLON	
/** Implements the console window for the gui * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Implements the console window for the gui * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
Console	TokenNameIdentifier	 Console
{	TokenNameLBRACE	
private	TokenNameprivate	
PipedInputStream	TokenNameIdentifier	 Piped Input Stream
piOut	TokenNameIdentifier	 pi Out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
poOut	TokenNameIdentifier	 po Out
;	TokenNameSEMICOLON	
// private final PipedInputStream piErr = new PipedInputStream(); 	TokenNameCOMMENT_LINE	private final PipedInputStream piErr = new PipedInputStream(); 
private	TokenNameprivate	
JTextArea	TokenNameIdentifier	 J Text Area
errorArea	TokenNameIdentifier	 error Area
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
scroller	TokenNameIdentifier	 scroller
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
mainThread	TokenNameIdentifier	 main Thread
,	TokenNameCOMMA	
readerThread	TokenNameIdentifier	 reader Thread
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
doMainRunning	TokenNameIdentifier	 do Main Running
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
oldSystemOut	TokenNameIdentifier	 old System Out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JButton	TokenNameIdentifier	 J Button
viewButton	TokenNameIdentifier	 view Button
;	TokenNameSEMICOLON	
// private Object ui; 	TokenNameCOMMENT_LINE	private Object ui; 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
// private boolean labels; 	TokenNameCOMMENT_LINE	private boolean labels; 
public	TokenNamepublic	
Console	TokenNameIdentifier	 Console
(	TokenNameLPAREN	
Console	TokenNameIdentifier	 Console
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorArea	TokenNameIdentifier	 error Area
=	TokenNameEQUAL	
new	TokenNamenew	
JTextArea	TokenNameIdentifier	 J Text Area
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
"monospaced"	TokenNameStringLiteral	monospaced
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
PLAIN	TokenNameIdentifier	 PLAIN
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scroller	TokenNameIdentifier	 scroller
=	TokenNameEQUAL	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
errorArea	TokenNameIdentifier	 error Area
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor initializes the task, whether labels are present, and the viewButton */	TokenNameCOMMENT_JAVADOC	 Constructor initializes the task, whether labels are present, and the viewButton 
public	TokenNamepublic	
Console	TokenNameIdentifier	 Console
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
boolean	TokenNameboolean	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
JButton	TokenNameIdentifier	 J Button
vb	TokenNameIdentifier	 vb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorArea	TokenNameIdentifier	 error Area
=	TokenNameEQUAL	
new	TokenNamenew	
JTextArea	TokenNameIdentifier	 J Text Area
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
"monospaced"	TokenNameStringLiteral	monospaced
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
PLAIN	TokenNameIdentifier	 PLAIN
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scroller	TokenNameIdentifier	 scroller
=	TokenNameEQUAL	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
errorArea	TokenNameIdentifier	 error Area
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
viewButton	TokenNameIdentifier	 view Button
=	TokenNameEQUAL	
vb	TokenNameIdentifier	 vb
;	TokenNameSEMICOLON	
// this.labels=l; 	TokenNameCOMMENT_LINE	this.labels=l; 
}	TokenNameRBRACE	
/** The outermost component of the console. */	TokenNameCOMMENT_JAVADOC	 The outermost component of the console. 
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
getMainComponent	TokenNameIdentifier	 get Main Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scroller	TokenNameIdentifier	 scroller
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Start the task for the console. */	TokenNameCOMMENT_JAVADOC	 Start the task for the console. 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initThreads	TokenNameIdentifier	 init Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
oldSystemOut	TokenNameIdentifier	 old System Out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
piOut	TokenNameIdentifier	 pi Out
=	TokenNameEQUAL	
new	TokenNamenew	
PipedInputStream	TokenNameIdentifier	 Piped Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
poOut	TokenNameIdentifier	 po Out
=	TokenNameEQUAL	
new	TokenNamenew	
PipedOutputStream	TokenNameIdentifier	 Piped Output Stream
(	TokenNameLPAREN	
piOut	TokenNameIdentifier	 pi Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
poOut	TokenNameIdentifier	 po Out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
io	TokenNameIdentifier	 io
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Couldn't redirect output "	TokenNameStringLiteral	Couldn't redirect output 
+	TokenNamePLUS	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"SE error"	TokenNameStringLiteral	SE error
+	TokenNamePLUS	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mainThread	TokenNameIdentifier	 main Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Append a string to the console window. */	TokenNameCOMMENT_JAVADOC	 Append a string to the console window. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scrollDown	TokenNameIdentifier	 scroll Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clear the console window. */	TokenNameCOMMENT_JAVADOC	 Clear the console window. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Re-initialize the threads for the console */	TokenNameCOMMENT_JAVADOC	 Re-initialize the threads for the console 
private	TokenNameprivate	
void	TokenNamevoid	
initThreads	TokenNameIdentifier	 init Threads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// mainthread - runs the main task with doMain 	TokenNameCOMMENT_LINE	mainthread - runs the main task with doMain 
mainThread	TokenNameIdentifier	 main Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
Console	TokenNameIdentifier	 Console
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewButton	TokenNameIdentifier	 view Button
.	TokenNameDOT	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Console	TokenNameIdentifier	 Console
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" You need to specify the labeled data you're using! "	TokenNameStringLiteral	 You need to specify the labeled data you're using! 
+	TokenNamePLUS	
"Modify the 'labels' parameters under base parameters section "	TokenNameStringLiteral	Modify the 'labels' parameters under base parameters section 
+	TokenNamePLUS	
"of the parameter modification window. "	TokenNameStringLiteral	of the parameter modification window. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doMainRunning	TokenNameIdentifier	 do Main Running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
readerThread	TokenNameIdentifier	 reader Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Console	TokenNameIdentifier	 Console
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
elapsedTime	TokenNameIdentifier	 elapsed Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Total time for task: "	TokenNameStringLiteral	 Total time for task: 
+	TokenNamePLUS	
elapsedTime	TokenNameIdentifier	 elapsed Time
+	TokenNamePLUS	
" sec"	TokenNameStringLiteral	 sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewButton	TokenNameIdentifier	 view Button
.	TokenNameDOT	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Console	TokenNameIdentifier	 Console
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
getMainResult	TokenNameIdentifier	 get Main Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doMainRunning	TokenNameIdentifier	 do Main Running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// signal reader to stop 	TokenNameCOMMENT_LINE	signal reader to stop 
try	TokenNametry	
{	TokenNameLBRACE	
readerThread	TokenNameIdentifier	 reader Thread
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for it to end 	TokenNameCOMMENT_LINE	wait for it to end 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reader interrupted?"	TokenNameStringLiteral	reader interrupted?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scrollDown	TokenNameIdentifier	 scroll Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Error: Task is not an instance of Console.Task "	TokenNameStringLiteral	Error: Task is not an instance of Console.Task 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end else 	TokenNameCOMMENT_LINE	end else 
}	TokenNameRBRACE	
//end run 	TokenNameCOMMENT_LINE	end run 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// end thread 	TokenNameCOMMENT_LINE	end thread 
// this thread traps output from mainThread and sticks it in 	TokenNameCOMMENT_LINE	this thread traps output from mainThread and sticks it in 
// console window 	TokenNameCOMMENT_LINE	console window 
readerThread	TokenNameIdentifier	 reader Thread
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2048	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
doMainRunning	TokenNameIdentifier	 do Main Running
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for more output 	TokenNameCOMMENT_LINE	look for more output 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
piOut	TokenNameIdentifier	 pi Out
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scrollDown	TokenNameIdentifier	 scroll Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// let someone else in to execute 	TokenNameCOMMENT_LINE	let someone else in to execute 
}	TokenNameRBRACE	
// clean up any output we might have missed 	TokenNameCOMMENT_LINE	clean up any output we might have missed 
// after exiting 	TokenNameCOMMENT_LINE	after exiting 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
piOut	TokenNameIdentifier	 pi Out
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scrollDown	TokenNameIdentifier	 scroll Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
closePipes	TokenNameIdentifier	 close Pipes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorArea	TokenNameIdentifier	 error Area
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//end reader Thread 	TokenNameCOMMENT_LINE	end reader Thread 
}	TokenNameRBRACE	
// constructor 	TokenNameCOMMENT_LINE	constructor 
// imperfect method to scroll to bottom 	TokenNameCOMMENT_LINE	imperfect method to scroll to bottom 
private	TokenNameprivate	
void	TokenNamevoid	
scrollDown	TokenNameIdentifier	 scroll Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
bar	TokenNameIdentifier	 bar
=	TokenNameEQUAL	
scroller	TokenNameIdentifier	 scroller
.	TokenNameDOT	
getVerticalScrollBar	TokenNameIdentifier	 get Vertical Scroll Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getMaximum	TokenNameIdentifier	 get Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error scrolling: "	TokenNameStringLiteral	error scrolling: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
closePipes	TokenNameIdentifier	 close Pipes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
poOut	TokenNameIdentifier	 po Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
piOut	TokenNameIdentifier	 pi Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
oldSystemOut	TokenNameIdentifier	 old System Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Interface for objects that can be configured with command-line arguments. * Configuration for x is done by calling <code>x.doMain().</code> */	TokenNameCOMMENT_JAVADOC	 Interface for objects that can be configured with command-line arguments. Configuration for x is done by calling <code>x.doMain().</code> 
public	TokenNamepublic	
interface	TokenNameinterface	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMainResult	TokenNameIdentifier	 get Main Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
