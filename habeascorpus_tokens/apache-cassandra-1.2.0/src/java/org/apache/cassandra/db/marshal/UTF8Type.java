/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
.	TokenNameDOT	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
UTF8Type	TokenNameIdentifier	 UT F8 Type
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
UTF8Type	TokenNameIdentifier	 UT F8 Type
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
UTF8Type	TokenNameIdentifier	 UT F8 Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UTF8Type	TokenNameIdentifier	 UT F8 Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// singleton 	TokenNameCOMMENT_LINE	singleton 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
bytesCompare	TokenNameIdentifier	 bytes Compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
.	TokenNameDOT	
MarshalException	TokenNameIdentifier	 Marshal Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
UTF8Validator	TokenNameIdentifier	 UT F8 Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"String didn't validate."	TokenNameStringLiteral	String didn't validate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
UTF8Validator	TokenNameIdentifier	 UT F8 Validator
{	TokenNameLBRACE	
enum	TokenNameenum	
State	TokenNameIdentifier	 State
{	TokenNameLBRACE	
START	TokenNameIdentifier	 START
,	TokenNameCOMMA	
TWO	TokenNameIdentifier	 TWO
,	TokenNameCOMMA	
TWO_80	TokenNameIdentifier	 TWO 80
,	TokenNameCOMMA	
THREE_a0bf	TokenNameIdentifier	 THREE a0bf
,	TokenNameCOMMA	
THREE_80bf_1	TokenNameIdentifier	 THREE 80bf 1
,	TokenNameCOMMA	
THREE_80bf_2	TokenNameIdentifier	 THREE 80bf 2
,	TokenNameCOMMA	
FOUR_90bf	TokenNameIdentifier	 FOUR 90bf
,	TokenNameCOMMA	
FOUR_80bf_3	TokenNameIdentifier	 FOUR 80bf 3
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// since we're not converting to java strings, we don't need to worry about converting to surrogates. 	TokenNameCOMMENT_LINE	since we're not converting to java strings, we don't need to worry about converting to surrogates. 
// buf has already been sliced/duplicated. 	TokenNameCOMMENT_LINE	buf has already been sliced/duplicated. 
static	TokenNamestatic	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
slice	TokenNameIdentifier	 slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
START	TokenNameIdentifier	 START
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ascii, state stays start. 	TokenNameCOMMENT_LINE	ascii, state stays start. 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>	TokenNameGREATER	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// validate first byte of 2-byte char, 0xc2-0xdf 	TokenNameCOMMENT_LINE	validate first byte of 2-byte char, 0xc2-0xdf 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// speical case: modified utf8 null is 0xc080. 	TokenNameCOMMENT_LINE	speical case: modified utf8 null is 0xc080. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
TWO_80	TokenNameIdentifier	 TWO 80
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x1e	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
TWO	TokenNameIdentifier	 TWO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 3 bytes. first byte will be 0xe0 or 0xe1-0xef. handling of second byte will differ. 	TokenNameCOMMENT_LINE	3 bytes. first byte will be 0xe0 or 0xe1-0xef. handling of second byte will differ. 
// so 0xe0,0xa0-0xbf,0x80-0xbf or 0xe1-0xef,0x80-0xbf,0x80-0xbf. 	TokenNameCOMMENT_LINE	so 0xe0,0xa0-0xbf,0x80-0xbf or 0xe1-0xef,0x80-0xbf,0x80-0xbf. 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xe0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_a0bf	TokenNameIdentifier	 THREE a0bf
;	TokenNameSEMICOLON	
else	TokenNameelse	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_80bf_2	TokenNameIdentifier	 THREE 80bf 2
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 4 bytes. this is where the fun starts. 	TokenNameCOMMENT_LINE	4 bytes. this is where the fun starts. 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// 0xf0, 0x90-0xbf, 0x80-0xbf, 0x80-0xbf 	TokenNameCOMMENT_LINE	0xf0, 0x90-0xbf, 0x80-0xbf, 0x80-0xbf 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
FOUR_90bf	TokenNameIdentifier	 FOUR 90bf
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xf4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// 0xf4, 0x80-0xbf, 0x80-0xbf, 0x80-0xbf 	TokenNameCOMMENT_LINE	0xf4, 0x80-0xbf, 0x80-0xbf, 0x80-0xbf 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
FOUR_80bf_3	TokenNameIdentifier	 FOUR 80bf 3
;	TokenNameSEMICOLON	
else	TokenNameelse	
// 0xf1-0xf3, 0x80-0xbf, 0x80-0xbf, 0x80-0xbf 	TokenNameCOMMENT_LINE	0xf1-0xf3, 0x80-0xbf, 0x80-0xbf, 0x80-0xbf 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
FOUR_80bf_3	TokenNameIdentifier	 FOUR 80bf 3
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// malformed. 	TokenNameCOMMENT_LINE	malformed. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWO	TokenNameIdentifier	 TWO
:	TokenNameCOLON	
// validate second byte of 2-byte char, 0x80-0xbf 	TokenNameCOMMENT_LINE	validate second byte of 2-byte char, 0x80-0xbf 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWO_80	TokenNameIdentifier	 TWO 80
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE_a0bf	TokenNameIdentifier	 THREE a0bf
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xe0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_80bf_1	TokenNameIdentifier	 THREE 80bf 1
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE_80bf_1	TokenNameIdentifier	 THREE 80bf 1
:	TokenNameCOLON	
// expecting 0x80-0xbf 	TokenNameCOMMENT_LINE	expecting 0x80-0xbf 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE_80bf_2	TokenNameIdentifier	 THREE 80bf 2
:	TokenNameCOLON	
// expecting 0x80-bf and then another of the same. 	TokenNameCOMMENT_LINE	expecting 0x80-bf and then another of the same. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_80bf_1	TokenNameIdentifier	 THREE 80bf 1
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FOUR_90bf	TokenNameIdentifier	 FOUR 90bf
:	TokenNameCOLON	
// expecting 0x90-bf. 2nd byte of 4byte sequence. after that it should degrade to 80-bf,80-bf (like 3byte seq). 	TokenNameCOMMENT_LINE	expecting 0x90-bf. 2nd byte of 4byte sequence. after that it should degrade to 80-bf,80-bf (like 3byte seq). 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_80bf_2	TokenNameIdentifier	 THREE 80bf 2
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FOUR_80bf_3	TokenNameIdentifier	 FOUR 80bf 3
:	TokenNameCOLON	
// expecting 0x80-bf 3 times. degenerates to THREE_80bf_2. 	TokenNameCOMMENT_LINE	expecting 0x80-bf 3 times. degenerates to THREE_80bf_2. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
THREE_80bf_2	TokenNameIdentifier	 THREE 80bf 2
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// invalid state. 	TokenNameCOMMENT_LINE	invalid state. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if state != start, we've got underflow. that's an error. 	TokenNameCOMMENT_LINE	if state != start, we've got underflow. that's an error. 
return	TokenNamereturn	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
State	TokenNameIdentifier	 State
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Anything that is ascii is also utf8, and they both use bytes 	TokenNameCOMMENT_LINE	Anything that is ascii is also utf8, and they both use bytes 
// comparison 	TokenNameCOMMENT_LINE	comparison 
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
previous	TokenNameIdentifier	 previous
||	TokenNameOR_OR	
previous	TokenNameIdentifier	 previous
==	TokenNameEQUAL_EQUAL	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
