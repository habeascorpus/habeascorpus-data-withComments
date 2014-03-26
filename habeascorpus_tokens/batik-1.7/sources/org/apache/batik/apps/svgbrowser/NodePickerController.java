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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Provides the information to control the NodePickerPanel behaviour. * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Provides the information to control the NodePickerPanel behaviour. * @version $Id$ 
public	TokenNamepublic	
interface	TokenNameinterface	
NodePickerController	TokenNameIdentifier	 Node Picker Controller
{	TokenNameLBRACE	
/** * Whether NodePickerPanel is should be editable. */	TokenNameCOMMENT_JAVADOC	 Whether NodePickerPanel is should be editable. 
boolean	TokenNameboolean	
isEditable	TokenNameIdentifier	 is Editable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the given element can be edited with the NodePickerPanel. * * @param el * The given element * @return True if the given element can be edited by a NodePickerPanel */	TokenNameCOMMENT_JAVADOC	 Whether the given element can be edited with the NodePickerPanel. * @param el The given element @return True if the given element can be edited by a NodePickerPanel 
boolean	TokenNameboolean	
canEdit	TokenNameIdentifier	 can Edit
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
