/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
performance	TokenNameIdentifier	 performance
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** Compares the performance of looping through a list versus a Vector. Chain looping is *20* times faster than vector access on JDK 1.1.7B on NT */	TokenNameCOMMENT_JAVADOC	 Compares the performance of looping through a list versus a Vector. Chain looping is *20* times faster than vector access on JDK 1.1.7B on NT 
public	TokenNamepublic	
class	TokenNameclass	
ListVsVector	TokenNameIdentifier	 List Vs Vector
{	TokenNameLBRACE	
static	TokenNamestatic	
int	TokenNameint	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Chain	TokenNameIdentifier	 Chain
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"ccc"	TokenNameStringLiteral	ccc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"ddd"	TokenNameStringLiteral	ddd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"eee"	TokenNameStringLiteral	eee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Chain	TokenNameIdentifier	 Chain
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
"ccc"	TokenNameStringLiteral	ccc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
"ddd"	TokenNameStringLiteral	ddd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
"eee"	TokenNameStringLiteral	eee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
loopChain	TokenNameIdentifier	 loop Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Looping thourgh the chain took "	TokenNameStringLiteral	Looping thourgh the chain took 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
loopVector	TokenNameIdentifier	 loop Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Looping thourgh the vector took "	TokenNameStringLiteral	Looping thourgh the vector took 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
double	TokenNamedouble	
loopChain	TokenNameIdentifier	 loop Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Chain	TokenNameIdentifier	 Chain
c	TokenNameIdentifier	 c
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
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
double	TokenNamedouble	
loopVector	TokenNameIdentifier	 loop Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
Chain	TokenNameIdentifier	 Chain
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Chain	TokenNameIdentifier	 Chain
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
Chain	TokenNameIdentifier	 Chain
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
Chain	TokenNameIdentifier	 Chain
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
