/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Compile.java 468647 2006-10-28 06:59:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Compile.java 468647 2006-10-28 06:59:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
cmdline	TokenNameIdentifier	 cmdline
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
cmdline	TokenNameIdentifier	 cmdline
.	TokenNameDOT	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
GetOpt	TokenNameIdentifier	 Get Opt
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
cmdline	TokenNameIdentifier	 cmdline
.	TokenNameDOT	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
GetOptsException	TokenNameIdentifier	 Get Opts Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
XSLTC	TokenNameIdentifier	 XSLTC
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ErrorMsg	TokenNameIdentifier	 Error Msg
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author G. Todd Miller * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author G. Todd Miller @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Compile	TokenNameIdentifier	 Compile
{	TokenNameLBRACE	
// Versioning numbers for the compiler -v option output 	TokenNameCOMMENT_LINE	Versioning numbers for the compiler -v option output 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
VERSION_MAJOR	TokenNameIdentifier	 VERSION  MAJOR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
VERSION_MINOR	TokenNameIdentifier	 VERSION  MINOR
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
VERSION_DELTA	TokenNameIdentifier	 VERSION  DELTA
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
vers	TokenNameIdentifier	 vers
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"XSLTC version "	TokenNameStringLiteral	XSLTC version 
+	TokenNamePLUS	
VERSION_MAJOR	TokenNameIdentifier	 VERSION  MAJOR
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
VERSION_MINOR	TokenNameIdentifier	 VERSION  MINOR
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
VERSION_DELTA	TokenNameIdentifier	 VERSION  DELTA
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
VERSION_DELTA	TokenNameIdentifier	 VERSION  DELTA
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
vers	TokenNameIdentifier	 vers
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method implements the command line compiler. See the USAGE_STRING * constant for a description. It may make sense to move the command-line * handling to a separate package (ie. make one xsltc.cmdline.Compiler * class that contains this main() method and one xsltc.cmdline.Transform * class that contains the DefaultRun stuff). */	TokenNameCOMMENT_JAVADOC	 This method implements the command line compiler. See the USAGE_STRING constant for a description. It may make sense to move the command-line handling to a separate package (ie. make one xsltc.cmdline.Compiler class that contains this main() method and one xsltc.cmdline.Transform class that contains the DefaultRun stuff). 
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
boolean	TokenNameboolean	
inputIsURL	TokenNameIdentifier	 input Is URL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
useStdIn	TokenNameIdentifier	 use Std In
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
classNameSet	TokenNameIdentifier	 class Name Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GetOpt	TokenNameIdentifier	 Get Opt
getopt	TokenNameIdentifier	 getopt
=	TokenNameEQUAL	
new	TokenNamenew	
GetOpt	TokenNameIdentifier	 Get Opt
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
"o:d:j:p:uxhsinv"	TokenNameStringLiteral	o:d:j:p:uxhsinv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLTC	TokenNameIdentifier	 XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getNextOption	TokenNameIdentifier	 get Next Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
useStdIn	TokenNameIdentifier	 use Std In
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getOptionArg	TokenNameIdentifier	 get Option Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classNameSet	TokenNameIdentifier	 class Name Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setDestDirectory	TokenNameIdentifier	 set Dest Directory
(	TokenNameLPAREN	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getOptionArg	TokenNameIdentifier	 get Option Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setPackageName	TokenNameIdentifier	 set Package Name
(	TokenNameLPAREN	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getOptionArg	TokenNameIdentifier	 get Option Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'j'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setJarFileName	TokenNameIdentifier	 set Jar File Name
(	TokenNameLPAREN	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getOptionArg	TokenNameIdentifier	 get Option Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
inputIsURL	TokenNameIdentifier	 input Is URL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// used to be 'false' 	TokenNameCOMMENT_LINE	used to be 'false' 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// fall through to case h 	TokenNameCOMMENT_LINE	fall through to case h 
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
compileOK	TokenNameIdentifier	 compile OK
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useStdIn	TokenNameIdentifier	 use Std In
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
classNameSet	TokenNameIdentifier	 class Name Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
compileOK	TokenNameIdentifier	 compile OK
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Generate a vector containg URLs for all stylesheets specified 	TokenNameCOMMENT_LINE	Generate a vector containg URLs for all stylesheets specified 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stylesheetNames	TokenNameIdentifier	 stylesheet Names
=	TokenNameEQUAL	
getopt	TokenNameIdentifier	 getopt
.	TokenNameDOT	
getCmdArgs	TokenNameIdentifier	 get Cmd Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
stylesheetVector	TokenNameIdentifier	 stylesheet Vector
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
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
stylesheetNames	TokenNameIdentifier	 stylesheet Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
stylesheetNames	TokenNameIdentifier	 stylesheet Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputIsURL	TokenNameIdentifier	 input Is URL
)	TokenNameRPAREN	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheetVector	TokenNameIdentifier	 stylesheet Vector
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
compileOK	TokenNameIdentifier	 compile OK
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
stylesheetVector	TokenNameIdentifier	 stylesheet Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compile the stylesheet and output class/jar file(s) 	TokenNameCOMMENT_LINE	Compile the stylesheet and output class/jar file(s) 
if	TokenNameif	
(	TokenNameLPAREN	
compileOK	TokenNameIdentifier	 compile OK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
printWarnings	TokenNameIdentifier	 print Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getJarFileName	TokenNameIdentifier	 get Jar File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
outputToJar	TokenNameIdentifier	 output To Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
printWarnings	TokenNameIdentifier	 print Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
printErrors	TokenNameIdentifier	 print Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
GetOptsException	TokenNameIdentifier	 Get Opts Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// exits with code '-1' 	TokenNameCOMMENT_LINE	exits with code '-1' 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
