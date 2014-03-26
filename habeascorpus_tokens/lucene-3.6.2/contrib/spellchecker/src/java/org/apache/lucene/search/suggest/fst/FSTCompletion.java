package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
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
Arc	TokenNameIdentifier	 Arc
;	TokenNameSEMICOLON	
/** * Finite state automata based implementation of "autocomplete" functionality. * * @see FSTCompletionBuilder * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Finite state automata based implementation of "autocomplete" functionality. * @see FSTCompletionBuilder @lucene.experimental 
// TODO: we could store exact weights as outputs from the FST (int4 encoded 	TokenNameCOMMENT_LINE	TODO: we could store exact weights as outputs from the FST (int4 encoded 
// floats). This would provide exact outputs from this method and to some 	TokenNameCOMMENT_LINE	floats). This would provide exact outputs from this method and to some 
// degree allowed post-sorting on a more fine-grained weight. 	TokenNameCOMMENT_LINE	degree allowed post-sorting on a more fine-grained weight. 
// TODO: support for Analyzers (infix suggestions, synonyms?) 	TokenNameCOMMENT_LINE	TODO: support for Analyzers (infix suggestions, synonyms?) 
public	TokenNamepublic	
class	TokenNameclass	
FSTCompletion	TokenNameIdentifier	 FST Completion
{	TokenNameLBRACE	
/** * A single completion for a given key. */	TokenNameCOMMENT_JAVADOC	 A single completion for a given key. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Completion	TokenNameIdentifier	 Completion
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8	TokenNameIdentifier	 utf8
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
Completion	TokenNameIdentifier	 Completion
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
deepCopyOf	TokenNameIdentifier	 deep Copy Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
bucket	TokenNameIdentifier	 bucket
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
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see BytesRef#compareTo(BytesRef) */	TokenNameCOMMENT_JAVADOC	 @see BytesRef#compareTo(BytesRef) 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Completion	TokenNameIdentifier	 Completion
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Default number of buckets. */	TokenNameCOMMENT_JAVADOC	 Default number of buckets. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUCKETS	TokenNameIdentifier	 DEFAULT  BUCKETS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * An empty result. Keep this an {@link ArrayList} to keep all the returned * lists of single type (monomorphic calls). */	TokenNameCOMMENT_JAVADOC	 An empty result. Keep this an {@link ArrayList} to keep all the returned lists of single type (monomorphic calls). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
EMPTY_RESULT	TokenNameIdentifier	 EMPTY  RESULT
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Finite state automaton encoding all the lookup terms. See class notes for * details. */	TokenNameCOMMENT_JAVADOC	 Finite state automaton encoding all the lookup terms. See class notes for details. 
private	TokenNameprivate	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
automaton	TokenNameIdentifier	 automaton
;	TokenNameSEMICOLON	
/** * An array of arcs leaving the root automaton state and encoding weights of * all completions in their sub-trees. */	TokenNameCOMMENT_JAVADOC	 An array of arcs leaving the root automaton state and encoding weights of all completions in their sub-trees. 
private	TokenNameprivate	
final	TokenNamefinal	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rootArcs	TokenNameIdentifier	 root Arcs
;	TokenNameSEMICOLON	
/** * @see #FSTCompletion(FST, boolean, boolean) */	TokenNameCOMMENT_JAVADOC	 @see #FSTCompletion(FST, boolean, boolean) 
private	TokenNameprivate	
boolean	TokenNameboolean	
exactFirst	TokenNameIdentifier	 exact First
;	TokenNameSEMICOLON	
/** * @see #FSTCompletion(FST, boolean, boolean) */	TokenNameCOMMENT_JAVADOC	 @see #FSTCompletion(FST, boolean, boolean) 
private	TokenNameprivate	
boolean	TokenNameboolean	
higherWeightsFirst	TokenNameIdentifier	 higher Weights First
;	TokenNameSEMICOLON	
/** * @param automaton * Automaton with completions. See {@link FSTCompletionBuilder}. * @param higherWeightsFirst * Return most popular suggestions first. This is the default * behavior for this implementation. Setting it to <code>false</code> * has no effect (use constant term weights to sort alphabetically * only). * @param exactFirst * Find and push an exact match to the first position of the result * list if found. */	TokenNameCOMMENT_JAVADOC	 @param automaton Automaton with completions. See {@link FSTCompletionBuilder}. @param higherWeightsFirst Return most popular suggestions first. This is the default behavior for this implementation. Setting it to <code>false</code> has no effect (use constant term weights to sort alphabetically only). @param exactFirst Find and push an exact match to the first position of the result list if found. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
FSTCompletion	TokenNameIdentifier	 FST Completion
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
automaton	TokenNameIdentifier	 automaton
,	TokenNameCOMMA	
boolean	TokenNameboolean	
higherWeightsFirst	TokenNameIdentifier	 higher Weights First
,	TokenNameCOMMA	
boolean	TokenNameboolean	
exactFirst	TokenNameIdentifier	 exact First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
automaton	TokenNameIdentifier	 automaton
=	TokenNameEQUAL	
automaton	TokenNameIdentifier	 automaton
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
automaton	TokenNameIdentifier	 automaton
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rootArcs	TokenNameIdentifier	 root Arcs
=	TokenNameEQUAL	
cacheRootArcs	TokenNameIdentifier	 cache Root Arcs
(	TokenNameLPAREN	
automaton	TokenNameIdentifier	 automaton
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rootArcs	TokenNameIdentifier	 root Arcs
=	TokenNameEQUAL	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
higherWeightsFirst	TokenNameIdentifier	 higher Weights First
=	TokenNameEQUAL	
higherWeightsFirst	TokenNameIdentifier	 higher Weights First
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exactFirst	TokenNameIdentifier	 exact First
=	TokenNameEQUAL	
exactFirst	TokenNameIdentifier	 exact First
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defaults to higher weights first and exact first. * @see #FSTCompletion(FST, boolean, boolean) */	TokenNameCOMMENT_JAVADOC	 Defaults to higher weights first and exact first. @see #FSTCompletion(FST, boolean, boolean) 
public	TokenNamepublic	
FSTCompletion	TokenNameIdentifier	 FST Completion
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
automaton	TokenNameIdentifier	 automaton
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
automaton	TokenNameIdentifier	 automaton
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cache the root node's output arcs starting with completions with the * highest weights. */	TokenNameCOMMENT_JAVADOC	 Cache the root node's output arcs starting with completions with the highest weights. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"all"	TokenNameStringLiteral	all
}	TokenNameRBRACE	
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cacheRootArcs	TokenNameIdentifier	 cache Root Arcs
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
automaton	TokenNameIdentifier	 automaton
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>>	TokenNameRIGHT_SHIFT	
rootArcs	TokenNameIdentifier	 root Arcs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
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
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isLast	TokenNameIdentifier	 is Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
rootArcs	TokenNameIdentifier	 root Arcs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we want highest weights first. 	TokenNameCOMMENT_LINE	we want highest weights first. 
return	TokenNamereturn	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the first exact match by traversing root arcs, starting from the * arc <code>rootArcIndex</code>. * * @param rootArcIndex * The first root arc index in {@link #rootArcs} to consider when * matching. * * @param utf8 * The sequence of utf8 bytes to follow. * * @return Returns the bucket number of the match or <code>-1</code> if no * match was found. */	TokenNameCOMMENT_JAVADOC	 Returns the first exact match by traversing root arcs, starting from the arc <code>rootArcIndex</code>. * @param rootArcIndex The first root arc index in {@link #rootArcs} to consider when matching. * @param utf8 The sequence of utf8 bytes to follow. * @return Returns the bucket number of the match or <code>-1</code> if no match was found. 
private	TokenNameprivate	
int	TokenNameint	
getExactMatchStartingFromRootArc	TokenNameIdentifier	 get Exact Match Starting From Root Arc
(	TokenNameLPAREN	
int	TokenNameint	
rootArcIndex	TokenNameIdentifier	 root Arc Index
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the UTF-8 bytes representation of the input key. 	TokenNameCOMMENT_LINE	Get the UTF-8 bytes representation of the input key. 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
rootArcIndex	TokenNameIdentifier	 root Arc Index
<	TokenNameLESS	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
rootArcIndex	TokenNameIdentifier	 root Arc Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
rootArc	TokenNameIdentifier	 root Arc
=	TokenNameEQUAL	
rootArcs	TokenNameIdentifier	 root Arcs
[	TokenNameLBRACKET	
rootArcIndex	TokenNameIdentifier	 root Arc Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
rootArc	TokenNameIdentifier	 root Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Descend into the automaton using the key as prefix. 	TokenNameCOMMENT_LINE	Descend into the automaton using the key as prefix. 
if	TokenNameif	
(	TokenNameLPAREN	
descendWithPrefix	TokenNameIdentifier	 descend With Prefix
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
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
// Normalize prefix-encoded weight. 	TokenNameCOMMENT_LINE	Normalize prefix-encoded weight. 
return	TokenNamereturn	
rootArc	TokenNameIdentifier	 root Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should never happen, but anyway. 	TokenNameCOMMENT_LINE	Should never happen, but anyway. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No match. 	TokenNameCOMMENT_LINE	No match. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lookup suggestions to <code>key</code>. * * @param key * The prefix to which suggestions should be sought. * @param num * At most this number of suggestions will be returned. * @return Returns the suggestions, sorted by their approximated weight first * (decreasing) and then alphabetically (UTF-8 codepoint order). */	TokenNameCOMMENT_JAVADOC	 Lookup suggestions to <code>key</code>. * @param key The prefix to which suggestions should be sought. @param num At most this number of suggestions will be returned. @return Returns the suggestions, sorted by their approximated weight first (decreasing) and then alphabetically (UTF-8 codepoint order). 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
automaton	TokenNameIdentifier	 automaton
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_RESULT	TokenNameIdentifier	 EMPTY  RESULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
keyUtf8	TokenNameIdentifier	 key Utf8
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
higherWeightsFirst	TokenNameIdentifier	 higher Weights First
&&	TokenNameAND_AND	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We could emit a warning here (?). An optimal strategy for 	TokenNameCOMMENT_LINE	We could emit a warning here (?). An optimal strategy for 
// alphabetically sorted 	TokenNameCOMMENT_LINE	alphabetically sorted 
// suggestions would be to add them with a constant weight -- this saves 	TokenNameCOMMENT_LINE	suggestions would be to add them with a constant weight -- this saves 
// unnecessary 	TokenNameCOMMENT_LINE	unnecessary 
// traversals and sorting. 	TokenNameCOMMENT_LINE	traversals and sorting. 
return	TokenNamereturn	
lookupSortedAlphabetically	TokenNameIdentifier	 lookup Sorted Alphabetically
(	TokenNameLPAREN	
keyUtf8	TokenNameIdentifier	 key Utf8
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
lookupSortedByWeight	TokenNameIdentifier	 lookup Sorted By Weight
(	TokenNameLPAREN	
keyUtf8	TokenNameIdentifier	 key Utf8
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should never happen, but anyway. 	TokenNameCOMMENT_LINE	Should never happen, but anyway. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Lookup suggestions sorted alphabetically <b>if weights are not * constant</b>. This is a workaround: in general, use constant weights for * alphabetically sorted result. */	TokenNameCOMMENT_JAVADOC	 Lookup suggestions sorted alphabetically <b>if weights are not constant</b>. This is a workaround: in general, use constant weights for alphabetically sorted result. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
lookupSortedAlphabetically	TokenNameIdentifier	 lookup Sorted Alphabetically
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Greedily get num results from each weight branch. 	TokenNameCOMMENT_LINE	Greedily get num results from each weight branch. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
lookupSortedByWeight	TokenNameIdentifier	 lookup Sorted By Weight
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sort and trim. 	TokenNameCOMMENT_LINE	Sort and trim. 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lookup suggestions sorted by weight (descending order). * * @param collectAll * If <code>true</code>, the routine terminates immediately when * <code>num</code> suggestions have been collected. If * <code>false</code>, it will collect suggestions from all weight * arcs (needed for {@link #lookupSortedAlphabetically}. */	TokenNameCOMMENT_JAVADOC	 Lookup suggestions sorted by weight (descending order). * @param collectAll If <code>true</code>, the routine terminates immediately when <code>num</code> suggestions have been collected. If <code>false</code>, it will collect suggestions from all weight arcs (needed for {@link #lookupSortedAlphabetically}. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
lookupSortedByWeight	TokenNameIdentifier	 lookup Sorted By Weight
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
boolean	TokenNameboolean	
collectAll	TokenNameIdentifier	 collect All
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Don't overallocate the results buffers. This also serves the purpose of 	TokenNameCOMMENT_LINE	Don't overallocate the results buffers. This also serves the purpose of 
// allowing the user of this class to request all matches using Integer.MAX_VALUE as 	TokenNameCOMMENT_LINE	allowing the user of this class to request all matches using Integer.MAX_VALUE as 
// the number of results. 	TokenNameCOMMENT_LINE	the number of results. 
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
deepCopyOf	TokenNameIdentifier	 deep Copy Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
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
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
rootArc	TokenNameIdentifier	 root Arc
=	TokenNameEQUAL	
rootArcs	TokenNameIdentifier	 root Arcs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
rootArc	TokenNameIdentifier	 root Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Descend into the automaton using the key as prefix. 	TokenNameCOMMENT_LINE	Descend into the automaton using the key as prefix. 
if	TokenNameif	
(	TokenNameLPAREN	
descendWithPrefix	TokenNameIdentifier	 descend With Prefix
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A subgraph starting from the current node has the completions 	TokenNameCOMMENT_LINE	A subgraph starting from the current node has the completions 
// of the key prefix. The arc we're at is the last key's byte, 	TokenNameCOMMENT_LINE	of the key prefix. The arc we're at is the last key's byte, 
// so we will collect it too. 	TokenNameCOMMENT_LINE	so we will collect it too. 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
rootArc	TokenNameIdentifier	 root Arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
collectAll	TokenNameIdentifier	 collect All
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have enough suggestions to return immediately. Keep on looking 	TokenNameCOMMENT_LINE	We have enough suggestions to return immediately. Keep on looking 
// for an 	TokenNameCOMMENT_LINE	for an 
// exact match, if requested. 	TokenNameCOMMENT_LINE	exact match, if requested. 
if	TokenNameif	
(	TokenNameLPAREN	
exactFirst	TokenNameIdentifier	 exact First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkExistingAndReorder	TokenNameIdentifier	 check Existing And Reorder
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exactMatchBucket	TokenNameIdentifier	 exact Match Bucket
=	TokenNameEQUAL	
getExactMatchStartingFromRootArc	TokenNameIdentifier	 get Exact Match Starting From Root Arc
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exactMatchBucket	TokenNameIdentifier	 exact Match Bucket
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Insert as the first result and truncate at num. 	TokenNameCOMMENT_LINE	Insert as the first result and truncate at num. 
while	TokenNamewhile	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
Completion	TokenNameIdentifier	 Completion
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
exactMatchBucket	TokenNameIdentifier	 exact Match Bucket
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the list of * {@link org.apache.lucene.search.suggest.Lookup.LookupResult}s already has a * <code>key</code>. If so, reorders that * {@link org.apache.lucene.search.suggest.Lookup.LookupResult} to the first * position. * * @return Returns <code>true<code> if and only if <code>list</code> contained * <code>key</code>. */	TokenNameCOMMENT_JAVADOC	 Checks if the list of {@link org.apache.lucene.search.suggest.Lookup.LookupResult}s already has a <code>key</code>. If so, reorders that {@link org.apache.lucene.search.suggest.Lookup.LookupResult} to the first position. * @return Returns <code>true<code> if and only if <code>list</code> contained <code>key</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkExistingAndReorder	TokenNameIdentifier	 check Existing And Reorder
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We assume list does not have duplicates (because of how the FST is created). 	TokenNameCOMMENT_LINE	We assume list does not have duplicates (because of how the FST is created). 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Key found. Unless already at i==0, remove it and push up front so 	TokenNameCOMMENT_LINE	Key found. Unless already at i==0, remove it and push up front so 
// that the ordering 	TokenNameCOMMENT_LINE	that the ordering 
// remains identical with the exception of the exact match. 	TokenNameCOMMENT_LINE	remains identical with the exception of the exact match. 
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Descend along the path starting at <code>arc</code> and going through bytes * in the argument. * * @param arc * The starting arc. This argument is modified in-place. * @param utf8 * The term to descend along. * @return If <code>true</code>, <code>arc</code> will be set to the arc * matching last byte of <code>term</code>. <code>false</code> is * returned if no such prefix exists. */	TokenNameCOMMENT_JAVADOC	 Descend along the path starting at <code>arc</code> and going through bytes in the argument. * @param arc The starting arc. This argument is modified in-place. @param utf8 The term to descend along. @return If <code>true</code>, <code>arc</code> will be set to the arc matching last byte of <code>term</code>. <code>false</code> is returned if no such prefix exists. 
private	TokenNameprivate	
boolean	TokenNameboolean	
descendWithPrefix	TokenNameIdentifier	 descend With Prefix
(	TokenNameLPAREN	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// Cannot save as instance var since multiple threads 	TokenNameCOMMENT_LINE	Cannot save as instance var since multiple threads 
// can use FSTCompletion at once... 	TokenNameCOMMENT_LINE	can use FSTCompletion at once... 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
=	TokenNameEQUAL	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
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
// No matching prefixes, return an empty result. 	TokenNameCOMMENT_LINE	No matching prefixes, return an empty result. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursive collect lookup results from the automaton subgraph starting at * <code>arc</code>. * * @param num * Maximum number of results needed (early termination). */	TokenNameCOMMENT_JAVADOC	 Recursive collect lookup results from the automaton subgraph starting at <code>arc</code>. * @param num Maximum number of results needed (early termination). 
private	TokenNameprivate	
boolean	TokenNameboolean	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Completion	TokenNameIdentifier	 Completion
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
readFirstTargetArc	TokenNameIdentifier	 read First Target Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Completion	TokenNameIdentifier	 Completion
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
save	TokenNameIdentifier	 save
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
new	TokenNamenew	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
save	TokenNameIdentifier	 save
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
automaton	TokenNameIdentifier	 automaton
.	TokenNameDOT	
readNextArc	TokenNameIdentifier	 read Next Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bucket count (discretization thresholds). */	TokenNameCOMMENT_JAVADOC	 Returns the bucket count (discretization thresholds). 
public	TokenNamepublic	
int	TokenNameint	
getBucketCount	TokenNameIdentifier	 get Bucket Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rootArcs	TokenNameIdentifier	 root Arcs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bucket assigned to a given key (if found) or <code>-1</code> if * no exact match exists. */	TokenNameCOMMENT_JAVADOC	 Returns the bucket assigned to a given key (if found) or <code>-1</code> if no exact match exists. 
public	TokenNamepublic	
int	TokenNameint	
getBucket	TokenNameIdentifier	 get Bucket
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getExactMatchStartingFromRootArc	TokenNameIdentifier	 get Exact Match Starting From Root Arc
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the internal automaton. */	TokenNameCOMMENT_JAVADOC	 Returns the internal automaton. 
public	TokenNamepublic	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
automaton	TokenNameIdentifier	 automaton
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
