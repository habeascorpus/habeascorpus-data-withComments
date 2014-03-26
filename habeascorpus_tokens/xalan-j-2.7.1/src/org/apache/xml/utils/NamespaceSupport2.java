/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NamespaceSupport2.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NamespaceSupport2.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Encapsulate Namespace tracking logic for use by SAX drivers. * * <p>This class is an attempt to rewrite the SAX NamespaceSupport * "helper" class for improved efficiency. It can be used to track the * namespace declarations currently in scope, providing lookup * routines to map prefixes to URIs and vice versa.</p> * * <p>ISSUE: For testing purposes, I've extended NamespaceSupport even * though I'm completely reasserting all behaviors and fields. * Wasteful.... But SAX did not put an interface under that object and * we seem to have written that SAX class into our APIs... and I don't * want to argue with it right now. </p> * * @see org.xml.sax.helpers.NamespaceSupport * */	TokenNameCOMMENT_JAVADOC	 Encapsulate Namespace tracking logic for use by SAX drivers. * <p>This class is an attempt to rewrite the SAX NamespaceSupport "helper" class for improved efficiency. It can be used to track the namespace declarations currently in scope, providing lookup routines to map prefixes to URIs and vice versa.</p> * <p>ISSUE: For testing purposes, I've extended NamespaceSupport even though I'm completely reasserting all behaviors and fields. Wasteful.... But SAX did not put an interface under that object and we seem to have written that SAX class into our APIs... and I don't want to argue with it right now. </p> * @see org.xml.sax.helpers.NamespaceSupport 
public	TokenNamepublic	
class	TokenNameclass	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
{	TokenNameLBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Internal state. 	TokenNameCOMMENT_LINE	Internal state. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
private	TokenNameprivate	
Context2	TokenNameIdentifier	 Context2
currentContext	TokenNameIdentifier	 current Context
;	TokenNameSEMICOLON	
// Current point on the double-linked stack 	TokenNameCOMMENT_LINE	Current point on the double-linked stack 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Constants. 	TokenNameCOMMENT_LINE	Constants. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * The XML Namespace as a constant. * * <p>This is the Namespace URI that is automatically mapped * to the "xml" prefix.</p> */	TokenNameCOMMENT_JAVADOC	 The XML Namespace as a constant. * <p>This is the Namespace URI that is automatically mapped to the "xml" prefix.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
XMLNS	TokenNameIdentifier	 XMLNS
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Constructor. 	TokenNameCOMMENT_LINE	Constructor. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Create a new Namespace support object. */	TokenNameCOMMENT_JAVADOC	 Create a new Namespace support object. 
public	TokenNamepublic	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Context management. 	TokenNameCOMMENT_LINE	Context management. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Reset this Namespace support object for reuse. * * <p>It is necessary to invoke this method before reusing the * Namespace support object for a new session.</p> */	TokenNameCOMMENT_JAVADOC	 Reset this Namespace support object for reuse. * <p>It is necessary to invoke this method before reusing the Namespace support object for a new session.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Discarding the whole stack doesn't save us a lot versus 	TokenNameCOMMENT_LINE	Discarding the whole stack doesn't save us a lot versus 
// creating a new NamespaceSupport. Do we care, or should we 	TokenNameCOMMENT_LINE	creating a new NamespaceSupport. Do we care, or should we 
// change this to just reset the root context? 	TokenNameCOMMENT_LINE	change this to just reset the root context? 
currentContext	TokenNameIdentifier	 current Context
=	TokenNameEQUAL	
new	TokenNamenew	
Context2	TokenNameIdentifier	 Context2
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
XMLNS	TokenNameIdentifier	 XMLNS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Start a new Namespace context. * * <p>Normally, you should push a new context at the beginning * of each XML element: the new context will automatically inherit * the declarations of its parent context, but it will also keep * track of which declarations were made within this context.</p> * * <p>The Namespace support object always starts with a base context * already in force: in this context, only the "xml" prefix is * declared.</p> * * @see #popContext */	TokenNameCOMMENT_JAVADOC	 Start a new Namespace context. * <p>Normally, you should push a new context at the beginning of each XML element: the new context will automatically inherit the declarations of its parent context, but it will also keep track of which declarations were made within this context.</p> * <p>The Namespace support object always starts with a base context already in force: in this context, only the "xml" prefix is declared.</p> * @see #popContext 
public	TokenNamepublic	
void	TokenNamevoid	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JJK: Context has a parent pointer. 	TokenNameCOMMENT_LINE	JJK: Context has a parent pointer. 
// That means we don't need a stack to pop. 	TokenNameCOMMENT_LINE	That means we don't need a stack to pop. 
// We may want to retain for reuse, but that can be done via 	TokenNameCOMMENT_LINE	We may want to retain for reuse, but that can be done via 
// a child pointer. 	TokenNameCOMMENT_LINE	a child pointer. 
Context2	TokenNameIdentifier	 Context2
parentContext	TokenNameIdentifier	 parent Context
=	TokenNameEQUAL	
currentContext	TokenNameIdentifier	 current Context
;	TokenNameSEMICOLON	
currentContext	TokenNameIdentifier	 current Context
=	TokenNameEQUAL	
parentContext	TokenNameIdentifier	 parent Context
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentContext	TokenNameIdentifier	 current Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentContext	TokenNameIdentifier	 current Context
=	TokenNameEQUAL	
new	TokenNamenew	
Context2	TokenNameIdentifier	 Context2
(	TokenNameLPAREN	
parentContext	TokenNameIdentifier	 parent Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// JJK: This will wipe out any leftover data 	TokenNameCOMMENT_LINE	JJK: This will wipe out any leftover data 
// if we're reusing a previously allocated Context. 	TokenNameCOMMENT_LINE	if we're reusing a previously allocated Context. 
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parentContext	TokenNameIdentifier	 parent Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Revert to the previous Namespace context. * * <p>Normally, you should pop the context at the end of each * XML element. After popping the context, all Namespace prefix * mappings that were previously in force are restored.</p> * * <p>You must not attempt to declare additional Namespace * prefixes after popping a context, unless you push another * context first.</p> * * @see #pushContext */	TokenNameCOMMENT_JAVADOC	 Revert to the previous Namespace context. * <p>Normally, you should pop the context at the end of each XML element. After popping the context, all Namespace prefix mappings that were previously in force are restored.</p> * <p>You must not attempt to declare additional Namespace prefixes after popping a context, unless you push another context first.</p> * @see #pushContext 
public	TokenNamepublic	
void	TokenNamevoid	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Context2	TokenNameIdentifier	 Context2
parentContext	TokenNameIdentifier	 parent Context
=	TokenNameEQUAL	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentContext	TokenNameIdentifier	 parent Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
currentContext	TokenNameIdentifier	 current Context
=	TokenNameEQUAL	
parentContext	TokenNameIdentifier	 parent Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Operations within a context. 	TokenNameCOMMENT_LINE	Operations within a context. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Declare a Namespace prefix. * * <p>This method declares a prefix in the current Namespace * context; the prefix will remain in force until this context * is popped, unless it is shadowed in a descendant context.</p> * * <p>To declare a default Namespace, use the empty string. The * prefix must not be "xml" or "xmlns".</p> * * <p>Note that you must <em>not</em> declare a prefix after * you've pushed and popped another Namespace.</p> * * <p>Note that there is an asymmetry in this library: while {@link * #getPrefix getPrefix} will not return the default "" prefix, * even if you have declared one; to check for a default prefix, * you have to look it up explicitly using {@link #getURI getURI}. * This asymmetry exists to make it easier to look up prefixes * for attribute names, where the default prefix is not allowed.</p> * * @param prefix The prefix to declare, or null for the empty * string. * @param uri The Namespace URI to associate with the prefix. * @return true if the prefix was legal, false otherwise * @see #processName * @see #getURI * @see #getPrefix */	TokenNameCOMMENT_JAVADOC	 Declare a Namespace prefix. * <p>This method declares a prefix in the current Namespace context; the prefix will remain in force until this context is popped, unless it is shadowed in a descendant context.</p> * <p>To declare a default Namespace, use the empty string. The prefix must not be "xml" or "xmlns".</p> * <p>Note that you must <em>not</em> declare a prefix after you've pushed and popped another Namespace.</p> * <p>Note that there is an asymmetry in this library: while {@link #getPrefix getPrefix} will not return the default "" prefix, even if you have declared one; to check for a default prefix, you have to look it up explicitly using {@link #getURI getURI}. This asymmetry exists to make it easier to look up prefixes for attribute names, where the default prefix is not allowed.</p> * @param prefix The prefix to declare, or null for the empty string. @param uri The Namespace URI to associate with the prefix. @return true if the prefix was legal, false otherwise @see #processName @see #getURI @see #getPrefix 
public	TokenNamepublic	
boolean	TokenNameboolean	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a raw XML 1.0 name. * * <p>This method processes a raw XML 1.0 name in the current * context by removing the prefix and looking it up among the * prefixes currently declared. The return value will be the * array supplied by the caller, filled in as follows:</p> * * <dl> * <dt>parts[0]</dt> * <dd>The Namespace URI, or an empty string if none is * in use.</dd> * <dt>parts[1]</dt> * <dd>The local name (without prefix).</dd> * <dt>parts[2]</dt> * <dd>The original raw name.</dd> * </dl> * * <p>All of the strings in the array will be internalized. If * the raw name has a prefix that has not been declared, then * the return value will be null.</p> * * <p>Note that attribute names are processed differently than * element names: an unprefixed element name will received the * default Namespace (if any), while an unprefixed element name * will not.</p> * * @param qName The raw XML 1.0 name to be processed. * @param parts A string array supplied by the caller, capable of * holding at least three members. * @param isAttribute A flag indicating whether this is an * attribute name (true) or an element name (false). * @return The supplied array holding three internalized strings * representing the Namespace URI (or empty string), the * local name, and the raw XML 1.0 name; or null if there * is an undeclared prefix. * @see #declarePrefix * @see java.lang.String#intern */	TokenNameCOMMENT_JAVADOC	 Process a raw XML 1.0 name. * <p>This method processes a raw XML 1.0 name in the current context by removing the prefix and looking it up among the prefixes currently declared. The return value will be the array supplied by the caller, filled in as follows:</p> * <dl> <dt>parts[0]</dt> <dd>The Namespace URI, or an empty string if none is in use.</dd> <dt>parts[1]</dt> <dd>The local name (without prefix).</dd> <dt>parts[2]</dt> <dd>The original raw name.</dd> </dl> * <p>All of the strings in the array will be internalized. If the raw name has a prefix that has not been declared, then the return value will be null.</p> * <p>Note that attribute names are processed differently than element names: an unprefixed element name will received the default Namespace (if any), while an unprefixed element name will not.</p> * @param qName The raw XML 1.0 name to be processed. @param parts A string array supplied by the caller, capable of holding at least three members. @param isAttribute A flag indicating whether this is an attribute name (true) or an element name (false). @return The supplied array holding three internalized strings representing the Namespace URI (or empty string), the local name, and the raw XML 1.0 name; or null if there is an undeclared prefix. @see #declarePrefix @see java.lang.String#intern 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
processName	TokenNameIdentifier	 process Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
processName	TokenNameIdentifier	 process Name
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
isAttribute	TokenNameIdentifier	 is Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// JJK: This recopying is required because processName may return 	TokenNameCOMMENT_LINE	JJK: This recopying is required because processName may return 
// a cached result. I Don't Like It. ***** 	TokenNameCOMMENT_LINE	a cached result. I Don't Like It. ***** 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parts	TokenNameIdentifier	 parts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up a prefix and get the currently-mapped Namespace URI. * * <p>This method looks up the prefix in the current context. * Use the empty string ("") for the default Namespace.</p> * * @param prefix The prefix to look up. * @return The associated Namespace URI, or null if the prefix * is undeclared in this context. * @see #getPrefix * @see #getPrefixes */	TokenNameCOMMENT_JAVADOC	 Look up a prefix and get the currently-mapped Namespace URI. * <p>This method looks up the prefix in the current context. Use the empty string ("") for the default Namespace.</p> * @param prefix The prefix to look up. @return The associated Namespace URI, or null if the prefix is undeclared in this context. @see #getPrefix @see #getPrefixes 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an enumeration of all prefixes currently declared. * * <p><strong>Note:</strong> if there is a default prefix, it will not be * returned in this enumeration; check for the default prefix * using the {@link #getURI getURI} with an argument of "".</p> * * @return An enumeration of all prefixes declared in the * current context except for the empty (default) * prefix. * @see #getDeclaredPrefixes * @see #getURI */	TokenNameCOMMENT_JAVADOC	 Return an enumeration of all prefixes currently declared. * <p><strong>Note:</strong> if there is a default prefix, it will not be returned in this enumeration; check for the default prefix using the {@link #getURI getURI} with an argument of "".</p> * @return An enumeration of all prefixes declared in the current context except for the empty (default) prefix. @see #getDeclaredPrefixes @see #getURI 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return one of the prefixes mapped to a Namespace URI. * * <p>If more than one prefix is currently mapped to the same * URI, this method will make an arbitrary selection; if you * want all of the prefixes, use the {@link #getPrefixes} * method instead.</p> * * <p><strong>Note:</strong> this will never return the empty * (default) prefix; to check for a default prefix, use the {@link * #getURI getURI} method with an argument of "".</p> * * @param uri The Namespace URI. * @return One of the prefixes currently mapped to the URI supplied, * or null if none is mapped or if the URI is assigned to * the default Namespace. * @see #getPrefixes(java.lang.String) * @see #getURI */	TokenNameCOMMENT_JAVADOC	 Return one of the prefixes mapped to a Namespace URI. * <p>If more than one prefix is currently mapped to the same URI, this method will make an arbitrary selection; if you want all of the prefixes, use the {@link #getPrefixes} method instead.</p> * <p><strong>Note:</strong> this will never return the empty (default) prefix; to check for a default prefix, use the {@link #getURI getURI} method with an argument of "".</p> * @param uri The Namespace URI. @return One of the prefixes currently mapped to the URI supplied, or null if none is mapped or if the URI is assigned to the default Namespace. @see #getPrefixes(java.lang.String) @see #getURI 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an enumeration of all prefixes currently declared for a URI. * * <p>This method returns prefixes mapped to a specific Namespace * URI. The xml: prefix will be included. If you want only one * prefix that's mapped to the Namespace URI, and you don't care * which one you get, use the {@link #getPrefix getPrefix} * method instead.</p> * * <p><strong>Note:</strong> the empty (default) prefix is * <em>never</em> included in this enumeration; to check for the * presence of a default Namespace, use the {@link #getURI getURI} * method with an argument of "".</p> * * @param uri The Namespace URI. * @return An enumeration of all prefixes declared in the * current context. * @see #getPrefix * @see #getDeclaredPrefixes * @see #getURI */	TokenNameCOMMENT_JAVADOC	 Return an enumeration of all prefixes currently declared for a URI. * <p>This method returns prefixes mapped to a specific Namespace URI. The xml: prefix will be included. If you want only one prefix that's mapped to the Namespace URI, and you don't care which one you get, use the {@link #getPrefix getPrefix} method instead.</p> * <p><strong>Note:</strong> the empty (default) prefix is <em>never</em> included in this enumeration; to check for the presence of a default Namespace, use the {@link #getURI getURI} method with an argument of "".</p> * @param uri The Namespace URI. @return An enumeration of all prefixes declared in the current context. @see #getPrefix @see #getDeclaredPrefixes @see #getURI 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JJK: The old code involved creating a vector, filling it 	TokenNameCOMMENT_LINE	JJK: The old code involved creating a vector, filling it 
// with all the matching prefixes, and then getting its 	TokenNameCOMMENT_LINE	with all the matching prefixes, and then getting its 
// elements enumerator. Wastes storage, wastes cycles if we 	TokenNameCOMMENT_LINE	elements enumerator. Wastes storage, wastes cycles if we 
// don't actually need them all. Better to either implement 	TokenNameCOMMENT_LINE	don't actually need them all. Better to either implement 
// a specific enumerator for these prefixes... or a filter 	TokenNameCOMMENT_LINE	a specific enumerator for these prefixes... or a filter 
// around the all-prefixes enumerator, which comes out to 	TokenNameCOMMENT_LINE	around the all-prefixes enumerator, which comes out to 
// roughly the same thing. 	TokenNameCOMMENT_LINE	roughly the same thing. 
// 	TokenNameCOMMENT_LINE	 
// **** Currently a filter. That may not be most efficient 	TokenNameCOMMENT_LINE	**** Currently a filter. That may not be most efficient 
// when I'm done restructuring storage! 	TokenNameCOMMENT_LINE	when I'm done restructuring storage! 
return	TokenNamereturn	
new	TokenNamenew	
PrefixForUriEnumerator	TokenNameIdentifier	 Prefix For Uri Enumerator
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an enumeration of all prefixes declared in this context. * * <p>The empty (default) prefix will be included in this * enumeration; note that this behaviour differs from that of * {@link #getPrefix} and {@link #getPrefixes}.</p> * * @return An enumeration of all prefixes declared in this * context. * @see #getPrefixes * @see #getURI */	TokenNameCOMMENT_JAVADOC	 Return an enumeration of all prefixes declared in this context. * <p>The empty (default) prefix will be included in this enumeration; note that this behaviour differs from that of {@link #getPrefix} and {@link #getPrefixes}.</p> * @return An enumeration of all prefixes declared in this context. @see #getPrefixes @see #getURI 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getDeclaredPrefixes	TokenNameIdentifier	 get Declared Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentContext	TokenNameIdentifier	 current Context
.	TokenNameDOT	
getDeclaredPrefixes	TokenNameIdentifier	 get Declared Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Local classes. 	TokenNameCOMMENT_LINE	Local classes. 
// These were _internal_ classes... but in fact they don't have to be, 	TokenNameCOMMENT_LINE	These were _internal_ classes... but in fact they don't have to be, 
// and may be more efficient if they aren't. 	TokenNameCOMMENT_LINE	and may be more efficient if they aren't. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Implementation of Enumeration filter, wrapped * aroung the get-all-prefixes version of the operation. This is NOT * necessarily the most efficient approach; finding the URI and then asking * what prefixes apply to it might make much more sense. */	TokenNameCOMMENT_JAVADOC	 Implementation of Enumeration filter, wrapped aroung the get-all-prefixes version of the operation. This is NOT necessarily the most efficient approach; finding the URI and then asking what prefixes apply to it might make much more sense. 
class	TokenNameclass	
PrefixForUriEnumerator	TokenNameIdentifier	 Prefix For Uri Enumerator
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
private	TokenNameprivate	
Enumeration	TokenNameIdentifier	 Enumeration
allPrefixes	TokenNameIdentifier	 all Prefixes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
nsup	TokenNameIdentifier	 nsup
;	TokenNameSEMICOLON	
// Kluge: Since one can't do a constructor on an 	TokenNameCOMMENT_LINE	Kluge: Since one can't do a constructor on an 
// anonymous class (as far as I know)... 	TokenNameCOMMENT_LINE	anonymous class (as far as I know)... 
PrefixForUriEnumerator	TokenNameIdentifier	 Prefix For Uri Enumerator
(	TokenNameLPAREN	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
nsup	TokenNameIdentifier	 nsup
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Enumeration	TokenNameIdentifier	 Enumeration
allPrefixes	TokenNameIdentifier	 all Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nsup	TokenNameIdentifier	 nsup
=	TokenNameEQUAL	
nsup	TokenNameIdentifier	 nsup
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
allPrefixes	TokenNameIdentifier	 all Prefixes
=	TokenNameEQUAL	
allPrefixes	TokenNameIdentifier	 all Prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
allPrefixes	TokenNameIdentifier	 all Prefixes
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
allPrefixes	TokenNameIdentifier	 all Prefixes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nsup	TokenNameIdentifier	 nsup
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
lookahead	TokenNameIdentifier	 lookahead
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal class for a single Namespace context. * * <p>This module caches and reuses Namespace contexts, so the number allocated * will be equal to the element depth of the document, not to the total * number of elements (i.e. 5-10 rather than tens of thousands).</p> */	TokenNameCOMMENT_JAVADOC	 Internal class for a single Namespace context. * <p>This module caches and reuses Namespace contexts, so the number allocated will be equal to the element depth of the document, not to the total number of elements (i.e. 5-10 rather than tens of thousands).</p> 
final	TokenNamefinal	
class	TokenNameclass	
Context2	TokenNameIdentifier	 Context2
{	TokenNameLBRACE	
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
// Manefest Constants 	TokenNameCOMMENT_LINE	Manefest Constants 
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
/** * An empty enumeration. */	TokenNameCOMMENT_JAVADOC	 An empty enumeration. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
EMPTY_ENUMERATION	TokenNameIdentifier	 EMPTY  ENUMERATION
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
// Protected state. 	TokenNameCOMMENT_LINE	Protected state. 
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
Hashtable	TokenNameIdentifier	 Hashtable
prefixTable	TokenNameIdentifier	 prefix Table
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
uriTable	TokenNameIdentifier	 uri Table
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
elementNameTable	TokenNameIdentifier	 element Name Table
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
attributeNameTable	TokenNameIdentifier	 attribute Name Table
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
defaultNS	TokenNameIdentifier	 default NS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
// Internal state. 	TokenNameCOMMENT_LINE	Internal state. 
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
declarations	TokenNameIdentifier	 declarations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
tablesDirty	TokenNameIdentifier	 tables Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Context2	TokenNameIdentifier	 Context2
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Context2	TokenNameIdentifier	 Context2
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Create a new Namespace context. */	TokenNameCOMMENT_JAVADOC	 Create a new Namespace context. 
Context2	TokenNameIdentifier	 Context2
(	TokenNameLPAREN	
Context2	TokenNameIdentifier	 Context2
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixTable	TokenNameIdentifier	 prefix Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriTable	TokenNameIdentifier	 uri Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elementNameTable	TokenNameIdentifier	 element Name Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @returns The child Namespace context object, or null if this * is the last currently on the chain. */	TokenNameCOMMENT_JAVADOC	 @returns The child Namespace context object, or null if this is the last currently on the chain. 
Context2	TokenNameIdentifier	 Context2
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @returns The parent Namespace context object, or null if this * is the root. */	TokenNameCOMMENT_JAVADOC	 @returns The parent Namespace context object, or null if this is the root. 
Context2	TokenNameIdentifier	 Context2
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * (Re)set the parent of this Namespace context. * This is separate from the c'tor because it's re-applied * when a Context2 is reused by push-after-pop. * * @param context The parent Namespace context object. */	TokenNameCOMMENT_JAVADOC	 (Re)set the parent of this Namespace context. This is separate from the c'tor because it's re-applied when a Context2 is reused by push-after-pop. * @param context The parent Namespace context object. 
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
Context2	TokenNameIdentifier	 Context2
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// JJK: Doubly-linked 	TokenNameCOMMENT_LINE	JJK: Doubly-linked 
declarations	TokenNameIdentifier	 declarations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prefixTable	TokenNameIdentifier	 prefix Table
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
prefixTable	TokenNameIdentifier	 prefix Table
;	TokenNameSEMICOLON	
uriTable	TokenNameIdentifier	 uri Table
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
uriTable	TokenNameIdentifier	 uri Table
;	TokenNameSEMICOLON	
elementNameTable	TokenNameIdentifier	 element Name Table
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
elementNameTable	TokenNameIdentifier	 element Name Table
;	TokenNameSEMICOLON	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
;	TokenNameSEMICOLON	
defaultNS	TokenNameIdentifier	 default NS
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
defaultNS	TokenNameIdentifier	 default NS
;	TokenNameSEMICOLON	
tablesDirty	TokenNameIdentifier	 tables Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Declare a Namespace prefix for this context. * * @param prefix The prefix to declare. * @param uri The associated Namespace URI. * @see org.xml.sax.helpers.NamespaceSupport2#declarePrefix */	TokenNameCOMMENT_JAVADOC	 Declare a Namespace prefix for this context. * @param prefix The prefix to declare. @param uri The associated Namespace URI. @see org.xml.sax.helpers.NamespaceSupport2#declarePrefix 
void	TokenNamevoid	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Lazy processing... 	TokenNameCOMMENT_LINE	Lazy processing... 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tablesDirty	TokenNameIdentifier	 tables Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copyTables	TokenNameIdentifier	 copy Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
declarations	TokenNameIdentifier	 declarations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
declarations	TokenNameIdentifier	 declarations
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultNS	TokenNameIdentifier	 default NS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
defaultNS	TokenNameIdentifier	 default NS
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefixTable	TokenNameIdentifier	 prefix Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriTable	TokenNameIdentifier	 uri Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may wipe out another prefix 	TokenNameCOMMENT_LINE	may wipe out another prefix 
}	TokenNameRBRACE	
declarations	TokenNameIdentifier	 declarations
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a raw XML 1.0 name in this context. * * @param qName The raw XML 1.0 name. * @param isAttribute true if this is an attribute name. * @return An array of three strings containing the * URI part (or empty string), the local part, * and the raw name, all internalized, or null * if there is an undeclared prefix. * @see org.xml.sax.helpers.NamespaceSupport2#processName */	TokenNameCOMMENT_JAVADOC	 Process a raw XML 1.0 name in this context. * @param qName The raw XML 1.0 name. @param isAttribute true if this is an attribute name. @return An array of three strings containing the URI part (or empty string), the local part, and the raw name, all internalized, or null if there is an undeclared prefix. @see org.xml.sax.helpers.NamespaceSupport2#processName 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
processName	TokenNameIdentifier	 process Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
// Select the appropriate table. 	TokenNameCOMMENT_LINE	Select the appropriate table. 
if	TokenNameif	
(	TokenNameLPAREN	
isAttribute	TokenNameIdentifier	 is Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elementNameTable	TokenNameIdentifier	 element Name Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
elementNameTable	TokenNameIdentifier	 element Name Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
elementNameTable	TokenNameIdentifier	 element Name Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Start by looking in the cache, and 	TokenNameCOMMENT_LINE	Start by looking in the cache, and 
// return immediately if the name 	TokenNameCOMMENT_LINE	return immediately if the name 
// is already known in this content 	TokenNameCOMMENT_LINE	is already known in this content 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We haven't seen this name in this 	TokenNameCOMMENT_LINE	We haven't seen this name in this 
// context before. 	TokenNameCOMMENT_LINE	context before. 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No prefix. 	TokenNameCOMMENT_LINE	No prefix. 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAttribute	TokenNameIdentifier	 is Attribute
||	TokenNameOR_OR	
defaultNS	TokenNameIdentifier	 default NS
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
defaultNS	TokenNameIdentifier	 default NS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Prefix 	TokenNameCOMMENT_LINE	Prefix 
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
defaultNS	TokenNameIdentifier	 default NS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixTable	TokenNameIdentifier	 prefix Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Save in the cache for future use. 	TokenNameCOMMENT_LINE	Save in the cache for future use. 
table	TokenNameIdentifier	 table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tablesDirty	TokenNameIdentifier	 tables Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the URI associated with a prefix in this context. * * @param prefix The prefix to look up. * @return The associated Namespace URI, or null if none is * declared. * @see org.xml.sax.helpers.NamespaceSupport2#getURI */	TokenNameCOMMENT_JAVADOC	 Look up the URI associated with a prefix in this context. * @param prefix The prefix to look up. @return The associated Namespace URI, or null if none is declared. @see org.xml.sax.helpers.NamespaceSupport2#getURI 
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultNS	TokenNameIdentifier	 default NS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefixTable	TokenNameIdentifier	 prefix Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
prefixTable	TokenNameIdentifier	 prefix Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Look up one of the prefixes associated with a URI in this context. * * <p>Since many prefixes may be mapped to the same URI, * the return value may be unreliable.</p> * * @param uri The URI to look up. * @return The associated prefix, or null if none is declared. * @see org.xml.sax.helpers.NamespaceSupport2#getPrefix */	TokenNameCOMMENT_JAVADOC	 Look up one of the prefixes associated with a URI in this context. * <p>Since many prefixes may be mapped to the same URI, the return value may be unreliable.</p> * @param uri The URI to look up. @return The associated prefix, or null if none is declared. @see org.xml.sax.helpers.NamespaceSupport2#getPrefix 
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uriTable	TokenNameIdentifier	 uri Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
uriTable	TokenNameIdentifier	 uri Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return an enumeration of prefixes declared in this context. * * @return An enumeration of prefixes (possibly empty). * @see org.xml.sax.helpers.NamespaceSupport2#getDeclaredPrefixes */	TokenNameCOMMENT_JAVADOC	 Return an enumeration of prefixes declared in this context. * @return An enumeration of prefixes (possibly empty). @see org.xml.sax.helpers.NamespaceSupport2#getDeclaredPrefixes 
Enumeration	TokenNameIdentifier	 Enumeration
getDeclaredPrefixes	TokenNameIdentifier	 get Declared Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
declarations	TokenNameIdentifier	 declarations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_ENUMERATION	TokenNameIdentifier	 EMPTY  ENUMERATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
declarations	TokenNameIdentifier	 declarations
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return an enumeration of all prefixes currently in force. * * <p>The default prefix, if in force, is <em>not</em> * returned, and will have to be checked for separately.</p> * * @return An enumeration of prefixes (never empty). * @see org.xml.sax.helpers.NamespaceSupport2#getPrefixes */	TokenNameCOMMENT_JAVADOC	 Return an enumeration of all prefixes currently in force. * <p>The default prefix, if in force, is <em>not</em> returned, and will have to be checked for separately.</p> * @return An enumeration of prefixes (never empty). @see org.xml.sax.helpers.NamespaceSupport2#getPrefixes 
Enumeration	TokenNameIdentifier	 Enumeration
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixTable	TokenNameIdentifier	 prefix Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_ENUMERATION	TokenNameIdentifier	 EMPTY  ENUMERATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefixTable	TokenNameIdentifier	 prefix Table
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
// Internal methods. 	TokenNameCOMMENT_LINE	Internal methods. 
//////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////// 
/** * Copy on write for the internal tables in this context. * * <p>This class is optimized for the normal case where most * elements do not contain Namespace declarations. In that case, * the Context2 will share data structures with its parent. * New tables are obtained only when new declarations are issued, * so they can be popped off the stack.</p> * * <p> JJK: **** Alternative: each Context2 might declare * _only_ its local bindings, and delegate upward if not found.</p> */	TokenNameCOMMENT_JAVADOC	 Copy on write for the internal tables in this context. * <p>This class is optimized for the normal case where most elements do not contain Namespace declarations. In that case, the Context2 will share data structures with its parent. New tables are obtained only when new declarations are issued, so they can be popped off the stack.</p> * <p> JJK: **** Alternative: each Context2 might declare _only_ its local bindings, and delegate upward if not found.</p> 
private	TokenNameprivate	
void	TokenNamevoid	
copyTables	TokenNameIdentifier	 copy Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Start by copying our parent's bindings 	TokenNameCOMMENT_LINE	Start by copying our parent's bindings 
prefixTable	TokenNameIdentifier	 prefix Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
prefixTable	TokenNameIdentifier	 prefix Table
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uriTable	TokenNameIdentifier	 uri Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
uriTable	TokenNameIdentifier	 uri Table
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace the caches with empty ones, rather than 	TokenNameCOMMENT_LINE	Replace the caches with empty ones, rather than 
// trying to determine which bindings should be flushed. 	TokenNameCOMMENT_LINE	trying to determine which bindings should be flushed. 
// As far as I can tell, these caches are never actually 	TokenNameCOMMENT_LINE	As far as I can tell, these caches are never actually 
// used in Xalan... More efficient to remove the whole 	TokenNameCOMMENT_LINE	used in Xalan... More efficient to remove the whole 
// cache system? **** 	TokenNameCOMMENT_LINE	cache system? **** 
if	TokenNameif	
(	TokenNameLPAREN	
elementNameTable	TokenNameIdentifier	 element Name Table
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
elementNameTable	TokenNameIdentifier	 element Name Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
attributeNameTable	TokenNameIdentifier	 attribute Name Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tablesDirty	TokenNameIdentifier	 tables Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of NamespaceSupport2.java 	TokenNameCOMMENT_LINE	end of NamespaceSupport2.java 
