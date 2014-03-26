package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
/** * A lightweight command-line processing tool. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A lightweight command-line processing tool. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
implements	TokenNameimplements	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
helpConsumed	TokenNameIdentifier	 help Consumed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subprocessor	TokenNameIdentifier	 subprocessor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
(	TokenNameLPAREN	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subprocessor	TokenNameIdentifier	 subprocessor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subprocessor	TokenNameIdentifier	 subprocessor
=	TokenNameEQUAL	
subprocessor	TokenNameIdentifier	 subprocessor
;	TokenNameSEMICOLON	
helpConsumed	TokenNameIdentifier	 help Consumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldTerminate	TokenNameIdentifier	 should Terminate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
helpConsumed	TokenNameIdentifier	 help Consumed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// figure out how many args to skip 	TokenNameCOMMENT_LINE	figure out how many args to skip 
delta	TokenNameIdentifier	 delta
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delta	TokenNameIdentifier	 delta
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unknown arguments "	TokenNameStringLiteral	Unknown arguments 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" will be ignored"	TokenNameStringLiteral	 will be ignored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unknown argument "	TokenNameStringLiteral	Unknown argument 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" will be ignored"	TokenNameStringLiteral	 will be ignored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
somethingConsumed	TokenNameIdentifier	 something Consumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
somethingConsumed	TokenNameIdentifier	 something Consumed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"-help"	TokenNameStringLiteral	-help
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"--help"	TokenNameStringLiteral	--help
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
helpConsumed	TokenNameIdentifier	 help Consumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
help	TokenNameIdentifier	 help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"-config"	TokenNameStringLiteral	-config
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"--config"	TokenNameStringLiteral	--config
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
.	TokenNameDOT	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
"missing argument for -config"	TokenNameStringLiteral	missing argument for -config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
somethingConsumed	TokenNameIdentifier	 something Consumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
!	TokenNameNOT	
somethingConsumed	TokenNameIdentifier	 something Consumed
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subprocessor	TokenNameIdentifier	 subprocessor
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
subprocessor	TokenNameIdentifier	 subprocessor
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("arg "+pos+" subprocessor "+i+" result "+k); 	TokenNameCOMMENT_LINE	System.out.println("arg "+pos+" subprocessor "+i+" result "+k); 
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Subprocessor"	TokenNameStringLiteral	Subprocessor
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" consumed "	TokenNameStringLiteral	 consumed 
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
" args at pos="	TokenNameStringLiteral	 args at pos=
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
somethingConsumed	TokenNameIdentifier	 something Consumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorMessage	TokenNameIdentifier	 error Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
errorMessage	TokenNameIdentifier	 error Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
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
subprocessor	TokenNameIdentifier	 subprocessor
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Subprocessor"	TokenNameStringLiteral	Subprocessor
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" usage invoked"	TokenNameStringLiteral	 usage invoked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subprocessor	TokenNameIdentifier	 subprocessor
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
help	TokenNameIdentifier	 help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// static public void main(String[] args){ 	TokenNameCOMMENT_LINE	static public void main(String[] args){ 
// CommandLineProcessor cp1=new BasicCommandLineProcessor(){ 	TokenNameCOMMENT_LINE	CommandLineProcessor cp1=new BasicCommandLineProcessor(){ 
// 	TokenNameCOMMENT_LINE	 
// public void one(){ 	TokenNameCOMMENT_LINE	public void one(){ 
// System.out.println("one"); 	TokenNameCOMMENT_LINE	System.out.println("one"); 
// } 	TokenNameCOMMENT_LINE	} 
// }; 	TokenNameCOMMENT_LINE	}; 
// CommandLineProcessor cp2=new BasicCommandLineProcessor(){ 	TokenNameCOMMENT_LINE	CommandLineProcessor cp2=new BasicCommandLineProcessor(){ 
// 	TokenNameCOMMENT_LINE	 
// public void two(){ 	TokenNameCOMMENT_LINE	public void two(){ 
// System.out.println("two"); 	TokenNameCOMMENT_LINE	System.out.println("two"); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public void tree(){ 	TokenNameCOMMENT_LINE	public void tree(){ 
// System.out.println("three"); 	TokenNameCOMMENT_LINE	System.out.println("three"); 
// } 	TokenNameCOMMENT_LINE	} 
// }; 	TokenNameCOMMENT_LINE	}; 
// CommandLineProcessor jcp= 	TokenNameCOMMENT_LINE	CommandLineProcessor jcp= 
// new JointCommandLineProcessor(new CommandLineProcessor[]{cp1,cp2}); 	TokenNameCOMMENT_LINE	new JointCommandLineProcessor(new CommandLineProcessor[]{cp1,cp2}); 
// jcp.processArguments(args); 	TokenNameCOMMENT_LINE	jcp.processArguments(args); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
