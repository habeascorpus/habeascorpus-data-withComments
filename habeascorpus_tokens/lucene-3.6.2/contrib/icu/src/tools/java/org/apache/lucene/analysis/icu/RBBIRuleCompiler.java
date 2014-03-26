package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
FilenameFilter	TokenNameIdentifier	 Filename Filter
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
;	TokenNameSEMICOLON	
/** * Command-line utility to converts RuleBasedBreakIterator (.rbbi) files into * binary compiled form (.brk). */	TokenNameCOMMENT_JAVADOC	 Command-line utility to converts RuleBasedBreakIterator (.rbbi) files into binary compiled form (.brk). 
public	TokenNamepublic	
class	TokenNameclass	
RBBIRuleCompiler	TokenNameIdentifier	 RBBI Rule Compiler
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getRules	TokenNameIdentifier	 get Rules
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
ruleFile	TokenNameIdentifier	 rule File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
ruleFile	TokenNameIdentifier	 rule File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
cin	TokenNameIdentifier	 cin
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
cin	TokenNameIdentifier	 cin
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
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cin	TokenNameIdentifier	 cin
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcDir	TokenNameIdentifier	 src Dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
new	TokenNamenew	
FilenameFilter	TokenNameIdentifier	 Filename Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"rbbi"	TokenNameStringLiteral	rbbi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Path does not exist: "	TokenNameStringLiteral	Path does not exist: 
+	TokenNamePLUS	
srcDir	TokenNameIdentifier	 src Dir
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
outputFile	TokenNameIdentifier	 output File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"rbbi$"	TokenNameStringLiteral	rbbi$
,	TokenNameCOMMA	
"brk"	TokenNameStringLiteral	brk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
getRules	TokenNameIdentifier	 get Rules
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Compiling "	TokenNameStringLiteral	Compiling 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * if there is a syntax error, compileRules() may succeed. the way to * check is to try to instantiate from the string. additionally if the * rules are invalid, you can get a useful syntax error. */	TokenNameCOMMENT_BLOCK	 if there is a syntax error, compileRules() may succeed. the way to check is to try to instantiate from the string. additionally if the rules are invalid, you can get a useful syntax error. 
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * do this intentionally, so you don't get a massive stack trace * instead, get a useful syntax error! */	TokenNameCOMMENT_BLOCK	 do this intentionally, so you don't get a massive stack trace instead, get a useful syntax error! 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
compileRules	TokenNameIdentifier	 compile Rules
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" bytes."	TokenNameStringLiteral	 bytes.
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
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: RBBIRuleComputer <sourcedir> <destdir>"	TokenNameStringLiteral	Usage: RBBIRuleComputer <sourcedir> <destdir>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
