package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
packed	TokenNameIdentifier	 packed
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
// Packs high order byte first, to match 	TokenNameCOMMENT_LINE	Packs high order byte first, to match 
// IndexOutput.writeInt/Long/Short byte order 	TokenNameCOMMENT_LINE	IndexOutput.writeInt/Long/Short byte order 
/** * Generic writer for space-optimal packed values. The resulting bits can be * used directly by Packed32, Packed64 and PackedDirect* and will always be * long-aligned. */	TokenNameCOMMENT_JAVADOC	 Generic writer for space-optimal packed values. The resulting bits can be used directly by Packed32, Packed64 and PackedDirect* and will always be long-aligned. 
class	TokenNameclass	
PackedWriter	TokenNameIdentifier	 Packed Writer
extends	TokenNameextends	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
pending	TokenNameIdentifier	 pending
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
;	TokenNameSEMICOLON	
// masks[n-1] masks for bottom n bits 	TokenNameCOMMENT_LINE	masks[n-1] masks for bottom n bits 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
written	TokenNameIdentifier	 written
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PackedWriter	TokenNameIdentifier	 Packed Writer
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
int	TokenNameint	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
bitsPerValue	TokenNameIdentifier	 bits Per Value
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
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
bitsPerValue	TokenNameIdentifier	 bits Per Value
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do not call this after finish */	TokenNameCOMMENT_JAVADOC	 Do not call this after finish 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
v	TokenNameIdentifier	 v
<=	TokenNameLESS_EQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
:	TokenNameCOLON	
"v="	TokenNameStringLiteral	v=
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
" maxValue="	TokenNameStringLiteral	 maxValue=
+	TokenNamePLUS	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println(" packedw add v=" + v + " pendingBitPos=" + pendingBitPos); 	TokenNameCOMMENT_LINE	System.out.println(" packedw add v=" + v + " pendingBitPos=" + pendingBitPos); 
// TODO 	TokenNameCOMMENT_LINE	TODO 
if	TokenNameif	
(	TokenNameLPAREN	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
>=	TokenNameGREATER_EQUAL	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not split 	TokenNameCOMMENT_LINE	not split 
// write-once, so we can |= w/o first masking to 0s 	TokenNameCOMMENT_LINE	write-once, so we can |= w/o first masking to 0s 
pending	TokenNameIdentifier	 pending
|=	TokenNameOR_EQUAL	
v	TokenNameIdentifier	 v
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
-	TokenNameMINUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
==	TokenNameEQUAL_EQUAL	
bitsPerValue	TokenNameIdentifier	 bits Per Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// flush 	TokenNameCOMMENT_LINE	flush 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
pending	TokenNameIdentifier	 pending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pending	TokenNameIdentifier	 pending
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
-=	TokenNameMINUS_EQUAL	
bitsPerValue	TokenNameIdentifier	 bits Per Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// split 	TokenNameCOMMENT_LINE	split 
// write top pendingBitPos bits of value into bottom bits of pending 	TokenNameCOMMENT_LINE	write top pendingBitPos bits of value into bottom bits of pending 
pending	TokenNameIdentifier	 pending
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
bitsPerValue	TokenNameIdentifier	 bits Per Value
-	TokenNameMINUS	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println(" part1 (v >> " + (bitsPerValue - pendingBitPos) + ") & " + masks[pendingBitPos-1]); 	TokenNameCOMMENT_LINE	System.out.println(" part1 (v >> " + (bitsPerValue - pendingBitPos) + ") & " + masks[pendingBitPos-1]); 
// flush 	TokenNameCOMMENT_LINE	flush 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
pending	TokenNameIdentifier	 pending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write bottom (bitsPerValue - pendingBitPos) bits of value into top bits of pending 	TokenNameCOMMENT_LINE	write bottom (bitsPerValue - pendingBitPos) bits of value into top bits of pending 
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
+	TokenNamePLUS	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
;	TokenNameSEMICOLON	
//System.out.println(" part2 v << " + pendingBitPos); 	TokenNameCOMMENT_LINE	System.out.println(" part2 v << " + pendingBitPos); 
pending	TokenNameIdentifier	 pending
=	TokenNameEQUAL	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<<	TokenNameLEFT_SHIFT	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
written	TokenNameIdentifier	 written
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
written	TokenNameIdentifier	 written
<	TokenNameLESS	
valueCount	TokenNameIdentifier	 value Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Auto flush 	TokenNameCOMMENT_LINE	Auto flush 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pendingBitPos	TokenNameIdentifier	 pending Bit Pos
!=	TokenNameNOT_EQUAL	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
pending	TokenNameIdentifier	 pending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"PackedWriter(written "	TokenNameStringLiteral	PackedWriter(written 
+	TokenNamePLUS	
written	TokenNameIdentifier	 written
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
valueCount	TokenNameIdentifier	 value Count
+	TokenNamePLUS	
" with "	TokenNameStringLiteral	 with 
+	TokenNamePLUS	
bitsPerValue	TokenNameIdentifier	 bits Per Value
+	TokenNamePLUS	
" bits/value)"	TokenNameStringLiteral	 bits/value)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
