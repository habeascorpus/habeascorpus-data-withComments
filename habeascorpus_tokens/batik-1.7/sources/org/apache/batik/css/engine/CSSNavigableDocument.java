/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
/** * An interface for documents that have CSSNavigableNodes. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: CSSNavigableDocument.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for documents that have CSSNavigableNodes. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: CSSNavigableDocument.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSNavigableDocument	TokenNameIdentifier	 CSS Navigable Document
{	TokenNameLBRACE	
/** * Adds an event listener for mutations on the * CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 Adds an event listener for mutations on the CSSNavigableDocument tree. 
void	TokenNamevoid	
addCSSNavigableDocumentListener	TokenNameIdentifier	 add CSS Navigable Document Listener
(	TokenNameLPAREN	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes an event listener for mutations on the * CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 Removes an event listener for mutations on the CSSNavigableDocument tree. 
void	TokenNamevoid	
removeCSSNavigableDocumentListener	TokenNameIdentifier	 remove CSS Navigable Document Listener
(	TokenNameLPAREN	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
