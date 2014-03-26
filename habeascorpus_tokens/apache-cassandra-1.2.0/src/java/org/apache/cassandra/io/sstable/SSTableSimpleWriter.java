/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
IPartitioner	TokenNameIdentifier	 I Partitioner
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
FSError	TokenNameIdentifier	 FS Error
;	TokenNameSEMICOLON	
/** * A SSTable writer that assumes rows are in (partitioner) sorted order. * Contrarily to SSTableSimpleUnsortedWriter, this writer does not buffer * anything into memory, however it assumes that row are added in sorted order * (an exception will be thrown otherwise), which for the RandomPartitioner * means that rows should be added by increasing md5 of the row key. This is * rarely possible and SSTableSimpleUnsortedWriter should most of the time be * prefered. * * @see AbstractSSTableSimpleWriter */	TokenNameCOMMENT_JAVADOC	 A SSTable writer that assumes rows are in (partitioner) sorted order. Contrarily to SSTableSimpleUnsortedWriter, this writer does not buffer anything into memory, however it assumes that row are added in sorted order (an exception will be thrown otherwise), which for the RandomPartitioner means that rows should be added by increasing md5 of the row key. This is rarely possible and SSTableSimpleUnsortedWriter should most of the time be prefered. * @see AbstractSSTableSimpleWriter 
public	TokenNamepublic	
class	TokenNameclass	
SSTableSimpleWriter	TokenNameIdentifier	 SS Table Simple Writer
extends	TokenNameextends	
AbstractSSTableSimpleWriter	TokenNameIdentifier	 Abstract SS Table Simple Writer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * Create a new writer. * @param directory the directory where to write the sstable * @param partitioner the partitioner * @param keyspace the keyspace name * @param columnFamily the column family name * @param comparator the column family comparator * @param subComparator the column family subComparator or null if not a Super column family. */	TokenNameCOMMENT_JAVADOC	 Create a new writer. @param directory the directory where to write the sstable @param partitioner the partitioner @param keyspace the keyspace name @param columnFamily the column family name @param comparator the column family comparator @param subComparator the column family subComparator or null if not a Super column family. 
public	TokenNamepublic	
SSTableSimpleWriter	TokenNameIdentifier	 SS Table Simple Writer
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
subComparator	TokenNameIdentifier	 sub Comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
new	TokenNamenew	
CFMetaData	TokenNameIdentifier	 CF Meta Data
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
subComparator	TokenNameIdentifier	 sub Comparator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ColumnFamilyType	TokenNameIdentifier	 Column Family Type
.	TokenNameDOT	
Standard	TokenNameIdentifier	 Standard
:	TokenNameCOLON	
ColumnFamilyType	TokenNameIdentifier	 Column Family Type
.	TokenNameDOT	
Super	TokenNameIdentifier	 Super
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
subComparator	TokenNameIdentifier	 sub Comparator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableSimpleWriter	TokenNameIdentifier	 SS Table Simple Writer
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
writeRow	TokenNameIdentifier	 write Row
(	TokenNameLPAREN	
currentKey	TokenNameIdentifier	 current Key
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
closeAndOpenReader	TokenNameIdentifier	 close And Open Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FSError	TokenNameIdentifier	 FS Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
writeRow	TokenNameIdentifier	 write Row
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ColumnFamily	TokenNameIdentifier	 Column Family
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
TreeMapBackedSortedColumns	TokenNameIdentifier	 Tree Map Backed Sorted Columns
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
