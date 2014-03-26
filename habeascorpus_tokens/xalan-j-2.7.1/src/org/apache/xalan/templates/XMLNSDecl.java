/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XMLNSDecl.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XMLNSDecl.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
/** * Represents an xmlns declaration */	TokenNameCOMMENT_JAVADOC	 Represents an xmlns declaration 
public	TokenNamepublic	
class	TokenNameclass	
XMLNSDecl	TokenNameIdentifier	 XMLNS Decl
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
// 20001009 jkess 	TokenNameCOMMENT_LINE	20001009 jkess 
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6710237366877605097L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor XMLNSDecl * * @param prefix non-null reference to prefix, using "" for default namespace. * @param uri non-null reference to namespace URI. * @param isExcluded true if this namespace declaration should normally be excluded. */	TokenNameCOMMENT_JAVADOC	 Constructor XMLNSDecl * @param prefix non-null reference to prefix, using "" for default namespace. @param uri non-null reference to namespace URI. @param isExcluded true if this namespace declaration should normally be excluded. 
public	TokenNamepublic	
XMLNSDecl	TokenNameIdentifier	 XMLNS Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isExcluded	TokenNameIdentifier	 is Excluded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefix	TokenNameIdentifier	 m prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
m_uri	TokenNameIdentifier	 m uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
m_isExcluded	TokenNameIdentifier	 m is Excluded
=	TokenNameEQUAL	
isExcluded	TokenNameIdentifier	 is Excluded
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** non-null reference to prefix, using "" for default namespace. * @serial */	TokenNameCOMMENT_JAVADOC	 non-null reference to prefix, using "" for default namespace. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
/** * Return the prefix. * @return The prefix that is associated with this URI, or null * if the XMLNSDecl is declaring the default namespace. */	TokenNameCOMMENT_JAVADOC	 Return the prefix. @return The prefix that is associated with this URI, or null if the XMLNSDecl is declaring the default namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** non-null reference to namespace URI. * @serial */	TokenNameCOMMENT_JAVADOC	 non-null reference to namespace URI. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
/** * Return the URI. * @return The URI that is associated with this declaration. */	TokenNameCOMMENT_JAVADOC	 Return the URI. @return The URI that is associated with this declaration. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** true if this namespace declaration should normally be excluded. * @serial */	TokenNameCOMMENT_JAVADOC	 true if this namespace declaration should normally be excluded. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isExcluded	TokenNameIdentifier	 m is Excluded
;	TokenNameSEMICOLON	
/** * Tell if this declaration should be excluded from the * result namespace. * * @return true if this namespace declaration should normally be excluded. */	TokenNameCOMMENT_JAVADOC	 Tell if this declaration should be excluded from the result namespace. * @return true if this namespace declaration should normally be excluded. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsExcluded	TokenNameIdentifier	 get Is Excluded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isExcluded	TokenNameIdentifier	 m is Excluded
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
