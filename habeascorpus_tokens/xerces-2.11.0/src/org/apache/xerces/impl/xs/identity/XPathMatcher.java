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
Constants	TokenNameIdentifier	 Constants
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
XPath	TokenNameIdentifier	 X Path
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
IntStack	TokenNameIdentifier	 Int Stack
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
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * XPath matcher. * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: XPathMatcher.java 572110 2007-09-02 19:04:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 XPath matcher. * @xerces.internal * @author Andy Clark, IBM * @version $Id: XPathMatcher.java 572110 2007-09-02 19:04:44Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// debugging 	TokenNameCOMMENT_LINE	debugging 
/** Compile to true to debug everything. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug everything. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Compile to true to debug method callbacks. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug method callbacks. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_METHODS	TokenNameIdentifier	 DEBUG  METHODS
=	TokenNameEQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
;	TokenNameSEMICOLON	
/** Compile to true to debug important method callbacks. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug important method callbacks. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_METHODS2	TokenNameIdentifier	 DEBUG  METHOD S2
=	TokenNameEQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG_METHODS	TokenNameIdentifier	 DEBUG  METHODS
||	TokenNameOR_OR	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
;	TokenNameSEMICOLON	
/** Compile to true to debug the <em>really</em> important methods. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug the <em>really</em> important methods. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_METHODS3	TokenNameIdentifier	 DEBUG  METHOD S3
=	TokenNameEQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG_METHODS	TokenNameIdentifier	 DEBUG  METHODS
||	TokenNameOR_OR	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
;	TokenNameSEMICOLON	
/** Compile to true to debug match. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug match. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
=	TokenNameEQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
;	TokenNameSEMICOLON	
/** Compile to true to debug step index stack. */	TokenNameCOMMENT_JAVADOC	 Compile to true to debug step index stack. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_STACK	TokenNameIdentifier	 DEBUG  STACK
=	TokenNameEQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
DEBUG_ALL	TokenNameIdentifier	 DEBUG  ALL
;	TokenNameSEMICOLON	
/** Don't touch this value unless you add more debug constants. */	TokenNameCOMMENT_JAVADOC	 Don't touch this value unless you add more debug constants. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ANY	TokenNameIdentifier	 DEBUG  ANY
=	TokenNameEQUAL	
DEBUG_METHODS	TokenNameIdentifier	 DEBUG  METHODS
||	TokenNameOR_OR	
DEBUG_METHODS2	TokenNameIdentifier	 DEBUG  METHOD S2
||	TokenNameOR_OR	
DEBUG_METHODS3	TokenNameIdentifier	 DEBUG  METHOD S3
||	TokenNameOR_OR	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
||	TokenNameOR_OR	
DEBUG_STACK	TokenNameIdentifier	 DEBUG  STACK
;	TokenNameSEMICOLON	
// constants describing whether a match was made, 	TokenNameCOMMENT_LINE	constants describing whether a match was made, 
// and if so how. 	TokenNameCOMMENT_LINE	and if so how. 
// matched any way 	TokenNameCOMMENT_LINE	matched any way 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCHED	TokenNameIdentifier	 MATCHED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// matched on the attribute axis 	TokenNameCOMMENT_LINE	matched on the attribute axis 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCHED_ATTRIBUTE	TokenNameIdentifier	 MATCHED  ATTRIBUTE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// matched on the descendant-or-self axixs 	TokenNameCOMMENT_LINE	matched on the descendant-or-self axixs 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// matched some previous (ancestor) node on the descendant-or-self-axis, but not this node 	TokenNameCOMMENT_LINE	matched some previous (ancestor) node on the descendant-or-self-axis, but not this node 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MATCHED_DESCENDANT_PREVIOUS	TokenNameIdentifier	 MATCHED  DESCENDANT  PREVIOUS
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** XPath location path. */	TokenNameCOMMENT_JAVADOC	 XPath location path. 
private	TokenNameprivate	
final	TokenNamefinal	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
LocationPath	TokenNameIdentifier	 Location Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
;	TokenNameSEMICOLON	
/** True if XPath has been matched. */	TokenNameCOMMENT_JAVADOC	 True if XPath has been matched. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fMatched	TokenNameIdentifier	 f Matched
;	TokenNameSEMICOLON	
/** The matching string. */	TokenNameCOMMENT_JAVADOC	 The matching string. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
fMatchedString	TokenNameIdentifier	 f Matched String
;	TokenNameSEMICOLON	
/** Integer stack of step indexes. */	TokenNameCOMMENT_JAVADOC	 Integer stack of step indexes. 
private	TokenNameprivate	
final	TokenNamefinal	
IntStack	TokenNameIdentifier	 Int Stack
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
;	TokenNameSEMICOLON	
/** Current step. */	TokenNameCOMMENT_JAVADOC	 Current step. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
;	TokenNameSEMICOLON	
/** * No match depth. The value of this field will be zero while * matching is successful for the given xpath expression. */	TokenNameCOMMENT_JAVADOC	 No match depth. The value of this field will be zero while matching is successful for the given xpath expression. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
;	TokenNameSEMICOLON	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fQName	TokenNameIdentifier	 f Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an XPath matcher that implements a document fragment * handler. * * @param xpath The xpath. */	TokenNameCOMMENT_JAVADOC	 Constructs an XPath matcher that implements a document fragment handler. * @param xpath The xpath. 
public	TokenNamepublic	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLocationPaths	TokenNameIdentifier	 f Location Paths
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
getLocationPaths	TokenNameIdentifier	 get Location Paths
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
<	TokenNameLESS	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentStep	TokenNameIdentifier	 f Current Step
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fMatched	TokenNameIdentifier	 f Matched
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XPath) 	TokenNameCOMMENT_LINE	<init>(XPath) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns value of first member of fMatched that * is nonzero. */	TokenNameCOMMENT_JAVADOC	 Returns value of first member of fMatched that is nonzero. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMatched	TokenNameIdentifier	 is Matched
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// xpath has been matched if any one of the members of the union have matched. 	TokenNameCOMMENT_LINE	xpath has been matched if any one of the members of the union have matched. 
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED_DESCENDANT_PREVIOUS	TokenNameIdentifier	 MATCHED  DESCENDANT  PREVIOUS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
MATCHED_DESCENDANT_PREVIOUS	TokenNameIdentifier	 MATCHED  DESCENDANT  PREVIOUS
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isMatched():int 	TokenNameCOMMENT_LINE	isMatched():int 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
// a place-holder method; to be overridden by subclasses 	TokenNameCOMMENT_LINE	a place-holder method; to be overridden by subclasses 
// that care about matching element content. 	TokenNameCOMMENT_LINE	that care about matching element content. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleContent	TokenNameIdentifier	 handle Content
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
nillable	TokenNameIdentifier	 nillable
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
ShortList	TokenNameIdentifier	 Short List
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * This method is called when the XPath handler matches the * XPath expression. Subclasses can override this method to * provide default handling upon a match. */	TokenNameCOMMENT_JAVADOC	 This method is called when the XPath handler matches the XPath expression. Subclasses can override this method to provide default handling upon a match. 
protected	TokenNameprotected	
void	TokenNamevoid	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
actualValue	TokenNameIdentifier	 actual Value
,	TokenNameCOMMA	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
ShortList	TokenNameIdentifier	 Short List
itemValueType	TokenNameIdentifier	 item Value Type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isNil	TokenNameIdentifier	 is Nil
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_METHODS3	TokenNameIdentifier	 DEBUG  METHOD S3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#matched(""	TokenNameStringLiteral	#matched("
+	TokenNamePLUS	
actualValue	TokenNameIdentifier	 actual Value
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// matched(String content, XSSimpleType val) 	TokenNameCOMMENT_LINE	matched(String content, XSSimpleType val) 
// 	TokenNameCOMMENT_LINE	 
// ~XMLDocumentFragmentHandler methods 	TokenNameCOMMENT_LINE	~XMLDocumentFragmentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of the document fragment. */	TokenNameCOMMENT_JAVADOC	 The start of the document fragment. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocumentFragment	TokenNameIdentifier	 start Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_METHODS	TokenNameIdentifier	 DEBUG  METHODS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#startDocumentFragment("	TokenNameStringLiteral	#startDocumentFragment(
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset state 	TokenNameCOMMENT_LINE	reset state 
fMatchedString	TokenNameIdentifier	 f Matched String
=	TokenNameEQUAL	
null	TokenNamenull	
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
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startDocumentFragment() 	TokenNameCOMMENT_LINE	startDocumentFragment() 
/** * The start of an element. If the document specifies the start element * by using an empty tag, then the startElement method will immediately * be followed by the endElement method, with no intervening methods. * * @param element The name of the element. * @param attributes The element attributes. * * @throws SAXException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an element. If the document specifies the start element by using an empty tag, then the startElement method will immediately be followed by the endElement method, with no intervening methods. * @param element The name of the element. @param attributes The element attributes. * @throws SAXException Thrown by handler to signal an error. 
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_METHODS2	TokenNameIdentifier	 DEBUG  METHOD S2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#startElement("	TokenNameStringLiteral	#startElement(
+	TokenNamePLUS	
"element={"	TokenNameStringLiteral	element={
+	TokenNamePLUS	
element	TokenNameIdentifier	 element
+	TokenNamePLUS	
"},"	TokenNameStringLiteral	},
+	TokenNamePLUS	
"attributes=..."	TokenNameStringLiteral	attributes=...
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// push context 	TokenNameCOMMENT_LINE	push context 
int	TokenNameint	
startStep	TokenNameIdentifier	 start Step
=	TokenNameEQUAL	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
startStep	TokenNameIdentifier	 start Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try next xpath, if not matching 	TokenNameCOMMENT_LINE	try next xpath, if not matching 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
||	TokenNameOR_OR	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MATCHED_DESCENDANT_PREVIOUS	TokenNameIdentifier	 MATCHED  DESCENDANT  PREVIOUS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_STACK	TokenNameIdentifier	 DEBUG  STACK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// consume self::node() steps 	TokenNameCOMMENT_LINE	consume self::node() steps 
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [SELF] MATCHED!"	TokenNameStringLiteral	 [SELF] MATCHED!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" XPath MATCHED!"	TokenNameStringLiteral	 XPath MATCHED!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now if the current step is a descendant step, we let the next 	TokenNameCOMMENT_LINE	now if the current step is a descendant step, we let the next 
// step do its thing; if it fails, we reset ourselves 	TokenNameCOMMENT_LINE	step do its thing; if it fails, we reset ourselves 
// to look at this step for next time we're called. 	TokenNameCOMMENT_LINE	to look at this step for next time we're called. 
// so first consume all descendants: 	TokenNameCOMMENT_LINE	so first consume all descendants: 
int	TokenNameint	
descendantStep	TokenNameIdentifier	 descendant Step
=	TokenNameEQUAL	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [DESCENDANT] MATCHED!"	TokenNameStringLiteral	 [DESCENDANT] MATCHED!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
sawDescendant	TokenNameIdentifier	 saw Descendant
=	TokenNameEQUAL	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
descendantStep	TokenNameIdentifier	 descendant Step
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" XPath DIDN'T MATCH!"	TokenNameStringLiteral	 XPath DIDN'T MATCH!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [CHILD] after NO MATCH"	TokenNameStringLiteral	 [CHILD] after NO MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// match child::... step, if haven't consumed any self::node() 	TokenNameCOMMENT_LINE	match child::... step, if haven't consumed any self::node() 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
startStep	TokenNameIdentifier	 start Step
||	TokenNameOR_OR	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
descendantStep	TokenNameIdentifier	 descendant Step
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
axis	TokenNameIdentifier	 axis
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Step	TokenNameIdentifier	 Step
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
step	TokenNameIdentifier	 step
.	TokenNameDOT	
nodeTest	TokenNameIdentifier	 node Test
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [CHILD] before"	TokenNameStringLiteral	 [CHILD] before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
nodeTest	TokenNameIdentifier	 node Test
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
descendantStep	TokenNameIdentifier	 descendant Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
descendantStep	TokenNameIdentifier	 descendant Step
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [CHILD] after NO MATCH"	TokenNameStringLiteral	 [CHILD] after NO MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [CHILD] after MATCHED!"	TokenNameStringLiteral	 [CHILD] after MATCHED!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sawDescendant	TokenNameIdentifier	 saw Descendant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
descendantStep	TokenNameIdentifier	 descendant Step
;	TokenNameSEMICOLON	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MATCHED_DESCENDANT	TokenNameIdentifier	 MATCHED  DESCENDANT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// match attribute::... step 	TokenNameCOMMENT_LINE	match attribute::... step 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [ATTRIBUTE] before"	TokenNameStringLiteral	 [ATTRIBUTE] before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
attrCount	TokenNameIdentifier	 attr Count
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrCount	TokenNameIdentifier	 attr Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
=	TokenNameEQUAL	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
nodeTest	TokenNameIdentifier	 node Test
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
aIndex	TokenNameIdentifier	 a Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
aIndex	TokenNameIdentifier	 a Index
<	TokenNameLESS	
attrCount	TokenNameIdentifier	 attr Count
;	TokenNameSEMICOLON	
aIndex	TokenNameIdentifier	 a Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
aIndex	TokenNameIdentifier	 a Index
,	TokenNameCOMMA	
fQName	TokenNameIdentifier	 f Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
nodeTest	TokenNameIdentifier	 node Test
,	TokenNameCOMMA	
fQName	TokenNameIdentifier	 f Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MATCHED_ATTRIBUTE	TokenNameIdentifier	 MATCHED  ATTRIBUTE
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
attrPSVI	TokenNameIdentifier	 attr PSVI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
aIndex	TokenNameIdentifier	 a Index
)	TokenNameRPAREN	
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRIBUTE_PSVI	TokenNameIdentifier	 ATTRIBUTE  PSVI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fMatchedString	TokenNameIdentifier	 f Matched String
=	TokenNameEQUAL	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getActualNormalizedValue	TokenNameIdentifier	 get Actual Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
(	TokenNameLPAREN	
fMatchedString	TokenNameIdentifier	 f Matched String
,	TokenNameCOMMA	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getActualNormalizedValueType	TokenNameIdentifier	 get Actual Normalized Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getItemValueTypes	TokenNameIdentifier	 get Item Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
descendantStep	TokenNameIdentifier	 descendant Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
descendantStep	TokenNameIdentifier	 descendant Step
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [ATTRIBUTE] after"	TokenNameStringLiteral	 [ATTRIBUTE] after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_MATCH	TokenNameIdentifier	 DEBUG  MATCH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [ATTRIBUTE] after MATCHED!"	TokenNameStringLiteral	 [ATTRIBUTE] after MATCHED!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startElement(QName,XMLAttrList,int) 	TokenNameCOMMENT_LINE	startElement(QName,XMLAttrList,int) 
/** * @param element * name of the element. * @param type * content type of this element. IOW, the XML schema type * of the <tt>value</tt>. Note that this may not be the type declared * in the element declaration, but it is "the actual type". For example, * if the XML is &lt;foo xsi:type="xs:string">aaa&lt;/foo>, this * parameter will be "xs:string". * @param nillable - nillable * true if the element declaration is nillable. * @param value - actual value * the typed value of the content of this element. */	TokenNameCOMMENT_JAVADOC	 @param element name of the element. @param type content type of this element. IOW, the XML schema type of the <tt>value</tt>. Note that this may not be the type declared in the element declaration, but it is "the actual type". For example, if the XML is &lt;foo xsi:type="xs:string">aaa&lt;/foo>, this parameter will be "xs:string". @param nillable - nillable true if the element declaration is nillable. @param value - actual value the typed value of the content of this element. 
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
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
ShortList	TokenNameIdentifier	 Short List
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_METHODS2	TokenNameIdentifier	 DEBUG  METHOD S2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#endElement("	TokenNameStringLiteral	#endElement(
+	TokenNamePLUS	
"element={"	TokenNameStringLiteral	element={
+	TokenNamePLUS	
element	TokenNameIdentifier	 element
+	TokenNamePLUS	
"},"	TokenNameStringLiteral	},
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// go back a step 	TokenNameCOMMENT_LINE	go back a step 
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// don't do anything, if not matching 	TokenNameCOMMENT_LINE	don't do anything, if not matching 
if	TokenNameif	
(	TokenNameLPAREN	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNoMatchDepth	TokenNameIdentifier	 f No Match Depth
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// signal match, if appropriate 	TokenNameCOMMENT_LINE	signal match, if appropriate 
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
MATCHED	TokenNameIdentifier	 MATCHED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
&	TokenNameAND	
MATCHED_ATTRIBUTE	TokenNameIdentifier	 MATCHED  ATTRIBUTE
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
MATCHED_ATTRIBUTE	TokenNameIdentifier	 MATCHED  ATTRIBUTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only certain kinds of matchers actually 	TokenNameCOMMENT_LINE	only certain kinds of matchers actually 
// match element content. This permits 	TokenNameCOMMENT_LINE	match element content. This permits 
// them a way to override this to do nothing 	TokenNameCOMMENT_LINE	them a way to override this to do nothing 
// and hopefully save a few operations. 	TokenNameCOMMENT_LINE	and hopefully save a few operations. 
handleContent	TokenNameIdentifier	 handle Content
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
nillable	TokenNameIdentifier	 nillable
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fMatched	TokenNameIdentifier	 f Matched
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_STACK	TokenNameIdentifier	 DEBUG  STACK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
fStepIndexes	TokenNameIdentifier	 f Step Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// endElement(QName) 	TokenNameCOMMENT_LINE	endElement(QName) 
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
/*** return fLocationPath.toString(); /***/	TokenNameCOMMENT_JAVADOC	* return fLocationPath.toString(); /**
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
fLocationPaths	TokenNameIdentifier	 f Location Paths
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
Step	TokenNameIdentifier	 Step
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
fLocationPaths	TokenNameIdentifier	 f Location Paths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
steps	TokenNameIdentifier	 steps
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentStep	TokenNameIdentifier	 f Current Step
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
steps	TokenNameIdentifier	 steps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'^'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Normalizes text. */	TokenNameCOMMENT_JAVADOC	 Normalizes text. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"\n"	TokenNameStringLiteral	\n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize(String):String 	TokenNameCOMMENT_LINE	normalize(String):String 
/** Returns true if the given QName matches the node test. **/	TokenNameCOMMENT_JAVADOC	 Returns true if the given QName matches the node test. *
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
QNAME	TokenNameIdentifier	 QNAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeTest	TokenNameIdentifier	 node Test
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XPath.NodeTest.WILDCARD 	TokenNameCOMMENT_LINE	XPath.NodeTest.WILDCARD 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// matches(XPath.NodeTest,QName):boolean 	TokenNameCOMMENT_LINE	matches(XPath.NodeTest,QName):boolean 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
// NOTE: The main of this class is here for debugging purposes. 	TokenNameCOMMENT_LINE	NOTE: The main of this class is here for debugging purposes. 
// However, javac (JDK 1.1.8) has an internal compiler 	TokenNameCOMMENT_LINE	However, javac (JDK 1.1.8) has an internal compiler 
// error when compiling. Jikes has no problem, though. 	TokenNameCOMMENT_LINE	error when compiling. Jikes has no problem, though. 
// 	TokenNameCOMMENT_LINE	 
// If you want to use this main, use Jikes to compile but 	TokenNameCOMMENT_LINE	If you want to use this main, use Jikes to compile but 
// *never* check in this code to CVS without commenting it 	TokenNameCOMMENT_LINE	*never* check in this code to CVS without commenting it 
// out. -Ac 	TokenNameCOMMENT_LINE	out. -Ac 
/** Main program. */	TokenNameCOMMENT_JAVADOC	 Main program. 
/*** public static void main(String[] argv) throws XNIException { if (DEBUG_ANY) { for (int i = 0; i < argv.length; i++) { final String expr = argv[i]; final XPath xpath = new XPath(expr, symbols, null); final XPathMatcher matcher = new XPathMatcher(xpath, true); org.apache.xerces.parsers.SAXParser parser = new org.apache.xerces.parsers.SAXParser(symbols) { public void startDocument() throws XNIException { matcher.startDocumentFragment(symbols, null); } public void startElement(QName element, XMLAttrList attributes, int handle) throws XNIException { matcher.startElement(element, attributes, handle); } public void characters(char[] ch, int offset, int length) throws XNIException { matcher.characters(ch, offset, length); } public void endElement(QName element) throws XNIException { matcher.endElement(element); } public void endDocument() throws XNIException { matcher.endDocumentFragment(); } }; System.out.println("#### argv["+i+"]: \""+expr+"\" -> \""+xpath.toString()+'"'); final String uri = argv[++i]; System.out.println("#### argv["+i+"]: "+uri); parser.parse(uri); } } } // main(String[]) /***/	TokenNameCOMMENT_JAVADOC	* public static void main(String[] argv) throws XNIException { if (DEBUG_ANY) { for (int i = 0; i < argv.length; i++) { final String expr = argv[i]; final XPath xpath = new XPath(expr, symbols, null); final XPathMatcher matcher = new XPathMatcher(xpath, true); org.apache.xerces.parsers.SAXParser parser = new org.apache.xerces.parsers.SAXParser(symbols) { public void startDocument() throws XNIException { matcher.startDocumentFragment(symbols, null); } public void startElement(QName element, XMLAttrList attributes, int handle) throws XNIException { matcher.startElement(element, attributes, handle); } public void characters(char[] ch, int offset, int length) throws XNIException { matcher.characters(ch, offset, length); } public void endElement(QName element) throws XNIException { matcher.endElement(element); } public void endDocument() throws XNIException { matcher.endDocumentFragment(); } }; System.out.println("#### argv["+i+"]: \""+expr+"\" -> \""+xpath.toString()+'"'); final String uri = argv[++i]; System.out.println("#### argv["+i+"]: "+uri); parser.parse(uri); } } } // main(String[]) /**
}	TokenNameRBRACE	
// class XPathMatcher 	TokenNameCOMMENT_LINE	class XPathMatcher 
