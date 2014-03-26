/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
BridgeContext	TokenNameIdentifier	 Bridge Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
SVGBridgeExtension	TokenNameIdentifier	 SVG Bridge Extension
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
SVGConstants	TokenNameIdentifier	 SVG Constants
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
SVG12Constants	TokenNameIdentifier	 SV G12 Constants
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
XBLConstants	TokenNameIdentifier	 XBL Constants
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
/** * This is a Service interface for classes that want to extend the * functionality of the Bridge, to support new tags in the rendering tree. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: SVG12BridgeExtension.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a Service interface for classes that want to extend the functionality of the Bridge, to support new tags in the rendering tree. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: SVG12BridgeExtension.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVG12BridgeExtension	TokenNameIdentifier	 SV G12 Bridge Extension
extends	TokenNameextends	
SVGBridgeExtension	TokenNameIdentifier	 SVG Bridge Extension
{	TokenNameLBRACE	
/** * Return the priority of this Extension. Extensions are * registered from lowest to highest priority. So if for some * reason you need to come before/after another existing extension * make sure your priority is lower/higher than theirs. */	TokenNameCOMMENT_JAVADOC	 Return the priority of this Extension. Extensions are registered from lowest to highest priority. So if for some reason you need to come before/after another existing extension make sure your priority is lower/higher than theirs. 
public	TokenNamepublic	
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the list of extensions implemented * by this BridgeExtension. * @return An iterator containing strings one for each implemented * extension. */	TokenNameCOMMENT_JAVADOC	 This should return the list of extensions implemented by this BridgeExtension. @return An iterator containing strings one for each implemented extension. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getImplementedExtensions	TokenNameIdentifier	 get Implemented Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the individual or company name responsible * for the this implementation of the extension. */	TokenNameCOMMENT_JAVADOC	 This should return the individual or company name responsible for the this implementation of the extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"The Apache Batik Team."	TokenNameStringLiteral	The Apache Batik Team.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should contain a contact address (usually an e-mail address). */	TokenNameCOMMENT_JAVADOC	 This should contain a contact address (usually an e-mail address). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContactAddress	TokenNameIdentifier	 get Contact Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"batik-dev@xmlgraphics.apache.org"	TokenNameStringLiteral	batik-dev@xmlgraphics.apache.org
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return a URL where information can be obtained on * this extension. */	TokenNameCOMMENT_JAVADOC	 This should return a URL where information can be obtained on this extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"http://xml.apache.org/batik"	TokenNameStringLiteral	http://xml.apache.org/batik
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Human readable description of the extension. * Perhaps that should be a resource for internationalization? * (although I suppose it could be done internally) */	TokenNameCOMMENT_JAVADOC	 Human readable description of the extension. Perhaps that should be a resource for internationalization? (although I suppose it could be done internally) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"The required SVG 1.2 tags"	TokenNameStringLiteral	The required SVG 1.2 tags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should update the BridgeContext with support * for the tags in this extension. In some rare cases it may * be necessary to replace existing tag handlers, although this * is discouraged. * * @param ctx The BridgeContext instance to be updated */	TokenNameCOMMENT_JAVADOC	 This method should update the BridgeContext with support for the tags in this extension. In some rare cases it may be necessary to replace existing tag handlers, although this is discouraged. * @param ctx The BridgeContext instance to be updated 
public	TokenNamepublic	
void	TokenNamevoid	
registerTags	TokenNameIdentifier	 register Tags
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bridges to handle elements in the SVG namespace 	TokenNameCOMMENT_LINE	bridges to handle elements in the SVG namespace 
super	TokenNamesuper	
.	TokenNameDOT	
registerTags	TokenNameIdentifier	 register Tags
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bridges for SVG 1.2 elements 	TokenNameCOMMENT_LINE	Bridges for SVG 1.2 elements 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFlowRootElementBridge	TokenNameIdentifier	 SVG Flow Root Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGMultiImageElementBridge	TokenNameIdentifier	 SVG Multi Image Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGSolidColorElementBridge	TokenNameIdentifier	 SVG Solid Color Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVG12TextElementBridge	TokenNameIdentifier	 SV G12 Text Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bridges for XBL shadow trees and content elements 	TokenNameCOMMENT_LINE	Bridges for XBL shadow trees and content elements 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
XBLShadowTreeElementBridge	TokenNameIdentifier	 XBL Shadow Tree Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
XBLContentElementBridge	TokenNameIdentifier	 XBL Content Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Default bridge to handle bindable elements 	TokenNameCOMMENT_LINE	Default bridge to handle bindable elements 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
setDefaultBridge	TokenNameIdentifier	 set Default Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
BindableElementBridge	TokenNameIdentifier	 Bindable Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Namespaces to avoid for default bridges 	TokenNameCOMMENT_LINE	Namespaces to avoid for default bridges 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putReservedNamespaceURI	TokenNameIdentifier	 put Reserved Namespace URI
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putReservedNamespaceURI	TokenNameIdentifier	 put Reserved Namespace URI
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putReservedNamespaceURI	TokenNameIdentifier	 put Reserved Namespace URI
(	TokenNameLPAREN	
XBLConstants	TokenNameIdentifier	 XBL Constants
.	TokenNameDOT	
XBL_NAMESPACE_URI	TokenNameIdentifier	 XBL  NAMESPACE  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the presence of the specified element should cause * the document to be dynamic. If this element isn't handled * by this BridgeExtension, just return false. * * @param e The element to check. */	TokenNameCOMMENT_JAVADOC	 Whether the presence of the specified element should cause the document to be dynamic. If this element isn't handled by this BridgeExtension, just return false. * @param e The element to check. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDynamicElement	TokenNameIdentifier	 is Dynamic Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XBLConstants	TokenNameIdentifier	 XBL Constants
.	TokenNameDOT	
XBL_NAMESPACE_URI	TokenNameIdentifier	 XBL  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SCRIPT_TAG	TokenNameIdentifier	 SVG  SCRIPT  TAG
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG12Constants	TokenNameIdentifier	 SV G12 Constants
.	TokenNameDOT	
SVG_HANDLER_TAG	TokenNameIdentifier	 SVG  HANDLER  TAG
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"animate"	TokenNameStringLiteral	animate
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"set"	TokenNameStringLiteral	set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
