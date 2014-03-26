/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
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
ReaderUtil	TokenNameIdentifier	 Reader Util
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** Sort an index by document importance factor. Higher scoring documents are * assigned smaller document numbers. Document weights are obtained from a * specified field, which has to be single-valued and stored, with string value * that represents a float number. Stored fields in the output index remain * consistent, i.e. both stored fields and postings are renumbered in sync. * * <p><b>NOTE</b>: this tool is unaware of documents added * atomically via {@link IndexWriter#addDocuments} or {@link * IndexWriter#updateDocuments}, which means it can easily * break up such document groups. */	TokenNameCOMMENT_JAVADOC	 Sort an index by document importance factor. Higher scoring documents are assigned smaller document numbers. Document weights are obtained from a specified field, which has to be single-valued and stored, with string value that represents a float number. Stored fields in the output index remain consistent, i.e. both stored fields and postings are renumbered in sync. * <p><b>NOTE</b>: this tool is unaware of documents added atomically via {@link IndexWriter#addDocuments} or {@link IndexWriter#updateDocuments}, which means it can easily break up such document groups. 
public	TokenNamepublic	
class	TokenNameclass	
IndexSorter	TokenNameIdentifier	 Index Sorter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
IndexSorter	TokenNameIdentifier	 Index Sorter
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
PostingMap	TokenNameIdentifier	 Posting Map
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
PostingMap	TokenNameIdentifier	 Posting Map
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
newDoc	TokenNameIdentifier	 new Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
PostingMap	TokenNameIdentifier	 Posting Map
pm	TokenNameIdentifier	 pm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// order by newDoc id 	TokenNameCOMMENT_LINE	order by newDoc id 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
newDoc	TokenNameIdentifier	 new Doc
-	TokenNameMINUS	
pm	TokenNameIdentifier	 pm
.	TokenNameDOT	
newDoc	TokenNameIdentifier	 new Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SortedTermPositions	TokenNameIdentifier	 Sorted Term Positions
implements	TokenNameimplements	
TermPositions	TokenNameIdentifier	 Term Positions
{	TokenNameLBRACE	
private	TokenNameprivate	
TermPositions	TokenNameIdentifier	 Term Positions
original	TokenNameIdentifier	 original
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PostingMap	TokenNameIdentifier	 Posting Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postingMaps	TokenNameIdentifier	 posting Maps
=	TokenNameEQUAL	
new	TokenNamenew	
PostingMap	TokenNameIdentifier	 Posting Map
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEMP_FILE	TokenNameIdentifier	 TEMP  FILE
=	TokenNameEQUAL	
"temp"	TokenNameStringLiteral	temp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RAMDirectory	TokenNameIdentifier	 RAM Directory
tempDir	TokenNameIdentifier	 temp Dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SortedTermPositions	TokenNameIdentifier	 Sorted Term Positions
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
original	TokenNameIdentifier	 original
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldToNew	TokenNameIdentifier	 old To New
=	TokenNameEQUAL	
oldToNew	TokenNameIdentifier	 old To New
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
)	TokenNameRPAREN	
tempDir	TokenNameIdentifier	 temp Dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
TEMP_FILE	TokenNameIdentifier	 TEMP  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
"Error creating temporary output: "	TokenNameStringLiteral	Error creating temporary output: 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
>	TokenNameGREATER	
postingMaps	TokenNameIdentifier	 posting Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// grow postingsMap 	TokenNameCOMMENT_LINE	grow postingsMap 
PostingMap	TokenNameIdentifier	 Posting Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
PostingMap	TokenNameIdentifier	 Posting Map
[	TokenNameLBRACKET	
docFreq	TokenNameIdentifier	 doc Freq
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
postingMaps	TokenNameIdentifier	 posting Maps
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postingMaps	TokenNameIdentifier	 posting Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
postingMaps	TokenNameIdentifier	 posting Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
PostingMap	TokenNameIdentifier	 Posting Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
postingMaps	TokenNameIdentifier	 posting Maps
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PostingMap	TokenNameIdentifier	 Posting Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
postingMaps	TokenNameIdentifier	 posting Maps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
newDoc	TokenNameIdentifier	 new Doc
=	TokenNameEQUAL	
oldToNew	TokenNameIdentifier	 old To New
[	TokenNameLBRACKET	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// remap the newDoc id 	TokenNameCOMMENT_LINE	remap the newDoc id 
map	TokenNameIdentifier	 map
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save pointer to buffer 	TokenNameCOMMENT_LINE	save pointer to buffer 
final	TokenNamefinal	
int	TokenNameint	
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// buffer tf & positions 	TokenNameCOMMENT_LINE	buffer tf & positions 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prevPosition	TokenNameIdentifier	 prev Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// delta encode positions 	TokenNameCOMMENT_LINE	delta encode positions 
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
-	TokenNameMINUS	
prevPosition	TokenNameIdentifier	 prev Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevPosition	TokenNameIdentifier	 prev Position
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// allow for deletions 	TokenNameCOMMENT_LINE	allow for deletions 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
postingMaps	TokenNameIdentifier	 posting Maps
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// resort by mapped doc ids 	TokenNameCOMMENT_LINE	resort by mapped doc ids 
// NOTE: this might be substantially faster if RAMInputStream were public 	TokenNameCOMMENT_LINE	NOTE: this might be substantially faster if RAMInputStream were public 
// and supported a reset() operation. 	TokenNameCOMMENT_LINE	and supported a reset() operation. 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
tempDir	TokenNameIdentifier	 temp Dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
TEMP_FILE	TokenNameIdentifier	 TEMP  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
<	TokenNameLESS	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
postingMaps	TokenNameIdentifier	 posting Maps
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
postingMaps	TokenNameIdentifier	 posting Maps
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
.	TokenNameDOT	
newDoc	TokenNameIdentifier	 new Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SortingReader	TokenNameIdentifier	 Sorting Reader
extends	TokenNameextends	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newToOld	TokenNameIdentifier	 new To Old
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SortingReader	TokenNameIdentifier	 Sorting Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldToNew	TokenNameIdentifier	 old To New
=	TokenNameEQUAL	
oldToNew	TokenNameIdentifier	 old To New
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newToOld	TokenNameIdentifier	 new To Old
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
oldDoc	TokenNameIdentifier	 old Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oldDoc	TokenNameIdentifier	 old Doc
<	TokenNameLESS	
oldToNew	TokenNameIdentifier	 old To New
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newDoc	TokenNameIdentifier	 new Doc
=	TokenNameEQUAL	
oldToNew	TokenNameIdentifier	 old To New
[	TokenNameLBRACKET	
oldDoc	TokenNameIdentifier	 old Doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newDoc	TokenNameIdentifier	 new Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newToOld	TokenNameIdentifier	 new To Old
[	TokenNameLBRACKET	
newDoc	TokenNameIdentifier	 new Doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
oldDoc	TokenNameIdentifier	 old Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oldDoc	TokenNameIdentifier	 old Doc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getMergedFieldInfos	TokenNameIdentifier	 get Merged Field Infos
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
newToOld	TokenNameIdentifier	 new To Old
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldNorms	TokenNameIdentifier	 old Norms
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
oldDoc	TokenNameIdentifier	 old Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oldDoc	TokenNameIdentifier	 old Doc
<	TokenNameLESS	
oldNorms	TokenNameIdentifier	 old Norms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newDoc	TokenNameIdentifier	 new Doc
=	TokenNameEQUAL	
oldToNew	TokenNameIdentifier	 old To New
[	TokenNameLBRACKET	
oldDoc	TokenNameIdentifier	 old Doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newDoc	TokenNameIdentifier	 new Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
newDoc	TokenNameIdentifier	 new Doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
oldNorms	TokenNameIdentifier	 old Norms
[	TokenNameLBRACKET	
oldDoc	TokenNameIdentifier	 old Doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oldDoc	TokenNameIdentifier	 old Doc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SortedTermPositions	TokenNameIdentifier	 Sorted Term Positions
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
oldToNew	TokenNameIdentifier	 old To New
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
newToOld	TokenNameIdentifier	 new To Old
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DocScore	TokenNameIdentifier	 Doc Score
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
DocScore	TokenNameIdentifier	 Doc Score
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
oldDoc	TokenNameIdentifier	 old Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DocScore	TokenNameIdentifier	 Doc Score
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// order by score, oldDoc 	TokenNameCOMMENT_LINE	order by score, oldDoc 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
oldDoc	TokenNameIdentifier	 old Doc
-	TokenNameMINUS	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
oldDoc	TokenNameIdentifier	 old Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
score	TokenNameIdentifier	 score
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"oldDoc="	TokenNameStringLiteral	oldDoc=
+	TokenNamePLUS	
oldDoc	TokenNameIdentifier	 old Doc
+	TokenNamePLUS	
",score="	TokenNameStringLiteral	,score=
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IndexSorter	TokenNameIdentifier	 Index Sorter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"IndexSorter: starting."	TokenNameStringLiteral	IndexSorter: starting.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortingReader	TokenNameIdentifier	 Sorting Reader
sorter	TokenNameIdentifier	 sorter
=	TokenNameEQUAL	
new	TokenNamenew	
SortingReader	TokenNameIdentifier	 Sorting Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
oldToNew	TokenNameIdentifier	 old To New
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
cfg	TokenNameIdentifier	 cfg
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
new	TokenNamenew	
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
cfg	TokenNameIdentifier	 cfg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addIndexes	TokenNameIdentifier	 add Indexes
(	TokenNameLPAREN	
sorter	TokenNameIdentifier	 sorter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"IndexSorter: done, "	TokenNameStringLiteral	IndexSorter: done, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
+	TokenNamePLUS	
" total milliseconds"	TokenNameStringLiteral	 total milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
readerMax	TokenNameIdentifier	 reader Max
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocScore	TokenNameIdentifier	 Doc Score
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newToOld	TokenNameIdentifier	 new To Old
=	TokenNameEQUAL	
new	TokenNamenew	
DocScore	TokenNameIdentifier	 Doc Score
[	TokenNameLBRACKET	
readerMax	TokenNameIdentifier	 reader Max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FieldSelector	TokenNameIdentifier	 Field Selector
fSel	TokenNameIdentifier	 f Sel
=	TokenNameEQUAL	
new	TokenNamenew	
MapFieldSelector	TokenNameIdentifier	 Map Field Selector
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
oldDoc	TokenNameIdentifier	 old Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
oldDoc	TokenNameIdentifier	 old Doc
<	TokenNameLESS	
readerMax	TokenNameIdentifier	 reader Max
;	TokenNameSEMICOLON	
oldDoc	TokenNameIdentifier	 old Doc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
oldDoc	TokenNameIdentifier	 old Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
oldDoc	TokenNameIdentifier	 old Doc
,	TokenNameCOMMA	
fSel	TokenNameIdentifier	 f Sel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DocScore	TokenNameIdentifier	 Doc Score
docScore	TokenNameIdentifier	 doc Score
=	TokenNameEQUAL	
new	TokenNamenew	
DocScore	TokenNameIdentifier	 Doc Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docScore	TokenNameIdentifier	 doc Score
.	TokenNameDOT	
oldDoc	TokenNameIdentifier	 old Doc
=	TokenNameEQUAL	
oldDoc	TokenNameIdentifier	 old Doc
;	TokenNameSEMICOLON	
docScore	TokenNameIdentifier	 doc Score
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
newToOld	TokenNameIdentifier	 new To Old
[	TokenNameLBRACKET	
oldDoc	TokenNameIdentifier	 old Doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docScore	TokenNameIdentifier	 doc Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
newToOld	TokenNameIdentifier	 new To Old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldToNew	TokenNameIdentifier	 old To New
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
readerMax	TokenNameIdentifier	 reader Max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
newDoc	TokenNameIdentifier	 new Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
newDoc	TokenNameIdentifier	 new Doc
<	TokenNameLESS	
readerMax	TokenNameIdentifier	 reader Max
;	TokenNameSEMICOLON	
newDoc	TokenNameIdentifier	 new Doc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocScore	TokenNameIdentifier	 Doc Score
docScore	TokenNameIdentifier	 doc Score
=	TokenNameEQUAL	
newToOld	TokenNameIdentifier	 new To Old
[	TokenNameLBRACKET	
newDoc	TokenNameIdentifier	 new Doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
oldToNew	TokenNameIdentifier	 old To New
[	TokenNameLBRACKET	
docScore	TokenNameIdentifier	 doc Score
.	TokenNameDOT	
oldDoc	TokenNameIdentifier	 old Doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newDoc	TokenNameIdentifier	 new Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
oldToNew	TokenNameIdentifier	 old To New
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
usage	TokenNameIdentifier	 usage
=	TokenNameEQUAL	
"IndexSorter <input> <output> <field>"	TokenNameStringLiteral	IndexSorter <input> <output> <field>
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: "	TokenNameStringLiteral	Usage: 
+	TokenNamePLUS	
usage	TokenNameIdentifier	 usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IndexSorter	TokenNameIdentifier	 Index Sorter
sorter	TokenNameIdentifier	 sorter
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSorter	TokenNameIdentifier	 Index Sorter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sorter	TokenNameIdentifier	 sorter
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
"IndexSorter: "	TokenNameStringLiteral	IndexSorter: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
