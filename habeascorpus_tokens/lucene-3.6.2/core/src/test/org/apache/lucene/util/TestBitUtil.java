/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestBitUtil	TokenNameIdentifier	 Test Bit Util
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
slowNlz	TokenNameIdentifier	 slow Nlz
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nlz	TokenNameIdentifier	 nlz
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<<	TokenNameLEFT_SHIFT	
nlz	TokenNameIdentifier	 nlz
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nlz	TokenNameIdentifier	 nlz
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nlz	TokenNameIdentifier	 nlz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
slowNlz	TokenNameIdentifier	 slow Nlz
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNlz	TokenNameIdentifier	 test Nlz
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkNlz	TokenNameIdentifier	 check Nlz
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBitUtils	TokenNameIdentifier	 test Bit Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz2	TokenNameIdentifier	 ntz2
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz3	TokenNameIdentifier	 ntz3
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz2	TokenNameIdentifier	 ntz2
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz3	TokenNameIdentifier	 ntz3
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
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
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz	TokenNameIdentifier	 ntz
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz2	TokenNameIdentifier	 ntz2
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
ntz3	TokenNameIdentifier	 ntz3
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
testArg	TokenNameIdentifier	 test Arg
(	TokenNameLPAREN	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
nlzBitUtilBasicLoop	TokenNameIdentifier	 nlz Bit Util Basic Loop
(	TokenNameLPAREN	
int	TokenNameint	
iters	TokenNameIdentifier	 iters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sumRes	TokenNameIdentifier	 sum Res
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iters	TokenNameIdentifier	 iters
--	TokenNameMINUS_MINUS	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
testArg	TokenNameIdentifier	 test Arg
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nlz	TokenNameIdentifier	 nlz
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sumRes	TokenNameIdentifier	 sum Res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
nlzLongBasicLoop	TokenNameIdentifier	 nlz Long Basic Loop
(	TokenNameLPAREN	
int	TokenNameint	
iters	TokenNameIdentifier	 iters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sumRes	TokenNameIdentifier	 sum Res
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iters	TokenNameIdentifier	 iters
--	TokenNameMINUS_MINUS	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
testArg	TokenNameIdentifier	 test Arg
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumRes	TokenNameIdentifier	 sum Res
+=	TokenNamePLUS_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sumRes	TokenNameIdentifier	 sum Res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tstPerfNlz	TokenNameIdentifier	 tst Perf Nlz
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See LUCENE-3197, prefer to use Long.numberOfLeadingZeros() over BitUtil.nlz(). 	TokenNameCOMMENT_LINE	See LUCENE-3197, prefer to use Long.numberOfLeadingZeros() over BitUtil.nlz(). 
final	TokenNamefinal	
long	TokenNamelong	
measureMilliSecs	TokenNameIdentifier	 measure Milli Secs
=	TokenNameEQUAL	
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
basicIters	TokenNameIdentifier	 basic Iters
=	TokenNameEQUAL	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
;	TokenNameSEMICOLON	
long	TokenNamelong	
endTime	TokenNameIdentifier	 end Time
;	TokenNameSEMICOLON	
long	TokenNamelong	
curTime	TokenNameIdentifier	 cur Time
;	TokenNameSEMICOLON	
long	TokenNamelong	
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// avoid optimizing away 	TokenNameCOMMENT_LINE	avoid optimizing away 
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bitUtilLoops	TokenNameIdentifier	 bit Util Loops
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
startTime	TokenNameIdentifier	 start Time
+	TokenNamePLUS	
measureMilliSecs	TokenNameIdentifier	 measure Milli Secs
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
dummy	TokenNameIdentifier	 dummy
+=	TokenNamePLUS_EQUAL	
nlzBitUtilBasicLoop	TokenNameIdentifier	 nlz Bit Util Basic Loop
(	TokenNameLPAREN	
basicIters	TokenNameIdentifier	 basic Iters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitUtilLoops	TokenNameIdentifier	 bit Util Loops
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
curTime	TokenNameIdentifier	 cur Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
curTime	TokenNameIdentifier	 cur Time
<	TokenNameLESS	
endTime	TokenNameIdentifier	 end Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bitUtilPsTime	TokenNameIdentifier	 bit Util Ps Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
curTime	TokenNameIdentifier	 cur Time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
basicIters	TokenNameIdentifier	 basic Iters
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
63	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bitUtilLoops	TokenNameIdentifier	 bit Util Loops
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"BitUtil nlz time: "	TokenNameStringLiteral	BitUtil nlz time: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
bitUtilPsTime	TokenNameIdentifier	 bit Util Ps Time
/	TokenNameDIVIDE	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" picosec/call, dummy: "	TokenNameStringLiteral	 picosec/call, dummy: 
+	TokenNamePLUS	
dummy	TokenNameIdentifier	 dummy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
longLoops	TokenNameIdentifier	 long Loops
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
startTime	TokenNameIdentifier	 start Time
+	TokenNamePLUS	
measureMilliSecs	TokenNameIdentifier	 measure Milli Secs
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
dummy	TokenNameIdentifier	 dummy
+=	TokenNamePLUS_EQUAL	
nlzLongBasicLoop	TokenNameIdentifier	 nlz Long Basic Loop
(	TokenNameLPAREN	
basicIters	TokenNameIdentifier	 basic Iters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longLoops	TokenNameIdentifier	 long Loops
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
curTime	TokenNameIdentifier	 cur Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
curTime	TokenNameIdentifier	 cur Time
<	TokenNameLESS	
endTime	TokenNameIdentifier	 end Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
longPsTime	TokenNameIdentifier	 long Ps Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
curTime	TokenNameIdentifier	 cur Time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
basicIters	TokenNameIdentifier	 basic Iters
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
63	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
longLoops	TokenNameIdentifier	 long Loops
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Long nlz time: "	TokenNameStringLiteral	Long nlz time: 
+	TokenNamePLUS	
longPsTime	TokenNameIdentifier	 long Ps Time
+	TokenNamePLUS	
" picosec/call, dummy: "	TokenNameStringLiteral	 picosec/call, dummy: 
+	TokenNamePLUS	
dummy	TokenNameIdentifier	 dummy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
