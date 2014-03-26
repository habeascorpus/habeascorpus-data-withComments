/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
notifications	TokenNameIdentifier	 notifications
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
OperationType	TokenNameIdentifier	 Operation Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableListChangedNotification	TokenNameIdentifier	 SS Table List Changed Notification
implements	TokenNameimplements	
INotification	TokenNameIdentifier	 I Notification
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
removed	TokenNameIdentifier	 removed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
compactionType	TokenNameIdentifier	 compaction Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SSTableListChangedNotification	TokenNameIdentifier	 SS Table List Changed Notification
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
added	TokenNameIdentifier	 added
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
removed	TokenNameIdentifier	 removed
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
compactionType	TokenNameIdentifier	 compaction Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
removed	TokenNameIdentifier	 removed
=	TokenNameEQUAL	
removed	TokenNameIdentifier	 removed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compactionType	TokenNameIdentifier	 compaction Type
=	TokenNameEQUAL	
compactionType	TokenNameIdentifier	 compaction Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
