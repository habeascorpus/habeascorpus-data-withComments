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
HashMap	TokenNameIdentifier	 Hash Map
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
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * A base class for handlers of different XBL content element includes * attribute syntaxes. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AbstractContentSelector.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A base class for handlers of different XBL content element includes attribute syntaxes. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AbstractContentSelector.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
{	TokenNameLBRACE	
/** * The ContentManager object that owns this selector. */	TokenNameCOMMENT_JAVADOC	 The ContentManager object that owns this selector. 
protected	TokenNameprotected	
ContentManager	TokenNameIdentifier	 Content Manager
contentManager	TokenNameIdentifier	 content Manager
;	TokenNameSEMICOLON	
/** * The XBL content element. */	TokenNameCOMMENT_JAVADOC	 The XBL content element. 
protected	TokenNameprotected	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
contentElement	TokenNameIdentifier	 content Element
;	TokenNameSEMICOLON	
/** * The bound element. */	TokenNameCOMMENT_JAVADOC	 The bound element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
boundElement	TokenNameIdentifier	 bound Element
;	TokenNameSEMICOLON	
/** * Creates a new AbstractContentSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractContentSelector object. 
public	TokenNamepublic	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contentManager	TokenNameIdentifier	 content Manager
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
contentElement	TokenNameIdentifier	 content Element
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
boundElement	TokenNameIdentifier	 bound Element
=	TokenNameEQUAL	
bound	TokenNameIdentifier	 bound
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of nodes that were matched by this selector. */	TokenNameCOMMENT_JAVADOC	 Returns a list of nodes that were matched by this selector. 
public	TokenNamepublic	
abstract	TokenNameabstract	
NodeList	TokenNameIdentifier	 Node List
getSelectedContent	TokenNameIdentifier	 get Selected Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Forces this selector to update its selected nodes list. * Returns true if the selected node list needed updating. * This assumes that the previous content elements in this * shadow tree (in document order) have up-to-date selectedContent * lists. */	TokenNameCOMMENT_JAVADOC	 Forces this selector to update its selected nodes list. Returns true if the selected node list needed updating. This assumes that the previous content elements in this shadow tree (in document order) have up-to-date selectedContent lists. 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the given node has already been selected * by a content element. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given node has already been selected by a content element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentManager	TokenNameIdentifier	 content Manager
.	TokenNameDOT	
getContentElement	TokenNameIdentifier	 get Content Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Map of selector languages to factories. */	TokenNameCOMMENT_JAVADOC	 Map of selector languages to factories. 
protected	TokenNameprotected	
static	TokenNamestatic	
HashMap	TokenNameIdentifier	 Hash Map
selectorFactories	TokenNameIdentifier	 selector Factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
new	TokenNamenew	
XPathPatternContentSelectorFactory	TokenNameIdentifier	 X Path Pattern Content Selector Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
new	TokenNamenew	
XPathSubsetContentSelectorFactory	TokenNameIdentifier	 X Path Subset Content Selector Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectorFactories	TokenNameIdentifier	 selector Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectorFactories	TokenNameIdentifier	 selector Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XPathPattern"	TokenNameStringLiteral	XPathPattern
,	TokenNameCOMMA	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectorFactories	TokenNameIdentifier	 selector Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"XPathSubset"	TokenNameStringLiteral	XPathSubset
,	TokenNameCOMMA	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new selector object. * @param content The content element using this selector. * @param bound The bound element whose children will be selected. * @param selector The selector string. */	TokenNameCOMMENT_JAVADOC	 Creates a new selector object. @param content The content element using this selector. @param bound The bound element whose children will be selected. @param selector The selector string. 
public	TokenNamepublic	
static	TokenNamestatic	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
createSelector	TokenNameIdentifier	 create Selector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
selectorLanguage	TokenNameIdentifier	 selector Language
,	TokenNameCOMMA	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
)	TokenNameRPAREN	
selectorFactories	TokenNameIdentifier	 selector Factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
selectorLanguage	TokenNameIdentifier	 selector Language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid XBL content selector language '"	TokenNameStringLiteral	Invalid XBL content selector language '
+	TokenNamePLUS	
selectorLanguage	TokenNameIdentifier	 selector Language
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createSelector	TokenNameIdentifier	 create Selector
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An interface for content selector factories. */	TokenNameCOMMENT_JAVADOC	 An interface for content selector factories. 
protected	TokenNameprotected	
static	TokenNamestatic	
interface	TokenNameinterface	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
{	TokenNameLBRACE	
/** * Creates a new selector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new selector object. 
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
createSelector	TokenNameIdentifier	 create Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A factory for XPathSubsetContentSelector objects. */	TokenNameCOMMENT_JAVADOC	 A factory for XPathSubsetContentSelector objects. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
XPathSubsetContentSelectorFactory	TokenNameIdentifier	 X Path Subset Content Selector Factory
implements	TokenNameimplements	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
{	TokenNameLBRACE	
/** * Creates a new XPathSubsetContentSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new XPathSubsetContentSelector object. 
public	TokenNamepublic	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
createSelector	TokenNameIdentifier	 create Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XPathSubsetContentSelector	TokenNameIdentifier	 X Path Subset Content Selector
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A factory for XPathPatternContentSelector objects. */	TokenNameCOMMENT_JAVADOC	 A factory for XPathPatternContentSelector objects. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
XPathPatternContentSelectorFactory	TokenNameIdentifier	 X Path Pattern Content Selector Factory
implements	TokenNameimplements	
ContentSelectorFactory	TokenNameIdentifier	 Content Selector Factory
{	TokenNameLBRACE	
/** * Creates a new XPathPatternContentSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new XPathPatternContentSelector object. 
public	TokenNamepublic	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
createSelector	TokenNameIdentifier	 create Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XPathPatternContentSelector	TokenNameIdentifier	 X Path Pattern Content Selector
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
