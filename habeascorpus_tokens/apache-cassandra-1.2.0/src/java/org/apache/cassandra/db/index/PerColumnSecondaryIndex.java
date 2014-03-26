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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
IColumn	TokenNameIdentifier	 I Column
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
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
/** * Base class for Secondary indexes that implement a unique index per column * */	TokenNameCOMMENT_JAVADOC	 Base class for Secondary indexes that implement a unique index per column 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PerColumnSecondaryIndex	TokenNameIdentifier	 Per Column Secondary Index
extends	TokenNameextends	
SecondaryIndex	TokenNameIdentifier	 Secondary Index
{	TokenNameLBRACE	
/** * Delete a column from the index * * @param rowKey the underlying row key which is indexed * @param col all the column info */	TokenNameCOMMENT_JAVADOC	 Delete a column from the index * @param rowKey the underlying row key which is indexed @param col all the column info 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * insert a column to the index * * @param rowKey the underlying row key which is indexed * @param col all the column info */	TokenNameCOMMENT_JAVADOC	 insert a column to the index * @param rowKey the underlying row key which is indexed @param col all the column info 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * update a column from the index * * @param rowKey the underlying row key which is indexed * @param col all the column info */	TokenNameCOMMENT_JAVADOC	 update a column from the index * @param rowKey the underlying row key which is indexed @param col all the column info 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNameForSystemTable	TokenNameIdentifier	 get Name For System Table
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
column	TokenNameIdentifier	 column
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
MAX_UNSIGNED_SHORT	TokenNameIdentifier	 MAX  UNSIGNED  SHORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
