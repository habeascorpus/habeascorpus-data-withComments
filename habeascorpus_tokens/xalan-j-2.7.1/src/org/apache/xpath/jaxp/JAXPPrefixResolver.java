/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// $Id: JAXPPrefixResolver.java 468655 2006-10-28 07:12:06Z minchau $ 	TokenNameCOMMENT_LINE	$Id: JAXPPrefixResolver.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
/** * <meta name="usage" content="general"/> * This class implements a Default PrefixResolver which * can be used to perform prefix-to-namespace lookup * for the XPath object. * This class delegates the resolution to the passed NamespaceContext */	TokenNameCOMMENT_JAVADOC	 <meta name="usage" content="general"/> This class implements a Default PrefixResolver which can be used to perform prefix-to-namespace lookup for the XPath object. This class delegates the resolution to the passed NamespaceContext 
public	TokenNamepublic	
class	TokenNameclass	
JAXPPrefixResolver	TokenNameIdentifier	 JAXP Prefix Resolver
implements	TokenNameimplements	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
{	TokenNameLBRACE	
private	TokenNameprivate	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JAXPPrefixResolver	TokenNameIdentifier	 JAXP Prefix Resolver
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
nsContext	TokenNameIdentifier	 ns Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
namespaceContext	TokenNameIdentifier	 namespace Context
=	TokenNameEQUAL	
nsContext	TokenNameIdentifier	 ns Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceContext	TokenNameIdentifier	 namespace Context
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the base identifier. * * @return null */	TokenNameCOMMENT_JAVADOC	 Return the base identifier. * @return null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see PrefixResolver#handlesNullPrefixes() */	TokenNameCOMMENT_JAVADOC	 @see PrefixResolver#handlesNullPrefixes() 
public	TokenNamepublic	
boolean	TokenNameboolean	
handlesNullPrefixes	TokenNameIdentifier	 handles Null Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The URI for the XML namespace. * (Duplicate of that found in org.apache.xpath.XPathContext). */	TokenNameCOMMENT_JAVADOC	 The URI for the XML namespace. (Duplicate of that found in org.apache.xpath.XPathContext). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
/** * Given a prefix and a Context Node, get the corresponding namespace. * Warning: This will not work correctly if namespaceContext * is an attribute node. * @param prefix Prefix to resolve. * @param namespaceContext Node from which to start searching for a * xmlns attribute that binds a prefix to a namespace. * @return Namespace that prefix resolves to, or null if prefix * is not bound. */	TokenNameCOMMENT_JAVADOC	 Given a prefix and a Context Node, get the corresponding namespace. Warning: This will not work correctly if namespaceContext is an attribute node. @param prefix Prefix to resolve. @param namespaceContext Node from which to start searching for a xmlns attribute that binds a prefix to a namespace. @return Namespace that prefix resolves to, or null if prefix is not bound. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
nnm	TokenNameIdentifier	 nnm
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
nnm	TokenNameIdentifier	 nnm
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
nnm	TokenNameIdentifier	 nnm
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aname	TokenNameIdentifier	 aname
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isPrefix	TokenNameIdentifier	 is Prefix
=	TokenNameEQUAL	
aname	TokenNameIdentifier	 aname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPrefix	TokenNameIdentifier	 is Prefix
||	TokenNameOR_OR	
aname	TokenNameIdentifier	 aname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
aname	TokenNameIdentifier	 aname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
isPrefix	TokenNameIdentifier	 is Prefix
?	TokenNameQUESTION	
aname	TokenNameIdentifier	 aname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
