package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * {@link ExtensionQuery} holds all query components extracted from the original * query string like the query field and the extension query string. * * @see Extensions * @see ExtendableQueryParser * @see ParserExtension */	TokenNameCOMMENT_JAVADOC	 {@link ExtensionQuery} holds all query components extracted from the original query string like the query field and the extension query string. * @see Extensions @see ExtendableQueryParser @see ParserExtension 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionQuery	TokenNameIdentifier	 Extension Query
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
rawQueryString	TokenNameIdentifier	 raw Query String
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
QueryParser	TokenNameIdentifier	 Query Parser
topLevelParser	TokenNameIdentifier	 top Level Parser
;	TokenNameSEMICOLON	
/** * Creates a new {@link ExtensionQuery} * * @param field * the query field * @param rawQueryString * the raw extension query string */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link ExtensionQuery} * @param field the query field @param rawQueryString the raw extension query string 
public	TokenNamepublic	
ExtensionQuery	TokenNameIdentifier	 Extension Query
(	TokenNameLPAREN	
QueryParser	TokenNameIdentifier	 Query Parser
topLevelParser	TokenNameIdentifier	 top Level Parser
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawQueryString	TokenNameIdentifier	 raw Query String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rawQueryString	TokenNameIdentifier	 raw Query String
=	TokenNameEQUAL	
rawQueryString	TokenNameIdentifier	 raw Query String
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
topLevelParser	TokenNameIdentifier	 top Level Parser
=	TokenNameEQUAL	
topLevelParser	TokenNameIdentifier	 top Level Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the query field * * @return the query field */	TokenNameCOMMENT_JAVADOC	 Returns the query field * @return the query field 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the raw extension query string * * @return the raw extension query string */	TokenNameCOMMENT_JAVADOC	 Returns the raw extension query string * @return the raw extension query string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRawQueryString	TokenNameIdentifier	 get Raw Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawQueryString	TokenNameIdentifier	 raw Query String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the top level parser which created this {@link ExtensionQuery} * @return the top level parser which created this {@link ExtensionQuery} */	TokenNameCOMMENT_JAVADOC	 Returns the top level parser which created this {@link ExtensionQuery} @return the top level parser which created this {@link ExtensionQuery} 
public	TokenNamepublic	
QueryParser	TokenNameIdentifier	 Query Parser
getTopLevelParser	TokenNameIdentifier	 get Top Level Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
topLevelParser	TokenNameIdentifier	 top Level Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
