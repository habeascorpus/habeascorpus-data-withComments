package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
DOMUtils	TokenNameIdentifier	 DOM Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getChildByTagOrFail	TokenNameIdentifier	 get Child By Tag Or Fail
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
getChildByTagName	TokenNameIdentifier	 get Child By Tag Name
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" missing ""	TokenNameStringLiteral	 missing "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" child element"	TokenNameStringLiteral	" child element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildOrFail	TokenNameIdentifier	 get First Child Or Fail
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not contain a child element"	TokenNameStringLiteral	 does not contain a child element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttributeOrFail	TokenNameIdentifier	 get Attribute Or Fail
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" missing ""	TokenNameStringLiteral	 missing "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" attribute"	TokenNameStringLiteral	" attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttributeWithInheritanceOrFail	TokenNameIdentifier	 get Attribute With Inheritance Or Fail
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getAttributeWithInheritance	TokenNameIdentifier	 get Attribute With Inheritance
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" missing ""	TokenNameStringLiteral	 missing "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"" attribute"	TokenNameStringLiteral	" attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getNonBlankTextOrFail	TokenNameIdentifier	 get Non Blank Text Or Fail
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
||	TokenNameOR_OR	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" has no text"	TokenNameStringLiteral	 has no text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Convenience method where there is only one child Element of a given name */	TokenNameCOMMENT_BLOCK	 Convenience method where there is only one child Element of a given name 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getChildByTagName	TokenNameIdentifier	 get Child By Tag Name
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an attribute value from this node, or first parent node with this attribute defined * @param element * @param attributeName * @return A non-zero-length value if defined, otherwise null */	TokenNameCOMMENT_JAVADOC	 Returns an attribute value from this node, or first parent node with this attribute defined @param element @param attributeName @return A non-zero-length value if defined, otherwise null 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttributeWithInheritance	TokenNameIdentifier	 get Attribute With Inheritance
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getAttributeWithInheritance	TokenNameIdentifier	 get Attribute With Inheritance
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//we reached the top level of the document without finding attribute 	TokenNameCOMMENT_LINE	we reached the top level of the document without finding attribute 
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Convenience method where there is only one child Element of a given name */	TokenNameCOMMENT_BLOCK	 Convenience method where there is only one child Element of a given name 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getChildTextByTagName	TokenNameIdentifier	 get Child Text By Tag Name
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getChildByTagName	TokenNameIdentifier	 get Child By Tag Name
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Convenience method to append a new child with text*/	TokenNameCOMMENT_BLOCK	 Convenience method to append a new child with text
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
insertChild	TokenNameIdentifier	 insert Child
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
deflt	TokenNameIdentifier	 deflt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deflt	TokenNameIdentifier	 deflt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
float	TokenNamefloat	
deflt	TokenNameIdentifier	 deflt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deflt	TokenNameIdentifier	 deflt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
int	TokenNameint	
deflt	TokenNameIdentifier	 deflt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deflt	TokenNameIdentifier	 deflt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deflt	TokenNameIdentifier	 deflt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deflt	TokenNameIdentifier	 deflt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Returns text of node and all child nodes - without markup */	TokenNameCOMMENT_BLOCK	 Returns text of node and all child nodes - without markup 
//MH changed to Node from Element 25/11/2005 	TokenNameCOMMENT_LINE	MH changed to Node from Element 25/11/2005 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getTextBuffer	TokenNameIdentifier	 get Text Buffer
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getFirstChildElement	TokenNameIdentifier	 get First Child Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
getTextBuffer	TokenNameIdentifier	 get Text Buffer
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
getTextBuffer	TokenNameIdentifier	 get Text Buffer
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
getTextBuffer	TokenNameIdentifier	 get Text Buffer
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper method to parse an XML file into a DOM tree, given a reader. * @param is reader of the XML file to be parsed * @return an org.w3c.dom.Document object */	TokenNameCOMMENT_JAVADOC	 Helper method to parse an XML file into a DOM tree, given a reader. @param is reader of the XML file to be parsed @return an org.w3c.dom.Document object 
public	TokenNamepublic	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
loadXML	TokenNameIdentifier	 load XML
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Parser configuration error"	TokenNameStringLiteral	Parser configuration error
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 3: parse the input file 	TokenNameCOMMENT_LINE	Step 3: parse the input file 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//doc = db.parse(is); 	TokenNameCOMMENT_LINE	doc = db.parse(is); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error parsing file:"	TokenNameStringLiteral	Error parsing file:
+	TokenNamePLUS	
se	TokenNameIdentifier	 se
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
