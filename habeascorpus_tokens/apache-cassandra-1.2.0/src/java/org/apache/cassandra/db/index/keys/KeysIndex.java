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
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
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
Set	TokenNameIdentifier	 Set
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
ColumnDefinition	TokenNameIdentifier	 Column Definition
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
AbstractSimplePerColumnSecondaryIndex	TokenNameIdentifier	 Abstract Simple Per Column Secondary Index
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
/** * Implements a secondary index for a column family using a second column family * in which the row keys are indexed values, and column names are base row keys. */	TokenNameCOMMENT_JAVADOC	 Implements a secondary index for a column family using a second column family in which the row keys are indexed values, and column names are base row keys. 
public	TokenNamepublic	
class	TokenNameclass	
KeysIndex	TokenNameIdentifier	 Keys Index
extends	TokenNameextends	
AbstractSimplePerColumnSecondaryIndex	TokenNameIdentifier	 Abstract Simple Per Column Secondary Index
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing specific 	TokenNameCOMMENT_LINE	Nothing specific 
}	TokenNameRBRACE	
protected	TokenNameprotected	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
makeIndexColumnName	TokenNameIdentifier	 make Index Column Name
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rowKey	TokenNameIdentifier	 row Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
createSecondaryIndexSearcher	TokenNameIdentifier	 create Secondary Index Searcher
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeysSearcher	TokenNameIdentifier	 Keys Searcher
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateOptions	TokenNameIdentifier	 validate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
// no options used 	TokenNameCOMMENT_LINE	no options used 
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
getExpressionComparator	TokenNameIdentifier	 get Expression Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
