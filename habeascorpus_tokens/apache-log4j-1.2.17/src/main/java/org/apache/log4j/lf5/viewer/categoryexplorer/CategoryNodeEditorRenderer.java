/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
categoryexplorer	TokenNameIdentifier	 categoryexplorer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JCheckBox	TokenNameIdentifier	 J Check Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTree	TokenNameIdentifier	 J Tree
;	TokenNameSEMICOLON	
/** * CategoryNodeEditorRenderer * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 CategoryNodeEditorRenderer * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryNodeEditorRenderer	TokenNameIdentifier	 Category Node Editor Renderer
extends	TokenNameextends	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6094804684259929574L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
getTreeCellRendererComponent	TokenNameIdentifier	 get Tree Cell Renderer Component
(	TokenNameLPAREN	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
,	TokenNameCOMMA	
boolean	TokenNameboolean	
expanded	TokenNameIdentifier	 expanded
,	TokenNameCOMMA	
boolean	TokenNameboolean	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasFocus	TokenNameIdentifier	 has Focus
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Component	TokenNameIdentifier	 Component
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getTreeCellRendererComponent	TokenNameIdentifier	 get Tree Cell Renderer Component
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
selected	TokenNameIdentifier	 selected
,	TokenNameCOMMA	
expanded	TokenNameIdentifier	 expanded
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
hasFocus	TokenNameIdentifier	 has Focus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
JCheckBox	TokenNameIdentifier	 J Check Box
getCheckBox	TokenNameIdentifier	 get Check Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_checkBox	TokenNameIdentifier	 check Box
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
