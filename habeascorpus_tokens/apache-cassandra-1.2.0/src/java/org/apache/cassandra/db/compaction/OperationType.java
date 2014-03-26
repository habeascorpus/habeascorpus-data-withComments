/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
OperationType	TokenNameIdentifier	 Operation Type
{	TokenNameLBRACE	
COMPACTION	TokenNameIdentifier	 COMPACTION
(	TokenNameLPAREN	
"Compaction"	TokenNameStringLiteral	Compaction
)	TokenNameRPAREN	
,	TokenNameCOMMA	
VALIDATION	TokenNameIdentifier	 VALIDATION
(	TokenNameLPAREN	
"Validation"	TokenNameStringLiteral	Validation
)	TokenNameRPAREN	
,	TokenNameCOMMA	
KEY_CACHE_SAVE	TokenNameIdentifier	 KEY  CACHE  SAVE
(	TokenNameLPAREN	
"Key cache save"	TokenNameStringLiteral	Key cache save
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ROW_CACHE_SAVE	TokenNameIdentifier	 ROW  CACHE  SAVE
(	TokenNameLPAREN	
"Row cache save"	TokenNameStringLiteral	Row cache save
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CLEANUP	TokenNameIdentifier	 CLEANUP
(	TokenNameLPAREN	
"Cleanup"	TokenNameStringLiteral	Cleanup
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SCRUB	TokenNameIdentifier	 SCRUB
(	TokenNameLPAREN	
"Scrub"	TokenNameStringLiteral	Scrub
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UPGRADE_SSTABLES	TokenNameIdentifier	 UPGRADE  SSTABLES
(	TokenNameLPAREN	
"Upgrade sstables"	TokenNameStringLiteral	Upgrade sstables
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INDEX_BUILD	TokenNameIdentifier	 INDEX  BUILD
(	TokenNameLPAREN	
"Secondary index build"	TokenNameStringLiteral	Secondary index build
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/** Compaction for tombstone removal */	TokenNameCOMMENT_JAVADOC	 Compaction for tombstone removal 
TOMBSTONE_COMPACTION	TokenNameIdentifier	 TOMBSTONE  COMPACTION
(	TokenNameLPAREN	
"Tombstone Compaction"	TokenNameStringLiteral	Tombstone Compaction
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UNKNOWN	TokenNameIdentifier	 UNKNOWN
(	TokenNameLPAREN	
"Unkown compaction type"	TokenNameStringLiteral	Unkown compaction type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
OperationType	TokenNameIdentifier	 Operation Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
