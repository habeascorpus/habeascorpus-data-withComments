/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A simple container that simplify passing parameters for collections methods. */	TokenNameCOMMENT_JAVADOC	 A simple container that simplify passing parameters for collections methods. 
public	TokenNamepublic	
class	TokenNameclass	
UpdateParameters	TokenNameIdentifier	 Update Parameters
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
ttl	TokenNameIdentifier	 ttl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UpdateParameters	TokenNameIdentifier	 Update Parameters
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
int	TokenNameint	
ttl	TokenNameIdentifier	 ttl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
variables	TokenNameIdentifier	 variables
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ttl	TokenNameIdentifier	 ttl
=	TokenNameEQUAL	
ttl	TokenNameIdentifier	 ttl
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Column	TokenNameIdentifier	 Column
makeColumn	TokenNameIdentifier	 make Column
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ttl	TokenNameIdentifier	 ttl
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
ExpiringColumn	TokenNameIdentifier	 Expiring Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
ttl	TokenNameIdentifier	 ttl
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Column	TokenNameIdentifier	 Column
makeTombstone	TokenNameIdentifier	 make Tombstone
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeletedColumn	TokenNameIdentifier	 Deleted Column
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
makeRangeTombstone	TokenNameIdentifier	 make Range Tombstone
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
makeTombstoneForOverwrite	TokenNameIdentifier	 make Tombstone For Overwrite
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
localDeletionTime	TokenNameIdentifier	 local Deletion Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
