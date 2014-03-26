/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
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
/** * <p>This interface describes the properties of entities--their * physical location and their name.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: XMLEntityDescription.java 446761 2006-09-15 21:59:29Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This interface describes the properties of entities--their physical location and their name.</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: XMLEntityDescription.java 446761 2006-09-15 21:59:29Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
extends	TokenNameextends	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
{	TokenNameLBRACE	
/** * Sets the name of the entity. * * @param name the name of the entity */	TokenNameCOMMENT_JAVADOC	 Sets the name of the entity. * @param name the name of the entity 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityName	TokenNameIdentifier	 set Entity Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the name of the entity. * * @return the name of the entity */	TokenNameCOMMENT_JAVADOC	 Returns the name of the entity. * @return the name of the entity 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEntityName	TokenNameIdentifier	 get Entity Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XMLEntityDescription 	TokenNameCOMMENT_LINE	XMLEntityDescription 
