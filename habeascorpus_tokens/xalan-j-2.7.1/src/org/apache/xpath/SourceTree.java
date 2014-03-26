/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SourceTree.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SourceTree.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
/** * This object represents a Source Tree, and any associated * information. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This object represents a Source Tree, and any associated information. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
SourceTree	TokenNameIdentifier	 Source Tree
{	TokenNameLBRACE	
/** * Constructor SourceTree * * * @param root The root of the source tree, which may or may not be a * {@link org.w3c.dom.Document} node. * @param url The URI of the source tree. */	TokenNameCOMMENT_JAVADOC	 Constructor SourceTree * @param root The root of the source tree, which may or may not be a {@link org.w3c.dom.Document} node. @param url The URI of the source tree. 
public	TokenNamepublic	
SourceTree	TokenNameIdentifier	 Source Tree
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_root	TokenNameIdentifier	 m root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
m_url	TokenNameIdentifier	 m url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The URI of the source tree. */	TokenNameCOMMENT_JAVADOC	 The URI of the source tree. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_url	TokenNameIdentifier	 m url
;	TokenNameSEMICOLON	
/** The root of the source tree, which may or may not be a * {@link org.w3c.dom.Document} node. */	TokenNameCOMMENT_JAVADOC	 The root of the source tree, which may or may not be a {@link org.w3c.dom.Document} node. 
public	TokenNamepublic	
int	TokenNameint	
m_root	TokenNameIdentifier	 m root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
