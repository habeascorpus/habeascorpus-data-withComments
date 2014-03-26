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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
/** * Interface describing object that can be selected or have selections * made on it. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: Selectable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface describing object that can be selected or have selections made on it. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: Selectable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Selectable	TokenNameIdentifier	 Selectable
{	TokenNameLBRACE	
/** * Initializes the current selection to begin with the character at (x, y). * @return true if action resulted in change of selection. */	TokenNameCOMMENT_JAVADOC	 Initializes the current selection to begin with the character at (x, y). @return true if action resulted in change of selection. 
boolean	TokenNameboolean	
selectAt	TokenNameIdentifier	 select At
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Extends the current selection to the character at (x, y).. * @return true if action resulted in change of selection. */	TokenNameCOMMENT_JAVADOC	 Extends the current selection to the character at (x, y).. @return true if action resulted in change of selection. 
boolean	TokenNameboolean	
selectTo	TokenNameIdentifier	 select To
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Selects the entire contents of the GraphicsNode at (x, y). * @return true if action resulted in change of selection. */	TokenNameCOMMENT_JAVADOC	 Selects the entire contents of the GraphicsNode at (x, y). @return true if action resulted in change of selection. 
boolean	TokenNameboolean	
selectAll	TokenNameIdentifier	 select All
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current text selection. * @return an object containing the selected content. */	TokenNameCOMMENT_JAVADOC	 Get the current text selection. @return an object containing the selected content. 
Object	TokenNameIdentifier	 Object
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a shape in user coords which encloses the current selection. */	TokenNameCOMMENT_JAVADOC	 Return a shape in user coords which encloses the current selection. 
Shape	TokenNameIdentifier	 Shape
getHighlightShape	TokenNameIdentifier	 get Highlight Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
