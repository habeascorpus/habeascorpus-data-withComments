/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
bzip2	TokenNameIdentifier	 bzip2
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
/** * Encapsulates the Burrows-Wheeler sorting algorithm needed by {@link * CBZip2OutputStream}. * * <p>This class is based on a Java port of Julian Seward's * blocksort.c in his libbzip2</p> * * <p>The Burrows-Wheeler transform is a reversible transform of the * original data that is supposed to group similiar bytes close to * each other. The idea is to sort all permutations of the input and * only keep the last byte of each permutation. E.g. for "Commons * Compress" you'd get:</p> * * <pre> * CompressCommons * Commons Compress * CompressCommons * essCommons Compr * mmons CompressCo * mons CompressCom * mpressCommons Co * ns CompressCommo * ommons CompressC * ompressCommons C * ons CompressComm * pressCommons Com * ressCommons Comp * s CompressCommon * sCommons Compres * ssCommons Compre * </pre> * * <p>Which results in a new text "ss romooCCmmpnse", in adition the * index of the first line that contained the original text is kept - * in this case it is 1. The idea is that in a long English text all * permutations that start with "he" are likely suffixes of a "the" and * thus they end in "t" leading to a larger block of "t"s that can * better be compressed by the subsequent Move-to-Front, run-length * und Huffman encoding steps.</p> * * <p>For more information see for example:</p> * <ul> * <li><a * href="http://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-124.pdf">Burrows, * M. and Wheeler, D.: A Block-sorting Lossless Data Compression * Algorithm</a></li> * <li><a href="http://webglimpse.net/pubs/suffix.pdf">Manber, U. and * Myers, G.: Suffix arrays: A new method for on-line string * searches</a></li> * <li><a * href="http://www.cs.tufts.edu/~nr/comp150fp/archive/bob-sedgewick/fast-strings.pdf">Bentley, * J.L. and Sedgewick, R.: Fast Algorithms for Sorting and Searching * Strings</a></li> * </ul> * * @NotThreadSafe */	TokenNameCOMMENT_JAVADOC	 Encapsulates the Burrows-Wheeler sorting algorithm needed by {@link CBZip2OutputStream}. * <p>This class is based on a Java port of Julian Seward's blocksort.c in his libbzip2</p> * <p>The Burrows-Wheeler transform is a reversible transform of the original data that is supposed to group similiar bytes close to each other. The idea is to sort all permutations of the input and only keep the last byte of each permutation. E.g. for "Commons Compress" you'd get:</p> * <pre> CompressCommons Commons Compress CompressCommons essCommons Compr mmons CompressCo mons CompressCom mpressCommons Co ns CompressCommo ommons CompressC ompressCommons C ons CompressComm pressCommons Com ressCommons Comp s CompressCommon sCommons Compres ssCommons Compre </pre> * <p>Which results in a new text "ss romooCCmmpnse", in adition the index of the first line that contained the original text is kept - in this case it is 1. The idea is that in a long English text all permutations that start with "he" are likely suffixes of a "the" and thus they end in "t" leading to a larger block of "t"s that can better be compressed by the subsequent Move-to-Front, run-length und Huffman encoding steps.</p> * <p>For more information see for example:</p> <ul> <li><a href="http://www.hpl.hp.com/techreports/Compaq-DEC/SRC-RR-124.pdf">Burrows, M. and Wheeler, D.: A Block-sorting Lossless Data Compression Algorithm</a></li> <li><a href="http://webglimpse.net/pubs/suffix.pdf">Manber, U. and Myers, G.: Suffix arrays: A new method for on-line string searches</a></li> <li><a href="http://www.cs.tufts.edu/~nr/comp150fp/archive/bob-sedgewick/fast-strings.pdf">Bentley, J.L. and Sedgewick, R.: Fast Algorithms for Sorting and Searching Strings</a></li> </ul> * @NotThreadSafe 
class	TokenNameclass	
BlockSort	TokenNameIdentifier	 Block Sort
{	TokenNameLBRACE	
/* * Some of the constructs used in the C code cannot be ported * literally to Java - for example macros, unsigned types. Some * code has been hand-tuned to improve performance. In order to * avoid memory pressure some structures are reused for several * blocks and some memory is even shared between sorting and the * MTF stage even though either algorithm uses it for its own * purpose. * * Comments preserved from the actual C code are prefixed with * "LBZ2:". */	TokenNameCOMMENT_BLOCK	 Some of the constructs used in the C code cannot be ported literally to Java - for example macros, unsigned types. Some code has been hand-tuned to improve performance. In order to avoid memory pressure some structures are reused for several blocks and some memory is even shared between sorting and the MTF stage even though either algorithm uses it for its own purpose. * Comments preserved from the actual C code are prefixed with "LBZ2:". 
/* * 2012-05-20 Stefan Bodewig: * * This class seems to mix several revisions of libbzip2's code. * The mainSort function and those used by it look closer to the * 0.9.5 version but show some variations introduced later. At * the same time the logic of Compress 1.4 to randomize the block * on bad input has been dropped after libbzip2 0.9.0 and replaced * by a fallback sorting algorithm. * * I've added the fallbackSort function of 1.0.6 and tried to * integrate it with the existing code without touching too much. * I've also removed the now unused randomization code. */	TokenNameCOMMENT_BLOCK	 2012-05-20 Stefan Bodewig: * This class seems to mix several revisions of libbzip2's code. The mainSort function and those used by it look closer to the 0.9.5 version but show some variations introduced later. At the same time the logic of Compress 1.4 to randomize the block on bad input has been dropped after libbzip2 0.9.0 and replaced by a fallback sorting algorithm. * I've added the fallbackSort function of 1.0.6 and tried to integrate it with the existing code without touching too much. I've also removed the now unused randomization code. 
/* * LBZ2: If you are ever unlucky/improbable enough to get a stack * overflow whilst sorting, increase the following constant and * try again. In practice I have never seen the stack go above 27 * elems, so the following limit seems very generous. */	TokenNameCOMMENT_BLOCK	 LBZ2: If you are ever unlucky/improbable enough to get a stack overflow whilst sorting, increase the following constant and try again. In practice I have never seen the stack go above 27 elems, so the following limit seems very generous. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QSORT_STACK_SIZE	TokenNameIdentifier	 QSORT  STACK  SIZE
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FALLBACK_QSORT_STACK_SIZE	TokenNameIdentifier	 FALLBACK  QSORT  STACK  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STACK_SIZE	TokenNameIdentifier	 STACK  SIZE
=	TokenNameEQUAL	
QSORT_STACK_SIZE	TokenNameIdentifier	 QSORT  STACK  SIZE
<	TokenNameLESS	
FALLBACK_QSORT_STACK_SIZE	TokenNameIdentifier	 FALLBACK  QSORT  STACK  SIZE
?	TokenNameQUESTION	
FALLBACK_QSORT_STACK_SIZE	TokenNameIdentifier	 FALLBACK  QSORT  STACK  SIZE
:	TokenNameCOLON	
QSORT_STACK_SIZE	TokenNameIdentifier	 QSORT  STACK  SIZE
;	TokenNameSEMICOLON	
/* * Used when sorting. If too many long comparisons happen, we stop sorting, * and use fallbackSort instead. */	TokenNameCOMMENT_BLOCK	 Used when sorting. If too many long comparisons happen, we stop sorting, and use fallbackSort instead. 
private	TokenNameprivate	
int	TokenNameint	
workDone	TokenNameIdentifier	 work Done
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
workLimit	TokenNameIdentifier	 work Limit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
firstAttempt	TokenNameIdentifier	 first Attempt
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_ll	TokenNameIdentifier	 stack ll
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
STACK_SIZE	TokenNameIdentifier	 STACK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 4000 byte 	TokenNameCOMMENT_LINE	4000 byte 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_hh	TokenNameIdentifier	 stack hh
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
STACK_SIZE	TokenNameIdentifier	 STACK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 4000 byte 	TokenNameCOMMENT_LINE	4000 byte 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_dd	TokenNameIdentifier	 stack dd
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
QSORT_STACK_SIZE	TokenNameIdentifier	 QSORT  STACK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 4000 byte 	TokenNameCOMMENT_LINE	4000 byte 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mainSort_runningOrder	TokenNameIdentifier	 main Sort running Order
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1024 byte 	TokenNameCOMMENT_LINE	1024 byte 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mainSort_copy	TokenNameIdentifier	 main Sort copy
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1024 byte 	TokenNameCOMMENT_LINE	1024 byte 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mainSort_bigDone	TokenNameIdentifier	 main Sort big Done
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ftab	TokenNameIdentifier	 ftab
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
65537	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 262148 byte 	TokenNameCOMMENT_LINE	262148 byte 
/** * Array instance identical to Data's sfmap, both are used only * temporarily and indepently, so we do not need to allocate * additional memory. */	TokenNameCOMMENT_JAVADOC	 Array instance identical to Data's sfmap, both are used only temporarily and indepently, so we do not need to allocate additional memory. 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
quadrant	TokenNameIdentifier	 quadrant
;	TokenNameSEMICOLON	
BlockSort	TokenNameIdentifier	 Block Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
quadrant	TokenNameIdentifier	 quadrant
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sfmap	TokenNameIdentifier	 sfmap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
blockSort	TokenNameIdentifier	 block Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
workLimit	TokenNameIdentifier	 work Limit
=	TokenNameEQUAL	
WORK_FACTOR	TokenNameIdentifier	 WORK  FACTOR
*	TokenNameMULTIPLY	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firstAttempt	TokenNameIdentifier	 first Attempt
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fallbackSort	TokenNameIdentifier	 fallback Sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mainSort	TokenNameIdentifier	 main Sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
firstAttempt	TokenNameIdentifier	 first Attempt
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
workLimit	TokenNameIdentifier	 work Limit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fallbackSort	TokenNameIdentifier	 fallback Sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// assert (data.origPtr != -1) : data.origPtr; 	TokenNameCOMMENT_LINE	assert (data.origPtr != -1) : data.origPtr; 
}	TokenNameRBRACE	
/** * Adapt fallbackSort to the expected interface of the rest of the * code, in particular deal with the fact that block starts at * offset 1 (in libbzip2 1.0.6 it starts at 0). */	TokenNameCOMMENT_JAVADOC	 Adapt fallbackSort to the expected interface of the rest of the code, in particular deal with the fact that block starts at offset 1 (in libbzip2 1.0.6 it starts at 0). 
final	TokenNamefinal	
void	TokenNamevoid	
fallbackSort	TokenNameIdentifier	 fallback Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fallbackSort	TokenNameIdentifier	 fallback Sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
last	TokenNameIdentifier	 last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*---------------------------------------------*/	TokenNameCOMMENT_BLOCK	---------------------------------------------
/*---------------------------------------------*/	TokenNameCOMMENT_BLOCK	---------------------------------------------
/*--- LBZ2: Fallback O(N log(N)^2) sorting ---*/	TokenNameCOMMENT_BLOCK	--- LBZ2: Fallback O(N log(N)^2) sorting ---
/*--- algorithm, for repetitive blocks ---*/	TokenNameCOMMENT_BLOCK	--- algorithm, for repetitive blocks ---
/*---------------------------------------------*/	TokenNameCOMMENT_BLOCK	---------------------------------------------
/* * This is the fallback sorting algorithm libbzip2 1.0.6 uses for * repetitive or very short inputs. * * The idea is inspired by Manber-Myers string suffix sorting * algorithm. First a bucket sort places each permutation of the * block into a bucket based on its first byte. Permutations are * represented by pointers to their first character kept in * (partially) sorted order inside the array ftab. * * The next step visits all buckets in order and performs a * quicksort on all permutations of the bucket based on the index * of the bucket the second byte of the permutation belongs to, * thereby forming new buckets. When arrived here the * permutations are sorted up to the second character and we have * buckets of permutations that are identical up to two * characters. * * Repeat the step of quicksorting each bucket, now based on the * bucket holding the sequence of the third and forth character * leading to four byte buckets. Repeat this doubling of bucket * sizes until all buckets only contain single permutations or the * bucket size exceeds the block size. * * I.e. * * "abraba" form three buckets for the chars "a", "b", and "r" in * the first step with * * fmap = { 'a:' 5, 3, 0, 'b:' 4, 1, 'r', 2 } * * when looking at the bucket of "a"s the second characters are in * the buckets that start with fmap-index 0 (rolled over), 3 and 3 * respectively, forming two new buckets "aa" and "ab", so we get * * fmap = { 'aa:' 5, 'ab:' 3, 0, 'ba:' 4, 'br': 1, 'ra:' 2 } * * since the last bucket only contained a single item it didn't * have to be sorted at all. * * There now is just one bucket with more than one permutation * that remains to be sorted. For the permutation that starts * with index 3 the third and forth char are in bucket 'aa' at * index 0 and for the one starting at block index 0 they are in * bucket 'ra' with sort index 5. The fully sorted order then becomes. * * fmap = { 5, 3, 0, 4, 1, 2 } * */	TokenNameCOMMENT_BLOCK	 This is the fallback sorting algorithm libbzip2 1.0.6 uses for repetitive or very short inputs. * The idea is inspired by Manber-Myers string suffix sorting algorithm. First a bucket sort places each permutation of the block into a bucket based on its first byte. Permutations are represented by pointers to their first character kept in (partially) sorted order inside the array ftab. * The next step visits all buckets in order and performs a quicksort on all permutations of the bucket based on the index of the bucket the second byte of the permutation belongs to, thereby forming new buckets. When arrived here the permutations are sorted up to the second character and we have buckets of permutations that are identical up to two characters. * Repeat the step of quicksorting each bucket, now based on the bucket holding the sequence of the third and forth character leading to four byte buckets. Repeat this doubling of bucket sizes until all buckets only contain single permutations or the bucket size exceeds the block size. * I.e. * "abraba" form three buckets for the chars "a", "b", and "r" in the first step with * fmap = { 'a:' 5, 3, 0, 'b:' 4, 1, 'r', 2 } * when looking at the bucket of "a"s the second characters are in the buckets that start with fmap-index 0 (rolled over), 3 and 3 respectively, forming two new buckets "aa" and "ab", so we get * fmap = { 'aa:' 5, 'ab:' 3, 0, 'ba:' 4, 'br': 1, 'ra:' 2 } * since the last bucket only contained a single item it didn't have to be sorted at all. * There now is just one bucket with more than one permutation that remains to be sorted. For the permutation that starts with index 3 the third and forth char are in bucket 'aa' at index 0 and for the one starting at block index 0 they are in bucket 'ra' with sort index 5. The fully sorted order then becomes. * fmap = { 5, 3, 0, 4, 1, 2 } 
/** * @param fmap points to the index of the starting point of a * permutation inside the block of data in the current * partially sorted order * @param eclass points from the index of a character inside the * block to the first index in fmap that contains the * bucket of its suffix that is sorted in this step. * @param lo lower boundary of the fmap-interval to be sorted * @param hi upper boundary of the fmap-interval to be sorted */	TokenNameCOMMENT_JAVADOC	 @param fmap points to the index of the starting point of a permutation inside the block of data in the current partially sorted order @param eclass points from the index of a character inside the block to the first index in fmap that contains the bucket of its suffix that is sorted in this step. @param lo lower boundary of the fmap-interval to be sorted @param hi upper boundary of the fmap-interval to be sorted 
private	TokenNameprivate	
void	TokenNamevoid	
fallbackSimpleSort	TokenNameIdentifier	 fallback Simple Sort
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eclass	TokenNameIdentifier	 eclass
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
==	TokenNameEQUAL_EQUAL	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
ec_tmp	TokenNameIdentifier	 ec tmp
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
&&	TokenNameAND_AND	
ec_tmp	TokenNameIdentifier	 ec tmp
>	TokenNameGREATER	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
ec_tmp	TokenNameIdentifier	 ec tmp
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
&&	TokenNameAND_AND	
ec_tmp	TokenNameIdentifier	 ec tmp
>	TokenNameGREATER	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FALLBACK_QSORT_SMALL_THRESH	TokenNameIdentifier	 FALLBACK  QSORT  SMALL  THRESH
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * swaps two values in fmap */	TokenNameCOMMENT_JAVADOC	 swaps two values in fmap 
private	TokenNameprivate	
void	TokenNamevoid	
fswap	TokenNameIdentifier	 fswap
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
int	TokenNameint	
zz1	TokenNameIdentifier	 zz1
,	TokenNameCOMMA	
int	TokenNameint	
zz2	TokenNameIdentifier	 zz2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
zztmp	TokenNameIdentifier	 zztmp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
zz1	TokenNameIdentifier	 zz1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
zz1	TokenNameIdentifier	 zz1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
zz2	TokenNameIdentifier	 zz2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
zz2	TokenNameIdentifier	 zz2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
zztmp	TokenNameIdentifier	 zztmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * swaps two intervals starting at yyp1 and yyp2 of length yyn inside fmap. */	TokenNameCOMMENT_JAVADOC	 swaps two intervals starting at yyp1 and yyp2 of length yyn inside fmap. 
private	TokenNameprivate	
void	TokenNamevoid	
fvswap	TokenNameIdentifier	 fvswap
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
int	TokenNameint	
yyp1	TokenNameIdentifier	 yyp1
,	TokenNameCOMMA	
int	TokenNameint	
yyp2	TokenNameIdentifier	 yyp2
,	TokenNameCOMMA	
int	TokenNameint	
yyn	TokenNameIdentifier	 yyn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
yyn	TokenNameIdentifier	 yyn
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fswap	TokenNameIdentifier	 fswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
yyp1	TokenNameIdentifier	 yyp1
,	TokenNameCOMMA	
yyp2	TokenNameIdentifier	 yyp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yyp1	TokenNameIdentifier	 yyp1
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
yyp2	TokenNameIdentifier	 yyp2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
yyn	TokenNameIdentifier	 yyn
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
fmin	TokenNameIdentifier	 fmin
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
?	TokenNameQUESTION	
a	TokenNameIdentifier	 a
:	TokenNameCOLON	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
int	TokenNameint	
lz	TokenNameIdentifier	 lz
,	TokenNameCOMMA	
int	TokenNameint	
hz	TokenNameIdentifier	 hz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lz	TokenNameIdentifier	 lz
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hz	TokenNameIdentifier	 hz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fpop	TokenNameIdentifier	 fpop
(	TokenNameLPAREN	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param fmap points to the index of the starting point of a * permutation inside the block of data in the current * partially sorted order * @param eclass points from the index of a character inside the * block to the first index in fmap that contains the * bucket of its suffix that is sorted in this step. * @param loSt lower boundary of the fmap-interval to be sorted * @param hiSt upper boundary of the fmap-interval to be sorted */	TokenNameCOMMENT_JAVADOC	 @param fmap points to the index of the starting point of a permutation inside the block of data in the current partially sorted order @param eclass points from the index of a character inside the block to the first index in fmap that contains the bucket of its suffix that is sorted in this step. @param loSt lower boundary of the fmap-interval to be sorted @param hiSt upper boundary of the fmap-interval to be sorted 
private	TokenNameprivate	
void	TokenNamevoid	
fallbackQSort3	TokenNameIdentifier	 fallback Q Sort3
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eclass	TokenNameIdentifier	 eclass
,	TokenNameCOMMA	
int	TokenNameint	
loSt	TokenNameIdentifier	 lo St
,	TokenNameCOMMA	
int	TokenNameint	
hiSt	TokenNameIdentifier	 hi St
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
,	TokenNameCOMMA	
ltLo	TokenNameIdentifier	 lt Lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
unHi	TokenNameIdentifier	 un Hi
,	TokenNameCOMMA	
gtHi	TokenNameIdentifier	 gt Hi
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
long	TokenNamelong	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
loSt	TokenNameIdentifier	 lo St
,	TokenNameCOMMA	
hiSt	TokenNameIdentifier	 hi St
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
fpop	TokenNameIdentifier	 fpop
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
FALLBACK_QSORT_SMALL_THRESH	TokenNameIdentifier	 FALLBACK  QSORT  SMALL  THRESH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fallbackSimpleSort	TokenNameIdentifier	 fallback Simple Sort
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
eclass	TokenNameIdentifier	 eclass
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* LBZ2: Random partitioning. Median of 3 sometimes fails to avoid bad cases. Median of 9 seems to help but looks rather expensive. This too seems to work but is cheaper. Guidance for the magic constants 7621 and 32768 is taken from Sedgewick's algorithms book, chapter 35. */	TokenNameCOMMENT_BLOCK	 LBZ2: Random partitioning. Median of 3 sometimes fails to avoid bad cases. Median of 9 seems to help but looks rather expensive. This too seems to work but is cheaper. Guidance for the magic constants 7621 and 32768 is taken from Sedgewick's algorithms book, chapter 35. 
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
7621	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
32768	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
r3	TokenNameIdentifier	 r3
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
med	TokenNameIdentifier	 med
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r3	TokenNameIdentifier	 r3
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
med	TokenNameIdentifier	 med
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
r3	TokenNameIdentifier	 r3
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
med	TokenNameIdentifier	 med
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
med	TokenNameIdentifier	 med
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unLo	TokenNameIdentifier	 un Lo
=	TokenNameEQUAL	
ltLo	TokenNameIdentifier	 lt Lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
unHi	TokenNameIdentifier	 un Hi
=	TokenNameEQUAL	
gtHi	TokenNameIdentifier	 gt Hi
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
// looks like the ternary partition attributed to Wegner 	TokenNameCOMMENT_LINE	looks like the ternary partition attributed to Wegner 
// in the cited Sedgewick paper 	TokenNameCOMMENT_LINE	in the cited Sedgewick paper 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
>	TokenNameGREATER	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
med	TokenNameIdentifier	 med
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fswap	TokenNameIdentifier	 fswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
,	TokenNameCOMMA	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ltLo	TokenNameIdentifier	 lt Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
>	TokenNameGREATER	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
med	TokenNameIdentifier	 med
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fswap	TokenNameIdentifier	 fswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
unHi	TokenNameIdentifier	 un Hi
,	TokenNameCOMMA	
gtHi	TokenNameIdentifier	 gt Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gtHi	TokenNameIdentifier	 gt Hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
>	TokenNameGREATER	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fswap	TokenNameIdentifier	 fswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
,	TokenNameCOMMA	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
<	TokenNameLESS	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fmin	TokenNameIdentifier	 fmin
(	TokenNameLPAREN	
ltLo	TokenNameIdentifier	 lt Lo
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fvswap	TokenNameIdentifier	 fvswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
fmin	TokenNameIdentifier	 fmin
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
gtHi	TokenNameIdentifier	 gt Hi
,	TokenNameCOMMA	
gtHi	TokenNameIdentifier	 gt Hi
-	TokenNameMINUS	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fvswap	TokenNameIdentifier	 fvswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
unHi	TokenNameIdentifier	 un Hi
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
ltLo	TokenNameIdentifier	 lt Lo
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
-	TokenNameMINUS	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
>	TokenNameGREATER	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpush	TokenNameIdentifier	 fpush
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*---------------------------------------------*/	TokenNameCOMMENT_BLOCK	---------------------------------------------
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eclass	TokenNameIdentifier	 eclass
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEclass	TokenNameIdentifier	 get Eclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eclass	TokenNameIdentifier	 eclass
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
eclass	TokenNameIdentifier	 eclass
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
quadrant	TokenNameIdentifier	 quadrant
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
eclass	TokenNameIdentifier	 eclass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The C code uses an array of ints (each int holding 32 flags) to * represents the bucket-start flags (bhtab). It also contains * optimizations to skip over 32 consecutively set or * consecutively unset bits on word boundaries at once. For now * I've chosen to use the simpler but potentially slower code * using BitSet - also in the hope that using the BitSet#nextXXX * methods may be fast enough. */	TokenNameCOMMENT_BLOCK	 The C code uses an array of ints (each int holding 32 flags) to represents the bucket-start flags (bhtab). It also contains optimizations to skip over 32 consecutively set or consecutively unset bits on word boundaries at once. For now I've chosen to use the simpler but potentially slower code using BitSet - also in the hope that using the BitSet#nextXXX methods may be fast enough. 
/** * @param fmap points to the index of the starting point of a * permutation inside the block of data in the current * partially sorted order * @param block the original data * @param nblock size of the block * @param off offset of first byte to sort in block */	TokenNameCOMMENT_JAVADOC	 @param fmap points to the index of the starting point of a permutation inside the block of data in the current partially sorted order @param block the original data @param nblock size of the block @param off offset of first byte to sort in block 
final	TokenNamefinal	
void	TokenNamevoid	
fallbackSort	TokenNameIdentifier	 fallback Sort
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
int	TokenNameint	
nblock	TokenNameIdentifier	 nblock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ftab	TokenNameIdentifier	 ftab
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
257	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
H	TokenNameIdentifier	 H
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
cc	TokenNameIdentifier	 cc
,	TokenNameCOMMA	
cc1	TokenNameIdentifier	 cc1
;	TokenNameSEMICOLON	
int	TokenNameint	
nNotDone	TokenNameIdentifier	 n Not Done
;	TokenNameSEMICOLON	
int	TokenNameint	
nBhtab	TokenNameIdentifier	 n Bhtab
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eclass	TokenNameIdentifier	 eclass
=	TokenNameEQUAL	
getEclass	TokenNameIdentifier	 get Eclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*-- LBZ2: Initial 1-char radix sort to generate initial fmap and initial BH bits. --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: Initial 1-char radix sort to generate initial fmap and initial BH bits. --
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
257	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nBhtab	TokenNameIdentifier	 n Bhtab
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
+	TokenNamePLUS	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
bhtab	TokenNameIdentifier	 bhtab
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
nBhtab	TokenNameIdentifier	 n Bhtab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*-- LBZ2: Inductively refine the buckets. Kind-of an "exponential radix sort" (!), inspired by the Manber-Myers suffix array construction algorithm. --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: Inductively refine the buckets. Kind-of an "exponential radix sort" (!), inspired by the Manber-Myers suffix array construction algorithm. --
/*-- LBZ2: set sentinel bits for block-end detection --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: set sentinel bits for block-end detection --
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
nblock	TokenNameIdentifier	 nblock
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
nblock	TokenNameIdentifier	 nblock
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*-- LBZ2: the log(N) loop --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: the log(N) loop --
H	TokenNameIdentifier	 H
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
H	TokenNameIdentifier	 H
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
+=	TokenNamePLUS_EQUAL	
nblock	TokenNameIdentifier	 nblock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nNotDone	TokenNameIdentifier	 n Not Done
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*-- LBZ2: find the next non-singleton bucket --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: find the next non-singleton bucket --
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
nextClearBit	TokenNameIdentifier	 next Clear Bit
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>=	TokenNameGREATER_EQUAL	
nblock	TokenNameIdentifier	 nblock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>=	TokenNameGREATER_EQUAL	
nblock	TokenNameIdentifier	 nblock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*-- LBZ2: now [l, r] bracket current bucket --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: now [l, r] bracket current bucket --
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nNotDone	TokenNameIdentifier	 n Not Done
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fallbackQSort3	TokenNameIdentifier	 fallback Q Sort3
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
eclass	TokenNameIdentifier	 eclass
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*-- LBZ2: scan bucket and generate header bits-- */	TokenNameCOMMENT_BLOCK	-- LBZ2: scan bucket and generate header bits-- 
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cc1	TokenNameIdentifier	 cc1
=	TokenNameEQUAL	
eclass	TokenNameIdentifier	 eclass
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
!=	TokenNameNOT_EQUAL	
cc1	TokenNameIdentifier	 cc1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bhtab	TokenNameIdentifier	 bhtab
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
cc1	TokenNameIdentifier	 cc1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
H	TokenNameIdentifier	 H
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
H	TokenNameIdentifier	 H
>	TokenNameGREATER	
nblock	TokenNameIdentifier	 nblock
||	TokenNameOR_OR	
nNotDone	TokenNameIdentifier	 n Not Done
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*---------------------------------------------*/	TokenNameCOMMENT_BLOCK	---------------------------------------------
/* * LBZ2: Knuth's increments seem to work better than Incerpi-Sedgewick here. * Possibly because the number of elems to sort is usually small, typically * &lt;= 20. */	TokenNameCOMMENT_BLOCK	 LBZ2: Knuth's increments seem to work better than Incerpi-Sedgewick here. Possibly because the number of elems to sort is usually small, typically &lt;= 20. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
INCS	TokenNameIdentifier	 INCS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
121	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
364	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1093	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3280	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9841	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
29524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
88573	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
265720	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
797161	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2391484	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * This is the most hammered method of this class. * * <p> * This is the version using unrolled loops. Normally I never use such ones * in Java code. The unrolling has shown a noticable performance improvement * on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the * JIT compiler of the vm. * </p> */	TokenNameCOMMENT_JAVADOC	 This is the most hammered method of this class. * <p> This is the version using unrolled loops. Normally I never use such ones in Java code. The unrolling has shown a noticable performance improvement on JRE 1.4.2 (Linux i586 / HotSpot Client). Of course it depends on the JIT compiler of the vm. </p> 
private	TokenNameprivate	
boolean	TokenNameboolean	
mainSimpleSort	TokenNameIdentifier	 main Simple Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
lastShadow	TokenNameIdentifier	 last Shadow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
bigN	TokenNameIdentifier	 big N
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bigN	TokenNameIdentifier	 big N
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
firstAttempt	TokenNameIdentifier	 first Attempt
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
workLimit	TokenNameIdentifier	 work Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
INCS	TokenNameIdentifier	 INCS
[	TokenNameLBRACKET	
hp	TokenNameIdentifier	 hp
]	TokenNameRBRACKET	
<	TokenNameLESS	
bigN	TokenNameIdentifier	 big N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hp	TokenNameIdentifier	 hp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
quadrant	TokenNameIdentifier	 quadrant
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
quadrant	TokenNameIdentifier	 quadrant
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
lastPlus1	TokenNameIdentifier	 last Plus1
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
firstAttemptShadow	TokenNameIdentifier	 first Attempt Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
firstAttempt	TokenNameIdentifier	 first Attempt
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
workLimitShadow	TokenNameIdentifier	 work Limit Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
workLimit	TokenNameIdentifier	 work Limit
;	TokenNameSEMICOLON	
int	TokenNameint	
workDoneShadow	TokenNameIdentifier	 work Done Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
;	TokenNameSEMICOLON	
// Following block contains unrolled code which could be shortened by 	TokenNameCOMMENT_LINE	Following block contains unrolled code which could be shortened by 
// coding it in additional loops. 	TokenNameCOMMENT_LINE	coding it in additional loops. 
HP	TokenNameIdentifier	 HP
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
hp	TokenNameIdentifier	 hp
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
INCS	TokenNameIdentifier	 INCS
[	TokenNameLBRACKET	
hp	TokenNameIdentifier	 hp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
mj	TokenNameIdentifier	 mj
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// copy 	TokenNameCOMMENT_LINE	copy 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
vd	TokenNameIdentifier	 vd
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// for (int a; 	TokenNameCOMMENT_LINE	for (int a; 
// (j > mj) && mainGtU((a = fmap[j - h]) + d, vd, 	TokenNameCOMMENT_LINE	(j > mj) && mainGtU((a = fmap[j - h]) + d, vd, 
// block, quadrant, lastShadow); 	TokenNameCOMMENT_LINE	block, quadrant, lastShadow); 
// j -= h) { 	TokenNameCOMMENT_LINE	j -= h) { 
// fmap[j] = a; 	TokenNameCOMMENT_LINE	fmap[j] = a; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// unrolled version: 	TokenNameCOMMENT_LINE	unrolled version: 
// start inline mainGTU 	TokenNameCOMMENT_LINE	start inline mainGTU 
boolean	TokenNameboolean	
onceRunned	TokenNameIdentifier	 once Runned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
HAMMER	TokenNameIdentifier	 HAMMER
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
onceRunned	TokenNameIdentifier	 once Runned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-=	TokenNameMINUS_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
mj	TokenNameIdentifier	 mj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
onceRunned	TokenNameIdentifier	 once Runned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
vd	TokenNameIdentifier	 vd
;	TokenNameSEMICOLON	
// following could be done in a loop, but 	TokenNameCOMMENT_LINE	following could be done in a loop, but 
// unrolled it for performance: 	TokenNameCOMMENT_LINE	unrolled it for performance: 
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
+=	TokenNamePLUS_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
+=	TokenNamePLUS_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
-=	TokenNameMINUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
lastPlus1	TokenNameIdentifier	 last Plus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i1	TokenNameIdentifier	 i1
-=	TokenNameMINUS_EQUAL	
lastPlus1	TokenNameIdentifier	 last Plus1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
lastPlus1	TokenNameIdentifier	 last Plus1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i2	TokenNameIdentifier	 i2
-=	TokenNameMINUS_EQUAL	
lastPlus1	TokenNameIdentifier	 last Plus1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
workDoneShadow	TokenNameIdentifier	 work Done Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
X	TokenNameIdentifier	 X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
]	TokenNameRBRACKET	
>	TokenNameGREATER	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// while x > 0 	TokenNameCOMMENT_LINE	while x > 0 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i1	TokenNameIdentifier	 i1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
HAMMER	TokenNameIdentifier	 HAMMER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// HAMMER 	TokenNameCOMMENT_LINE	HAMMER 
// end inline mainGTU 	TokenNameCOMMENT_LINE	end inline mainGTU 
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstAttemptShadow	TokenNameIdentifier	 first Attempt Shadow
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
workDoneShadow	TokenNameIdentifier	 work Done Shadow
>	TokenNameGREATER	
workLimitShadow	TokenNameIdentifier	 work Limit Shadow
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
HP	TokenNameIdentifier	 HP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
=	TokenNameEQUAL	
workDoneShadow	TokenNameIdentifier	 work Done Shadow
;	TokenNameSEMICOLON	
return	TokenNamereturn	
firstAttemptShadow	TokenNameIdentifier	 first Attempt Shadow
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
workDoneShadow	TokenNameIdentifier	 work Done Shadow
>	TokenNameGREATER	
workLimitShadow	TokenNameIdentifier	 work Limit Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*-- LBZ2: The following is an implementation of an elegant 3-way quicksort for strings, described in a paper "Fast Algorithms for Sorting and Searching Strings", by Robert Sedgewick and Jon L. Bentley. --*/	TokenNameCOMMENT_BLOCK	-- LBZ2: The following is an implementation of an elegant 3-way quicksort for strings, described in a paper "Fast Algorithms for Sorting and Searching Strings", by Robert Sedgewick and Jon L. Bentley. --
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
vswap	TokenNameIdentifier	 vswap
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
int	TokenNameint	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
int	TokenNameint	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
p1	TokenNameIdentifier	 p1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
p1	TokenNameIdentifier	 p1
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
p2	TokenNameIdentifier	 p2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
p2	TokenNameIdentifier	 p2
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
byte	TokenNamebyte	
med3	TokenNameIdentifier	 med3
(	TokenNameLPAREN	
byte	TokenNamebyte	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
byte	TokenNamebyte	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
c	TokenNameIdentifier	 c
?	TokenNameQUESTION	
b	TokenNameIdentifier	 b
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
c	TokenNameIdentifier	 c
?	TokenNameQUESTION	
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
?	TokenNameQUESTION	
b	TokenNameIdentifier	 b
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
?	TokenNameQUESTION	
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SMALL_THRESH	TokenNameIdentifier	 SMALL  THRESH
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEPTH_THRESH	TokenNameIdentifier	 DEPTH  THRESH
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORK_FACTOR	TokenNameIdentifier	 WORK  FACTOR
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Method "mainQSort3", file "blocksort.c", BZip2 1.0.2 */	TokenNameCOMMENT_JAVADOC	 Method "mainQSort3", file "blocksort.c", BZip2 1.0.2 
private	TokenNameprivate	
void	TokenNamevoid	
mainQSort3	TokenNameIdentifier	 main Q Sort3
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
loSt	TokenNameIdentifier	 lo St
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hiSt	TokenNameIdentifier	 hi St
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dSt	TokenNameIdentifier	 d St
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_ll	TokenNameIdentifier	 stack ll
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
stack_ll	TokenNameIdentifier	 stack ll
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_hh	TokenNameIdentifier	 stack hh
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
stack_hh	TokenNameIdentifier	 stack hh
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack_dd	TokenNameIdentifier	 stack dd
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
stack_dd	TokenNameIdentifier	 stack dd
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
loSt	TokenNameIdentifier	 lo St
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hiSt	TokenNameIdentifier	 hi St
;	TokenNameSEMICOLON	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dSt	TokenNameIdentifier	 d St
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
sp	TokenNameIdentifier	 sp
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
SMALL_THRESH	TokenNameIdentifier	 SMALL  THRESH
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
DEPTH_THRESH	TokenNameIdentifier	 DEPTH  THRESH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mainSimpleSort	TokenNameIdentifier	 main Simple Sort
(	TokenNameLPAREN	
dataShadow	TokenNameIdentifier	 data Shadow
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
d1	TokenNameIdentifier	 d1
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
med	TokenNameIdentifier	 med
=	TokenNameEQUAL	
med3	TokenNameIdentifier	 med3
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
+	TokenNamePLUS	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
+	TokenNamePLUS	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
unLo	TokenNameIdentifier	 un Lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
int	TokenNameint	
unHi	TokenNameIdentifier	 un Hi
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
int	TokenNameint	
ltLo	TokenNameIdentifier	 lt Lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
int	TokenNameint	
gtHi	TokenNameIdentifier	 gt Hi
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
<=	TokenNameLESS_EQUAL	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
]	TokenNameRBRACKET	
+	TokenNamePLUS	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
med	TokenNameIdentifier	 med
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
ltLo	TokenNameIdentifier	 lt Lo
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
ltLo	TokenNameIdentifier	 lt Lo
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
<=	TokenNameLESS_EQUAL	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
]	TokenNameRBRACKET	
+	TokenNamePLUS	
d1	TokenNameIdentifier	 d1
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
med	TokenNameIdentifier	 med
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
gtHi	TokenNameIdentifier	 gt Hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
gtHi	TokenNameIdentifier	 gt Hi
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
<=	TokenNameLESS_EQUAL	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unLo	TokenNameIdentifier	 un Lo
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
unHi	TokenNameIdentifier	 un Hi
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
<	TokenNameLESS	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
d1	TokenNameIdentifier	 d1
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ltLo	TokenNameIdentifier	 lt Lo
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
ltLo	TokenNameIdentifier	 lt Lo
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
ltLo	TokenNameIdentifier	 lt Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vswap	TokenNameIdentifier	 vswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
gtHi	TokenNameIdentifier	 gt Hi
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
-	TokenNameMINUS	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
gtHi	TokenNameIdentifier	 gt Hi
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
-	TokenNameMINUS	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vswap	TokenNameIdentifier	 vswap
(	TokenNameLPAREN	
fmap	TokenNameIdentifier	 fmap
,	TokenNameCOMMA	
unLo	TokenNameIdentifier	 un Lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
unLo	TokenNameIdentifier	 un Lo
-	TokenNameMINUS	
ltLo	TokenNameIdentifier	 lt Lo
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
(	TokenNameLPAREN	
gtHi	TokenNameIdentifier	 gt Hi
-	TokenNameMINUS	
unHi	TokenNameIdentifier	 un Hi
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
d1	TokenNameIdentifier	 d1
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
stack_ll	TokenNameIdentifier	 stack ll
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
stack_hh	TokenNameIdentifier	 stack hh
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
stack_dd	TokenNameIdentifier	 stack dd
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SETMASK	TokenNameIdentifier	 SETMASK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
21	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
~	TokenNameTWIDDLE	
SETMASK	TokenNameIdentifier	 SETMASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
void	TokenNamevoid	
mainSort	TokenNameIdentifier	 main Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
.	TokenNameDOT	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
lastShadow	TokenNameIdentifier	 last Shadow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
runningOrder	TokenNameIdentifier	 running Order
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
mainSort_runningOrder	TokenNameIdentifier	 main Sort running Order
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
mainSort_copy	TokenNameIdentifier	 main Sort copy
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bigDone	TokenNameIdentifier	 big Done
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
mainSort_bigDone	TokenNameIdentifier	 main Sort big Done
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ftab	TokenNameIdentifier	 ftab
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ftab	TokenNameIdentifier	 ftab
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
quadrant	TokenNameIdentifier	 quadrant
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
quadrant	TokenNameIdentifier	 quadrant
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
workLimitShadow	TokenNameIdentifier	 work Limit Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
workLimit	TokenNameIdentifier	 work Limit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
firstAttemptShadow	TokenNameIdentifier	 first Attempt Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
firstAttempt	TokenNameIdentifier	 first Attempt
;	TokenNameSEMICOLON	
// LBZ2: Set up the 2-byte frequency table 	TokenNameCOMMENT_LINE	LBZ2: Set up the 2-byte frequency table 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
65537	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * In the various block-sized structures, live data runs from 0 to * last+NUM_OVERSHOOT_BYTES inclusive. First, set up the overshoot area * for block. */	TokenNameCOMMENT_BLOCK	 In the various block-sized structures, live data runs from 0 to last+NUM_OVERSHOOT_BYTES inclusive. First, set up the overshoot area for block. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
NUM_OVERSHOOT_BYTES	TokenNameIdentifier	 NUM  OVERSHOOT  BYTES
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
NUM_OVERSHOOT_BYTES	TokenNameIdentifier	 NUM  OVERSHOOT  BYTES
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// LBZ2: Complete the initial radix sort: 	TokenNameCOMMENT_LINE	LBZ2: Complete the initial radix sort: 
int	TokenNameint	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
c2	TokenNameIdentifier	 c2
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
65536	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
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
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
c2	TokenNameIdentifier	 c2
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
;	TokenNameSEMICOLON	
/* * LBZ2: Now ftab contains the first loc of every small bucket. Calculate the * running order, from smallest to largest big bucket. */	TokenNameCOMMENT_BLOCK	 LBZ2: Now ftab contains the first loc of every small bucket. Calculate the running order, from smallest to largest big bucket. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bigDone	TokenNameIdentifier	 big Done
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
364	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
/=	TokenNameDIVIDE_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
vv	TokenNameIdentifier	 vv
=	TokenNameEQUAL	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
vv	TokenNameIdentifier	 vv
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
vv	TokenNameIdentifier	 vv
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ro	TokenNameIdentifier	 ro
=	TokenNameEQUAL	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ro	TokenNameIdentifier	 ro
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
ro	TokenNameIdentifier	 ro
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
ro	TokenNameIdentifier	 ro
=	TokenNameEQUAL	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ro	TokenNameIdentifier	 ro
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
-=	TokenNameMINUS_EQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
vv	TokenNameIdentifier	 vv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * LBZ2: The main sorting loop. */	TokenNameCOMMENT_BLOCK	 LBZ2: The main sorting loop. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * LBZ2: Process big buckets, starting with the least full. */	TokenNameCOMMENT_BLOCK	 LBZ2: Process big buckets, starting with the least full. 
final	TokenNamefinal	
int	TokenNameint	
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
runningOrder	TokenNameIdentifier	 running Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Step 1: 	TokenNameCOMMENT_LINE	Step 1: 
/* * LBZ2: Complete the big bucket [ss] by quicksorting any unsorted small * buckets [ss, j]. Hopefully previous pointer-scanning phases have * already completed many of the small buckets [ss, j], so we don't * have to sort them at all. */	TokenNameCOMMENT_BLOCK	 LBZ2: Complete the big bucket [ss] by quicksorting any unsorted small buckets [ss, j]. Hopefully previous pointer-scanning phases have already completed many of the small buckets [ss, j], so we don't have to sort them at all. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ftab_sb	TokenNameIdentifier	 ftab sb
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
sb	TokenNameIdentifier	 sb
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ftab_sb	TokenNameIdentifier	 ftab sb
&	TokenNameAND	
SETMASK	TokenNameIdentifier	 SETMASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
SETMASK	TokenNameIdentifier	 SETMASK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
ftab_sb	TokenNameIdentifier	 ftab sb
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
sb	TokenNameIdentifier	 sb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>	TokenNameGREATER	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mainQSort3	TokenNameIdentifier	 main Q Sort3
(	TokenNameLPAREN	
dataShadow	TokenNameIdentifier	 data Shadow
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastShadow	TokenNameIdentifier	 last Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstAttemptShadow	TokenNameIdentifier	 first Attempt Shadow
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
workDone	TokenNameIdentifier	 work Done
>	TokenNameGREATER	
workLimitShadow	TokenNameIdentifier	 work Limit Shadow
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
sb	TokenNameIdentifier	 sb
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ftab_sb	TokenNameIdentifier	 ftab sb
|	TokenNameOR	
SETMASK	TokenNameIdentifier	 SETMASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Step 2: 	TokenNameCOMMENT_LINE	Step 2: 
// LBZ2: Now scan this big bucket so as to synthesise the 	TokenNameCOMMENT_LINE	LBZ2: Now scan this big bucket so as to synthesise the 
// sorted order for small buckets [t, ss] for all t != ss. 	TokenNameCOMMENT_LINE	sorted order for small buckets [t, ss] for all t != ss. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ss	TokenNameIdentifier	 ss
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
ss	TokenNameIdentifier	 ss
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
,	TokenNameCOMMA	
hj	TokenNameIdentifier	 hj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
hj	TokenNameIdentifier	 hj
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
fmap_j	TokenNameIdentifier	 fmap j
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap_j	TokenNameIdentifier	 fmap j
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bigDone	TokenNameIdentifier	 big Done
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fmap_j	TokenNameIdentifier	 fmap j
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lastShadow	TokenNameIdentifier	 last Shadow
:	TokenNameCOLON	
(	TokenNameLPAREN	
fmap_j	TokenNameIdentifier	 fmap j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
[	TokenNameLBRACKET	
c1	TokenNameIdentifier	 c1
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ss	TokenNameIdentifier	 ss
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
SETMASK	TokenNameIdentifier	 SETMASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 3: 	TokenNameCOMMENT_LINE	Step 3: 
/* * LBZ2: The ss big bucket is now done. Record this fact, and update the * quadrant descriptors. Remember to update quadrants in the * overshoot area too, if necessary. The "if (i < 255)" test merely * skips this updating for the last bucket processed, since updating * for the last bucket is pointless. */	TokenNameCOMMENT_BLOCK	 LBZ2: The ss big bucket is now done. Record this fact, and update the quadrant descriptors. Remember to update quadrants in the overshoot area too, if necessary. The "if (i < 255)" test merely skips this updating for the last bucket processed, since updating for the last bucket is pointless. 
bigDone	TokenNameIdentifier	 big Done
[	TokenNameLBRACKET	
ss	TokenNameIdentifier	 ss
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
bbStart	TokenNameIdentifier	 bb Start
=	TokenNameEQUAL	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
ss	TokenNameIdentifier	 ss
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bbSize	TokenNameIdentifier	 bb Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ftab	TokenNameIdentifier	 ftab
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
CLEARMASK	TokenNameIdentifier	 CLEARMASK
)	TokenNameRPAREN	
-	TokenNameMINUS	
bbStart	TokenNameIdentifier	 bb Start
;	TokenNameSEMICOLON	
int	TokenNameint	
shifts	TokenNameIdentifier	 shifts
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bbSize	TokenNameIdentifier	 bb Size
>>	TokenNameRIGHT_SHIFT	
shifts	TokenNameIdentifier	 shifts
)	TokenNameRPAREN	
>	TokenNameGREATER	
65534	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shifts	TokenNameIdentifier	 shifts
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
bbSize	TokenNameIdentifier	 bb Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
a2update	TokenNameIdentifier	 a2update
=	TokenNameEQUAL	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
bbStart	TokenNameIdentifier	 bb Start
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
qVal	TokenNameIdentifier	 q Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>>	TokenNameRIGHT_SHIFT	
shifts	TokenNameIdentifier	 shifts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
a2update	TokenNameIdentifier	 a2update
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qVal	TokenNameIdentifier	 q Val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a2update	TokenNameIdentifier	 a2update
<	TokenNameLESS	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
NUM_OVERSHOOT_BYTES	TokenNameIdentifier	 NUM  OVERSHOOT  BYTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quadrant	TokenNameIdentifier	 quadrant
[	TokenNameLBRACKET	
a2update	TokenNameIdentifier	 a2update
+	TokenNamePLUS	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qVal	TokenNameIdentifier	 q Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
