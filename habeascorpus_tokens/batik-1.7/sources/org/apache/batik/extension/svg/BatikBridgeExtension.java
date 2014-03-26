/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
BridgeExtension	TokenNameIdentifier	 Bridge Extension
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
/** * This is a Service interface for classes that want to extend the * functionality of the Bridge, to support new tags in the rendering tree. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: BatikBridgeExtension.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a Service interface for classes that want to extend the functionality of the Bridge, to support new tags in the rendering tree. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: BatikBridgeExtension.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
BatikBridgeExtension	TokenNameIdentifier	 Batik Bridge Extension
implements	TokenNameimplements	
BridgeExtension	TokenNameIdentifier	 Bridge Extension
{	TokenNameLBRACE	
/** * Return the priority of this Extension. Extensions are * registered from lowest to highest priority. So if for some * reason you need to come before/after another existing extension * make sure your priority is lower/higher than theirs. */	TokenNameCOMMENT_JAVADOC	 Return the priority of this Extension. Extensions are registered from lowest to highest priority. So if for some reason you need to come before/after another existing extension make sure your priority is lower/higher than theirs. 
public	TokenNamepublic	
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the list of extensions implemented * by this BridgeExtension. * @return An iterator containing strings one for each implemented * extension. */	TokenNameCOMMENT_JAVADOC	 This should return the list of extensions implemented by this BridgeExtension. @return An iterator containing strings one for each implemented extension. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getImplementedExtensions	TokenNameIdentifier	 get Implemented Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"http://xml.apache.org/batik/ext/poly/1.0"	TokenNameStringLiteral	http://xml.apache.org/batik/ext/poly/1.0
,	TokenNameCOMMA	
"http://xml.apache.org/batik/ext/star/1.0"	TokenNameStringLiteral	http://xml.apache.org/batik/ext/star/1.0
,	TokenNameCOMMA	
"http://xml.apache.org/batik/ext/histogramNormalization/1.0"	TokenNameStringLiteral	http://xml.apache.org/batik/ext/histogramNormalization/1.0
,	TokenNameCOMMA	
"http://xml.apache.org/batik/ext/colorSwitch/1.0"	TokenNameStringLiteral	http://xml.apache.org/batik/ext/colorSwitch/1.0
,	TokenNameCOMMA	
"http://xml.apache.org/batik/ext/flowText/1.0"	TokenNameStringLiteral	http://xml.apache.org/batik/ext/flowText/1.0
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// List v = new ArrayList(extensions.length); 	TokenNameCOMMENT_LINE	List v = new ArrayList(extensions.length); 
// for (int i=0; i<extensions.length; i++) { 	TokenNameCOMMENT_LINE	for (int i=0; i<extensions.length; i++) { 
// v.add(extensions[i]); 	TokenNameCOMMENT_LINE	v.add(extensions[i]); 
// } 	TokenNameCOMMENT_LINE	} 
List	TokenNameIdentifier	 List
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
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
"Thomas DeWeese"	TokenNameStringLiteral	Thomas DeWeese
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
"deweese@apache.org"	TokenNameStringLiteral	deweese@apache.org
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
"Example extension to standard SVG shape tags"	TokenNameStringLiteral	Example extension to standard SVG shape tags
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
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
BatikRegularPolygonElementBridge	TokenNameIdentifier	 Batik Regular Polygon Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
BatikStarElementBridge	TokenNameIdentifier	 Batik Star Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
BatikHistogramNormalizationElementBridge	TokenNameIdentifier	 Batik Histogram Normalization Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
BatikFlowTextElementBridge	TokenNameIdentifier	 Batik Flow Text Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
ColorSwitchBridge	TokenNameIdentifier	 Color Switch Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
