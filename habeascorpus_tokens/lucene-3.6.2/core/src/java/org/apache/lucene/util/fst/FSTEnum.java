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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Can next() and advance() through the terms in an FST * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Can next() and advance() through the terms in an FST * @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
FSTEnum	TokenNameIdentifier	 FST Enum
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
protected	TokenNameprotected	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arcs	TokenNameIdentifier	 arcs
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// outputs are cumulative 	TokenNameCOMMENT_LINE	outputs are cumulative 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
protected	TokenNameprotected	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
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
protected	TokenNameprotected	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
targetLength	TokenNameIdentifier	 target Length
;	TokenNameSEMICOLON	
/** doFloor controls the behavior of advance: if it's true * doFloor is true, advance positions to the biggest * term before target. */	TokenNameCOMMENT_JAVADOC	 doFloor controls the behavior of advance: if it's true doFloor is true, advance positions to the biggest term before target. 
protected	TokenNameprotected	
FSTEnum	TokenNameIdentifier	 FST Enum
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getCurrentLabel	TokenNameIdentifier	 get Current Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
int	TokenNameint	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Rewinds enum state to match the shared prefix between * current term and target term */	TokenNameCOMMENT_JAVADOC	 Rewinds enum state to match the shared prefix between current term and target term 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
rewindPrefix	TokenNameIdentifier	 rewind Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" init"); 	TokenNameCOMMENT_LINE	System.out.println(" init"); 
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" rewind upto=" + upto + " vs targetLength=" + targetLength); 	TokenNameCOMMENT_LINE	System.out.println(" rewind upto=" + upto + " vs targetLength=" + targetLength); 
final	TokenNamefinal	
int	TokenNameint	
currentLimit	TokenNameIdentifier	 current Limit
=	TokenNameEQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
currentLimit	TokenNameIdentifier	 current Limit
&&	TokenNameAND_AND	
upto	TokenNameIdentifier	 upto
<=	TokenNameLESS_EQUAL	
targetLength	TokenNameIdentifier	 target Length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
getCurrentLabel	TokenNameIdentifier	 get Current Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// seek forward 	TokenNameCOMMENT_LINE	seek forward 
//System.out.println(" seek fwd"); 	TokenNameCOMMENT_LINE	System.out.println(" seek fwd"); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// seek backwards -- reset this arc to the first arc 	TokenNameCOMMENT_LINE	seek backwards -- reset this arc to the first arc 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" seek first arc"); 	TokenNameCOMMENT_LINE	System.out.println(" seek first arc"); 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" fall through upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println(" fall through upto=" + upto); 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println("FE: next upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE: next upto=" + upto); 
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" init"); 	TokenNameCOMMENT_LINE	System.out.println(" init"); 
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pop 	TokenNameCOMMENT_LINE	pop 
//System.out.println(" check pop curArc target=" + arcs[upto].target + " label=" + arcs[upto].label + " isLast?=" + arcs[upto].isLast()); 	TokenNameCOMMENT_LINE	System.out.println(" check pop curArc target=" + arcs[upto].target + " label=" + arcs[upto].label + " isLast?=" + arcs[upto].isLast()); 
while	TokenNamewhile	
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" eof"); 	TokenNameCOMMENT_LINE	System.out.println(" eof"); 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: should we return a status here (SEEK_FOUND / SEEK_NOT_FOUND / 	TokenNameCOMMENT_LINE	TODO: should we return a status here (SEEK_FOUND / SEEK_NOT_FOUND / 
// SEEK_END)? saves the eq check above? 	TokenNameCOMMENT_LINE	SEEK_END)? saves the eq check above? 
/** Seeks to smallest term that's >= target. */	TokenNameCOMMENT_JAVADOC	 Seeks to smallest term that's >= target. 
protected	TokenNameprotected	
void	TokenNamevoid	
doSeekCeil	TokenNameIdentifier	 do Seek Ceil
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//System.out.println(" advance len=" + target.length + " curlen=" + current.length); 	TokenNameCOMMENT_LINE	System.out.println(" advance len=" + target.length + " curlen=" + current.length); 
// TODO: possibly caller could/should provide common 	TokenNameCOMMENT_LINE	TODO: possibly caller could/should provide common 
// prefix length? ie this work may be redundant if 	TokenNameCOMMENT_LINE	prefix length? ie this work may be redundant if 
// caller is in fact intersecting against its own 	TokenNameCOMMENT_LINE	caller is in fact intersecting against its own 
// automaton 	TokenNameCOMMENT_LINE	automaton 
//System.out.println("FE.seekCeil upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE.seekCeil upto=" + upto); 
// Save time by starting at the end of the shared prefix 	TokenNameCOMMENT_LINE	Save time by starting at the end of the shared prefix 
// b/w our current term & the target: 	TokenNameCOMMENT_LINE	b/w our current term & the target: 
rewindPrefix	TokenNameIdentifier	 rewind Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" after rewind upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println(" after rewind upto=" + upto); 
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" init targetLabel=" + targetLabel); 	TokenNameCOMMENT_LINE	System.out.println(" init targetLabel=" + targetLabel); 
// Now scan forward, matching the new suffix of the target 	TokenNameCOMMENT_LINE	Now scan forward, matching the new suffix of the target 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" cycle upto=" + upto + " arc.label=" + arc.label + " (" + (char) arc.label + ") vs targetLabel=" + targetLabel); 	TokenNameCOMMENT_LINE	System.out.println(" cycle upto=" + upto + " arc.label=" + arc.label + " (" + (char) arc.label + ") vs targetLabel=" + targetLabel); 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
bytesPerArc	TokenNameIdentifier	 bytes Per Arc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Arcs are fixed array -- use binary search to find 	TokenNameCOMMENT_LINE	Arcs are fixed array -- use binary search to find 
// the target. 	TokenNameCOMMENT_LINE	the target. 
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
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
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
//System.out.println("do arc array low=" + low + " high=" + high + " targetLabel=" + targetLabel); 	TokenNameCOMMENT_LINE	System.out.println("do arc array low=" + low + " high=" + high + " targetLabel=" + targetLabel); 
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
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
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
midLabel	TokenNameIdentifier	 mid Label
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readLabel	TokenNameIdentifier	 read Label
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
midLabel	TokenNameIdentifier	 mid Label
-	TokenNameMINUS	
targetLabel	TokenNameIdentifier	 target Label
;	TokenNameSEMICOLON	
//System.out.println(" cycle low=" + low + " high=" + high + " mid=" + mid + " midLabel=" + midLabel + " cmp=" + cmp); 	TokenNameCOMMENT_LINE	System.out.println(" cycle low=" + low + " high=" + high + " mid=" + mid + " midLabel=" + midLabel + " cmp=" + cmp); 
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NOTE: this code is dup'd w/ the code below (in 	TokenNameCOMMENT_LINE	NOTE: this code is dup'd w/ the code below (in 
// the outer else clause): 	TokenNameCOMMENT_LINE	the outer else clause): 
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Match 	TokenNameCOMMENT_LINE	Match 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
==	TokenNameEQUAL_EQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
targetLabel	TokenNameIdentifier	 target Label
:	TokenNameCOLON	
"arc.label="	TokenNameStringLiteral	arc.label=
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" vs targetLabel="	TokenNameStringLiteral	 vs targetLabel=
+	TokenNamePLUS	
targetLabel	TokenNameIdentifier	 target Label
+	TokenNamePLUS	
" mid="	TokenNameStringLiteral	 mid=
+	TokenNamePLUS	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
==	TokenNameEQUAL_EQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Dead end 	TokenNameCOMMENT_LINE	Dead end 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Dead end (target is after the last arc); 	TokenNameCOMMENT_LINE	Dead end (target is after the last arc); 
// rollback to last fork then push 	TokenNameCOMMENT_LINE	rollback to last fork then push 
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
prevArc	TokenNameIdentifier	 prev Arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" rollback upto=" + upto + " arc.label=" + prevArc.label + " isLast?=" + prevArc.isLast()); 	TokenNameCOMMENT_LINE	System.out.println(" rollback upto=" + upto + " arc.label=" + prevArc.label + " isLast?=" + prevArc.isLast()); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prevArc	TokenNameIdentifier	 prev Arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
prevArc	TokenNameIdentifier	 prev Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
>	TokenNameGREATER	
high	TokenNameIdentifier	 high
?	TokenNameQUESTION	
low	TokenNameIdentifier	 low
:	TokenNameCOLON	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
>	TokenNameGREATER	
targetLabel	TokenNameIdentifier	 target Label
;	TokenNameSEMICOLON	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Arcs are not array'd -- must do linear scan: 	TokenNameCOMMENT_LINE	Arcs are not array'd -- must do linear scan: 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// recurse 	TokenNameCOMMENT_LINE	recurse 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
>	TokenNameGREATER	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
// Dead end (target is after the last arc); 	TokenNameCOMMENT_LINE	Dead end (target is after the last arc); 
// rollback to last fork then push 	TokenNameCOMMENT_LINE	rollback to last fork then push 
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
prevArc	TokenNameIdentifier	 prev Arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" rollback upto=" + upto + " arc.label=" + prevArc.label + " isLast?=" + prevArc.isLast()); 	TokenNameCOMMENT_LINE	System.out.println(" rollback upto=" + upto + " arc.label=" + prevArc.label + " isLast?=" + prevArc.isLast()); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prevArc	TokenNameIdentifier	 prev Arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
prevArc	TokenNameIdentifier	 prev Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// keep scanning 	TokenNameCOMMENT_LINE	keep scanning 
//System.out.println(" next scan"); 	TokenNameCOMMENT_LINE	System.out.println(" next scan"); 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: should we return a status here (SEEK_FOUND / SEEK_NOT_FOUND / 	TokenNameCOMMENT_LINE	TODO: should we return a status here (SEEK_FOUND / SEEK_NOT_FOUND / 
// SEEK_END)? saves the eq check above? 	TokenNameCOMMENT_LINE	SEEK_END)? saves the eq check above? 
/** Seeks to largest term that's <= target. */	TokenNameCOMMENT_JAVADOC	 Seeks to largest term that's <= target. 
protected	TokenNameprotected	
void	TokenNamevoid	
doSeekFloor	TokenNameIdentifier	 do Seek Floor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: possibly caller could/should provide common 	TokenNameCOMMENT_LINE	TODO: possibly caller could/should provide common 
// prefix length? ie this work may be redundant if 	TokenNameCOMMENT_LINE	prefix length? ie this work may be redundant if 
// caller is in fact intersecting against its own 	TokenNameCOMMENT_LINE	caller is in fact intersecting against its own 
// automaton 	TokenNameCOMMENT_LINE	automaton 
//System.out.println("FE: seek floor upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE: seek floor upto=" + upto); 
// Save CPU by starting at the end of the shared prefix 	TokenNameCOMMENT_LINE	Save CPU by starting at the end of the shared prefix 
// b/w our current term & the target: 	TokenNameCOMMENT_LINE	b/w our current term & the target: 
rewindPrefix	TokenNameIdentifier	 rewind Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("FE: after rewind upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE: after rewind upto=" + upto); 
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("FE: init targetLabel=" + targetLabel); 	TokenNameCOMMENT_LINE	System.out.println("FE: init targetLabel=" + targetLabel); 
// Now scan forward, matching the new suffix of the target 	TokenNameCOMMENT_LINE	Now scan forward, matching the new suffix of the target 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" cycle upto=" + upto + " arc.label=" + arc.label + " (" + (char) arc.label + ") targetLabel=" + targetLabel + " isLast?=" + arc.isLast() + " bba=" + arc.bytesPerArc); 	TokenNameCOMMENT_LINE	System.out.println(" cycle upto=" + upto + " arc.label=" + arc.label + " (" + (char) arc.label + ") targetLabel=" + targetLabel + " isLast?=" + arc.isLast() + " bba=" + arc.bytesPerArc); 
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
bytesPerArc	TokenNameIdentifier	 bytes Per Arc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Arcs are fixed array -- use binary search to find 	TokenNameCOMMENT_LINE	Arcs are fixed array -- use binary search to find 
// the target. 	TokenNameCOMMENT_LINE	the target. 
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
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
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
//System.out.println("do arc array low=" + low + " high=" + high + " targetLabel=" + targetLabel); 	TokenNameCOMMENT_LINE	System.out.println("do arc array low=" + low + " high=" + high + " targetLabel=" + targetLabel); 
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
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
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
midLabel	TokenNameIdentifier	 mid Label
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readLabel	TokenNameIdentifier	 read Label
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
midLabel	TokenNameIdentifier	 mid Label
-	TokenNameMINUS	
targetLabel	TokenNameIdentifier	 target Label
;	TokenNameSEMICOLON	
//System.out.println(" cycle low=" + low + " high=" + high + " mid=" + mid + " midLabel=" + midLabel + " cmp=" + cmp); 	TokenNameCOMMENT_LINE	System.out.println(" cycle low=" + low + " high=" + high + " mid=" + mid + " midLabel=" + midLabel + " cmp=" + cmp); 
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// NOTE: this code is dup'd w/ the code below (in 	TokenNameCOMMENT_LINE	NOTE: this code is dup'd w/ the code below (in 
// the outer else clause): 	TokenNameCOMMENT_LINE	the outer else clause): 
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Match -- recurse 	TokenNameCOMMENT_LINE	Match -- recurse 
//System.out.println(" match! arcIdx=" + mid); 	TokenNameCOMMENT_LINE	System.out.println(" match! arcIdx=" + mid); 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
==	TokenNameEQUAL_EQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
targetLabel	TokenNameIdentifier	 target Label
:	TokenNameCOLON	
"arc.label="	TokenNameStringLiteral	arc.label=
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" vs targetLabel="	TokenNameStringLiteral	 vs targetLabel=
+	TokenNamePLUS	
targetLabel	TokenNameIdentifier	 target Label
+	TokenNamePLUS	
" mid="	TokenNameStringLiteral	 mid=
+	TokenNamePLUS	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" before first"); 	TokenNameCOMMENT_LINE	System.out.println(" before first"); 
// Very first arc is after our target 	TokenNameCOMMENT_LINE	Very first arc is after our target 
// TODO: if each arc could somehow read the arc just 	TokenNameCOMMENT_LINE	TODO: if each arc could somehow read the arc just 
// before, we can save this re-scan. The ceil case 	TokenNameCOMMENT_LINE	before, we can save this re-scan. The ceil case 
// doesn't need this because it reads the next arc 	TokenNameCOMMENT_LINE	doesn't need this because it reads the next arc 
// instead: 	TokenNameCOMMENT_LINE	instead: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, walk backwards until we find a first arc 	TokenNameCOMMENT_LINE	First, walk backwards until we find a first arc 
// that's before our target label: 	TokenNameCOMMENT_LINE	that's before our target label: 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
<	TokenNameLESS	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then, scan forwards to the arc just before 	TokenNameCOMMENT_LINE	Then, scan forwards to the arc just before 
// the targetLabel: 	TokenNameCOMMENT_LINE	the targetLabel: 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArcLabel	TokenNameIdentifier	 read Next Arc Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
<	TokenNameLESS	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// There is a floor arc: 	TokenNameCOMMENT_LINE	There is a floor arc: 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
>	TokenNameGREATER	
high	TokenNameIdentifier	 high
?	TokenNameQUESTION	
high	TokenNameIdentifier	 high
:	TokenNameCOLON	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println(" hasFloor arcIdx=" + (arc.arcIdx+1)); 	TokenNameCOMMENT_LINE	System.out.println(" hasFloor arcIdx=" + (arc.arcIdx+1)); 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArcLabel	TokenNameIdentifier	 read Next Arc Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
>	TokenNameGREATER	
targetLabel	TokenNameIdentifier	 target Label
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
<	TokenNameLESS	
targetLabel	TokenNameIdentifier	 target Label
:	TokenNameCOLON	
"arc.label="	TokenNameStringLiteral	arc.label=
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" vs targetLabel="	TokenNameStringLiteral	 vs targetLabel=
+	TokenNamePLUS	
targetLabel	TokenNameIdentifier	 target Label
;	TokenNameSEMICOLON	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Match -- recurse 	TokenNameCOMMENT_LINE	Match -- recurse 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
>	TokenNameGREATER	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: if each arc could somehow read the arc just 	TokenNameCOMMENT_LINE	TODO: if each arc could somehow read the arc just 
// before, we can save this re-scan. The ceil case 	TokenNameCOMMENT_LINE	before, we can save this re-scan. The ceil case 
// doesn't need this because it reads the next arc 	TokenNameCOMMENT_LINE	doesn't need this because it reads the next arc 
// instead: 	TokenNameCOMMENT_LINE	instead: 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, walk backwards until we find a first arc 	TokenNameCOMMENT_LINE	First, walk backwards until we find a first arc 
// that's before our target label: 	TokenNameCOMMENT_LINE	that's before our target label: 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
<	TokenNameLESS	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Then, scan forwards to the arc just before 	TokenNameCOMMENT_LINE	Then, scan forwards to the arc just before 
// the targetLabel: 	TokenNameCOMMENT_LINE	the targetLabel: 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArcLabel	TokenNameIdentifier	 read Next Arc Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
<	TokenNameLESS	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
upto	TokenNameIdentifier	 upto
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" check next label=" + fst.readNextArcLabel(arc) + " (" + (char) fst.readNextArcLabel(arc) + ")"); 	TokenNameCOMMENT_LINE	System.out.println(" check next label=" + fst.readNextArcLabel(arc) + " (" + (char) fst.readNextArcLabel(arc) + ")"); 
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArcLabel	TokenNameIdentifier	 read Next Arc Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
>	TokenNameGREATER	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// keep scanning 	TokenNameCOMMENT_LINE	keep scanning 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Seeks to exactly target term. */	TokenNameCOMMENT_JAVADOC	 Seeks to exactly target term. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
doSeekExact	TokenNameIdentifier	 do Seek Exact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: possibly caller could/should provide common 	TokenNameCOMMENT_LINE	TODO: possibly caller could/should provide common 
// prefix length? ie this work may be redundant if 	TokenNameCOMMENT_LINE	prefix length? ie this work may be redundant if 
// caller is in fact intersecting against its own 	TokenNameCOMMENT_LINE	caller is in fact intersecting against its own 
// automaton 	TokenNameCOMMENT_LINE	automaton 
//System.out.println("FE: seek exact upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE: seek exact upto=" + upto); 
// Save time by starting at the end of the shared prefix 	TokenNameCOMMENT_LINE	Save time by starting at the end of the shared prefix 
// b/w our current term & the target: 	TokenNameCOMMENT_LINE	b/w our current term & the target: 
rewindPrefix	TokenNameIdentifier	 rewind Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("FE: after rewind upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println("FE: after rewind upto=" + upto); 
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" cycle target=" + (targetLabel == -1 ? "-1" : (char) targetLabel)); 	TokenNameCOMMENT_LINE	System.out.println(" cycle target=" + (targetLabel == -1 ? "-1" : (char) targetLabel)); 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
nextArc	TokenNameIdentifier	 next Arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextArc	TokenNameIdentifier	 next Arc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// short circuit 	TokenNameCOMMENT_LINE	short circuit 
//upto--; 	TokenNameCOMMENT_LINE	upto--; 
//upto = 0; 	TokenNameCOMMENT_LINE	upto = 0; 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" no match upto=" + upto); 	TokenNameCOMMENT_LINE	System.out.println(" no match upto=" + upto); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Match -- recurse: 	TokenNameCOMMENT_LINE	Match -- recurse: 
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
nextArc	TokenNameIdentifier	 next Arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" return found; upto=" + upto + " output=" + output[upto] + " nextArc=" + nextArc.isLast()); 	TokenNameCOMMENT_LINE	System.out.println(" return found; upto=" + upto + " output=" + output[upto] + " nextArc=" + nextArc.isLast()); 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
targetLabel	TokenNameIdentifier	 target Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetLabel	TokenNameIdentifier	 target Label
=	TokenNameEQUAL	
getTargetLabel	TokenNameIdentifier	 get Target Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
nextArc	TokenNameIdentifier	 next Arc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArcs	TokenNameIdentifier	 new Arcs
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArcs	TokenNameIdentifier	 new Arcs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
arcs	TokenNameIdentifier	 arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arcs	TokenNameIdentifier	 arcs
=	TokenNameEQUAL	
newArcs	TokenNameIdentifier	 new Arcs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newOutput	TokenNameIdentifier	 new Output
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newOutput	TokenNameIdentifier	 new Output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
newOutput	TokenNameIdentifier	 new Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Appends current arc, and then recurses from its target, 	TokenNameCOMMENT_LINE	Appends current arc, and then recurses from its target, 
// appending first arc all the way to the final node 	TokenNameCOMMENT_LINE	appending first arc all the way to the final node 
private	TokenNameprivate	
void	TokenNamevoid	
pushFirst	TokenNameIdentifier	 push First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Final node 	TokenNameCOMMENT_LINE	Final node 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" pushFirst label=" + (char) arc.label + " upto=" + upto + " output=" + fst.outputs.outputToString(output[upto])); 	TokenNameCOMMENT_LINE	System.out.println(" pushFirst label=" + (char) arc.label + " upto=" + upto + " output=" + fst.outputs.outputToString(output[upto])); 
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
nextArc	TokenNameIdentifier	 next Arc
=	TokenNameEQUAL	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
nextArc	TokenNameIdentifier	 next Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
nextArc	TokenNameIdentifier	 next Arc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Recurses from current arc, appending last arc all the 	TokenNameCOMMENT_LINE	Recurses from current arc, appending last arc all the 
// way to the first final node 	TokenNameCOMMENT_LINE	way to the first final node 
private	TokenNameprivate	
void	TokenNamevoid	
pushLast	TokenNameIdentifier	 push Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCurrentLabel	TokenNameIdentifier	 set Current Label
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Final node 	TokenNameCOMMENT_LINE	Final node 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
incr	TokenNameIdentifier	 incr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readLastTargetArc	TokenNameIdentifier	 read Last Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getArc	TokenNameIdentifier	 get Arc
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
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
}	TokenNameRBRACE	
return	TokenNamereturn	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
