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
/** Floating point numbers smaller than 32 bits. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Floating point numbers smaller than 32 bits. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
SmallFloat	TokenNameIdentifier	 Small Float
{	TokenNameLBRACE	
/** Converts a 32 bit float to an 8 bit float. * <br>Values less than zero are all mapped to zero. * <br>Values are truncated (rounded down) to the nearest 8 bit value. * <br>Values between zero and the smallest representable value * are rounded up. * * @param f the 32 bit float to be converted to an 8 bit float (byte) * @param numMantissaBits the number of mantissa bits to use in the byte, with the remainder to be used in the exponent * @param zeroExp the zero-point in the range of exponent values * @return the 8 bit float representation */	TokenNameCOMMENT_JAVADOC	 Converts a 32 bit float to an 8 bit float. <br>Values less than zero are all mapped to zero. <br>Values are truncated (rounded down) to the nearest 8 bit value. <br>Values between zero and the smallest representable value are rounded up. * @param f the 32 bit float to be converted to an 8 bit float (byte) @param numMantissaBits the number of mantissa bits to use in the byte, with the remainder to be used in the exponent @param zeroExp the zero-point in the range of exponent values @return the 8 bit float representation 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
floatToByte	TokenNameIdentifier	 float To Byte
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
numMantissaBits	TokenNameIdentifier	 num Mantissa Bits
,	TokenNameCOMMA	
int	TokenNameint	
zeroExp	TokenNameIdentifier	 zero Exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Adjustment from a float zero exponent to our zero exponent, 	TokenNameCOMMENT_LINE	Adjustment from a float zero exponent to our zero exponent, 
// shifted over to our exponent position. 	TokenNameCOMMENT_LINE	shifted over to our exponent position. 
int	TokenNameint	
fzero	TokenNameIdentifier	 fzero
=	TokenNameEQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
zeroExp	TokenNameIdentifier	 zero Exp
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
numMantissaBits	TokenNameIdentifier	 num Mantissa Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToRawIntBits	TokenNameIdentifier	 float To Raw Int Bits
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
smallfloat	TokenNameIdentifier	 smallfloat
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
numMantissaBits	TokenNameIdentifier	 num Mantissa Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
<=	TokenNameLESS_EQUAL	
fzero	TokenNameIdentifier	 fzero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
// negative numbers and zero both map to 0 byte 	TokenNameCOMMENT_LINE	negative numbers and zero both map to 0 byte 
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// underflow is mapped to smallest non-zero number. 	TokenNameCOMMENT_LINE	underflow is mapped to smallest non-zero number. 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
>=	TokenNameGREATER_EQUAL	
fzero	TokenNameIdentifier	 fzero
+	TokenNamePLUS	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// overflow maps to largest number 	TokenNameCOMMENT_LINE	overflow maps to largest number 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
-	TokenNameMINUS	
fzero	TokenNameIdentifier	 fzero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Converts an 8 bit float to a 32 bit float. */	TokenNameCOMMENT_JAVADOC	 Converts an 8 bit float to a 32 bit float. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
byteToFloat	TokenNameIdentifier	 byte To Float
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
numMantissaBits	TokenNameIdentifier	 num Mantissa Bits
,	TokenNameCOMMA	
int	TokenNameint	
zeroExp	TokenNameIdentifier	 zero Exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 	TokenNameCOMMENT_LINE	on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 
// is only a little bit faster (anywhere from 0% to 7%) 	TokenNameCOMMENT_LINE	is only a little bit faster (anywhere from 0% to 7%) 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
numMantissaBits	TokenNameIdentifier	 num Mantissa Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
zeroExp	TokenNameIdentifier	 zero Exp
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
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
// 	TokenNameCOMMENT_LINE	 
// Some specializations of the generic functions follow. 	TokenNameCOMMENT_LINE	Some specializations of the generic functions follow. 
// The generic functions are just as fast with current (1.5) 	TokenNameCOMMENT_LINE	The generic functions are just as fast with current (1.5) 
// -server JVMs, but still slower with client JVMs. 	TokenNameCOMMENT_LINE	-server JVMs, but still slower with client JVMs. 
// 	TokenNameCOMMENT_LINE	 
/** floatToByte(b, mantissaBits=3, zeroExponent=15) * <br>smallest non-zero value = 5.820766E-10 * <br>largest value = 7.5161928E9 * <br>epsilon = 0.125 */	TokenNameCOMMENT_JAVADOC	 floatToByte(b, mantissaBits=3, zeroExponent=15) <br>smallest non-zero value = 5.820766E-10 <br>largest value = 7.5161928E9 <br>epsilon = 0.125 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
floatToByte315	TokenNameIdentifier	 float To Byte315
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToRawIntBits	TokenNameIdentifier	 float To Raw Int Bits
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
smallfloat	TokenNameIdentifier	 smallfloat
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** byteToFloat(b, mantissaBits=3, zeroExponent=15) */	TokenNameCOMMENT_JAVADOC	 byteToFloat(b, mantissaBits=3, zeroExponent=15) 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
byte315ToFloat	TokenNameIdentifier	 byte315 To Float
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 	TokenNameCOMMENT_LINE	on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 
// is only a little bit faster (anywhere from 0% to 7%) 	TokenNameCOMMENT_LINE	is only a little bit faster (anywhere from 0% to 7%) 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
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
/** floatToByte(b, mantissaBits=5, zeroExponent=2) * <br>smallest nonzero value = 0.033203125 * <br>largest value = 1984.0 * <br>epsilon = 0.03125 */	TokenNameCOMMENT_JAVADOC	 floatToByte(b, mantissaBits=5, zeroExponent=2) <br>smallest nonzero value = 0.033203125 <br>largest value = 1984.0 <br>epsilon = 0.03125 
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
floatToByte52	TokenNameIdentifier	 float To Byte52
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToRawIntBits	TokenNameIdentifier	 float To Raw Int Bits
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
smallfloat	TokenNameIdentifier	 smallfloat
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
bits	TokenNameIdentifier	 bits
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
smallfloat	TokenNameIdentifier	 smallfloat
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** byteToFloat(b, mantissaBits=5, zeroExponent=2) */	TokenNameCOMMENT_JAVADOC	 byteToFloat(b, mantissaBits=5, zeroExponent=2) 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
byte52ToFloat	TokenNameIdentifier	 byte52 To Float
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 	TokenNameCOMMENT_LINE	on Java1.5 & 1.6 JVMs, prebuilding a decoding array and doing a lookup 
// is only a little bit faster (anywhere from 0% to 7%) 	TokenNameCOMMENT_LINE	is only a little bit faster (anywhere from 0% to 7%) 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
