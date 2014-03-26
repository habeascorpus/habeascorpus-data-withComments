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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: Op.java 572108 2007-09-02 18:48:31Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: Op.java 572108 2007-09-02 18:48:31Z mrglavas $ 
class	TokenNameclass	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOT	TokenNameIdentifier	 DOT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHAR	TokenNameIdentifier	 CHAR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Single character 	TokenNameCOMMENT_LINE	Single character 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RANGE	TokenNameIdentifier	 RANGE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// [a-zA-Z] 	TokenNameCOMMENT_LINE	[a-zA-Z] 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NRANGE	TokenNameIdentifier	 NRANGE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// [^a-zA-Z] 	TokenNameCOMMENT_LINE	[^a-zA-Z] 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANCHOR	TokenNameIdentifier	 ANCHOR
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ^ $ ... 	TokenNameCOMMENT_LINE	^ $ ... 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// literal String 	TokenNameCOMMENT_LINE	literal String 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLOSURE	TokenNameIdentifier	 CLOSURE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X* 	TokenNameCOMMENT_LINE	X* 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X*? 	TokenNameCOMMENT_LINE	X*? 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QUESTION	TokenNameIdentifier	 QUESTION
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X? 	TokenNameCOMMENT_LINE	X? 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NONGREEDYQUESTION	TokenNameIdentifier	 NONGREEDYQUESTION
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X?? 	TokenNameCOMMENT_LINE	X?? 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNION	TokenNameIdentifier	 UNION
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// X|Y 	TokenNameCOMMENT_LINE	X|Y 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CAPTURE	TokenNameIdentifier	 CAPTURE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ( and ) 	TokenNameCOMMENT_LINE	( and ) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// \1 \2 ... 	TokenNameCOMMENT_LINE	\1 \2 ... 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?=...) 	TokenNameCOMMENT_LINE	(?=...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?!...) 	TokenNameCOMMENT_LINE	(?!...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?<=...) 	TokenNameCOMMENT_LINE	(?<=...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?<!...) 	TokenNameCOMMENT_LINE	(?<!...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?>...) 	TokenNameCOMMENT_LINE	(?>...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MODIFIER	TokenNameIdentifier	 MODIFIER
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?ims-ims:...) 	TokenNameCOMMENT_LINE	(?ims-ims:...) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONDITION	TokenNameIdentifier	 CONDITION
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// (?(..)yes|no) 	TokenNameCOMMENT_LINE	(?(..)yes|no) 
static	TokenNamestatic	
int	TokenNameint	
nofinstances	TokenNameIdentifier	 nofinstances
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
COUNT	TokenNameIdentifier	 COUNT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Op	TokenNameIdentifier	 Op
createDot	TokenNameIdentifier	 create Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Op	TokenNameIdentifier	 Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
CharOp	TokenNameIdentifier	 Char Op
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CharOp	TokenNameIdentifier	 Char Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
CharOp	TokenNameIdentifier	 Char Op
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
int	TokenNameint	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CharOp	TokenNameIdentifier	 Char Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
CharOp	TokenNameIdentifier	 Char Op
createCapture	TokenNameIdentifier	 create Capture
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
CharOp	TokenNameIdentifier	 Char Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
CharOp	TokenNameIdentifier	 Char Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CAPTURE	TokenNameIdentifier	 CAPTURE
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
UnionOp	TokenNameIdentifier	 Union Op
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//System.err.println("Creates UnionOp"); 	TokenNameCOMMENT_LINE	System.err.println("Creates UnionOp"); 
return	TokenNamereturn	
new	TokenNamenew	
UnionOp	TokenNameIdentifier	 Union Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ChildOp	TokenNameIdentifier	 Child Op
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ModifierOp	TokenNameIdentifier	 Modifier Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ChildOp	TokenNameIdentifier	 Child Op
createNonGreedyClosure	TokenNameIdentifier	 create Non Greedy Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ChildOp	TokenNameIdentifier	 Child Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ChildOp	TokenNameIdentifier	 Child Op
createQuestion	TokenNameIdentifier	 create Question
(	TokenNameLPAREN	
boolean	TokenNameboolean	
nongreedy	TokenNameIdentifier	 nongreedy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ChildOp	TokenNameIdentifier	 Child Op
(	TokenNameLPAREN	
nongreedy	TokenNameIdentifier	 nongreedy
?	TokenNameQUESTION	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYQUESTION	TokenNameIdentifier	 NONGREEDYQUESTION
:	TokenNameCOLON	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
RangeOp	TokenNameIdentifier	 Range Op
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RangeOp	TokenNameIdentifier	 Range Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ChildOp	TokenNameIdentifier	 Child Op
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ChildOp	TokenNameIdentifier	 Child Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ChildOp	TokenNameIdentifier	 Child Op
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
CharOp	TokenNameIdentifier	 Char Op
createBackReference	TokenNameIdentifier	 create Back Reference
(	TokenNameLPAREN	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CharOp	TokenNameIdentifier	 Char Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
,	TokenNameCOMMA	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
StringOp	TokenNameIdentifier	 String Op
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StringOp	TokenNameIdentifier	 String Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ChildOp	TokenNameIdentifier	 Child Op
createIndependent	TokenNameIdentifier	 create Independent
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ChildOp	TokenNameIdentifier	 Child Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ChildOp	TokenNameIdentifier	 Child Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ModifierOp	TokenNameIdentifier	 Modifier Op
createModifier	TokenNameIdentifier	 create Modifier
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
branch	TokenNameIdentifier	 branch
,	TokenNameCOMMA	
int	TokenNameint	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ModifierOp	TokenNameIdentifier	 Modifier Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ModifierOp	TokenNameIdentifier	 Modifier Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
MODIFIER	TokenNameIdentifier	 MODIFIER
,	TokenNameCOMMA	
add	TokenNameIdentifier	 add
,	TokenNameCOMMA	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
branch	TokenNameIdentifier	 branch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
ConditionOp	TokenNameIdentifier	 Condition Op
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
conditionflow	TokenNameIdentifier	 conditionflow
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
yesflow	TokenNameIdentifier	 yesflow
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
noflow	TokenNameIdentifier	 noflow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ConditionOp	TokenNameIdentifier	 Condition Op
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
new	TokenNamenew	
ConditionOp	TokenNameIdentifier	 Condition Op
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CONDITION	TokenNameIdentifier	 CONDITION
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
conditionflow	TokenNameIdentifier	 conditionflow
,	TokenNameCOMMA	
yesflow	TokenNameIdentifier	 yesflow
,	TokenNameCOMMA	
noflow	TokenNameIdentifier	 noflow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Op	TokenNameIdentifier	 Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for UNION 	TokenNameCOMMENT_LINE	for UNION 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Op	TokenNameIdentifier	 Op
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for UNIoN 	TokenNameCOMMENT_LINE	for UNIoN 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Op	TokenNameIdentifier	 Op
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for CLOSURE, QUESTION 	TokenNameCOMMENT_LINE	for CLOSURE, QUESTION 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ModifierOp 	TokenNameCOMMENT_LINE	ModifierOp 
int	TokenNameint	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CharOp for CHAR, BACKREFERENCE, CAPTURE, ANCHOR, 	TokenNameCOMMENT_LINE	CharOp for CHAR, BACKREFERENCE, CAPTURE, ANCHOR, 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getData2	TokenNameIdentifier	 get Data2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ModifierOp 	TokenNameCOMMENT_LINE	ModifierOp 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// RANGE, NRANGE 	TokenNameCOMMENT_LINE	RANGE, NRANGE 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// STRING 	TokenNameCOMMENT_LINE	STRING 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: type="	TokenNameStringLiteral	Internal Error: type=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
CharOp	TokenNameIdentifier	 Char Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
charData	TokenNameIdentifier	 char Data
;	TokenNameSEMICOLON	
CharOp	TokenNameIdentifier	 Char Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charData	TokenNameIdentifier	 char Data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
charData	TokenNameIdentifier	 char Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
UnionOp	TokenNameIdentifier	 Union Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
branches	TokenNameIdentifier	 branches
;	TokenNameSEMICOLON	
UnionOp	TokenNameIdentifier	 Union Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
branches	TokenNameIdentifier	 branches
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
branches	TokenNameIdentifier	 branches
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
branches	TokenNameIdentifier	 branches
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Op	TokenNameIdentifier	 Op
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
branches	TokenNameIdentifier	 branches
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
ChildOp	TokenNameIdentifier	 Child Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
Op	TokenNameIdentifier	 Op
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
ChildOp	TokenNameIdentifier	 Child Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Op	TokenNameIdentifier	 Op
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
ModifierOp	TokenNameIdentifier	 Modifier Op
extends	TokenNameextends	
ChildOp	TokenNameIdentifier	 Child Op
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
ModifierOp	TokenNameIdentifier	 Modifier Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
int	TokenNameint	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getData2	TokenNameIdentifier	 get Data2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
RangeOp	TokenNameIdentifier	 Range Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
RangeOp	TokenNameIdentifier	 Range Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RangeToken	TokenNameIdentifier	 Range Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RangeToken	TokenNameIdentifier	 Range Token
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
StringOp	TokenNameIdentifier	 String Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
StringOp	TokenNameIdentifier	 String Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
literal	TokenNameIdentifier	 literal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
class	TokenNameclass	
ConditionOp	TokenNameIdentifier	 Condition Op
extends	TokenNameextends	
Op	TokenNameIdentifier	 Op
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Op	TokenNameIdentifier	 Op
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Op	TokenNameIdentifier	 Op
yes	TokenNameIdentifier	 yes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Op	TokenNameIdentifier	 Op
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
ConditionOp	TokenNameIdentifier	 Condition Op
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
conditionflow	TokenNameIdentifier	 conditionflow
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
yesflow	TokenNameIdentifier	 yesflow
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
noflow	TokenNameIdentifier	 noflow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
=	TokenNameEQUAL	
refno	TokenNameIdentifier	 refno
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
conditionflow	TokenNameIdentifier	 conditionflow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
=	TokenNameEQUAL	
yesflow	TokenNameIdentifier	 yesflow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
no	TokenNameIdentifier	 no
=	TokenNameEQUAL	
noflow	TokenNameIdentifier	 noflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
