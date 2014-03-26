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
PrintStream	TokenNameIdentifier	 Print Stream
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
Directory	TokenNameIdentifier	 Directory
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
BitVector	TokenNameIdentifier	 Bit Vector
;	TokenNameSEMICOLON	
/** * Holder class for common parameters used during write. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Holder class for common parameters used during write. @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segmentName	TokenNameIdentifier	 segment Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasVectors	TokenNameIdentifier	 has Vectors
;	TokenNameSEMICOLON	
// Deletes to apply while we are flushing the segment. A 	TokenNameCOMMENT_LINE	Deletes to apply while we are flushing the segment. A 
// Term is enrolled in here if it was deleted at one 	TokenNameCOMMENT_LINE	Term is enrolled in here if it was deleted at one 
// point, and it's mapped to the docIDUpto, meaning any 	TokenNameCOMMENT_LINE	point, and it's mapped to the docIDUpto, meaning any 
// docID < docIDUpto containing this term should be 	TokenNameCOMMENT_LINE	docID < docIDUpto containing this term should be 
// deleted. 	TokenNameCOMMENT_LINE	deleted. 
public	TokenNamepublic	
final	TokenNamefinal	
BufferedDeletes	TokenNameIdentifier	 Buffered Deletes
segDeletes	TokenNameIdentifier	 seg Deletes
;	TokenNameSEMICOLON	
// Lazily created: 	TokenNameCOMMENT_LINE	Lazily created: 
public	TokenNamepublic	
BitVector	TokenNameIdentifier	 Bit Vector
deletedDocs	TokenNameIdentifier	 deleted Docs
;	TokenNameSEMICOLON	
/** Expert: The fraction of terms in the "dictionary" which should be stored * in RAM. Smaller values use more memory, but make searching slightly * faster, while larger values use less memory and make searching slightly * slower. Searching is typically not dominated by dictionary lookup, so * tweaking this is rarely useful.*/	TokenNameCOMMENT_JAVADOC	 Expert: The fraction of terms in the "dictionary" which should be stored in RAM. Smaller values use more memory, but make searching slightly faster, while larger values use less memory and make searching slightly slower. Searching is typically not dominated by dictionary lookup, so tweaking this is rarely useful.
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
termIndexInterval	TokenNameIdentifier	 term Index Interval
;	TokenNameSEMICOLON	
/** Expert: The fraction of TermDocs entries stored in skip tables, * used to accelerate {@link TermDocs#skipTo(int)}. Larger values result in * smaller indexes, greater acceleration, but fewer accelerable cases, while * smaller values result in bigger indexes, less acceleration and more * accelerable cases. More detailed experiments would be useful here. */	TokenNameCOMMENT_JAVADOC	 Expert: The fraction of TermDocs entries stored in skip tables, used to accelerate {@link TermDocs#skipTo(int)}. Larger values result in smaller indexes, greater acceleration, but fewer accelerable cases, while smaller values result in bigger indexes, less acceleration and more accelerable cases. More detailed experiments would be useful here. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Expert: The maximum number of skip levels. Smaller values result in * slightly smaller indexes, but slower skipping in big posting lists. */	TokenNameCOMMENT_JAVADOC	 Expert: The maximum number of skip levels. Smaller values result in slightly smaller indexes, but slower skipping in big posting lists. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segmentName	TokenNameIdentifier	 segment Name
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
,	TokenNameCOMMA	
int	TokenNameint	
termIndexInterval	TokenNameIdentifier	 term Index Interval
,	TokenNameCOMMA	
BufferedDeletes	TokenNameIdentifier	 Buffered Deletes
segDeletes	TokenNameIdentifier	 seg Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segDeletes	TokenNameIdentifier	 seg Deletes
=	TokenNameEQUAL	
segDeletes	TokenNameIdentifier	 seg Deletes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmentName	TokenNameIdentifier	 segment Name
=	TokenNameEQUAL	
segmentName	TokenNameIdentifier	 segment Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termIndexInterval	TokenNameIdentifier	 term Index Interval
=	TokenNameEQUAL	
termIndexInterval	TokenNameIdentifier	 term Index Interval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
