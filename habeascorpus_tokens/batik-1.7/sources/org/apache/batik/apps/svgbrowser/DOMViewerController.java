/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
Overlay	TokenNameIdentifier	 Overlay
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * Provides the information needed for the DOMViewer to show and edit the * document. * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Provides the information needed for the DOMViewer to show and edit the document. * @version $Id$ 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMViewerController	TokenNameIdentifier	 DOM Viewer Controller
{	TokenNameLBRACE	
/** * Performs the document update. * * @param r The runnable that contains the update */	TokenNameCOMMENT_JAVADOC	 Performs the document update. * @param r The runnable that contains the update 
void	TokenNamevoid	
performUpdate	TokenNameIdentifier	 perform Update
(	TokenNameLPAREN	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates the ElementSelectionManager to manage the selection overlay on * the canvas. * * @return ElementSelectionManager */	TokenNameCOMMENT_JAVADOC	 Creates the ElementSelectionManager to manage the selection overlay on the canvas. * @return ElementSelectionManager 
ElementOverlayManager	TokenNameIdentifier	 Element Overlay Manager
createSelectionManager	TokenNameIdentifier	 create Selection Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the given selection overlay from the canvas. * * @param selectionOverlay * The given selection overlay */	TokenNameCOMMENT_JAVADOC	 Removes the given selection overlay from the canvas. * @param selectionOverlay The given selection overlay 
void	TokenNamevoid	
removeSelectionOverlay	TokenNameIdentifier	 remove Selection Overlay
(	TokenNameLPAREN	
Overlay	TokenNameIdentifier	 Overlay
selectionOverlay	TokenNameIdentifier	 selection Overlay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the document for the DOMViewer to show. * * @return the document */	TokenNameCOMMENT_JAVADOC	 Gets the document for the DOMViewer to show. * @return the document 
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Selects the given node in the DOMViewer's document tree. * * @param node * The node to select */	TokenNameCOMMENT_JAVADOC	 Selects the given node in the DOMViewer's document tree. * @param node The node to select 
void	TokenNamevoid	
selectNode	TokenNameIdentifier	 select Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Checks whether the DOMViewer should be allowed to edit the document. * * @return True for non static documents, when UpdateManager is available */	TokenNameCOMMENT_JAVADOC	 Checks whether the DOMViewer should be allowed to edit the document. * @return True for non static documents, when UpdateManager is available 
boolean	TokenNameboolean	
canEdit	TokenNameIdentifier	 can Edit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
