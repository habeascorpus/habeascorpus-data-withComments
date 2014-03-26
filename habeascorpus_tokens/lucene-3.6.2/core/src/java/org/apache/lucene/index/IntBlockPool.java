package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
final	TokenNamefinal	
class	TokenNameclass	
IntBlockPool	TokenNameIdentifier	 Int Block Pool
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Which buffer we are upto 	TokenNameCOMMENT_LINE	Which buffer we are upto 
public	TokenNamepublic	
int	TokenNameint	
intUpto	TokenNameIdentifier	 int Upto
=	TokenNameEQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SIZE	TokenNameIdentifier	 INT  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Where we are in head buffer 	TokenNameCOMMENT_LINE	Where we are in head buffer 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// Current head buffer 	TokenNameCOMMENT_LINE	Current head buffer 
public	TokenNamepublic	
int	TokenNameint	
intOffset	TokenNameIdentifier	 int Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SIZE	TokenNameIdentifier	 INT  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Current head offset 	TokenNameCOMMENT_LINE	Current head offset 
final	TokenNamefinal	
private	TokenNameprivate	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IntBlockPool	TokenNameIdentifier	 Int Block Pool
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferUpto	TokenNameIdentifier	 buffer Upto
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferUpto	TokenNameIdentifier	 buffer Upto
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Recycle all but the first buffer 	TokenNameCOMMENT_LINE	Recycle all but the first buffer 
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
recycleIntBlocks	TokenNameIdentifier	 recycle Int Blocks
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reuse first buffer 	TokenNameCOMMENT_LINE	Reuse first buffer 
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
intUpto	TokenNameIdentifier	 int Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
intOffset	TokenNameIdentifier	 int Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
==	TokenNameEQUAL_EQUAL	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffers	TokenNameIdentifier	 new Buffers
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffers	TokenNameIdentifier	 new Buffers
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
newBuffers	TokenNameIdentifier	 new Buffers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
getIntBlock	TokenNameIdentifier	 get Int Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
intUpto	TokenNameIdentifier	 int Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
intOffset	TokenNameIdentifier	 int Offset
+=	TokenNamePLUS_EQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
INT_BLOCK_SIZE	TokenNameIdentifier	 INT  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
