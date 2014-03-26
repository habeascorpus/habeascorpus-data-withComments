/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xinclude	TokenNameIdentifier	 xinclude
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
/** * This implementation of NamespaceContext has the ability to maintain multiple * scopes of namespace/prefix bindings. This is useful in situations when it is * not always appropriate for elements to inherit the namespace bindings of their * ancestors (such as included elements in XInclude). * * When searching for a URI to match a prefix, or a prefix to match a URI, it is * searched for in the current context, then the ancestors of the current context, * up to the beginning of the current scope. Other scopes are not searched. * * @author Peter McCracken, IBM * * @version $Id: MultipleScopeNamespaceSupport.java 447243 2006-09-18 05:15:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This implementation of NamespaceContext has the ability to maintain multiple scopes of namespace/prefix bindings. This is useful in situations when it is not always appropriate for elements to inherit the namespace bindings of their ancestors (such as included elements in XInclude). * When searching for a URI to match a prefix, or a prefix to match a URI, it is searched for in the current context, then the ancestors of the current context, up to the beginning of the current scope. Other scopes are not searched. * @author Peter McCracken, IBM * @version $Id: MultipleScopeNamespaceSupport.java 447243 2006-09-18 05:15:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
MultipleScopeNamespaceSupport	TokenNameIdentifier	 Multiple Scope Namespace Support
extends	TokenNameextends	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fScope	TokenNameIdentifier	 f Scope
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
fCurrentScope	TokenNameIdentifier	 f Current Scope
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
MultipleScopeNamespaceSupport	TokenNameIdentifier	 Multiple Scope Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentScope	TokenNameIdentifier	 f Current Scope
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param context */	TokenNameCOMMENT_JAVADOC	 @param context 
public	TokenNamepublic	
MultipleScopeNamespaceSupport	TokenNameIdentifier	 Multiple Scope Namespace Support
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentScope	TokenNameIdentifier	 f Current Scope
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xni.NamespaceContext#getAllPrefixes() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xni.NamespaceContext#getAllPrefixes() 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getAllPrefixes	TokenNameIdentifier	 get All Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fPrefixes	TokenNameIdentifier	 f Prefixes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resize prefix array 	TokenNameCOMMENT_LINE	resize prefix array 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fPrefixes	TokenNameIdentifier	 f Prefixes
=	TokenNameEQUAL	
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
fCurrentScope	TokenNameIdentifier	 f Current Scope
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fPrefixes	TokenNameIdentifier	 f Prefixes
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unique	TokenNameIdentifier	 unique
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unique	TokenNameIdentifier	 unique
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fPrefixes	TokenNameIdentifier	 f Prefixes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unique	TokenNameIdentifier	 unique
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Prefixes	TokenNameIdentifier	 Prefixes
(	TokenNameLPAREN	
fPrefixes	TokenNameIdentifier	 f Prefixes
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getScopeForContext	TokenNameIdentifier	 get Scope For Context
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
fCurrentScope	TokenNameIdentifier	 f Current Scope
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
<	TokenNameLESS	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
scope	TokenNameIdentifier	 scope
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scope	TokenNameIdentifier	 scope
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xni.NamespaceContext#getPrefix(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xni.NamespaceContext#getPrefix(java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
fCurrentScope	TokenNameIdentifier	 f Current Scope
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xni.NamespaceContext#getURI(java.lang.String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xni.NamespaceContext#getURI(java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
fCurrentScope	TokenNameIdentifier	 f Current Scope
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
context	TokenNameIdentifier	 context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
getScopeForContext	TokenNameIdentifier	 get Scope For Context
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
context	TokenNameIdentifier	 context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
getScopeForContext	TokenNameIdentifier	 get Scope For Context
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this saves us from having a copy of each of these in fNamespace for each scope 	TokenNameCOMMENT_LINE	this saves us from having a copy of each of these in fNamespace for each scope 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find uri in current context 	TokenNameCOMMENT_LINE	find uri in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// uri not found 	TokenNameCOMMENT_LINE	uri not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this saves us from having a copy of each of these in fNamespace for each scope 	TokenNameCOMMENT_LINE	this saves us from having a copy of each of these in fNamespace for each scope 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find prefix in current context 	TokenNameCOMMENT_LINE	find prefix in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// prefix not found 	TokenNameCOMMENT_LINE	prefix not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Only resets the current scope -- all namespaces defined in lower scopes * remain valid after a call to reset. */	TokenNameCOMMENT_JAVADOC	 Only resets the current scope -- all namespaces defined in lower scopes remain valid after a call to reset. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentContext	TokenNameIdentifier	 f Current Context
=	TokenNameEQUAL	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
fCurrentScope	TokenNameIdentifier	 f Current Scope
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Begins a new scope. None of the previous namespace bindings will be used, * until the new scope is popped with popScope() */	TokenNameCOMMENT_JAVADOC	 Begins a new scope. None of the previous namespace bindings will be used, until the new scope is popped with popScope() 
public	TokenNamepublic	
void	TokenNamevoid	
pushScope	TokenNameIdentifier	 push Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentScope	TokenNameIdentifier	 f Current Scope
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
fScope	TokenNameIdentifier	 f Scope
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
contextarray	TokenNameIdentifier	 contextarray
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fScope	TokenNameIdentifier	 f Scope
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fScope	TokenNameIdentifier	 f Scope
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
contextarray	TokenNameIdentifier	 contextarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fScope	TokenNameIdentifier	 f Scope
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fScope	TokenNameIdentifier	 f Scope
=	TokenNameEQUAL	
contextarray	TokenNameIdentifier	 contextarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentScope	TokenNameIdentifier	 f Current Scope
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentContext	TokenNameIdentifier	 f Current Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pops the current scope. The namespace bindings from the new current scope * are then used for searching for namespaces and prefixes. */	TokenNameCOMMENT_JAVADOC	 Pops the current scope. The namespace bindings from the new current scope are then used for searching for namespaces and prefixes. 
public	TokenNamepublic	
void	TokenNamevoid	
popScope	TokenNameIdentifier	 pop Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentContext	TokenNameIdentifier	 f Current Context
=	TokenNameEQUAL	
fScope	TokenNameIdentifier	 f Scope
[	TokenNameLBRACKET	
fCurrentScope	TokenNameIdentifier	 f Current Scope
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
