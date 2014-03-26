/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ChunkedIntArray.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ChunkedIntArray.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * <code>ChunkedIntArray</code> is an extensible array of blocks of integers. * (I'd consider Vector, but it's unable to handle integers except by * turning them into Objects.) * <p>Making this a separate class means some call-and-return overhead. But * doing it all inline tends to be fragile and expensive in coder time, * not to mention driving up code size. If you want to inline it, feel free. * The Java text suggest that private and Final methods may be inlined, * and one can argue that this beast need not be made subclassable...</p> * * <p>%REVIEW% This has strong conceptual overlap with the IntVector class. * It would probably be a good thing to merge the two, when time permits.<p> */	TokenNameCOMMENT_JAVADOC	 <code>ChunkedIntArray</code> is an extensible array of blocks of integers. (I'd consider Vector, but it's unable to handle integers except by turning them into Objects.) <p>Making this a separate class means some call-and-return overhead. But doing it all inline tends to be fragile and expensive in coder time, not to mention driving up code size. If you want to inline it, feel free. The Java text suggest that private and Final methods may be inlined, and one can argue that this beast need not be made subclassable...</p> * <p>%REVIEW% This has strong conceptual overlap with the IntVector class. It would probably be a good thing to merge the two, when time permits.<p> 
final	TokenNamefinal	
class	TokenNameclass	
ChunkedIntArray	TokenNameIdentifier	 Chunked Int Array
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
slotsize	TokenNameIdentifier	 slotsize
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Locked, MUST be power of two in current code 	TokenNameCOMMENT_LINE	Locked, MUST be power of two in current code 
// Debugging tip: Cranking lowbits down to 4 or so is a good 	TokenNameCOMMENT_LINE	Debugging tip: Cranking lowbits down to 4 or so is a good 
// way to pound on the array addressing code. 	TokenNameCOMMENT_LINE	way to pound on the array addressing code. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
lowbits	TokenNameIdentifier	 lowbits
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// How many bits address within chunks 	TokenNameCOMMENT_LINE	How many bits address within chunks 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
chunkalloc	TokenNameIdentifier	 chunkalloc
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
lowmask	TokenNameIdentifier	 lowmask
=	TokenNameEQUAL	
chunkalloc	TokenNameIdentifier	 chunkalloc
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ChunksVector	TokenNameIdentifier	 Chunks Vector
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ChunksVector	TokenNameIdentifier	 Chunks Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fastArray	TokenNameIdentifier	 fast Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunkalloc	TokenNameIdentifier	 chunkalloc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastUsed	TokenNameIdentifier	 last Used
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a new CIA with specified record size. Currently record size MUST * be a power of two... and in fact is hardcoded to 4. */	TokenNameCOMMENT_JAVADOC	 Create a new CIA with specified record size. Currently record size MUST be a power of two... and in fact is hardcoded to 4. 
ChunkedIntArray	TokenNameIdentifier	 Chunked Int Array
(	TokenNameLPAREN	
int	TokenNameint	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
slotsize	TokenNameIdentifier	 slotsize
<	TokenNameLESS	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier	 ER  CHUNKEDINTARRAY  NOT  SUPPORTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"ChunkedIntArray("+slotsize+") not currently supported"); 	TokenNameCOMMENT_LINE	"ChunkedIntArray("+slotsize+") not currently supported"); 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
slotsize	TokenNameIdentifier	 slotsize
>	TokenNameGREATER	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*****WARNING: ChunkedIntArray("	TokenNameStringLiteral	*****WARNING: ChunkedIntArray(
+	TokenNamePLUS	
slotsize	TokenNameIdentifier	 slotsize
+	TokenNamePLUS	
") wasting "	TokenNameStringLiteral	) wasting 
+	TokenNamePLUS	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
slotsize	TokenNameIdentifier	 slotsize
-	TokenNameMINUS	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
+	TokenNamePLUS	
" words per slot"	TokenNameStringLiteral	 words per slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
fastArray	TokenNameIdentifier	 fast Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a 4-integer record to the CIA, starting with record 1. (Since * arrays are initialized to all-0, 0 has been reserved as the "unknown" * value in DTM.) * @return the index at which this record was inserted. */	TokenNameCOMMENT_JAVADOC	 Append a 4-integer record to the CIA, starting with record 1. (Since arrays are initialized to all-0, 0 has been reserved as the "unknown" value in DTM.) @return the index at which this record was inserted. 
int	TokenNameint	
appendSlot	TokenNameIdentifier	 append Slot
(	TokenNameLPAREN	
int	TokenNameint	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
int	TokenNameint	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
int	TokenNameint	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
int	TokenNameint	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* try { int newoffset = (lastUsed+1)*slotsize; fastArray[newoffset] = w0; fastArray[newoffset+1] = w1; fastArray[newoffset+2] = w2; fastArray[newoffset+3] = w3; return ++lastUsed; } catch(ArrayIndexOutOfBoundsException aioobe) */	TokenNameCOMMENT_BLOCK	 try { int newoffset = (lastUsed+1)*slotsize; fastArray[newoffset] = w0; fastArray[newoffset+1] = w1; fastArray[newoffset+2] = w2; fastArray[newoffset+3] = w3; return ++lastUsed; } catch(ArrayIndexOutOfBoundsException aioobe) 
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
slotsize	TokenNameIdentifier	 slotsize
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
newoffset	TokenNameIdentifier	 newoffset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lastUsed	TokenNameIdentifier	 last Used
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
newoffset	TokenNameIdentifier	 newoffset
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
newoffset	TokenNameIdentifier	 newoffset
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grow if needed 	TokenNameCOMMENT_LINE	Grow if needed 
if	TokenNameif	
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
>	TokenNameGREATER	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunkalloc	TokenNameIdentifier	 chunkalloc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w0	TokenNameIdentifier	 w0
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w1	TokenNameIdentifier	 w1
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w2	TokenNameIdentifier	 w2
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w3	TokenNameIdentifier	 w3
;	TokenNameSEMICOLON	
return	TokenNamereturn	
++	TokenNamePLUS_PLUS	
lastUsed	TokenNameIdentifier	 last Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieve an integer from the CIA by record number and column within * the record, both 0-based (though position 0 is reserved for special * purposes). * @param position int Record number * @param slotpos int Column number */	TokenNameCOMMENT_JAVADOC	 Retrieve an integer from the CIA by record number and column within the record, both 0-based (though position 0 is reserved for special purposes). @param position int Record number @param slotpos int Column number 
int	TokenNameint	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
/* try { return fastArray[(position*slotsize)+offset]; } catch(ArrayIndexOutOfBoundsException aioobe) */	TokenNameCOMMENT_BLOCK	 try { return fastArray[(position*slotsize)+offset]; } catch(ArrayIndexOutOfBoundsException aioobe) 
{	TokenNameLBRACE	
// System.out.println("Using slow read (1)"); 	TokenNameCOMMENT_LINE	System.out.println("Using slow read (1)"); 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Offset bigger than slot"); 	TokenNameCOMMENT_LINE	"Offset bigger than slot"); 
position	TokenNameIdentifier	 position
*=	TokenNameMULTIPLY_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Check that the node at index "position" is not an ancestor 	TokenNameCOMMENT_LINE	Check that the node at index "position" is not an ancestor 
// of the node at index "startPos". IF IT IS, DO NOT ACCEPT IT AND 	TokenNameCOMMENT_LINE	of the node at index "startPos". IF IT IS, DO NOT ACCEPT IT AND 
// RETURN -1. If position is NOT an ancestor, return position. 	TokenNameCOMMENT_LINE	RETURN -1. If position is NOT an ancestor, return position. 
// Special case: The Document node (position==0) is acceptable. 	TokenNameCOMMENT_LINE	Special case: The Document node (position==0) is acceptable. 
// 	TokenNameCOMMENT_LINE	 
// This test supports DTM.getNextPreceding. 	TokenNameCOMMENT_LINE	This test supports DTM.getNextPreceding. 
int	TokenNameint	
specialFind	TokenNameIdentifier	 special Find
(	TokenNameLPAREN	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have to look all the way up the ancestor chain 	TokenNameCOMMENT_LINE	We have to look all the way up the ancestor chain 
// to make sure we don't have an ancestor. 	TokenNameCOMMENT_LINE	to make sure we don't have an ancestor. 
int	TokenNameint	
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the node whose index == ancestor 	TokenNameCOMMENT_LINE	Get the node whose index == ancestor 
ancestor	TokenNameIdentifier	 ancestor
*=	TokenNameMULTIPLY_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
ancestor	TokenNameIdentifier	 ancestor
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
ancestor	TokenNameIdentifier	 ancestor
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get that node's parent (Note that this assumes w[1] 	TokenNameCOMMENT_LINE	Get that node's parent (Note that this assumes w[1] 
// is the parent node index. That's really a DTM feature 	TokenNameCOMMENT_LINE	is the parent node index. That's really a DTM feature 
// rather than a ChunkedIntArray feature.) 	TokenNameCOMMENT_LINE	rather than a ChunkedIntArray feature.) 
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return int index of highest-numbered record currently in use */	TokenNameCOMMENT_JAVADOC	 @return int index of highest-numbered record currently in use 
int	TokenNameint	
slotsUsed	TokenNameIdentifier	 slots Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastUsed	TokenNameIdentifier	 last Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Disard the highest-numbered record. This is used in the string-buffer CIA; when only a single characters() chunk has been recieved, its index is moved into the Text node rather than being referenced by indirection into the text accumulator. */	TokenNameCOMMENT_JAVADOC	 Disard the highest-numbered record. This is used in the string-buffer CIA; when only a single characters() chunk has been recieved, its index is moved into the Text node rather than being referenced by indirection into the text accumulator. 
void	TokenNamevoid	
discardLast	TokenNameIdentifier	 discard Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
lastUsed	TokenNameIdentifier	 last Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overwrite the integer found at a specific record and column. * Used to back-patch existing records, most often changing their * "next sibling" reference from 0 (unknown) to something meaningful * @param position int Record number * @param offset int Column number * @param value int New contents */	TokenNameCOMMENT_JAVADOC	 Overwrite the integer found at a specific record and column. Used to back-patch existing records, most often changing their "next sibling" reference from 0 (unknown) to something meaningful @param position int Record number @param offset int Column number @param value int New contents 
void	TokenNamevoid	
writeEntry	TokenNameIdentifier	 write Entry
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
/* try { fastArray[( position*slotsize)+offset] = value; } catch(ArrayIndexOutOfBoundsException aioobe) */	TokenNameCOMMENT_BLOCK	 try { fastArray[( position*slotsize)+offset] = value; } catch(ArrayIndexOutOfBoundsException aioobe) 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier	 ER  OFFSET  BIGGER  THAN  SLOT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Offset bigger than slot"); 	TokenNameCOMMENT_LINE	"Offset bigger than slot"); 
position	TokenNameIdentifier	 position
*=	TokenNameMULTIPLY_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// ATOMIC! 	TokenNameCOMMENT_LINE	ATOMIC! 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Overwrite an entire (4-integer) record at the specified index. * Mostly used to create record 0, the Document node. * @param position integer Record number * @param w0 int * @param w1 int * @param w2 int * @param w3 int */	TokenNameCOMMENT_JAVADOC	 Overwrite an entire (4-integer) record at the specified index. Mostly used to create record 0, the Document node. @param position integer Record number @param w0 int @param w1 int @param w2 int @param w3 int 
void	TokenNamevoid	
writeSlot	TokenNameIdentifier	 write Slot
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
int	TokenNameint	
w1	TokenNameIdentifier	 w1
,	TokenNameCOMMA	
int	TokenNameint	
w2	TokenNameIdentifier	 w2
,	TokenNameCOMMA	
int	TokenNameint	
w3	TokenNameIdentifier	 w3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
*=	TokenNameMULTIPLY_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grow if needed 	TokenNameCOMMENT_LINE	Grow if needed 
if	TokenNameif	
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
>	TokenNameGREATER	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunkalloc	TokenNameIdentifier	 chunkalloc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w0	TokenNameIdentifier	 w0
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w1	TokenNameIdentifier	 w1
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w2	TokenNameIdentifier	 w2
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
[	TokenNameLBRACKET	
slotpos	TokenNameIdentifier	 slotpos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w3	TokenNameIdentifier	 w3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the contents of a record into a user-supplied buffer array. * Used to reduce addressing overhead when code will access several * columns of the record. * @param position int Record number * @param buffer int[] Integer array provided by user, must be large enough * to hold a complete record. */	TokenNameCOMMENT_JAVADOC	 Retrieve the contents of a record into a user-supplied buffer array. Used to reduce addressing overhead when code will access several columns of the record. @param position int Record number @param buffer int[] Integer array provided by user, must be large enough to hold a complete record. 
void	TokenNamevoid	
readSlot	TokenNameIdentifier	 read Slot
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* try { System.arraycopy(fastArray, position*slotsize, buffer, 0, slotsize); } catch(ArrayIndexOutOfBoundsException aioobe) */	TokenNameCOMMENT_BLOCK	 try { System.arraycopy(fastArray, position*slotsize, buffer, 0, slotsize); } catch(ArrayIndexOutOfBoundsException aioobe) 
{	TokenNameLBRACE	
// System.out.println("Using slow read (2): "+position); 	TokenNameCOMMENT_LINE	System.out.println("Using slow read (2): "+position); 
position	TokenNameIdentifier	 position
*=	TokenNameMULTIPLY_EQUAL	
slotsize	TokenNameIdentifier	 slotsize
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkpos	TokenNameIdentifier	 chunkpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
>>	TokenNameRIGHT_SHIFT	
lowbits	TokenNameIdentifier	 lowbits
;	TokenNameSEMICOLON	
int	TokenNameint	
slotpos	TokenNameIdentifier	 slotpos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
&	TokenNameAND	
lowmask	TokenNameIdentifier	 lowmask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grow if needed 	TokenNameCOMMENT_LINE	Grow if needed 
if	TokenNameif	
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
>	TokenNameGREATER	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunkalloc	TokenNameIdentifier	 chunkalloc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
chunkpos	TokenNameIdentifier	 chunkpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chunk	TokenNameIdentifier	 chunk
,	TokenNameCOMMA	
slotpos	TokenNameIdentifier	 slotpos
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
slotsize	TokenNameIdentifier	 slotsize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
ChunksVector	TokenNameIdentifier	 Chunks Vector
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
BLOCKSIZE	TokenNameIdentifier	 BLOCKSIZE
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
BLOCKSIZE	TokenNameIdentifier	 BLOCKSIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
BLOCKSIZE	TokenNameIdentifier	 BLOCKSIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ChunksVector	TokenNameIdentifier	 Chunks Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
orgMapSize	TokenNameIdentifier	 org Map Size
=	TokenNameEQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
BLOCKSIZE	TokenNameIdentifier	 BLOCKSIZE
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
orgMapSize	TokenNameIdentifier	 org Map Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For now, just do a simple append. A sorted insert only 	TokenNameCOMMENT_LINE	For now, just do a simple append. A sorted insert only 
// makes sense if we're doing an binary search or some such. 	TokenNameCOMMENT_LINE	makes sense if we're doing an binary search or some such. 
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
