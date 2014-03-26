/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FastStringBuffer.java 469279 2006-10-30 21:18:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FastStringBuffer.java 469279 2006-10-30 21:18:02Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Bare-bones, unsafe, fast string buffer. No thread-safety, no * parameter range checking, exposed fields. Note that in typical * applications, thread-safety of a StringBuffer is a somewhat * dubious concept in any case. * <p> * Note that Stree and DTM used a single FastStringBuffer as a string pool, * by recording start and length indices within this single buffer. This * minimizes heap overhead, but of course requires more work when retrieving * the data. * <p> * FastStringBuffer operates as a "chunked buffer". Doing so * reduces the need to recopy existing information when an append * exceeds the space available; we just allocate another chunk and * flow across to it. (The array of chunks may need to grow, * admittedly, but that's a much smaller object.) Some excess * recopying may arise when we extract Strings which cross chunk * boundaries; larger chunks make that less frequent. * <p> * The size values are parameterized, to allow tuning this code. In * theory, Result Tree Fragments might want to be tuned differently * from the main document's text. * <p> * %REVIEW% An experiment in self-tuning is * included in the code (using nested FastStringBuffers to achieve * variation in chunk sizes), but this implementation has proven to * be problematic when data may be being copied from the FSB into itself. * We should either re-architect that to make this safe (if possible) * or remove that code and clean up for performance/maintainability reasons. * <p> */	TokenNameCOMMENT_JAVADOC	 Bare-bones, unsafe, fast string buffer. No thread-safety, no parameter range checking, exposed fields. Note that in typical applications, thread-safety of a StringBuffer is a somewhat dubious concept in any case. <p> Note that Stree and DTM used a single FastStringBuffer as a string pool, by recording start and length indices within this single buffer. This minimizes heap overhead, but of course requires more work when retrieving the data. <p> FastStringBuffer operates as a "chunked buffer". Doing so reduces the need to recopy existing information when an append exceeds the space available; we just allocate another chunk and flow across to it. (The array of chunks may need to grow, admittedly, but that's a much smaller object.) Some excess recopying may arise when we extract Strings which cross chunk boundaries; larger chunks make that less frequent. <p> The size values are parameterized, to allow tuning this code. In theory, Result Tree Fragments might want to be tuned differently from the main document's text. <p> %REVIEW% An experiment in self-tuning is included in the code (using nested FastStringBuffers to achieve variation in chunk sizes), but this implementation has proven to be problematic when data may be being copied from the FSB into itself. We should either re-architect that to make this safe (if possible) or remove that code and clean up for performance/maintainability reasons. <p> 
public	TokenNamepublic	
class	TokenNameclass	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
{	TokenNameLBRACE	
// If nonzero, forces the inial chunk size. 	TokenNameCOMMENT_LINE	If nonzero, forces the inial chunk size. 
/**/	TokenNameCOMMENT_BLOCK	 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEBUG_FORCE_INIT_BITS	TokenNameIdentifier	 DEBUG  FORCE  INIT  BITS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// %BUG% %REVIEW% *****PROBLEM SUSPECTED: If data from an FSB is being copied 	TokenNameCOMMENT_LINE	%BUG% %REVIEW% *****PROBLEM SUSPECTED: If data from an FSB is being copied 
// back into the same FSB (variable set from previous variable, for example) 	TokenNameCOMMENT_LINE	back into the same FSB (variable set from previous variable, for example) 
// and blocksize changes in mid-copy... there's risk of severe malfunction in 	TokenNameCOMMENT_LINE	and blocksize changes in mid-copy... there's risk of severe malfunction in 
// the read process, due to how the resizing code re-jiggers storage. Arggh. 	TokenNameCOMMENT_LINE	the read process, due to how the resizing code re-jiggers storage. Arggh. 
// If we want to retain the variable-size-block feature, we need to reconsider 	TokenNameCOMMENT_LINE	If we want to retain the variable-size-block feature, we need to reconsider 
// that issue. For now, I have forced us into fixed-size mode. 	TokenNameCOMMENT_LINE	that issue. For now, I have forced us into fixed-size mode. 
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_FORCE_FIXED_CHUNKSIZE	TokenNameIdentifier	 DEBUG  FORCE  FIXED  CHUNKSIZE
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Manifest constant: Suppress leading whitespace. * This should be used when normalize-to-SAX is called for the first chunk of a * multi-chunk output, or one following unsuppressed whitespace in a previous * chunk. * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int) */	TokenNameCOMMENT_JAVADOC	 Manifest constant: Suppress leading whitespace. This should be used when normalize-to-SAX is called for the first chunk of a multi-chunk output, or one following unsuppressed whitespace in a previous chunk. @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUPPRESS_LEADING_WS	TokenNameIdentifier	 SUPPRESS  LEADING  WS
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Manifest constant: Suppress trailing whitespace. * This should be used when normalize-to-SAX is called for the last chunk of a * multi-chunk output; it may have to be or'ed with SUPPRESS_LEADING_WS. */	TokenNameCOMMENT_JAVADOC	 Manifest constant: Suppress trailing whitespace. This should be used when normalize-to-SAX is called for the last chunk of a multi-chunk output; it may have to be or'ed with SUPPRESS_LEADING_WS. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUPPRESS_TRAILING_WS	TokenNameIdentifier	 SUPPRESS  TRAILING  WS
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Manifest constant: Suppress both leading and trailing whitespace. * This should be used when normalize-to-SAX is called for a complete string. * (I'm not wild about the name of this one. Ideas welcome.) * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int) */	TokenNameCOMMENT_JAVADOC	 Manifest constant: Suppress both leading and trailing whitespace. This should be used when normalize-to-SAX is called for a complete string. (I'm not wild about the name of this one. Ideas welcome.) @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SUPPRESS_BOTH	TokenNameIdentifier	 SUPPRESS  BOTH
=	TokenNameEQUAL	
SUPPRESS_LEADING_WS	TokenNameIdentifier	 SUPPRESS  LEADING  WS
|	TokenNameOR	
SUPPRESS_TRAILING_WS	TokenNameIdentifier	 SUPPRESS  TRAILING  WS
;	TokenNameSEMICOLON	
/** Manifest constant: Carry trailing whitespace of one chunk as leading * whitespace of the next chunk. Used internally; I don't see any reason * to make it public right now. */	TokenNameCOMMENT_JAVADOC	 Manifest constant: Carry trailing whitespace of one chunk as leading whitespace of the next chunk. Used internally; I don't see any reason to make it public right now. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CARRY_WS	TokenNameIdentifier	 CARRY  WS
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_chunkBits sets our chunking strategy, by saying how many * bits of index can be used within a single chunk before flowing over * to the next chunk. For example, if m_chunkbits is set to 15, each * chunk can contain up to 2^15 (32K) characters */	TokenNameCOMMENT_JAVADOC	 Field m_chunkBits sets our chunking strategy, by saying how many bits of index can be used within a single chunk before flowing over to the next chunk. For example, if m_chunkbits is set to 15, each chunk can contain up to 2^15 (32K) characters 
int	TokenNameint	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_maxChunkBits affects our chunk-growth strategy, by saying what * the largest permissible chunk size is in this particular FastStringBuffer * hierarchy. */	TokenNameCOMMENT_JAVADOC	 Field m_maxChunkBits affects our chunk-growth strategy, by saying what the largest permissible chunk size is in this particular FastStringBuffer hierarchy. 
int	TokenNameint	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_rechunkBits affects our chunk-growth strategy, by saying how * many chunks should be allocated at one size before we encapsulate them * into the first chunk of the next size up. For example, if m_rechunkBits * is set to 3, then after 8 chunks at a given size we will rebundle * them as the first element of a FastStringBuffer using a chunk size * 8 times larger (chunkBits shifted left three bits). */	TokenNameCOMMENT_JAVADOC	 Field m_rechunkBits affects our chunk-growth strategy, by saying how many chunks should be allocated at one size before we encapsulate them into the first chunk of the next size up. For example, if m_rechunkBits is set to 3, then after 8 chunks at a given size we will rebundle them as the first element of a FastStringBuffer using a chunk size 8 times larger (chunkBits shifted left three bits). 
int	TokenNameint	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_chunkSize establishes the maximum size of one chunk of the array * as 2**chunkbits characters. * (Which may also be the minimum size if we aren't tuning for storage) */	TokenNameCOMMENT_JAVADOC	 Field m_chunkSize establishes the maximum size of one chunk of the array as 2**chunkbits characters. (Which may also be the minimum size if we aren't tuning for storage) 
int	TokenNameint	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
// =1<<(m_chunkBits-1); 	TokenNameCOMMENT_LINE	=1<<(m_chunkBits-1); 
/** * Field m_chunkMask is m_chunkSize-1 -- in other words, m_chunkBits * worth of low-order '1' bits, useful for shift-and-mask addressing * within the chunks. */	TokenNameCOMMENT_JAVADOC	 Field m_chunkMask is m_chunkSize-1 -- in other words, m_chunkBits worth of low-order '1' bits, useful for shift-and-mask addressing within the chunks. 
int	TokenNameint	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
// =m_chunkSize-1; 	TokenNameCOMMENT_LINE	=m_chunkSize-1; 
/** * Field m_array holds the string buffer's text contents, using an * array-of-arrays. Note that this array, and the arrays it contains, may be * reallocated when necessary in order to allow the buffer to grow; * references to them should be considered to be invalidated after any * append. However, the only time these arrays are directly exposed * is in the sendSAXcharacters call. */	TokenNameCOMMENT_JAVADOC	 Field m_array holds the string buffer's text contents, using an array-of-arrays. Note that this array, and the arrays it contains, may be reallocated when necessary in order to allow the buffer to grow; references to them should be considered to be invalidated after any append. However, the only time these arrays are directly exposed is in the sendSAXcharacters call. 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_array	TokenNameIdentifier	 m array
;	TokenNameSEMICOLON	
/** * Field m_lastChunk is an index into m_array[], pointing to the last * chunk of the Chunked Array currently in use. Note that additional * chunks may actually be allocated, eg if the FastStringBuffer had * previously been truncated or if someone issued an ensureSpace request. * <p> * The insertion point for append operations is addressed by the combination * of m_lastChunk and m_firstFree. */	TokenNameCOMMENT_JAVADOC	 Field m_lastChunk is an index into m_array[], pointing to the last chunk of the Chunked Array currently in use. Note that additional chunks may actually be allocated, eg if the FastStringBuffer had previously been truncated or if someone issued an ensureSpace request. <p> The insertion point for append operations is addressed by the combination of m_lastChunk and m_firstFree. 
int	TokenNameint	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_firstFree is an index into m_array[m_lastChunk][], pointing to * the first character in the Chunked Array which is not part of the * FastStringBuffer's current content. Since m_array[][] is zero-based, * the length of that content can be calculated as * (m_lastChunk<<m_chunkBits) + m_firstFree */	TokenNameCOMMENT_JAVADOC	 Field m_firstFree is an index into m_array[m_lastChunk][], pointing to the first character in the Chunked Array which is not part of the FastStringBuffer's current content. Since m_array[][] is zero-based, the length of that content can be calculated as (m_lastChunk<<m_chunkBits) + m_firstFree 
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Field m_innerFSB, when non-null, is a FastStringBuffer whose total * length equals m_chunkSize, and which replaces m_array[0]. This allows * building a hierarchy of FastStringBuffers, where early appends use * a smaller chunkSize (for less wasted memory overhead) but later * ones use a larger chunkSize (for less heap activity overhead). */	TokenNameCOMMENT_JAVADOC	 Field m_innerFSB, when non-null, is a FastStringBuffer whose total length equals m_chunkSize, and which replaces m_array[0]. This allows building a hierarchy of FastStringBuffers, where early appends use a smaller chunkSize (for less wasted memory overhead) but later ones use a larger chunkSize (for less heap activity overhead). 
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct a FastStringBuffer, with allocation policy as per parameters. * <p> * For coding convenience, I've expressed both allocation sizes in terms of * a number of bits. That's needed for the final size of a chunk, * to permit fast and efficient shift-and-mask addressing. It's less critical * for the inital size, and may be reconsidered. * <p> * An alternative would be to accept integer sizes and round to powers of two; * that really doesn't seem to buy us much, if anything. * * @param initChunkBits Length in characters of the initial allocation * of a chunk, expressed in log-base-2. (That is, 10 means allocate 1024 * characters.) Later chunks will use larger allocation units, to trade off * allocation speed of large document against storage efficiency of small * ones. * @param maxChunkBits Number of character-offset bits that should be used for * addressing within a chunk. Maximum length of a chunk is 2^chunkBits * characters. * @param rebundleBits Number of character-offset bits that addressing should * advance before we attempt to take a step from initChunkBits to maxChunkBits */	TokenNameCOMMENT_JAVADOC	 Construct a FastStringBuffer, with allocation policy as per parameters. <p> For coding convenience, I've expressed both allocation sizes in terms of a number of bits. That's needed for the final size of a chunk, to permit fast and efficient shift-and-mask addressing. It's less critical for the inital size, and may be reconsidered. <p> An alternative would be to accept integer sizes and round to powers of two; that really doesn't seem to buy us much, if anything. * @param initChunkBits Length in characters of the initial allocation of a chunk, expressed in log-base-2. (That is, 10 means allocate 1024 characters.) Later chunks will use larger allocation units, to trade off allocation speed of large document against storage efficiency of small ones. @param maxChunkBits Number of character-offset bits that should be used for addressing within a chunk. Maximum length of a chunk is 2^chunkBits characters. @param rebundleBits Number of character-offset bits that addressing should advance before we attempt to take a step from initChunkBits to maxChunkBits 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
int	TokenNameint	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
,	TokenNameCOMMA	
int	TokenNameint	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
,	TokenNameCOMMA	
int	TokenNameint	
rebundleBits	TokenNameIdentifier	 rebundle Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_FORCE_INIT_BITS	TokenNameIdentifier	 DEBUG  FORCE  INIT  BITS
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
=	TokenNameEQUAL	
DEBUG_FORCE_INIT_BITS	TokenNameIdentifier	 DEBUG  FORCE  INIT  BITS
;	TokenNameSEMICOLON	
// %REVIEW% 	TokenNameCOMMENT_LINE	%REVIEW% 
// Should this force to larger value, or smaller? Smaller less efficient, but if 	TokenNameCOMMENT_LINE	Should this force to larger value, or smaller? Smaller less efficient, but if 
// someone requested variable mode it's because they care about storage space. 	TokenNameCOMMENT_LINE	someone requested variable mode it's because they care about storage space. 
// On the other hand, given the other changes I'm making, odds are that we should 	TokenNameCOMMENT_LINE	On the other hand, given the other changes I'm making, odds are that we should 
// adopt the larger size. Dither, dither, dither... This is just stopgap workaround 	TokenNameCOMMENT_LINE	adopt the larger size. Dither, dither, dither... This is just stopgap workaround 
// anyway; we need a permanant solution. 	TokenNameCOMMENT_LINE	anyway; we need a permanant solution. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_FORCE_FIXED_CHUNKSIZE	TokenNameIdentifier	 DEBUG  FORCE  FIXED  CHUNKSIZE
)	TokenNameRPAREN	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
=	TokenNameEQUAL	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
;	TokenNameSEMICOLON	
//if(DEBUG_FORCE_FIXED_CHUNKSIZE) initChunkBits=maxChunkBits; 	TokenNameCOMMENT_LINE	if(DEBUG_FORCE_FIXED_CHUNKSIZE) initChunkBits=maxChunkBits; 
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Don't bite off more than we're prepared to swallow! 	TokenNameCOMMENT_LINE	Don't bite off more than we're prepared to swallow! 
if	TokenNameif	
(	TokenNameLPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
>	TokenNameGREATER	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
)	TokenNameRPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
=	TokenNameEQUAL	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
;	TokenNameSEMICOLON	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
=	TokenNameEQUAL	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
;	TokenNameSEMICOLON	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
=	TokenNameEQUAL	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
;	TokenNameSEMICOLON	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
=	TokenNameEQUAL	
rebundleBits	TokenNameIdentifier	 rebundle Bits
;	TokenNameSEMICOLON	
m_chunkSize	TokenNameIdentifier	 m chunk Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a FastStringBuffer, using a default rebundleBits value. * * NEEDSDOC @param initChunkBits * NEEDSDOC @param maxChunkBits */	TokenNameCOMMENT_JAVADOC	 Construct a FastStringBuffer, using a default rebundleBits value. * NEEDSDOC @param initChunkBits NEEDSDOC @param maxChunkBits 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
int	TokenNameint	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
,	TokenNameCOMMA	
int	TokenNameint	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
,	TokenNameCOMMA	
maxChunkBits	TokenNameIdentifier	 max Chunk Bits
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a FastStringBuffer, using default maxChunkBits and * rebundleBits values. * <p> * ISSUE: Should this call assert initial size, or fixed size? * Now configured as initial, with a default for fixed. * * NEEDSDOC @param initChunkBits */	TokenNameCOMMENT_JAVADOC	 Construct a FastStringBuffer, using default maxChunkBits and rebundleBits values. <p> ISSUE: Should this call assert initial size, or fixed size? Now configured as initial, with a default for fixed. * NEEDSDOC @param initChunkBits 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
int	TokenNameint	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
initChunkBits	TokenNameIdentifier	 init Chunk Bits
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a FastStringBuffer, using a default allocation policy. */	TokenNameCOMMENT_JAVADOC	 Construct a FastStringBuffer, using a default allocation policy. 
public	TokenNamepublic	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 10 bits is 1K. 15 bits is 32K. Remember that these are character 	TokenNameCOMMENT_LINE	10 bits is 1K. 15 bits is 32K. Remember that these are character 
// counts, so actual memory allocation unit is doubled for UTF-16 chars. 	TokenNameCOMMENT_LINE	counts, so actual memory allocation unit is doubled for UTF-16 chars. 
// 	TokenNameCOMMENT_LINE	 
// For reference: In the original FastStringBuffer, we simply 	TokenNameCOMMENT_LINE	For reference: In the original FastStringBuffer, we simply 
// overallocated by blocksize (default 1KB) on each buffer-growth. 	TokenNameCOMMENT_LINE	overallocated by blocksize (default 1KB) on each buffer-growth. 
this	TokenNamethis	
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. Synonym for length(). * * @return the number of characters in the FastStringBuffer's content. */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. Synonym for length(). * @return the number of characters in the FastStringBuffer's content. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
<<	TokenNameLEFT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
)	TokenNameRPAREN	
+	TokenNamePLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. Synonym for size(). * * @return the number of characters in the FastStringBuffer's content. */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. Synonym for size(). * @return the number of characters in the FastStringBuffer's content. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
<<	TokenNameLEFT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
)	TokenNameRPAREN	
+	TokenNamePLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Discard the content of the FastStringBuffer, and most of the memory * that was allocated by it, restoring the initial state. Note that this * may eventually be different from setLength(0), which see. */	TokenNameCOMMENT_JAVADOC	 Discard the content of the FastStringBuffer, and most of the memory that was allocated by it, restoring the initial state. Note that this may eventually be different from setLength(0), which see. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Recover the original chunk size 	TokenNameCOMMENT_LINE	Recover the original chunk size 
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
innermost	TokenNameIdentifier	 innermost
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
innermost	TokenNameIdentifier	 innermost
.	TokenNameDOT	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innermost	TokenNameIdentifier	 innermost
=	TokenNameEQUAL	
innermost	TokenNameIdentifier	 innermost
.	TokenNameDOT	
m_innerFSB	TokenNameIdentifier	 m inner FSB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
=	TokenNameEQUAL	
innermost	TokenNameIdentifier	 innermost
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
m_chunkSize	TokenNameIdentifier	 m chunk Size
=	TokenNameEQUAL	
innermost	TokenNameIdentifier	 innermost
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
=	TokenNameEQUAL	
innermost	TokenNameIdentifier	 innermost
.	TokenNameDOT	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
// Discard the hierarchy 	TokenNameCOMMENT_LINE	Discard the hierarchy 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Directly set how much of the FastStringBuffer's storage is to be * considered part of its content. This is a fast but hazardous * operation. It is not protected against negative values, or values * greater than the amount of storage currently available... and even * if additional storage does exist, its contents are unpredictable. * The only safe use for our setLength() is to truncate the FastStringBuffer * to a shorter string. * * @param l New length. If l<0 or l>=getLength(), this operation will * not report an error but future operations will almost certainly fail. */	TokenNameCOMMENT_JAVADOC	 Directly set how much of the FastStringBuffer's storage is to be considered part of its content. This is a fast but hazardous operation. It is not protected against negative values, or values greater than the amount of storage currently available... and even if additional storage does exist, its contents are unpredictable. The only safe use for our setLength() is to truncate the FastStringBuffer to a shorter string. * @param l New length. If l<0 or l>=getLength(), this operation will not report an error but future operations will almost certainly fail. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Replace this FSB with the appropriate inner FSB, truncated 	TokenNameCOMMENT_LINE	Replace this FSB with the appropriate inner FSB, truncated 
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
// There's an edge case if l is an exact multiple of m_chunkBits, which risks leaving 	TokenNameCOMMENT_LINE	There's an edge case if l is an exact multiple of m_chunkBits, which risks leaving 
// us pointing at the start of a chunk which has not yet been allocated. Rather than 	TokenNameCOMMENT_LINE	us pointing at the start of a chunk which has not yet been allocated. Rather than 
// pay the cost of dealing with that in the append loops (more scattered and more 	TokenNameCOMMENT_LINE	pay the cost of dealing with that in the append loops (more scattered and more 
// inner-loop), we correct it here by moving to the safe side of that 	TokenNameCOMMENT_LINE	inner-loop), we correct it here by moving to the safe side of that 
// line -- as we would have left the indexes had we appended up to that point. 	TokenNameCOMMENT_LINE	line -- as we would have left the indexes had we appended up to that point. 
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_lastChunk	TokenNameIdentifier	 m last Chunk
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subroutine for the public setLength() method. Deals with the fact * that truncation may require restoring one of the innerFSBs * * NEEDSDOC @param l * NEEDSDOC @param rootFSB */	TokenNameCOMMENT_JAVADOC	 Subroutine for the public setLength() method. Deals with the fact that truncation may require restoring one of the innerFSBs * NEEDSDOC @param l NEEDSDOC @param rootFSB 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
rootFSB	TokenNameIdentifier	 root FSB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
rootFSB	TokenNameIdentifier	 root FSB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Undo encapsulation -- pop the innerFSB data back up to root. 	TokenNameCOMMENT_LINE	Undo encapsulation -- pop the innerFSB data back up to root. 
// Inefficient, but attempts to keep the code simple. 	TokenNameCOMMENT_LINE	Inefficient, but attempts to keep the code simple. 
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
=	TokenNameEQUAL	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
=	TokenNameEQUAL	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
=	TokenNameEQUAL	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
=	TokenNameEQUAL	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
m_innerFSB	TokenNameIdentifier	 m inner FSB
;	TokenNameSEMICOLON	
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
m_lastChunk	TokenNameIdentifier	 m last Chunk
;	TokenNameSEMICOLON	
// Finally, truncate this sucker. 	TokenNameCOMMENT_LINE	Finally, truncate this sucker. 
rootFSB	TokenNameIdentifier	 root FSB
.	TokenNameDOT	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Note that this operation has been somewhat deoptimized by the shift to a * chunked array, as there is no factory method to produce a String object * directly from an array of arrays and hence a double copy is needed. * By using ensureCapacity we hope to minimize the heap overhead of building * the intermediate StringBuffer. * <p> * (It really is a pity that Java didn't design String as a final subclass * of MutableString, rather than having StringBuffer be a separate hierarchy. * We'd avoid a <strong>lot</strong> of double-buffering.) * * @return the contents of the FastStringBuffer as a standard Java string. */	TokenNameCOMMENT_JAVADOC	 Note that this operation has been somewhat deoptimized by the shift to a chunked array, as there is no factory method to produce a String object directly from an array of arrays and hence a double copy is needed. By using ensureCapacity we hope to minimize the heap overhead of building the intermediate StringBuffer. <p> (It really is a pity that Java didn't design String as a final subclass of MutableString, rather than having StringBuffer be a separate hierarchy. We'd avoid a <strong>lot</strong> of double-buffering.) * @return the contents of the FastStringBuffer as a standard Java string. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
<<	TokenNameLEFT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
)	TokenNameRPAREN	
+	TokenNamePLUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a single character onto the FastStringBuffer, growing the * storage if necessary. * <p> * NOTE THAT after calling append(), previously obtained * references to m_array[][] may no longer be valid.... * though in fact they should be in this instance. * * @param value character to be appended. */	TokenNameCOMMENT_JAVADOC	 Append a single character onto the FastStringBuffer, growing the storage if necessary. <p> NOTE THAT after calling append(), previously obtained references to m_array[][] may no longer be valid.... though in fact they should be in this instance. * @param value character to be appended. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
;	TokenNameSEMICOLON	
// We may have preallocated chunks. If so, all but last should 	TokenNameCOMMENT_LINE	We may have preallocated chunks. If so, all but last should 
// be at full size. 	TokenNameCOMMENT_LINE	be at full size. 
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
<	TokenNameLESS	
m_chunkSize	TokenNameIdentifier	 m chunk Size
)	TokenNameRPAREN	
// Simplified test single-character-fits 	TokenNameCOMMENT_LINE	Simplified test single-character-fits 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Extend array? 	TokenNameCOMMENT_LINE	Extend array? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance one chunk 	TokenNameCOMMENT_LINE	Advance one chunk 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hierarchical encapsulation 	TokenNameCOMMENT_LINE	Hierarchical encapsulation 
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
&&	TokenNameAND_AND	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
<	TokenNameLESS	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should do all the work of both encapsulating 	TokenNameCOMMENT_LINE	Should do all the work of both encapsulating 
// existing data and establishing new sizes/offsets 	TokenNameCOMMENT_LINE	existing data and establishing new sizes/offsets 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add a chunk. 	TokenNameCOMMENT_LINE	Add a chunk. 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Space exists in the chunk. Append the character. 	TokenNameCOMMENT_LINE	Space exists in the chunk. Append the character. 
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the contents of a String onto the FastStringBuffer, * growing the storage if necessary. * <p> * NOTE THAT after calling append(), previously obtained * references to m_array[] may no longer be valid. * * @param value String whose contents are to be appended. */	TokenNameCOMMENT_JAVADOC	 Append the contents of a String onto the FastStringBuffer, growing the storage if necessary. <p> NOTE THAT after calling append(), previously obtained references to m_array[] may no longer be valid. * @param value String whose contents are to be appended. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
copyfrom	TokenNameIdentifier	 copyfrom
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
// Repeat while data remains to be copied 	TokenNameCOMMENT_LINE	Repeat while data remains to be copied 
while	TokenNamewhile	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy what fits 	TokenNameCOMMENT_LINE	Copy what fits 
if	TokenNameif	
(	TokenNameLPAREN	
available	TokenNameIdentifier	 available
>	TokenNameGREATER	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
copyfrom	TokenNameIdentifier	 copyfrom
,	TokenNameCOMMA	
copyfrom	TokenNameIdentifier	 copyfrom
+	TokenNamePLUS	
available	TokenNameIdentifier	 available
,	TokenNameCOMMA	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strlen	TokenNameIdentifier	 strlen
-=	TokenNameMINUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
copyfrom	TokenNameIdentifier	 copyfrom
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
// If there's more left, allocate another chunk and continue 	TokenNameCOMMENT_LINE	If there's more left, allocate another chunk and continue 
if	TokenNameif	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extend array? 	TokenNameCOMMENT_LINE	Extend array? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance one chunk 	TokenNameCOMMENT_LINE	Advance one chunk 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hierarchical encapsulation 	TokenNameCOMMENT_LINE	Hierarchical encapsulation 
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
&&	TokenNameAND_AND	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
<	TokenNameLESS	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should do all the work of both encapsulating 	TokenNameCOMMENT_LINE	Should do all the work of both encapsulating 
// existing data and establishing new sizes/offsets 	TokenNameCOMMENT_LINE	existing data and establishing new sizes/offsets 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add a chunk. 	TokenNameCOMMENT_LINE	Add a chunk. 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Adjust the insert point in the last chunk, when we've reached it. 	TokenNameCOMMENT_LINE	Adjust the insert point in the last chunk, when we've reached it. 
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the contents of a StringBuffer onto the FastStringBuffer, * growing the storage if necessary. * <p> * NOTE THAT after calling append(), previously obtained * references to m_array[] may no longer be valid. * * @param value StringBuffer whose contents are to be appended. */	TokenNameCOMMENT_JAVADOC	 Append the contents of a StringBuffer onto the FastStringBuffer, growing the storage if necessary. <p> NOTE THAT after calling append(), previously obtained references to m_array[] may no longer be valid. * @param value StringBuffer whose contents are to be appended. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
copyfrom	TokenNameIdentifier	 copyfrom
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
// Repeat while data remains to be copied 	TokenNameCOMMENT_LINE	Repeat while data remains to be copied 
while	TokenNamewhile	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy what fits 	TokenNameCOMMENT_LINE	Copy what fits 
if	TokenNameif	
(	TokenNameLPAREN	
available	TokenNameIdentifier	 available
>	TokenNameGREATER	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
copyfrom	TokenNameIdentifier	 copyfrom
,	TokenNameCOMMA	
copyfrom	TokenNameIdentifier	 copyfrom
+	TokenNamePLUS	
available	TokenNameIdentifier	 available
,	TokenNameCOMMA	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strlen	TokenNameIdentifier	 strlen
-=	TokenNameMINUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
copyfrom	TokenNameIdentifier	 copyfrom
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
// If there's more left, allocate another chunk and continue 	TokenNameCOMMENT_LINE	If there's more left, allocate another chunk and continue 
if	TokenNameif	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extend array? 	TokenNameCOMMENT_LINE	Extend array? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance one chunk 	TokenNameCOMMENT_LINE	Advance one chunk 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hierarchical encapsulation 	TokenNameCOMMENT_LINE	Hierarchical encapsulation 
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
&&	TokenNameAND_AND	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
<	TokenNameLESS	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should do all the work of both encapsulating 	TokenNameCOMMENT_LINE	Should do all the work of both encapsulating 
// existing data and establishing new sizes/offsets 	TokenNameCOMMENT_LINE	existing data and establishing new sizes/offsets 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add a chunk. 	TokenNameCOMMENT_LINE	Add a chunk. 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Adjust the insert point in the last chunk, when we've reached it. 	TokenNameCOMMENT_LINE	Adjust the insert point in the last chunk, when we've reached it. 
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append part of the contents of a Character Array onto the * FastStringBuffer, growing the storage if necessary. * <p> * NOTE THAT after calling append(), previously obtained * references to m_array[] may no longer be valid. * * @param chars character array from which data is to be copied * @param start offset in chars of first character to be copied, * zero-based. * @param length number of characters to be copied */	TokenNameCOMMENT_JAVADOC	 Append part of the contents of a Character Array onto the FastStringBuffer, growing the storage if necessary. <p> NOTE THAT after calling append(), previously obtained references to m_array[] may no longer be valid. * @param chars character array from which data is to be copied @param start offset in chars of first character to be copied, zero-based. @param length number of characters to be copied 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
copyfrom	TokenNameIdentifier	 copyfrom
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
// Repeat while data remains to be copied 	TokenNameCOMMENT_LINE	Repeat while data remains to be copied 
while	TokenNamewhile	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy what fits 	TokenNameCOMMENT_LINE	Copy what fits 
if	TokenNameif	
(	TokenNameLPAREN	
available	TokenNameIdentifier	 available
>	TokenNameGREATER	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
copyfrom	TokenNameIdentifier	 copyfrom
,	TokenNameCOMMA	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
,	TokenNameCOMMA	
available	TokenNameIdentifier	 available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strlen	TokenNameIdentifier	 strlen
-=	TokenNameMINUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
copyfrom	TokenNameIdentifier	 copyfrom
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
// If there's more left, allocate another chunk and continue 	TokenNameCOMMENT_LINE	If there's more left, allocate another chunk and continue 
if	TokenNameif	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extend array? 	TokenNameCOMMENT_LINE	Extend array? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance one chunk 	TokenNameCOMMENT_LINE	Advance one chunk 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hierarchical encapsulation 	TokenNameCOMMENT_LINE	Hierarchical encapsulation 
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
&&	TokenNameAND_AND	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
<	TokenNameLESS	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should do all the work of both encapsulating 	TokenNameCOMMENT_LINE	Should do all the work of both encapsulating 
// existing data and establishing new sizes/offsets 	TokenNameCOMMENT_LINE	existing data and establishing new sizes/offsets 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add a chunk. 	TokenNameCOMMENT_LINE	Add a chunk. 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Adjust the insert point in the last chunk, when we've reached it. 	TokenNameCOMMENT_LINE	Adjust the insert point in the last chunk, when we've reached it. 
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the contents of another FastStringBuffer onto * this FastStringBuffer, growing the storage if necessary. * <p> * NOTE THAT after calling append(), previously obtained * references to m_array[] may no longer be valid. * * @param value FastStringBuffer whose contents are * to be appended. */	TokenNameCOMMENT_JAVADOC	 Append the contents of another FastStringBuffer onto this FastStringBuffer, growing the storage if necessary. <p> NOTE THAT after calling append(), previously obtained references to m_array[] may no longer be valid. * @param value FastStringBuffer whose contents are to be appended. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Complicating factor here is that the two buffers may use 	TokenNameCOMMENT_LINE	Complicating factor here is that the two buffers may use 
// different chunk sizes, and even if they're the same we're 	TokenNameCOMMENT_LINE	different chunk sizes, and even if they're the same we're 
// probably on a different alignment due to previously appended 	TokenNameCOMMENT_LINE	probably on a different alignment due to previously appended 
// data. We have to work through the source in bite-sized chunks. 	TokenNameCOMMENT_LINE	data. We have to work through the source in bite-sized chunks. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
copyfrom	TokenNameIdentifier	 copyfrom
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
// Repeat while data remains to be copied 	TokenNameCOMMENT_LINE	Repeat while data remains to be copied 
while	TokenNamewhile	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy what fits 	TokenNameCOMMENT_LINE	Copy what fits 
if	TokenNameif	
(	TokenNameLPAREN	
available	TokenNameIdentifier	 available
>	TokenNameGREATER	
strlen	TokenNameIdentifier	 strlen
)	TokenNameRPAREN	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
;	TokenNameSEMICOLON	
int	TokenNameint	
sourcechunk	TokenNameIdentifier	 sourcechunk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
copyfrom	TokenNameIdentifier	 copyfrom
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
=	TokenNameEQUAL	
copyfrom	TokenNameIdentifier	 copyfrom
&	TokenNameAND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
runlength	TokenNameIdentifier	 runlength
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
runlength	TokenNameIdentifier	 runlength
>	TokenNameGREATER	
available	TokenNameIdentifier	 available
)	TokenNameRPAREN	
runlength	TokenNameIdentifier	 runlength
=	TokenNameEQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
sourcechunk	TokenNameIdentifier	 sourcechunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
,	TokenNameCOMMA	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
,	TokenNameCOMMA	
runlength	TokenNameIdentifier	 runlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
runlength	TokenNameIdentifier	 runlength
!=	TokenNameNOT_EQUAL	
available	TokenNameIdentifier	 available
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
sourcechunk	TokenNameIdentifier	 sourcechunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
runlength	TokenNameIdentifier	 runlength
,	TokenNameCOMMA	
available	TokenNameIdentifier	 available
-	TokenNameMINUS	
runlength	TokenNameIdentifier	 runlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strlen	TokenNameIdentifier	 strlen
-=	TokenNameMINUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
copyfrom	TokenNameIdentifier	 copyfrom
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
// If there's more left, allocate another chunk and continue 	TokenNameCOMMENT_LINE	If there's more left, allocate another chunk and continue 
if	TokenNameif	
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Extend array? 	TokenNameCOMMENT_LINE	Extend array? 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Advance one chunk 	TokenNameCOMMENT_LINE	Advance one chunk 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hierarchical encapsulation 	TokenNameCOMMENT_LINE	Hierarchical encapsulation 
if	TokenNameif	
(	TokenNameLPAREN	
m_lastChunk	TokenNameIdentifier	 m last Chunk
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
&&	TokenNameAND_AND	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
<	TokenNameLESS	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should do all the work of both encapsulating 	TokenNameCOMMENT_LINE	Should do all the work of both encapsulating 
// existing data and establishing new sizes/offsets 	TokenNameCOMMENT_LINE	existing data and establishing new sizes/offsets 
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add a chunk. 	TokenNameCOMMENT_LINE	Add a chunk. 
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
m_lastChunk	TokenNameIdentifier	 m last Chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
m_chunkSize	TokenNameIdentifier	 m chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Adjust the insert point in the last chunk, when we've reached it. 	TokenNameCOMMENT_LINE	Adjust the insert point in the last chunk, when we've reached it. 
m_firstFree	TokenNameIdentifier	 m first Free
+=	TokenNamePLUS_EQUAL	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the specified range of characters are all whitespace, * as defined by XMLCharacterRecognizer. * <p> * CURRENTLY DOES NOT CHECK FOR OUT-OF-RANGE. * * @param start Offset of first character in the range. * @param length Number of characters to send. */	TokenNameCOMMENT_JAVADOC	 @return true if the specified range of characters are all whitespace, as defined by XMLCharacterRecognizer. <p> CURRENTLY DOES NOT CHECK FOR OUT-OF-RANGE. * @param start Offset of first character in the range. @param length Number of characters to send. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sourcechunk	TokenNameIdentifier	 sourcechunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
chunkOK	TokenNameIdentifier	 chunk OK
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
runlength	TokenNameIdentifier	 runlength
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
available	TokenNameIdentifier	 available
)	TokenNameRPAREN	
?	TokenNameQUESTION	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
available	TokenNameIdentifier	 available
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourcechunk	TokenNameIdentifier	 sourcechunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
chunkOK	TokenNameIdentifier	 chunk OK
=	TokenNameEQUAL	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
,	TokenNameCOMMA	
runlength	TokenNameIdentifier	 runlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
chunkOK	TokenNameIdentifier	 chunk OK
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
sourcechunk	TokenNameIdentifier	 sourcechunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
,	TokenNameCOMMA	
runlength	TokenNameIdentifier	 runlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkOK	TokenNameIdentifier	 chunk OK
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
runlength	TokenNameIdentifier	 runlength
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sourcechunk	TokenNameIdentifier	 sourcechunk
;	TokenNameSEMICOLON	
sourcecolumn	TokenNameIdentifier	 sourcecolumn
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
available	TokenNameIdentifier	 available
=	TokenNameEQUAL	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param start Offset of first character in the range. * @param length Number of characters to send. * @return a new String object initialized from the specified range of * characters. */	TokenNameCOMMENT_JAVADOC	 @param start Offset of first character in the range. @param length Number of characters to send. @return a new String object initialized from the specified range of characters. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startColumn	TokenNameIdentifier	 start Column
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOneChunkString	TokenNameIdentifier	 get One Chunk String
(	TokenNameLPAREN	
startChunk	TokenNameIdentifier	 start Chunk
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
startChunk	TokenNameIdentifier	 start Chunk
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getOneChunkString	TokenNameIdentifier	 get One Chunk String
(	TokenNameLPAREN	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
,	TokenNameCOMMA	
int	TokenNameint	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
startChunk	TokenNameIdentifier	 start Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param sb StringBuffer to be appended to * @param start Offset of first character in the range. * @param length Number of characters to send. * @return sb with the requested text appended to it */	TokenNameCOMMENT_JAVADOC	 @param sb StringBuffer to be appended to @param start Offset of first character in the range. @param length Number of characters to send. @return sb with the requested text appended to it 
StringBuffer	TokenNameIdentifier	 String Buffer
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal support for toString() and getString(). * PLEASE NOTE SIGNATURE CHANGE from earlier versions; it now appends into * and returns a StringBuffer supplied by the caller. This simplifies * m_innerFSB support. * <p> * Note that this operation has been somewhat deoptimized by the shift to a * chunked array, as there is no factory method to produce a String object * directly from an array of arrays and hence a double copy is needed. * By presetting length we hope to minimize the heap overhead of building * the intermediate StringBuffer. * <p> * (It really is a pity that Java didn't design String as a final subclass * of MutableString, rather than having StringBuffer be a separate hierarchy. * We'd avoid a <strong>lot</strong> of double-buffering.) * * * @param sb * @param startChunk * @param startColumn * @param length * * @return the contents of the FastStringBuffer as a standard Java string. */	TokenNameCOMMENT_JAVADOC	 Internal support for toString() and getString(). PLEASE NOTE SIGNATURE CHANGE from earlier versions; it now appends into and returns a StringBuffer supplied by the caller. This simplifies m_innerFSB support. <p> Note that this operation has been somewhat deoptimized by the shift to a chunked array, as there is no factory method to produce a String object directly from an array of arrays and hence a double copy is needed. By presetting length we hope to minimize the heap overhead of building the intermediate StringBuffer. <p> (It really is a pity that Java didn't design String as a final subclass of MutableString, rather than having StringBuffer be a separate hierarchy. We'd avoid a <strong>lot</strong> of double-buffering.) * @param sb @param startChunk @param startColumn @param length * @return the contents of the FastStringBuffer as a standard Java string. 
StringBuffer	TokenNameIdentifier	 String Buffer
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
,	TokenNameCOMMA	
int	TokenNameint	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
startChunk	TokenNameIdentifier	 start Chunk
<<	TokenNameLEFT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
)	TokenNameRPAREN	
+	TokenNamePLUS	
startColumn	TokenNameIdentifier	 start Column
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
stopChunk	TokenNameIdentifier	 stop Chunk
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
stopColumn	TokenNameIdentifier	 stop Column
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
// Factored out 	TokenNameCOMMENT_LINE	Factored out 
//StringBuffer sb=new StringBuffer(length); 	TokenNameCOMMENT_LINE	StringBuffer sb=new StringBuffer(length); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startChunk	TokenNameIdentifier	 start Chunk
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stopChunk	TokenNameIdentifier	 stop Chunk
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after first chunk 	TokenNameCOMMENT_LINE	after first chunk 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stopChunk	TokenNameIdentifier	 stop Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
stopColumn	TokenNameIdentifier	 stop Column
>	TokenNameGREATER	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
stopChunk	TokenNameIdentifier	 stop Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a single character from the string buffer. * * * @param pos character position requested. * @return A character from the requested position. */	TokenNameCOMMENT_JAVADOC	 Get a single character from the string buffer. * @param pos character position requested. @return A character from the requested position. 
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startChunk	TokenNameIdentifier	 start Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
startChunk	TokenNameIdentifier	 start Chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sends the specified range of characters as one or more SAX characters() * events. * Note that the buffer reference passed to the ContentHandler may be * invalidated if the FastStringBuffer is edited; it's the user's * responsibility to manage access to the FastStringBuffer to prevent this * problem from arising. * <p> * Note too that there is no promise that the output will be sent as a * single call. As is always true in SAX, one logical string may be split * across multiple blocks of memory and hence delivered as several * successive events. * * @param ch SAX ContentHandler object to receive the event. * @param start Offset of first character in the range. * @param length Number of characters to send. * @exception org.xml.sax.SAXException may be thrown by handler's * characters() method. */	TokenNameCOMMENT_JAVADOC	 Sends the specified range of characters as one or more SAX characters() events. Note that the buffer reference passed to the ContentHandler may be invalidated if the FastStringBuffer is edited; it's the user's responsibility to manage access to the FastStringBuffer to prevent this problem from arising. <p> Note too that there is no promise that the output will be sent as a single call. As is always true in SAX, one logical string may be split across multiple blocks of memory and hence delivered as several successive events. * @param ch SAX ContentHandler object to receive the event. @param start Offset of first character in the range. @param length Number of characters to send. @exception org.xml.sax.SAXException may be thrown by handler's characters() method. 
public	TokenNamepublic	
void	TokenNamevoid	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startColumn	TokenNameIdentifier	 start Column
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
startChunk	TokenNameIdentifier	 start Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
stopChunk	TokenNameIdentifier	 stop Chunk
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
stopColumn	TokenNameIdentifier	 stop Column
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startChunk	TokenNameIdentifier	 start Chunk
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stopChunk	TokenNameIdentifier	 stop Chunk
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after first chunk 	TokenNameCOMMENT_LINE	after first chunk 
}	TokenNameRBRACE	
// Last, or only, chunk 	TokenNameCOMMENT_LINE	Last, or only, chunk 
if	TokenNameif	
(	TokenNameLPAREN	
stopChunk	TokenNameIdentifier	 stop Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
stopColumn	TokenNameIdentifier	 stop Column
>	TokenNameGREATER	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
stopChunk	TokenNameIdentifier	 stop Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sends the specified range of characters as one or more SAX characters() * events, normalizing the characters according to XSLT rules. * * @param ch SAX ContentHandler object to receive the event. * @param start Offset of first character in the range. * @param length Number of characters to send. * @return normalization status to apply to next chunk (because we may * have been called recursively to process an inner FSB): * <dl> * <dt>0</dt> * <dd>if this output did not end in retained whitespace, and thus whitespace * at the start of the following chunk (if any) should be converted to a * single space. * <dt>SUPPRESS_LEADING_WS</dt> * <dd>if this output ended in retained whitespace, and thus whitespace * at the start of the following chunk (if any) should be completely * suppressed.</dd> * </dd> * </dl> * @exception org.xml.sax.SAXException may be thrown by handler's * characters() method. */	TokenNameCOMMENT_JAVADOC	 Sends the specified range of characters as one or more SAX characters() events, normalizing the characters according to XSLT rules. * @param ch SAX ContentHandler object to receive the event. @param start Offset of first character in the range. @param length Number of characters to send. @return normalization status to apply to next chunk (because we may have been called recursively to process an inner FSB): <dl> <dt>0</dt> <dd>if this output did not end in retained whitespace, and thus whitespace at the start of the following chunk (if any) should be converted to a single space. <dt>SUPPRESS_LEADING_WS</dt> <dd>if this output ended in retained whitespace, and thus whitespace at the start of the following chunk (if any) should be completely suppressed.</dd> </dd> </dl> @exception org.xml.sax.SAXException may be thrown by handler's characters() method. 
public	TokenNamepublic	
int	TokenNameint	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// This call always starts at the beginning of the 	TokenNameCOMMENT_LINE	This call always starts at the beginning of the 
// string being written out, either because it was called directly or 	TokenNameCOMMENT_LINE	string being written out, either because it was called directly or 
// because it was an m_innerFSB recursion. This is important since 	TokenNameCOMMENT_LINE	because it was an m_innerFSB recursion. This is important since 
// it gives us a well-known initial state for this flag: 	TokenNameCOMMENT_LINE	it gives us a well-known initial state for this flag: 
int	TokenNameint	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
=	TokenNameEQUAL	
SUPPRESS_LEADING_WS	TokenNameIdentifier	 SUPPRESS  LEADING  WS
;	TokenNameSEMICOLON	
int	TokenNameint	
stop	TokenNameIdentifier	 stop
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
startChunk	TokenNameIdentifier	 start Chunk
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
int	TokenNameint	
stopChunk	TokenNameIdentifier	 stop Chunk
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
int	TokenNameint	
stopColumn	TokenNameIdentifier	 stop Column
=	TokenNameEQUAL	
stop	TokenNameIdentifier	 stop
&	TokenNameAND	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startChunk	TokenNameIdentifier	 start Chunk
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stopChunk	TokenNameIdentifier	 stop Chunk
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
=	TokenNameEQUAL	
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
=	TokenNameEQUAL	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startColumn	TokenNameIdentifier	 start Column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// after first chunk 	TokenNameCOMMENT_LINE	after first chunk 
}	TokenNameRBRACE	
// Last, or only, chunk 	TokenNameCOMMENT_LINE	Last, or only, chunk 
if	TokenNameif	
(	TokenNameLPAREN	
stopChunk	TokenNameIdentifier	 stop Chunk
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_innerFSB	TokenNameIdentifier	 m inner FSB
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
=	TokenNameEQUAL	
// %REVIEW% Is this update really needed? 	TokenNameCOMMENT_LINE	%REVIEW% Is this update really needed? 
m_innerFSB	TokenNameIdentifier	 m inner FSB
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
stopColumn	TokenNameIdentifier	 stop Column
>	TokenNameGREATER	
startColumn	TokenNameIdentifier	 start Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
=	TokenNameEQUAL	
// %REVIEW% Is this update really needed? 	TokenNameCOMMENT_LINE	%REVIEW% Is this update really needed? 
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
m_array	TokenNameIdentifier	 m array
[	TokenNameLBRACKET	
stopChunk	TokenNameIdentifier	 stop Chunk
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
stopColumn	TokenNameIdentifier	 stop Column
-	TokenNameMINUS	
startColumn	TokenNameIdentifier	 start Column
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
|	TokenNameOR	
SUPPRESS_TRAILING_WS	TokenNameIdentifier	 SUPPRESS  TRAILING  WS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stateForNextChunk	TokenNameIdentifier	 state For Next Chunk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SINGLE_SPACE	TokenNameIdentifier	 SINGLE  SPACE
=	TokenNameEQUAL	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Internal method to directly normalize and dispatch the character array. * This version is aware of the fact that it may be called several times * in succession if the data is made up of multiple "chunks", and thus * must actively manage the handling of leading and trailing whitespace. * * Note: The recursion is due to the possible recursion of inner FSBs. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @param handler SAX ContentHandler object to receive the event. * @param edgeTreatmentFlags How leading/trailing spaces should be handled. * This is a bitfield contining two flags, bitwise-ORed together: * <dl> * <dt>SUPPRESS_LEADING_WS</dt> * <dd>When false, causes leading whitespace to be converted to a single * space; when true, causes it to be discarded entirely. * Should be set TRUE for the first chunk, and (in multi-chunk output) * whenever the previous chunk ended in retained whitespace.</dd> * <dt>SUPPRESS_TRAILING_WS</dt> * <dd>When false, causes trailing whitespace to be converted to a single * space; when true, causes it to be discarded entirely. * Should be set TRUE for the last or only chunk. * </dd> * </dl> * @return normalization status, as in the edgeTreatmentFlags parameter: * <dl> * <dt>0</dt> * <dd>if this output did not end in retained whitespace, and thus whitespace * at the start of the following chunk (if any) should be converted to a * single space. * <dt>SUPPRESS_LEADING_WS</dt> * <dd>if this output ended in retained whitespace, and thus whitespace * at the start of the following chunk (if any) should be completely * suppressed.</dd> * </dd> * </dl> * * * @exception org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Internal method to directly normalize and dispatch the character array. This version is aware of the fact that it may be called several times in succession if the data is made up of multiple "chunks", and thus must actively manage the handling of leading and trailing whitespace. * Note: The recursion is due to the possible recursion of inner FSBs. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @param handler SAX ContentHandler object to receive the event. @param edgeTreatmentFlags How leading/trailing spaces should be handled. This is a bitfield contining two flags, bitwise-ORed together: <dl> <dt>SUPPRESS_LEADING_WS</dt> <dd>When false, causes leading whitespace to be converted to a single space; when true, causes it to be discarded entirely. Should be set TRUE for the first chunk, and (in multi-chunk output) whenever the previous chunk ended in retained whitespace.</dd> <dt>SUPPRESS_TRAILING_WS</dt> <dd>When false, causes trailing whitespace to be converted to a single space; when true, causes it to be discarded entirely. Should be set TRUE for the last or only chunk. </dd> </dl> @return normalization status, as in the edgeTreatmentFlags parameter: <dl> <dt>0</dt> <dd>if this output did not end in retained whitespace, and thus whitespace at the start of the following chunk (if any) should be converted to a single space. <dt>SUPPRESS_LEADING_WS</dt> <dd>if this output ended in retained whitespace, and thus whitespace at the start of the following chunk (if any) should be completely suppressed.</dd> </dd> </dl> * @exception org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
static	TokenNamestatic	
int	TokenNameint	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
int	TokenNameint	
edgeTreatmentFlags	TokenNameIdentifier	 edge Treatment Flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
processingLeadingWhitespace	TokenNameIdentifier	 processing Leading Whitespace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
edgeTreatmentFlags	TokenNameIdentifier	 edge Treatment Flags
&	TokenNameAND	
SUPPRESS_LEADING_WS	TokenNameIdentifier	 SUPPRESS  LEADING  WS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
seenWhitespace	TokenNameIdentifier	 seen Whitespace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
edgeTreatmentFlags	TokenNameIdentifier	 edge Treatment Flags
&	TokenNameAND	
CARRY_WS	TokenNameIdentifier	 CARRY  WS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currPos	TokenNameIdentifier	 curr Pos
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// Strip any leading spaces first, if required 	TokenNameCOMMENT_LINE	Strip any leading spaces first, if required 
if	TokenNameif	
(	TokenNameLPAREN	
processingLeadingWhitespace	TokenNameIdentifier	 processing Leading Whitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
currPos	TokenNameIdentifier	 curr Pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// If we've only encountered leading spaces, the 	TokenNameCOMMENT_LINE	If we've only encountered leading spaces, the 
// current state remains unchanged 	TokenNameCOMMENT_LINE	current state remains unchanged 
if	TokenNameif	
(	TokenNameLPAREN	
currPos	TokenNameIdentifier	 curr Pos
==	TokenNameEQUAL_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
edgeTreatmentFlags	TokenNameIdentifier	 edge Treatment Flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we get here, there are no more leading spaces to strip 	TokenNameCOMMENT_LINE	If we get here, there are no more leading spaces to strip 
while	TokenNamewhile	
(	TokenNameLPAREN	
currPos	TokenNameIdentifier	 curr Pos
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startNonWhitespace	TokenNameIdentifier	 start Non Whitespace
=	TokenNameEQUAL	
currPos	TokenNameIdentifier	 curr Pos
;	TokenNameSEMICOLON	
// Grab a chunk of non-whitespace characters 	TokenNameCOMMENT_LINE	Grab a chunk of non-whitespace characters 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
!	TokenNameNOT	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
currPos	TokenNameIdentifier	 curr Pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Non-whitespace seen - emit them, along with a single 	TokenNameCOMMENT_LINE	Non-whitespace seen - emit them, along with a single 
// space for any preceding whitespace characters 	TokenNameCOMMENT_LINE	space for any preceding whitespace characters 
if	TokenNameif	
(	TokenNameLPAREN	
startNonWhitespace	TokenNameIdentifier	 start Non Whitespace
!=	TokenNameNOT_EQUAL	
currPos	TokenNameIdentifier	 curr Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seenWhitespace	TokenNameIdentifier	 seen Whitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
SINGLE_SPACE	TokenNameIdentifier	 SINGLE  SPACE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seenWhitespace	TokenNameIdentifier	 seen Whitespace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startNonWhitespace	TokenNameIdentifier	 start Non Whitespace
,	TokenNameCOMMA	
currPos	TokenNameIdentifier	 curr Pos
-	TokenNameMINUS	
startNonWhitespace	TokenNameIdentifier	 start Non Whitespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startWhitespace	TokenNameIdentifier	 start Whitespace
=	TokenNameEQUAL	
currPos	TokenNameIdentifier	 curr Pos
;	TokenNameSEMICOLON	
// Consume any whitespace characters 	TokenNameCOMMENT_LINE	Consume any whitespace characters 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
XMLCharacterRecognizer	TokenNameIdentifier	 XML Character Recognizer
.	TokenNameDOT	
isWhiteSpace	TokenNameIdentifier	 is White Space
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
currPos	TokenNameIdentifier	 curr Pos
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currPos	TokenNameIdentifier	 curr Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startWhitespace	TokenNameIdentifier	 start Whitespace
!=	TokenNameNOT_EQUAL	
currPos	TokenNameIdentifier	 curr Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seenWhitespace	TokenNameIdentifier	 seen Whitespace
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
seenWhitespace	TokenNameIdentifier	 seen Whitespace
?	TokenNameQUESTION	
CARRY_WS	TokenNameIdentifier	 CARRY  WS
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
edgeTreatmentFlags	TokenNameIdentifier	 edge Treatment Flags
&	TokenNameAND	
SUPPRESS_TRAILING_WS	TokenNameIdentifier	 SUPPRESS  TRAILING  WS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Directly normalize and dispatch the character array. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @param handler SAX ContentHandler object to receive the event. * @exception org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Directly normalize and dispatch the character array. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @param handler SAX ContentHandler object to receive the event. @exception org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
SUPPRESS_BOTH	TokenNameIdentifier	 SUPPRESS  BOTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sends the specified range of characters as sax Comment. * <p> * Note that, unlike sendSAXcharacters, this has to be done as a single * call to LexicalHandler#comment. * * @param ch SAX LexicalHandler object to receive the event. * @param start Offset of first character in the range. * @param length Number of characters to send. * @exception org.xml.sax.SAXException may be thrown by handler's * characters() method. */	TokenNameCOMMENT_JAVADOC	 Sends the specified range of characters as sax Comment. <p> Note that, unlike sendSAXcharacters, this has to be done as a single call to LexicalHandler#comment. * @param ch SAX LexicalHandler object to receive the event. @param start Offset of first character in the range. @param length Number of characters to send. @exception org.xml.sax.SAXException may be thrown by handler's characters() method. 
public	TokenNamepublic	
void	TokenNamevoid	
sendSAXComment	TokenNameIdentifier	 send SAX Comment
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %OPT% Do it this way for now... 	TokenNameCOMMENT_LINE	%OPT% Do it this way for now... 
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies characters from this string into the destination character * array. * * @param srcBegin index of the first character in the string * to copy. * @param srcEnd index after the last character in the string * to copy. * @param dst the destination array. * @param dstBegin the start offset in the destination array. * @exception IndexOutOfBoundsException If any of the following * is true: * <ul><li><code>srcBegin</code> is negative. * <li><code>srcBegin</code> is greater than <code>srcEnd</code> * <li><code>srcEnd</code> is greater than the length of this * string * <li><code>dstBegin</code> is negative * <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than * <code>dst.length</code></ul> * @exception NullPointerException if <code>dst</code> is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Copies characters from this string into the destination character array. * @param srcBegin index of the first character in the string to copy. @param srcEnd index after the last character in the string to copy. @param dst the destination array. @param dstBegin the start offset in the destination array. @exception IndexOutOfBoundsException If any of the following is true: <ul><li><code>srcBegin</code> is negative. <li><code>srcBegin</code> is greater than <code>srcEnd</code> <li><code>srcEnd</code> is greater than the length of this string <li><code>dstBegin</code> is negative <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than <code>dst.length</code></ul> @exception NullPointerException if <code>dst</code> is <code>null</code> 
private	TokenNameprivate	
void	TokenNamevoid	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
int	TokenNameint	
srcBegin	TokenNameIdentifier	 src Begin
,	TokenNameCOMMA	
int	TokenNameint	
srcEnd	TokenNameIdentifier	 src End
,	TokenNameCOMMA	
char	TokenNamechar	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
dstBegin	TokenNameIdentifier	 dst Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% Joe needs to write this function. Make public when implemented. 	TokenNameCOMMENT_LINE	%TBD% Joe needs to write this function. Make public when implemented. 
}	TokenNameRBRACE	
/** * Encapsulation c'tor. After this is called, the source FastStringBuffer * will be reset to use the new object as its m_innerFSB, and will have * had its chunk size reset appropriately. IT SHOULD NEVER BE CALLED * EXCEPT WHEN source.length()==1<<(source.m_chunkBits+source.m_rebundleBits) * * NEEDSDOC @param source */	TokenNameCOMMENT_JAVADOC	 Encapsulation c'tor. After this is called, the source FastStringBuffer will be reset to use the new object as its m_innerFSB, and will have had its chunk size reset appropriately. IT SHOULD NEVER BE CALLED EXCEPT WHEN source.length()==1<<(source.m_chunkBits+source.m_rebundleBits) * NEEDSDOC @param source 
private	TokenNameprivate	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Copy existing information into new encapsulation 	TokenNameCOMMENT_LINE	Copy existing information into new encapsulation 
m_chunkBits	TokenNameIdentifier	 m chunk Bits
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
;	TokenNameSEMICOLON	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_maxChunkBits	TokenNameIdentifier	 m max Chunk Bits
;	TokenNameSEMICOLON	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
;	TokenNameSEMICOLON	
m_chunkSize	TokenNameIdentifier	 m chunk Size
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
;	TokenNameSEMICOLON	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_array	TokenNameIdentifier	 m array
;	TokenNameSEMICOLON	
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_innerFSB	TokenNameIdentifier	 m inner FSB
;	TokenNameSEMICOLON	
// These have to be adjusted because we're calling just at the time 	TokenNameCOMMENT_LINE	These have to be adjusted because we're calling just at the time 
// when we would be about to allocate another chunk 	TokenNameCOMMENT_LINE	when we would be about to allocate another chunk 
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_lastChunk	TokenNameIdentifier	 m last Chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
;	TokenNameSEMICOLON	
// Establish capsule as the Inner FSB, reset chunk sizes/addressing 	TokenNameCOMMENT_LINE	Establish capsule as the Inner FSB, reset chunk sizes/addressing 
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_array	TokenNameIdentifier	 m array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_innerFSB	TokenNameIdentifier	 m inner FSB
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// Since we encapsulated just as we were about to append another 	TokenNameCOMMENT_LINE	Since we encapsulated just as we were about to append another 
// chunk, return ready to create the chunk after the innerFSB 	TokenNameCOMMENT_LINE	chunk, return ready to create the chunk after the innerFSB 
// -- 1, not 0. 	TokenNameCOMMENT_LINE	-- 1, not 0. 
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_lastChunk	TokenNameIdentifier	 m last Chunk
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
+=	TokenNamePLUS_EQUAL	
m_rebundleBits	TokenNameIdentifier	 m rebundle Bits
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkBits	TokenNameIdentifier	 m chunk Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkMask	TokenNameIdentifier	 m chunk Mask
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
m_chunkSize	TokenNameIdentifier	 m chunk Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
