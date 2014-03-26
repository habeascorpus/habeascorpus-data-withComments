/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
;	TokenNameSEMICOLON	
/** * This class implements the basic features an element must have in order * to be usable as a foreign element within an SVGOMDocument. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ExtensionElement.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the basic features an element must have in order to be usable as a foreign element within an SVGOMDocument. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ExtensionElement.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ExtensionElement	TokenNameIdentifier	 Extension Element
extends	TokenNameextends	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
{	TokenNameLBRACE	
/** * Creates a new Element object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. 
protected	TokenNameprotected	
ExtensionElement	TokenNameIdentifier	 Extension Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Element object. * @param name The element name, for validation purposes. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. @param name The element name, for validation purposes. @param owner The owner document. 
protected	TokenNameprotected	
ExtensionElement	TokenNameIdentifier	 Extension Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
