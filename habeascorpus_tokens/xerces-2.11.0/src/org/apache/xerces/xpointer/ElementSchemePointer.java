/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xpointer	TokenNameIdentifier	 xpointer
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
XMLChar	TokenNameIdentifier	 XML Char
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
Augmentations	TokenNameIdentifier	 Augmentations
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
QName	TokenNameIdentifier	 Q Name
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
XMLAttributes	TokenNameIdentifier	 XML Attributes
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
XNIException	TokenNameIdentifier	 XNI Exception
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
;	TokenNameSEMICOLON	
/** * <p> * Implements the XPointerPart interface for element() scheme specific processing. * </p> * * @xerces.internal * * @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p> Implements the XPointerPart interface for element() scheme specific processing. </p> * @xerces.internal * @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
ElementSchemePointer	TokenNameIdentifier	 Element Scheme Pointer
implements	TokenNameimplements	
XPointerPart	TokenNameIdentifier	 X Pointer Part
{	TokenNameLBRACE	
// Fields 	TokenNameCOMMENT_LINE	Fields 
// The Scheme Name i.e element 	TokenNameCOMMENT_LINE	The Scheme Name i.e element 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fSchemeName	TokenNameIdentifier	 f Scheme Name
;	TokenNameSEMICOLON	
// The scheme Data 	TokenNameCOMMENT_LINE	The scheme Data 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fSchemeData	TokenNameIdentifier	 f Scheme Data
;	TokenNameSEMICOLON	
// The scheme Data & child sequence 	TokenNameCOMMENT_LINE	The scheme Data & child sequence 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fShortHandPointerName	TokenNameIdentifier	 f Short Hand Pointer Name
;	TokenNameSEMICOLON	
// Should we attempt to resolve the ChildSequence from the 	TokenNameCOMMENT_LINE	Should we attempt to resolve the ChildSequence from the 
// current element position. If a ShortHand Pointer is present 	TokenNameCOMMENT_LINE	current element position. If a ShortHand Pointer is present 
// attempt to resolve relative to the short hand pointer. 	TokenNameCOMMENT_LINE	attempt to resolve relative to the short hand pointer. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Has the element been found 	TokenNameCOMMENT_LINE	Has the element been found 
private	TokenNameprivate	
boolean	TokenNameboolean	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Was only an empty element found 	TokenNameCOMMENT_LINE	Was only an empty element found 
private	TokenNameprivate	
boolean	TokenNameboolean	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// If a shorthand pointer is present and resolved 	TokenNameCOMMENT_LINE	If a shorthand pointer is present and resolved 
boolean	TokenNameboolean	
fIsShortHand	TokenNameIdentifier	 f Is Short Hand
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// The depth at which the element was found 	TokenNameCOMMENT_LINE	The depth at which the element was found 
int	TokenNameint	
fFoundDepth	TokenNameIdentifier	 f Found Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The XPointer element child sequence 	TokenNameCOMMENT_LINE	The XPointer element child sequence 
private	TokenNameprivate	
int	TokenNameint	
fChildSequence	TokenNameIdentifier	 f Child Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// The current child position 	TokenNameCOMMENT_LINE	The current child position 
private	TokenNameprivate	
int	TokenNameint	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The current child depth 	TokenNameCOMMENT_LINE	The current child depth 
private	TokenNameprivate	
int	TokenNameint	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The current element's child sequence 	TokenNameCOMMENT_LINE	The current element's child sequence 
private	TokenNameprivate	
int	TokenNameint	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
// Stores if the Fragment was resolved by the pointer 	TokenNameCOMMENT_LINE	Stores if the Fragment was resolved by the pointer 
private	TokenNameprivate	
boolean	TokenNameboolean	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Stores if the Fragment was resolved by the pointer 	TokenNameCOMMENT_LINE	Stores if the Fragment was resolved by the pointer 
private	TokenNameprivate	
ShortHandPointer	TokenNameIdentifier	 Short Hand Pointer
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
;	TokenNameSEMICOLON	
// The XPointer Error reporter 	TokenNameCOMMENT_LINE	The XPointer Error reporter 
protected	TokenNameprotected	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
fErrorReporter	TokenNameIdentifier	 f Error Reporter
;	TokenNameSEMICOLON	
// The XPointer Error Handler 	TokenNameCOMMENT_LINE	The XPointer Error Handler 
protected	TokenNameprotected	
XMLErrorHandler	TokenNameIdentifier	 XML Error Handler
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
public	TokenNamepublic	
ElementSchemePointer	TokenNameIdentifier	 Element Scheme Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementSchemePointer	TokenNameIdentifier	 Element Scheme Pointer
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementSchemePointer	TokenNameIdentifier	 Element Scheme Pointer
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
errorReporter	TokenNameIdentifier	 error Reporter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
errorReporter	TokenNameIdentifier	 error Reporter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// XPointerPart implementation 	TokenNameCOMMENT_LINE	XPointerPart implementation 
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
/** * Parses the XPointer expression and tokenizes it into Strings * delimited by whitespace. * * @see org.apache.xerces.xpointer.XPointerProcessor#parseXPointer(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Parses the XPointer expression and tokenizes it into Strings delimited by whitespace. * @see org.apache.xerces.xpointer.XPointerProcessor#parseXPointer(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
parseXPointer	TokenNameIdentifier	 parse X Pointer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpointer	TokenNameIdentifier	 xpointer
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tokens 	TokenNameCOMMENT_LINE	tokens 
final	TokenNamefinal	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
Tokens	TokenNameIdentifier	 Tokens
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// scanner 	TokenNameCOMMENT_LINE	scanner 
Scanner	TokenNameIdentifier	 Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_CHILD	TokenNameIdentifier	 XPTRTOKEN  ELEM  CHILD
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_NCNAME	TokenNameIdentifier	 XPTRTOKEN  ELEM  NCNAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"InvalidElementSchemeToken"	TokenNameStringLiteral	InvalidElementSchemeToken
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// scan the element() XPointer expression 	TokenNameCOMMENT_LINE	scan the element() XPointer expression 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
xpointer	TokenNameIdentifier	 xpointer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanExpr	TokenNameIdentifier	 scan Expr
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
xpointer	TokenNameIdentifier	 xpointer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"InvalidElementSchemeXPointer"	TokenNameStringLiteral	InvalidElementSchemeXPointer
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpointer	TokenNameIdentifier	 xpointer
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Initialize a temp arrays to the size of token count which should 	TokenNameCOMMENT_LINE	Initialize a temp arrays to the size of token count which should 
// be atleast twice the size of child sequence, to hold the ChildSequence. 	TokenNameCOMMENT_LINE	be atleast twice the size of child sequence, to hold the ChildSequence. 
int	TokenNameint	
tmpChildSequence	TokenNameIdentifier	 tmp Child Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getTokenCount	TokenNameIdentifier	 get Token Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the element depth 	TokenNameCOMMENT_LINE	the element depth 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Traverse the scanned tokens 	TokenNameCOMMENT_LINE	Traverse the scanned tokens 
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMore	TokenNameIdentifier	 has More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_NCNAME	TokenNameIdentifier	 XPTRTOKEN  ELEM  NCNAME
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Note: Only a single ShortHand pointer can be present 	TokenNameCOMMENT_LINE	Note: Only a single ShortHand pointer can be present 
// The shortHand name 	TokenNameCOMMENT_LINE	The shortHand name 
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fShortHandPointerName	TokenNameIdentifier	 f Short Hand Pointer Name
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new ShortHandPointer 	TokenNameCOMMENT_LINE	Create a new ShortHandPointer 
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
=	TokenNameEQUAL	
new	TokenNamenew	
ShortHandPointer	TokenNameIdentifier	 Short Hand Pointer
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
.	TokenNameDOT	
setSchemeName	TokenNameIdentifier	 set Scheme Name
(	TokenNameLPAREN	
fShortHandPointerName	TokenNameIdentifier	 f Short Hand Pointer Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_CHILD	TokenNameIdentifier	 XPTRTOKEN  ELEM  CHILD
:	TokenNameCOLON	
{	TokenNameLBRACE	
tmpChildSequence	TokenNameIdentifier	 tmp Child Sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"InvalidElementSchemeXPointer"	TokenNameStringLiteral	InvalidElementSchemeXPointer
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
xpointer	TokenNameIdentifier	 xpointer
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Initialize the arrays to the number of elements in the ChildSequence. 	TokenNameCOMMENT_LINE	Initialize the arrays to the number of elements in the ChildSequence. 
fChildSequence	TokenNameIdentifier	 f Child Sequence
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tmpChildSequence	TokenNameIdentifier	 tmp Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fChildSequence	TokenNameIdentifier	 f Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the scheme name i.e element * @see org.apache.xerces.xpointer.XPointerPart#getSchemeName() */	TokenNameCOMMENT_JAVADOC	 Returns the scheme name i.e element @see org.apache.xerces.xpointer.XPointerPart#getSchemeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeName	TokenNameIdentifier	 get Scheme Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSchemeName	TokenNameIdentifier	 f Scheme Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the scheme data * * @see org.apache.xerces.xpointer.XPointerPart#getSchemeData() */	TokenNameCOMMENT_JAVADOC	 Returns the scheme data * @see org.apache.xerces.xpointer.XPointerPart#getSchemeData() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeData	TokenNameIdentifier	 get Scheme Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSchemeData	TokenNameIdentifier	 f Scheme Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the scheme name * * @see org.apache.xerces.xpointer.XPointerPart#setSchemeName(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Sets the scheme name * @see org.apache.xerces.xpointer.XPointerPart#setSchemeName(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeName	TokenNameIdentifier	 set Scheme Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeName	TokenNameIdentifier	 scheme Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemeName	TokenNameIdentifier	 f Scheme Name
=	TokenNameEQUAL	
schemeName	TokenNameIdentifier	 scheme Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the scheme data * * @see org.apache.xerces.xpointer.XPointerPart#setSchemeData(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Sets the scheme data * @see org.apache.xerces.xpointer.XPointerPart#setSchemeData(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeData	TokenNameIdentifier	 set Scheme Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeData	TokenNameIdentifier	 scheme Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemeData	TokenNameIdentifier	 f Scheme Data
=	TokenNameEQUAL	
schemeData	TokenNameIdentifier	 scheme Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Responsible for resolving the element() scheme XPointer. If a ShortHand * Pointer is present and it is successfully resolved and if a child * sequence is present, the child sequence is resolved relative to it. * * @see org.apache.xerces.xpointer.XPointerProcessor#resolveXPointer(org.apache.xerces.xni.QName, org.apache.xerces.xni.XMLAttributes, org.apache.xerces.xni.Augmentations, int event) */	TokenNameCOMMENT_JAVADOC	 Responsible for resolving the element() scheme XPointer. If a ShortHand Pointer is present and it is successfully resolved and if a child sequence is present, the child sequence is resolved relative to it. * @see org.apache.xerces.xpointer.XPointerProcessor#resolveXPointer(org.apache.xerces.xni.QName, org.apache.xerces.xni.XMLAttributes, org.apache.xerces.xni.Augmentations, int event) 
public	TokenNamepublic	
boolean	TokenNameboolean	
resolveXPointer	TokenNameIdentifier	 resolve X Pointer
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
int	TokenNameint	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isShortHandPointerResolved	TokenNameIdentifier	 is Short Hand Pointer Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// if a ChildSequence exisits, resolve child elements 	TokenNameCOMMENT_LINE	if a ChildSequence exisits, resolve child elements 
// if an element name exists 	TokenNameCOMMENT_LINE	if an element name exists 
if	TokenNameif	
(	TokenNameLPAREN	
fShortHandPointerName	TokenNameIdentifier	 f Short Hand Pointer Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resolve ShortHand Pointer 	TokenNameCOMMENT_LINE	resolve ShortHand Pointer 
isShortHandPointerResolved	TokenNameIdentifier	 is Short Hand Pointer Resolved
=	TokenNameEQUAL	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
.	TokenNameDOT	
resolveXPointer	TokenNameIdentifier	 resolve X Pointer
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isShortHandPointerResolved	TokenNameIdentifier	 is Short Hand Pointer Resolved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fIsShortHand	TokenNameIdentifier	 f Is Short Hand
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Added here to skip the ShortHand pointer corresponding to 	TokenNameCOMMENT_LINE	Added here to skip the ShortHand pointer corresponding to 
// an element if one exisits and start searching from its child 	TokenNameCOMMENT_LINE	an element if one exisits and start searching from its child 
if	TokenNameif	
(	TokenNameLPAREN	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
matchChildSequence	TokenNameIdentifier	 match Child Sequence
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isShortHandPointerResolved	TokenNameIdentifier	 is Short Hand Pointer Resolved
&&	TokenNameAND_AND	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if only a resolved shorthand pointer exists 	TokenNameCOMMENT_LINE	if only a resolved shorthand pointer exists 
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
isShortHandPointerResolved	TokenNameIdentifier	 is Short Hand Pointer Resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Matches the current element position in the document tree with the * element position specified in the element XPointer scheme. * * @param event * @return boolean - true if the current element position in the document * tree matches theelement position specified in the element XPointer * scheme. */	TokenNameCOMMENT_JAVADOC	 Matches the current element position in the document tree with the element position specified in the element XPointer scheme. * @param event @return boolean - true if the current element position in the document tree matches theelement position specified in the element XPointer scheme. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchChildSequence	TokenNameIdentifier	 match Child Sequence
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
int	TokenNameint	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// need to resize fCurrentChildSequence 	TokenNameCOMMENT_LINE	need to resize fCurrentChildSequence 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
>=	TokenNameGREATER_EQUAL	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmpCurrentChildSequence	TokenNameIdentifier	 tmp Current Child Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmpCurrentChildSequence	TokenNameIdentifier	 tmp Current Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increase the size by a factor of 2 (?) 	TokenNameCOMMENT_LINE	Increase the size by a factor of 2 (?) 
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tmpCurrentChildSequence	TokenNameIdentifier	 tmp Current Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmpCurrentChildSequence	TokenNameIdentifier	 tmp Current Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start 	TokenNameCOMMENT_LINE	start 
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
XPointerPart	TokenNameIdentifier	 X Pointer Part
.	TokenNameDOT	
EVENT_ELEMENT_START	TokenNameIdentifier	 EVENT  ELEMENT  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
;	TokenNameSEMICOLON	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// reset the current child position 	TokenNameCOMMENT_LINE	reset the current child position 
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//if (!fSchemeNameFound) { 	TokenNameCOMMENT_LINE	if (!fSchemeNameFound) { 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
<=	TokenNameLESS_EQUAL	
fFoundDepth	TokenNameIdentifier	 f Found Depth
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fFoundDepth	TokenNameIdentifier	 f Found Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checkMatch	TokenNameIdentifier	 check Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fFoundDepth	TokenNameIdentifier	 f Found Depth
=	TokenNameEQUAL	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fFoundDepth	TokenNameIdentifier	 f Found Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
XPointerPart	TokenNameIdentifier	 X Pointer Part
.	TokenNameDOT	
EVENT_ELEMENT_END	TokenNameIdentifier	 EVENT  ELEMENT  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
==	TokenNameEQUAL_EQUAL	
fFoundDepth	TokenNameIdentifier	 f Found Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
<	TokenNameLESS	
fFoundDepth	TokenNameIdentifier	 f Found Depth
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fFoundDepth	TokenNameIdentifier	 f Found Depth
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
>	TokenNameGREATER	
fFoundDepth	TokenNameIdentifier	 f Found Depth
)	TokenNameRPAREN	
// or empty element found 	TokenNameCOMMENT_LINE	or empty element found 
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fFoundDepth	TokenNameIdentifier	 f Found Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset array position of last child 	TokenNameCOMMENT_LINE	reset array position of last child 
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
=	TokenNameEQUAL	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
XPointerPart	TokenNameIdentifier	 X Pointer Part
.	TokenNameDOT	
EVENT_ELEMENT_EMPTY	TokenNameIdentifier	 EVENT  ELEMENT  EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
;	TokenNameSEMICOLON	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Donot check for empty elements if the empty element is 	TokenNameCOMMENT_LINE	Donot check for empty elements if the empty element is 
// a child of a found parent element 	TokenNameCOMMENT_LINE	a child of a found parent element 
if	TokenNameif	
(	TokenNameLPAREN	
checkMatch	TokenNameIdentifier	 check Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Matches the current position of the element being visited by checking * its position and previous elements against the element XPointer expression. * If a match is found it return true else false. * * @return boolean */	TokenNameCOMMENT_JAVADOC	 Matches the current position of the element being visited by checking its position and previous elements against the element XPointer expression. If a match is found it return true else false. * @return boolean 
protected	TokenNameprotected	
boolean	TokenNameboolean	
checkMatch	TokenNameIdentifier	 check Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the number of elements in the ChildSequence is greater than the 	TokenNameCOMMENT_LINE	If the number of elements in the ChildSequence is greater than the 
// current child depth, there is not point in checking further 	TokenNameCOMMENT_LINE	current child depth, there is not point in checking further 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fIsShortHand	TokenNameIdentifier	 f Is Short Hand
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If a shorthand pointer is not present traverse the children 	TokenNameCOMMENT_LINE	If a shorthand pointer is not present traverse the children 
// and compare 	TokenNameCOMMENT_LINE	and compare 
if	TokenNameif	
(	TokenNameLPAREN	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
<	TokenNameLESS	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fChildSequence	TokenNameIdentifier	 f Child Sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If a shorthand pointer is present traverse the children 	TokenNameCOMMENT_LINE	If a shorthand pointer is present traverse the children 
// ignoring the first element of the CurrenChildSequence which 	TokenNameCOMMENT_LINE	ignoring the first element of the CurrenChildSequence which 
// contains the ShortHand pointer element and compare 	TokenNameCOMMENT_LINE	contains the ShortHand pointer element and compare 
if	TokenNameif	
(	TokenNameLPAREN	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
<	TokenNameLESS	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ensure fCurrentChildSequence is large enough 	TokenNameCOMMENT_LINE	ensure fCurrentChildSequence is large enough 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ignore the first element of fCurrentChildSequence 	TokenNameCOMMENT_LINE	ignore the first element of fCurrentChildSequence 
if	TokenNameif	
(	TokenNameLPAREN	
fChildSequence	TokenNameIdentifier	 f Child Sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
fCurrentChildSequence	TokenNameIdentifier	 f Current Child Sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the node matches or is a child of a matching element() * scheme XPointer. * * @see org.apache.xerces.xpointer.XPointerProcessor#isFragmentResolved() */	TokenNameCOMMENT_JAVADOC	 Returns true if the node matches or is a child of a matching element() scheme XPointer. * @see org.apache.xerces.xpointer.XPointerProcessor#isFragmentResolved() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFragmentResolved	TokenNameIdentifier	 is Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// Return true if the Fragment was resolved and the current Node depth 	TokenNameCOMMENT_LINE	Return true if the Fragment was resolved and the current Node depth 
// is greater than or equal to the depth at which the element was found 	TokenNameCOMMENT_LINE	is greater than or equal to the depth at which the element was found 
return	TokenNamereturn	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the XPointer expression resolves to a non-element child * of the current resource fragment. * * @see org.apache.xerces.xpointer.XPointerPart#isChildFragmentResolved() * */	TokenNameCOMMENT_JAVADOC	 Returns true if the XPointer expression resolves to a non-element child of the current resource fragment. * @see org.apache.xerces.xpointer.XPointerPart#isChildFragmentResolved() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isChildFragmentResolved	TokenNameIdentifier	 is Child Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if only a shorthand pointer was present 	TokenNameCOMMENT_LINE	if only a shorthand pointer was present 
if	TokenNameif	
(	TokenNameLPAREN	
fIsShortHand	TokenNameIdentifier	 f Is Short Hand
&&	TokenNameAND_AND	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fChildSequence	TokenNameIdentifier	 f Child Sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
.	TokenNameDOT	
isChildFragmentResolved	TokenNameIdentifier	 is Child Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
?	TokenNameQUESTION	
!	TokenNameNOT	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
:	TokenNameCOLON	
(	TokenNameLPAREN	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
>=	TokenNameGREATER_EQUAL	
fFoundDepth	TokenNameIdentifier	 f Found Depth
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reports an XPointer error */	TokenNameCOMMENT_JAVADOC	 Reports an XPointer error 
protected	TokenNameprotected	
void	TokenNamevoid	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
/*fErrorReporter.reportError(XPointerMessageFormatter.XPOINTER_DOMAIN, key, arguments, XMLErrorReporter.SEVERITY_ERROR); */	TokenNameCOMMENT_BLOCK	fErrorReporter.reportError(XPointerMessageFormatter.XPOINTER_DOMAIN, key, arguments, XMLErrorReporter.SEVERITY_ERROR); 
throw	TokenNamethrow	
new	TokenNamenew	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
getMessageFormatter	TokenNameIdentifier	 get Message Formatter
(	TokenNameLPAREN	
XPointerMessageFormatter	TokenNameIdentifier	 X Pointer Message Formatter
.	TokenNameDOT	
XPOINTER_DOMAIN	TokenNameIdentifier	 XPOINTER  DOMAIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes error handling objects */	TokenNameCOMMENT_JAVADOC	 Initializes error handling objects 
protected	TokenNameprotected	
void	TokenNamevoid	
initErrorReporter	TokenNameIdentifier	 init Error Reporter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
new	TokenNamenew	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorHandler	TokenNameIdentifier	 f Error Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
XPointerErrorHandler	TokenNameIdentifier	 X Pointer Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
putMessageFormatter	TokenNameIdentifier	 put Message Formatter
(	TokenNameLPAREN	
XPointerMessageFormatter	TokenNameIdentifier	 X Pointer Message Formatter
.	TokenNameDOT	
XPOINTER_DOMAIN	TokenNameIdentifier	 XPOINTER  DOMAIN
,	TokenNameCOMMA	
new	TokenNamenew	
XPointerMessageFormatter	TokenNameIdentifier	 X Pointer Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the element scheme processor */	TokenNameCOMMENT_JAVADOC	 Initializes the element scheme processor 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemeName	TokenNameIdentifier	 f Scheme Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fSchemeData	TokenNameIdentifier	 f Scheme Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fShortHandPointerName	TokenNameIdentifier	 f Short Hand Pointer Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fIsResolveElement	TokenNameIdentifier	 f Is Resolve Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fIsElementFound	TokenNameIdentifier	 f Is Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fWasOnlyEmptyElementFound	TokenNameIdentifier	 f Was Only Empty Element Found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fFoundDepth	TokenNameIdentifier	 f Found Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentChildPosition	TokenNameIdentifier	 f Current Child Position
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentChildDepth	TokenNameIdentifier	 f Current Child Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
initErrorReporter	TokenNameIdentifier	 init Error Reporter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
// element() Scheme expression scanner 	TokenNameCOMMENT_LINE	element() Scheme expression scanner 
// ************************************************************************ 	TokenNameCOMMENT_LINE	************************************************************************ 
/** * List of XPointer Framework tokens. * * @xerces.internal * * @author Neil Delima, IBM * @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ * */	TokenNameCOMMENT_JAVADOC	 List of XPointer Framework tokens. * @xerces.internal * @author Neil Delima, IBM @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
Tokens	TokenNameIdentifier	 Tokens
{	TokenNameLBRACE	
/** * XPointer element() scheme * [1] ElementSchemeData ::= (NCName ChildSequence?) | ChildSequence * [2] ChildSequence ::= ('/' [1-9] [0-9]*)+ */	TokenNameCOMMENT_JAVADOC	 XPointer element() scheme [1] ElementSchemeData ::= (NCName ChildSequence?) | ChildSequence [2] ChildSequence ::= ('/' [1-9] [0-9]*)+ 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
XPTRTOKEN_ELEM_NCNAME	TokenNameIdentifier	 XPTRTOKEN  ELEM  NCNAME
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
XPTRTOKEN_ELEM_CHILD	TokenNameIdentifier	 XPTRTOKEN  ELEM  CHILD
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Token names 	TokenNameCOMMENT_LINE	Token names 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fgTokenNames	TokenNameIdentifier	 fg Token Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"XPTRTOKEN_ELEM_NCNAME"	TokenNameStringLiteral	XPTRTOKEN_ELEM_NCNAME
,	TokenNameCOMMA	
"XPTRTOKEN_ELEM_CHILD"	TokenNameStringLiteral	XPTRTOKEN_ELEM_CHILD
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Token count 	TokenNameCOMMENT_LINE	Token count 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_TOKEN_COUNT	TokenNameIdentifier	 INITIAL  TOKEN  COUNT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fTokens	TokenNameIdentifier	 f Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_TOKEN_COUNT	TokenNameIdentifier	 INITIAL  TOKEN  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fTokenCount	TokenNameIdentifier	 f Token Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Current token position 	TokenNameCOMMENT_LINE	Current token position 
private	TokenNameprivate	
int	TokenNameint	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
fTokenNames	TokenNameIdentifier	 f Token Names
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructor * * @param symbolTable SymbolTable */	TokenNameCOMMENT_JAVADOC	 Constructor * @param symbolTable SymbolTable 
private	TokenNameprivate	
Tokens	TokenNameIdentifier	 Tokens
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
XPTRTOKEN_ELEM_NCNAME	TokenNameIdentifier	 XPTRTOKEN  ELEM  NCNAME
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"XPTRTOKEN_ELEM_NCNAME"	TokenNameStringLiteral	XPTRTOKEN_ELEM_NCNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
XPTRTOKEN_ELEM_CHILD	TokenNameIdentifier	 XPTRTOKEN  ELEM  CHILD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"XPTRTOKEN_ELEM_CHILD"	TokenNameStringLiteral	XPTRTOKEN_ELEM_CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Returns the token String * @param token The index of the token * @return String The token string */	TokenNameCOMMENT_BLOCK	 Returns the token String @param token The index of the token @return String The token string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the token String * @param token The index of the token * @return String The token string */	TokenNameCOMMENT_JAVADOC	 Returns the token String @param token The index of the token @return String The token string 
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the specified string as a token * * @param token The token string */	TokenNameCOMMENT_JAVADOC	 Add the specified string as a token * @param token The token string 
private	TokenNameprivate	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
tokenInt	TokenNameIdentifier	 token Int
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenInt	TokenNameIdentifier	 token Int
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokenNames	TokenNameIdentifier	 f Token Names
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
,	TokenNameCOMMA	
tokenStr	TokenNameIdentifier	 token Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokenInt	TokenNameIdentifier	 token Int
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the specified int token * * @param token The int specifying the token */	TokenNameCOMMENT_JAVADOC	 Add the specified int token * @param token The int specifying the token 
private	TokenNameprivate	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldList	TokenNameIdentifier	 old List
=	TokenNameEQUAL	
fTokens	TokenNameIdentifier	 f Tokens
;	TokenNameSEMICOLON	
fTokens	TokenNameIdentifier	 f Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldList	TokenNameIdentifier	 old List
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fTokens	TokenNameIdentifier	 f Tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fTokenCount	TokenNameIdentifier	 f Token Count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTokenCount	TokenNameIdentifier	 f Token Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the current position to the head of the token list. */	TokenNameCOMMENT_JAVADOC	 Resets the current position to the head of the token list. 
private	TokenNameprivate	
void	TokenNamevoid	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the {@link #getNextToken()} method * returns a valid token. */	TokenNameCOMMENT_JAVADOC	 Returns true if the {@link #getNextToken()} method returns a valid token. 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasMore	TokenNameIdentifier	 has More
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
<	TokenNameLESS	
fTokenCount	TokenNameIdentifier	 f Token Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position, then advance * the current position by one. * * If there's no such next token, this method throws * <tt>new XNIException("InvalidXPointerExpression");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position, then advance the current position by one. * If there's no such next token, this method throws <tt>new XNIException("InvalidXPointerExpression");</tt>. 
private	TokenNameprivate	
int	TokenNameint	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
==	TokenNameEQUAL_EQUAL	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"XPointerElementSchemeProcessingError"	TokenNameStringLiteral	XPointerElementSchemeProcessingError
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position, without advancing * the current position. * * If there's no such next token, this method throws * <tt>new XNIException("InvalidXPointerExpression");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position, without advancing the current position. * If there's no such next token, this method throws <tt>new XNIException("InvalidXPointerExpression");</tt>. 
private	TokenNameprivate	
int	TokenNameint	
peekToken	TokenNameIdentifier	 peek Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
==	TokenNameEQUAL_EQUAL	
fTokenCount	TokenNameIdentifier	 f Token Count
)	TokenNameRPAREN	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"XPointerElementSchemeProcessingError"	TokenNameStringLiteral	XPointerElementSchemeProcessingError
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fTokens	TokenNameIdentifier	 f Tokens
[	TokenNameLBRACKET	
fCurrentTokenIndex	TokenNameIdentifier	 f Current Token Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains the token at the current position as a String. * * If there's no current token or if the current token * is not a string token, this method throws * If there's no such next token, this method throws * <tt>new XNIException("InvalidXPointerExpression");</tt>. */	TokenNameCOMMENT_JAVADOC	 Obtains the token at the current position as a String. * If there's no current token or if the current token is not a string token, this method throws If there's no such next token, this method throws <tt>new XNIException("InvalidXPointerExpression");</tt>. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
nextTokenAsString	TokenNameIdentifier	 next Token As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getTokenString	TokenNameIdentifier	 get Token String
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"XPointerElementSchemeProcessingError"	TokenNameStringLiteral	XPointerElementSchemeProcessingError
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of tokens. * */	TokenNameCOMMENT_JAVADOC	 Returns the number of tokens. 
private	TokenNameprivate	
int	TokenNameint	
getTokenCount	TokenNameIdentifier	 get Token Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fTokenCount	TokenNameIdentifier	 f Token Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * The XPointer expression scanner. Scans the XPointer framework expression. * * @xerces.internal * * @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 * The XPointer expression scanner. Scans the XPointer framework expression. * @xerces.internal * @version $Id: ElementSchemePointer.java 603808 2007-12-13 03:44:48Z mrglavas $ 
private	TokenNameprivate	
class	TokenNameclass	
Scanner	TokenNameIdentifier	 Scanner
{	TokenNameLBRACE	
/** * 7-bit ASCII subset * * 0 1 2 3 4 5 6 7 8 9 A B C D E F * 0, 0, 0, 0, 0, 0, 0, 0, 0, HT, LF, 0, 0, CR, 0, 0, // 0 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 1 * SP, !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, // 2 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, // 3 * @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, // 4 * P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, // 5 * `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, // 6 * p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~, DEL // 7 */	TokenNameCOMMENT_JAVADOC	 7-bit ASCII subset * 0 1 2 3 4 5 6 7 8 9 A B C D E F 0, 0, 0, 0, 0, 0, 0, 0, 0, HT, LF, 0, 0, CR, 0, 0, // 0 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 1 SP, !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, // 2 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, :, ;, <, =, >, ?, // 3 @, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, // 4 P, Q, R, S, T, U, V, W, X, Y, Z, [, \, ], ^, _, // 5 `, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, // 6 p, q, r, s, t, u, v, w, x, y, z, {, |, }, ~, DEL // 7 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHARTYPE_INVALID	TokenNameIdentifier	 CHARTYPE  INVALID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// invalid XML characters, control characters and 7F 	TokenNameCOMMENT_LINE	invalid XML characters, control characters and 7F 
CHARTYPE_OTHER	TokenNameIdentifier	 CHARTYPE  OTHER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// A valid XML character (possibly invalid NCNameChar) that does not fall in one of the other categories 	TokenNameCOMMENT_LINE	A valid XML character (possibly invalid NCNameChar) that does not fall in one of the other categories 
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '-' (0x2D) 	TokenNameCOMMENT_LINE	'-' (0x2D) 
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '.' (0x2E) 	TokenNameCOMMENT_LINE	'.' (0x2E) 
CHARTYPE_SLASH	TokenNameIdentifier	 CHARTYPE  SLASH
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '/' (0x2F) 	TokenNameCOMMENT_LINE	'/' (0x2F) 
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '0'-'9' (0x30 to 0x39) 	TokenNameCOMMENT_LINE	'0'-'9' (0x30 to 0x39) 
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// 'A'-'Z' or 'a'-'z' (0x41 to 0x5A and 0x61 to 0x7A) 	TokenNameCOMMENT_LINE	'A'-'Z' or 'a'-'z' (0x41 to 0x5A and 0x61 to 0x7A) 
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// '_' (0x5F) 	TokenNameCOMMENT_LINE	'_' (0x5F) 
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Non-ASCII Unicode codepoint (>= 0x80) 	TokenNameCOMMENT_LINE	Non-ASCII Unicode codepoint (>= 0x80) 
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Symbol literals */	TokenNameCOMMENT_JAVADOC	 Symbol literals 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Symbol table. */	TokenNameCOMMENT_JAVADOC	 Symbol table. 
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an XPath expression scanner. * * @param symbolTable SymbolTable */	TokenNameCOMMENT_JAVADOC	 Constructs an XPath expression scanner. * @param symbolTable SymbolTable 
private	TokenNameprivate	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save pool and tokens 	TokenNameCOMMENT_LINE	save pool and tokens 
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
/** * Scans the XPointer Expression * */	TokenNameCOMMENT_JAVADOC	 Scans the XPointer Expression 
private	TokenNameprivate	
boolean	TokenNameboolean	
scanExpr	TokenNameIdentifier	 scan Expr
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
int	TokenNameint	
nameOffset	TokenNameIdentifier	 name Offset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
:	TokenNameCOLON	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// [1] ElementSchemeData ::= (NCName ChildSequence?) | ChildSequence 	TokenNameCOMMENT_LINE	[1] ElementSchemeData ::= (NCName ChildSequence?) | ChildSequence 
// [2] ChildSequence ::= ('/' [1-9] [0-9]*)+ 	TokenNameCOMMENT_LINE	[2] ChildSequence ::= ('/' [1-9] [0-9]*)+ 
// 	TokenNameCOMMENT_LINE	 
switch	TokenNameswitch	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CHARTYPE_SLASH	TokenNameIdentifier	 CHARTYPE  SLASH
:	TokenNameCOLON	
// if last character is '/', break and report an error 	TokenNameCOMMENT_LINE	if last character is '/', break and report an error 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_CHILD	TokenNameIdentifier	 XPTRTOKEN  ELEM  CHILD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ChildSequence ::= ('/' [1-9] [0-9]*)+ 	TokenNameCOMMENT_LINE	ChildSequence ::= ('/' [1-9] [0-9]*)+ 
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// An invalid child sequence character 	TokenNameCOMMENT_LINE	An invalid child sequence character 
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"InvalidChildSequenceCharacter"	TokenNameStringLiteral	InvalidChildSequenceCharacter
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_NONASCII	TokenNameIdentifier	 CHARTYPE  NONASCII
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_OTHER	TokenNameIdentifier	 CHARTYPE  OTHER
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
:	TokenNameCOLON	
case	TokenNamecase	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
:	TokenNameCOLON	
// Scan the ShortHand Pointer NCName 	TokenNameCOMMENT_LINE	Scan the ShortHand Pointer NCName 
nameOffset	TokenNameIdentifier	 name Offset
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
==	TokenNameEQUAL_EQUAL	
nameOffset	TokenNameIdentifier	 name Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return false; 	TokenNameCOMMENT_LINE	return false; 
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"InvalidNCNameInElementSchemeData"	TokenNameStringLiteral	InvalidNCNameInElementSchemeData
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameHandle	TokenNameIdentifier	 name Handle
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nameOffset	TokenNameIdentifier	 name Offset
,	TokenNameCOMMA	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
Tokens	TokenNameIdentifier	 Tokens
.	TokenNameDOT	
XPTRTOKEN_ELEM_NCNAME	TokenNameIdentifier	 XPTRTOKEN  ELEM  NCNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
nameHandle	TokenNameIdentifier	 name Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a NCName. * From Namespaces in XML * [5] NCName ::= (Letter | '_') (NCNameChar)* * [6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender * * @param data A String containing the XPointer expression * @param endOffset The int XPointer expression length * @param currentOffset An int representing the current position of the XPointer expression pointer */	TokenNameCOMMENT_JAVADOC	 Scans a NCName. From Namespaces in XML [5] NCName ::= (Letter | '_') (NCNameChar)* [6] NCNameChar ::= Letter | Digit | '.' | '-' | '_' | CombiningChar | Extender * @param data A String containing the XPointer expression @param endOffset The int XPointer expression length @param currentOffset An int representing the current position of the XPointer expression pointer 
private	TokenNameprivate	
int	TokenNameint	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentOffset	TokenNameIdentifier	 current Offset
<	TokenNameLESS	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
currentOffset	TokenNameIdentifier	 current Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
byte	TokenNamebyte	
chartype	TokenNameIdentifier	 chartype
=	TokenNameEQUAL	
fASCIICharMap	TokenNameIdentifier	 f ASCII Char Map
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_LETTER	TokenNameIdentifier	 CHARTYPE  LETTER
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_DIGIT	TokenNameIdentifier	 CHARTYPE  DIGIT
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_PERIOD	TokenNameIdentifier	 CHARTYPE  PERIOD
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_MINUS	TokenNameIdentifier	 CHARTYPE  MINUS
&&	TokenNameAND_AND	
chartype	TokenNameIdentifier	 chartype
!=	TokenNameNOT_EQUAL	
CHARTYPE_UNDERSCORE	TokenNameIdentifier	 CHARTYPE  UNDERSCORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * This method adds the specified token to the token list. By * default, this method allows all tokens. However, subclasses * of the XPathExprScanner can override this method in order * to disallow certain tokens from being used in the scanned * XPath expression. This is a convenient way of allowing only * a subset of XPath. */	TokenNameCOMMENT_JAVADOC	 This method adds the specified token to the token list. By default, this method allows all tokens. However, subclasses of the XPathExprScanner can override this method in order to disallow certain tokens from being used in the scanned XPath expression. This is a convenient way of allowing only a subset of XPath. 
protected	TokenNameprotected	
void	TokenNamevoid	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
Tokens	TokenNameIdentifier	 Tokens
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
int	TokenNameint	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addToken(int) 	TokenNameCOMMENT_LINE	addToken(int) 
}	TokenNameRBRACE	
// class Scanner 	TokenNameCOMMENT_LINE	class Scanner 
}	TokenNameRBRACE	
