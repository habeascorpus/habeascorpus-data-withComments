/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ResultNameSpace.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ResultNameSpace.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
/** * A representation of a result namespace. One of these will * be pushed on the result tree namespace stack for each * result tree element. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A representation of a result namespace. One of these will be pushed on the result tree namespace stack for each result tree element. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ResultNameSpace	TokenNameIdentifier	 Result Name Space
{	TokenNameLBRACE	
/** Pointer to next ResultNameSpace */	TokenNameCOMMENT_JAVADOC	 Pointer to next ResultNameSpace 
public	TokenNamepublic	
ResultNameSpace	TokenNameIdentifier	 Result Name Space
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Prefix of namespace */	TokenNameCOMMENT_JAVADOC	 Prefix of namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
/** Namespace URI */	TokenNameCOMMENT_JAVADOC	 Namespace URI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
// if null, then Element namespace is empty. 	TokenNameCOMMENT_LINE	if null, then Element namespace is empty. 
/** * Construct a namespace for placement on the * result tree namespace stack. * * @param prefix of result namespace * @param uri URI of result namespace */	TokenNameCOMMENT_JAVADOC	 Construct a namespace for placement on the result tree namespace stack. * @param prefix of result namespace @param uri URI of result namespace 
public	TokenNamepublic	
ResultNameSpace	TokenNameIdentifier	 Result Name Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
