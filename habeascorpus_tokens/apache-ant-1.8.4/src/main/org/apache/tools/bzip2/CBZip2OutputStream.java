/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This package is based on the work done by Keiron Liddle, Aftex Software * <keiron@aftexsw.com> to whom the Ant project is very grateful for his * great code. */	TokenNameCOMMENT_BLOCK	 This package is based on the work done by Keiron Liddle, Aftex Software <keiron@aftexsw.com> to whom the Ant project is very grateful for his great code. 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * An output stream that compresses into the BZip2 format (without the file * header chars) into another stream. * * <p> * The compression requires large amounts of memory. Thus you should call the * {@link #close() close()} method as soon as possible, to force * <tt>CBZip2OutputStream</tt> to release the allocated memory. * </p> * * <p> You can shrink the amount of allocated memory and maybe raise * the compression speed by choosing a lower blocksize, which in turn * may cause a lower compression ratio. You can avoid unnecessary * memory allocation by avoiding using a blocksize which is bigger * than the size of the input. </p> * * <p> You can compute the memory usage for compressing by the * following formula: </p> * * <pre> * &lt;code&gt;400k + (9 * blocksize)&lt;/code&gt;. * </pre> * * <p> To get the memory required for decompression by {@link * CBZip2InputStream CBZip2InputStream} use </p> * * <pre> * &lt;code&gt;65k + (5 * blocksize)&lt;/code&gt;. * </pre> * * <table width="100%" border="1"> * <colgroup> <col width="33%" /> <col width="33%" /> <col width="33%" /> * </colgroup> * <tr> * <th colspan="3">Memory usage by blocksize</th> * </tr> * <tr> * <th align="right">Blocksize</th> <th align="right">Compression<br> * memory usage</th> <th align="right">Decompression<br> * memory usage</th> * </tr> * <tr> * <td align="right">100k</td> * <td align="right">1300k</td> * <td align="right">565k</td> * </tr> * <tr> * <td align="right">200k</td> * <td align="right">2200k</td> * <td align="right">1065k</td> * </tr> * <tr> * <td align="right">300k</td> * <td align="right">3100k</td> * <td align="right">1565k</td> * </tr> * <tr> * <td align="right">400k</td> * <td align="right">4000k</td> * <td align="right">2065k</td> * </tr> * <tr> * <td align="right">500k</td> * <td align="right">4900k</td> * <td align="right">2565k</td> * </tr> * <tr> * <td align="right">600k</td> * <td align="right">5800k</td> * <td align="right">3065k</td> * </tr> * <tr> * <td align="right">700k</td> * <td align="right">6700k</td> * <td align="right">3565k</td> * </tr> * <tr> * <td align="right">800k</td> * <td align="right">7600k</td> * <td align="right">4065k</td> * </tr> * <tr> * <td align="right">900k</td> * <td align="right">8500k</td> * <td align="right">4565k</td> * </tr> * </table> * * <p> * For decompression <tt>CBZip2InputStream</tt> allocates less memory if the * bzipped input is smaller than one block. * </p> * * <p> * Instances of this class are not threadsafe. * </p> * * <p> * TODO: Update to BZip2 1.0.1 * </p> * */	TokenNameCOMMENT_JAVADOC	 An output stream that compresses into the BZip2 format (without the file header chars) into another stream. * <p> The compression requires large amounts of memory. Thus you should call the {@link #close() close()} method as soon as possible, to force <tt>CBZip2OutputStream</tt> to release the allocated memory. </p> * <p> You can shrink the amount of allocated memory and maybe raise the compression speed by choosing a lower blocksize, which in turn may cause a lower compression ratio. You can avoid unnecessary memory allocation by avoiding using a blocksize which is bigger than the size of the input. </p> * <p> You can compute the memory usage for compressing by the following formula: </p> * <pre> &lt;code&gt;400k + (9 blocksize)&lt;/code&gt;. </pre> * <p> To get the memory required for decompression by {@link CBZip2InputStream CBZip2InputStream} use </p> * <pre> &lt;code&gt;65k + (5 blocksize)&lt;/code&gt;. </pre> * <table width="100%" border="1"> <colgroup> <col width="33%" /> <col width="33%" /> <col width="33%" /> </colgroup> <tr> <th colspan="3">Memory usage by blocksize</th> </tr> <tr> <th align="right">Blocksize</th> <th align="right">Compression<br> memory usage</th> <th align="right">Decompression<br> memory usage</th> </tr> <tr> <td align="right">100k</td> <td align="right">1300k</td> <td align="right">565k</td> </tr> <tr> <td align="right">200k</td> <td align="right">2200k</td> <td align="right">1065k</td> </tr> <tr> <td align="right">300k</td> <td align="right">3100k</td> <td align="right">1565k</td> </tr> <tr> <td align="right">400k</td> <td align="right">4000k</td> <td align="right">2065k</td> </tr> <tr> <td align="right">500k</td> <td align="right">4900k</td> <td align="right">2565k</td> </tr> <tr> <td align="right">600k</td> <td align="right">5800k</td> <td align="right">3065k</td> </tr> <tr> <td align="right">700k</td> <td align="right">6700k</td> <td align="right">3565k</td> </tr> <tr> <td align="right">800k</td> <td align="right">7600k</td> <td align="right">4065k</td> </tr> <tr> <td align="right">900k</td> <td align="right">8500k</td> <td align="right">4565k</td> </tr> </table> * <p> For decompression <tt>CBZip2InputStream</tt> allocates less memory if the bzipped input is smaller than one block. </p> * <p> Instances of this class are not threadsafe. </p> * <p> TODO: Update to BZip2 1.0.1 </p> 
public	TokenNamepublic	
class	TokenNameclass	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
implements	TokenNameimplements	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
{	TokenNameLBRACE	
/** * The minimum supported blocksize <tt> == 1</tt>. */	TokenNameCOMMENT_JAVADOC	 The minimum supported blocksize <tt> == 1</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_BLOCKSIZE	TokenNameIdentifier	 MIN  BLOCKSIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The maximum supported blocksize <tt> == 9</tt>. */	TokenNameCOMMENT_JAVADOC	 The maximum supported blocksize <tt> == 9</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_BLOCKSIZE	TokenNameIdentifier	 MAX  BLOCKSIZE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
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
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
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
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GREATER_ICOST	TokenNameIdentifier	 GREATER  ICOST
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LESSER_ICOST	TokenNameIdentifier	 LESSER  ICOST
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SMALL_THRESH	TokenNameIdentifier	 SMALL  THRESH
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEPTH_THRESH	TokenNameIdentifier	 DEPTH  THRESH
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORK_FACTOR	TokenNameIdentifier	 WORK  FACTOR
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant is accessible by subclasses for historical * purposes. If you don't know what it means then you don't need * it. * <p> If you are ever unlucky/improbable enough to get a stack * overflow whilst sorting, increase the following constant and * try again. In practice I have never seen the stack go above 27 * elems, so the following limit seems very generous. </p> */	TokenNameCOMMENT_JAVADOC	 This constant is accessible by subclasses for historical purposes. If you don't know what it means then you don't need it. <p> If you are ever unlucky/improbable enough to get a stack overflow whilst sorting, increase the following constant and try again. In practice I have never seen the stack go above 27 elems, so the following limit seems very generous. </p> 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QSORT_STACK_SIZE	TokenNameIdentifier	 QSORT  STACK  SIZE
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Knuth's increments seem to work better than Incerpi-Sedgewick here. * Possibly because the number of elems to sort is usually small, typically * &lt;= 20. */	TokenNameCOMMENT_JAVADOC	 Knuth's increments seem to work better than Incerpi-Sedgewick here. Possibly because the number of elems to sort is usually small, typically &lt;= 20. 
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
/** * This method is accessible by subclasses for historical * purposes. If you don't know what it does then you don't need * it. */	TokenNameCOMMENT_JAVADOC	 This method is accessible by subclasses for historical purposes. If you don't know what it does then you don't need it. 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
hbMakeCodeLengths	TokenNameIdentifier	 hb Make Code Lengths
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
,	TokenNameCOMMA	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Nodes and heap entries run from 1. Entry 0 for both the heap and * nodes is a sentinel. */	TokenNameCOMMENT_BLOCK	 Nodes and heap entries run from 1. Entry 0 for both the heap and nodes is a sentinel. 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tooLong	TokenNameIdentifier	 too Long
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
nNodes	TokenNameIdentifier	 n Nodes
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
int	TokenNameint	
nHeap	TokenNameIdentifier	 n Heap
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
nHeap	TokenNameIdentifier	 n Heap
;	TokenNameSEMICOLON	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assert (nHeap < (MAX_ALPHA_SIZE + 2)) : nHeap; 	TokenNameCOMMENT_LINE	assert (nHeap < (MAX_ALPHA_SIZE + 2)) : nHeap; 
while	TokenNamewhile	
(	TokenNameLPAREN	
nHeap	TokenNameIdentifier	 n Heap
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n1	TokenNameIdentifier	 n1
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
zz	TokenNameIdentifier	 zz
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
>	TokenNameGREATER	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
<	TokenNameLESS	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
int	TokenNameint	
n2	TokenNameIdentifier	 n2
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
zz	TokenNameIdentifier	 zz
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
>	TokenNameGREATER	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
<	TokenNameLESS	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
nNodes	TokenNameIdentifier	 n Nodes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
n1	TokenNameIdentifier	 n1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
n2	TokenNameIdentifier	 n2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_n1	TokenNameIdentifier	 weight n1
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
n1	TokenNameIdentifier	 n1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_n2	TokenNameIdentifier	 weight n2
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
n2	TokenNameIdentifier	 n2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
nNodes	TokenNameIdentifier	 n Nodes
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0xffffff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0xffffff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
nNodes	TokenNameIdentifier	 n Nodes
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
nHeap	TokenNameIdentifier	 n Heap
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_tmp	TokenNameIdentifier	 weight tmp
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
weight_tmp	TokenNameIdentifier	 weight tmp
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assert (nNodes < (MAX_ALPHA_SIZE * 2)) : nNodes; 	TokenNameCOMMENT_LINE	assert (nNodes < (MAX_ALPHA_SIZE * 2)) : nNodes; 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
parent_k	TokenNameIdentifier	 parent k
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
parent_k	TokenNameIdentifier	 parent k
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
parent_k	TokenNameIdentifier	 parent k
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tooLong	TokenNameIdentifier	 too Long
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
hbMakeCodeLengths	TokenNameIdentifier	 hb Make Code Lengths
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dat	TokenNameIdentifier	 dat
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Nodes and heap entries run from 1. Entry 0 for both the heap and * nodes is a sentinel. */	TokenNameCOMMENT_BLOCK	 Nodes and heap entries run from 1. Entry 0 for both the heap and nodes is a sentinel. 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
dat	TokenNameIdentifier	 dat
.	TokenNameDOT	
heap	TokenNameIdentifier	 heap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
dat	TokenNameIdentifier	 dat
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
dat	TokenNameIdentifier	 dat
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tooLong	TokenNameIdentifier	 too Long
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
nNodes	TokenNameIdentifier	 n Nodes
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
int	TokenNameint	
nHeap	TokenNameIdentifier	 n Heap
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
nHeap	TokenNameIdentifier	 n Heap
;	TokenNameSEMICOLON	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nHeap	TokenNameIdentifier	 n Heap
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n1	TokenNameIdentifier	 n1
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
zz	TokenNameIdentifier	 zz
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
>	TokenNameGREATER	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
<	TokenNameLESS	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
int	TokenNameint	
n2	TokenNameIdentifier	 n2
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
zz	TokenNameIdentifier	 zz
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
>	TokenNameGREATER	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
yy	TokenNameIdentifier	 yy
<	TokenNameLESS	
nHeap	TokenNameIdentifier	 n Heap
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
yy	TokenNameIdentifier	 yy
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
nNodes	TokenNameIdentifier	 n Nodes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
n1	TokenNameIdentifier	 n1
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
n2	TokenNameIdentifier	 n2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_n1	TokenNameIdentifier	 weight n1
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
n1	TokenNameIdentifier	 n1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_n2	TokenNameIdentifier	 weight n2
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
n2	TokenNameIdentifier	 n2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
nNodes	TokenNameIdentifier	 n Nodes
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0xffffff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0xffffff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
weight_n1	TokenNameIdentifier	 weight n1
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
weight_n2	TokenNameIdentifier	 weight n2
&	TokenNameAND	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
nNodes	TokenNameIdentifier	 n Nodes
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nHeap	TokenNameIdentifier	 n Heap
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
nHeap	TokenNameIdentifier	 n Heap
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nNodes	TokenNameIdentifier	 n Nodes
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
=	TokenNameEQUAL	
nHeap	TokenNameIdentifier	 n Heap
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
weight_tmp	TokenNameIdentifier	 weight tmp
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
weight_tmp	TokenNameIdentifier	 weight tmp
<	TokenNameLESS	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
zz	TokenNameIdentifier	 zz
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
zz	TokenNameIdentifier	 zz
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
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
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
parent_k	TokenNameIdentifier	 parent k
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
parent_k	TokenNameIdentifier	 parent k
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
parent_k	TokenNameIdentifier	 parent k
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tooLong	TokenNameIdentifier	 too Long
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tooLong	TokenNameIdentifier	 too Long
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Index of the last char in the block, so the block size == last + 1. */	TokenNameCOMMENT_JAVADOC	 Index of the last char in the block, so the block size == last + 1. 
private	TokenNameprivate	
int	TokenNameint	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
/** * Always: in the range 0 .. 9. The current block size is 100000 * this * number. */	TokenNameCOMMENT_JAVADOC	 Always: in the range 0 .. 9. The current block size is 100000 this number. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
blockSize100k	TokenNameIdentifier	 block Size100k
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CRC	TokenNameIdentifier	 CRC
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC	TokenNameIdentifier	 CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nInUse	TokenNameIdentifier	 n In Use
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nMTF	TokenNameIdentifier	 n MTF
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
blockCRC	TokenNameIdentifier	 block CRC
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
combinedCRC	TokenNameIdentifier	 combined CRC
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
allowableBlockSize	TokenNameIdentifier	 allowable Block Size
;	TokenNameSEMICOLON	
/** * All memory intensive stuff. */	TokenNameCOMMENT_JAVADOC	 All memory intensive stuff. 
private	TokenNameprivate	
Data	TokenNameIdentifier	 Data
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BlockSort	TokenNameIdentifier	 Block Sort
blockSorter	TokenNameIdentifier	 block Sorter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
/** * Chooses a blocksize based on the given length of the data to compress. * * @return The blocksize, between {@link #MIN_BLOCKSIZE} and * {@link #MAX_BLOCKSIZE} both inclusive. For a negative * <tt>inputLength</tt> this method returns <tt>MAX_BLOCKSIZE</tt> * always. * * @param inputLength * The length of the data which will be compressed by * <tt>CBZip2OutputStream</tt>. */	TokenNameCOMMENT_JAVADOC	 Chooses a blocksize based on the given length of the data to compress. * @return The blocksize, between {@link #MIN_BLOCKSIZE} and {@link #MAX_BLOCKSIZE} both inclusive. For a negative <tt>inputLength</tt> this method returns <tt>MAX_BLOCKSIZE</tt> always. * @param inputLength The length of the data which will be compressed by <tt>CBZip2OutputStream</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
chooseBlockSize	TokenNameIdentifier	 choose Block Size
(	TokenNameLPAREN	
long	TokenNamelong	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
inputLength	TokenNameIdentifier	 input Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inputLength	TokenNameIdentifier	 input Length
/	TokenNameDIVIDE	
132000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
MAX_BLOCKSIZE	TokenNameIdentifier	 MAX  BLOCKSIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>CBZip2OutputStream</tt> with a blocksize of 900k. * * <p> * <b>Attention: </b>The caller is responsible to write the two BZip2 magic * bytes <tt>"BZ"</tt> to the specified stream prior to calling this * constructor. * </p> * * @param out * * the destination stream. * * @throws IOException * if an I/O error occurs in the specified stream. * @throws NullPointerException * if <code>out == null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>CBZip2OutputStream</tt> with a blocksize of 900k. * <p> <b>Attention: </b>The caller is responsible to write the two BZip2 magic bytes <tt>"BZ"</tt> to the specified stream prior to calling this constructor. </p> * @param out * the destination stream. * @throws IOException if an I/O error occurs in the specified stream. @throws NullPointerException if <code>out == null</code>. 
public	TokenNamepublic	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
MAX_BLOCKSIZE	TokenNameIdentifier	 MAX  BLOCKSIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>CBZip2OutputStream</tt> with specified blocksize. * * <p> * <b>Attention: </b>The caller is responsible to write the two BZip2 magic * bytes <tt>"BZ"</tt> to the specified stream prior to calling this * constructor. * </p> * * * @param out * the destination stream. * @param blockSize * the blockSize as 100k units. * * @throws IOException * if an I/O error occurs in the specified stream. * @throws IllegalArgumentException * if <code>(blockSize < 1) || (blockSize > 9)</code>. * @throws NullPointerException * if <code>out == null</code>. * * @see #MIN_BLOCKSIZE * @see #MAX_BLOCKSIZE */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>CBZip2OutputStream</tt> with specified blocksize. * <p> <b>Attention: </b>The caller is responsible to write the two BZip2 magic bytes <tt>"BZ"</tt> to the specified stream prior to calling this constructor. </p> * @param out the destination stream. @param blockSize the blockSize as 100k units. * @throws IOException if an I/O error occurs in the specified stream. @throws IllegalArgumentException if <code>(blockSize < 1) || (blockSize > 9)</code>. @throws NullPointerException if <code>out == null</code>. * @see #MIN_BLOCKSIZE @see #MAX_BLOCKSIZE 
public	TokenNamepublic	
CBZip2OutputStream	TokenNameIdentifier	 CB Zip2 Output Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"blockSize("	TokenNameStringLiteral	blockSize(
+	TokenNamePLUS	
blockSize	TokenNameIdentifier	 block Size
+	TokenNamePLUS	
") < 1"	TokenNameStringLiteral	) < 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
>	TokenNameGREATER	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"blockSize("	TokenNameStringLiteral	blockSize(
+	TokenNamePLUS	
blockSize	TokenNameIdentifier	 block Size
+	TokenNamePLUS	
") > 9"	TokenNameStringLiteral	) > 9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
/* 20 is just a paranoia constant */	TokenNameCOMMENT_BLOCK	 20 is just a paranoia constant 
this	TokenNamethis	
.	TokenNameDOT	
allowableBlockSize	TokenNameIdentifier	 allowable Block Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
*	TokenNameMULTIPLY	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
baseBlockSize	TokenNameIdentifier	 base Block Size
)	TokenNameRPAREN	
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
write0	TokenNameIdentifier	 write0
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"closed"	TokenNameStringLiteral	closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the current byte to the buffer, run-length encoding it * if it has been repeated at least four times (the first step * RLEs sequences of four identical bytes). * * <p>Flushes the current block before writing data if it is * full.</p> * * <p>"write to the buffer" means adding to data.buffer starting * two steps "after" this.last - initially starting at index 1 * (not 0) - and updating this.last to point to the last index * written minus 1.</p> */	TokenNameCOMMENT_JAVADOC	 Writes the current byte to the buffer, run-length encoding it if it has been repeated at least four times (the first step RLEs sequences of four identical bytes). * <p>Flushes the current block before writing data if it is full.</p> * <p>"write to the buffer" means adding to data.buffer starting two steps "after" this.last - initially starting at index 1 (not 0) - and updating this.last to point to the last index written minus 1.</p> 
private	TokenNameprivate	
void	TokenNamevoid	
writeRun	TokenNameIdentifier	 write Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lastShadow	TokenNameIdentifier	 last Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastShadow	TokenNameIdentifier	 last Shadow
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
allowableBlockSize	TokenNameIdentifier	 allowable Block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
currentCharShadow	TokenNameIdentifier	 current Char Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
currentCharShadow	TokenNameIdentifier	 current Char Shadow
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
currentCharShadow	TokenNameIdentifier	 current Char Shadow
;	TokenNameSEMICOLON	
int	TokenNameint	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
updateCRC	TokenNameIdentifier	 update CRC
(	TokenNameLPAREN	
currentCharShadow	TokenNameIdentifier	 current Char Shadow
,	TokenNameCOMMA	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
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
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
-=	TokenNameMINUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
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
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
runLengthShadow	TokenNameIdentifier	 run Length Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
lastShadow	TokenNameIdentifier	 last Shadow
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeRun	TokenNameIdentifier	 write Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Overriden to close the stream. */	TokenNameCOMMENT_JAVADOC	 Overriden to close the stream. 
protected	TokenNameprotected	
void	TokenNamevoid	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeRun	TokenNameIdentifier	 write Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endCompression	TokenNameIdentifier	 end Compression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockSorter	TokenNameIdentifier	 block Sorter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outShadow	TokenNameIdentifier	 out Shadow
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// write magic: done by caller who created this stream 	TokenNameCOMMENT_LINE	write magic: done by caller who created this stream 
// this.out.write('B'); 	TokenNameCOMMENT_LINE	this.out.write('B'); 
// this.out.write('Z'); 	TokenNameCOMMENT_LINE	this.out.write('Z'); 
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
Data	TokenNameIdentifier	 Data
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockSorter	TokenNameIdentifier	 block Sorter
=	TokenNameEQUAL	
new	TokenNamenew	
BlockSort	TokenNameIdentifier	 Block Sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Write `magic' bytes h indicating file-format == huffmanised, followed * by a digit indicating blockSize100k. */	TokenNameCOMMENT_BLOCK	 Write `magic' bytes h indicating file-format == huffmanised, followed by a digit indicating blockSize100k. 
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
'h'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initBlock	TokenNameIdentifier	 init Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// blockNo++; 	TokenNameCOMMENT_LINE	blockNo++; 
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
initialiseCRC	TokenNameIdentifier	 initialise CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// ch = 0; 	TokenNameCOMMENT_LINE	ch = 0; 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
;	TokenNameSEMICOLON	
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
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
endBlock	TokenNameIdentifier	 end Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blockCRC	TokenNameIdentifier	 block CRC
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getFinalCRC	TokenNameIdentifier	 get Final CRC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
^=	TokenNameXOR_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockCRC	TokenNameIdentifier	 block CRC
;	TokenNameSEMICOLON	
// empty block at end of file 	TokenNameCOMMENT_LINE	empty block at end of file 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* sort the block and establish posn of original string */	TokenNameCOMMENT_BLOCK	 sort the block and establish posn of original string 
blockSort	TokenNameIdentifier	 block Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * A 6-byte block header, the value chosen arbitrarily as 0x314159265359 * :-). A 32 bit value does not really give a strong enough guarantee * that the value will not appear by chance in the compressed * datastream. Worst-case probability of this event, for a 900k block, * is about 2.0e-3 for 32 bits, 1.0e-5 for 40 bits and 4.0e-8 for 48 * bits. For a compressed file of size 100Gb -- about 100000 blocks -- * only a 48-bit marker will do. NB: normal compression/ decompression * donot rely on these statistical properties. They are only important * when trying to recover blocks from damaged files. */	TokenNameCOMMENT_BLOCK	 A 6-byte block header, the value chosen arbitrarily as 0x314159265359 :-). A 32 bit value does not really give a strong enough guarantee that the value will not appear by chance in the compressed datastream. Worst-case probability of this event, for a 900k block, is about 2.0e-3 for 32 bits, 1.0e-5 for 40 bits and 4.0e-8 for 48 bits. For a compressed file of size 100Gb -- about 100000 blocks -- only a 48-bit marker will do. NB: normal compression/ decompression donot rely on these statistical properties. They are only important when trying to recover blocks from damaged files. 
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x41	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x59	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x26	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x53	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x59	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Now the block's CRC, so it is in a known place. */	TokenNameCOMMENT_BLOCK	 Now the block's CRC, so it is in a known place. 
bsPutInt	TokenNameIdentifier	 bs Put Int
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockCRC	TokenNameIdentifier	 block CRC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Now a single bit indicating no randomisation. */	TokenNameCOMMENT_BLOCK	 Now a single bit indicating no randomisation. 
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Finally, block's contents proper. */	TokenNameCOMMENT_BLOCK	 Finally, block's contents proper. 
moveToFrontCodeAndSend	TokenNameIdentifier	 move To Front Code And Send
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
endCompression	TokenNameIdentifier	 end Compression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/* * Now another magic 48-bit number, 0x177245385090, to indicate the end * of the last block. (sqrt(pi), if you want to know. I did want to use * e, but it contains too much repetition -- 27 18 28 18 28 46 -- for me * to feel statistically comfortable. Call me paranoid.) */	TokenNameCOMMENT_BLOCK	 Now another magic 48-bit number, 0x177245385090, to indicate the end of the last block. (sqrt(pi), if you want to know. I did want to use e, but it contains too much repetition -- 27 18 28 18 28 46 -- for me to feel statistically comfortable. Call me paranoid.) 
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x72	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x45	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x38	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
0x90	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsPutInt	TokenNameIdentifier	 bs Put Int
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
combinedCRC	TokenNameIdentifier	 combined CRC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsFinishedWithStream	TokenNameIdentifier	 bs Finished With Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the blocksize parameter specified at construction time. */	TokenNameCOMMENT_JAVADOC	 Returns the blocksize parameter specified at construction time. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getBlockSize	TokenNameIdentifier	 get Block Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
blockSize100k	TokenNameIdentifier	 block Size100k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
offs	TokenNameIdentifier	 offs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offs	TokenNameIdentifier	 offs
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"offs("	TokenNameStringLiteral	offs(
+	TokenNamePLUS	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
") < 0."	TokenNameStringLiteral	) < 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"len("	TokenNameStringLiteral	len(
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
") < 0."	TokenNameStringLiteral	) < 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"offs("	TokenNameStringLiteral	offs(
+	TokenNamePLUS	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
") + len("	TokenNameStringLiteral	) + len(
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
") > buf.length("	TokenNameStringLiteral	) > buf.length(
+	TokenNamePLUS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"stream closed"	TokenNameStringLiteral	stream closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
offs	TokenNameIdentifier	 offs
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
offs	TokenNameIdentifier	 offs
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
write0	TokenNameIdentifier	 write0
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
offs	TokenNameIdentifier	 offs
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Keeps track of the last bytes written and implicitly performs * run-length encoding as the first step of the bzip2 algorithm. */	TokenNameCOMMENT_JAVADOC	 Keeps track of the last bytes written and implicitly performs run-length encoding as the first step of the bzip2 algorithm. 
private	TokenNameprivate	
void	TokenNamevoid	
write0	TokenNameIdentifier	 write0
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
&=	TokenNameAND_EQUAL	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
>	TokenNameGREATER	
254	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeRun	TokenNameIdentifier	 write Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else nothing to do 	TokenNameCOMMENT_LINE	else nothing to do 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeRun	TokenNameIdentifier	 write Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentChar	TokenNameIdentifier	 current Char
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
runLength	TokenNameIdentifier	 run Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
hbAssignCodes	TokenNameIdentifier	 hb Assign Codes
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
maxLen	TokenNameIdentifier	 max Len
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
;	TokenNameSEMICOLON	
vec	TokenNameIdentifier	 vec
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
vec	TokenNameIdentifier	 vec
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
bsFinishedWithStream	TokenNameIdentifier	 bs Finished With Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|	TokenNameOR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
bsPutUByte	TokenNameIdentifier	 bs Put U Byte
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
bsPutInt	TokenNameIdentifier	 bs Put Int
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues	TokenNameIdentifier	 send MTF Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nInUse	TokenNameIdentifier	 n In Use
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_t	TokenNameIdentifier	 len t
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
GREATER_ICOST	TokenNameIdentifier	 GREATER  ICOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* Decide how many coding tables to use */	TokenNameCOMMENT_BLOCK	 Decide how many coding tables to use 
// assert (this.nMTF > 0) : this.nMTF; 	TokenNameCOMMENT_LINE	assert (this.nMTF > 0) : this.nMTF; 
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
<	TokenNameLESS	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
<	TokenNameLESS	
600	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
<	TokenNameLESS	
1200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
<	TokenNameLESS	
2400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Generate an initial set of coding tables */	TokenNameCOMMENT_BLOCK	 Generate an initial set of coding tables 
sendMTFValues0	TokenNameIdentifier	 send MTF Values0
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Iterate up to N_ITERS times to improve the tables. */	TokenNameCOMMENT_BLOCK	 Iterate up to N_ITERS times to improve the tables. 
final	TokenNamefinal	
int	TokenNameint	
nSelectors	TokenNameIdentifier	 n Selectors
=	TokenNameEQUAL	
sendMTFValues1	TokenNameIdentifier	 send MTF Values1
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Compute MTF values for the selectors. */	TokenNameCOMMENT_BLOCK	 Compute MTF values for the selectors. 
sendMTFValues2	TokenNameIdentifier	 send MTF Values2
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
nSelectors	TokenNameIdentifier	 n Selectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Assign actual codes for the tables. */	TokenNameCOMMENT_BLOCK	 Assign actual codes for the tables. 
sendMTFValues3	TokenNameIdentifier	 send MTF Values3
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Transmit the mapping table. */	TokenNameCOMMENT_BLOCK	 Transmit the mapping table. 
sendMTFValues4	TokenNameIdentifier	 send MTF Values4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Now the selectors. */	TokenNameCOMMENT_BLOCK	 Now the selectors. 
sendMTFValues5	TokenNameIdentifier	 send MTF Values5
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
nSelectors	TokenNameIdentifier	 n Selectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Now the coding tables. */	TokenNameCOMMENT_BLOCK	 Now the coding tables. 
sendMTFValues6	TokenNameIdentifier	 send MTF Values6
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* And finally, the block data proper */	TokenNameCOMMENT_BLOCK	 And finally, the block data proper 
sendMTFValues7	TokenNameIdentifier	 send MTF Values7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues0	TokenNameIdentifier	 send MTF Values0
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mtfFreq	TokenNameIdentifier	 mtf Freq
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
mtfFreq	TokenNameIdentifier	 mtf Freq
;	TokenNameSEMICOLON	
int	TokenNameint	
remF	TokenNameIdentifier	 rem F
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
;	TokenNameSEMICOLON	
int	TokenNameint	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nPart	TokenNameIdentifier	 n Part
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
nPart	TokenNameIdentifier	 n Part
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nPart	TokenNameIdentifier	 n Part
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
tFreq	TokenNameIdentifier	 t Freq
=	TokenNameEQUAL	
remF	TokenNameIdentifier	 rem F
/	TokenNameDIVIDE	
nPart	TokenNameIdentifier	 n Part
;	TokenNameSEMICOLON	
int	TokenNameint	
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
aFreq	TokenNameIdentifier	 a Freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
aFreq	TokenNameIdentifier	 a Freq
<	TokenNameLESS	
tFreq	TokenNameIdentifier	 t Freq
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
<	TokenNameLESS	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aFreq	TokenNameIdentifier	 a Freq
+=	TokenNamePLUS_EQUAL	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
ge	TokenNameIdentifier	 ge
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ge	TokenNameIdentifier	 ge
>	TokenNameGREATER	
gs	TokenNameIdentifier	 gs
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nPart	TokenNameIdentifier	 n Part
!=	TokenNameNOT_EQUAL	
nGroups	TokenNameIdentifier	 n Groups
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nPart	TokenNameIdentifier	 n Part
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
-	TokenNameMINUS	
nPart	TokenNameIdentifier	 n Part
)	TokenNameRPAREN	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aFreq	TokenNameIdentifier	 a Freq
-=	TokenNameMINUS_EQUAL	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
ge	TokenNameIdentifier	 ge
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_np	TokenNameIdentifier	 len np
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
nPart	TokenNameIdentifier	 n Part
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
gs	TokenNameIdentifier	 gs
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<=	TokenNameLESS_EQUAL	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len_np	TokenNameIdentifier	 len np
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LESSER_ICOST	TokenNameIdentifier	 LESSER  ICOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
len_np	TokenNameIdentifier	 len np
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
GREATER_ICOST	TokenNameIdentifier	 GREATER  ICOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
ge	TokenNameIdentifier	 ge
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
remF	TokenNameIdentifier	 rem F
-=	TokenNameMINUS_EQUAL	
aFreq	TokenNameIdentifier	 a Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
sendMTFValues1	TokenNameIdentifier	 send MTF Values1
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rfreq	TokenNameIdentifier	 rfreq
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_rfreq	TokenNameIdentifier	 send MTF Values rfreq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fave	TokenNameIdentifier	 fave
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_fave	TokenNameIdentifier	 send MTF Values fave
;	TokenNameSEMICOLON	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_cost	TokenNameIdentifier	 send MTF Values cost
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sfmap	TokenNameIdentifier	 sfmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sfmap	TokenNameIdentifier	 sfmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_0	TokenNameIdentifier	 len 0
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_1	TokenNameIdentifier	 len 1
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_2	TokenNameIdentifier	 len 2
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_3	TokenNameIdentifier	 len 3
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_4	TokenNameIdentifier	 len 4
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_5	TokenNameIdentifier	 len 5
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nMTFShadow	TokenNameIdentifier	 n MTF Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
;	TokenNameSEMICOLON	
int	TokenNameint	
nSelectors	TokenNameIdentifier	 n Selectors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
N_ITERS	TokenNameIdentifier	 N  ITERS
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fave	TokenNameIdentifier	 fave
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rfreqt	TokenNameIdentifier	 rfreqt
=	TokenNameEQUAL	
rfreq	TokenNameIdentifier	 rfreq
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rfreqt	TokenNameIdentifier	 rfreqt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nSelectors	TokenNameIdentifier	 n Selectors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gs	TokenNameIdentifier	 gs
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Set group start & end marks. */	TokenNameCOMMENT_BLOCK	 Set group start & end marks. 
/* * Calculate the cost of this group as coded by each of the * coding tables. */	TokenNameCOMMENT_BLOCK	 Calculate the cost of this group as coded by each of the coding tables. 
final	TokenNamefinal	
int	TokenNameint	
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
+	TokenNamePLUS	
G_SIZE	TokenNameIdentifier	 G  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nMTFShadow	TokenNameIdentifier	 n MTF Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nGroups	TokenNameIdentifier	 n Groups
==	TokenNameEQUAL_EQUAL	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// unrolled version of the else-block 	TokenNameCOMMENT_LINE	unrolled version of the else-block 
short	TokenNameshort	
cost0	TokenNameIdentifier	 cost0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
cost1	TokenNameIdentifier	 cost1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
cost2	TokenNameIdentifier	 cost2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
cost3	TokenNameIdentifier	 cost3
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
cost4	TokenNameIdentifier	 cost4
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
cost5	TokenNameIdentifier	 cost5
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
ge	TokenNameIdentifier	 ge
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
icv	TokenNameIdentifier	 icv
=	TokenNameEQUAL	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cost0	TokenNameIdentifier	 cost0
+=	TokenNamePLUS_EQUAL	
len_0	TokenNameIdentifier	 len 0
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cost1	TokenNameIdentifier	 cost1
+=	TokenNamePLUS_EQUAL	
len_1	TokenNameIdentifier	 len 1
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cost2	TokenNameIdentifier	 cost2
+=	TokenNamePLUS_EQUAL	
len_2	TokenNameIdentifier	 len 2
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cost3	TokenNameIdentifier	 cost3
+=	TokenNamePLUS_EQUAL	
len_3	TokenNameIdentifier	 len 3
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cost4	TokenNameIdentifier	 cost4
+=	TokenNamePLUS_EQUAL	
len_4	TokenNameIdentifier	 len 4
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cost5	TokenNameIdentifier	 cost5
+=	TokenNamePLUS_EQUAL	
len_5	TokenNameIdentifier	 len 5
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost0	TokenNameIdentifier	 cost0
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost1	TokenNameIdentifier	 cost1
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost2	TokenNameIdentifier	 cost2
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost3	TokenNameIdentifier	 cost3
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost4	TokenNameIdentifier	 cost4
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cost5	TokenNameIdentifier	 cost5
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
ge	TokenNameIdentifier	 ge
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
icv	TokenNameIdentifier	 icv
=	TokenNameEQUAL	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
icv	TokenNameIdentifier	 icv
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Find the coding table which is best for this group, and * record its identity in the selector table. */	TokenNameCOMMENT_BLOCK	 Find the coding table which is best for this group, and record its identity in the selector table. 
int	TokenNameint	
bt	TokenNameIdentifier	 bt
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
999999999	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
cost_t	TokenNameIdentifier	 cost t
=	TokenNameEQUAL	
cost	TokenNameIdentifier	 cost
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cost_t	TokenNameIdentifier	 cost t
<	TokenNameLESS	
bc	TokenNameIdentifier	 bc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
cost_t	TokenNameIdentifier	 cost t
;	TokenNameSEMICOLON	
bt	TokenNameIdentifier	 bt
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fave	TokenNameIdentifier	 fave
[	TokenNameLBRACKET	
bt	TokenNameIdentifier	 bt
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
nSelectors	TokenNameIdentifier	 n Selectors
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
bt	TokenNameIdentifier	 bt
;	TokenNameSEMICOLON	
nSelectors	TokenNameIdentifier	 n Selectors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
/* * Increment the symbol frequencies for the selected table. */	TokenNameCOMMENT_BLOCK	 Increment the symbol frequencies for the selected table. 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rfreq_bt	TokenNameIdentifier	 rfreq bt
=	TokenNameEQUAL	
rfreq	TokenNameIdentifier	 rfreq
[	TokenNameLBRACKET	
bt	TokenNameIdentifier	 bt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
ge	TokenNameIdentifier	 ge
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rfreq_bt	TokenNameIdentifier	 rfreq bt
[	TokenNameLBRACKET	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
ge	TokenNameIdentifier	 ge
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Recompute the tables based on the accumulated frequencies. */	TokenNameCOMMENT_BLOCK	 Recompute the tables based on the accumulated frequencies. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hbMakeCodeLengths	TokenNameIdentifier	 hb Make Code Lengths
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rfreq	TokenNameIdentifier	 rfreq
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nSelectors	TokenNameIdentifier	 n Selectors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues2	TokenNameIdentifier	 send MTF Values2
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
nSelectors	TokenNameIdentifier	 n Selectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert (nGroups < 8) : nGroups; 	TokenNameCOMMENT_LINE	assert (nGroups < 8) : nGroups; 
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues2_pos	TokenNameIdentifier	 send MTF Values2 pos
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
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
nSelectors	TokenNameIdentifier	 n Selectors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
ll_i	TokenNameIdentifier	 ll i
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ll_i	TokenNameIdentifier	 ll i
!=	TokenNameNOT_EQUAL	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp2	TokenNameIdentifier	 tmp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selectorMtf	TokenNameIdentifier	 selector Mtf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues3	TokenNameIdentifier	 send MTF Values3
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sendMTFValues_code	TokenNameIdentifier	 send MTF Values code
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_t	TokenNameIdentifier	 len t
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// assert (maxLen <= 20) : maxLen; 	TokenNameCOMMENT_LINE	assert (maxLen <= 20) : maxLen; 
// assert (minLen >= 1) : minLen; 	TokenNameCOMMENT_LINE	assert (minLen >= 1) : minLen; 
hbAssignCodes	TokenNameIdentifier	 hb Assign Codes
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
,	TokenNameCOMMA	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues4	TokenNameIdentifier	 send MTF Values4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse16	TokenNameIdentifier	 in Use16
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sentMTFValues4_inUse16	TokenNameIdentifier	 sent MTF Values4 in Use16
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inUse16	TokenNameIdentifier	 in Use16
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
i16	TokenNameIdentifier	 i16
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i16	TokenNameIdentifier	 i16
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inUse16	TokenNameIdentifier	 in Use16
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
inUse16	TokenNameIdentifier	 in Use16
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
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
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inUse16	TokenNameIdentifier	 in Use16
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
i16	TokenNameIdentifier	 i16
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// inlined: bsW(1, inUse[i16 + j] ? 1 : 0); 	TokenNameCOMMENT_LINE	inlined: bsW(1, inUse[i16 + j] ? 1 : 0); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i16	TokenNameIdentifier	 i16
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues5	TokenNameIdentifier	 send MTF Values5
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
nSelectors	TokenNameIdentifier	 n Selectors
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nGroups	TokenNameIdentifier	 n Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nSelectors	TokenNameIdentifier	 n Selectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selectorMtf	TokenNameIdentifier	 selector Mtf
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
selectorMtf	TokenNameIdentifier	 selector Mtf
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
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
nSelectors	TokenNameIdentifier	 n Selectors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hj	TokenNameIdentifier	 hj
=	TokenNameEQUAL	
selectorMtf	TokenNameIdentifier	 selector Mtf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
hj	TokenNameIdentifier	 hj
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// inlined: bsW(1, 1); 	TokenNameCOMMENT_LINE	inlined: bsW(1, 1); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inlined: bsW(1, 0); 	TokenNameCOMMENT_LINE	inlined: bsW(1, 0); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bsBuffShadow |= 0 << (32 - bsLiveShadow - 1); 	TokenNameCOMMENT_LINE	bsBuffShadow |= 0 << (32 - bsLiveShadow - 1); 
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues6	TokenNameIdentifier	 send MTF Values6
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nGroups	TokenNameIdentifier	 n Groups
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
alphaSize	TokenNameIdentifier	 alpha Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
nGroups	TokenNameIdentifier	 n Groups
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_t	TokenNameIdentifier	 len t
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
t	TokenNameIdentifier	 t
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// inlined: bsW(5, curr); 	TokenNameCOMMENT_LINE	inlined: bsW(5, curr); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
curr	TokenNameIdentifier	 curr
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
5	TokenNameIntegerLiteral	
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
alphaSize	TokenNameIdentifier	 alpha Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lti	TokenNameIdentifier	 lti
=	TokenNameEQUAL	
len_t	TokenNameIdentifier	 len t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
<	TokenNameLESS	
lti	TokenNameIdentifier	 lti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// inlined: bsW(2, 2); 	TokenNameCOMMENT_LINE	inlined: bsW(2, 2); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
2	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
/* 10 */	TokenNameCOMMENT_BLOCK	 10 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
>	TokenNameGREATER	
lti	TokenNameIdentifier	 lti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// inlined: bsW(2, 3); 	TokenNameCOMMENT_LINE	inlined: bsW(2, 3); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
3	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
/* 11 */	TokenNameCOMMENT_BLOCK	 11 
}	TokenNameRBRACE	
// inlined: bsW(1, 0); 	TokenNameCOMMENT_LINE	inlined: bsW(1, 0); 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write 8-bit 	TokenNameCOMMENT_LINE	write 8-bit 
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bsBuffShadow |= 0 << (32 - bsLiveShadow - 1); 	TokenNameCOMMENT_LINE	bsBuffShadow |= 0 << (32 - bsLiveShadow - 1); 
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sendMTFValues7	TokenNameIdentifier	 send MTF Values7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sendMTFValues_code	TokenNameIdentifier	 send MTF Values code
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OutputStream	TokenNameIdentifier	 Output Stream
outShadow	TokenNameIdentifier	 out Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sfmap	TokenNameIdentifier	 sfmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sfmap	TokenNameIdentifier	 sfmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nMTFShadow	TokenNameIdentifier	 n MTF Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
;	TokenNameSEMICOLON	
int	TokenNameint	
selCtr	TokenNameIdentifier	 sel Ctr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
;	TokenNameSEMICOLON	
int	TokenNameint	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gs	TokenNameIdentifier	 gs
<	TokenNameLESS	
nMTFShadow	TokenNameIdentifier	 n MTF Shadow
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ge	TokenNameIdentifier	 ge
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
+	TokenNamePLUS	
G_SIZE	TokenNameIdentifier	 G  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nMTFShadow	TokenNameIdentifier	 n MTF Shadow
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
selector_selCtr	TokenNameIdentifier	 selector sel Ctr
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
[	TokenNameLBRACKET	
selCtr	TokenNameIdentifier	 sel Ctr
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
code_selCtr	TokenNameIdentifier	 code sel Ctr
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
[	TokenNameLBRACKET	
selector_selCtr	TokenNameIdentifier	 selector sel Ctr
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
len_selCtr	TokenNameIdentifier	 len sel Ctr
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
[	TokenNameLBRACKET	
selector_selCtr	TokenNameIdentifier	 selector sel Ctr
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
<=	TokenNameLESS_EQUAL	
ge	TokenNameIdentifier	 ge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
sfmap_i	TokenNameIdentifier	 sfmap i
=	TokenNameEQUAL	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
gs	TokenNameIdentifier	 gs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// inlined: bsW(len_selCtr[sfmap_i] & 0xff, 	TokenNameCOMMENT_LINE	inlined: bsW(len_selCtr[sfmap_i] & 0xff, 
// code_selCtr[sfmap_i]); 	TokenNameCOMMENT_LINE	code_selCtr[sfmap_i]); 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outShadow	TokenNameIdentifier	 out Shadow
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
>>	TokenNameRIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
<<=	TokenNameLEFT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
len_selCtr	TokenNameIdentifier	 len sel Ctr
[	TokenNameLBRACKET	
sfmap_i	TokenNameIdentifier	 sfmap i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
|=	TokenNameOR_EQUAL	
code_selCtr	TokenNameIdentifier	 code sel Ctr
[	TokenNameLBRACKET	
sfmap_i	TokenNameIdentifier	 sfmap i
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
-	TokenNameMINUS	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
gs	TokenNameIdentifier	 gs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
ge	TokenNameIdentifier	 ge
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
selCtr	TokenNameIdentifier	 sel Ctr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bsBuff	TokenNameIdentifier	 bs Buff
=	TokenNameEQUAL	
bsBuffShadow	TokenNameIdentifier	 bs Buff Shadow
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bsLive	TokenNameIdentifier	 bs Live
=	TokenNameEQUAL	
bsLiveShadow	TokenNameIdentifier	 bs Live Shadow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
moveToFrontCodeAndSend	TokenNameIdentifier	 move To Front Code And Send
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
bsW	TokenNameIdentifier	 bs W
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
origPtr	TokenNameIdentifier	 orig Ptr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generateMTFValues	TokenNameIdentifier	 generate MTF Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendMTFValues	TokenNameIdentifier	 send MTF Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
blockSort	TokenNameIdentifier	 block Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockSorter	TokenNameIdentifier	 block Sorter
.	TokenNameDOT	
blockSort	TokenNameIdentifier	 block Sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Performs Move-To-Front on the Burrows-Wheeler transformed * buffer, storing the MTFed data in data.sfmap in RUNA/RUNB * run-length-encoded form. * * <p>Keeps track of byte frequencies in data.mtfFreq at the same time.</p> */	TokenNameCOMMENT_BLOCK	 Performs Move-To-Front on the Burrows-Wheeler transformed buffer, storing the MTFed data in data.sfmap in RUNA/RUNB run-length-encoded form. * <p>Keeps track of byte frequencies in data.mtfFreq at the same time.</p> 
private	TokenNameprivate	
void	TokenNamevoid	
generateMTFValues	TokenNameIdentifier	 generate MTF Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lastShadow	TokenNameIdentifier	 last Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Data	TokenNameIdentifier	 Data
dataShadow	TokenNameIdentifier	 data Shadow
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
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
sfmap	TokenNameIdentifier	 sfmap
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
sfmap	TokenNameIdentifier	 sfmap
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mtfFreq	TokenNameIdentifier	 mtf Freq
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
mtfFreq	TokenNameIdentifier	 mtf Freq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unseqToSeq	TokenNameIdentifier	 unseq To Seq
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
unseqToSeq	TokenNameIdentifier	 unseq To Seq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yy	TokenNameIdentifier	 yy
=	TokenNameEQUAL	
dataShadow	TokenNameIdentifier	 data Shadow
.	TokenNameDOT	
generateMTFValues_yy	TokenNameIdentifier	 generate MTF Values yy
;	TokenNameSEMICOLON	
// make maps 	TokenNameCOMMENT_LINE	make maps 
int	TokenNameint	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inUse	TokenNameIdentifier	 in Use
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unseqToSeq	TokenNameIdentifier	 unseq To Seq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
;	TokenNameSEMICOLON	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nInUse	TokenNameIdentifier	 n In Use
=	TokenNameEQUAL	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
eob	TokenNameIdentifier	 eob
=	TokenNameEQUAL	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
eob	TokenNameIdentifier	 eob
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nInUseShadow	TokenNameIdentifier	 n In Use Shadow
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
wr	TokenNameIdentifier	 wr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
zPend	TokenNameIdentifier	 z Pend
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
byte	TokenNamebyte	
ll_i	TokenNameIdentifier	 ll i
=	TokenNameEQUAL	
unseqToSeq	TokenNameIdentifier	 unseq To Seq
[	TokenNameLBRACKET	
block	TokenNameIdentifier	 block
[	TokenNameLBRACKET	
fmap	TokenNameIdentifier	 fmap
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ll_i	TokenNameIdentifier	 ll i
!=	TokenNameNOT_EQUAL	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp2	TokenNameIdentifier	 tmp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yy	TokenNameIdentifier	 yy
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zPend	TokenNameIdentifier	 z Pend
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zPend	TokenNameIdentifier	 z Pend
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
RUNA	TokenNameIdentifier	 RUNA
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
RUNA	TokenNameIdentifier	 RUNA
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
RUNB	TokenNameIdentifier	 RUNB
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
RUNB	TokenNameIdentifier	 RUNB
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zPend	TokenNameIdentifier	 z Pend
=	TokenNameEQUAL	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
zPend	TokenNameIdentifier	 z Pend
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zPend	TokenNameIdentifier	 z Pend
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
RUNA	TokenNameIdentifier	 RUNA
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
RUNA	TokenNameIdentifier	 RUNA
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
RUNB	TokenNameIdentifier	 RUNB
;	TokenNameSEMICOLON	
wr	TokenNameIdentifier	 wr
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
RUNB	TokenNameIdentifier	 RUNB
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zPend	TokenNameIdentifier	 z Pend
=	TokenNameEQUAL	
(	TokenNameLPAREN	
zPend	TokenNameIdentifier	 z Pend
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sfmap	TokenNameIdentifier	 sfmap
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
eob	TokenNameIdentifier	 eob
;	TokenNameSEMICOLON	
mtfFreq	TokenNameIdentifier	 mtf Freq
[	TokenNameLBRACKET	
eob	TokenNameIdentifier	 eob
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nMTF	TokenNameIdentifier	 n MTF
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Data	TokenNameIdentifier	 Data
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
// with blockSize 900k 	TokenNameCOMMENT_LINE	with blockSize 900k 
/* maps unsigned byte => "does it occur in block" */	TokenNameCOMMENT_BLOCK	 maps unsigned byte => "does it occur in block" 
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
inUse	TokenNameIdentifier	 in Use
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unseqToSeq	TokenNameIdentifier	 unseq To Seq
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mtfFreq	TokenNameIdentifier	 mtf Freq
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1032 byte 	TokenNameCOMMENT_LINE	1032 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_SELECTORS	TokenNameIdentifier	 MAX  SELECTORS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 18002 byte 	TokenNameCOMMENT_LINE	18002 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selectorMtf	TokenNameIdentifier	 selector Mtf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
MAX_SELECTORS	TokenNameIdentifier	 MAX  SELECTORS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 18002 byte 	TokenNameCOMMENT_LINE	18002 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
generateMTFValues_yy	TokenNameIdentifier	 generate MTF Values yy
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 256 byte 	TokenNameCOMMENT_LINE	256 byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues_len	TokenNameIdentifier	 send MTF Values len
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1548 	TokenNameCOMMENT_LINE	1548 
// byte 	TokenNameCOMMENT_LINE	byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues_rfreq	TokenNameIdentifier	 send MTF Values rfreq
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6192 	TokenNameCOMMENT_LINE	6192 
// byte 	TokenNameCOMMENT_LINE	byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues_fave	TokenNameIdentifier	 send MTF Values fave
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 24 byte 	TokenNameCOMMENT_LINE	24 byte 
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues_cost	TokenNameIdentifier	 send MTF Values cost
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 12 byte 	TokenNameCOMMENT_LINE	12 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues_code	TokenNameIdentifier	 send MTF Values code
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6192 	TokenNameCOMMENT_LINE	6192 
// byte 	TokenNameCOMMENT_LINE	byte 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sendMTFValues2_pos	TokenNameIdentifier	 send MTF Values2 pos
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
N_GROUPS	TokenNameIdentifier	 N  GROUPS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 6 byte 	TokenNameCOMMENT_LINE	6 byte 
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sentMTFValues4_inUse16	TokenNameIdentifier	 sent MTF Values4 in Use16
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 16 byte 	TokenNameCOMMENT_LINE	16 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 1040 byte 	TokenNameCOMMENT_LINE	1040 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 2064 byte 	TokenNameCOMMENT_LINE	2064 byte 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_ALPHA_SIZE	TokenNameIdentifier	 MAX  ALPHA  SIZE
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 2064 byte 	TokenNameCOMMENT_LINE	2064 byte 
// ------------ 	TokenNameCOMMENT_LINE	------------ 
// 333408 byte 	TokenNameCOMMENT_LINE	333408 byte 
/* holds the RLEd block of original data starting at index 1. * After sorting the last byte added to the buffer is at index * 0. */	TokenNameCOMMENT_BLOCK	 holds the RLEd block of original data starting at index 1. After sorting the last byte added to the buffer is at index 0. 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
block	TokenNameIdentifier	 block
;	TokenNameSEMICOLON	
// 900021 byte 	TokenNameCOMMENT_LINE	900021 byte 
/* maps index in Burrows-Wheeler transformed block => index of * byte in original block */	TokenNameCOMMENT_BLOCK	 maps index in Burrows-Wheeler transformed block => index of byte in original block 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fmap	TokenNameIdentifier	 fmap
;	TokenNameSEMICOLON	
// 3600000 byte 	TokenNameCOMMENT_LINE	3600000 byte 
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sfmap	TokenNameIdentifier	 sfmap
;	TokenNameSEMICOLON	
// 3600000 byte 	TokenNameCOMMENT_LINE	3600000 byte 
// ------------ 	TokenNameCOMMENT_LINE	------------ 
// 8433529 byte 	TokenNameCOMMENT_LINE	8433529 byte 
// ============ 	TokenNameCOMMENT_LINE	============ 
/** * Index of original line in Burrows-Wheeler table. * * <p>This is the index in fmap that points to the last byte * of the original data.</p> */	TokenNameCOMMENT_JAVADOC	 Index of original line in Burrows-Wheeler table. * <p>This is the index in fmap that points to the last byte of the original data.</p> 
int	TokenNameint	
origPtr	TokenNameIdentifier	 orig Ptr
;	TokenNameSEMICOLON	
Data	TokenNameIdentifier	 Data
(	TokenNameLPAREN	
int	TokenNameint	
blockSize100k	TokenNameIdentifier	 block Size100k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
blockSize100k	TokenNameIdentifier	 block Size100k
*	TokenNameMULTIPLY	
BZip2Constants	TokenNameIdentifier	 B Zip2 Constants
.	TokenNameDOT	
baseBlockSize	TokenNameIdentifier	 base Block Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
NUM_OVERSHOOT_BYTES	TokenNameIdentifier	 NUM  OVERSHOOT  BYTES
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fmap	TokenNameIdentifier	 fmap
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sfmap	TokenNameIdentifier	 sfmap
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
