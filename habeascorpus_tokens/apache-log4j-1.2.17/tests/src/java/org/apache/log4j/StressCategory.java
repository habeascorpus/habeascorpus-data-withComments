/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
/* Stress test the Logger class. */	TokenNameCOMMENT_BLOCK	 Stress test the Logger class. 
class	TokenNameclass	
StressCategory	TokenNameIdentifier	 Stress Category
{	TokenNameLBRACE	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
defaultLevel	TokenNameIdentifier	 default Level
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cat	TokenNameIdentifier	 cat
;	TokenNameSEMICOLON	
static	TokenNamestatic	
CT	TokenNameIdentifier	 CT
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ct	TokenNameIdentifier	 ct
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
LENGTH	TokenNameIdentifier	 LENGTH
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
LENGTH	TokenNameIdentifier	 LENGTH
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java "	TokenNameStringLiteral	Usage: java 
+	TokenNamePLUS	
StressCategory	TokenNameIdentifier	 Stress Category
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" name1 ... nameN ."	TokenNameStringLiteral	 name1 ... nameN .
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
if	TokenNameif	
(	TokenNameLPAREN	
LENGTH	TokenNameIdentifier	 LENGTH
>=	TokenNameGREATER_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"This stress test suffers from combinatorial explosion. "	TokenNameStringLiteral	This stress test suffers from combinatorial explosion. 
+	TokenNamePLUS	
"Invoking with seven arguments takes about 90 minutes even on fast machines"	TokenNameStringLiteral	Invoking with seven arguments takes about 90 minutes even on fast machines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
LENGTH	TokenNameIdentifier	 LENGTH
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
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
new	TokenNamenew	
Logger	TokenNameIdentifier	 Logger
[	TokenNameLBRACKET	
LENGTH	TokenNameIdentifier	 LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ct	TokenNameIdentifier	 ct
=	TokenNameEQUAL	
new	TokenNamenew	
CT	TokenNameIdentifier	 CT
[	TokenNameLBRACKET	
LENGTH	TokenNameIdentifier	 LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
permute	TokenNameIdentifier	 permute
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If did not exit, then passed all tests. 	TokenNameCOMMENT_LINE	If did not exit, then passed all tests. 
}	TokenNameRBRACE	
// Loop through all permutations of names[]. 	TokenNameCOMMENT_LINE	Loop through all permutations of names[]. 
// On each possible permutation call createLoop 	TokenNameCOMMENT_LINE	On each possible permutation call createLoop 
static	TokenNamestatic	
void	TokenNamevoid	
permute	TokenNameIdentifier	 permute
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
createLoop	TokenNameIdentifier	 create Loop
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
permute	TokenNameIdentifier	 permute
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
permutationDump	TokenNameIdentifier	 permutation Dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Current permutation is - "	TokenNameStringLiteral	Current permutation is - 
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
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
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
// Loop through all possible 3^n combinations of not instantiating, 	TokenNameCOMMENT_LINE	Loop through all possible 3^n combinations of not instantiating, 
// instantiating and setting/not setting a level. 	TokenNameCOMMENT_LINE	instantiating and setting/not setting a level. 
static	TokenNamestatic	
void	TokenNamevoid	
createLoop	TokenNameIdentifier	 create Loop
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
LENGTH	TokenNameIdentifier	 LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("..............Creating cat[]..........."); 	TokenNameCOMMENT_LINE	System.out.println("..............Creating cat[]..........."); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clear hash table for next round 	TokenNameCOMMENT_LINE	Clear hash table for next round 
Hierarchy	TokenNameIdentifier	 Hierarchy
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hierarchy	TokenNameIdentifier	 Hierarchy
)	TokenNameRPAREN	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
createLoop	TokenNameIdentifier	 create Loop
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CT	TokenNameIdentifier	 CT
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createLoop	TokenNameIdentifier	 create Loop
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CT	TokenNameIdentifier	 CT
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
%	TokenNameREMAINDER	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createLoop	TokenNameIdentifier	 create Loop
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("++++++++++++TEST called+++++++++++++"); 	TokenNameCOMMENT_LINE	System.out.println("++++++++++++TEST called+++++++++++++"); 
//permutationDump(); 	TokenNameCOMMENT_LINE	permutationDump(); 
//catDump(); 	TokenNameCOMMENT_LINE	catDump(); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkCorrectness	TokenNameIdentifier	 check Correctness
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Failed stress test."	TokenNameStringLiteral	Failed stress test.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
permutationDump	TokenNameIdentifier	 permutation Dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Hierarchy._default.fullDump(); 	TokenNameCOMMENT_LINE	Hierarchy._default.fullDump(); 
ctDump	TokenNameIdentifier	 ct Dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catDump	TokenNameIdentifier	 cat Dump
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
ctDump	TokenNameIdentifier	 ct Dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ct ["	TokenNameStringLiteral	ct [
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"] = ("	TokenNameStringLiteral	] = (
+	TokenNamePLUS	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ct ["	TokenNameStringLiteral	ct [
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"] = undefined"	TokenNameStringLiteral	] = undefined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
catDump	TokenNameIdentifier	 cat Dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"cat["	TokenNameStringLiteral	cat[
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"] = ("	TokenNameStringLiteral	] = (
+	TokenNamePLUS	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"cat["	TokenNameStringLiteral	cat[
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
"] = undefined"	TokenNameStringLiteral	] = undefined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// static 	TokenNameCOMMENT_LINE	static 
//void provisionNodesDump() { 	TokenNameCOMMENT_LINE	void provisionNodesDump() { 
//for (Enumeration e = CategoryFactory.ht.keys(); e.hasMoreElements() ;) { 	TokenNameCOMMENT_LINE	for (Enumeration e = CategoryFactory.ht.keys(); e.hasMoreElements() ;) { 
// CategoryKey key = (CategoryKey) e.nextElement(); 	TokenNameCOMMENT_LINE	CategoryKey key = (CategoryKey) e.nextElement(); 
// Object c = CategoryFactory.ht.get(key); 	TokenNameCOMMENT_LINE	Object c = CategoryFactory.ht.get(key); 
// if(c instanceof ProvisionNode) 	TokenNameCOMMENT_LINE	if(c instanceof ProvisionNode) 
//((ProvisionNode) c).dump(key.name); 	TokenNameCOMMENT_LINE	((ProvisionNode) c).dump(key.name); 
//} 	TokenNameCOMMENT_LINE	} 
//} 	TokenNameCOMMENT_LINE	} 
static	TokenNamestatic	
boolean	TokenNameboolean	
checkCorrectness	TokenNameIdentifier	 check Correctness
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CT	TokenNameIdentifier	 CT
localCT	TokenNameIdentifier	 local CT
=	TokenNameEQUAL	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Can't perform test if logger is not instantiated 	TokenNameCOMMENT_LINE	Can't perform test if logger is not instantiated 
if	TokenNameif	
(	TokenNameLPAREN	
localCT	TokenNameIdentifier	 local CT
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// find expected level 	TokenNameCOMMENT_LINE	find expected level 
Level	TokenNameIdentifier	 Level
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
getExpectedPrioriy	TokenNameIdentifier	 get Expected Prioriy
(	TokenNameLPAREN	
localCT	TokenNameIdentifier	 local CT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
purported	TokenNameIdentifier	 purported
=	TokenNameEQUAL	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
!=	TokenNameNOT_EQUAL	
purported	TokenNameIdentifier	 purported
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Expected level for "	TokenNameStringLiteral	Expected level for 
+	TokenNamePLUS	
localCT	TokenNameIdentifier	 local CT
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
+	TokenNamePLUS	
" is "	TokenNameStringLiteral	 is 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Purported level for "	TokenNameStringLiteral	Purported level for 
+	TokenNamePLUS	
cat	TokenNameIdentifier	 cat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is "	TokenNameStringLiteral	 is 
+	TokenNamePLUS	
purported	TokenNameIdentifier	 purported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
getExpectedPrioriy	TokenNameIdentifier	 get Expected Prioriy
(	TokenNameLPAREN	
CT	TokenNameIdentifier	 CT
ctParam	TokenNameIdentifier	 ct Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
ctParam	TokenNameIdentifier	 ct Param
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
catstr	TokenNameIdentifier	 catstr
=	TokenNameEQUAL	
ctParam	TokenNameIdentifier	 ct Param
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
catstr	TokenNameIdentifier	 catstr
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
catstr	TokenNameIdentifier	 catstr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
catstr	TokenNameIdentifier	 catstr
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
substr	TokenNameIdentifier	 substr
=	TokenNameEQUAL	
catstr	TokenNameIdentifier	 catstr
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find the level of ct corresponding to substr 	TokenNameCOMMENT_LINE	find the level of ct corresponding to substr 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
LENGTH	TokenNameIdentifier	 LENGTH
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
substr	TokenNameIdentifier	 substr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ct	TokenNameIdentifier	 ct
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultLevel	TokenNameIdentifier	 default Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
CT	TokenNameIdentifier	 CT
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
catstr	TokenNameIdentifier	 catstr
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
CT	TokenNameIdentifier	 CT
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
catstr	TokenNameIdentifier	 catstr
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
catstr	TokenNameIdentifier	 catstr
=	TokenNameEQUAL	
catstr	TokenNameIdentifier	 catstr
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
