/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
;	TokenNameSEMICOLON	
/** * This class is a very simple bitset class. The DFA content model code needs * to support a bit set, but the java BitSet class is way, way overkill. Our * bitset never needs to be expanded after creation, hash itself, etc... * * Since the vast majority of content models will never require more than 64 * bits, and since allocation of anything in Java is expensive, this class * provides a hybrid implementation that uses two ints for instances that use * 64 bits or fewer. It has a byte array reference member which will only be * used if more than 64 bits are required. * * Note that the code that uses this class will never perform operations * on sets of different sizes, so that check does not have to be made here. * * @xerces.internal * * @version $Id: CMStateSet.java 446752 2006-09-15 21:55:19Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is a very simple bitset class. The DFA content model code needs to support a bit set, but the java BitSet class is way, way overkill. Our bitset never needs to be expanded after creation, hash itself, etc... * Since the vast majority of content models will never require more than 64 bits, and since allocation of anything in Java is expensive, this class provides a hybrid implementation that uses two ints for instances that use 64 bits or fewer. It has a byte array reference member which will only be used if more than 64 bits are required. * Note that the code that uses this class will never perform operations on sets of different sizes, so that check does not have to be made here. * @xerces.internal * @version $Id: CMStateSet.java 446752 2006-09-15 21:55:19Z mrglavas $ 
// made this class public so it can be accessed by 	TokenNameCOMMENT_LINE	made this class public so it can be accessed by 
// the XS content models from the schema package -neilg. 	TokenNameCOMMENT_LINE	the XS content models from the schema package -neilg. 
public	TokenNamepublic	
class	TokenNameclass	
CMStateSet	TokenNameIdentifier	 CM State Set
{	TokenNameLBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
CMStateSet	TokenNameIdentifier	 CM State Set
(	TokenNameLPAREN	
int	TokenNameint	
bitCount	TokenNameIdentifier	 bit Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Store the required bit count and insure its legal 	TokenNameCOMMENT_LINE	Store the required bit count and insure its legal 
fBitCount	TokenNameIdentifier	 f Bit Count
=	TokenNameEQUAL	
bitCount	TokenNameIdentifier	 bit Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_CMSI"	TokenNameStringLiteral	ImplementationMessages.VAL_CMSI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// See if we need to allocate the byte array or whether we can live 	TokenNameCOMMENT_LINE	See if we need to allocate the byte array or whether we can live 
// within the 64 bit high performance scheme. 	TokenNameCOMMENT_LINE	within the 64 bit high performance scheme. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
>	TokenNameGREATER	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fByteCount	TokenNameIdentifier	 f Byte Count
=	TokenNameEQUAL	
fBitCount	TokenNameIdentifier	 f Bit Count
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
%	TokenNameREMAINDER	
8	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fByteCount	TokenNameIdentifier	 f Byte Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fByteArray	TokenNameIdentifier	 f Byte Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
fByteCount	TokenNameIdentifier	 f Byte Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Init all the bits to zero 	TokenNameCOMMENT_LINE	Init all the bits to zero 
zeroBits	TokenNameIdentifier	 zero Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Public inherited methods 	TokenNameCOMMENT_LINE	Public inherited methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
strRet	TokenNameIdentifier	 str Ret
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fBitCount	TokenNameIdentifier	 f Bit Count
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" }"	TokenNameStringLiteral	 }
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
exToCatch	TokenNameIdentifier	 ex To Catch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// We know this won't happen but we have to catch it to avoid it 	TokenNameCOMMENT_LINE	We know this won't happen but we have to catch it to avoid it 
// having to be in our 'throws' list. 	TokenNameCOMMENT_LINE	having to be in our 'throws' list. 
// 	TokenNameCOMMENT_LINE	 
}	TokenNameRBRACE	
return	TokenNamereturn	
strRet	TokenNameIdentifier	 str Ret
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Package final methods 	TokenNameCOMMENT_LINE	Package final methods 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// the XS content models from the schema package -neilg. 	TokenNameCOMMENT_LINE	the XS content models from the schema package -neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
setToAnd	TokenNameIdentifier	 set To And
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBits1	TokenNameIdentifier	 f Bits1
&=	TokenNameAND_EQUAL	
setToAnd	TokenNameIdentifier	 set To And
.	TokenNameDOT	
fBits1	TokenNameIdentifier	 f Bits1
;	TokenNameSEMICOLON	
fBits2	TokenNameIdentifier	 f Bits2
&=	TokenNameAND_EQUAL	
setToAnd	TokenNameIdentifier	 set To And
.	TokenNameDOT	
fBits2	TokenNameIdentifier	 f Bits2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
setToAnd	TokenNameIdentifier	 set To And
.	TokenNameDOT	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
int	TokenNameint	
bitToGet	TokenNameIdentifier	 bit To Get
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitToGet	TokenNameIdentifier	 bit To Get
>=	TokenNameGREATER_EQUAL	
fBitCount	TokenNameIdentifier	 f Bit Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_CMSI"	TokenNameStringLiteral	ImplementationMessages.VAL_CMSI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
bitToGet	TokenNameIdentifier	 bit To Get
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitToGet	TokenNameIdentifier	 bit To Get
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
fBits1	TokenNameIdentifier	 f Bits1
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
fBits2	TokenNameIdentifier	 f Bits2
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Create the mask and byte values 	TokenNameCOMMENT_LINE	Create the mask and byte values 
final	TokenNamefinal	
byte	TokenNamebyte	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
bitToGet	TokenNameIdentifier	 bit To Get
%	TokenNameREMAINDER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ofs	TokenNameIdentifier	 ofs
=	TokenNameEQUAL	
bitToGet	TokenNameIdentifier	 bit To Get
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// And access the right bit and byte 	TokenNameCOMMENT_LINE	And access the right bit and byte 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
ofs	TokenNameIdentifier	 ofs
]	TokenNameRBRACKET	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fBits1	TokenNameIdentifier	 f Bits1
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fBits2	TokenNameIdentifier	 f Bits2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSameSet	TokenNameIdentifier	 is Same Set
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
setToCompare	TokenNameIdentifier	 set To Compare
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
!=	TokenNameNOT_EQUAL	
setToCompare	TokenNameIdentifier	 set To Compare
.	TokenNameDOT	
fBitCount	TokenNameIdentifier	 f Bit Count
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fBits1	TokenNameIdentifier	 f Bits1
==	TokenNameEQUAL_EQUAL	
setToCompare	TokenNameIdentifier	 set To Compare
.	TokenNameDOT	
fBits1	TokenNameIdentifier	 f Bits1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fBits2	TokenNameIdentifier	 f Bits2
==	TokenNameEQUAL_EQUAL	
setToCompare	TokenNameIdentifier	 set To Compare
.	TokenNameDOT	
fBits2	TokenNameIdentifier	 f Bits2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
setToCompare	TokenNameIdentifier	 set To Compare
.	TokenNameDOT	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the XS content models from the schema package -neilg. 	TokenNameCOMMENT_LINE	the XS content models from the schema package -neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
setToOr	TokenNameIdentifier	 set To Or
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBits1	TokenNameIdentifier	 f Bits1
|=	TokenNameOR_EQUAL	
setToOr	TokenNameIdentifier	 set To Or
.	TokenNameDOT	
fBits1	TokenNameIdentifier	 f Bits1
;	TokenNameSEMICOLON	
fBits2	TokenNameIdentifier	 f Bits2
|=	TokenNameOR_EQUAL	
setToOr	TokenNameIdentifier	 set To Or
.	TokenNameDOT	
fBits2	TokenNameIdentifier	 f Bits2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
setToOr	TokenNameIdentifier	 set To Or
.	TokenNameDOT	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setBit	TokenNameIdentifier	 set Bit
(	TokenNameLPAREN	
int	TokenNameint	
bitToSet	TokenNameIdentifier	 bit To Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitToSet	TokenNameIdentifier	 bit To Set
>=	TokenNameGREATER_EQUAL	
fBitCount	TokenNameIdentifier	 f Bit Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_CMSI"	TokenNameStringLiteral	ImplementationMessages.VAL_CMSI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
bitToSet	TokenNameIdentifier	 bit To Set
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bitToSet	TokenNameIdentifier	 bit To Set
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBits1	TokenNameIdentifier	 f Bits1
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
fBits1	TokenNameIdentifier	 f Bits1
|=	TokenNameOR_EQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fBits2	TokenNameIdentifier	 f Bits2
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
fBits2	TokenNameIdentifier	 f Bits2
|=	TokenNameOR_EQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Create the mask and byte values 	TokenNameCOMMENT_LINE	Create the mask and byte values 
final	TokenNamefinal	
byte	TokenNamebyte	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
bitToSet	TokenNameIdentifier	 bit To Set
%	TokenNameREMAINDER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ofs	TokenNameIdentifier	 ofs
=	TokenNameEQUAL	
bitToSet	TokenNameIdentifier	 bit To Set
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// And access the right bit and byte 	TokenNameCOMMENT_LINE	And access the right bit and byte 
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
ofs	TokenNameIdentifier	 ofs
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
ofs	TokenNameIdentifier	 ofs
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// the XS content models from the schema package -neilg. 	TokenNameCOMMENT_LINE	the XS content models from the schema package -neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
srcSet	TokenNameIdentifier	 src Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// They have to be the same size 	TokenNameCOMMENT_LINE	They have to be the same size 
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
!=	TokenNameNOT_EQUAL	
srcSet	TokenNameIdentifier	 src Set
.	TokenNameDOT	
fBitCount	TokenNameIdentifier	 f Bit Count
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_CMSI"	TokenNameStringLiteral	ImplementationMessages.VAL_CMSI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBits1	TokenNameIdentifier	 f Bits1
=	TokenNameEQUAL	
srcSet	TokenNameIdentifier	 src Set
.	TokenNameDOT	
fBits1	TokenNameIdentifier	 f Bits1
;	TokenNameSEMICOLON	
fBits2	TokenNameIdentifier	 f Bits2
=	TokenNameEQUAL	
srcSet	TokenNameIdentifier	 src Set
.	TokenNameDOT	
fBits2	TokenNameIdentifier	 f Bits2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcSet	TokenNameIdentifier	 src Set
.	TokenNameDOT	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// had to make this method public so it could be accessed from 	TokenNameCOMMENT_LINE	had to make this method public so it could be accessed from 
// schema package - neilg. 	TokenNameCOMMENT_LINE	schema package - neilg. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
zeroBits	TokenNameIdentifier	 zero Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBits1	TokenNameIdentifier	 f Bits1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fBits2	TokenNameIdentifier	 f Bits2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
// Private data members 	TokenNameCOMMENT_LINE	Private data members 
// 	TokenNameCOMMENT_LINE	 
// fBitCount 	TokenNameCOMMENT_LINE	fBitCount 
// The count of bits that the outside world wants to support, 	TokenNameCOMMENT_LINE	The count of bits that the outside world wants to support, 
// so its the max bit index plus one. 	TokenNameCOMMENT_LINE	so its the max bit index plus one. 
// 	TokenNameCOMMENT_LINE	 
// fByteCount 	TokenNameCOMMENT_LINE	fByteCount 
// If the bit count is > 64, then we use the fByteArray member to 	TokenNameCOMMENT_LINE	If the bit count is > 64, then we use the fByteArray member to 
// store the bits, and this indicates its size in bytes. Otherwise 	TokenNameCOMMENT_LINE	store the bits, and this indicates its size in bytes. Otherwise 
// its value is meaningless. 	TokenNameCOMMENT_LINE	its value is meaningless. 
// 	TokenNameCOMMENT_LINE	 
// fBits1 	TokenNameCOMMENT_LINE	fBits1 
// fBits2 	TokenNameCOMMENT_LINE	fBits2 
// When the bit count is < 64 (very common), these hold the bits. 	TokenNameCOMMENT_LINE	When the bit count is < 64 (very common), these hold the bits. 
// Otherwise, the fByteArray member holds htem. 	TokenNameCOMMENT_LINE	Otherwise, the fByteArray member holds htem. 
// ------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
int	TokenNameint	
fBitCount	TokenNameIdentifier	 f Bit Count
;	TokenNameSEMICOLON	
int	TokenNameint	
fByteCount	TokenNameIdentifier	 f Byte Count
;	TokenNameSEMICOLON	
int	TokenNameint	
fBits1	TokenNameIdentifier	 f Bits1
;	TokenNameSEMICOLON	
int	TokenNameint	
fBits2	TokenNameIdentifier	 f Bits2
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fByteArray	TokenNameIdentifier	 f Byte Array
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CMStateSet	TokenNameIdentifier	 CM State Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isSameSet	TokenNameIdentifier	 is Same Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMStateSet	TokenNameIdentifier	 CM State Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBitCount	TokenNameIdentifier	 f Bit Count
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fBits1	TokenNameIdentifier	 f Bits1
+	TokenNamePLUS	
fBits2	TokenNameIdentifier	 f Bits2
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fByteCount	TokenNameIdentifier	 f Byte Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
fByteArray	TokenNameIdentifier	 f Byte Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
