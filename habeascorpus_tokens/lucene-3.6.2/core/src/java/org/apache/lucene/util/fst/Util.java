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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntsRef	TokenNameIdentifier	 Ints Ref
;	TokenNameSEMICOLON	
/** Static helper methods. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Static helper methods. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Util	TokenNameIdentifier	 Util
{	TokenNameLBRACE	
private	TokenNameprivate	
Util	TokenNameIdentifier	 Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Looks up the output for this input, or null if the * input is not accepted. */	TokenNameCOMMENT_JAVADOC	 Looks up the output for this input, or null if the input is not accepted. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: would be nice not to alloc this on every lookup 	TokenNameCOMMENT_LINE	TODO: would be nice not to alloc this on every lookup 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Accumulate output as we go 	TokenNameCOMMENT_LINE	Accumulate output as we go 
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: maybe a CharsRef version for BYTE2 	TokenNameCOMMENT_LINE	TODO: maybe a CharsRef version for BYTE2 
/** Looks up the output for this input, or null if the * input is not accepted */	TokenNameCOMMENT_JAVADOC	 Looks up the output for this input, or null if the input is not accepted 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
inputType	TokenNameIdentifier	 input Type
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
.	TokenNameDOT	
BYTE1	TokenNameIdentifier	 BYT E1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: would be nice not to alloc this on every lookup 	TokenNameCOMMENT_LINE	TODO: would be nice not to alloc this on every lookup 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Accumulate output as we go 	TokenNameCOMMENT_LINE	Accumulate output as we go 
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Reverse lookup (lookup by output instead of by input), * in the special case when your FSTs outputs are * strictly ascending. This locates the input/output * pair where the output is equal to the target, and will * return null if that output does not exist. * * <p>NOTE: this only works with FST<Long>, only * works when the outputs are ascending in order with * the inputs and only works when you shared * the outputs (pass doShare=true to {@link * PositiveIntOutputs#getSingleton}). * For example, simple ordinals (0, 1, * 2, ...), or file offets (when appending to a file) * fit this. */	TokenNameCOMMENT_JAVADOC	 Reverse lookup (lookup by output instead of by input), in the special case when your FSTs outputs are strictly ascending. This locates the input/output pair where the output is equal to the target, and will return null if that output does not exist. * <p>NOTE: this only works with FST<Long>, only works when the outputs are ascending in order with the inputs and only works when you shared the outputs (pass doShare=true to {@link PositiveIntOutputs#getSingleton}). For example, simple ordinals (0, 1, 2, ...), or file offets (when appending to a file) fit this. 
public	TokenNamepublic	
static	TokenNamestatic	
IntsRef	TokenNameIdentifier	 Ints Ref
getByOutput	TokenNameIdentifier	 get By Output
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
long	TokenNamelong	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: would be nice not to alloc this on every lookup 	TokenNameCOMMENT_LINE	TODO: would be nice not to alloc this on every lookup 
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
scratchArc	TokenNameIdentifier	 scratch Arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IntsRef	TokenNameIdentifier	 Ints Ref
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("reverseLookup output=" + targetOutput); 	TokenNameCOMMENT_LINE	System.out.println("reverseLookup output=" + targetOutput); 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("loop: output=" + output + " upto=" + upto + " arc=" + arc); 	TokenNameCOMMENT_LINE	System.out.println("loop: output=" + output + " upto=" + upto + " arc=" + arc); 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
;	TokenNameSEMICOLON	
//System.out.println(" isFinal finalOutput=" + finalOutput); 	TokenNameCOMMENT_LINE	System.out.println(" isFinal finalOutput=" + finalOutput); 
if	TokenNameif	
(	TokenNameLPAREN	
finalOutput	TokenNameIdentifier	 final Output
==	TokenNameEQUAL_EQUAL	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
//System.out.println(" found!"); 	TokenNameCOMMENT_LINE	System.out.println(" found!"); 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
finalOutput	TokenNameIdentifier	 final Output
>	TokenNameGREATER	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" not found!"); 	TokenNameCOMMENT_LINE	System.out.println(" not found!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
targetHasArcs	TokenNameIdentifier	 target Has Arcs
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" targetHasArcs"); 	TokenNameCOMMENT_LINE	System.out.println(" targetHasArcs"); 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstRealTargetArc	TokenNameIdentifier	 read First Real Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
bytesPerArc	TokenNameIdentifier	 bytes Per Arc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("bsearch: numArcs=" + arc.numArcs + " target=" + targetOutput + " output=" + output); 	TokenNameCOMMENT_LINE	System.out.println("bsearch: numArcs=" + arc.numArcs + " target=" + targetOutput + " output=" + output); 
boolean	TokenNameboolean	
exact	TokenNameIdentifier	 exact
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
posArcsStart	TokenNameIdentifier	 pos Arcs Start
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
bytesPerArc	TokenNameIdentifier	 bytes Per Arc
*	TokenNameMULTIPLY	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readLabel	TokenNameIdentifier	 read Label
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
minArcOutput	TokenNameIdentifier	 min Arc Output
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BIT_ARC_HAS_OUTPUT	TokenNameIdentifier	 BIT  ARC  HAS  OUTPUT
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
arcOutput	TokenNameIdentifier	 arc Output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minArcOutput	TokenNameIdentifier	 min Arc Output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
arcOutput	TokenNameIdentifier	 arc Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
minArcOutput	TokenNameIdentifier	 min Arc Output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" cycle mid=" + mid + " label=" + (char) label + " output=" + minArcOutput); 	TokenNameCOMMENT_LINE	System.out.println(" cycle mid=" + mid + " label=" + (char) label + " output=" + minArcOutput); 
if	TokenNameif	
(	TokenNameLPAREN	
minArcOutput	TokenNameIdentifier	 min Arc Output
==	TokenNameEQUAL_EQUAL	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exact	TokenNameIdentifier	 exact
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minArcOutput	TokenNameIdentifier	 min Arc Output
<	TokenNameLESS	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
exact	TokenNameIdentifier	 exact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
low	TokenNameIdentifier	 low
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
+=	TokenNamePLUS_EQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
prevArc	TokenNameIdentifier	 prev Arc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" cycle label=" + arc.label + " output=" + arc.output); 	TokenNameCOMMENT_LINE	System.out.println(" cycle label=" + arc.label + " output=" + arc.output); 
// This is the min output we'd hit if we follow 	TokenNameCOMMENT_LINE	This is the min output we'd hit if we follow 
// this arc: 	TokenNameCOMMENT_LINE	this arc: 
final	TokenNamefinal	
long	TokenNamelong	
minArcOutput	TokenNameIdentifier	 min Arc Output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minArcOutput	TokenNameIdentifier	 min Arc Output
==	TokenNameEQUAL_EQUAL	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse on this arc: 	TokenNameCOMMENT_LINE	Recurse on this arc: 
//System.out.println(" match! break"); 	TokenNameCOMMENT_LINE	System.out.println(" match! break"); 
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
minArcOutput	TokenNameIdentifier	 min Arc Output
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minArcOutput	TokenNameIdentifier	 min Arc Output
>	TokenNameGREATER	
targetOutput	TokenNameIdentifier	 target Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevArc	TokenNameIdentifier	 prev Arc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Output doesn't exist 	TokenNameCOMMENT_LINE	Output doesn't exist 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Recurse on previous arc: 	TokenNameCOMMENT_LINE	Recurse on previous arc: 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
prevArc	TokenNameIdentifier	 prev Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
+=	TokenNamePLUS_EQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
//System.out.println(" recurse prev label=" + (char) arc.label + " output=" + output); 	TokenNameCOMMENT_LINE	System.out.println(" recurse prev label=" + (char) arc.label + " output=" + output); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse on this arc: 	TokenNameCOMMENT_LINE	Recurse on this arc: 
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
minArcOutput	TokenNameIdentifier	 min Arc Output
;	TokenNameSEMICOLON	
//System.out.println(" recurse last label=" + (char) arc.label + " output=" + output); 	TokenNameCOMMENT_LINE	System.out.println(" recurse last label=" + (char) arc.label + " output=" + output); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Read next arc in this node: 	TokenNameCOMMENT_LINE	Read next arc in this node: 
prevArc	TokenNameIdentifier	 prev Arc
=	TokenNameEQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
;	TokenNameSEMICOLON	
prevArc	TokenNameIdentifier	 prev Arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" after copy label=" + (char) prevArc.label + " vs " + (char) arc.label); 	TokenNameCOMMENT_LINE	System.out.println(" after copy label=" + (char) prevArc.label + " vs " + (char) arc.label); 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println(" no target arcs; not found!"); 	TokenNameCOMMENT_LINE	System.out.println(" no target arcs; not found!"); 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
cost	TokenNameIdentifier	 cost
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FSTPath	TokenNameIdentifier	 FST Path
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
cost	TokenNameIdentifier	 cost
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
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
"input="	TokenNameStringLiteral	input=
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
+	TokenNamePLUS	
" cost="	TokenNameStringLiteral	 cost=
+	TokenNamePLUS	
cost	TokenNameIdentifier	 cost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TopNSearcher	TokenNameIdentifier	 Top N Searcher
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fromNode	TokenNameIdentifier	 from Node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
// Set once the queue has filled: 	TokenNameCOMMENT_LINE	Set once the queue has filled: 
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TopNSearcher	TokenNameIdentifier	 Top N Searcher
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
topN	TokenNameIdentifier	 top N
=	TokenNameEQUAL	
topN	TokenNameIdentifier	 top N
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fromNode	TokenNameIdentifier	 from Node
=	TokenNameEQUAL	
fromNode	TokenNameIdentifier	 from Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If back plus this arc is competitive then add to queue: 	TokenNameCOMMENT_LINE	If back plus this arc is competitive then add to queue: 
private	TokenNameprivate	
void	TokenNamevoid	
addIfCompetitive	TokenNameIdentifier	 add If Competitive
(	TokenNameLPAREN	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" addIfCompetitive bottom=" + bottom + " queue.size()=" + queue.size()); 	TokenNameCOMMENT_LINE	System.out.println(" addIfCompetitive bottom=" + bottom + " queue.size()=" + queue.size()); 
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Doesn't compete 	TokenNameCOMMENT_LINE	Doesn't compete 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Tie break by alpha sort on the input: 	TokenNameCOMMENT_LINE	Tie break by alpha sort on the input: 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Doesn't compete 	TokenNameCOMMENT_LINE	Doesn't compete 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Competes 	TokenNameCOMMENT_LINE	Competes 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Queue isn't full yet, so any path we hit competes: 	TokenNameCOMMENT_LINE	Queue isn't full yet, so any path we hit competes: 
}	TokenNameRBRACE	
final	TokenNamefinal	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
newPath	TokenNameIdentifier	 new Path
=	TokenNameEQUAL	
new	TokenNamenew	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newPath	TokenNameIdentifier	 new Path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newPath	TokenNameIdentifier	 new Path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newPath	TokenNameIdentifier	 new Path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
newPath	TokenNameIdentifier	 new Path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println(" add path=" + newPath); 	TokenNameCOMMENT_LINE	System.out.println(" add path=" + newPath); 
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPath	TokenNameIdentifier	 new Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only if java6 is available: see replacement below 	TokenNameCOMMENT_LINE	only if java6 is available: see replacement below 
// final FSTPath removed = queue.pollLast(); 	TokenNameCOMMENT_LINE	final FSTPath removed = queue.pollLast(); 
assert	TokenNameassert	
!	TokenNameNOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
removed	TokenNameIdentifier	 removed
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
removed	TokenNameIdentifier	 removed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
removed	TokenNameIdentifier	 removed
==	TokenNameEQUAL_EQUAL	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" now re-set bottom: " + bottom + " queue=" + queue); 	TokenNameCOMMENT_LINE	System.out.println(" now re-set bottom: " + bottom + " queue=" + queue); 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Queue just filled up: 	TokenNameCOMMENT_LINE	Queue just filled up: 
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" now set bottom: " + bottom); 	TokenNameCOMMENT_LINE	System.out.println(" now set bottom: " + bottom); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println(" search topN=" + topN); 	TokenNameCOMMENT_LINE	System.out.println(" search topN=" + topN); 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
scratchArc	TokenNameIdentifier	 scratch Arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we could enable FST to sorting arcs by weight 	TokenNameCOMMENT_LINE	TODO: we could enable FST to sorting arcs by weight 
// as it freezes... can easily do this on first pass 	TokenNameCOMMENT_LINE	as it freezes... can easily do this on first pass 
// (w/o requiring rewrite) 	TokenNameCOMMENT_LINE	(w/o requiring rewrite) 
// TODO: maybe we should make an FST.INPUT_TYPE.BYTE0.5!? 	TokenNameCOMMENT_LINE	TODO: maybe we should make an FST.INPUT_TYPE.BYTE0.5!? 
// (nibbles) 	TokenNameCOMMENT_LINE	(nibbles) 
// For each top N path: 	TokenNameCOMMENT_LINE	For each top N path: 
while	TokenNamewhile	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("\nfind next path"); 	TokenNameCOMMENT_LINE	System.out.println("\nfind next path"); 
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ran out of paths 	TokenNameCOMMENT_LINE	Ran out of paths 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First pass (top path): start from original fromNode 	TokenNameCOMMENT_LINE	First pass (top path): start from original fromNode 
if	TokenNameif	
(	TokenNameLPAREN	
topN	TokenNameIdentifier	 top N
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
T	TokenNameIdentifier	 T
minArcCost	TokenNameIdentifier	 min Arc Cost
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
minArc	TokenNameIdentifier	 min Arc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
FSTPath	TokenNameIdentifier	 FST Path
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
,	TokenNameCOMMA	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bootstrap: find the min starting arc 	TokenNameCOMMENT_LINE	Bootstrap: find the min starting arc 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
arcScore	TokenNameIdentifier	 arc Score
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
//System.out.println(" arc=" + (char) path.arc.label + " cost=" + arcScore); 	TokenNameCOMMENT_LINE	System.out.println(" arc=" + (char) path.arc.label + " cost=" + arcScore); 
if	TokenNameif	
(	TokenNameLPAREN	
minArcCost	TokenNameIdentifier	 min Arc Cost
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
arcScore	TokenNameIdentifier	 arc Score
,	TokenNameCOMMA	
minArcCost	TokenNameIdentifier	 min Arc Cost
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minArcCost	TokenNameIdentifier	 min Arc Cost
=	TokenNameEQUAL	
arcScore	TokenNameIdentifier	 arc Score
;	TokenNameSEMICOLON	
minArc	TokenNameIdentifier	 min Arc
=	TokenNameEQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" **"); 	TokenNameCOMMENT_LINE	System.out.println(" **"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addIfCompetitive	TokenNameIdentifier	 add If Competitive
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
minArc	TokenNameIdentifier	 min Arc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove top path since we are now going to 	TokenNameCOMMENT_LINE	Remove top path since we are now going to 
// pursue it: 	TokenNameCOMMENT_LINE	pursue it: 
// only on java6: see replacement 3 lines below 	TokenNameCOMMENT_LINE	only on java6: see replacement 3 lines below 
// path = queue.pollFirst(); 	TokenNameCOMMENT_LINE	path = queue.pollFirst(); 
assert	TokenNameassert	
!	TokenNameNOT	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" remove init path=" + path); 	TokenNameCOMMENT_LINE	System.out.println(" remove init path=" + path); 
assert	TokenNameassert	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
minArc	TokenNameIdentifier	 min Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topN	TokenNameIdentifier	 top N
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" set init bottom: " + bottom); 	TokenNameCOMMENT_LINE	System.out.println(" set init bottom: " + bottom); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
minArc	TokenNameIdentifier	 min Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minArc	TokenNameIdentifier	 min Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
minArc	TokenNameIdentifier	 min Arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// below is only on java5: see replacement code below 	TokenNameCOMMENT_LINE	below is only on java5: see replacement code below 
/* path = queue.pollFirst(); if (path == null) { // There were less than topN paths available: break; } */	TokenNameCOMMENT_BLOCK	 path = queue.pollFirst(); if (path == null) { // There were less than topN paths available: break; } 
// must do this empty check, first() throws exception. 	TokenNameCOMMENT_LINE	must do this empty check, first() throws exception. 
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There were less than topN paths available: 	TokenNameCOMMENT_LINE	There were less than topN paths available: 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" empty string! cost=" + path.cost); 	TokenNameCOMMENT_LINE	System.out.println(" empty string! cost=" + path.cost); 
// Empty string! 	TokenNameCOMMENT_LINE	Empty string! 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topN	TokenNameIdentifier	 top N
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Last path -- don't bother w/ queue anymore: 	TokenNameCOMMENT_LINE	Last path -- don't bother w/ queue anymore: 
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" path: " + path); 	TokenNameCOMMENT_LINE	System.out.println(" path: " + path); 
// We take path and find its "0 output completion", 	TokenNameCOMMENT_LINE	We take path and find its "0 output completion", 
// ie, just keep traversing the first arc with 	TokenNameCOMMENT_LINE	ie, just keep traversing the first arc with 
// NO_OUTPUT that we can find, since this must lead 	TokenNameCOMMENT_LINE	NO_OUTPUT that we can find, since this must lead 
// to the minimum path that completes from 	TokenNameCOMMENT_LINE	to the minimum path that completes from 
// path.arc. 	TokenNameCOMMENT_LINE	path.arc. 
// For each input letter: 	TokenNameCOMMENT_LINE	For each input letter: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("\n cycle path: " + path); 	TokenNameCOMMENT_LINE	System.out.println("\n cycle path: " + path); 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For each arc leaving this node: 	TokenNameCOMMENT_LINE	For each arc leaving this node: 
boolean	TokenNameboolean	
foundZero	TokenNameIdentifier	 found Zero
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" arc=" + (char) path.arc.label + " cost=" + path.arc.output); 	TokenNameCOMMENT_LINE	System.out.println(" arc=" + (char) path.arc.label + " cost=" + path.arc.output); 
// tricky: instead of comparing output == 0, we must 	TokenNameCOMMENT_LINE	tricky: instead of comparing output == 0, we must 
// express it via the comparator compare(output, 0) == 0 	TokenNameCOMMENT_LINE	express it via the comparator compare(output, 0) == 0 
if	TokenNameif	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundZero	TokenNameIdentifier	 found Zero
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundZero	TokenNameIdentifier	 found Zero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foundZero	TokenNameIdentifier	 found Zero
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addIfCompetitive	TokenNameIdentifier	 add If Competitive
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addIfCompetitive	TokenNameIdentifier	 add If Competitive
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
foundZero	TokenNameIdentifier	 found Zero
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: maybe we can save this copyFrom if we 	TokenNameCOMMENT_LINE	TODO: maybe we can save this copyFrom if we 
// are more clever above... eg on finding the 	TokenNameCOMMENT_LINE	are more clever above... eg on finding the 
// first NO_OUTPUT arc we'd switch to using 	TokenNameCOMMENT_LINE	first NO_OUTPUT arc we'd switch to using 
// scratchArc 	TokenNameCOMMENT_LINE	scratchArc 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add final output: 	TokenNameCOMMENT_LINE	Add final output: 
//System.out.println(" done!: " + path); 	TokenNameCOMMENT_LINE	System.out.println(" done!: " + path); 
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
cost	TokenNameIdentifier	 cost
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
final	TokenNamefinal	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
MinResult	TokenNameIdentifier	 Min Result
[	TokenNameLBRACKET	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arr	TokenNameIdentifier	 arr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Holds a single input (IntsRef) + output, returned by * {@link #shortestPaths}. */	TokenNameCOMMENT_JAVADOC	 Holds a single input (IntsRef) + output, returned by {@link #shortestPaths}. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MinResult	TokenNameIdentifier	 Min Result
(	TokenNameLPAREN	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Starting from node, find the top N min cost * completions to a final node. * * <p>NOTE: you must share the outputs when you build the * FST (pass doShare=true to {@link * PositiveIntOutputs#getSingleton}). */	TokenNameCOMMENT_JAVADOC	 Starting from node, find the top N min cost completions to a final node. * <p>NOTE: you must share the outputs when you build the FST (pass doShare=true to {@link PositiveIntOutputs#getSingleton}). 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
MinResult	TokenNameIdentifier	 Min Result
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shortestPaths	TokenNameIdentifier	 shortest Paths
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TopNSearcher	TokenNameIdentifier	 Top N Searcher
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
fromNode	TokenNameIdentifier	 from Node
,	TokenNameCOMMA	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dumps an {@link FST} to a GraphViz's <code>dot</code> language description * for visualization. Example of use: * * <pre class="prettyprint"> * PrintWriter pw = new PrintWriter(&quot;out.dot&quot;); * Util.toDot(fst, pw, true, true); * pw.close(); * </pre> * * and then, from command line: * * <pre> * dot -Tpng -o out.png out.dot * </pre> * * <p> * Note: larger FSTs (a few thousand nodes) won't even render, don't bother. * * @param sameRank * If <code>true</code>, the resulting <code>dot</code> file will try * to order states in layers of breadth-first traversal. This may * mess up arcs, but makes the output FST's structure a bit clearer. * * @param labelStates * If <code>true</code> states will have labels equal to their offsets in their * binary format. Expands the graph considerably. * * @see "http://www.graphviz.org/" */	TokenNameCOMMENT_JAVADOC	 Dumps an {@link FST} to a GraphViz's <code>dot</code> language description for visualization. Example of use: * <pre class="prettyprint"> PrintWriter pw = new PrintWriter(&quot;out.dot&quot;); Util.toDot(fst, pw, true, true); pw.close(); </pre> * and then, from command line: * <pre> dot -Tpng -o out.png out.dot </pre> * <p> Note: larger FSTs (a few thousand nodes) won't even render, don't bother. * @param sameRank If <code>true</code>, the resulting <code>dot</code> file will try to order states in layers of breadth-first traversal. This may mess up arcs, but makes the output FST's structure a bit clearer. * @param labelStates If <code>true</code> states will have labels equal to their offsets in their binary format. Expands the graph considerably. * @see "http://www.graphviz.org/" 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
toDot	TokenNameIdentifier	 to Dot
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sameRank	TokenNameIdentifier	 same Rank
,	TokenNameCOMMA	
boolean	TokenNameboolean	
labelStates	TokenNameIdentifier	 label States
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
expandedNodeColor	TokenNameIdentifier	 expanded Node Color
=	TokenNameEQUAL	
"blue"	TokenNameStringLiteral	blue
;	TokenNameSEMICOLON	
// This is the start arc in the automaton (from the epsilon state to the first state 	TokenNameCOMMENT_LINE	This is the start arc in the automaton (from the epsilon state to the first state 
// with outgoing transitions. 	TokenNameCOMMENT_LINE	with outgoing transitions. 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
startArc	TokenNameIdentifier	 start Arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A queue of transitions to consider for the next level. 	TokenNameCOMMENT_LINE	A queue of transitions to consider for the next level. 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
thisLevelQueue	TokenNameIdentifier	 this Level Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A queue of transitions to consider when processing the next level. 	TokenNameCOMMENT_LINE	A queue of transitions to consider when processing the next level. 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
startArc	TokenNameIdentifier	 start Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("toDot: startArc: " + startArc); 	TokenNameCOMMENT_LINE	System.out.println("toDot: startArc: " + startArc); 
// A list of states on the same level (for ranking). 	TokenNameCOMMENT_LINE	A list of states on the same level (for ranking). 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
sameLevelStates	TokenNameIdentifier	 same Level States
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A bitset of already seen states (target offset). 	TokenNameCOMMENT_LINE	A bitset of already seen states (target offset). 
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Shape for states. 	TokenNameCOMMENT_LINE	Shape for states. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stateShape	TokenNameIdentifier	 state Shape
=	TokenNameEQUAL	
"circle"	TokenNameStringLiteral	circle
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
finalStateShape	TokenNameIdentifier	 final State Shape
=	TokenNameEQUAL	
"doublecircle"	TokenNameStringLiteral	doublecircle
;	TokenNameSEMICOLON	
// Emit DOT prologue. 	TokenNameCOMMENT_LINE	Emit DOT prologue. 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"digraph FST { "	TokenNameStringLiteral	digraph FST { 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" rankdir = LR; splines=true; concentrate=true; ordering=out; ranksep=2.5; "	TokenNameStringLiteral	 rankdir = LR; splines=true; concentrate=true; ordering=out; ranksep=2.5; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
labelStates	TokenNameIdentifier	 label States
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" node [shape=circle, width=.2, height=.2, style=filled] "	TokenNameStringLiteral	 node [shape=circle, width=.2, height=.2, style=filled] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
emitDotState	TokenNameIdentifier	 emit Dot State
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
"initial"	TokenNameStringLiteral	initial
,	TokenNameCOMMA	
"point"	TokenNameStringLiteral	point
,	TokenNameCOMMA	
"white"	TokenNameStringLiteral	white
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final FST.Arc<T> scratchArc = new FST.Arc<T>(); 	TokenNameCOMMENT_LINE	final FST.Arc<T> scratchArc = new FST.Arc<T>(); 
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stateColor	TokenNameIdentifier	 state Color
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
isExpandedTarget	TokenNameIdentifier	 is Expanded Target
(	TokenNameLPAREN	
startArc	TokenNameIdentifier	 start Arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stateColor	TokenNameIdentifier	 state Color
=	TokenNameEQUAL	
expandedNodeColor	TokenNameIdentifier	 expanded Node Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stateColor	TokenNameIdentifier	 state Color
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
finalOutput	TokenNameIdentifier	 final Output
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
emitDotState	TokenNameIdentifier	 emit Dot State
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isFinal	TokenNameIdentifier	 is Final
?	TokenNameQUESTION	
finalStateShape	TokenNameIdentifier	 final State Shape
:	TokenNameCOLON	
stateShape	TokenNameIdentifier	 state Shape
,	TokenNameCOMMA	
stateColor	TokenNameIdentifier	 state Color
,	TokenNameCOMMA	
finalOutput	TokenNameIdentifier	 final Output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
finalOutput	TokenNameIdentifier	 final Output
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" initial -> "	TokenNameStringLiteral	 initial -> 
+	TokenNamePLUS	
startArc	TokenNameIdentifier	 start Arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we could double buffer here, but it doesn't matter probably. 	TokenNameCOMMENT_LINE	we could double buffer here, but it doesn't matter probably. 
//System.out.println("next level=" + level); 	TokenNameCOMMENT_LINE	System.out.println("next level=" + level); 
thisLevelQueue	TokenNameIdentifier	 this Level Queue
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" // Transitions and states at level: "	TokenNameStringLiteral	 // Transitions and states at level: 
+	TokenNamePLUS	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
thisLevelQueue	TokenNameIdentifier	 this Level Queue
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
thisLevelQueue	TokenNameIdentifier	 this Level Queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
thisLevelQueue	TokenNameIdentifier	 this Level Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" pop: " + arc); 	TokenNameCOMMENT_LINE	System.out.println(" pop: " + arc); 
if	TokenNameif	
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
targetHasArcs	TokenNameIdentifier	 target Has Arcs
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// scan all target arcs 	TokenNameCOMMENT_LINE	scan all target arcs 
//System.out.println(" readFirstTarget..."); 	TokenNameCOMMENT_LINE	System.out.println(" readFirstTarget..."); 
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstRealTargetArc	TokenNameIdentifier	 read First Real Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" firstTarget: " + arc); 	TokenNameCOMMENT_LINE	System.out.println(" firstTarget: " + arc); 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" cycle arc=" + arc); 	TokenNameCOMMENT_LINE	System.out.println(" cycle arc=" + arc); 
// Emit the unseen state and add it to the queue for the next level. 	TokenNameCOMMENT_LINE	Emit the unseen state and add it to the queue for the next level. 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* boolean isFinal = false; T finalOutput = null; fst.readFirstTargetArc(arc, scratchArc); if (scratchArc.isFinal() && fst.targetHasArcs(scratchArc)) { // target is final isFinal = true; finalOutput = scratchArc.output == NO_OUTPUT ? null : scratchArc.output; System.out.println("dot hit final label=" + (char) scratchArc.label); } */	TokenNameCOMMENT_BLOCK	 boolean isFinal = false; T finalOutput = null; fst.readFirstTargetArc(arc, scratchArc); if (scratchArc.isFinal() && fst.targetHasArcs(scratchArc)) { // target is final isFinal = true; finalOutput = scratchArc.output == NO_OUTPUT ? null : scratchArc.output; System.out.println("dot hit final label=" + (char) scratchArc.label); } 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stateColor	TokenNameIdentifier	 state Color
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
isExpandedTarget	TokenNameIdentifier	 is Expanded Target
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stateColor	TokenNameIdentifier	 state Color
=	TokenNameEQUAL	
expandedNodeColor	TokenNameIdentifier	 expanded Node Color
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stateColor	TokenNameIdentifier	 state Color
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
finalOutput	TokenNameIdentifier	 final Output
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
!=	TokenNameNOT_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
emitDotState	TokenNameIdentifier	 emit Dot State
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stateShape	TokenNameIdentifier	 state Shape
,	TokenNameCOMMA	
stateColor	TokenNameIdentifier	 state Color
,	TokenNameCOMMA	
finalOutput	TokenNameIdentifier	 final Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// To see the node address, use this instead: 	TokenNameCOMMENT_LINE	To see the node address, use this instead: 
//emitDotState(out, Integer.toString(arc.target), stateShape, stateColor, String.valueOf(arc.target)); 	TokenNameCOMMENT_LINE	emitDotState(out, Integer.toString(arc.target), stateShape, stateColor, String.valueOf(arc.target)); 
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextLevelQueue	TokenNameIdentifier	 next Level Queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sameLevelStates	TokenNameIdentifier	 same Level States
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
outs	TokenNameIdentifier	 outs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outs	TokenNameIdentifier	 outs
=	TokenNameEQUAL	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
outs	TokenNameIdentifier	 outs
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
targetHasArcs	TokenNameIdentifier	 target Has Arcs
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
!=	TokenNameNOT_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Tricky special case: sometimes, due to 	TokenNameCOMMENT_LINE	Tricky special case: sometimes, due to 
// pruning, the builder can [sillily] produce 	TokenNameCOMMENT_LINE	pruning, the builder can [sillily] produce 
// an FST with an arc into the final end state 	TokenNameCOMMENT_LINE	an FST with an arc into the final end state 
// (-1) but also with a next final output; in 	TokenNameCOMMENT_LINE	(-1) but also with a next final output; in 
// this case we pull that output up onto this 	TokenNameCOMMENT_LINE	this case we pull that output up onto this 
// arc 	TokenNameCOMMENT_LINE	arc 
outs	TokenNameIdentifier	 outs
=	TokenNameEQUAL	
outs	TokenNameIdentifier	 outs
+	TokenNamePLUS	
"/["	TokenNameStringLiteral	/[
+	TokenNamePLUS	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
outputToString	TokenNameIdentifier	 output To String
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
arcColor	TokenNameIdentifier	 arc Color
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BIT_TARGET_NEXT	TokenNameIdentifier	 BIT  TARGET  NEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arcColor	TokenNameIdentifier	 arc Color
=	TokenNameEQUAL	
"red"	TokenNameStringLiteral	red
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arcColor	TokenNameIdentifier	 arc Color
=	TokenNameEQUAL	
"black"	TokenNameStringLiteral	black
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
" [label=""	TokenNameStringLiteral	 [label="
+	TokenNamePLUS	
printableLabel	TokenNameIdentifier	 printable Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
+	TokenNamePLUS	
outs	TokenNameIdentifier	 outs
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" style="bold""	TokenNameStringLiteral	 style="bold"
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
" color=""	TokenNameStringLiteral	 color="
+	TokenNamePLUS	
arcColor	TokenNameIdentifier	 arc Color
+	TokenNamePLUS	
""] "	TokenNameStringLiteral	"] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Break the loop if we're on the last arc of this state. 	TokenNameCOMMENT_LINE	Break the loop if we're on the last arc of this state. 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" break"); 	TokenNameCOMMENT_LINE	System.out.println(" break"); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Emit state ranking information. 	TokenNameCOMMENT_LINE	Emit state ranking information. 
if	TokenNameif	
(	TokenNameLPAREN	
sameRank	TokenNameIdentifier	 same Rank
&&	TokenNameAND_AND	
sameLevelStates	TokenNameIdentifier	 same Level States
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" {rank=same; "	TokenNameStringLiteral	 {rank=same; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
state	TokenNameIdentifier	 state
:	TokenNameCOLON	
sameLevelStates	TokenNameIdentifier	 same Level States
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" } "	TokenNameStringLiteral	 } 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sameLevelStates	TokenNameIdentifier	 same Level States
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Emit terminating state (always there anyway). 	TokenNameCOMMENT_LINE	Emit terminating state (always there anyway). 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" -1 [style=filled, color=black, shape=doublecircle, label=""] "	TokenNameStringLiteral	 -1 [style=filled, color=black, shape=doublecircle, label=""] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" {rank=sink; -1 } "	TokenNameStringLiteral	 {rank=sink; -1 } 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"} "	TokenNameStringLiteral	} 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Emit a single state in the <code>dot</code> language. */	TokenNameCOMMENT_JAVADOC	 Emit a single state in the <code>dot</code> language. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
emitDotState	TokenNameIdentifier	 emit Dot State
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
shape	TokenNameIdentifier	 shape
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"shape="	TokenNameStringLiteral	shape=
+	TokenNamePLUS	
shape	TokenNameIdentifier	 shape
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"color="	TokenNameStringLiteral	color=
+	TokenNamePLUS	
color	TokenNameIdentifier	 color
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"label=""	TokenNameStringLiteral	label="
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
:	TokenNameCOLON	
"label="""	TokenNameStringLiteral	label=""
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures an arc's label is indeed printable (dot uses US-ASCII). */	TokenNameCOMMENT_JAVADOC	 Ensures an arc's label is indeed printable (dot uses US-ASCII). 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
printableLabel	TokenNameIdentifier	 printable Label
(	TokenNameLPAREN	
int	TokenNameint	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
>=	TokenNameGREATER_EQUAL	
0x20	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
label	TokenNameIdentifier	 label
<=	TokenNameLESS_EQUAL	
0x7d	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"0x"	TokenNameStringLiteral	0x
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Decodes the Unicode codepoints from the provided * CharSequence and places them in the provided scratch * IntsRef, which must not be null, returning it. */	TokenNameCOMMENT_JAVADOC	 Decodes the Unicode codepoints from the provided CharSequence and places them in the provided scratch IntsRef, which must not be null, returning it. 
public	TokenNamepublic	
static	TokenNamestatic	
IntsRef	TokenNameIdentifier	 Ints Ref
toUTF32	TokenNameIdentifier	 to UT F32
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charIdx	TokenNameIdentifier	 char Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
intIdx	TokenNameIdentifier	 int Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
charLimit	TokenNameIdentifier	 char Limit
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
charIdx	TokenNameIdentifier	 char Idx
<	TokenNameLESS	
charLimit	TokenNameIdentifier	 char Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
intIdx	TokenNameIdentifier	 int Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
charIdx	TokenNameIdentifier	 char Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
intIdx	TokenNameIdentifier	 int Idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
utf32	TokenNameIdentifier	 utf32
;	TokenNameSEMICOLON	
charIdx	TokenNameIdentifier	 char Idx
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intIdx	TokenNameIdentifier	 int Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
intIdx	TokenNameIdentifier	 int Idx
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Decodes the Unicode codepoints from the provided * char[] and places them in the provided scratch * IntsRef, which must not be null, returning it. */	TokenNameCOMMENT_JAVADOC	 Decodes the Unicode codepoints from the provided char[] and places them in the provided scratch IntsRef, which must not be null, returning it. 
public	TokenNamepublic	
static	TokenNamestatic	
IntsRef	TokenNameIdentifier	 Ints Ref
toUTF32	TokenNameIdentifier	 to UT F32
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charIdx	TokenNameIdentifier	 char Idx
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
intIdx	TokenNameIdentifier	 int Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
charLimit	TokenNameIdentifier	 char Limit
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
charIdx	TokenNameIdentifier	 char Idx
<	TokenNameLESS	
charLimit	TokenNameIdentifier	 char Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
intIdx	TokenNameIdentifier	 int Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
utf32	TokenNameIdentifier	 utf32
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
charIdx	TokenNameIdentifier	 char Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
intIdx	TokenNameIdentifier	 int Idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
utf32	TokenNameIdentifier	 utf32
;	TokenNameSEMICOLON	
charIdx	TokenNameIdentifier	 char Idx
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
utf32	TokenNameIdentifier	 utf32
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intIdx	TokenNameIdentifier	 int Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
intIdx	TokenNameIdentifier	 int Idx
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Just takes unsigned byte values from the BytesRef and * converts into an IntsRef. */	TokenNameCOMMENT_JAVADOC	 Just takes unsigned byte values from the BytesRef and converts into an IntsRef. 
public	TokenNamepublic	
static	TokenNamestatic	
IntsRef	TokenNameIdentifier	 Ints Ref
toIntsRef	TokenNameIdentifier	 to Ints Ref
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Just converts IntsRef to BytesRef; you must ensure the * int values fit into a byte. */	TokenNameCOMMENT_JAVADOC	 Just converts IntsRef to BytesRef; you must ensure the int values fit into a byte. 
public	TokenNamepublic	
static	TokenNamestatic	
BytesRef	TokenNameIdentifier	 Bytes Ref
toBytesRef	TokenNameIdentifier	 to Bytes Ref
(	TokenNameLPAREN	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
