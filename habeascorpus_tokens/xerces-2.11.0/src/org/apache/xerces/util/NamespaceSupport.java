/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
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
/** * Namespace support for XML document handlers. This class doesn't * perform any error checking and assumes that all strings passed * as arguments to methods are unique symbols. The SymbolTable class * can be used for this purpose. * * @author Andy Clark, IBM * * @version $Id: NamespaceSupport.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Namespace support for XML document handlers. This class doesn't perform any error checking and assumes that all strings passed as arguments to methods are unique symbols. The SymbolTable class can be used for this purpose. * @author Andy Clark, IBM * @version $Id: NamespaceSupport.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
implements	TokenNameimplements	
NamespaceContext	TokenNameIdentifier	 Namespace Context
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * Namespace binding information. This array is composed of a * series of tuples containing the namespace binding information: * &lt;prefix, uri&gt;. The default size can be set to anything * as long as it is a power of 2 greater than 1. * * @see #fNamespaceSize * @see #fContext */	TokenNameCOMMENT_JAVADOC	 Namespace binding information. This array is composed of a series of tuples containing the namespace binding information: &lt;prefix, uri&gt;. The default size can be set to anything as long as it is a power of 2 greater than 1. * @see #fNamespaceSize @see #fContext 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The top of the namespace information array. */	TokenNameCOMMENT_JAVADOC	 The top of the namespace information array. 
protected	TokenNameprotected	
int	TokenNameint	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
// NOTE: The constructor depends on the initial context size 	TokenNameCOMMENT_LINE	NOTE: The constructor depends on the initial context size 
// being at least 1. -Ac 	TokenNameCOMMENT_LINE	being at least 1. -Ac 
/** * Context indexes. This array contains indexes into the namespace * information array. The index at the current context is the start * index of declared namespace bindings and runs to the size of the * namespace information array. * * @see #fNamespaceSize */	TokenNameCOMMENT_JAVADOC	 Context indexes. This array contains indexes into the namespace information array. The index at the current context is the start index of declared namespace bindings and runs to the size of the namespace information array. * @see #fNamespaceSize 
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fContext	TokenNameIdentifier	 f Context
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The current context. */	TokenNameCOMMENT_JAVADOC	 The current context. 
protected	TokenNameprotected	
int	TokenNameint	
fCurrentContext	TokenNameIdentifier	 f Current Context
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fPrefixes	TokenNameIdentifier	 f Prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a namespace context object and initializes it with * the prefixes declared in the specified context. */	TokenNameCOMMENT_JAVADOC	 Constructs a namespace context object and initializes it with the prefixes declared in the specified context. 
public	TokenNamepublic	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
(	TokenNameLPAREN	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy declaration in the context 	TokenNameCOMMENT_LINE	copy declaration in the context 
Enumeration	TokenNameIdentifier	 Enumeration
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getAllPrefixes	TokenNameIdentifier	 get All Prefixes
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
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(NamespaceContext) 	TokenNameCOMMENT_LINE	<init>(NamespaceContext) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * @see org.apache.xerces.xni.NamespaceContext#reset() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#reset() 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reset namespace and context info 	TokenNameCOMMENT_LINE	reset namespace and context info 
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentContext	TokenNameIdentifier	 f Current Context
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
// bind "xml" prefix to the XML uri 	TokenNameCOMMENT_LINE	bind "xml" prefix to the XML uri 
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
;	TokenNameSEMICOLON	
// bind "xmlns" prefix to the XMLNS uri 	TokenNameCOMMENT_LINE	bind "xmlns" prefix to the XMLNS uri 
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
fCurrentContext	TokenNameIdentifier	 f Current Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset(SymbolTable) 	TokenNameCOMMENT_LINE	reset(SymbolTable) 
/** * @see org.apache.xerces.xni.NamespaceContext#pushContext() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#pushContext() 
public	TokenNamepublic	
void	TokenNamevoid	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// extend the array, if necessary 	TokenNameCOMMENT_LINE	extend the array, if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentContext	TokenNameIdentifier	 f Current Context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
fContext	TokenNameIdentifier	 f Context
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
fContext	TokenNameIdentifier	 f Context
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
fContext	TokenNameIdentifier	 f Context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
contextarray	TokenNameIdentifier	 contextarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fContext	TokenNameIdentifier	 f Context
=	TokenNameEQUAL	
contextarray	TokenNameIdentifier	 contextarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// push context 	TokenNameCOMMENT_LINE	push context 
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pushContext() 	TokenNameCOMMENT_LINE	pushContext() 
/** * @see org.apache.xerces.xni.NamespaceContext#popContext() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#popContext() 
public	TokenNamepublic	
void	TokenNamevoid	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// popContext() 	TokenNameCOMMENT_LINE	popContext() 
/** * @see org.apache.xerces.xni.NamespaceContext#declarePrefix(String, String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#declarePrefix(String, String) 
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
// ignore "xml" and "xmlns" prefixes 	TokenNameCOMMENT_LINE	ignore "xml" and "xmlns" prefixes 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// see if prefix already exists in current context 	TokenNameCOMMENT_LINE	see if prefix already exists in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
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
// REVISIT: [Q] Should the new binding override the 	TokenNameCOMMENT_LINE	REVISIT: [Q] Should the new binding override the 
// previously declared binding or should it 	TokenNameCOMMENT_LINE	previously declared binding or should it 
// it be ignored? -Ac 	TokenNameCOMMENT_LINE	it be ignored? -Ac 
// NOTE: The SAX2 "NamespaceSupport" helper allows 	TokenNameCOMMENT_LINE	NOTE: The SAX2 "NamespaceSupport" helper allows 
// re-bindings with the new binding overwriting 	TokenNameCOMMENT_LINE	re-bindings with the new binding overwriting 
// the previous binding. -Ac 	TokenNameCOMMENT_LINE	the previous binding. -Ac 
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// resize array, if needed 	TokenNameCOMMENT_LINE	resize array, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
==	TokenNameEQUAL_EQUAL	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespacearray	TokenNameIdentifier	 namespacearray
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
namespacearray	TokenNameIdentifier	 namespacearray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
namespacearray	TokenNameIdentifier	 namespacearray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind prefix to uri in current context 	TokenNameCOMMENT_LINE	bind prefix to uri in current context 
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// declarePrefix(String,String):boolean 	TokenNameCOMMENT_LINE	declarePrefix(String,String):boolean 
/** * @see org.apache.xerces.xni.NamespaceContext#getURI(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#getURI(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find prefix in current context 	TokenNameCOMMENT_LINE	find prefix in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
// getURI(String):String 	TokenNameCOMMENT_LINE	getURI(String):String 
/** * @see org.apache.xerces.xni.NamespaceContext#getPrefix(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#getPrefix(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find uri in current context 	TokenNameCOMMENT_LINE	find uri in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
// getPrefix(String):String 	TokenNameCOMMENT_LINE	getPrefix(String):String 
/** * @see org.apache.xerces.xni.NamespaceContext#getDeclaredPrefixCount() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#getDeclaredPrefixCount() 
public	TokenNamepublic	
int	TokenNameint	
getDeclaredPrefixCount	TokenNameIdentifier	 get Declared Prefix Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
-	TokenNameMINUS	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDeclaredPrefixCount():int 	TokenNameCOMMENT_LINE	getDeclaredPrefixCount():int 
/** * @see org.apache.xerces.xni.NamespaceContext#getDeclaredPrefixAt(int) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#getDeclaredPrefixAt(int) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDeclaredPrefixAt	TokenNameIdentifier	 get Declared Prefix At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
]	TokenNameRBRACKET	
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDeclaredPrefixAt(int):String 	TokenNameCOMMENT_LINE	getDeclaredPrefixAt(int):String 
/** * @see org.apache.xerces.xni.NamespaceContext#getAllPrefixes() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xni.NamespaceContext#getAllPrefixes() 
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
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
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
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
/* * non-NamespaceContext methods */	TokenNameCOMMENT_BLOCK	 non-NamespaceContext methods 
/** * Checks whether a binding or unbinding for * the given prefix exists in the context. * * @param prefix The prefix to look up. * * @return true if the given prefix exists in the context */	TokenNameCOMMENT_JAVADOC	 Checks whether a binding or unbinding for the given prefix exists in the context. * @param prefix The prefix to look up. * @return true if the given prefix exists in the context 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsPrefix	TokenNameIdentifier	 contains Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find prefix in current context 	TokenNameCOMMENT_LINE	find prefix in current context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// prefix not found 	TokenNameCOMMENT_LINE	prefix not found 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
class	TokenNameclass	
Prefixes	TokenNameIdentifier	 Prefixes
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for Prefixes. */	TokenNameCOMMENT_JAVADOC	 Constructor for Prefixes. 
public	TokenNamepublic	
Prefixes	TokenNameIdentifier	 Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixes	TokenNameIdentifier	 prefixes
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.util.Enumeration#hasMoreElements() */	TokenNameCOMMENT_JAVADOC	 @see java.util.Enumeration#hasMoreElements() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.util.Enumeration#nextElement() */	TokenNameCOMMENT_JAVADOC	 @see java.util.Enumeration#nextElement() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fPrefixes	TokenNameIdentifier	 f Prefixes
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
"Illegal access to Namespace prefixes enumeration."	TokenNameStringLiteral	Illegal access to Namespace prefixes enumeration.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class NamespaceSupport 	TokenNameCOMMENT_LINE	class NamespaceSupport 
