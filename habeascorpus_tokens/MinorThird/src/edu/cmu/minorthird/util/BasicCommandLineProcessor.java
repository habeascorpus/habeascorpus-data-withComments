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
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
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
LineNumberReader	TokenNameIdentifier	 Line Number Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
HashSet	TokenNameIdentifier	 Hash Set
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
abstract	TokenNameabstract	
class	TokenNameclass	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
implements	TokenNameimplements	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
,	TokenNameCOMMA	
Saveable	TokenNameIdentifier	 Saveable
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
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cache args last processed for saving 	TokenNameCOMMENT_LINE	cache args last processed for saving 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
processedArgs	TokenNameIdentifier	 processed Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// cache values associated with args 	TokenNameCOMMENT_LINE	cache values associated with args 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
argValues	TokenNameIdentifier	 arg Values
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processedArgs	TokenNameIdentifier	 processed Args
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"illegal argument "	TokenNameStringLiteral	illegal argument 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
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
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Looking up method '"	TokenNameStringLiteral	Looking up method '
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"' in "	TokenNameStringLiteral	' in 
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Consuming '-"	TokenNameStringLiteral	Consuming '-
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"' in "	TokenNameStringLiteral	' in 
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
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
"Option: "	TokenNameStringLiteral	Option: 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//For when a label follows the argument 	TokenNameCOMMENT_LINE	For when a label follows the argument 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
ms	TokenNameIdentifier	 ms
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Consuming '-"	TokenNameStringLiteral	Consuming '-
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"' '"	TokenNameStringLiteral	' '
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"' in "	TokenNameStringLiteral	' in 
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
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
"Option: "	TokenNameStringLiteral	Option: 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ms	TokenNameIdentifier	 ms
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
consumeArguments	TokenNameIdentifier	 consume Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
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
"no argument found to option '-"	TokenNameStringLiteral	no argument found to option '-
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
iax	TokenNameIdentifier	 iax
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iax	TokenNameIdentifier	 iax
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
iax	TokenNameIdentifier	 iax
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
itx	TokenNameIdentifier	 itx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itx	TokenNameIdentifier	 itx
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error: "	TokenNameStringLiteral	error: 
+	TokenNamePLUS	
itx	TokenNameIdentifier	 itx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Implements the -config option. */	TokenNameCOMMENT_JAVADOC	 Implements the -config option. 
public	TokenNamepublic	
void	TokenNamevoid	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements the -config option for the given clp. This is static * so that JointCommandLineProcessor can use it also. */	TokenNameCOMMENT_JAVADOC	 Implements the -config option for the given clp. This is static so that JointCommandLineProcessor can use it also. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
config	TokenNameIdentifier	 config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fileOptions	TokenNameIdentifier	 file Options
=	TokenNameEQUAL	
loadOptionsInPropertiesFormat	TokenNameIdentifier	 load Options In Properties Format
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
fileOptions	TokenNameIdentifier	 file Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error opening "	TokenNameStringLiteral	error opening 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
/** Override this to print a meaningful usage error. * Default will list all commands other than 'usage', * 'help', 'getX', and 'setX'. */	TokenNameCOMMENT_JAVADOC	 Override this to print a meaningful usage error. Default will list all commands other than 'usage', 'help', 'getX', and 'setX'. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
genericMethods	TokenNameIdentifier	 generic Methods
=	TokenNameEQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopList	TokenNameIdentifier	 stop List
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopList	TokenNameIdentifier	 stop List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"usage"	TokenNameStringLiteral	usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopList	TokenNameIdentifier	 stop List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"help"	TokenNameStringLiteral	help
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
genericMethods	TokenNameIdentifier	 generic Methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
genericMethods	TokenNameIdentifier	 generic Methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopList	TokenNameIdentifier	 stop List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
genericMethods	TokenNameIdentifier	 generic Methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"usage for "	TokenNameStringLiteral	usage for 
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
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
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
stopList	TokenNameIdentifier	 stop List
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"get"	TokenNameStringLiteral	get
)	TokenNameRPAREN	
||	TokenNameOR_OR	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"set"	TokenNameStringLiteral	set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" [-"	TokenNameStringLiteral	 [-
+	TokenNamePLUS	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" [-"	TokenNameStringLiteral	 [-
+	TokenNamePLUS	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" foo]"	TokenNameStringLiteral	 foo]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override this to make --help do something other than call usage */	TokenNameCOMMENT_JAVADOC	 Override this to make --help do something other than call usage 
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
/** * A list of arguments from the command line, in order. * For instance, if the command line includes -foo bar, * then "foo" will appear on the propertyList. */	TokenNameCOMMENT_JAVADOC	 A list of arguments from the command line, in order. For instance, if the command line includes -foo bar, then "foo" will appear on the propertyList. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
propertyList	TokenNameIdentifier	 property List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argValues	TokenNameIdentifier	 arg Values
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
processedArgs	TokenNameIdentifier	 processed Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
processedArgs	TokenNameIdentifier	 processed Args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
processedArgs	TokenNameIdentifier	 processed Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
processedArgs	TokenNameIdentifier	 processed Args
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
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
processedArgs	TokenNameIdentifier	 processed Args
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argValues	TokenNameIdentifier	 arg Values
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value assigned to a property from the command line. * For instance, if the command line includes -foo bar, * then propertyValue("foo") will return "bar". * This can only be called after propertyList has been * called. */	TokenNameCOMMENT_JAVADOC	 The value assigned to a property from the command line. For instance, if the command line includes -foo bar, then propertyValue("foo") will return "bar". This can only be called after propertyList has been called. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
propertyValue	TokenNameIdentifier	 property Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
argValues	TokenNameIdentifier	 arg Values
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// implements Saveable 	TokenNameCOMMENT_LINE	implements Saveable 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONFIG_FORMAT_NAME	TokenNameIdentifier	 CONFIG  FORMAT  NAME
=	TokenNameEQUAL	
"Configuration file"	TokenNameStringLiteral	Configuration file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONFIG_FORMAT_EXT	TokenNameIdentifier	 CONFIG  FORMAT  EXT
=	TokenNameEQUAL	
".config"	TokenNameStringLiteral	.config
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFormatNames	TokenNameIdentifier	 get Format Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CONFIG_FORMAT_NAME	TokenNameIdentifier	 CONFIG  FORMAT  NAME
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtensionFor	TokenNameIdentifier	 get Extension For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CONFIG_FORMAT_EXT	TokenNameIdentifier	 CONFIG  FORMAT  EXT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
saveAs	TokenNameIdentifier	 save As
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CONFIG_FORMAT_NAME	TokenNameIdentifier	 CONFIG  FORMAT  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"illegal format "	TokenNameStringLiteral	illegal format 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
propertyList	TokenNameIdentifier	 property List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
propertyValue	TokenNameIdentifier	 property Value
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Properties props = new Properties(); 	TokenNameCOMMENT_LINE	Properties props = new Properties(); 
//props.store(new FileOutputStream(file), "auto-saved configuration file"); 	TokenNameCOMMENT_LINE	props.store(new FileOutputStream(file), "auto-saved configuration file"); 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
restore	TokenNameIdentifier	 restore
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Can't restore a command line processor"	TokenNameStringLiteral	Can't restore a command line processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Test and/or example code. 	TokenNameCOMMENT_LINE	* Test and/or example code. 
// * For sample output, invoke this with arguments -scoff you -laff -family -mom gerbil -taunt 	TokenNameCOMMENT_LINE	* For sample output, invoke this with arguments -scoff you -laff -family -mom gerbil -taunt 
// */ 	TokenNameCOMMENT_LINE	*/ 
// static public void main(String[] args){ 	TokenNameCOMMENT_LINE	static public void main(String[] args){ 
// CommandLineProcessor p=new BasicCommandLineProcessor(){ 	TokenNameCOMMENT_LINE	CommandLineProcessor p=new BasicCommandLineProcessor(){ 
// 	TokenNameCOMMENT_LINE	 
// String mother="hamster"; 	TokenNameCOMMENT_LINE	String mother="hamster"; 
// 	TokenNameCOMMENT_LINE	 
// String father="elderberries"; 	TokenNameCOMMENT_LINE	String father="elderberries"; 
// 	TokenNameCOMMENT_LINE	 
// String laffter="bwa ha ha ha ha ha!"; 	TokenNameCOMMENT_LINE	String laffter="bwa ha ha ha ha ha!"; 
// 	TokenNameCOMMENT_LINE	 
// public void laff(){ 	TokenNameCOMMENT_LINE	public void laff(){ 
// System.out.println("bwa ha ha ha ha ha!"); 	TokenNameCOMMENT_LINE	System.out.println("bwa ha ha ha ha ha!"); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public void scoff(String atWhat){ 	TokenNameCOMMENT_LINE	public void scoff(String atWhat){ 
// System.out.println("I scoff derisively at "+atWhat+"!"); 	TokenNameCOMMENT_LINE	System.out.println("I scoff derisively at "+atWhat+"!"); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// // test that usage doesn't show getters/setters 	TokenNameCOMMENT_LINE	// test that usage doesn't show getters/setters 
// public String getLaff(){ 	TokenNameCOMMENT_LINE	public String getLaff(){ 
// return laffter; 	TokenNameCOMMENT_LINE	return laffter; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public void setLaff(String s){ 	TokenNameCOMMENT_LINE	public void setLaff(String s){ 
// laffter=s; 	TokenNameCOMMENT_LINE	laffter=s; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public CommandLineProcessor family(){ 	TokenNameCOMMENT_LINE	public CommandLineProcessor family(){ 
// return new BasicCommandLineProcessor(){ 	TokenNameCOMMENT_LINE	return new BasicCommandLineProcessor(){ 
// 	TokenNameCOMMENT_LINE	 
// public void mom(String s){ 	TokenNameCOMMENT_LINE	public void mom(String s){ 
// mother=s; 	TokenNameCOMMENT_LINE	mother=s; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public void dad(String s){ 	TokenNameCOMMENT_LINE	public void dad(String s){ 
// father=s; 	TokenNameCOMMENT_LINE	father=s; 
// } 	TokenNameCOMMENT_LINE	} 
// }; 	TokenNameCOMMENT_LINE	}; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public void taunt(){ 	TokenNameCOMMENT_LINE	public void taunt(){ 
// System.out.println("Your mother was a "+mother+ 	TokenNameCOMMENT_LINE	System.out.println("Your mother was a "+mother+ 
// " and your father smelled of "+father+"!!!"); 	TokenNameCOMMENT_LINE	" and your father smelled of "+father+"!!!"); 
// } 	TokenNameCOMMENT_LINE	} 
// //public void usage() { System.out.println("usage: [-laff] [-scoff foo]"); } 	TokenNameCOMMENT_LINE	//public void usage() { System.out.println("usage: [-laff] [-scoff foo]"); } 
// }; 	TokenNameCOMMENT_LINE	}; 
// p.processArguments(args); 	TokenNameCOMMENT_LINE	p.processArguments(args); 
// } 	TokenNameCOMMENT_LINE	} 
protected	TokenNameprotected	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
tryToGetCLP	TokenNameIdentifier	 try To Get CLP
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
.	TokenNameDOT	
Configurable	TokenNameIdentifier	 Configurable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
.	TokenNameDOT	
Configurable	TokenNameIdentifier	 Configurable
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" can't be configured from the command line"	TokenNameStringLiteral	 can't be configured from the command line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
loadOptionsInPropertiesFormat	TokenNameIdentifier	 load Options In Properties Format
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eqPos	TokenNameIdentifier	 eq Pos
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eqPos	TokenNameIdentifier	 eq Pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
inputError	TokenNameIdentifier	 input Error
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
"no equal-sign (=) in line"	TokenNameStringLiteral	no equal-sign (=) in line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
eqPos	TokenNameIdentifier	 eq Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
eqPos	TokenNameIdentifier	 eq Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
void	TokenNamevoid	
inputError	TokenNameIdentifier	 input Error
(	TokenNameLPAREN	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
", line "	TokenNameStringLiteral	, line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
" - incorrect line is '"	TokenNameStringLiteral	 - incorrect line is '
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
