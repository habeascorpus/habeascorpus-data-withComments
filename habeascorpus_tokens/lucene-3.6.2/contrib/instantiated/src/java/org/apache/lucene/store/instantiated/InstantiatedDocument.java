package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
instantiated	TokenNameIdentifier	 instantiated
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A document in the instantiated index object graph, optionally coupled to the vector space view. * * @see org.apache.lucene.document.Document */	TokenNameCOMMENT_JAVADOC	 A document in the instantiated index object graph, optionally coupled to the vector space view. * @see org.apache.lucene.document.Document 
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** this is the unsafe index order document number. */	TokenNameCOMMENT_JAVADOC	 this is the unsafe index order document number. 
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
documentNumber	TokenNameIdentifier	 document Number
;	TokenNameSEMICOLON	
/** this is the term vector space view */	TokenNameCOMMENT_JAVADOC	 this is the term vector space view 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
/*field name*/	TokenNameCOMMENT_BLOCK	field name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>>	TokenNameRIGHT_SHIFT	
vectorSpace	TokenNameIdentifier	 vector Space
;	TokenNameSEMICOLON	
/** * @return position of document in the index. */	TokenNameCOMMENT_JAVADOC	 @return position of document in the index. 
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentNumber	TokenNameIdentifier	 document Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentNumber	TokenNameIdentifier	 document Number
=	TokenNameEQUAL	
documentNumber	TokenNameIdentifier	 document Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
/*field name*/	TokenNameCOMMENT_BLOCK	field name
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>>	TokenNameRIGHT_SHIFT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vectorSpace	TokenNameIdentifier	 vector Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVectorSpace	TokenNameIdentifier	 set Vector Space
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
/*field name*/	TokenNameCOMMENT_BLOCK	field name
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>>	TokenNameRIGHT_SHIFT	
vectorSpace	TokenNameIdentifier	 vector Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
vectorSpace	TokenNameIdentifier	 vector Space
=	TokenNameEQUAL	
vectorSpace	TokenNameIdentifier	 vector Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
