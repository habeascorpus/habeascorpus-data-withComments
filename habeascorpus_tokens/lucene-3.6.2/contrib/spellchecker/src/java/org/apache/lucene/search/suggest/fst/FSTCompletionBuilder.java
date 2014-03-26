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
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
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
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Finite state automata based implementation of "autocomplete" functionality. * * <h2>Implementation details</h2> * * <p> * The construction step in {@link #finalize()} works as follows: * <ul> * <li>A set of input terms and their buckets is given.</li> * <li>All terms in the input are prefixed with a synthetic pseudo-character * (code) of the weight bucket the term fell into. For example a term * <code>abc</code> with a discretized weight equal '1' would become * <code>1abc</code>.</li> * <li>The terms are then sorted by their raw value of UTF-8 character values * (including the synthetic bucket code in front).</li> * <li>A finite state automaton ({@link FST}) is constructed from the input. The * root node has arcs labeled with all possible weights. We cache all these * arcs, highest-weight first.</li> * </ul> * * <p> * At runtime, in {@link FSTCompletion#lookup(CharSequence, int)}, * the automaton is utilized as follows: * <ul> * <li>For each possible term weight encoded in the automaton (cached arcs from * the root above), starting with the highest one, we descend along the path of * the input key. If the key is not a prefix of a sequence in the automaton * (path ends prematurely), we exit immediately -- no completions.</li> * <li>Otherwise, we have found an internal automaton node that ends the key. * <b>The entire subautomaton (all paths) starting from this node form the key's * completions.</b> We start the traversal of this subautomaton. Every time we * reach a final state (arc), we add a single suggestion to the list of results * (the weight of this suggestion is constant and equal to the root path we * started from). The tricky part is that because automaton edges are sorted and * we scan depth-first, we can terminate the entire procedure as soon as we * collect enough suggestions the user requested.</li> * <li>In case the number of suggestions collected in the step above is still * insufficient, we proceed to the next (smaller) weight leaving the root node * and repeat the same algorithm again.</li> * </ul> * * <h2>Runtime behavior and performance characteristic</h2> * * The algorithm described above is optimized for finding suggestions to short * prefixes in a top-weights-first order. This is probably the most common use * case: it allows presenting suggestions early and sorts them by the global * frequency (and then alphabetically). * * <p> * If there is an exact match in the automaton, it is returned first on the * results list (even with by-weight sorting). * * <p> * Note that the maximum lookup time for <b>any prefix</b> is the time of * descending to the subtree, plus traversal of the subtree up to the number of * requested suggestions (because they are already presorted by weight on the * root level and alphabetically at any node level). * * <p> * To order alphabetically only (no ordering by priorities), use identical term * weights for all terms. Alphabetical suggestions are returned even if * non-constant weights are used, but the algorithm for doing this is * suboptimal. * * <p> * "alphabetically" in any of the documentation above indicates UTF-8 * representation order, nothing else. * * <p> * <b>NOTE</b>: the FST file format is experimental and subject to suddenly * change, requiring you to rebuild the FST suggest index. * * @see FSTCompletion * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Finite state automata based implementation of "autocomplete" functionality. * <h2>Implementation details</h2> * <p> The construction step in {@link #finalize()} works as follows: <ul> <li>A set of input terms and their buckets is given.</li> <li>All terms in the input are prefixed with a synthetic pseudo-character (code) of the weight bucket the term fell into. For example a term <code>abc</code> with a discretized weight equal '1' would become <code>1abc</code>.</li> <li>The terms are then sorted by their raw value of UTF-8 character values (including the synthetic bucket code in front).</li> <li>A finite state automaton ({@link FST}) is constructed from the input. The root node has arcs labeled with all possible weights. We cache all these arcs, highest-weight first.</li> </ul> * <p> At runtime, in {@link FSTCompletion#lookup(CharSequence, int)}, the automaton is utilized as follows: <ul> <li>For each possible term weight encoded in the automaton (cached arcs from the root above), starting with the highest one, we descend along the path of the input key. If the key is not a prefix of a sequence in the automaton (path ends prematurely), we exit immediately -- no completions.</li> <li>Otherwise, we have found an internal automaton node that ends the key. <b>The entire subautomaton (all paths) starting from this node form the key's completions.</b> We start the traversal of this subautomaton. Every time we reach a final state (arc), we add a single suggestion to the list of results (the weight of this suggestion is constant and equal to the root path we started from). The tricky part is that because automaton edges are sorted and we scan depth-first, we can terminate the entire procedure as soon as we collect enough suggestions the user requested.</li> <li>In case the number of suggestions collected in the step above is still insufficient, we proceed to the next (smaller) weight leaving the root node and repeat the same algorithm again.</li> </ul> * <h2>Runtime behavior and performance characteristic</h2> * The algorithm described above is optimized for finding suggestions to short prefixes in a top-weights-first order. This is probably the most common use case: it allows presenting suggestions early and sorts them by the global frequency (and then alphabetically). * <p> If there is an exact match in the automaton, it is returned first on the results list (even with by-weight sorting). * <p> Note that the maximum lookup time for <b>any prefix</b> is the time of descending to the subtree, plus traversal of the subtree up to the number of requested suggestions (because they are already presorted by weight on the root level and alphabetically at any node level). * <p> To order alphabetically only (no ordering by priorities), use identical term weights for all terms. Alphabetical suggestions are returned even if non-constant weights are used, but the algorithm for doing this is suboptimal. * <p> "alphabetically" in any of the documentation above indicates UTF-8 representation order, nothing else. * <p> <b>NOTE</b>: the FST file format is experimental and subject to suddenly change, requiring you to rebuild the FST suggest index. * @see FSTCompletion @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
{	TokenNameLBRACE	
/** * Default number of buckets. */	TokenNameCOMMENT_JAVADOC	 Default number of buckets. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUCKETS	TokenNameIdentifier	 DEFAULT  BUCKETS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The number of separate buckets for weights (discretization). The more * buckets, the more fine-grained term weights (priorities) can be assigned. * The speed of lookup will not decrease for prefixes which have * highly-weighted completions (because these are filled-in first), but will * decrease significantly for low-weighted terms (but these should be * infrequent, so it is all right). * * <p> * The number of buckets must be within [1, 255] range. */	TokenNameCOMMENT_JAVADOC	 The number of separate buckets for weights (discretization). The more buckets, the more fine-grained term weights (priorities) can be assigned. The speed of lookup will not decrease for prefixes which have highly-weighted completions (because these are filled-in first), but will decrease significantly for low-weighted terms (but these should be infrequent, so it is all right). * <p> The number of buckets must be within [1, 255] range. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
buckets	TokenNameIdentifier	 buckets
;	TokenNameSEMICOLON	
/** * Finite state automaton encoding all the lookup terms. See class notes for * details. */	TokenNameCOMMENT_JAVADOC	 Finite state automaton encoding all the lookup terms. See class notes for details. 
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
automaton	TokenNameIdentifier	 automaton
;	TokenNameSEMICOLON	
/** * FST construction require re-sorting the input. This is the class that * collects all the input entries, their weights and then provides sorted * order. */	TokenNameCOMMENT_JAVADOC	 FST construction require re-sorting the input. This is the class that collects all the input entries, their weights and then provides sorted order. 
private	TokenNameprivate	
final	TokenNamefinal	
BytesRefSorter	TokenNameIdentifier	 Bytes Ref Sorter
sorter	TokenNameIdentifier	 sorter
;	TokenNameSEMICOLON	
/** * Scratch buffer for {@link #add(BytesRef, int)}. */	TokenNameCOMMENT_JAVADOC	 Scratch buffer for {@link #add(BytesRef, int)}. 
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Max tail sharing length. */	TokenNameCOMMENT_JAVADOC	 Max tail sharing length. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
;	TokenNameSEMICOLON	
/** * Creates an {@link FSTCompletion} with default options: 10 buckets, exact match * promoted to first position and {@link InMemorySorter} with a comparator obtained from * {@link BytesRef#getUTF8SortedAsUnicodeComparator()}. */	TokenNameCOMMENT_JAVADOC	 Creates an {@link FSTCompletion} with default options: 10 buckets, exact match promoted to first position and {@link InMemorySorter} with a comparator obtained from {@link BytesRef#getUTF8SortedAsUnicodeComparator()}. 
public	TokenNamepublic	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_BUCKETS	TokenNameIdentifier	 DEFAULT  BUCKETS
,	TokenNameCOMMA	
new	TokenNamenew	
InMemorySorter	TokenNameIdentifier	 In Memory Sorter
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
getUTF8SortedAsUnicodeComparator	TokenNameIdentifier	 get UT F8 Sorted As Unicode Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param buckets * The number of buckets for weight discretization. Buckets are used * in {@link #add(BytesRef, int)} and must be smaller than the number * given here. * * @param sorter * {@link BytesRefSorter} used for re-sorting input for the automaton. * For large inputs, use on-disk sorting implementations. The sorter * is closed automatically in {@link #build()} if it implements * {@link Closeable}. * * @param shareMaxTailLength * Max shared suffix sharing length. * * See the description of this parameter in {@link Builder}'s constructor. * In general, for very large inputs you'll want to construct a non-minimal * automaton which will be larger, but the construction will take far less ram. * For minimal automata, set it to {@link Integer#MAX_VALUE}. */	TokenNameCOMMENT_JAVADOC	 @param buckets The number of buckets for weight discretization. Buckets are used in {@link #add(BytesRef, int)} and must be smaller than the number given here. * @param sorter {@link BytesRefSorter} used for re-sorting input for the automaton. For large inputs, use on-disk sorting implementations. The sorter is closed automatically in {@link #build()} if it implements {@link Closeable}. * @param shareMaxTailLength Max shared suffix sharing length. * See the description of this parameter in {@link Builder}'s constructor. In general, for very large inputs you'll want to construct a non-minimal automaton which will be larger, but the construction will take far less ram. For minimal automata, set it to {@link Integer#MAX_VALUE}. 
public	TokenNamepublic	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
int	TokenNameint	
buckets	TokenNameIdentifier	 buckets
,	TokenNameCOMMA	
BytesRefSorter	TokenNameIdentifier	 Bytes Ref Sorter
sorter	TokenNameIdentifier	 sorter
,	TokenNameCOMMA	
int	TokenNameint	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
buckets	TokenNameIdentifier	 buckets
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Buckets must be >= 1 and <= 255: "	TokenNameStringLiteral	Buckets must be >= 1 and <= 255: 
+	TokenNamePLUS	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sorter	TokenNameIdentifier	 sorter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"BytesRefSorter must not be null."	TokenNameStringLiteral	BytesRefSorter must not be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sorter	TokenNameIdentifier	 sorter
=	TokenNameEQUAL	
sorter	TokenNameIdentifier	 sorter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
buckets	TokenNameIdentifier	 buckets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
=	TokenNameEQUAL	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a single suggestion and its weight to the internal buffers. * * @param utf8 * The suggestion (utf8 representation) to be added. The content is * copied and the object can be reused. * @param bucket * The bucket to place this suggestion in. Must be non-negative and * smaller than the number of buckets passed in the constructor. * Higher numbers indicate suggestions that should be presented * before suggestions placed in smaller buckets. */	TokenNameCOMMENT_JAVADOC	 Appends a single suggestion and its weight to the internal buffers. * @param utf8 The suggestion (utf8 representation) to be added. The content is copied and the object can be reused. @param bucket The bucket to place this suggestion in. Must be non-negative and smaller than the number of buckets passed in the constructor. Higher numbers indicate suggestions that should be presented before suggestions placed in smaller buckets. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8	TokenNameIdentifier	 utf8
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bucket	TokenNameIdentifier	 bucket
>=	TokenNameGREATER_EQUAL	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Bucket outside of the allowed range [0, "	TokenNameStringLiteral	Bucket outside of the allowed range [0, 
+	TokenNamePLUS	
buckets	TokenNameIdentifier	 buckets
+	TokenNamePLUS	
"): "	TokenNameStringLiteral	): 
+	TokenNamePLUS	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sorter	TokenNameIdentifier	 sorter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the final automaton from a list of added entries. This method may * take a longer while as it needs to build the automaton. */	TokenNameCOMMENT_JAVADOC	 Builds the final automaton from a list of added entries. This method may take a longer while as it needs to build the automaton. 
public	TokenNamepublic	
FSTCompletion	TokenNameIdentifier	 FST Completion
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
automaton	TokenNameIdentifier	 automaton
=	TokenNameEQUAL	
buildAutomaton	TokenNameIdentifier	 build Automaton
(	TokenNameLPAREN	
sorter	TokenNameIdentifier	 sorter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sorter	TokenNameIdentifier	 sorter
instanceof	TokenNameinstanceof	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
sorter	TokenNameIdentifier	 sorter
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FSTCompletion	TokenNameIdentifier	 FST Completion
(	TokenNameLPAREN	
automaton	TokenNameIdentifier	 automaton
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the final automaton from a list of entries. */	TokenNameCOMMENT_JAVADOC	 Builds the final automaton from a list of entries. 
private	TokenNameprivate	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
buildAutomaton	TokenNameIdentifier	 build Automaton
(	TokenNameLPAREN	
BytesRefSorter	TokenNameIdentifier	 Bytes Ref Sorter
sorter	TokenNameIdentifier	 sorter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Build the automaton. 	TokenNameCOMMENT_LINE	Build the automaton. 
final	TokenNamefinal	
Outputs	TokenNameIdentifier	 Outputs
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
outputs	TokenNameIdentifier	 outputs
=	TokenNameEQUAL	
NoOutputs	TokenNameIdentifier	 No Outputs
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
.	TokenNameDOT	
BYTE1	TokenNameIdentifier	 BYT E1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
shareMaxTailLength	TokenNameIdentifier	 share Max Tail Length
,	TokenNameCOMMA	
outputs	TokenNameIdentifier	 outputs
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IntsRef	TokenNameIdentifier	 Ints Ref
scratchIntsRef	TokenNameIdentifier	 scratch Ints Ref
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
sorter	TokenNameIdentifier	 sorter
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
toIntsRef	TokenNameIdentifier	 to Ints Ref
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
scratchIntsRef	TokenNameIdentifier	 scratch Ints Ref
)	TokenNameRPAREN	
,	TokenNameCOMMA	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
