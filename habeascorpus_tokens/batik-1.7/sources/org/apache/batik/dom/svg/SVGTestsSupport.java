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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGStringList	TokenNameIdentifier	 SVG String List
;	TokenNameSEMICOLON	
/** * This class provides support for SVGTests features. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGTestsSupport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for SVGTests features. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGTestsSupport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
{	TokenNameLBRACE	
/** * Creates a new SVGTestsSupport object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGTestsSupport object. 
public	TokenNamepublic	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * To implements {@link org.w3c.dom.svg.SVGTests#getRequiredFeatures()}. */	TokenNameCOMMENT_JAVADOC	 To implements {@link org.w3c.dom.svg.SVGTests#getRequiredFeatures()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGStringList	TokenNameIdentifier	 SVG String List
getRequiredFeatures	TokenNameIdentifier	 get Required Features
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGTests.getRequiredFeatures is not implemented"	TokenNameStringLiteral	SVGTests.getRequiredFeatures is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * To implements {@link org.w3c.dom.svg.SVGTests#getRequiredExtensions()}. */	TokenNameCOMMENT_JAVADOC	 To implements {@link org.w3c.dom.svg.SVGTests#getRequiredExtensions()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGStringList	TokenNameIdentifier	 SVG String List
getRequiredExtensions	TokenNameIdentifier	 get Required Extensions
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGTests.getRequiredExtensions is not implemented"	TokenNameStringLiteral	SVGTests.getRequiredExtensions is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * To implements {@link org.w3c.dom.svg.SVGTests#getSystemLanguage()}. */	TokenNameCOMMENT_JAVADOC	 To implements {@link org.w3c.dom.svg.SVGTests#getSystemLanguage()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGStringList	TokenNameIdentifier	 SVG String List
getSystemLanguage	TokenNameIdentifier	 get System Language
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGTests.getSystemLanguage is not implemented"	TokenNameStringLiteral	SVGTests.getSystemLanguage is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * To implements {@link org.w3c.dom.svg.SVGTests#hasExtension(String)}. */	TokenNameCOMMENT_JAVADOC	 To implements {@link org.w3c.dom.svg.SVGTests#hasExtension(String)}. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasExtension	TokenNameIdentifier	 has Extension
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGTests.hasExtension is not implemented"	TokenNameStringLiteral	SVGTests.hasExtension is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
