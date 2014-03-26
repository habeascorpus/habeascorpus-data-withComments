package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
/** the purpose of this charfilter is to send offsets out of bounds if the analyzer doesn't use correctOffset or does incorrect offset math. */	TokenNameCOMMENT_JAVADOC	 the purpose of this charfilter is to send offsets out of bounds if the analyzer doesn't use correctOffset or does incorrect offset math. 
public	TokenNamepublic	
class	TokenNameclass	
MockCharFilter	TokenNameIdentifier	 Mock Char Filter
extends	TokenNameextends	
CharStream	TokenNameIdentifier	 Char Stream
{	TokenNameLBRACE	
final	TokenNamefinal	
CharStream	TokenNameIdentifier	 Char Stream
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
remainder	TokenNameIdentifier	 remainder
;	TokenNameSEMICOLON	
// for testing only 	TokenNameCOMMENT_LINE	for testing only 
public	TokenNamepublic	
MockCharFilter	TokenNameIdentifier	 Mock Char Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
CharReader	TokenNameIdentifier	 Char Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: instead of fixed remainder... maybe a fixed 	TokenNameCOMMENT_LINE	TODO: instead of fixed remainder... maybe a fixed 
// random seed? 	TokenNameCOMMENT_LINE	random seed? 
this	TokenNamethis	
.	TokenNameDOT	
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
remainder	TokenNameIdentifier	 remainder
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
remainder	TokenNameIdentifier	 remainder
>=	TokenNameGREATER_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"invalid remainder parameter (must be 0..10): "	TokenNameStringLiteral	invalid remainder parameter (must be 0..10): 
+	TokenNamePLUS	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for testing only, uses a remainder of 0 	TokenNameCOMMENT_LINE	for testing only, uses a remainder of 0 
public	TokenNamepublic	
MockCharFilter	TokenNameIdentifier	 Mock Char Filter
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferedCh	TokenNameIdentifier	 buffered Ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we have a buffered character, add an offset correction and return it 	TokenNameCOMMENT_LINE	we have a buffered character, add an offset correction and return it 
if	TokenNameif	
(	TokenNameLPAREN	
bufferedCh	TokenNameIdentifier	 buffered Ch
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
bufferedCh	TokenNameIdentifier	 buffered Ch
;	TokenNameSEMICOLON	
bufferedCh	TokenNameIdentifier	 buffered Ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
addOffCorrectMap	TokenNameIdentifier	 add Off Correct Map
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delta	TokenNameIdentifier	 delta
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// otherwise actually read one 	TokenNameCOMMENT_LINE	otherwise actually read one 
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
remainder	TokenNameIdentifier	 remainder
||	TokenNameOR_OR	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we will double this character, so buffer it. 	TokenNameCOMMENT_LINE	we will double this character, so buffer it. 
bufferedCh	TokenNameIdentifier	 buffered Ch
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numRead	TokenNameIdentifier	 num Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
cbuf	TokenNameIdentifier	 cbuf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
numRead	TokenNameIdentifier	 num Read
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numRead	TokenNameIdentifier	 num Read
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
numRead	TokenNameIdentifier	 num Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
int	TokenNameint	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
subMap	TokenNameIdentifier	 sub Map
=	TokenNameEQUAL	
corrections	TokenNameIdentifier	 corrections
.	TokenNameDOT	
subMap	TokenNameIdentifier	 sub Map
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
subMap	TokenNameIdentifier	 sub Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
currentOff	TokenNameIdentifier	 current Off
:	TokenNameCOLON	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
subMap	TokenNameIdentifier	 sub Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subMap	TokenNameIdentifier	 sub Map
.	TokenNameDOT	
lastKey	TokenNameIdentifier	 last Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ret	TokenNameIdentifier	 ret
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"currentOff="	TokenNameStringLiteral	currentOff=
+	TokenNamePLUS	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
",diff="	TokenNameStringLiteral	,diff=
+	TokenNamePLUS	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
-	TokenNameMINUS	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// chain the call 	TokenNameCOMMENT_LINE	chain the call 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addOffCorrectMap	TokenNameIdentifier	 add Off Correct Map
(	TokenNameLPAREN	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
cumulativeDiff	TokenNameIdentifier	 cumulative Diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
corrections	TokenNameIdentifier	 corrections
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
cumulativeDiff	TokenNameIdentifier	 cumulative Diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
corrections	TokenNameIdentifier	 corrections
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
