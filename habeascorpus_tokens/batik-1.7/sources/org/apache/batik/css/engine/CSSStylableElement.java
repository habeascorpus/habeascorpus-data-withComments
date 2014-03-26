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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
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
/** * This interface must be implemented by the DOM elements which needs * CSS support. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSStylableElement.java 579230 2007-09-25 12:52:48Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented by the DOM elements which needs CSS support. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSStylableElement.java 579230 2007-09-25 12:52:48Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
extends	TokenNameextends	
Element	TokenNameIdentifier	 Element
{	TokenNameLBRACE	
/** * Returns the computed style of this element/pseudo-element. */	TokenNameCOMMENT_JAVADOC	 Returns the computed style of this element/pseudo-element. 
StyleMap	TokenNameIdentifier	 Style Map
getComputedStyleMap	TokenNameIdentifier	 get Computed Style Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoElement	TokenNameIdentifier	 pseudo Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the computed style of this element/pseudo-element. */	TokenNameCOMMENT_JAVADOC	 Sets the computed style of this element/pseudo-element. 
void	TokenNamevoid	
setComputedStyleMap	TokenNameIdentifier	 set Computed Style Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the ID of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the ID of this element. 
String	TokenNameIdentifier	 String
getXMLId	TokenNameIdentifier	 get XML Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the class of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the class of this element. 
String	TokenNameIdentifier	 String
getCSSClass	TokenNameIdentifier	 get CSS Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS base URL of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS base URL of this element. 
ParsedURL	TokenNameIdentifier	 Parsed URL
getCSSBase	TokenNameIdentifier	 get CSS Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells whether this element is an instance of the given pseudo * class. */	TokenNameCOMMENT_JAVADOC	 Tells whether this element is an instance of the given pseudo class. 
boolean	TokenNameboolean	
isPseudoInstanceOf	TokenNameIdentifier	 is Pseudo Instance Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoClass	TokenNameIdentifier	 pseudo Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the object that gives access to the underlying * {@link StyleDeclaration} for the override style of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the object that gives access to the underlying {@link StyleDeclaration} for the override style of this element. 
StyleDeclarationProvider	TokenNameIdentifier	 Style Declaration Provider
getOverrideStyleDeclarationProvider	TokenNameIdentifier	 get Override Style Declaration Provider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
