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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
class	TokenNameclass	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
extends	TokenNameextends	
DirectoryReader	TokenNameIdentifier	 Directory Reader
{	TokenNameLBRACE	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldReaders	TokenNameIdentifier	 old Readers
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldStarts	TokenNameIdentifier	 old Starts
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
oldNormsCache	TokenNameIdentifier	 old Norms Cache
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
oldReaders	TokenNameIdentifier	 old Readers
,	TokenNameCOMMA	
oldStarts	TokenNameIdentifier	 old Starts
,	TokenNameCOMMA	
oldNormsCache	TokenNameIdentifier	 old Norms Cache
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
doClone	TokenNameIdentifier	 do Clone
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ReadOnlyDirectoryReader	TokenNameIdentifier	 Read Only Directory Reader
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
,	TokenNameCOMMA	
boolean	TokenNameboolean	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
termInfosIndexDivisor	TokenNameIdentifier	 term Infos Index Divisor
,	TokenNameCOMMA	
applyAllDeletes	TokenNameIdentifier	 apply All Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
acquireWriteLock	TokenNameIdentifier	 acquire Write Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReadOnlySegmentReader	TokenNameIdentifier	 Read Only Segment Reader
.	TokenNameDOT	
noWrite	TokenNameIdentifier	 no Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
