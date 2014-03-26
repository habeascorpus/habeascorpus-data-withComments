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
/** * An FST {@link Outputs} implementation, holding two other outputs. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An FST {@link Outputs} implementation, holding two other outputs. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
PairOutputs	TokenNameIdentifier	 Pair Outputs
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
extends	TokenNameextends	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
PairOutputs	TokenNameIdentifier	 Pair Outputs
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
outputs1	TokenNameIdentifier	 outputs1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
outputs2	TokenNameIdentifier	 outputs2
;	TokenNameSEMICOLON	
/** Holds a single pair of two outputs. */	TokenNameCOMMENT_JAVADOC	 Holds a single pair of two outputs. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
A	TokenNameIdentifier	 A
output1	TokenNameIdentifier	 output1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
B	TokenNameIdentifier	 B
output2	TokenNameIdentifier	 output2
;	TokenNameSEMICOLON	
// use newPair 	TokenNameCOMMENT_LINE	use newPair 
private	TokenNameprivate	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
=	TokenNameEQUAL	
output1	TokenNameIdentifier	 output1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
=	TokenNameEQUAL	
output2	TokenNameIdentifier	 output2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"rawtypes"	TokenNameStringLiteral	rawtypes
)	TokenNameRPAREN	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
pair	TokenNameIdentifier	 pair
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
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
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PairOutputs	TokenNameIdentifier	 Pair Outputs
(	TokenNameLPAREN	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
outputs1	TokenNameIdentifier	 outputs1
,	TokenNameCOMMA	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
outputs2	TokenNameIdentifier	 outputs2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputs1	TokenNameIdentifier	 outputs1
=	TokenNameEQUAL	
outputs1	TokenNameIdentifier	 outputs1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outputs2	TokenNameIdentifier	 outputs2
=	TokenNameEQUAL	
outputs2	TokenNameIdentifier	 outputs2
;	TokenNameSEMICOLON	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new Pair */	TokenNameCOMMENT_JAVADOC	 Create a new Pair 
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
newPair	TokenNameIdentifier	 new Pair
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for assert 	TokenNameCOMMENT_LINE	for assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
pair	TokenNameIdentifier	 pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
noOutput1	TokenNameIdentifier	 no Output1
=	TokenNameEQUAL	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
noOutput2	TokenNameIdentifier	 no Output2
=	TokenNameEQUAL	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
noOutput1	TokenNameIdentifier	 no Output1
&&	TokenNameAND_AND	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
!=	TokenNameNOT_EQUAL	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noOutput2	TokenNameIdentifier	 no Output2
&&	TokenNameAND_AND	
pair	TokenNameIdentifier	 pair
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
!=	TokenNameNOT_EQUAL	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noOutput1	TokenNameIdentifier	 no Output1
&&	TokenNameAND_AND	
noOutput2	TokenNameIdentifier	 no Output2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
!=	TokenNameNOT_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
pair1	TokenNameIdentifier	 pair1
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
pair2	TokenNameIdentifier	 pair2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
pair1	TokenNameIdentifier	 pair1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
pair2	TokenNameIdentifier	 pair2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newPair	TokenNameIdentifier	 new Pair
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
pair1	TokenNameIdentifier	 pair1
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
pair2	TokenNameIdentifier	 pair2
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
pair1	TokenNameIdentifier	 pair1
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
,	TokenNameCOMMA	
pair2	TokenNameIdentifier	 pair2
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newPair	TokenNameIdentifier	 new Pair
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newPair	TokenNameIdentifier	 new Pair
(	TokenNameLPAREN	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
output1	TokenNameIdentifier	 output1
=	TokenNameEQUAL	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
output2	TokenNameIdentifier	 output2
=	TokenNameEQUAL	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newPair	TokenNameIdentifier	 new Pair
(	TokenNameLPAREN	
output1	TokenNameIdentifier	 output1
,	TokenNameCOMMA	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
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
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
>	TokenNameGREATER	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"<pair:"	TokenNameStringLiteral	<pair:
+	TokenNamePLUS	
outputs1	TokenNameIdentifier	 outputs1
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output1	TokenNameIdentifier	 output1
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
outputs2	TokenNameIdentifier	 outputs2
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
output2	TokenNameIdentifier	 output2
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
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
"PairOutputs<"	TokenNameStringLiteral	PairOutputs<
+	TokenNamePLUS	
outputs1	TokenNameIdentifier	 outputs1
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
outputs2	TokenNameIdentifier	 outputs2
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
