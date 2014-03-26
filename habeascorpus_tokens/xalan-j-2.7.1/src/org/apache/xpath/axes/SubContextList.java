/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SubContextList.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SubContextList.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
/** * A class that implements this interface is a sub context node list, meaning it * is a node list for a location path step for a predicate. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 A class that implements this interface is a sub context node list, meaning it is a node list for a location path step for a predicate. @xsl.usage advanced 
public	TokenNamepublic	
interface	TokenNameinterface	
SubContextList	TokenNameIdentifier	 Sub Context List
{	TokenNameLBRACE	
/** * Get the number of nodes in the node list, which, in the XSLT 1 based * counting system, is the last index position. * * * @param xctxt The XPath runtime context. * * @return the number of nodes in the node list. */	TokenNameCOMMENT_JAVADOC	 Get the number of nodes in the node list, which, in the XSLT 1 based counting system, is the last index position. * @param xctxt The XPath runtime context. * @return the number of nodes in the node list. 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current sub-context position. * * @param xctxt The XPath runtime context. * * @return The position of the current node in the list. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. * @param xctxt The XPath runtime context. * @return The position of the current node in the list. 
public	TokenNamepublic	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
