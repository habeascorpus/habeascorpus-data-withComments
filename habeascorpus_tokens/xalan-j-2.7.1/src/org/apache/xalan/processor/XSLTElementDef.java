/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTElementDef.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTElementDef.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * This class defines the allowed structure for an element in a XSLT stylesheet, * is meant to reflect the structure defined in http://www.w3.org/TR/xslt#dtd, and the * mapping between Xalan classes and the markup elements in the XSLT instance. * This actually represents both text nodes and elements. */	TokenNameCOMMENT_JAVADOC	 This class defines the allowed structure for an element in a XSLT stylesheet, is meant to reflect the structure defined in http://www.w3.org/TR/xslt#dtd, and the mapping between Xalan classes and the markup elements in the XSLT instance. This actually represents both text nodes and elements. 
public	TokenNamepublic	
class	TokenNameclass	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
{	TokenNameLBRACE	
/** * Construct an instance of XSLTElementDef. This must be followed by a * call to build(). */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. This must be followed by a call to build(). 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  URL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
addAvailableElement	TokenNameIdentifier	 add Available Element
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nameAlias	TokenNameIdentifier	 name Alias
)	TokenNameRPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
addAvailableElement	TokenNameIdentifier	 add Available Element
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param has_required true if this element has required elements by the XSLT specification. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param has_required true if this element has required elements by the XSLT specification. 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_required	TokenNameIdentifier	 has required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_has_required	TokenNameIdentifier	 m has required
=	TokenNameEQUAL	
has_required	TokenNameIdentifier	 has required
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  URL
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
addAvailableElement	TokenNameIdentifier	 add Available Element
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nameAlias	TokenNameIdentifier	 name Alias
)	TokenNameRPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
addAvailableElement	TokenNameIdentifier	 add Available Element
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param has_required true if this element has required elements by the XSLT specification. * @param required true if this element is required by the XSLT specification. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param has_required true if this element has required elements by the XSLT specification. @param required true if this element is required by the XSLT specification. 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_required	TokenNameIdentifier	 has required
,	TokenNameCOMMA	
boolean	TokenNameboolean	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
has_required	TokenNameIdentifier	 has required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_required	TokenNameIdentifier	 m required
=	TokenNameEQUAL	
required	TokenNameIdentifier	 required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param has_required true if this element has required elements by the XSLT specification. * @param required true if this element is required by the XSLT specification. * @param order the order this element should appear according to the XSLT specification. * @param multiAllowed whether this element is allowed more than once */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param has_required true if this element has required elements by the XSLT specification. @param required true if this element is required by the XSLT specification. @param order the order this element should appear according to the XSLT specification. @param multiAllowed whether this element is allowed more than once 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_required	TokenNameIdentifier	 has required
,	TokenNameCOMMA	
boolean	TokenNameboolean	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
int	TokenNameint	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
has_required	TokenNameIdentifier	 has required
,	TokenNameCOMMA	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_order	TokenNameIdentifier	 m order
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_multiAllowed	TokenNameIdentifier	 m multi Allowed
=	TokenNameEQUAL	
multiAllowed	TokenNameIdentifier	 multi Allowed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param has_required true if this element has required elements by the XSLT specification. * @param required true if this element is required by the XSLT specification. * @param has_order whether this element has ordered child elements * @param order the order this element should appear according to the XSLT specification. * @param multiAllowed whether this element is allowed more than once */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param has_required true if this element has required elements by the XSLT specification. @param required true if this element is required by the XSLT specification. @param has_order whether this element has ordered child elements @param order the order this element should appear according to the XSLT specification. @param multiAllowed whether this element is allowed more than once 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_required	TokenNameIdentifier	 has required
,	TokenNameCOMMA	
boolean	TokenNameboolean	
required	TokenNameIdentifier	 required
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_order	TokenNameIdentifier	 has order
,	TokenNameCOMMA	
int	TokenNameint	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
has_required	TokenNameIdentifier	 has required
,	TokenNameCOMMA	
required	TokenNameIdentifier	 required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_order	TokenNameIdentifier	 m order
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_multiAllowed	TokenNameIdentifier	 m multi Allowed
=	TokenNameEQUAL	
multiAllowed	TokenNameIdentifier	 multi Allowed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_isOrdered	TokenNameIdentifier	 m is Ordered
=	TokenNameEQUAL	
has_order	TokenNameIdentifier	 has order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param has_order whether this element has ordered child elements * @param order the order this element should appear according to the XSLT specification. * @param multiAllowed whether this element is allowed more than once */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param has_order whether this element has ordered child elements @param order the order this element should appear according to the XSLT specification. @param multiAllowed whether this element is allowed more than once 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
boolean	TokenNameboolean	
has_order	TokenNameIdentifier	 has order
,	TokenNameCOMMA	
int	TokenNameint	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_isOrdered	TokenNameIdentifier	 m is Ordered
=	TokenNameEQUAL	
has_order	TokenNameIdentifier	 has order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. * @param order the order this element should appear according to the XSLT specification. * @param multiAllowed whether this element is allowed more than once */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. @param order the order this element should appear according to the XSLT specification. @param multiAllowed whether this element is allowed more than once 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
XSLTSchema	TokenNameIdentifier	 XSLT Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
int	TokenNameint	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
classObject	TokenNameIdentifier	 class Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_order	TokenNameIdentifier	 m order
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_multiAllowed	TokenNameIdentifier	 m multi Allowed
=	TokenNameEQUAL	
multiAllowed	TokenNameIdentifier	 multi Allowed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef that represents text. * * @param classObject The class of the object that this element def should produce. * @param contentHandler The element processor for this element. * @param type Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef that represents text. * @param classObject The class of the object that this element def should produce. @param contentHandler The element processor for this element. @param type Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. 
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_classObject	TokenNameIdentifier	 m class Object
=	TokenNameEQUAL	
classObject	TokenNameIdentifier	 class Object
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_type	TokenNameIdentifier	 m type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
setElementProcessor	TokenNameIdentifier	 set Element Processor
(	TokenNameLPAREN	
contentHandler	TokenNameIdentifier	 content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of XSLTElementDef. * * @param namespace The Namespace URI, "*", or null. * @param name The local name (without prefix), "*", or null. * @param nameAlias A potential alias for the name, or null. * @param elements An array of allowed child element defs, or null. * @param attributes An array of allowed attribute defs, or null. * @param contentHandler The element processor for this element. * @param classObject The class of the object that this element def should produce. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XSLTElementDef. * @param namespace The Namespace URI, "*", or null. @param name The local name (without prefix), "*", or null. @param nameAlias A potential alias for the name, or null. @param elements An array of allowed child element defs, or null. @param attributes An array of allowed attribute defs, or null. @param contentHandler The element processor for this element. @param classObject The class of the object that this element def should produce. 
void	TokenNamevoid	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
nameAlias	TokenNameIdentifier	 name Alias
,	TokenNameCOMMA	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
classObject	TokenNameIdentifier	 class Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_nameAlias	TokenNameIdentifier	 m name Alias
=	TokenNameEQUAL	
nameAlias	TokenNameIdentifier	 name Alias
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_attributes	TokenNameIdentifier	 m attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
setElementProcessor	TokenNameIdentifier	 set Element Processor
(	TokenNameLPAREN	
contentHandler	TokenNameIdentifier	 content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_classObject	TokenNameIdentifier	 m class Object
=	TokenNameEQUAL	
classObject	TokenNameIdentifier	 class Object
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasRequired	TokenNameIdentifier	 has Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_elements	TokenNameIdentifier	 m elements
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_requiredFound	TokenNameIdentifier	 m required Found
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"xsl:"	TokenNameStringLiteral	xsl:
+	TokenNamePLUS	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if two objects are equal, when either one may be null. * If both are null, they are considered equal. * * @param obj1 A reference to the first object, or null. * @param obj2 A reference to the second object, or null. * * @return true if the to objects are equal by both being null or * because obj2.equals(obj1) returns true. */	TokenNameCOMMENT_JAVADOC	 Tell if two objects are equal, when either one may be null. If both are null, they are considered equal. * @param obj1 A reference to the first object, or null. @param obj2 A reference to the second object, or null. * @return true if the to objects are equal by both being null or because obj2.equals(obj1) returns true. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
equalsMayBeNull	TokenNameIdentifier	 equals May Be Null
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj1	TokenNameIdentifier	 obj1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
obj2	TokenNameIdentifier	 obj2
==	TokenNameEQUAL_EQUAL	
obj1	TokenNameIdentifier	 obj1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
obj1	TokenNameIdentifier	 obj1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
obj2	TokenNameIdentifier	 obj2
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
obj2	TokenNameIdentifier	 obj2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj1	TokenNameIdentifier	 obj1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the two string refs are equal, * equality being defined as: * 1) Both strings are null. * 2) One string is null and the other is empty. * 3) Both strings are non-null, and equal. * * @param s1 A reference to the first string, or null. * @param s2 A reference to the second string, or null. * * @return true if Both strings are null, or if * one string is null and the other is empty, or if * both strings are non-null, and equal because * s1.equals(s2) returns true. */	TokenNameCOMMENT_JAVADOC	 Tell if the two string refs are equal, equality being defined as: 1) Both strings are null. 2) One string is null and the other is empty. 3) Both strings are non-null, and equal. * @param s1 A reference to the first string, or null. @param s2 A reference to the second string, or null. * @return true if Both strings are null, or if one string is null and the other is empty, or if both strings are non-null, and equal because s1.equals(s2) returns true. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
!=	TokenNameNOT_EQUAL	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Content type enumerations */	TokenNameCOMMENT_JAVADOC	 Content type enumerations 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
T_ELEMENT	TokenNameIdentifier	 T  ELEMENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
T_PCDATA	TokenNameIdentifier	 T  PCDATA
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
T_ANY	TokenNameIdentifier	 T  ANY
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The type of this element. */	TokenNameCOMMENT_JAVADOC	 The type of this element. 
private	TokenNameprivate	
int	TokenNameint	
m_type	TokenNameIdentifier	 m type
=	TokenNameEQUAL	
T_ELEMENT	TokenNameIdentifier	 T  ELEMENT
;	TokenNameSEMICOLON	
/** * Get the type of this element. * * @return Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. */	TokenNameCOMMENT_JAVADOC	 Get the type of this element. * @return Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. 
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_type	TokenNameIdentifier	 m type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the type of this element. * * @param t Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. */	TokenNameCOMMENT_JAVADOC	 Set the type of this element. * @param t Content type, one of T_ELEMENT, T_PCDATA, or T_ANY. 
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_type	TokenNameIdentifier	 m type
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The allowed namespace for this element. */	TokenNameCOMMENT_JAVADOC	 The allowed namespace for this element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
/** * Get the allowed namespace for this element. * * @return The Namespace URI, "*", or null. */	TokenNameCOMMENT_JAVADOC	 Get the allowed namespace for this element. * @return The Namespace URI, "*", or null. 
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of this element. */	TokenNameCOMMENT_JAVADOC	 The name of this element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** * Get the local name of this element. * * @return The local name of this element, "*", or null. */	TokenNameCOMMENT_JAVADOC	 Get the local name of this element. * @return The local name of this element, "*", or null. 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of this element. */	TokenNameCOMMENT_JAVADOC	 The name of this element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_nameAlias	TokenNameIdentifier	 m name Alias
;	TokenNameSEMICOLON	
/** * Get the name of this element. * * @return A potential alias for the name, or null. */	TokenNameCOMMENT_JAVADOC	 Get the name of this element. * @return A potential alias for the name, or null. 
String	TokenNameIdentifier	 String
getNameAlias	TokenNameIdentifier	 get Name Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nameAlias	TokenNameIdentifier	 m name Alias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The allowed elements for this type. */	TokenNameCOMMENT_JAVADOC	 The allowed elements for this type. 
private	TokenNameprivate	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_elements	TokenNameIdentifier	 m elements
;	TokenNameSEMICOLON	
/** * Get the allowed elements for this type. * * @return An array of allowed child element defs, or null. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the allowed elements for this type. * @return An array of allowed child element defs, or null. @xsl.usage internal 
public	TokenNamepublic	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_elements	TokenNameIdentifier	 m elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the allowed elements for this type. * * @param defs An array of allowed child element defs, or null. */	TokenNameCOMMENT_JAVADOC	 Set the allowed elements for this type. * @param defs An array of allowed child element defs, or null. 
void	TokenNamevoid	
setElements	TokenNameIdentifier	 set Elements
(	TokenNameLPAREN	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
defs	TokenNameIdentifier	 defs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
defs	TokenNameIdentifier	 defs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the namespace URI and local name match this * element. * @param uri The namespace uri, which may be null. * @param localName The local name of an element, which may be null. * * @return true if the uri and local name arguments are considered * to match the uri and local name of this element def. */	TokenNameCOMMENT_JAVADOC	 Tell if the namespace URI and local name match this element. @param uri The namespace uri, which may be null. @param localName The local name of an element, which may be null. * @return true if the uri and local name arguments are considered to match the uri and local name of this element def. 
private	TokenNameprivate	
boolean	TokenNameboolean	
QNameEquals	TokenNameIdentifier	 Q Name Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
m_namespace	TokenNameIdentifier	 m namespace
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
m_name	TokenNameIdentifier	 m name
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
m_nameAlias	TokenNameIdentifier	 m name Alias
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace URI, and a local name, get the processor * for the element, or return null if not allowed. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * * @return The element processor that matches the arguments, or null. */	TokenNameCOMMENT_JAVADOC	 Given a namespace URI, and a local name, get the processor for the element, or return null if not allowed. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. * @return The element processor that matches the arguments, or null. 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
getProcessorFor	TokenNameIdentifier	 get Processor For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
elemDef	TokenNameIdentifier	 elem Def
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// return value 	TokenNameCOMMENT_LINE	return value 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_elements	TokenNameIdentifier	 m elements
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
multiAllowed	TokenNameIdentifier	 multi Allowed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// A "*" signals that the element allows literal result 	TokenNameCOMMENT_LINE	A "*" signals that the element allows literal result 
// elements, so just assign the def, and continue to 	TokenNameCOMMENT_LINE	elements, so just assign the def, and continue to 
// see if anything else matches. 	TokenNameCOMMENT_LINE	see if anything else matches. 
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't allow xsl elements 	TokenNameCOMMENT_LINE	Don't allow xsl elements 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elemDef	TokenNameIdentifier	 elem Def
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
m_elementProcessor	TokenNameIdentifier	 m element Processor
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multiAllowed	TokenNameIdentifier	 multi Allowed
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getMultiAllowed	TokenNameIdentifier	 get Multi Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
QNameEquals	TokenNameIdentifier	 Q Name Equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
setRequiredFound	TokenNameIdentifier	 set Required Found
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multiAllowed	TokenNameIdentifier	 multi Allowed
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getMultiAllowed	TokenNameIdentifier	 get Multi Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemDef	TokenNameIdentifier	 elem Def
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
m_elementProcessor	TokenNameIdentifier	 m element Processor
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elemDef	TokenNameIdentifier	 elem Def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
isOrdered	TokenNameIdentifier	 is Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastOrder	TokenNameIdentifier	 last Order
=	TokenNameEQUAL	
getLastOrder	TokenNameIdentifier	 get Last Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
>	TokenNameGREATER	
lastOrder	TokenNameIdentifier	 last Order
)	TokenNameRPAREN	
setLastOrder	TokenNameIdentifier	 set Last Order
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
==	TokenNameEQUAL_EQUAL	
lastOrder	TokenNameIdentifier	 last Order
&&	TokenNameAND_AND	
!	TokenNameNOT	
multiAllowed	TokenNameIdentifier	 multi Allowed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
<	TokenNameLESS	
lastOrder	TokenNameIdentifier	 last Order
&&	TokenNameAND_AND	
order	TokenNameIdentifier	 order
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
elemDef	TokenNameIdentifier	 elem Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an unknown element, get the processor * for the element. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * * @return normally a {@link ProcessorUnknown} reference. * @see ProcessorUnknown */	TokenNameCOMMENT_JAVADOC	 Given an unknown element, get the processor for the element. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. * @return normally a {@link ProcessorUnknown} reference. @see ProcessorUnknown 
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
getProcessorForUnknown	TokenNameIdentifier	 get Processor For Unknown
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XSLTElementProcessor lreDef = null; // return value 	TokenNameCOMMENT_LINE	XSLTElementProcessor lreDef = null; // return value 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_elements	TokenNameIdentifier	 m elements
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTElementDef	TokenNameIdentifier	 XSLT Element Def
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
m_elements	TokenNameIdentifier	 m elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"unknown"	TokenNameStringLiteral	unknown
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
m_elementProcessor	TokenNameIdentifier	 m element Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The allowed attributes for this type. */	TokenNameCOMMENT_JAVADOC	 The allowed attributes for this type. 
private	TokenNameprivate	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_attributes	TokenNameIdentifier	 m attributes
;	TokenNameSEMICOLON	
/** * Get the allowed attributes for this type. * * @return An array of allowed attribute defs, or null. */	TokenNameCOMMENT_JAVADOC	 Get the allowed attributes for this type. * @return An array of allowed attribute defs, or null. 
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attributes	TokenNameIdentifier	 m attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace URI, and a local name, return the element's * attribute definition, if it has one. * * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * * @return The attribute def that matches the arguments, or null. */	TokenNameCOMMENT_JAVADOC	 Given a namespace URI, and a local name, return the element's attribute definition, if it has one. * @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. * @return The attribute def that matches the arguments, or null. 
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
getAttributeDef	TokenNameIdentifier	 get Attribute Def
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
defaultDef	TokenNameIdentifier	 default Def
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrDefs	TokenNameIdentifier	 attr Defs
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrDefs	TokenNameIdentifier	 n Attr Defs
=	TokenNameEQUAL	
attrDefs	TokenNameIdentifier	 attr Defs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
nAttrDefs	TokenNameIdentifier	 n Attr Defs
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
attrDef	TokenNameIdentifier	 attr Def
=	TokenNameEQUAL	
attrDefs	TokenNameIdentifier	 attr Defs
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uriDef	TokenNameIdentifier	 uri Def
=	TokenNameEQUAL	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameDef	TokenNameIdentifier	 name Def
=	TokenNameEQUAL	
attrDef	TokenNameIdentifier	 attr Def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameDef	TokenNameIdentifier	 name Def
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
uriDef	TokenNameIdentifier	 uri Def
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
uriDef	TokenNameIdentifier	 uri Def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uriDef	TokenNameIdentifier	 uri Def
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrDef	TokenNameIdentifier	 attr Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nameDef	TokenNameIdentifier	 name Def
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
uriDef	TokenNameIdentifier	 uri Def
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In this case, all attributes are legal, so return 	TokenNameCOMMENT_LINE	In this case, all attributes are legal, so return 
// this as the last resort. 	TokenNameCOMMENT_LINE	this as the last resort. 
defaultDef	TokenNameIdentifier	 default Def
=	TokenNameEQUAL	
attrDef	TokenNameIdentifier	 attr Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
uriDef	TokenNameIdentifier	 uri Def
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nameDef	TokenNameIdentifier	 name Def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrDef	TokenNameIdentifier	 attr Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
defaultDef	TokenNameIdentifier	 default Def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
equalsMayBeNullOrZeroLen	TokenNameIdentifier	 equals May Be Null Or Zero Len
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSLTAttributeDef	TokenNameIdentifier	 XSLT Attribute Def
.	TokenNameDOT	
m_foreignAttr	TokenNameIdentifier	 m foreign Attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultDef	TokenNameIdentifier	 default Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If non-null, the ContentHandler/TransformerFactory for this element. */	TokenNameCOMMENT_JAVADOC	 If non-null, the ContentHandler/TransformerFactory for this element. 
private	TokenNameprivate	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
m_elementProcessor	TokenNameIdentifier	 m element Processor
;	TokenNameSEMICOLON	
/** * Return the XSLTElementProcessor for this element. * * @return The element processor for this element. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return the XSLTElementProcessor for this element. * @return The element processor for this element. @xsl.usage internal 
public	TokenNamepublic	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
getElementProcessor	TokenNameIdentifier	 get Element Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_elementProcessor	TokenNameIdentifier	 m element Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the XSLTElementProcessor for this element. * * @param handler The element processor for this element. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Set the XSLTElementProcessor for this element. * @param handler The element processor for this element. @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
setElementProcessor	TokenNameIdentifier	 set Element Processor
(	TokenNameLPAREN	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elementProcessor	TokenNameIdentifier	 m element Processor
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
m_elementProcessor	TokenNameIdentifier	 m element Processor
.	TokenNameDOT	
setElemDef	TokenNameIdentifier	 set Elem Def
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If non-null, the class object that should in instantiated for * a Xalan instance of this element. */	TokenNameCOMMENT_JAVADOC	 If non-null, the class object that should in instantiated for a Xalan instance of this element. 
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
m_classObject	TokenNameIdentifier	 m class Object
;	TokenNameSEMICOLON	
/** * Return the class object that should in instantiated for * a Xalan instance of this element. * * @return The class of the object that this element def should produce, or null. */	TokenNameCOMMENT_JAVADOC	 Return the class object that should in instantiated for a Xalan instance of this element. * @return The class of the object that this element def should produce, or null. 
Class	TokenNameIdentifier	 Class
getClassObject	TokenNameIdentifier	 get Class Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_classObject	TokenNameIdentifier	 m class Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, this has a required element. */	TokenNameCOMMENT_JAVADOC	 If true, this has a required element. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_has_required	TokenNameIdentifier	 m has required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get whether or not this has a required element. * * @return true if this this has a required element. */	TokenNameCOMMENT_JAVADOC	 Get whether or not this has a required element. * @return true if this this has a required element. 
boolean	TokenNameboolean	
hasRequired	TokenNameIdentifier	 has Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_has_required	TokenNameIdentifier	 m has required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, this is a required element. */	TokenNameCOMMENT_JAVADOC	 If true, this is a required element. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_required	TokenNameIdentifier	 m required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get whether or not this is a required element. * * @return true if this is a required element. */	TokenNameCOMMENT_JAVADOC	 Get whether or not this is a required element. * @return true if this is a required element. 
boolean	TokenNameboolean	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_required	TokenNameIdentifier	 m required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
m_requiredFound	TokenNameIdentifier	 m required Found
;	TokenNameSEMICOLON	
/** * Set this required element found. * */	TokenNameCOMMENT_JAVADOC	 Set this required element found. 
void	TokenNamevoid	
setRequiredFound	TokenNameIdentifier	 set Required Found
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elem	TokenNameIdentifier	 elem
,	TokenNameCOMMA	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether all required elements were found. * * @return true if all required elements were found. */	TokenNameCOMMENT_JAVADOC	 Get whether all required elements were found. * @return true if all required elements were found. 
boolean	TokenNameboolean	
getRequiredFound	TokenNameIdentifier	 get Required Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_requiredFound	TokenNameIdentifier	 m required Found
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get required elements that were not found. * * @return required elements that were not found. */	TokenNameCOMMENT_JAVADOC	 Get required elements that were not found. * @return required elements that were not found. 
String	TokenNameIdentifier	 String
getRequiredElem	TokenNameIdentifier	 get Required Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_requiredFound	TokenNameIdentifier	 m required Found
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
m_requiredFound	TokenNameIdentifier	 m required Found
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
m_isOrdered	TokenNameIdentifier	 m is Ordered
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get whether this element requires ordered children. * * @return true if this element requires ordered children. */	TokenNameCOMMENT_JAVADOC	 Get whether this element requires ordered children. * @return true if this element requires ordered children. 
boolean	TokenNameboolean	
isOrdered	TokenNameIdentifier	 is Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*if (!m_CheckedOrdered) { m_CheckedOrdered = true; m_isOrdered = false; if (null == m_elements) return false; int n = m_elements.length; for (int i = 0; i < n; i++) { if (m_elements[i].getOrder() > 0) { m_isOrdered = true; return true; } } return false; } else*/	TokenNameCOMMENT_BLOCK	if (!m_CheckedOrdered) { m_CheckedOrdered = true; m_isOrdered = false; if (null == m_elements) return false; int n = m_elements.length; for (int i = 0; i < n; i++) { if (m_elements[i].getOrder() > 0) { m_isOrdered = true; return true; } } return false; } else
return	TokenNamereturn	
m_isOrdered	TokenNameIdentifier	 m is Ordered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the order that this element should appear, or -1 if not ordered */	TokenNameCOMMENT_JAVADOC	 the order that this element should appear, or -1 if not ordered 
private	TokenNameprivate	
int	TokenNameint	
m_order	TokenNameIdentifier	 m order
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the order that this element should appear . * * @return the order that this element should appear. */	TokenNameCOMMENT_JAVADOC	 Get the order that this element should appear . * @return the order that this element should appear. 
int	TokenNameint	
getOrder	TokenNameIdentifier	 get Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_order	TokenNameIdentifier	 m order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the highest order of child elements have appeared so far, * or -1 if not ordered */	TokenNameCOMMENT_JAVADOC	 the highest order of child elements have appeared so far, or -1 if not ordered 
private	TokenNameprivate	
int	TokenNameint	
m_lastOrder	TokenNameIdentifier	 m last Order
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the highest order of child elements have appeared so far . * * @return the highest order of child elements have appeared so far. */	TokenNameCOMMENT_JAVADOC	 Get the highest order of child elements have appeared so far . * @return the highest order of child elements have appeared so far. 
int	TokenNameint	
getLastOrder	TokenNameIdentifier	 get Last Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lastOrder	TokenNameIdentifier	 m last Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the highest order of child elements have appeared so far . * * @param order the highest order of child elements have appeared so far. */	TokenNameCOMMENT_JAVADOC	 Set the highest order of child elements have appeared so far . * @param order the highest order of child elements have appeared so far. 
void	TokenNamevoid	
setLastOrder	TokenNameIdentifier	 set Last Order
(	TokenNameLPAREN	
int	TokenNameint	
order	TokenNameIdentifier	 order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lastOrder	TokenNameIdentifier	 m last Order
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if this element can appear multiple times */	TokenNameCOMMENT_JAVADOC	 True if this element can appear multiple times 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_multiAllowed	TokenNameIdentifier	 m multi Allowed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Get whether this element can appear multiple times * * @return true if this element can appear multiple times */	TokenNameCOMMENT_JAVADOC	 Get whether this element can appear multiple times * @return true if this element can appear multiple times 
boolean	TokenNameboolean	
getMultiAllowed	TokenNameIdentifier	 get Multi Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_multiAllowed	TokenNameIdentifier	 m multi Allowed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
