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
index	TokenNameIdentifier	 index
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
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
ColumnFamily	TokenNameIdentifier	 Column Family
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
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
Column	TokenNameIdentifier	 Column
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * Base class for Secondary indexes that implement a unique index per row */	TokenNameCOMMENT_JAVADOC	 Base class for Secondary indexes that implement a unique index per row 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PerRowSecondaryIndex	TokenNameIdentifier	 Per Row Secondary Index
extends	TokenNameextends	
SecondaryIndex	TokenNameIdentifier	 Secondary Index
{	TokenNameLBRACE	
/** * Index the given row for new index creation. @param cf will represent the entire row. * * @param rowKey the row key * @param cf the current rows data */	TokenNameCOMMENT_JAVADOC	 Index the given row for new index creation. @param cf will represent the entire row. * @param rowKey the row key @param cf the current rows data 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Index the given row * * @param rowKey the row key */	TokenNameCOMMENT_JAVADOC	 Index the given row * @param rowKey the row key 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * cleans up deleted columns from cassandra cleanup compaction * * @param key */	TokenNameCOMMENT_JAVADOC	 cleans up deleted columns from cassandra cleanup compaction * @param key 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNameForSystemTable	TokenNameIdentifier	 get Name For System Table
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
Column	TokenNameIdentifier	 Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
