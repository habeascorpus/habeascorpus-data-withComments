/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: GetOpt.java 468647 2006-10-28 06:59:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: GetOpt.java 468647 2006-10-28 06:59:33Z minchau $ 
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
.	TokenNameDOT	
getopt	TokenNameIdentifier	 getopt
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
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
/** * GetOpt is a Java equivalent to the C getopt() library function * discussed in man page getopt(3C). It provides command line * parsing for Java applications. It supports the most rules of the * command line standard (see man page intro(1)) including stacked * options such as '-sxm' (which is equivalent to -s -x -m); it * handles special '--' option that signifies the end of options. * Additionally this implementation of getopt will check for * mandatory arguments to options such as in the case of * '-d <file>' it will throw a MissingOptArgException if the * option argument '<file>' is not included on the commandline. * getopt(3C) does not check for this. * @author G Todd Miller */	TokenNameCOMMENT_JAVADOC	 GetOpt is a Java equivalent to the C getopt() library function discussed in man page getopt(3C). It provides command line parsing for Java applications. It supports the most rules of the command line standard (see man page intro(1)) including stacked options such as '-sxm' (which is equivalent to -s -x -m); it handles special '--' option that signifies the end of options. Additionally this implementation of getopt will check for mandatory arguments to options such as in the case of '-d <file>' it will throw a MissingOptArgException if the option argument '<file>' is not included on the commandline. getopt(3C) does not check for this. @author G Todd Miller 
public	TokenNamepublic	
class	TokenNameclass	
GetOpt	TokenNameIdentifier	 Get Opt
{	TokenNameLBRACE	
public	TokenNamepublic	
GetOpt	TokenNameIdentifier	 Get Opt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
optString	TokenNameIdentifier	 opt String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theOptions	TokenNameIdentifier	 the Options
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currOptIndex	TokenNameIdentifier	 curr Opt Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
theCmdArgs	TokenNameIdentifier	 the Cmd Args
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
=	TokenNameEQUAL	
new	TokenNamenew	
OptionMatcher	TokenNameIdentifier	 Option Matcher
(	TokenNameLPAREN	
optString	TokenNameIdentifier	 opt String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fill in the options list 	TokenNameCOMMENT_LINE	fill in the options list 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
tokenLength	TokenNameIdentifier	 token Length
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// end of opts 	TokenNameCOMMENT_LINE	end of opts 
currOptIndex	TokenNameIdentifier	 curr Opt Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// set index of first operand 	TokenNameCOMMENT_LINE	set index of first operand 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// end of options 	TokenNameCOMMENT_LINE	end of options 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenLength	TokenNameIdentifier	 token Length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simple option token such as '-s' found 	TokenNameCOMMENT_LINE	simple option token such as '-s' found 
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenLength	TokenNameIdentifier	 token Length
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stacked options found, such as '-shm' 	TokenNameCOMMENT_LINE	stacked options found, such as '-shm' 
// iterate thru the tokens after the dash and 	TokenNameCOMMENT_LINE	iterate thru the tokens after the dash and 
// add them to theOptions list 	TokenNameCOMMENT_LINE	add them to theOptions list 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
tokenLength	TokenNameIdentifier	 token Length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// case 1- there are not options stored yet therefore 	TokenNameCOMMENT_LINE	case 1- there are not options stored yet therefore 
// this must be an command argument, not an option argument 	TokenNameCOMMENT_LINE	this must be an command argument, not an option argument 
if	TokenNameif	
(	TokenNameLPAREN	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currOptIndex	TokenNameIdentifier	 curr Opt Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// stop processing options 	TokenNameCOMMENT_LINE	stop processing options 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// case 2- 	TokenNameCOMMENT_LINE	case 2- 
// there are options stored, check to see if 	TokenNameCOMMENT_LINE	there are options stored, check to see if 
// this arg belong to the last arg stored 	TokenNameCOMMENT_LINE	this arg belong to the last arg stored 
int	TokenNameint	
indexoflast	TokenNameIdentifier	 indexoflast
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indexoflast	TokenNameIdentifier	 indexoflast
=	TokenNameEQUAL	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Option	TokenNameIdentifier	 Option
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Option	TokenNameIdentifier	 Option
)	TokenNameRPAREN	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
indexoflast	TokenNameIdentifier	 indexoflast
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
opLetter	TokenNameIdentifier	 op Letter
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getArgLetter	TokenNameIdentifier	 get Arg Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
opLetter	TokenNameIdentifier	 op Letter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
setArg	TokenNameIdentifier	 set Arg
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// case 3 - 	TokenNameCOMMENT_LINE	case 3 - 
// the last option stored does not take 	TokenNameCOMMENT_LINE	the last option stored does not take 
// an argument, so again, this argument 	TokenNameCOMMENT_LINE	an argument, so again, this argument 
// must be a command argument, not 	TokenNameCOMMENT_LINE	must be a command argument, not 
// an option argument 	TokenNameCOMMENT_LINE	an option argument 
currOptIndex	TokenNameIdentifier	 curr Opt Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// end of options 	TokenNameCOMMENT_LINE	end of options 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end option does not start with "-" 	TokenNameCOMMENT_LINE	end option does not start with "-" 
}	TokenNameRBRACE	
// end for args loop 	TokenNameCOMMENT_LINE	end for args loop 
// attach an iterator to list of options 	TokenNameCOMMENT_LINE	attach an iterator to list of options 
theOptionsIterator	TokenNameIdentifier	 the Options Iterator
=	TokenNameEQUAL	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// options are done, now fill out cmd arg list with remaining args 	TokenNameCOMMENT_LINE	options are done, now fill out cmd arg list with remaining args 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
currOptIndex	TokenNameIdentifier	 curr Opt Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
theCmdArgs	TokenNameIdentifier	 the Cmd Args
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * debugging routine to print out all options collected */	TokenNameCOMMENT_JAVADOC	 debugging routine to print out all options collected 
public	TokenNamepublic	
void	TokenNamevoid	
printOptions	TokenNameIdentifier	 print Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
theOptions	TokenNameIdentifier	 the Options
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Option	TokenNameIdentifier	 Option
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Option	TokenNameIdentifier	 Option
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"OPT ="	TokenNameStringLiteral	OPT =
+	TokenNamePLUS	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getArgLetter	TokenNameIdentifier	 get Arg Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getArgument	TokenNameIdentifier	 get Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
/** * gets the next option found in the commandline. Distinguishes * between two bad cases, one case is when an illegal option * is found, and then other case is when an option takes an * argument but no argument was found for that option. * If the option found was not declared in the optString, then * an IllegalArgumentException will be thrown (case 1). * If the next option found has been declared to take an argument, * and no such argument exists, then a MissingOptArgException * is thrown (case 2). * @return int - the next option found. * @throws IllegalArgumentException, MissingOptArgException. */	TokenNameCOMMENT_JAVADOC	 gets the next option found in the commandline. Distinguishes between two bad cases, one case is when an illegal option is found, and then other case is when an option takes an argument but no argument was found for that option. If the option found was not declared in the optString, then an IllegalArgumentException will be thrown (case 1). If the next option found has been declared to take an argument, and no such argument exists, then a MissingOptArgException is thrown (case 2). @return int - the next option found. @throws IllegalArgumentException, MissingOptArgException. 
public	TokenNamepublic	
int	TokenNameint	
getNextOption	TokenNameIdentifier	 get Next Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
,	TokenNameCOMMA	
MissingOptArgException	TokenNameIdentifier	 Missing Opt Arg Exception
{	TokenNameLBRACE	
int	TokenNameint	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theOptionsIterator	TokenNameIdentifier	 the Options Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theCurrentOption	TokenNameIdentifier	 the Current Option
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Option	TokenNameIdentifier	 Option
)	TokenNameRPAREN	
theOptionsIterator	TokenNameIdentifier	 the Options Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
theCurrentOption	TokenNameIdentifier	 the Current Option
.	TokenNameDOT	
getArgLetter	TokenNameIdentifier	 get Arg Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldHaveArg	TokenNameIdentifier	 should Have Arg
=	TokenNameEQUAL	
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
theCurrentOption	TokenNameIdentifier	 the Current Option
.	TokenNameDOT	
getArgument	TokenNameIdentifier	 get Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier	 ILLEGAL  CMDLINE  OPTION  ERR
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
(	TokenNameLPAREN	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
shouldHaveArg	TokenNameIdentifier	 should Have Arg
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier	 CMDLINE  OPT  MISSING  ARG  ERR
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
(	TokenNameLPAREN	
new	TokenNamenew	
MissingOptArgException	TokenNameIdentifier	 Missing Opt Arg Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets the argument for the current parsed option. For example, * in case of '-d <file>', if current option parsed is 'd' then * getOptionArg() would return '<file>'. * @return String - argument for current parsed option. */	TokenNameCOMMENT_JAVADOC	 gets the argument for the current parsed option. For example, in case of '-d <file>', if current option parsed is 'd' then getOptionArg() would return '<file>'. @return String - argument for current parsed option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionArg	TokenNameIdentifier	 get Option Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
theCurrentOption	TokenNameIdentifier	 the Current Option
.	TokenNameDOT	
getArgument	TokenNameIdentifier	 get Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
theCurrentOption	TokenNameIdentifier	 the Current Option
.	TokenNameDOT	
getArgLetter	TokenNameIdentifier	 get Arg Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
.	TokenNameDOT	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gets list of the commandline arguments. For example, in command * such as 'cmd -s -d file file2 file3 file4' with the usage * 'cmd [-s] [-d <file>] <file>...', getCmdArgs() would return * the list {file2, file3, file4}. * @return String[] - list of command arguments that may appear * after options and option arguments. */	TokenNameCOMMENT_JAVADOC	 gets list of the commandline arguments. For example, in command such as 'cmd -s -d file file2 file3 file4' with the usage 'cmd [-s] [-d <file>] <file>...', getCmdArgs() would return the list {file2, file3, file4}. @return String[] - list of command arguments that may appear after options and option arguments. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCmdArgs	TokenNameIdentifier	 get Cmd Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
theCmdArgs	TokenNameIdentifier	 the Cmd Args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
theCmdArgs	TokenNameIdentifier	 the Cmd Args
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Option	TokenNameIdentifier	 Option
theCurrentOption	TokenNameIdentifier	 the Current Option
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ListIterator	TokenNameIdentifier	 List Iterator
theOptionsIterator	TokenNameIdentifier	 the Options Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
theOptions	TokenNameIdentifier	 the Options
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
theCmdArgs	TokenNameIdentifier	 the Cmd Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OptionMatcher	TokenNameIdentifier	 Option Matcher
theOptionMatcher	TokenNameIdentifier	 the Option Matcher
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////// 
// 	TokenNameCOMMENT_LINE	 
// Inner Classes 	TokenNameCOMMENT_LINE	Inner Classes 
// 	TokenNameCOMMENT_LINE	 
/////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////// 
// inner class to model an option 	TokenNameCOMMENT_LINE	inner class to model an option 
class	TokenNameclass	
Option	TokenNameIdentifier	 Option
{	TokenNameLBRACE	
private	TokenNameprivate	
char	TokenNamechar	
theArgLetter	TokenNameIdentifier	 the Arg Letter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
theArgument	TokenNameIdentifier	 the Argument
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
char	TokenNamechar	
argLetter	TokenNameIdentifier	 arg Letter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theArgLetter	TokenNameIdentifier	 the Arg Letter
=	TokenNameEQUAL	
argLetter	TokenNameIdentifier	 arg Letter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArg	TokenNameIdentifier	 set Arg
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theArgument	TokenNameIdentifier	 the Argument
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
theArgument	TokenNameIdentifier	 the Argument
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
getArgLetter	TokenNameIdentifier	 get Arg Letter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theArgLetter	TokenNameIdentifier	 the Arg Letter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArgument	TokenNameIdentifier	 get Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theArgument	TokenNameIdentifier	 the Argument
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end class Option 	TokenNameCOMMENT_LINE	end class Option 
// inner class to query optString for a possible option match, 	TokenNameCOMMENT_LINE	inner class to query optString for a possible option match, 
// and whether or not a given legal option takes an argument. 	TokenNameCOMMENT_LINE	and whether or not a given legal option takes an argument. 
// 	TokenNameCOMMENT_LINE	 
class	TokenNameclass	
OptionMatcher	TokenNameIdentifier	 Option Matcher
{	TokenNameLBRACE	
public	TokenNamepublic	
OptionMatcher	TokenNameIdentifier	 Option Matcher
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optString	TokenNameIdentifier	 opt String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theOptString	TokenNameIdentifier	 the Opt String
=	TokenNameEQUAL	
optString	TokenNameIdentifier	 opt String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theOptString	TokenNameIdentifier	 the Opt String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasArg	TokenNameIdentifier	 has Arg
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
theOptString	TokenNameIdentifier	 the Opt String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
theOptString	TokenNameIdentifier	 the Opt String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reached end of theOptString 	TokenNameCOMMENT_LINE	reached end of theOptString 
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
theOptString	TokenNameIdentifier	 the Opt String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
theOptString	TokenNameIdentifier	 the Opt String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end class OptionMatcher 	TokenNameCOMMENT_LINE	end class OptionMatcher 
}	TokenNameRBRACE	
// end class GetOpt 	TokenNameCOMMENT_LINE	end class GetOpt 
