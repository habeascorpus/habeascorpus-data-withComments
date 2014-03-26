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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
;	TokenNameSEMICOLON	
/** * This abstract class writes skip lists with multiple levels. * * Example for skipInterval = 3: * c (skip level 2) * c c c (skip level 1) * x x x x x x x x x x (skip level 0) * d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d (posting list) * 3 6 9 12 15 18 21 24 27 30 (df) * * d - document * x - skip data * c - skip data with child pointer * * Skip level i contains every skipInterval-th entry from skip level i-1. * Therefore the number of entries on level i is: floor(df / ((skipInterval ^ (i + 1))). * * Each skip entry on a level i>0 contains a pointer to the corresponding skip entry in list i-1. * This guarantees a logarithmic amount of skips to find the target document. * * While this class takes care of writing the different skip levels, * subclasses must define the actual format of the skip data. * */	TokenNameCOMMENT_JAVADOC	 This abstract class writes skip lists with multiple levels. * Example for skipInterval = 3: c (skip level 2) c c c (skip level 1) x x x x x x x x x x (skip level 0) d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d d (posting list) 3 6 9 12 15 18 21 24 27 30 (df) * d - document x - skip data c - skip data with child pointer * Skip level i contains every skipInterval-th entry from skip level i-1. Therefore the number of entries on level i is: floor(df / ((skipInterval ^ (i + 1))). * Each skip entry on a level i>0 contains a pointer to the corresponding skip entry in list i-1. This guarantees a logarithmic amount of skips to find the target document. * While this class takes care of writing the different skip levels, subclasses must define the actual format of the skip data. 
abstract	TokenNameabstract	
class	TokenNameclass	
MultiLevelSkipListWriter	TokenNameIdentifier	 Multi Level Skip List Writer
{	TokenNameLBRACE	
// number of levels in this skip list 	TokenNameCOMMENT_LINE	number of levels in this skip list 
private	TokenNameprivate	
int	TokenNameint	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
;	TokenNameSEMICOLON	
// the skip interval in the list with level = 0 	TokenNameCOMMENT_LINE	the skip interval in the list with level = 0 
private	TokenNameprivate	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
// for every skip level a different buffer is used 	TokenNameCOMMENT_LINE	for every skip level a different buffer is used 
private	TokenNameprivate	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skipBuffer	TokenNameIdentifier	 skip Buffer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
MultiLevelSkipListWriter	TokenNameIdentifier	 Multi Level Skip List Writer
(	TokenNameLPAREN	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
,	TokenNameCOMMA	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
int	TokenNameint	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
// calculate the maximum number of skip levels for this document frequency 	TokenNameCOMMENT_LINE	calculate the maximum number of skip levels for this document frequency 
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure it does not exceed maxSkipLevels 	TokenNameCOMMENT_LINE	make sure it does not exceed maxSkipLevels 
if	TokenNameif	
(	TokenNameLPAREN	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
>	TokenNameGREATER	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
=	TokenNameEQUAL	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipBuffer	TokenNameIdentifier	 skip Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
[	TokenNameLBRACKET	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
]	TokenNameRBRACKET	
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
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
resetSkip	TokenNameIdentifier	 reset Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// creates new buffers or empties the existing ones 	TokenNameCOMMENT_LINE	creates new buffers or empties the existing ones 
if	TokenNameif	
(	TokenNameLPAREN	
skipBuffer	TokenNameIdentifier	 skip Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subclasses must implement the actual skip data encoding in this method. * * @param level the level skip data shall be writing for * @param skipBuffer the skip buffer to write to */	TokenNameCOMMENT_JAVADOC	 Subclasses must implement the actual skip data encoding in this method. * @param level the level skip data shall be writing for @param skipBuffer the skip buffer to write to 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
writeSkipData	TokenNameIdentifier	 write Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
IndexOutput	TokenNameIdentifier	 Index Output
skipBuffer	TokenNameIdentifier	 skip Buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Writes the current skip data to the buffers. The current document frequency determines * the max level is skip data is to be written to. * * @param df the current document frequency * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Writes the current skip data to the buffers. The current document frequency determines the max level is skip data is to be written to. * @param df the current document frequency @throws IOException 
void	TokenNamevoid	
bufferSkip	TokenNameIdentifier	 buffer Skip
(	TokenNameLPAREN	
int	TokenNameint	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numLevels	TokenNameIdentifier	 num Levels
;	TokenNameSEMICOLON	
// determine max level 	TokenNameCOMMENT_LINE	determine max level 
for	TokenNamefor	
(	TokenNameLPAREN	
numLevels	TokenNameIdentifier	 num Levels
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
%	TokenNameREMAINDER	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
numLevels	TokenNameIdentifier	 num Levels
<	TokenNameLESS	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
/=	TokenNameDIVIDE_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numLevels	TokenNameIdentifier	 num Levels
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
childPointer	TokenNameIdentifier	 child Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
<	TokenNameLESS	
numLevels	TokenNameIdentifier	 num Levels
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeSkipData	TokenNameIdentifier	 write Skip Data
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
newChildPointer	TokenNameIdentifier	 new Child Pointer
=	TokenNameEQUAL	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// store child pointers for all levels except the lowest 	TokenNameCOMMENT_LINE	store child pointers for all levels except the lowest 
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
childPointer	TokenNameIdentifier	 child Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//remember the childPointer for the next level 	TokenNameCOMMENT_LINE	remember the childPointer for the next level 
childPointer	TokenNameIdentifier	 child Pointer
=	TokenNameEQUAL	
newChildPointer	TokenNameIdentifier	 new Child Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Writes the buffered skip lists to the given output. * * @param output the IndexOutput the skip lists shall be written to * @return the pointer the skip list starts */	TokenNameCOMMENT_JAVADOC	 Writes the buffered skip lists to the given output. * @param output the IndexOutput the skip lists shall be written to @return the pointer the skip list starts 
long	TokenNamelong	
writeSkip	TokenNameIdentifier	 write Skip
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipBuffer	TokenNameIdentifier	 skip Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
skipBuffer	TokenNameIdentifier	 skip Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
skipPointer	TokenNameIdentifier	 skip Pointer
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
skipBuffer	TokenNameIdentifier	 skip Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
skipPointer	TokenNameIdentifier	 skip Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
