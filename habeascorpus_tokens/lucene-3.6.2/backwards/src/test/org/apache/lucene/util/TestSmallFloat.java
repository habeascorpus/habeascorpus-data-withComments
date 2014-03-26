package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestSmallFloat	TokenNameIdentifier	 Test Small Float
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
// original lucene byteToFloat 	TokenNameCOMMENT_LINE	original lucene byteToFloat 
static	TokenNamestatic	
float	TokenNamefloat	
orig_byteToFloat	TokenNameIdentifier	 orig byte To Float
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// zero is a special case 	TokenNameCOMMENT_LINE	zero is a special case 
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
&	TokenNameAND	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
+	TokenNamePLUS	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
mantissa	TokenNameIdentifier	 mantissa
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// original lucene floatToByte (since lucene 1.3) 	TokenNameCOMMENT_LINE	original lucene floatToByte (since lucene 1.3) 
static	TokenNamestatic	
byte	TokenNamebyte	
orig_floatToByte_v13	TokenNameIdentifier	 orig float To Byte v13
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
// round negatives up to zero 	TokenNameCOMMENT_LINE	round negatives up to zero 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
// zero is a special case 	TokenNameCOMMENT_LINE	zero is a special case 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse float into parts 	TokenNameCOMMENT_LINE	parse float into parts 
int	TokenNameint	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
0xffffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// overflow: use max value 	TokenNameCOMMENT_LINE	overflow: use max value 
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// underflow: use min value 	TokenNameCOMMENT_LINE	underflow: use min value 
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
mantissa	TokenNameIdentifier	 mantissa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pack into a byte 	TokenNameCOMMENT_LINE	pack into a byte 
}	TokenNameRBRACE	
// This is the original lucene floatToBytes (from v1.3) 	TokenNameCOMMENT_LINE	This is the original lucene floatToBytes (from v1.3) 
// except with the underflow detection bug fixed for values like 5.8123817E-10f 	TokenNameCOMMENT_LINE	except with the underflow detection bug fixed for values like 5.8123817E-10f 
static	TokenNamestatic	
byte	TokenNamebyte	
orig_floatToByte	TokenNameIdentifier	 orig float To Byte
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
// round negatives up to zero 	TokenNameCOMMENT_LINE	round negatives up to zero 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
// zero is a special case 	TokenNameCOMMENT_LINE	zero is a special case 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse float into parts 	TokenNameCOMMENT_LINE	parse float into parts 
int	TokenNameint	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
&	TokenNameAND	
0xffffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
>	TokenNameGREATER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// overflow: use max value 	TokenNameCOMMENT_LINE	overflow: use max value 
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
exponent	TokenNameIdentifier	 exponent
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
mantissa	TokenNameIdentifier	 mantissa
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// underflow: use min value 	TokenNameCOMMENT_LINE	underflow: use min value 
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mantissa	TokenNameIdentifier	 mantissa
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exponent	TokenNameIdentifier	 exponent
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
mantissa	TokenNameIdentifier	 mantissa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pack into a byte 	TokenNameCOMMENT_LINE	pack into a byte 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testByteToFloat	TokenNameIdentifier	 test Byte To Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
orig_byteToFloat	TokenNameIdentifier	 orig byte To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
byteToFloat	TokenNameIdentifier	 byte To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f3	TokenNameIdentifier	 f3
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
byte315ToFloat	TokenNameIdentifier	 byte315 To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
,	TokenNameCOMMA	
f2	TokenNameIdentifier	 f2
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
f2	TokenNameIdentifier	 f2
,	TokenNameCOMMA	
f3	TokenNameIdentifier	 f3
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f4	TokenNameIdentifier	 f4
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
byteToFloat	TokenNameIdentifier	 byte To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f5	TokenNameIdentifier	 f5
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
byte52ToFloat	TokenNameIdentifier	 byte52 To Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
f4	TokenNameIdentifier	 f4
,	TokenNameCOMMA	
f5	TokenNameIdentifier	 f5
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFloatToByte	TokenNameIdentifier	 test Float To Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
orig_floatToByte_v13	TokenNameIdentifier	 orig float To Byte v13
(	TokenNameLPAREN	
5.8123817E-10f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify the old bug (see LUCENE-2937) 	TokenNameCOMMENT_LINE	verify the old bug (see LUCENE-2937) 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
orig_floatToByte	TokenNameIdentifier	 orig float To Byte
(	TokenNameLPAREN	
5.8123817E-10f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify it's fixed in this test code 	TokenNameCOMMENT_LINE	verify it's fixed in this test code 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
5.8123817E-10f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify it's fixed 	TokenNameCOMMENT_LINE	verify it's fixed 
// test some constants 	TokenNameCOMMENT_LINE	test some constants 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// underflow rounds up to smallest positive 	TokenNameCOMMENT_LINE	underflow rounds up to smallest positive 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// overflow rounds down to largest positive 	TokenNameCOMMENT_LINE	overflow rounds down to largest positive 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// all negatives map to 0 	TokenNameCOMMENT_LINE	all negatives map to 0 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
-	TokenNameMINUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
-	TokenNameMINUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// up iterations for more exhaustive test after changing something 	TokenNameCOMMENT_LINE	up iterations for more exhaustive test after changing something 
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
100000	TokenNameIntegerLiteral	
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
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// skip NaN 	TokenNameCOMMENT_LINE	skip NaN 
byte	TokenNamebyte	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
orig_floatToByte	TokenNameIdentifier	 orig float To Byte
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte	TokenNameIdentifier	 float To Byte
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b3	TokenNameIdentifier	 b3
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
,	TokenNameCOMMA	
b3	TokenNameIdentifier	 b3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b4	TokenNameIdentifier	 b4
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte	TokenNameIdentifier	 float To Byte
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b5	TokenNameIdentifier	 b5
=	TokenNameEQUAL	
SmallFloat	TokenNameIdentifier	 Small Float
.	TokenNameDOT	
floatToByte52	TokenNameIdentifier	 float To Byte52
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b4	TokenNameIdentifier	 b4
,	TokenNameCOMMA	
b5	TokenNameIdentifier	 b5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*** // Do an exhaustive test of all possible floating point values // for the 315 float against the original norm encoding in Similarity. // Takes 75 seconds on my Pentium4 3GHz, with Java5 -server public void testAllFloats() { for(int i = Integer.MIN_VALUE;;i++) { float f = Float.intBitsToFloat(i); if (f==f) { // skip non-numbers byte b1 = orig_floatToByte(f); byte b2 = SmallFloat.floatToByte315(f); if (b1!=b2 || b2==0 && f>0) { fail("Failed floatToByte315 for float " + f + " source bits="+Integer.toHexString(i) + " float raw bits=" + Integer.toHexString(Float.floatToRawIntBits(i))); } } if (i==Integer.MAX_VALUE) break; } } ***/	TokenNameCOMMENT_JAVADOC	* // Do an exhaustive test of all possible floating point values // for the 315 float against the original norm encoding in Similarity. // Takes 75 seconds on my Pentium4 3GHz, with Java5 -server public void testAllFloats() { for(int i = Integer.MIN_VALUE;;i++) { float f = Float.intBitsToFloat(i); if (f==f) { // skip non-numbers byte b1 = orig_floatToByte(f); byte b2 = SmallFloat.floatToByte315(f); if (b1!=b2 || b2==0 && f>0) { fail("Failed floatToByte315 for float " + f + " source bits="+Integer.toHexString(i) + " float raw bits=" + Integer.toHexString(Float.floatToRawIntBits(i))); } } if (i==Integer.MAX_VALUE) break; } } **
}	TokenNameRBRACE	
