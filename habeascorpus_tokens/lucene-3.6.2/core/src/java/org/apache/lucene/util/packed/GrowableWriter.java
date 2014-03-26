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
/** * Implements {@link PackedInts.Mutable}, but grows the * bit count of the underlying packed ints on-demand. * * <p>@lucene.internal</p> */	TokenNameCOMMENT_JAVADOC	 Implements {@link PackedInts.Mutable}, but grows the bit count of the underlying packed ints on-demand. * <p>@lucene.internal</p> 
public	TokenNamepublic	
class	TokenNameclass	
GrowableWriter	TokenNameIdentifier	 Growable Writer
implements	TokenNameimplements	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
currentMaxValue	TokenNameIdentifier	 current Max Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GrowableWriter	TokenNameIdentifier	 Growable Writer
(	TokenNameLPAREN	
int	TokenNameint	
startBitsPerValue	TokenNameIdentifier	 start Bits Per Value
,	TokenNameCOMMA	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
=	TokenNameEQUAL	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getMutable	TokenNameIdentifier	 get Mutable
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
startBitsPerValue	TokenNameIdentifier	 start Bits Per Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentMaxValue	TokenNameIdentifier	 current Max Value
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
int	TokenNameint	
bpv	TokenNameIdentifier	 bpv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getNextFixedSize	TokenNameIdentifier	 get Next Fixed Size
(	TokenNameLPAREN	
bpv	TokenNameIdentifier	 bpv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
bpv	TokenNameIdentifier	 bpv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
getMutable	TokenNameIdentifier	 get Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// @Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// @Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>=	TokenNameGREATER_EQUAL	
currentMaxValue	TokenNameIdentifier	 current Max Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bpv	TokenNameIdentifier	 bpv
=	TokenNameEQUAL	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentMaxValue	TokenNameIdentifier	 current Max Value
<=	TokenNameLESS_EQUAL	
value	TokenNameIdentifier	 value
&&	TokenNameAND_AND	
currentMaxValue	TokenNameIdentifier	 current Max Value
!=	TokenNameNOT_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bpv	TokenNameIdentifier	 bpv
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
currentMaxValue	TokenNameIdentifier	 current Max Value
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
valueCount	TokenNameIdentifier	 value Count
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
Mutable	TokenNameIdentifier	 Mutable
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
getMutable	TokenNameIdentifier	 get Mutable
(	TokenNameLPAREN	
valueCount	TokenNameIdentifier	 value Count
,	TokenNameCOMMA	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
bpv	TokenNameIdentifier	 bpv
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
valueCount	TokenNameIdentifier	 value Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
currentMaxValue	TokenNameIdentifier	 current Max Value
=	TokenNameEQUAL	
PackedInts	TokenNameIdentifier	 Packed Ints
.	TokenNameDOT	
maxValue	TokenNameIdentifier	 max Value
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GrowableWriter	TokenNameIdentifier	 Growable Writer
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GrowableWriter	TokenNameIdentifier	 Growable Writer
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
GrowableWriter	TokenNameIdentifier	 Growable Writer
(	TokenNameLPAREN	
getBitsPerValue	TokenNameIdentifier	 get Bits Per Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
,	TokenNameCOMMA	
roundFixedSize	TokenNameIdentifier	 round Fixed Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
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
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
