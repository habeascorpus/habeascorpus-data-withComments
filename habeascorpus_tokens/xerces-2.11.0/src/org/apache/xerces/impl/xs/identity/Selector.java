/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
identity	TokenNameIdentifier	 identity
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathException	TokenNameIdentifier	 X Path Exception
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
NamespaceContext	TokenNameIdentifier	 Namespace Context
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
ShortList	TokenNameIdentifier	 Short List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
;	TokenNameSEMICOLON	
/** * Schema identity constraint selector. * * @xerces.internal * * @author Andy Clark, IBM * @version $Id: Selector.java 572110 2007-09-02 19:04:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Schema identity constraint selector. * @xerces.internal * @author Andy Clark, IBM @version $Id: Selector.java 572110 2007-09-02 19:04:44Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
Selector	TokenNameIdentifier	 Selector
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** XPath. */	TokenNameCOMMENT_JAVADOC	 XPath. 
protected	TokenNameprotected	
final	TokenNamefinal	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
fXPath	TokenNameIdentifier	 f X Path
;	TokenNameSEMICOLON	
/** Identity constraint. */	TokenNameCOMMENT_JAVADOC	 Identity constraint. 
protected	TokenNameprotected	
final	TokenNamefinal	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
;	TokenNameSEMICOLON	
// the Identity constraint we're the matcher for. Only 	TokenNameCOMMENT_LINE	the Identity constraint we're the matcher for. Only 
// used for selectors! 	TokenNameCOMMENT_LINE	used for selectors! 
protected	TokenNameprotected	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
fIDConstraint	TokenNameIdentifier	 f ID Constraint
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a selector. */	TokenNameCOMMENT_JAVADOC	 Constructs a selector. 
public	TokenNamepublic	
Selector	TokenNameIdentifier	 Selector
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
identityConstraint	TokenNameIdentifier	 identity Constraint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXPath	TokenNameIdentifier	 f X Path
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
=	TokenNameEQUAL	
identityConstraint	TokenNameIdentifier	 identity Constraint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Selector.XPath,IdentityConstraint) 	TokenNameCOMMENT_LINE	<init>(Selector.XPath,IdentityConstraint) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the selector XPath. */	TokenNameCOMMENT_JAVADOC	 Returns the selector XPath. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
getXPath	TokenNameIdentifier	 get X Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fXPath	TokenNameIdentifier	 f X Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXPath():org.apache.xerces.v1.schema.identity.XPath 	TokenNameCOMMENT_LINE	getXPath():org.apache.xerces.v1.schema.identity.XPath 
/** Returns the identity constraint. */	TokenNameCOMMENT_JAVADOC	 Returns the identity constraint. 
public	TokenNamepublic	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
getIDConstraint	TokenNameIdentifier	 get ID Constraint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIDConstraint():IdentityConstraint 	TokenNameCOMMENT_LINE	getIDConstraint():IdentityConstraint 
// factory method 	TokenNameCOMMENT_LINE	factory method 
/** Creates a selector matcher. * @param activator The activator for this selector's fields. * @param initialDepth The depth in the document at which this matcher began its life; * used in correctly handling recursive elements. */	TokenNameCOMMENT_JAVADOC	 Creates a selector matcher. @param activator The activator for this selector's fields. @param initialDepth The depth in the document at which this matcher began its life; used in correctly handling recursive elements. 
public	TokenNamepublic	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
createMatcher	TokenNameIdentifier	 create Matcher
(	TokenNameLPAREN	
FieldActivator	TokenNameIdentifier	 Field Activator
activator	TokenNameIdentifier	 activator
,	TokenNameCOMMA	
int	TokenNameint	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
(	TokenNameLPAREN	
fXPath	TokenNameIdentifier	 f X Path
,	TokenNameCOMMA	
activator	TokenNameIdentifier	 activator
,	TokenNameCOMMA	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createMatcher(FieldActivator):XPathMatcher 	TokenNameCOMMENT_LINE	createMatcher(FieldActivator):XPathMatcher 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fXPath	TokenNameIdentifier	 f X Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * Schema identity constraint selector XPath expression. * * @author Andy Clark, IBM * @version $Id: Selector.java 572110 2007-09-02 19:04:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Schema identity constraint selector XPath expression. * @author Andy Clark, IBM @version $Id: Selector.java 572110 2007-09-02 19:04:44Z mrglavas $ 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
XPath	TokenNameIdentifier	 X Path
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a selector XPath expression. */	TokenNameCOMMENT_JAVADOC	 Constructs a selector XPath expression. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathException	TokenNameIdentifier	 X Path Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify that an attribute is not selected 	TokenNameCOMMENT_LINE	verify that an attribute is not selected 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
"c-selector-xpath"	TokenNameStringLiteral	c-selector-xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// <init>(String,SymbolTable,NamespacesScope) 	TokenNameCOMMENT_LINE	<init>(String,SymbolTable,NamespacesScope) 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: We have to prefix the selector XPath with "./" in 	TokenNameCOMMENT_LINE	NOTE: We have to prefix the selector XPath with "./" in 
// order to handle selectors such as "." that select 	TokenNameCOMMENT_LINE	order to handle selectors such as "." that select 
// the element container because the fields could be 	TokenNameCOMMENT_LINE	the element container because the fields could be 
// relative to that element. -Ac 	TokenNameCOMMENT_LINE	relative to that element. -Ac 
// Unless xpath starts with a descendant node -Achille Fokoue 	TokenNameCOMMENT_LINE	Unless xpath starts with a descendant node -Achille Fokoue 
// ... or a '.' or a '/' - NG 	TokenNameCOMMENT_LINE	... or a '.' or a '/' - NG 
// And we also need to prefix exprs to the right of | with ./ - NG 	TokenNameCOMMENT_LINE	And we also need to prefix exprs to the right of | with ./ - NG 
StringBuffer	TokenNameIdentifier	 String Buffer
modifiedXPath	TokenNameIdentifier	 modified X Path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
unionIndex	TokenNameIdentifier	 union Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
||	TokenNameOR_OR	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiedXPath	TokenNameIdentifier	 modified X Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"./"	TokenNameStringLiteral	./
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unionIndex	TokenNameIdentifier	 union Index
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unionIndex	TokenNameIdentifier	 union Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modifiedXPath	TokenNameIdentifier	 modified X Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
modifiedXPath	TokenNameIdentifier	 modified X Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unionIndex	TokenNameIdentifier	 union Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
unionIndex	TokenNameIdentifier	 union Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
modifiedXPath	TokenNameIdentifier	 modified X Path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Selector.XPath 	TokenNameCOMMENT_LINE	class Selector.XPath 
/** * Selector matcher. * * @author Andy Clark, IBM */	TokenNameCOMMENT_JAVADOC	 Selector matcher. * @author Andy Clark, IBM 
public	TokenNamepublic	
class	TokenNameclass	
Matcher	TokenNameIdentifier	 Matcher
extends	TokenNameextends	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Field activator. */	TokenNameCOMMENT_JAVADOC	 Field activator. 
protected	TokenNameprotected	
final	TokenNamefinal	
FieldActivator	TokenNameIdentifier	 Field Activator
fFieldActivator	TokenNameIdentifier	 f Field Activator
;	TokenNameSEMICOLON	
/** Initial depth in the document at which this matcher was created. */	TokenNameCOMMENT_JAVADOC	 Initial depth in the document at which this matcher was created. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
;	TokenNameSEMICOLON	
/** Element depth. */	TokenNameCOMMENT_JAVADOC	 Element depth. 
protected	TokenNameprotected	
int	TokenNameint	
fElementDepth	TokenNameIdentifier	 f Element Depth
;	TokenNameSEMICOLON	
/** Depth at match. */	TokenNameCOMMENT_JAVADOC	 Depth at match. 
protected	TokenNameprotected	
int	TokenNameint	
fMatchedDepth	TokenNameIdentifier	 f Matched Depth
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a selector matcher. */	TokenNameCOMMENT_JAVADOC	 Constructs a selector matcher. 
public	TokenNamepublic	
Matcher	TokenNameIdentifier	 Matcher
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
FieldActivator	TokenNameIdentifier	 Field Activator
activator	TokenNameIdentifier	 activator
,	TokenNameCOMMA	
int	TokenNameint	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fFieldActivator	TokenNameIdentifier	 f Field Activator
=	TokenNameEQUAL	
activator	TokenNameIdentifier	 activator
;	TokenNameSEMICOLON	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
=	TokenNameEQUAL	
initialDepth	TokenNameIdentifier	 initial Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Selector.XPath,FieldActivator) 	TokenNameCOMMENT_LINE	<init>(Selector.XPath,FieldActivator) 
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentFragmentHandler methods 	TokenNameCOMMENT_LINE	XMLDocumentFragmentHandler methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
startDocumentFragment	TokenNameIdentifier	 start Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startDocumentFragment	TokenNameIdentifier	 start Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fElementDepth	TokenNameIdentifier	 f Element Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fMatchedDepth	TokenNameIdentifier	 f Matched Depth
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startDocumentFragment() 	TokenNameCOMMENT_LINE	startDocumentFragment() 
/** * The start of an element. If the document specifies the start element * by using an empty tag, then the startElement method will immediately * be followed by the endElement method, with no intervening methods. * * @param element The name of the element. * @param attributes The element attributes. * */	TokenNameCOMMENT_JAVADOC	 The start of an element. If the document specifies the start element by using an empty tag, then the startElement method will immediately be followed by the endElement method, with no intervening methods. * @param element The name of the element. @param attributes The element attributes. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fElementDepth	TokenNameIdentifier	 f Element Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// activate the fields, if selector is matched 	TokenNameCOMMENT_LINE	activate the fields, if selector is matched 
//int matched = isMatched(); 	TokenNameCOMMENT_LINE	int matched = isMatched(); 
if	TokenNameif	
(	TokenNameLPAREN	
isMatched	TokenNameIdentifier	 is Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* (fMatchedDepth == -1 && ((matched & MATCHED) == MATCHED)) || ((matched & MATCHED_DESCENDANT) == MATCHED_DESCENDANT)) { */	TokenNameCOMMENT_BLOCK	 (fMatchedDepth == -1 && ((matched & MATCHED) == MATCHED)) || ((matched & MATCHED_DESCENDANT) == MATCHED_DESCENDANT)) { 
fMatchedDepth	TokenNameIdentifier	 f Matched Depth
=	TokenNameEQUAL	
fElementDepth	TokenNameIdentifier	 f Element Depth
;	TokenNameSEMICOLON	
fFieldActivator	TokenNameIdentifier	 f Field Activator
.	TokenNameDOT	
startValueScopeFor	TokenNameIdentifier	 start Value Scope For
(	TokenNameLPAREN	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
,	TokenNameCOMMA	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
.	TokenNameDOT	
getFieldCount	TokenNameIdentifier	 get Field Count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
.	TokenNameDOT	
getFieldAt	TokenNameIdentifier	 get Field At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
fFieldActivator	TokenNameIdentifier	 f Field Activator
.	TokenNameDOT	
activateField	TokenNameIdentifier	 activate Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startElement(QName,XMLAttrList,int) 	TokenNameCOMMENT_LINE	startElement(QName,XMLAttrList,int) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
nillable	TokenNameIdentifier	 nillable
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
actualValue	TokenNameIdentifier	 actual Value
,	TokenNameCOMMA	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
ShortList	TokenNameIdentifier	 Short List
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
nillable	TokenNameIdentifier	 nillable
,	TokenNameCOMMA	
actualValue	TokenNameIdentifier	 actual Value
,	TokenNameCOMMA	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fElementDepth	TokenNameIdentifier	 f Element Depth
--	TokenNameMINUS_MINUS	
==	TokenNameEQUAL_EQUAL	
fMatchedDepth	TokenNameIdentifier	 f Matched Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatchedDepth	TokenNameIdentifier	 f Matched Depth
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fFieldActivator	TokenNameIdentifier	 f Field Activator
.	TokenNameDOT	
endValueScopeFor	TokenNameIdentifier	 end Value Scope For
(	TokenNameLPAREN	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
,	TokenNameCOMMA	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the identity constraint. */	TokenNameCOMMENT_JAVADOC	 Returns the identity constraint. 
public	TokenNamepublic	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
getIdentityConstraint	TokenNameIdentifier	 get Identity Constraint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIdentityConstraint	TokenNameIdentifier	 f Identity Constraint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIdentityConstraint():IdentityConstraint 	TokenNameCOMMENT_LINE	getIdentityConstraint():IdentityConstraint 
/** get the initial depth at which this selector matched. */	TokenNameCOMMENT_JAVADOC	 get the initial depth at which this selector matched. 
public	TokenNamepublic	
int	TokenNameint	
getInitialDepth	TokenNameIdentifier	 get Initial Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fInitialDepth	TokenNameIdentifier	 f Initial Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getInitialDepth(): int 	TokenNameCOMMENT_LINE	getInitialDepth(): int 
}	TokenNameRBRACE	
// class Matcher 	TokenNameCOMMENT_LINE	class Matcher 
}	TokenNameRBRACE	
// class Selector 	TokenNameCOMMENT_LINE	class Selector 
