/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
SelectionListener	TokenNameIdentifier	 Selection Listener
;	TokenNameSEMICOLON	
/** * Interface which allows selection of GraphicsNodes and their contents. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: Selector.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface which allows selection of GraphicsNodes and their contents. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: Selector.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Selector	TokenNameIdentifier	 Selector
extends	TokenNameextends	
GraphicsNodeMouseListener	TokenNameIdentifier	 Graphics Node Mouse Listener
,	TokenNameCOMMA	
GraphicsNodeKeyListener	TokenNameIdentifier	 Graphics Node Key Listener
,	TokenNameCOMMA	
GraphicsNodeChangeListener	TokenNameIdentifier	 Graphics Node Change Listener
{	TokenNameLBRACE	
/** * Get the contents of the current selection buffer. */	TokenNameCOMMENT_JAVADOC	 Get the contents of the current selection buffer. 
Object	TokenNameIdentifier	 Object
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reports whether the current selection contains any objects. */	TokenNameCOMMENT_JAVADOC	 Reports whether the current selection contains any objects. 
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a SelectionListener to this Selector's notification list. * @param l the SelectionListener to add. */	TokenNameCOMMENT_JAVADOC	 Add a SelectionListener to this Selector's notification list. @param l the SelectionListener to add. 
void	TokenNamevoid	
addSelectionListener	TokenNameIdentifier	 add Selection Listener
(	TokenNameLPAREN	
SelectionListener	TokenNameIdentifier	 Selection Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remove a SelectionListener from this Selector's notification list. * @param l the SelectionListener to be removed. */	TokenNameCOMMENT_JAVADOC	 Remove a SelectionListener from this Selector's notification list. @param l the SelectionListener to be removed. 
void	TokenNamevoid	
removeSelectionListener	TokenNameIdentifier	 remove Selection Listener
(	TokenNameLPAREN	
SelectionListener	TokenNameIdentifier	 Selection Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
