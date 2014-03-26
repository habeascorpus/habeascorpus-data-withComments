/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NamespaceMappings.java 469648 2006-10-31 20:52:27Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NamespaceMappings.java 469648 2006-10-31 20:52:27Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This class keeps track of the currently defined namespaces. Conceptually the * prefix/uri/depth triplets are pushed on a stack pushed on a stack. The depth * indicates the nesting depth of the element for which the mapping was made. * * <p>For example: * <pre> * <chapter xmlns:p1="def"> * <paragraph xmlns:p2="ghi"> * <sentance xmlns:p3="jkl"> * </sentance> * </paragraph> * <paragraph xlmns:p4="mno"> * </paragraph> * </chapter> * </pre> * * When the <chapter> element is encounted the prefix "p1" associated with uri * "def" is pushed on the stack with depth 1. * When the first <paragraph> is encountered "p2" and "ghi" are pushed with * depth 2. * When the <sentance> is encountered "p3" and "jkl" are pushed with depth 3. * When </sentance> occurs the popNamespaces(3) will pop "p3"/"jkl" off the * stack. Of course popNamespaces(2) would pop anything with depth 2 or * greater. * * So prefix/uri pairs are pushed and poped off the stack as elements are * processed. At any given moment of processing the currently visible prefixes * are on the stack and a prefix can be found given a uri, or a uri can be found * given a prefix. * * This class is intended for internal use only. However, it is made public because * other packages require it. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class keeps track of the currently defined namespaces. Conceptually the prefix/uri/depth triplets are pushed on a stack pushed on a stack. The depth indicates the nesting depth of the element for which the mapping was made. * <p>For example: <pre> <chapter xmlns:p1="def"> <paragraph xmlns:p2="ghi"> <sentance xmlns:p3="jkl"> </sentance> </paragraph> <paragraph xlmns:p4="mno"> </paragraph> </chapter> </pre> * When the <chapter> element is encounted the prefix "p1" associated with uri "def" is pushed on the stack with depth 1. When the first <paragraph> is encountered "p2" and "ghi" are pushed with depth 2. When the <sentance> is encountered "p3" and "jkl" are pushed with depth 3. When </sentance> occurs the popNamespaces(3) will pop "p3"/"jkl" off the stack. Of course popNamespaces(2) would pop anything with depth 2 or greater. * So prefix/uri pairs are pushed and poped off the stack as elements are processed. At any given moment of processing the currently visible prefixes are on the stack and a prefix can be found given a uri, or a uri can be found given a prefix. * This class is intended for internal use only. However, it is made public because other packages require it. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
{	TokenNameLBRACE	
/** * This member is continually incremented when new prefixes need to be * generated. ("ns0" "ns1" ...) */	TokenNameCOMMENT_JAVADOC	 This member is continually incremented when new prefixes need to be generated. ("ns0" "ns1" ...) 
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Each entry (prefix) in this hashtable points to a Stack of URIs * This table maps a prefix (String) to a Stack of NamespaceNodes. * All Namespace nodes in that retrieved stack have the same prefix, * though possibly different URI's or depths. Such a stack must have * mappings at deeper depths push later on such a stack. Mappings pushed * earlier on the stack will have smaller values for MappingRecord.m_declarationDepth. */	TokenNameCOMMENT_JAVADOC	 Each entry (prefix) in this hashtable points to a Stack of URIs This table maps a prefix (String) to a Stack of NamespaceNodes. All Namespace nodes in that retrieved stack have the same prefix, though possibly different URI's or depths. Such a stack must have mappings at deeper depths push later on such a stack. Mappings pushed earlier on the stack will have smaller values for MappingRecord.m_declarationDepth. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_namespaces	TokenNameIdentifier	 m namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This stack is used as a convenience. * It contains the pushed NamespaceNodes (shallowest * to deepest) and is used to delete NamespaceNodes * when leaving the current element depth * to returning to the parent. The mappings of the deepest * depth can be popped of the top and the same node * can be removed from the appropriate prefix stack. * * All prefixes pushed at the current depth can be * removed at the same time by using this stack to * ensure prefix/uri map scopes are closed correctly. */	TokenNameCOMMENT_JAVADOC	 This stack is used as a convenience. It contains the pushed NamespaceNodes (shallowest to deepest) and is used to delete NamespaceNodes when leaving the current element depth to returning to the parent. The mappings of the deepest depth can be popped of the top and the same node can be removed from the appropriate prefix stack. * All prefixes pushed at the current depth can be removed at the same time by using this stack to ensure prefix/uri map scopes are closed correctly. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_nodeStack	TokenNameIdentifier	 m node Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
// was "xmlns" 	TokenNameCOMMENT_LINE	was "xmlns" 
/** * Default constructor * @see java.lang.Object#Object() */	TokenNameCOMMENT_JAVADOC	 Default constructor @see java.lang.Object#Object() 
public	TokenNamepublic	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initNamespaces	TokenNameIdentifier	 init Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method initializes the namespace object with appropriate stacks * and predefines a few prefix/uri pairs which always exist. */	TokenNameCOMMENT_JAVADOC	 This method initializes the namespace object with appropriate stacks and predefines a few prefix/uri pairs which always exist. 
private	TokenNameprivate	
void	TokenNamevoid	
initNamespaces	TokenNameIdentifier	 init Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The initial prefix mappings will never be deleted because they are at element depth -1 	TokenNameCOMMENT_LINE	The initial prefix mappings will never be deleted because they are at element depth -1 
// (a kludge) 	TokenNameCOMMENT_LINE	(a kludge) 
// Define the default namespace (initially maps to "" uri) 	TokenNameCOMMENT_LINE	Define the default namespace (initially maps to "" uri) 
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
;	TokenNameSEMICOLON	
MappingRecord	TokenNameIdentifier	 Mapping Record
nn	TokenNameIdentifier	 nn
;	TokenNameSEMICOLON	
nn	TokenNameIdentifier	 nn
=	TokenNameEQUAL	
new	TokenNamenew	
MappingRecord	TokenNameIdentifier	 Mapping Record
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
,	TokenNameCOMMA	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
createPrefixStack	TokenNameIdentifier	 create Prefix Stack
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
nn	TokenNameIdentifier	 nn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// define "xml" namespace 	TokenNameCOMMENT_LINE	define "xml" namespace 
nn	TokenNameIdentifier	 nn
=	TokenNameEQUAL	
new	TokenNamenew	
MappingRecord	TokenNameIdentifier	 Mapping Record
(	TokenNameLPAREN	
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
,	TokenNameCOMMA	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
createPrefixStack	TokenNameIdentifier	 create Prefix Stack
(	TokenNameLPAREN	
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
nn	TokenNameIdentifier	 nn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use a namespace prefix to lookup a namespace URI. * * @param prefix String the prefix of the namespace * @return the URI corresponding to the prefix, returns "" * if there is no visible mapping. */	TokenNameCOMMENT_JAVADOC	 Use a namespace prefix to lookup a namespace URI. * @param prefix String the prefix of the namespace @return the URI corresponding to the prefix, returns "" if there is no visible mapping. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getPrefixStack	TokenNameIdentifier	 get Prefix Stack
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MappingRecord	TokenNameIdentifier	 Mapping Record
getMappingFromPrefix	TokenNameIdentifier	 get Mapping From Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stack	TokenNameIdentifier	 stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace uri, and the namespaces mappings for the * current element, return the current prefix for that uri. * * @param uri the namespace URI to be search for * @return an existing prefix that maps to the given URI, null if no prefix * maps to the given namespace URI. */	TokenNameCOMMENT_JAVADOC	 Given a namespace uri, and the namespaces mappings for the current element, return the current prefix for that uri. * @param uri the namespace URI to be search for @return an existing prefix that maps to the given URI, null if no prefix maps to the given namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
foundPrefix	TokenNameIdentifier	 found Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri2	TokenNameIdentifier	 uri2
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri2	TokenNameIdentifier	 uri2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri2	TokenNameIdentifier	 uri2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundPrefix	TokenNameIdentifier	 found Prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
foundPrefix	TokenNameIdentifier	 found Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MappingRecord	TokenNameIdentifier	 Mapping Record
getMappingFromURI	TokenNameIdentifier	 get Mapping From URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MappingRecord	TokenNameIdentifier	 Mapping Record
foundMap	TokenNameIdentifier	 found Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MappingRecord	TokenNameIdentifier	 Mapping Record
map2	TokenNameIdentifier	 map2
=	TokenNameEQUAL	
getMappingFromPrefix	TokenNameIdentifier	 get Mapping From Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map2	TokenNameIdentifier	 map2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
map2	TokenNameIdentifier	 map2
.	TokenNameDOT	
m_uri	TokenNameIdentifier	 m uri
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundMap	TokenNameIdentifier	 found Map
=	TokenNameEQUAL	
map2	TokenNameIdentifier	 map2
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
foundMap	TokenNameIdentifier	 found Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Undeclare the namespace that is currently pointed to by a given prefix */	TokenNameCOMMENT_JAVADOC	 Undeclare the namespace that is currently pointed to by a given prefix 
boolean	TokenNameboolean	
popNamespace	TokenNameIdentifier	 pop Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Prefixes "xml" and "xmlns" cannot be redefined 	TokenNameCOMMENT_LINE	Prefixes "xml" and "xmlns" cannot be redefined 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
getPrefixStack	TokenNameIdentifier	 get Prefix Stack
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Declare a mapping of a prefix to namespace URI at the given element depth. * @param prefix a String with the prefix for a qualified name * @param uri a String with the uri to which the prefix is to map * @param elemDepth the depth of current declaration */	TokenNameCOMMENT_JAVADOC	 Declare a mapping of a prefix to namespace URI at the given element depth. @param prefix a String with the prefix for a qualified name @param uri a String with the uri to which the prefix is to map @param elemDepth the depth of current declaration 
public	TokenNamepublic	
boolean	TokenNameboolean	
pushNamespace	TokenNameIdentifier	 push Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
elemDepth	TokenNameIdentifier	 elem Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Prefixes "xml" and "xmlns" cannot be redefined 	TokenNameCOMMENT_LINE	Prefixes "xml" and "xmlns" cannot be redefined 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
;	TokenNameSEMICOLON	
// Get the stack that contains URIs for the specified prefix 	TokenNameCOMMENT_LINE	Get the stack that contains URIs for the specified prefix 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MappingRecord	TokenNameIdentifier	 Mapping Record
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
m_uri	TokenNameIdentifier	 m uri
)	TokenNameRPAREN	
||	TokenNameOR_OR	
elemDepth	TokenNameIdentifier	 elem Depth
==	TokenNameEQUAL_EQUAL	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the same prefix/uri mapping is already on the stack 	TokenNameCOMMENT_LINE	If the same prefix/uri mapping is already on the stack 
// don't push this one. 	TokenNameCOMMENT_LINE	don't push this one. 
// Or if we have a mapping at the same depth 	TokenNameCOMMENT_LINE	Or if we have a mapping at the same depth 
// don't replace by pushing this one. 	TokenNameCOMMENT_LINE	don't replace by pushing this one. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
MappingRecord	TokenNameIdentifier	 Mapping Record
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
MappingRecord	TokenNameIdentifier	 Mapping Record
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
elemDepth	TokenNameIdentifier	 elem Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop, or undeclare all namespace definitions that are currently * declared at the given element depth, or deepter. * @param elemDepth the element depth for which mappings declared at this * depth or deeper will no longer be valid * @param saxHandler The ContentHandler to notify of any endPrefixMapping() * calls. This parameter can be null. */	TokenNameCOMMENT_JAVADOC	 Pop, or undeclare all namespace definitions that are currently declared at the given element depth, or deepter. @param elemDepth the element depth for which mappings declared at this depth or deeper will no longer be valid @param saxHandler The ContentHandler to notify of any endPrefixMapping() calls. This parameter can be null. 
void	TokenNamevoid	
popNamespaces	TokenNameIdentifier	 pop Namespaces
(	TokenNameLPAREN	
int	TokenNameint	
elemDepth	TokenNameIdentifier	 elem Depth
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
saxHandler	TokenNameIdentifier	 sax Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
MappingRecord	TokenNameIdentifier	 Mapping Record
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elemDepth	TokenNameIdentifier	 elem Depth
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
<	TokenNameLESS	
elemDepth	TokenNameIdentifier	 elem Depth
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
/* the depth of the declared mapping is elemDepth or deeper * so get rid of it */	TokenNameCOMMENT_BLOCK	 the depth of the declared mapping is elemDepth or deeper so get rid of it 
MappingRecord	TokenNameIdentifier	 Mapping Record
nm1	TokenNameIdentifier	 nm1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pop the node from the stack 	TokenNameCOMMENT_LINE	pop the node from the stack 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
Stack	TokenNameIdentifier	 Stack
prefixStack	TokenNameIdentifier	 prefix Stack
=	TokenNameEQUAL	
getPrefixStack	TokenNameIdentifier	 get Prefix Stack
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MappingRecord	TokenNameIdentifier	 Mapping Record
nm2	TokenNameIdentifier	 nm2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MappingRecord	TokenNameIdentifier	 Mapping Record
)	TokenNameRPAREN	
prefixStack	TokenNameIdentifier	 prefix Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nm1	TokenNameIdentifier	 nm1
==	TokenNameEQUAL_EQUAL	
nm2	TokenNameIdentifier	 nm2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It would be nice to always pop() but we 	TokenNameCOMMENT_LINE	It would be nice to always pop() but we 
// need to check that the prefix stack still has 	TokenNameCOMMENT_LINE	need to check that the prefix stack still has 
// the node we want to get rid of. This is because 	TokenNameCOMMENT_LINE	the node we want to get rid of. This is because 
// the optimization of essentially this situation: 	TokenNameCOMMENT_LINE	the optimization of essentially this situation: 
// <a xmlns:x="abc"><b xmlns:x="" xmlns:x="abc" /></a> 	TokenNameCOMMENT_LINE	<a xmlns:x="abc"><b xmlns:x="" xmlns:x="abc" /></a> 
// will remove both mappings in <b> because the 	TokenNameCOMMENT_LINE	will remove both mappings in <b> because the 
// new mapping is the same as the masked one and we get 	TokenNameCOMMENT_LINE	new mapping is the same as the masked one and we get 
// <a xmlns:x="abc"><b/></a> 	TokenNameCOMMENT_LINE	<a xmlns:x="abc"><b/></a> 
// So we are only removing xmlns:x="" or 	TokenNameCOMMENT_LINE	So we are only removing xmlns:x="" or 
// xmlns:x="abc" from the depth of element <b> 	TokenNameCOMMENT_LINE	xmlns:x="abc" from the depth of element <b> 
// when going back to <a> if in fact they have 	TokenNameCOMMENT_LINE	when going back to <a> if in fact they have 
// not been optimized away. 	TokenNameCOMMENT_LINE	not been optimized away. 
// 	TokenNameCOMMENT_LINE	 
prefixStack	TokenNameIdentifier	 prefix Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
saxHandler	TokenNameIdentifier	 sax Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
saxHandler	TokenNameIdentifier	 sax Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not much we can do if they aren't willing to listen 	TokenNameCOMMENT_LINE	not much we can do if they aren't willing to listen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Generate a new namespace prefix ( ns0, ns1 ...) not used before * @return String a new namespace prefix ( ns0, ns1, ns2 ...) */	TokenNameCOMMENT_JAVADOC	 Generate a new namespace prefix ( ns0, ns1 ...) not used before @return String a new namespace prefix ( ns0, ns1, ns2 ...) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
generateNextPrefix	TokenNameIdentifier	 generate Next Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ns"	TokenNameStringLiteral	ns
+	TokenNamePLUS	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method makes a clone of this object. * */	TokenNameCOMMENT_JAVADOC	 This method makes a clone of this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_nodeStack	TokenNameIdentifier	 m node Stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_namespaces	TokenNameIdentifier	 m namespaces
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_nodeStack	TokenNameIdentifier	 m node Stack
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initNamespaces	TokenNameIdentifier	 init Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just a little class that ties the 3 fields together * into one object, and this simplifies the pushing * and popping of namespaces to one push or one pop on * one stack rather than on 3 separate stacks. */	TokenNameCOMMENT_JAVADOC	 Just a little class that ties the 3 fields together into one object, and this simplifies the pushing and popping of namespaces to one push or one pop on one stack rather than on 3 separate stacks. 
class	TokenNameclass	
MappingRecord	TokenNameIdentifier	 Mapping Record
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
// the prefix 	TokenNameCOMMENT_LINE	the prefix 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
// the uri, possibly "" but never null 	TokenNameCOMMENT_LINE	the uri, possibly "" but never null 
// the depth of the element where declartion was made 	TokenNameCOMMENT_LINE	the depth of the element where declartion was made 
final	TokenNamefinal	
int	TokenNameint	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
;	TokenNameSEMICOLON	
MappingRecord	TokenNameIdentifier	 Mapping Record
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefix	TokenNameIdentifier	 m prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
m_uri	TokenNameIdentifier	 m uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
:	TokenNameCOLON	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Rather than using java.util.Stack, this private class * provides a minimal subset of methods and is faster * because it is not thread-safe. */	TokenNameCOMMENT_JAVADOC	 Rather than using java.util.Stack, this private class provides a minimal subset of methods and is faster because it is not thread-safe. 
private	TokenNameprivate	
class	TokenNameclass	
Stack	TokenNameIdentifier	 Stack
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_stack	TokenNameIdentifier	 m stack
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
max	TokenNameIdentifier	 max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_stack	TokenNameIdentifier	 m stack
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
max	TokenNameIdentifier	 max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are just copying references to immutable MappingRecord objects here 	TokenNameCOMMENT_LINE	We are just copying references to immutable MappingRecord objects here 
// so it is OK if the clone has references to these. 	TokenNameCOMMENT_LINE	so it is OK if the clone has references to these. 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
top	TokenNameIdentifier	 top
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
<=	TokenNameLESS_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newMax	TokenNameIdentifier	 new Max
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
newMax	TokenNameIdentifier	 new Max
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_stack	TokenNameIdentifier	 m stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
newMax	TokenNameIdentifier	 new Max
;	TokenNameSEMICOLON	
m_stack	TokenNameIdentifier	 m stack
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
top	TokenNameIdentifier	 top
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
top	TokenNameIdentifier	 top
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// m_stack[top] = null; do we really care? 	TokenNameCOMMENT_LINE	m_stack[top] = null; do we really care? 
top	TokenNameIdentifier	 top
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
top	TokenNameIdentifier	 top
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stack	TokenNameIdentifier	 m stack
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A more type-safe way to get a stack of prefix mappings * from the Hashtable m_namespaces * (this is the only method that does the type cast). */	TokenNameCOMMENT_JAVADOC	 A more type-safe way to get a stack of prefix mappings from the Hashtable m_namespaces (this is the only method that does the type cast). 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
getPrefixStack	TokenNameIdentifier	 get Prefix Stack
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fs	TokenNameIdentifier	 fs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A more type-safe way of saving stacks under the * m_namespaces Hashtable. */	TokenNameCOMMENT_JAVADOC	 A more type-safe way of saving stacks under the m_namespaces Hashtable. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
createPrefixStack	TokenNameIdentifier	 create Prefix Stack
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stack	TokenNameIdentifier	 Stack
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fs	TokenNameIdentifier	 fs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a namespace uri, get all prefixes bound to the Namespace URI in the current scope. * * @param uri the namespace URI to be search for * @return An array of Strings which are * all prefixes bound to the namespace URI in the current scope. * An array of zero elements is returned if no prefixes map to the given * namespace URI. */	TokenNameCOMMENT_JAVADOC	 Given a namespace uri, get all prefixes bound to the Namespace URI in the current scope. * @param uri the namespace URI to be search for @return An array of Strings which are all prefixes bound to the namespace URI in the current scope. An array of zero elements is returned if no prefixes map to the given namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookupAllPrefixes	TokenNameIdentifier	 lookup All Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
foundPrefixes	TokenNameIdentifier	 found Prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
m_namespaces	TokenNameIdentifier	 m namespaces
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri2	TokenNameIdentifier	 uri2
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri2	TokenNameIdentifier	 uri2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri2	TokenNameIdentifier	 uri2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundPrefixes	TokenNameIdentifier	 found Prefixes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixArray	TokenNameIdentifier	 prefix Array
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
foundPrefixes	TokenNameIdentifier	 found Prefixes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
foundPrefixes	TokenNameIdentifier	 found Prefixes
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
prefixArray	TokenNameIdentifier	 prefix Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prefixArray	TokenNameIdentifier	 prefix Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
