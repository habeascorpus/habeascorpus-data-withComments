/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
/** A <code>CREATE INDEX</code> statement parsed from a CQL query. */	TokenNameCOMMENT_JAVADOC	 A <code>CREATE INDEX</code> statement parsed from a CQL query. 
public	TokenNamepublic	
class	TokenNameclass	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
indexName	TokenNameIdentifier	 index Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CreateIndexStatement	TokenNameIdentifier	 Create Index Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
indexName	TokenNameIdentifier	 index Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexName	TokenNameIdentifier	 index Name
=	TokenNameEQUAL	
indexName	TokenNameIdentifier	 index Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Column family namespace. */	TokenNameCOMMENT_JAVADOC	 Column family namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Column name to index. */	TokenNameCOMMENT_JAVADOC	 Column name to index. 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getColumnName	TokenNameIdentifier	 get Column Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Index name (or null). */	TokenNameCOMMENT_JAVADOC	 Index name (or null). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIndexName	TokenNameIdentifier	 get Index Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexName	TokenNameIdentifier	 index Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
