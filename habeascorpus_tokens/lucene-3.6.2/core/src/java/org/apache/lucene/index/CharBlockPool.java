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
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
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
final	TokenNamefinal	
class	TokenNameclass	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
{	TokenNameLBRACE	
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffers	TokenNameIdentifier	 buffers
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numBuffer	TokenNameIdentifier	 num Buffer
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
charUpto	TokenNameIdentifier	 char Upto
=	TokenNameEQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Where we are in head buffer 	TokenNameCOMMENT_LINE	Where we are in head buffer 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
// Current head buffer 	TokenNameCOMMENT_LINE	Current head buffer 
public	TokenNamepublic	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
;	TokenNameSEMICOLON	
// Current head offset 	TokenNameCOMMENT_LINE	Current head offset 
final	TokenNamefinal	
private	TokenNameprivate	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
docWriter	TokenNameIdentifier	 doc Writer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
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
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
recycleCharBlocks	TokenNameIdentifier	 recycle Char Blocks
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bufferUpto	TokenNameIdentifier	 buffer Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charUpto	TokenNameIdentifier	 char Upto
=	TokenNameEQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
;	TokenNameSEMICOLON	
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
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffers	TokenNameIdentifier	 new Buffers
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
buffers	TokenNameIdentifier	 buffers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
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
getCharBlock	TokenNameIdentifier	 get Char Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferUpto	TokenNameIdentifier	 buffer Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
charUpto	TokenNameIdentifier	 char Upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
charOffset	TokenNameIdentifier	 char Offset
+=	TokenNamePLUS_EQUAL	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SIZE	TokenNameIdentifier	 CHAR  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
