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
/** Measures the time required to make a System.currentTimeMillis() and Thread.currentThread().getName() calls. <p>On an 233Mhz NT machine (JDK 1.1.7B) the System.currentTimeMillis() call takes under half a microsecond to complete whereas the Thread.currentThread().getName() call takes about 4 micro-seconds. */	TokenNameCOMMENT_JAVADOC	 Measures the time required to make a System.currentTimeMillis() and Thread.currentThread().getName() calls. <p>On an 233Mhz NT machine (JDK 1.1.7B) the System.currentTimeMillis() call takes under half a microsecond to complete whereas the Thread.currentThread().getName() call takes about 4 micro-seconds. 
public	TokenNamepublic	
class	TokenNameclass	
SystemTime	TokenNameIdentifier	 System Time
{	TokenNameLBRACE	
static	TokenNamestatic	
int	TokenNameint	
RUN_LENGTH	TokenNameIdentifier	 RUN  LENGTH
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
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
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
systemCurrentTimeLoop	TokenNameIdentifier	 system Current Time Loop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average System.currentTimeMillis() call took "	TokenNameStringLiteral	Average System.currentTimeMillis() call took 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
currentThreadNameloop	TokenNameIdentifier	 current Thread Nameloop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average Thread.currentThread().getName() call took "	TokenNameStringLiteral	Average Thread.currentThread().getName() call took 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
double	TokenNamedouble	
systemCurrentTimeLoop	TokenNameIdentifier	 system Current Time Loop
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
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
double	TokenNamedouble	
currentThreadNameloop	TokenNameIdentifier	 current Thread Nameloop
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
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
