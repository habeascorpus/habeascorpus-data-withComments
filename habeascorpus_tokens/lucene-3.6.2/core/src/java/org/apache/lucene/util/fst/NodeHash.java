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
// Used to dedup states (lookup already-frozen states) 	TokenNameCOMMENT_LINE	Used to dedup states (lookup already-frozen states) 
final	TokenNamefinal	
class	TokenNameclass	
NodeHash	TokenNameIdentifier	 Node Hash
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
NodeHash	TokenNameIdentifier	 Node Hash
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
nodesEqual	TokenNameIdentifier	 nodes Equal
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstRealTargetArc	TokenNameIdentifier	 read First Real Target Arc
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
,	TokenNameCOMMA	
scratchArc	TokenNameIdentifier	 scratch Arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
bytesPerArc	TokenNameIdentifier	 bytes Per Arc
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
!=	TokenNameNOT_EQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arcUpto	TokenNameIdentifier	 arc Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arcUpto	TokenNameIdentifier	 arc Upto
<	TokenNameLESS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
arcUpto	TokenNameIdentifier	 arc Upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcUpto	TokenNameIdentifier	 arc Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
||	TokenNameOR_OR	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
CompiledNode	TokenNameIdentifier	 Compiled Node
)	TokenNameRPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
||	TokenNameOR_OR	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
)	TokenNameRPAREN	
||	TokenNameOR_OR	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
!=	TokenNameNOT_EQUAL	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
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
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arcUpto	TokenNameIdentifier	 arc Upto
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash code for an unfrozen node. This must be identical 	TokenNameCOMMENT_LINE	hash code for an unfrozen node. This must be identical 
// to the un-frozen case (below)!! 	TokenNameCOMMENT_LINE	to the un-frozen case (below)!! 
private	TokenNameprivate	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
PRIME	TokenNameIdentifier	 PRIME
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("hash unfrozen"); 	TokenNameCOMMENT_LINE	System.out.println("hash unfrozen"); 
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: maybe if number of arcs is high we can safely subsample? 	TokenNameCOMMENT_LINE	TODO: maybe if number of arcs is high we can safely subsample? 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
<	TokenNameLESS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println(" label=" + arc.label + " target=" + ((Builder.CompiledNode) arc.target).node + " h=" + h + " output=" + fst.outputs.outputToString(arc.output) + " isFinal?=" + arc.isFinal); 	TokenNameCOMMENT_LINE	System.out.println(" label=" + arc.label + " target=" + ((Builder.CompiledNode) arc.target).node + " h=" + h + " output=" + fst.outputs.outputToString(arc.output) + " isFinal?=" + arc.isFinal); 
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
CompiledNode	TokenNameIdentifier	 Compiled Node
)	TokenNameRPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
+=	TokenNamePLUS_EQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println(" ret " + (h&Integer.MAX_VALUE)); 	TokenNameCOMMENT_LINE	System.out.println(" ret " + (h&Integer.MAX_VALUE)); 
return	TokenNamereturn	
h	TokenNameIdentifier	 h
&	TokenNameAND	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash code for a frozen node 	TokenNameCOMMENT_LINE	hash code for a frozen node 
private	TokenNameprivate	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
PRIME	TokenNameIdentifier	 PRIME
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
//System.out.println("hash frozen node=" + node); 	TokenNameCOMMENT_LINE	System.out.println("hash frozen node=" + node); 
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
readFirstRealTargetArc	TokenNameIdentifier	 read First Real Target Arc
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
scratchArc	TokenNameIdentifier	 scratch Arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" label=" + scratchArc.label + " target=" + scratchArc.target + " h=" + h + " output=" + fst.outputs.outputToString(scratchArc.output) + " next?=" + scratchArc.flag(4) + " final?=" + scratchArc.isFinal()); 	TokenNameCOMMENT_LINE	System.out.println(" label=" + scratchArc.label + " target=" + scratchArc.target + " h=" + h + " output=" + fst.outputs.outputToString(scratchArc.output) + " next?=" + scratchArc.flag(4) + " final?=" + scratchArc.isFinal()); 
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
PRIME	TokenNameIdentifier	 PRIME
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
+=	TokenNamePLUS_EQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
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
readNextRealArc	TokenNameIdentifier	 read Next Real Arc
(	TokenNameLPAREN	
scratchArc	TokenNameIdentifier	 scratch Arc
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" ret " + (h&Integer.MAX_VALUE)); 	TokenNameCOMMENT_LINE	System.out.println(" ret " + (h&Integer.MAX_VALUE)); 
return	TokenNamereturn	
h	TokenNameIdentifier	 h
&	TokenNameAND	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
.	TokenNameDOT	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// System.out.println("hash: add count=" + count + " vs " + table.length); 	TokenNameCOMMENT_LINE	System.out.println("hash: add count=" + count + " vs " + table.length); 
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
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// freeze & add 	TokenNameCOMMENT_LINE	freeze & add 
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" now freeze node=" + node); 	TokenNameCOMMENT_LINE	System.out.println(" now freeze node=" + node); 
assert	TokenNameassert	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
:	TokenNameCOLON	
"frozenHash="	TokenNameStringLiteral	frozenHash=
+	TokenNamePLUS	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" vs h="	TokenNameStringLiteral	 vs h=
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodesEqual	TokenNameIdentifier	 nodes Equal
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// same node is already here 	TokenNameCOMMENT_LINE	same node is already here 
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// quadratic probe 	TokenNameCOMMENT_LINE	quadratic probe 
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// called only by rehash 	TokenNameCOMMENT_LINE	called only by rehash 
private	TokenNameprivate	
void	TokenNamevoid	
addNew	TokenNameIdentifier	 add New
(	TokenNameLPAREN	
int	TokenNameint	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
address	TokenNameIdentifier	 address
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// quadratic probe 	TokenNameCOMMENT_LINE	quadratic probe 
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldTable	TokenNameIdentifier	 old Table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
oldTable	TokenNameIdentifier	 old Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
address	TokenNameIdentifier	 address
=	TokenNameEQUAL	
oldTable	TokenNameIdentifier	 old Table
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNew	TokenNameIdentifier	 add New
(	TokenNameLPAREN	
address	TokenNameIdentifier	 address
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
