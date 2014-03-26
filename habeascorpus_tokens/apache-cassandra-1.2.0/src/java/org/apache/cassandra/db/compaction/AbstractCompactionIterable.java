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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCompactionIterable	TokenNameIdentifier	 Abstract Compaction Iterable
extends	TokenNameextends	
CompactionInfo	TokenNameIdentifier	 Compaction Info
.	TokenNameDOT	
Holder	TokenNameIdentifier	 Holder
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
long	TokenNamelong	
totalBytes	TokenNameIdentifier	 total Bytes
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
volatile	TokenNamevolatile	
long	TokenNamelong	
bytesRead	TokenNameIdentifier	 bytes Read
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
scanners	TokenNameIdentifier	 scanners
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractCompactionIterable	TokenNameIdentifier	 Abstract Compaction Iterable
(	TokenNameLPAREN	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
scanners	TokenNameIdentifier	 scanners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
controller	TokenNameIdentifier	 controller
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scanners	TokenNameIdentifier	 scanners
=	TokenNameEQUAL	
scanners	TokenNameIdentifier	 scanners
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytesRead	TokenNameIdentifier	 bytes Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
scanner	TokenNameIdentifier	 scanner
:	TokenNameCOLON	
scanners	TokenNameIdentifier	 scanners
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
+=	TokenNamePLUS_EQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getLengthInBytes	TokenNameIdentifier	 get Length In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalBytes	TokenNameIdentifier	 total Bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactionInfo	TokenNameIdentifier	 Compaction Info
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompactionInfo	TokenNameIdentifier	 Compaction Info
(	TokenNameLPAREN	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
cfs	TokenNameIdentifier	 cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
bytesRead	TokenNameIdentifier	 bytes Read
,	TokenNameCOMMA	
totalBytes	TokenNameIdentifier	 total Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
