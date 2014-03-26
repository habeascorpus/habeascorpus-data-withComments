/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSupport	TokenNameIdentifier	 XML Support
;	TokenNameSEMICOLON	
/** * This class provides a common superclass for elements which contain * descriptive text. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGDescriptiveElement.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a common superclass for elements which contain descriptive text. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGDescriptiveElement.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGDescriptiveElement	TokenNameIdentifier	 SVG Descriptive Element
extends	TokenNameextends	
SVGStylableElement	TokenNameIdentifier	 SVG Stylable Element
{	TokenNameLBRACE	
/** * Creates a new SVGDescriptiveElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGDescriptiveElement object. 
protected	TokenNameprotected	
SVGDescriptiveElement	TokenNameIdentifier	 SVG Descriptive Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGDescriptiveElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGDescriptiveElement object. @param prefix The namespace prefix. @param owner The owner document. 
protected	TokenNameprotected	
SVGDescriptiveElement	TokenNameIdentifier	 SVG Descriptive Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGLangSpace support ////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGLangSpace support ////////////////////////////////////////////////// 
/** * <b>DOM</b>: Returns the xml:lang attribute value. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Returns the xml:lang attribute value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLlang	TokenNameIdentifier	 get XM Llang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLSupport	TokenNameIdentifier	 XML Support
.	TokenNameDOT	
getXMLLang	TokenNameIdentifier	 get XML Lang
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Sets the xml:lang attribute value. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Sets the xml:lang attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLlang	TokenNameIdentifier	 set XM Llang
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
XML_LANG_QNAME	TokenNameIdentifier	 XML  LANG  QNAME
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Returns the xml:space attribute value. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Returns the xml:space attribute value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLspace	TokenNameIdentifier	 get XM Lspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLSupport	TokenNameIdentifier	 XML Support
.	TokenNameDOT	
getXMLSpace	TokenNameIdentifier	 get XML Space
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Sets the xml:space attribute value. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Sets the xml:space attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLspace	TokenNameIdentifier	 set XM Lspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
XML_SPACE_QNAME	TokenNameIdentifier	 XML  SPACE  QNAME
,	TokenNameCOMMA	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
