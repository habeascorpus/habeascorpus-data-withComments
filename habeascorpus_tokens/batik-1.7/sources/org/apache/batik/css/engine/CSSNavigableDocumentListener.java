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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * An interface for listeners of CSSNavigableDocument events. The * events parallel the DOM events, but apply to the CSS view of * the tree rather than the actual DOM tree. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: CSSNavigableDocumentListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for listeners of CSSNavigableDocument events. The events parallel the DOM events, but apply to the CSS view of the tree rather than the actual DOM tree. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: CSSNavigableDocumentListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSNavigableDocumentListener	TokenNameIdentifier	 CSS Navigable Document Listener
{	TokenNameLBRACE	
/** * A node has been inserted into the CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 A node has been inserted into the CSSNavigableDocument tree. 
void	TokenNamevoid	
nodeInserted	TokenNameIdentifier	 node Inserted
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A node is about to be removed from the CSSNavigableDocument tree. */	TokenNameCOMMENT_JAVADOC	 A node is about to be removed from the CSSNavigableDocument tree. 
void	TokenNamevoid	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A subtree of the CSSNavigableDocument tree has been modified * in some way. */	TokenNameCOMMENT_JAVADOC	 A subtree of the CSSNavigableDocument tree has been modified in some way. 
void	TokenNamevoid	
subtreeModified	TokenNameIdentifier	 subtree Modified
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
rootOfModifications	TokenNameIdentifier	 root Of Modifications
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Character data in the CSSNavigableDocument tree has been modified. */	TokenNameCOMMENT_JAVADOC	 Character data in the CSSNavigableDocument tree has been modified. 
void	TokenNamevoid	
characterDataModified	TokenNameIdentifier	 character Data Modified
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An attribute has changed in the CSSNavigableDocument. */	TokenNameCOMMENT_JAVADOC	 An attribute has changed in the CSSNavigableDocument. 
void	TokenNamevoid	
attrModified	TokenNameIdentifier	 attr Modified
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
attrChange	TokenNameIdentifier	 attr Change
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevValue	TokenNameIdentifier	 prev Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The text of the override style declaration for this element has been * modified. */	TokenNameCOMMENT_JAVADOC	 The text of the override style declaration for this element has been modified. 
void	TokenNamevoid	
overrideStyleTextChanged	TokenNameIdentifier	 override Style Text Changed
(	TokenNameLPAREN	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A property in the override style declaration has been removed. */	TokenNameCOMMENT_JAVADOC	 A property in the override style declaration has been removed. 
void	TokenNamevoid	
overrideStylePropertyRemoved	TokenNameIdentifier	 override Style Property Removed
(	TokenNameLPAREN	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A property in the override style declaration has been changed. */	TokenNameCOMMENT_JAVADOC	 A property in the override style declaration has been changed. 
void	TokenNamevoid	
overrideStylePropertyChanged	TokenNameIdentifier	 override Style Property Changed
(	TokenNameLPAREN	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prio	TokenNameIdentifier	 prio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
