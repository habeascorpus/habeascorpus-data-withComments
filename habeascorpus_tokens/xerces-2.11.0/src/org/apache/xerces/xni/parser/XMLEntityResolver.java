/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * This interface is used to resolve external parsed entities. The * application can register an object that implements this interface * with the parser configuration in order to intercept entities and * resolve them explicitly. If the registered entity resolver cannot * resolve the entity, it should return <code>null</code> so that the * parser will try to resolve the entity using a default mechanism. * * @see XMLParserConfiguration * * @author Andy Clark, IBM * * @version $Id: XMLEntityResolver.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This interface is used to resolve external parsed entities. The application can register an object that implements this interface with the parser configuration in order to intercept entities and resolve them explicitly. If the registered entity resolver cannot resolve the entity, it should return <code>null</code> so that the parser will try to resolve the entity using a default mechanism. * @see XMLParserConfiguration * @author Andy Clark, IBM * @version $Id: XMLEntityResolver.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLEntityResolver methods 	TokenNameCOMMENT_LINE	XMLEntityResolver methods 
// 	TokenNameCOMMENT_LINE	 
/** * Resolves an external parsed entity. If the entity cannot be * resolved, this method should return null. * * @param resourceIdentifier location of the XML resource to resolve * * @throws XNIException Thrown on general error. * @throws IOException Thrown if resolved entity stream cannot be * opened or some other i/o error occurs. * @see org.apache.xerces.xni.XMLResourceIdentifier */	TokenNameCOMMENT_JAVADOC	 Resolves an external parsed entity. If the entity cannot be resolved, this method should return null. * @param resourceIdentifier location of the XML resource to resolve * @throws XNIException Thrown on general error. @throws IOException Thrown if resolved entity stream cannot be opened or some other i/o error occurs. @see org.apache.xerces.xni.XMLResourceIdentifier 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLEntityResolver 	TokenNameCOMMENT_LINE	interface XMLEntityResolver 
