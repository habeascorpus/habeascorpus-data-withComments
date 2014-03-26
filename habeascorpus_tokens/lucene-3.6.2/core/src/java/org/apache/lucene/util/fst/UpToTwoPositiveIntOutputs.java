package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
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
/** * An FST {@link Outputs} implementation where each output * is one or two non-negative long values. If it's a * single output, Long is returned; else, TwoLongs. Order * is preserved in the TwoLongs case, ie .first is the first * input/output added to Builder, and .second is the * second. You cannot store 0 output with this (that's * reserved to mean "no output")! * * NOTE: the resulting FST is not guaranteed to be minimal! * See {@link Builder}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An FST {@link Outputs} implementation where each output is one or two non-negative long values. If it's a single output, Long is returned; else, TwoLongs. Order is preserved in the TwoLongs case, ie .first is the first input/output added to Builder, and .second is the second. You cannot store 0 output with this (that's reserved to mean "no output")! * NOTE: the resulting FST is not guaranteed to be minimal! See {@link Builder}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
extends	TokenNameextends	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Holds two long outputs. */	TokenNameCOMMENT_JAVADOC	 Holds two long outputs. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
TwoLongs	TokenNameIdentifier	 Two Longs
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TwoLongs	TokenNameIdentifier	 Two Longs
(	TokenNameLPAREN	
long	TokenNamelong	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
long	TokenNamelong	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
assert	TokenNameassert	
first	TokenNameIdentifier	 first
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
second	TokenNameIdentifier	 second
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
"TwoLongs:"	TokenNameStringLiteral	TwoLongs:
+	TokenNamePLUS	
first	TokenNameIdentifier	 first
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
TwoLongs	TokenNameIdentifier	 Two Longs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TwoLongs	TokenNameIdentifier	 Two Longs
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TwoLongs	TokenNameIdentifier	 Two Longs
)	TokenNameRPAREN	
_other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
second	TokenNameIdentifier	 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
^	TokenNameXOR	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
^	TokenNameXOR	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
>>	TokenNameRIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Long	TokenNameIdentifier	 Long
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
doShare	TokenNameIdentifier	 do Share
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
singletonShare	TokenNameIdentifier	 singleton Share
=	TokenNameEQUAL	
new	TokenNamenew	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
singletonNoShare	TokenNameIdentifier	 singleton No Share
=	TokenNameEQUAL	
new	TokenNamenew	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doShare	TokenNameIdentifier	 do Share
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doShare	TokenNameIdentifier	 do Share
=	TokenNameEQUAL	
doShare	TokenNameIdentifier	 do Share
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
UpToTwoPositiveIntOutputs	TokenNameIdentifier	 Up To Two Positive Int Outputs
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doShare	TokenNameIdentifier	 do Share
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doShare	TokenNameIdentifier	 do Share
?	TokenNameQUESTION	
singletonShare	TokenNameIdentifier	 singleton Share
:	TokenNameCOLON	
singletonNoShare	TokenNameIdentifier	 singleton No Share
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TwoLongs	TokenNameIdentifier	 Two Longs
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
long	TokenNamelong	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
long	TokenNamelong	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TwoLongs	TokenNameIdentifier	 Two Longs
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
_output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_output2	TokenNameIdentifier	 output2
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
output1	TokenNameIdentifier	 output1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_output1	TokenNameIdentifier	 output1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
output2	TokenNameIdentifier	 output2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_output2	TokenNameIdentifier	 output2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
||	TokenNameOR_OR	
output2	TokenNameIdentifier	 output2
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
doShare	TokenNameIdentifier	 do Share
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
output1	TokenNameIdentifier	 output1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output2	TokenNameIdentifier	 output2
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output1	TokenNameIdentifier	 output1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
_inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_inc	TokenNameIdentifier	 inc
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
>=	TokenNameGREATER_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
-	TokenNameMINUS	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
_output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
instanceof	TokenNameinstanceof	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
TwoLongs	TokenNameIdentifier	 Two Longs
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TwoLongs	TokenNameIdentifier	 Two Longs
)	TokenNameRPAREN	
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TwoLongs	TokenNameIdentifier	 Two Longs
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
first	TokenNameIdentifier	 first
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
second	TokenNameIdentifier	 second
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_output	TokenNameIdentifier	 output
instanceof	TokenNameinstanceof	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
TwoLongs	TokenNameIdentifier	 Two Longs
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TwoLongs	TokenNameIdentifier	 Two Longs
)	TokenNameRPAREN	
_output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
first	TokenNameIdentifier	 first
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// single long 	TokenNameCOMMENT_LINE	single long 
final	TokenNamefinal	
long	TokenNamelong	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// two longs 	TokenNameCOMMENT_LINE	two longs 
final	TokenNamefinal	
long	TokenNamelong	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TwoLongs	TokenNameIdentifier	 Two Longs
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Long	TokenNameIdentifier	 Long
;	TokenNameSEMICOLON	
assert	TokenNameassert	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used only by assert 	TokenNameCOMMENT_LINE	Used only by assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
boolean	TokenNameboolean	
allowDouble	TokenNameIdentifier	 allow Double
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
allowDouble	TokenNameIdentifier	 allow Double
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
_o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Long	TokenNameIdentifier	 Long
;	TokenNameSEMICOLON	
return	TokenNamereturn	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TwoLongs	TokenNameIdentifier	 Two Longs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
_o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TwoLongs	TokenNameIdentifier	 Two Longs
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
