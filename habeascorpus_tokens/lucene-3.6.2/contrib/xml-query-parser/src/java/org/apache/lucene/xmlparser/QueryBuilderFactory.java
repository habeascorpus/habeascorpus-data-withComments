/* * Created on 25-Jan-2006 */	TokenNameCOMMENT_BLOCK	 Created on 25-Jan-2006 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
QueryBuilderFactory	TokenNameIdentifier	 Query Builder Factory
implements	TokenNameimplements	
QueryBuilder	TokenNameIdentifier	 Query Builder
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QueryBuilder	TokenNameIdentifier	 Query Builder
>	TokenNameGREATER	
builders	TokenNameIdentifier	 builders
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QueryBuilder	TokenNameIdentifier	 Query Builder
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
QueryBuilder	TokenNameIdentifier	 Query Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"No QueryObjectBuilder defined for node "	TokenNameStringLiteral	No QueryObjectBuilder defined for node 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBuilder	TokenNameIdentifier	 add Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
QueryBuilder	TokenNameIdentifier	 Query Builder
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryBuilder	TokenNameIdentifier	 Query Builder
getQueryBuilder	TokenNameIdentifier	 get Query Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
builders	TokenNameIdentifier	 builders
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
