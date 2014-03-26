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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
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
IndexInput	TokenNameIdentifier	 Index Input
;	TokenNameSEMICOLON	
/** * This abstract class reads skip lists with multiple levels. * * See {@link MultiLevelSkipListWriter} for the information about the encoding * of the multi level skip lists. * * Subclasses must implement the abstract method {@link #readSkipData(int, IndexInput)} * which defines the actual format of the skip data. */	TokenNameCOMMENT_JAVADOC	 This abstract class reads skip lists with multiple levels. * See {@link MultiLevelSkipListWriter} for the information about the encoding of the multi level skip lists. * Subclasses must implement the abstract method {@link #readSkipData(int, IndexInput)} which defines the actual format of the skip data. 
abstract	TokenNameabstract	
class	TokenNameclass	
MultiLevelSkipListReader	TokenNameIdentifier	 Multi Level Skip List Reader
{	TokenNameLBRACE	
// the maximum number of skip levels possible for this index 	TokenNameCOMMENT_LINE	the maximum number of skip levels possible for this index 
private	TokenNameprivate	
int	TokenNameint	
maxNumberOfSkipLevels	TokenNameIdentifier	 max Number Of Skip Levels
;	TokenNameSEMICOLON	
// number of levels in this skip list 	TokenNameCOMMENT_LINE	number of levels in this skip list 
private	TokenNameprivate	
int	TokenNameint	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
;	TokenNameSEMICOLON	
// Expert: defines the number of top skip levels to buffer in memory. 	TokenNameCOMMENT_LINE	Expert: defines the number of top skip levels to buffer in memory. 
// Reducing this number results in less memory usage, but possibly 	TokenNameCOMMENT_LINE	Reducing this number results in less memory usage, but possibly 
// slower performance due to more random I/Os. 	TokenNameCOMMENT_LINE	slower performance due to more random I/Os. 
// Please notice that the space each level occupies is limited by 	TokenNameCOMMENT_LINE	Please notice that the space each level occupies is limited by 
// the skipInterval. The top level can not contain more than 	TokenNameCOMMENT_LINE	the skipInterval. The top level can not contain more than 
// skipLevel entries, the second top level can not contain more 	TokenNameCOMMENT_LINE	skipLevel entries, the second top level can not contain more 
// than skipLevel^2 entries and so forth. 	TokenNameCOMMENT_LINE	than skipLevel^2 entries and so forth. 
private	TokenNameprivate	
int	TokenNameint	
numberOfLevelsToBuffer	TokenNameIdentifier	 number Of Levels To Buffer
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveSkipped	TokenNameIdentifier	 have Skipped
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skipStream	TokenNameIdentifier	 skip Stream
;	TokenNameSEMICOLON	
// skipStream for each level 	TokenNameCOMMENT_LINE	skipStream for each level 
private	TokenNameprivate	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the start pointer of each skip level 	TokenNameCOMMENT_LINE	the start pointer of each skip level 
private	TokenNameprivate	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// skipInterval of each level 	TokenNameCOMMENT_LINE	skipInterval of each level 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
numSkipped	TokenNameIdentifier	 num Skipped
;	TokenNameSEMICOLON	
// number of docs skipped per level 	TokenNameCOMMENT_LINE	number of docs skipped per level 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skipDoc	TokenNameIdentifier	 skip Doc
;	TokenNameSEMICOLON	
// doc id of current skip entry per level 	TokenNameCOMMENT_LINE	doc id of current skip entry per level 
private	TokenNameprivate	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
// doc id of last read skip entry with docId <= target 	TokenNameCOMMENT_LINE	doc id of last read skip entry with docId <= target 
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
childPointer	TokenNameIdentifier	 child Pointer
;	TokenNameSEMICOLON	
// child pointer of current skip entry per level 	TokenNameCOMMENT_LINE	child pointer of current skip entry per level 
private	TokenNameprivate	
long	TokenNamelong	
lastChildPointer	TokenNameIdentifier	 last Child Pointer
;	TokenNameSEMICOLON	
// childPointer of last read skip entry with docId <= target 	TokenNameCOMMENT_LINE	childPointer of last read skip entry with docId <= target 
private	TokenNameprivate	
boolean	TokenNameboolean	
inputIsBuffered	TokenNameIdentifier	 input Is Buffered
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiLevelSkipListReader	TokenNameIdentifier	 Multi Level Skip List Reader
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
skipStream	TokenNameIdentifier	 skip Stream
,	TokenNameCOMMA	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skipStream	TokenNameIdentifier	 skip Stream
=	TokenNameEQUAL	
new	TokenNamenew	
IndexInput	TokenNameIdentifier	 Index Input
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipPointer	TokenNameIdentifier	 skip Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
childPointer	TokenNameIdentifier	 child Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numSkipped	TokenNameIdentifier	 num Skipped
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxNumberOfSkipLevels	TokenNameIdentifier	 max Number Of Skip Levels
=	TokenNameEQUAL	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputIsBuffered	TokenNameIdentifier	 input Is Buffered
=	TokenNameEQUAL	
(	TokenNameLPAREN	
skipStream	TokenNameIdentifier	 skip Stream
instanceof	TokenNameinstanceof	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cache skip intervals 	TokenNameCOMMENT_LINE	cache skip intervals 
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skipDoc	TokenNameIdentifier	 skip Doc
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the id of the doc to which the last call of {@link #skipTo(int)} * has skipped. */	TokenNameCOMMENT_JAVADOC	 Returns the id of the doc to which the last call of {@link #skipTo(int)} has skipped. 
int	TokenNameint	
getDoc	TokenNameIdentifier	 get Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Skips entries to the first beyond the current whose document number is * greater than or equal to <i>target</i>. Returns the current doc count. */	TokenNameCOMMENT_JAVADOC	 Skips entries to the first beyond the current whose document number is greater than or equal to <i>target</i>. Returns the current doc count. 
int	TokenNameint	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
haveSkipped	TokenNameIdentifier	 have Skipped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first time, load skip levels 	TokenNameCOMMENT_LINE	first time, load skip levels 
loadSkipLevels	TokenNameIdentifier	 load Skip Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveSkipped	TokenNameIdentifier	 have Skipped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// walk up the levels until highest level is found that has a skip 	TokenNameCOMMENT_LINE	walk up the levels until highest level is found that has a skip 
// for this target 	TokenNameCOMMENT_LINE	for this target 
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
<	TokenNameLESS	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
target	TokenNameIdentifier	 target
>	TokenNameGREATER	
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
>	TokenNameGREATER	
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
loadNextSkip	TokenNameIdentifier	 load Next Skip
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// no more skips on this level, go down one level 	TokenNameCOMMENT_LINE	no more skips on this level, go down one level 
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lastChildPointer	TokenNameIdentifier	 last Child Pointer
>	TokenNameGREATER	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
seekChild	TokenNameIdentifier	 seek Child
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
level	TokenNameIdentifier	 level
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
numSkipped	TokenNameIdentifier	 num Skipped
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
loadNextSkip	TokenNameIdentifier	 load Next Skip
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// we have to skip, the target document is greater than the current 	TokenNameCOMMENT_LINE	we have to skip, the target document is greater than the current 
// skip list entry 	TokenNameCOMMENT_LINE	skip list entry 
setLastSkipData	TokenNameIdentifier	 set Last Skip Data
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numSkipped	TokenNameIdentifier	 num Skipped
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSkipped	TokenNameIdentifier	 num Skipped
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
>	TokenNameGREATER	
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this skip list is exhausted 	TokenNameCOMMENT_LINE	this skip list is exhausted 
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
>	TokenNameGREATER	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// read next skip entry 	TokenNameCOMMENT_LINE	read next skip entry 
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
readSkipData	TokenNameIdentifier	 read Skip Data
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read the child pointer if we are not on the leaf level 	TokenNameCOMMENT_LINE	read the child pointer if we are not on the leaf level 
childPointer	TokenNameIdentifier	 child Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Seeks the skip entry on the given level */	TokenNameCOMMENT_JAVADOC	 Seeks the skip entry on the given level 
protected	TokenNameprotected	
void	TokenNamevoid	
seekChild	TokenNameIdentifier	 seek Child
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
lastChildPointer	TokenNameIdentifier	 last Child Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numSkipped	TokenNameIdentifier	 num Skipped
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
numSkipped	TokenNameIdentifier	 num Skipped
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childPointer	TokenNameIdentifier	 child Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
skipStream	TokenNameIdentifier	 skip Stream
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** initializes the reader */	TokenNameCOMMENT_JAVADOC	 initializes the reader 
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
,	TokenNameCOMMA	
int	TokenNameint	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipPointer	TokenNameIdentifier	 skip Pointer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
skipDoc	TokenNameIdentifier	 skip Doc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
numSkipped	TokenNameIdentifier	 num Skipped
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
childPointer	TokenNameIdentifier	 child Pointer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveSkipped	TokenNameIdentifier	 have Skipped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Loads the skip levels */	TokenNameCOMMENT_JAVADOC	 Loads the skip levels 
private	TokenNameprivate	
void	TokenNamevoid	
loadSkipLevels	TokenNameIdentifier	 load Skip Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
=	TokenNameEQUAL	
docCount	TokenNameIdentifier	 doc Count
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
docCount	TokenNameIdentifier	 doc Count
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
skipInterval	TokenNameIdentifier	 skip Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
>	TokenNameGREATER	
maxNumberOfSkipLevels	TokenNameIdentifier	 max Number Of Skip Levels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
=	TokenNameEQUAL	
maxNumberOfSkipLevels	TokenNameIdentifier	 max Number Of Skip Levels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
toBuffer	TokenNameIdentifier	 to Buffer
=	TokenNameEQUAL	
numberOfLevelsToBuffer	TokenNameIdentifier	 number Of Levels To Buffer
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
numberOfSkipLevels	TokenNameIdentifier	 number Of Skip Levels
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the length of the current level 	TokenNameCOMMENT_LINE	the length of the current level 
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the start pointer of the current level 	TokenNameCOMMENT_LINE	the start pointer of the current level 
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toBuffer	TokenNameIdentifier	 to Buffer
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// buffer this level 	TokenNameCOMMENT_LINE	buffer this level 
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
SkipBuffer	TokenNameIdentifier	 Skip Buffer
(	TokenNameLPAREN	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toBuffer	TokenNameIdentifier	 to Buffer
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// clone this stream, it is already at the start of the current level 	TokenNameCOMMENT_LINE	clone this stream, it is already at the start of the current level 
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputIsBuffered	TokenNameIdentifier	 input Is Buffered
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
)	TokenNameRPAREN	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// move base stream beyond the current level 	TokenNameCOMMENT_LINE	move base stream beyond the current level 
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// use base stream for the lowest level 	TokenNameCOMMENT_LINE	use base stream for the lowest level 
skipPointer	TokenNameIdentifier	 skip Pointer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
skipStream	TokenNameIdentifier	 skip Stream
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclasses must implement the actual skip data encoding in this method. * * @param level the level skip data shall be read from * @param skipStream the skip stream to read from */	TokenNameCOMMENT_JAVADOC	 Subclasses must implement the actual skip data encoding in this method. * @param level the level skip data shall be read from @param skipStream the skip stream to read from 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
readSkipData	TokenNameIdentifier	 read Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
skipStream	TokenNameIdentifier	 skip Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Copies the values of the last read skip entry on this level */	TokenNameCOMMENT_JAVADOC	 Copies the values of the last read skip entry on this level 
protected	TokenNameprotected	
void	TokenNamevoid	
setLastSkipData	TokenNameIdentifier	 set Last Skip Data
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
skipDoc	TokenNameIdentifier	 skip Doc
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastChildPointer	TokenNameIdentifier	 last Child Pointer
=	TokenNameEQUAL	
childPointer	TokenNameIdentifier	 child Pointer
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** used to buffer the top skip levels */	TokenNameCOMMENT_JAVADOC	 used to buffer the top skip levels 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
SkipBuffer	TokenNameIdentifier	 Skip Buffer
extends	TokenNameextends	
IndexInput	TokenNameIdentifier	 Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
SkipBuffer	TokenNameIdentifier	 Skip Buffer
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"SkipBuffer on "	TokenNameStringLiteral	SkipBuffer on 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointer	TokenNameIdentifier	 pointer
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
