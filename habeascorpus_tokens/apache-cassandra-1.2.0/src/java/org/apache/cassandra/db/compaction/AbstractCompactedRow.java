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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
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
ColumnStats	TokenNameIdentifier	 Column Stats
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
DeletionInfo	TokenNameIdentifier	 Deletion Info
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
ColumnIndex	TokenNameIdentifier	 Column Index
;	TokenNameSEMICOLON	
/** * a CompactedRow is an object that takes a bunch of rows (keys + columnfamilies) * and can write a compacted version of those rows to an output stream. It does * NOT necessarily require creating a merged CF object in memory. */	TokenNameCOMMENT_JAVADOC	 a CompactedRow is an object that takes a bunch of rows (keys + columnfamilies) and can write a compacted version of those rows to an output stream. It does NOT necessarily require creating a merged CF object in memory. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * write the row (size + column index + filter + column data, but NOT row key) to @param out. * It is an error to call this if isEmpty is false. (Because the key is appended first, * so we'd have an incomplete row written.) * * write() may change internal state; it is NOT valid to call write() or update() a second time. */	TokenNameCOMMENT_JAVADOC	 write the row (size + column index + filter + column data, but NOT row key) to @param out. It is an error to call this if isEmpty is false. (Because the key is appended first, so we'd have an incomplete row written.) * write() may change internal state; it is NOT valid to call write() or update() a second time. 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * update @param digest with the data bytes of the row (not including row key or row size). * May be called even if empty. * * update() may change internal state; it is NOT valid to call write() or update() a second time. */	TokenNameCOMMENT_JAVADOC	 update @param digest with the data bytes of the row (not including row key or row size). May be called even if empty. * update() may change internal state; it is NOT valid to call write() or update() a second time. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
MessageDigest	TokenNameIdentifier	 Message Digest
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if there are no columns in the row AND there are no row-level tombstones to be preserved */	TokenNameCOMMENT_JAVADOC	 @return true if there are no columns in the row AND there are no row-level tombstones to be preserved 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return aggregate information about the columns in this row. Some fields may * contain default values if computing them value would require extra effort we're not willing to make. */	TokenNameCOMMENT_JAVADOC	 @return aggregate information about the columns in this row. Some fields may contain default values if computing them value would require extra effort we're not willing to make. 
public	TokenNamepublic	
abstract	TokenNameabstract	
ColumnStats	TokenNameIdentifier	 Column Stats
columnStats	TokenNameIdentifier	 column Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the compacted row deletion infos. */	TokenNameCOMMENT_JAVADOC	 @return the compacted row deletion infos. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DeletionInfo	TokenNameIdentifier	 Deletion Info
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the column index for this row. */	TokenNameCOMMENT_JAVADOC	 @return the column index for this row. 
public	TokenNamepublic	
abstract	TokenNameabstract	
ColumnIndex	TokenNameIdentifier	 Column Index
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
