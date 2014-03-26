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
IntsRef	TokenNameIdentifier	 Ints Ref
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
/** * Builds a minimal FST (maps an IntsRef term to an arbitrary * output) from pre-sorted terms with outputs. The FST * becomes an FSA if you use NoOutputs. The FST is written * on-the-fly into a compact serialized format byte array, which can * be saved to / loaded from a Directory or used directly * for traversal. The FST is always finite (no cycles). * * <p>NOTE: The algorithm is described at * http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.24.3698</p> * * The parameterized type T is the output type. See the * subclasses of {@link Outputs}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Builds a minimal FST (maps an IntsRef term to an arbitrary output) from pre-sorted terms with outputs. The FST becomes an FSA if you use NoOutputs. The FST is written on-the-fly into a compact serialized format byte array, which can be saved to / loaded from a Directory or used directly for traversal. The FST is always finite (no cycles). * <p>NOTE: The algorithm is described at http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.24.3698</p> * The parameterized type T is the output type. See the subclasses of {@link Outputs}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
NodeHash	TokenNameIdentifier	 Node Hash
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
dedupHash	TokenNameIdentifier	 dedup Hash
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
T	TokenNameIdentifier	 T
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
// private static final boolean DEBUG = true; 	TokenNameCOMMENT_LINE	private static final boolean DEBUG = true; 
// simplistic pruning: we prune node (and all following 	TokenNameCOMMENT_LINE	simplistic pruning: we prune node (and all following 
// nodes) if less than this number of terms go through it: 	TokenNameCOMMENT_LINE	nodes) if less than this number of terms go through it: 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
;	TokenNameSEMICOLON	
// better pruning: we prune node (and all following 	TokenNameCOMMENT_LINE	better pruning: we prune node (and all following 
// nodes) if the prior node has less than this number of 	TokenNameCOMMENT_LINE	nodes) if the prior node has less than this number of 
// terms go through it: 	TokenNameCOMMENT_LINE	terms go through it: 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
doShareNonSingletonNodes	TokenNameIdentifier	 do Share Non Singleton Nodes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IntsRef	TokenNameIdentifier	 Ints Ref
lastInput	TokenNameIdentifier	 last Input
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: cutting this over to ArrayList instead loses ~6% 	TokenNameCOMMENT_LINE	NOTE: cutting this over to ArrayList instead loses ~6% 
// in build performance on 9.8M Wikipedia terms; so we 	TokenNameCOMMENT_LINE	in build performance on 9.8M Wikipedia terms; so we 
// left this as an array: 	TokenNameCOMMENT_LINE	left this as an array: 
// current "frontier" 	TokenNameCOMMENT_LINE	current "frontier" 
private	TokenNameprivate	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
frontier	TokenNameIdentifier	 frontier
;	TokenNameSEMICOLON	
/** Expert: this is invoked by Builder whenever a suffix * is serialized. */	TokenNameCOMMENT_JAVADOC	 Expert: this is invoked by Builder whenever a suffix is serialized. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
FreezeTail	TokenNameIdentifier	 Freeze Tail
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
frontier	TokenNameIdentifier	 frontier
,	TokenNameCOMMA	
int	TokenNameint	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
,	TokenNameCOMMA	
IntsRef	TokenNameIdentifier	 Ints Ref
prevInput	TokenNameIdentifier	 prev Input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FreezeTail	TokenNameIdentifier	 Freeze Tail
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
freezeTail	TokenNameIdentifier	 freeze Tail
;	TokenNameSEMICOLON	
/** * Instantiates an FST/FSA builder without any pruning. A shortcut * to {@link #Builder(FST.INPUT_TYPE, int, int, boolean, * boolean, int, Outputs, FreezeTail, boolean)} with * pruning options turned off. */	TokenNameCOMMENT_JAVADOC	 Instantiates an FST/FSA builder without any pruning. A shortcut to {@link #Builder(FST.INPUT_TYPE, int, int, boolean, boolean, int, Outputs, FreezeTail, boolean)} with pruning options turned off. 
public	TokenNamepublic	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
inputType	TokenNameIdentifier	 input Type
,	TokenNameCOMMA	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
outputs	TokenNameIdentifier	 outputs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
inputType	TokenNameIdentifier	 input Type
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
outputs	TokenNameIdentifier	 outputs
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Instantiates an FST/FSA builder with all the possible tuning and construction * tweaks. Read parameter documentation carefully. * * @param inputType * The input type (transition labels). Can be anything from {@link INPUT_TYPE} * enumeration. Shorter types will consume less memory. Strings (character sequences) are * represented as {@link INPUT_TYPE#BYTE4} (full unicode codepoints). * * @param minSuffixCount1 * If pruning the input graph during construction, this threshold is used for telling * if a node is kept or pruned. If transition_count(node) &gt;= minSuffixCount1, the node * is kept. * * @param minSuffixCount2 * (Note: only Mike McCandless knows what this one is really doing...) * * @param doShareSuffix * If <code>true</code>, the shared suffixes will be compacted into unique paths. * This requires an additional hash map for lookups in memory. Setting this parameter to * <code>false</code> creates a single path for all input sequences. This will result in a larger * graph, but may require less memory and will speed up construction. * * @param doShareNonSingletonNodes * Only used if doShareSuffix is true. Set this to * true to ensure FST is fully minimal, at cost of more * CPU and more RAM during building. * * @param shareMaxTailLength * Only used if doShareSuffix is true. Set this to * Integer.MAX_VALUE to ensure FST is fully minimal, at cost of more * CPU and more RAM during building. * * @param outputs The output type for each input sequence. Applies only if building an FST. For * FSA, use {@link NoOutputs#getSingleton()} and {@link NoOutputs#getNoOutput()} as the * singleton output object. * * @param willPackFST Pass true if you will pack the FST before saving. This * causes the FST to create additional data structures internally to facilitate packing, but * it means the resulting FST cannot be saved: it must * first be packed using {@link FST#pack(int, int)}}. */	TokenNameCOMMENT_JAVADOC	 Instantiates an FST/FSA builder with all the possible tuning and construction tweaks. Read parameter documentation carefully. * @param inputType The input type (transition labels). Can be anything from {@link INPUT_TYPE} enumeration. Shorter types will consume less memory. Strings (character sequences) are represented as {@link INPUT_TYPE#BYTE4} (full unicode codepoints). * @param minSuffixCount1 If pruning the input graph during construction, this threshold is used for telling if a node is kept or pruned. If transition_count(node) &gt;= minSuffixCount1, the node is kept. * @param minSuffixCount2 (Note: only Mike McCandless knows what this one is really doing...) * @param doShareSuffix If <code>true</code>, the shared suffixes will be compacted into unique paths. This requires an additional hash map for lookups in memory. Setting this parameter to <code>false</code> creates a single path for all input sequences. This will result in a larger graph, but may require less memory and will speed up construction. * @param doShareNonSingletonNodes Only used if doShareSuffix is true. Set this to true to ensure FST is fully minimal, at cost of more CPU and more RAM during building. * @param shareMaxTailLength Only used if doShareSuffix is true. Set this to Integer.MAX_VALUE to ensure FST is fully minimal, at cost of more CPU and more RAM during building. * @param outputs The output type for each input sequence. Applies only if building an FST. For FSA, use {@link NoOutputs#getSingleton()} and {@link NoOutputs#getNoOutput()} as the singleton output object. * @param willPackFST Pass true if you will pack the FST before saving. This causes the FST to create additional data structures internally to facilitate packing, but it means the resulting FST cannot be saved: it must first be packed using {@link FST#pack(int, int)}}. 
public	TokenNamepublic	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
inputType	TokenNameIdentifier	 input Type
,	TokenNameCOMMA	
int	TokenNameint	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
,	TokenNameCOMMA	
int	TokenNameint	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doShareSuffix	TokenNameIdentifier	 do Share Suffix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doShareNonSingletonNodes	TokenNameIdentifier	 do Share Non Singleton Nodes
,	TokenNameCOMMA	
int	TokenNameint	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
,	TokenNameCOMMA	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
outputs	TokenNameIdentifier	 outputs
,	TokenNameCOMMA	
FreezeTail	TokenNameIdentifier	 Freeze Tail
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
freezeTail	TokenNameIdentifier	 freeze Tail
,	TokenNameCOMMA	
boolean	TokenNameboolean	
willPackFST	TokenNameIdentifier	 will Pack FST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
=	TokenNameEQUAL	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
=	TokenNameEQUAL	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
freezeTail	TokenNameIdentifier	 freeze Tail
=	TokenNameEQUAL	
freezeTail	TokenNameIdentifier	 freeze Tail
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
doShareNonSingletonNodes	TokenNameIdentifier	 do Share Non Singleton Nodes
=	TokenNameEQUAL	
doShareNonSingletonNodes	TokenNameIdentifier	 do Share Non Singleton Nodes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
=	TokenNameEQUAL	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
inputType	TokenNameIdentifier	 input Type
,	TokenNameCOMMA	
outputs	TokenNameIdentifier	 outputs
,	TokenNameCOMMA	
willPackFST	TokenNameIdentifier	 will Pack FST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doShareSuffix	TokenNameIdentifier	 do Share Suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dedupHash	TokenNameIdentifier	 dedup Hash
=	TokenNameEQUAL	
new	TokenNamenew	
NodeHash	TokenNameIdentifier	 Node Hash
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dedupHash	TokenNameIdentifier	 dedup Hash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frontier	TokenNameIdentifier	 frontier
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
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
frontier	TokenNameIdentifier	 frontier
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTotStateCount	TokenNameIdentifier	 get Tot State Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
nodeCount	TokenNameIdentifier	 node Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTermCount	TokenNameIdentifier	 get Term Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMappedStateCount	TokenNameIdentifier	 get Mapped State Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dedupHash	TokenNameIdentifier	 dedup Hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
nodeCount	TokenNameIdentifier	 node Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Pass false to disable the array arc optimization * while building the FST; this will make the resulting * FST smaller but slower to traverse. */	TokenNameCOMMENT_JAVADOC	 Pass false to disable the array arc optimization while building the FST; this will make the resulting FST smaller but slower to traverse. 
public	TokenNamepublic	
void	TokenNamevoid	
setAllowArrayArcs	TokenNameIdentifier	 set Allow Array Arcs
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
setAllowArrayArcs	TokenNameIdentifier	 set Allow Array Arcs
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CompiledNode	TokenNameIdentifier	 Compiled Node
compileNode	TokenNameIdentifier	 compile Node
(	TokenNameLPAREN	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
nodeIn	TokenNameIdentifier	 node In
,	TokenNameCOMMA	
int	TokenNameint	
tailLength	TokenNameIdentifier	 tail Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dedupHash	TokenNameIdentifier	 dedup Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
doShareNonSingletonNodes	TokenNameIdentifier	 do Share Non Singleton Nodes
||	TokenNameOR_OR	
nodeIn	TokenNameIdentifier	 node In
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tailLength	TokenNameIdentifier	 tail Length
<=	TokenNameLESS_EQUAL	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
dedupHash	TokenNameIdentifier	 dedup Hash
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
nodeIn	TokenNameIdentifier	 node In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nodeIn	TokenNameIdentifier	 node In
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CompiledNode	TokenNameIdentifier	 Compiled Node
fn	TokenNameIdentifier	 fn
=	TokenNameEQUAL	
new	TokenNamenew	
CompiledNode	TokenNameIdentifier	 Compiled Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fn	TokenNameIdentifier	 fn
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fn	TokenNameIdentifier	 fn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
freezeTail	TokenNameIdentifier	 freeze Tail
(	TokenNameLPAREN	
int	TokenNameint	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freezeTail	TokenNameIdentifier	 freeze Tail
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Custom plugin: 	TokenNameCOMMENT_LINE	Custom plugin: 
freezeTail	TokenNameIdentifier	 freeze Tail
.	TokenNameDOT	
freeze	TokenNameIdentifier	 freeze
(	TokenNameLPAREN	
frontier	TokenNameIdentifier	 frontier
,	TokenNameCOMMA	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
,	TokenNameCOMMA	
lastInput	TokenNameIdentifier	 last Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println(" compileTail " + prefixLenPlus1); 	TokenNameCOMMENT_LINE	System.out.println(" compileTail " + prefixLenPlus1); 
final	TokenNamefinal	
int	TokenNameint	
downTo	TokenNameIdentifier	 down To
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
downTo	TokenNameIdentifier	 down To
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
doPrune	TokenNameIdentifier	 do Prune
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doCompile	TokenNameIdentifier	 do Compile
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
<	TokenNameLESS	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doPrune	TokenNameIdentifier	 do Prune
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
doCompile	TokenNameIdentifier	 do Compile
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prune if parent's inputCount is less than suffixMinCount2 	TokenNameCOMMENT_LINE	prune if parent's inputCount is less than suffixMinCount2 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
<	TokenNameLESS	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
||	TokenNameOR_OR	
(	TokenNameLPAREN	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// my parent, about to be compiled, doesn't make the cut, so 	TokenNameCOMMENT_LINE	my parent, about to be compiled, doesn't make the cut, so 
// I'm definitely pruned 	TokenNameCOMMENT_LINE	I'm definitely pruned 
// if minSuffixCount2 is 1, we keep only up 	TokenNameCOMMENT_LINE	if minSuffixCount2 is 1, we keep only up 
// until the 'distinguished edge', ie we keep only the 	TokenNameCOMMENT_LINE	until the 'distinguished edge', ie we keep only the 
// 'divergent' part of the FST. if my parent, about to be 	TokenNameCOMMENT_LINE	'divergent' part of the FST. if my parent, about to be 
// compiled, has inputCount 1 then we are already past the 	TokenNameCOMMENT_LINE	compiled, has inputCount 1 then we are already past the 
// distinguished edge. NOTE: this only works if 	TokenNameCOMMENT_LINE	distinguished edge. NOTE: this only works if 
// the FST outputs are not "compressible" (simple 	TokenNameCOMMENT_LINE	the FST outputs are not "compressible" (simple 
// ords ARE compressible). 	TokenNameCOMMENT_LINE	ords ARE compressible). 
doPrune	TokenNameIdentifier	 do Prune
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// my parent, about to be compiled, does make the cut, so 	TokenNameCOMMENT_LINE	my parent, about to be compiled, does make the cut, so 
// I'm definitely not pruned 	TokenNameCOMMENT_LINE	I'm definitely not pruned 
doPrune	TokenNameIdentifier	 do Prune
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doCompile	TokenNameIdentifier	 do Compile
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if pruning is disabled (count is 0) we can always 	TokenNameCOMMENT_LINE	if pruning is disabled (count is 0) we can always 
// compile current node 	TokenNameCOMMENT_LINE	compile current node 
doCompile	TokenNameIdentifier	 do Compile
=	TokenNameEQUAL	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" label=" + ((char) lastInput.ints[lastInput.offset+idx-1]) + " idx=" + idx + " inputCount=" + frontier[idx].inputCount + " doCompile=" + doCompile + " doPrune=" + doPrune); 	TokenNameCOMMENT_LINE	System.out.println(" label=" + ((char) lastInput.ints[lastInput.offset+idx-1]) + " idx=" + idx + " inputCount=" + frontier[idx].inputCount + " doCompile=" + doCompile + " doPrune=" + doPrune); 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
<	TokenNameLESS	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
||	TokenNameOR_OR	
(	TokenNameLPAREN	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// drop all arcs 	TokenNameCOMMENT_LINE	drop all arcs 
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
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doPrune	TokenNameIdentifier	 do Prune
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this node doesn't make it -- deref it 	TokenNameCOMMENT_LINE	this node doesn't make it -- deref it 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
deleteLast	TokenNameIdentifier	 delete Last
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileAllTargets	TokenNameIdentifier	 compile All Targets
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
nextFinalOutput	TokenNameIdentifier	 next Final Output
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
// We "fake" the node as being final if it has no 	TokenNameCOMMENT_LINE	We "fake" the node as being final if it has no 
// outgoing arcs; in theory we could leave it 	TokenNameCOMMENT_LINE	outgoing arcs; in theory we could leave it 
// as non-final (the FST can represent this), but 	TokenNameCOMMENT_LINE	as non-final (the FST can represent this), but 
// FSTEnum, Util, etc., have trouble w/ non-final 	TokenNameCOMMENT_LINE	FSTEnum, Util, etc., have trouble w/ non-final 
// dead-end states: 	TokenNameCOMMENT_LINE	dead-end states: 
final	TokenNamefinal	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
||	TokenNameOR_OR	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doCompile	TokenNameIdentifier	 do Compile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this node makes it and we now compile it. first, 	TokenNameCOMMENT_LINE	this node makes it and we now compile it. first, 
// compile any targets that were previously 	TokenNameCOMMENT_LINE	compile any targets that were previously 
// undecided: 	TokenNameCOMMENT_LINE	undecided: 
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
replaceLast	TokenNameIdentifier	 replace Last
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
compileNode	TokenNameIdentifier	 compile Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nextFinalOutput	TokenNameIdentifier	 next Final Output
,	TokenNameCOMMA	
isFinal	TokenNameIdentifier	 is Final
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// replaceLast just to install 	TokenNameCOMMENT_LINE	replaceLast just to install 
// nextFinalOutput/isFinal onto the arc 	TokenNameCOMMENT_LINE	nextFinalOutput/isFinal onto the arc 
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
replaceLast	TokenNameIdentifier	 replace Last
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
nextFinalOutput	TokenNameIdentifier	 next Final Output
,	TokenNameCOMMA	
isFinal	TokenNameIdentifier	 is Final
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this node will stay in play for now, since we are 	TokenNameCOMMENT_LINE	this node will stay in play for now, since we are 
// undecided on whether to prune it. later, it 	TokenNameCOMMENT_LINE	undecided on whether to prune it. later, it 
// will be either compiled or pruned, so we must 	TokenNameCOMMENT_LINE	will be either compiled or pruned, so we must 
// allocate a new node: 	TokenNameCOMMENT_LINE	allocate a new node: 
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for debugging 	TokenNameCOMMENT_LINE	for debugging 
/* private String toString(BytesRef b) { try { return b.utf8ToString() + " " + b; } catch (Throwable t) { return b.toString(); } } */	TokenNameCOMMENT_BLOCK	 private String toString(BytesRef b) { try { return b.utf8ToString() + " " + b; } catch (Throwable t) { return b.toString(); } } 
/** It's OK to add the same input twice in a row with * different outputs, as long as outputs impls the merge * method. */	TokenNameCOMMENT_JAVADOC	 It's OK to add the same input twice in a row with different outputs, as long as outputs impls the merge method. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* if (DEBUG) { BytesRef b = new BytesRef(input.length); for(int x=0;x<input.length;x++) { b.bytes[x] = (byte) input.ints[x]; } b.length = input.length; if (output == NO_OUTPUT) { System.out.println("\nFST ADD: input=" + toString(b) + " " + b); } else { System.out.println("\nFST ADD: input=" + toString(b) + " " + b + " output=" + fst.outputs.outputToString(output)); } } */	TokenNameCOMMENT_BLOCK	 if (DEBUG) { BytesRef b = new BytesRef(input.length); for(int x=0;x<input.length;x++) { b.bytes[x] = (byte) input.ints[x]; } b.length = input.length; if (output == NO_OUTPUT) { System.out.println("\nFST ADD: input=" + toString(b) + " " + b); } else { System.out.println("\nFST ADD: input=" + toString(b) + " " + b + " output=" + fst.outputs.outputToString(output)); } } 
// De-dup NO_OUTPUT since it must be a singleton: 	TokenNameCOMMENT_LINE	De-dup NO_OUTPUT since it must be a singleton: 
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"inputs are added out of order lastInput="	TokenNameStringLiteral	inputs are added out of order lastInput=
+	TokenNamePLUS	
lastInput	TokenNameIdentifier	 last Input
+	TokenNamePLUS	
" vs input="	TokenNameStringLiteral	 vs input=
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
assert	TokenNameassert	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("\nadd: " + input); 	TokenNameCOMMENT_LINE	System.out.println("\nadd: " + input); 
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty input: only allowed as first input. we have 	TokenNameCOMMENT_LINE	empty input: only allowed as first input. we have 
// to special case this because the packed FST 	TokenNameCOMMENT_LINE	to special case this because the packed FST 
// format cannot represent the empty input since 	TokenNameCOMMENT_LINE	format cannot represent the empty input since 
// 'finalness' is stored on the incoming arc, not on 	TokenNameCOMMENT_LINE	'finalness' is stored on the incoming arc, not on 
// the node 	TokenNameCOMMENT_LINE	the node 
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
setEmptyOutput	TokenNameIdentifier	 set Empty Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// compare shared prefix length 	TokenNameCOMMENT_LINE	compare shared prefix length 
int	TokenNameint	
pos1	TokenNameIdentifier	 pos1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos2	TokenNameIdentifier	 pos2
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pos1Stop	TokenNameIdentifier	 pos1 Stop
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
pos1	TokenNameIdentifier	 pos1
]	TokenNameRBRACKET	
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//System.out.println(" incr " + pos1 + " ct=" + frontier[pos1].inputCount + " n=" + frontier[pos1]); 	TokenNameCOMMENT_LINE	System.out.println(" incr " + pos1 + " ct=" + frontier[pos1].inputCount + " n=" + frontier[pos1]); 
if	TokenNameif	
(	TokenNameLPAREN	
pos1	TokenNameIdentifier	 pos1
>=	TokenNameGREATER_EQUAL	
pos1Stop	TokenNameIdentifier	 pos1 Stop
||	TokenNameOR_OR	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
pos1	TokenNameIdentifier	 pos1
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
pos2	TokenNameIdentifier	 pos2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos1	TokenNameIdentifier	 pos1
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pos2	TokenNameIdentifier	 pos2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
=	TokenNameEQUAL	
pos1	TokenNameIdentifier	 pos1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frontier	TokenNameIdentifier	 frontier
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
frontier	TokenNameIdentifier	 frontier
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
frontier	TokenNameIdentifier	 frontier
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
frontier	TokenNameIdentifier	 frontier
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// minimize/compile states from previous input's 	TokenNameCOMMENT_LINE	minimize/compile states from previous input's 
// orphan'd suffix 	TokenNameCOMMENT_LINE	orphan'd suffix 
freezeTail	TokenNameIdentifier	 freeze Tail
(	TokenNameLPAREN	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// init tail states for current input 	TokenNameCOMMENT_LINE	init tail states for current input 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<=	TokenNameLESS_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
addArc	TokenNameIdentifier	 add Arc
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastNode	TokenNameIdentifier	 last Node
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
lastNode	TokenNameIdentifier	 last Node
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
// push conflicting outputs forward, only as far as 	TokenNameCOMMENT_LINE	push conflicting outputs forward, only as far as 
// needed 	TokenNameCOMMENT_LINE	needed 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
parentNode	TokenNameIdentifier	 parent Node
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
lastOutput	TokenNameIdentifier	 last Output
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
getLastOutput	TokenNameIdentifier	 get Last Output
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
lastOutput	TokenNameIdentifier	 last Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
wordSuffix	TokenNameIdentifier	 word Suffix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastOutput	TokenNameIdentifier	 last Output
!=	TokenNameNOT_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
common	TokenNameIdentifier	 common
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
lastOutput	TokenNameIdentifier	 last Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordSuffix	TokenNameIdentifier	 word Suffix
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
lastOutput	TokenNameIdentifier	 last Output
,	TokenNameCOMMA	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
wordSuffix	TokenNameIdentifier	 word Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
setLastOutput	TokenNameIdentifier	 set Last Output
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
prependOutput	TokenNameIdentifier	 prepend Output
(	TokenNameLPAREN	
wordSuffix	TokenNameIdentifier	 word Suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
=	TokenNameEQUAL	
wordSuffix	TokenNameIdentifier	 word Suffix
=	TokenNameEQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
commonOutputPrefix	TokenNameIdentifier	 common Output Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// same input more than 1 time in a row, mapping to 	TokenNameCOMMENT_LINE	same input more than 1 time in a row, mapping to 
// multiple outputs 	TokenNameCOMMENT_LINE	multiple outputs 
lastNode	TokenNameIdentifier	 last Node
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
lastNode	TokenNameIdentifier	 last Node
.	TokenNameDOT	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this new arc is private to this new input; set its 	TokenNameCOMMENT_LINE	this new arc is private to this new input; set its 
// arc output to the leftover output: 	TokenNameCOMMENT_LINE	arc output to the leftover output: 
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
setLastOutput	TokenNameIdentifier	 set Last Output
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
prefixLenPlus1	TokenNameIdentifier	 prefix Len Plus1
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// save last input 	TokenNameCOMMENT_LINE	save last input 
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
copyInts	TokenNameIdentifier	 copy Ints
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" count[0]=" + frontier[0].inputCount); 	TokenNameCOMMENT_LINE	System.out.println(" count[0]=" + frontier[0].inputCount); 
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
||	TokenNameOR_OR	
!	TokenNameNOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns final FST. NOTE: this will return null if * nothing is accepted by the FST. */	TokenNameCOMMENT_JAVADOC	 Returns final FST. NOTE: this will return null if nothing is accepted by the FST. 
public	TokenNamepublic	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
frontier	TokenNameIdentifier	 frontier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// minimize nodes in the last word's suffix 	TokenNameCOMMENT_LINE	minimize nodes in the last word's suffix 
freezeTail	TokenNameIdentifier	 freeze Tail
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
<	TokenNameLESS	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
||	TokenNameOR_OR	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
inputCount	TokenNameIdentifier	 input Count
<	TokenNameLESS	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
||	TokenNameOR_OR	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
emptyOutput	TokenNameIdentifier	 empty Output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
minSuffixCount1	TokenNameIdentifier	 min Suffix Count1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty string got pruned 	TokenNameCOMMENT_LINE	empty string got pruned 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minSuffixCount2	TokenNameIdentifier	 min Suffix Count2
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compileAllTargets	TokenNameIdentifier	 compile All Targets
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//if (DEBUG) System.out.println(" builder.finish root.isFinal=" + root.isFinal + " root.output=" + root.output); 	TokenNameCOMMENT_LINE	if (DEBUG) System.out.println(" builder.finish root.isFinal=" + root.isFinal + " root.output=" + root.output); 
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
compileNode	TokenNameIdentifier	 compile Node
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
lastInput	TokenNameIdentifier	 last Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compileAllTargets	TokenNameIdentifier	 compile All Targets
(	TokenNameLPAREN	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
tailLength	TokenNameIdentifier	 tail Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
isCompiled	TokenNameIdentifier	 is Compiled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not yet compiled 	TokenNameCOMMENT_LINE	not yet compiled 
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
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("seg=" + segment + " FORCE final arc=" + (char) arc.label); 	TokenNameCOMMENT_LINE	System.out.println("seg=" + segment + " FORCE final arc=" + (char) arc.label); 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
compileNode	TokenNameIdentifier	 compile Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
tailLength	TokenNameIdentifier	 tail Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expert: holds a pending (seen but not yet serialized) arc. */	TokenNameCOMMENT_JAVADOC	 Expert: holds a pending (seen but not yet serialized) arc. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
// really an "unsigned" byte 	TokenNameCOMMENT_LINE	really an "unsigned" byte 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
;	TokenNameSEMICOLON	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
nextFinalOutput	TokenNameIdentifier	 next Final Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: not many instances of Node or CompiledNode are in 	TokenNameCOMMENT_LINE	NOTE: not many instances of Node or CompiledNode are in 
// memory while the FST is being built; it's only the 	TokenNameCOMMENT_LINE	memory while the FST is being built; it's only the 
// current "frontier": 	TokenNameCOMMENT_LINE	current "frontier": 
static	TokenNamestatic	
interface	TokenNameinterface	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isCompiled	TokenNameIdentifier	 is Compiled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CompiledNode	TokenNameIdentifier	 Compiled Node
implements	TokenNameimplements	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompiled	TokenNameIdentifier	 is Compiled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expert: holds a pending (seen but not yet serialized) Node. */	TokenNameCOMMENT_JAVADOC	 Expert: holds a pending (seen but not yet serialized) Node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
final	TokenNamefinal	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arcs	TokenNameIdentifier	 arcs
;	TokenNameSEMICOLON	
// TODO: instead of recording isFinal/output on the 	TokenNameCOMMENT_LINE	TODO: instead of recording isFinal/output on the 
// node, maybe we should use -1 arc to mean "end" (like 	TokenNameCOMMENT_LINE	node, maybe we should use -1 arc to mean "end" (like 
// we do when reading the FST). Would simplify much 	TokenNameCOMMENT_LINE	we do when reading the FST). Would simplify much 
// code here... 	TokenNameCOMMENT_LINE	code here... 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
inputCount	TokenNameIdentifier	 input Count
;	TokenNameSEMICOLON	
/** This node's depth, starting from the automaton root. */	TokenNameCOMMENT_JAVADOC	 This node's depth, starting from the automaton root. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
/** * @param depth * The node's depth starting from the automaton root. Needed for * LUCENE-2934 (node expansion based on conditions other than the * fanout size). */	TokenNameCOMMENT_JAVADOC	 @param depth The node's depth starting from the automaton root. Needed for LUCENE-2934 (node expansion based on conditions other than the fanout size). 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
UnCompiledNode	TokenNameIdentifier	 Un Compiled Node
(	TokenNameLPAREN	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
arcs	TokenNameIdentifier	 arcs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompiled	TokenNameIdentifier	 is Compiled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numArcs	TokenNameIdentifier	 num Arcs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
inputCount	TokenNameIdentifier	 input Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// We don't clear the depth here because it never changes 	TokenNameCOMMENT_LINE	We don't clear the depth here because it never changes 
// for nodes on the frontier (even when reused). 	TokenNameCOMMENT_LINE	for nodes on the frontier (even when reused). 
}	TokenNameRBRACE	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getLastOutput	TokenNameIdentifier	 get Last Output
(	TokenNameLPAREN	
int	TokenNameint	
labelToMatch	TokenNameIdentifier	 label To Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
numArcs	TokenNameIdentifier	 num Arcs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
labelToMatch	TokenNameIdentifier	 label To Match
;	TokenNameSEMICOLON	
return	TokenNamereturn	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addArc	TokenNameIdentifier	 add Arc
(	TokenNameLPAREN	
int	TokenNameint	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
label	TokenNameIdentifier	 label
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
label	TokenNameIdentifier	 label
>	TokenNameGREATER	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
:	TokenNameCOLON	
"arc[-1].label="	TokenNameStringLiteral	arc[-1].label=
+	TokenNamePLUS	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" new label="	TokenNameStringLiteral	 new label=
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" numArcs="	TokenNameStringLiteral	 numArcs=
+	TokenNamePLUS	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numArcs	TokenNameIdentifier	 num Arcs
==	TokenNameEQUAL_EQUAL	
arcs	TokenNameIdentifier	 arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArcs	TokenNameIdentifier	 new Arcs
=	TokenNameEQUAL	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
numArcs	TokenNameIdentifier	 num Arcs
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
<	TokenNameLESS	
newArcs	TokenNameIdentifier	 new Arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newArcs	TokenNameIdentifier	 new Arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arcs	TokenNameIdentifier	 arcs
=	TokenNameEQUAL	
newArcs	TokenNameIdentifier	 new Arcs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
replaceLast	TokenNameIdentifier	 replace Last
(	TokenNameLPAREN	
int	TokenNameint	
labelToMatch	TokenNameIdentifier	 label To Match
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
nextFinalOutput	TokenNameIdentifier	 next Final Output
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFinal	TokenNameIdentifier	 is Final
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
numArcs	TokenNameIdentifier	 num Arcs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
labelToMatch	TokenNameIdentifier	 label To Match
:	TokenNameCOLON	
"arc.label="	TokenNameStringLiteral	arc.label=
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
labelToMatch	TokenNameIdentifier	 label To Match
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
//assert target.node != -2; 	TokenNameCOMMENT_LINE	assert target.node != -2; 
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
=	TokenNameEQUAL	
nextFinalOutput	TokenNameIdentifier	 next Final Output
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
=	TokenNameEQUAL	
isFinal	TokenNameIdentifier	 is Final
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deleteLast	TokenNameIdentifier	 delete Last
(	TokenNameLPAREN	
int	TokenNameint	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
numArcs	TokenNameIdentifier	 num Arcs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
assert	TokenNameassert	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
numArcs	TokenNameIdentifier	 num Arcs
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLastOutput	TokenNameIdentifier	 set Last Output
(	TokenNameLPAREN	
int	TokenNameint	
labelToMatch	TokenNameIdentifier	 label To Match
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
newOutput	TokenNameIdentifier	 new Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
newOutput	TokenNameIdentifier	 new Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
numArcs	TokenNameIdentifier	 num Arcs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
numArcs	TokenNameIdentifier	 num Arcs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
labelToMatch	TokenNameIdentifier	 label To Match
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
newOutput	TokenNameIdentifier	 new Output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pushes an output prefix forward onto all arcs 	TokenNameCOMMENT_LINE	pushes an output prefix forward onto all arcs 
public	TokenNamepublic	
void	TokenNamevoid	
prependOutput	TokenNameIdentifier	 prepend Output
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
outputPrefix	TokenNameIdentifier	 output Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
outputPrefix	TokenNameIdentifier	 output Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arcIdx	TokenNameIdentifier	 arc Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
<	TokenNameLESS	
numArcs	TokenNameIdentifier	 num Arcs
;	TokenNameSEMICOLON	
arcIdx	TokenNameIdentifier	 arc Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
outputPrefix	TokenNameIdentifier	 output Prefix
,	TokenNameCOMMA	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
arcs	TokenNameIdentifier	 arcs
[	TokenNameLBRACKET	
arcIdx	TokenNameIdentifier	 arc Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFinal	TokenNameIdentifier	 is Final
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
outputPrefix	TokenNameIdentifier	 output Prefix
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
validOutput	TokenNameIdentifier	 valid Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
