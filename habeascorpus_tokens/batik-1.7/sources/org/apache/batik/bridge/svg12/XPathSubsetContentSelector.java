/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * A class to handle the XPath subset syntax for XBL content elements. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XPathSubsetContentSelector.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle the XPath subset syntax for XBL content elements. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XPathSubsetContentSelector.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XPathSubsetContentSelector	TokenNameIdentifier	 X Path Subset Content Selector
extends	TokenNameextends	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTOR_INVALID	TokenNameIdentifier	 SELECTOR  INVALID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTOR_ANY	TokenNameIdentifier	 SELECTOR  ANY
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTOR_ID	TokenNameIdentifier	 SELECTOR  ID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The type of XPath subset expression. */	TokenNameCOMMENT_JAVADOC	 The type of XPath subset expression. 
protected	TokenNameprotected	
int	TokenNameint	
selectorType	TokenNameIdentifier	 selector Type
;	TokenNameSEMICOLON	
/** * The QName prefix used for selection. */	TokenNameCOMMENT_JAVADOC	 The QName prefix used for selection. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
/** * The local name or ID used for selection. */	TokenNameCOMMENT_JAVADOC	 The local name or ID used for selection. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * The index for selection. 0 means select all elements that match. */	TokenNameCOMMENT_JAVADOC	 The index for selection. 0 means select all elements that match. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * The selected nodes. */	TokenNameCOMMENT_JAVADOC	 The selected nodes. 
protected	TokenNameprotected	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
selectedContent	TokenNameIdentifier	 selected Content
;	TokenNameSEMICOLON	
/** * Creates a new XPathSubsetContentSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new XPathSubsetContentSelector object. 
public	TokenNamepublic	
XPathSubsetContentSelector	TokenNameIdentifier	 X Path Subset Content Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
bound	TokenNameIdentifier	 bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseSelector	TokenNameIdentifier	 parse Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the selector string. */	TokenNameCOMMENT_JAVADOC	 Parses the selector string. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseSelector	TokenNameIdentifier	 parse Selector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_INVALID	TokenNameIdentifier	 SELECTOR  INVALID
;	TokenNameSEMICOLON	
Scanner	TokenNameIdentifier	 Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name1	TokenNameIdentifier	 name1
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name1	TokenNameIdentifier	 name1
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
COLON	TokenNameIdentifier	 COLON
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name2	TokenNameIdentifier	 name2
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
name1	TokenNameIdentifier	 name1
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name2	TokenNameIdentifier	 name2
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
LEFT_SQUARE_BRACKET	TokenNameIdentifier	 LEFT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 RIGHT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
name1	TokenNameIdentifier	 name1
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name2	TokenNameIdentifier	 name2
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
LEFT_SQUARE_BRACKET	TokenNameIdentifier	 LEFT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 RIGHT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
name1	TokenNameIdentifier	 name1
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
LEFT_PARENTHESIS	TokenNameIdentifier	 LEFT  PARENTHESIS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name1	TokenNameIdentifier	 name1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
RIGHT_PARENTHESIS	TokenNameIdentifier	 RIGHT  PARENTHESIS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_ID	TokenNameIdentifier	 SELECTOR  ID
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
ASTERISK	TokenNameIdentifier	 ASTERISK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_ANY	TokenNameIdentifier	 SELECTOR  ANY
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
LEFT_SQUARE_BRACKET	TokenNameIdentifier	 LEFT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 RIGHT  SQUARE  BRACKET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
Scanner	TokenNameIdentifier	 Scanner
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorType	TokenNameIdentifier	 selector Type
=	TokenNameEQUAL	
SELECTOR_ANY	TokenNameIdentifier	 SELECTOR  ANY
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a list of nodes that were matched by the given selector * string. */	TokenNameCOMMENT_JAVADOC	 Returns a list of nodes that were matched by the given selector string. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getSelectedContent	TokenNameIdentifier	 get Selected Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedContent	TokenNameIdentifier	 selected Content
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedContent	TokenNameIdentifier	 selected Content
=	TokenNameEQUAL	
new	TokenNamenew	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
selectedContent	TokenNameIdentifier	 selected Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Forces this selector to update its selected nodes list. * Returns true if the selected node list needed updating. * This assumes that the previous content elements in this * shadow tree (in document order) have up-to-date selectedContent * lists. */	TokenNameCOMMENT_JAVADOC	 Forces this selector to update its selected nodes list. Returns true if the selected node list needed updating. This assumes that the previous content elements in this shadow tree (in document order) have up-to-date selectedContent lists. 
boolean	TokenNameboolean	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedContent	TokenNameIdentifier	 selected Content
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedContent	TokenNameIdentifier	 selected Content
=	TokenNameEQUAL	
new	TokenNamenew	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
selectedContent	TokenNameIdentifier	 selected Content
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implementation of NodeList that contains the nodes that matched * this selector. */	TokenNameCOMMENT_JAVADOC	 Implementation of NodeList that contains the nodes that matched this selector. 
protected	TokenNameprotected	
class	TokenNameclass	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
{	TokenNameLBRACE	
/** * The selected nodes. */	TokenNameCOMMENT_JAVADOC	 The selected nodes. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new SelectedNodes object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SelectedNodes object. 
public	TokenNamepublic	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
oldNodes	TokenNameIdentifier	 old Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nth	TokenNameIdentifier	 nth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
boundElement	TokenNameIdentifier	 bound Element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
selectorType	TokenNameIdentifier	 selector Type
==	TokenNameEQUAL_EQUAL	
SELECTOR_ANY	TokenNameIdentifier	 SELECTOR  ANY
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
selectorType	TokenNameIdentifier	 selector Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SELECTOR_ID	TokenNameIdentifier	 SELECTOR  ID
:	TokenNameCOLON	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
contentElement	TokenNameIdentifier	 content Element
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX throw invalid prefix exception 	TokenNameCOMMENT_LINE	XXX throw invalid prefix exception 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
matched	TokenNameIdentifier	 matched
&&	TokenNameAND_AND	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectorType	TokenNameIdentifier	 selector Type
==	TokenNameEQUAL_EQUAL	
SELECTOR_ANY	TokenNameIdentifier	 SELECTOR  ANY
||	TokenNameOR_OR	
selectorType	TokenNameIdentifier	 selector Type
==	TokenNameEQUAL_EQUAL	
SELECTOR_QNAME	TokenNameIdentifier	 SELECTOR  QNAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
matched	TokenNameIdentifier	 matched
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
++	TokenNamePLUS_PLUS	
nth	TokenNameIdentifier	 nth
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
nodesSize	TokenNameIdentifier	 nodes Size
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldNodes	TokenNameIdentifier	 old Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodesSize	TokenNameIdentifier	 nodes Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
nodesSize	TokenNameIdentifier	 nodes Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldNodes	TokenNameIdentifier	 old Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A scanner for XPath subset selectors. */	TokenNameCOMMENT_JAVADOC	 A scanner for XPath subset selectors. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Scanner	TokenNameIdentifier	 Scanner
extends	TokenNameextends	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EOF	TokenNameIdentifier	 EOF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COLON	TokenNameIdentifier	 COLON
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEFT_SQUARE_BRACKET	TokenNameIdentifier	 LEFT  SQUARE  BRACKET
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 RIGHT  SQUARE  BRACKET
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEFT_PARENTHESIS	TokenNameIdentifier	 LEFT  PARENTHESIS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RIGHT_PARENTHESIS	TokenNameIdentifier	 RIGHT  PARENTHESIS
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUMBER	TokenNameIdentifier	 NUMBER
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASTERISK	TokenNameIdentifier	 ASTERISK
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new Scanner object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Scanner object. 
public	TokenNamepublic	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end gap of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the end gap of the current lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
endGap	TokenNameIdentifier	 end Gap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int next() { 	TokenNameCOMMENT_LINE	public int next() { 
// int i = super.next(); 	TokenNameCOMMENT_LINE	int i = super.next(); 
// System.err.print("\t\t"); 	TokenNameCOMMENT_LINE	System.err.print("\t\t"); 
// switch (i) { 	TokenNameCOMMENT_LINE	switch (i) { 
// case EOF: 	TokenNameCOMMENT_LINE	case EOF: 
// System.err.println("EOF"); 	TokenNameCOMMENT_LINE	System.err.println("EOF"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case NAME: 	TokenNameCOMMENT_LINE	case NAME: 
// System.err.println("NAME " + getStringValue()); 	TokenNameCOMMENT_LINE	System.err.println("NAME " + getStringValue()); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case COLON: 	TokenNameCOMMENT_LINE	case COLON: 
// System.err.println("COLON"); 	TokenNameCOMMENT_LINE	System.err.println("COLON"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case LEFT_SQUARE_BRACKET: 	TokenNameCOMMENT_LINE	case LEFT_SQUARE_BRACKET: 
// System.err.println("LEFT_SQUARE_BRACKET"); 	TokenNameCOMMENT_LINE	System.err.println("LEFT_SQUARE_BRACKET"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case RIGHT_SQUARE_BRACKET: 	TokenNameCOMMENT_LINE	case RIGHT_SQUARE_BRACKET: 
// System.err.println("RIGHT_SQUARE_BRACKET"); 	TokenNameCOMMENT_LINE	System.err.println("RIGHT_SQUARE_BRACKET"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case LEFT_PARENTHESIS: 	TokenNameCOMMENT_LINE	case LEFT_PARENTHESIS: 
// System.err.println("LEFT_PARENTHESIS"); 	TokenNameCOMMENT_LINE	System.err.println("LEFT_PARENTHESIS"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case RIGHT_PARENTHESIS: 	TokenNameCOMMENT_LINE	case RIGHT_PARENTHESIS: 
// System.err.println("RIGHT_PARENTHESIS"); 	TokenNameCOMMENT_LINE	System.err.println("RIGHT_PARENTHESIS"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case STRING: 	TokenNameCOMMENT_LINE	case STRING: 
// System.err.println("STRING \"" + getStringValue() + "\""); 	TokenNameCOMMENT_LINE	System.err.println("STRING \"" + getStringValue() + "\""); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case NUMBER: 	TokenNameCOMMENT_LINE	case NUMBER: 
// System.err.println("NUMBER " + getStringValue()); 	TokenNameCOMMENT_LINE	System.err.println("NUMBER " + getStringValue()); 
// break; 	TokenNameCOMMENT_LINE	break; 
// case ASTERISK: 	TokenNameCOMMENT_LINE	case ASTERISK: 
// System.err.println("ASTERISK"); 	TokenNameCOMMENT_LINE	System.err.println("ASTERISK"); 
// break; 	TokenNameCOMMENT_LINE	break; 
// default: 	TokenNameCOMMENT_LINE	default: 
// System.err.println("?"); 	TokenNameCOMMENT_LINE	System.err.println("?"); 
// } 	TokenNameCOMMENT_LINE	} 
// return i; 	TokenNameCOMMENT_LINE	return i; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Returns the next token. */	TokenNameCOMMENT_JAVADOC	 Returns the next token. 
protected	TokenNameprotected	
void	TokenNamevoid	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
':'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
COLON	TokenNameIdentifier	 COLON
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LEFT_SQUARE_BRACKET	TokenNameIdentifier	 LEFT  SQUARE  BRACKET
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
RIGHT_SQUARE_BRACKET	TokenNameIdentifier	 RIGHT  SQUARE  BRACKET
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LEFT_PARENTHESIS	TokenNameIdentifier	 LEFT  PARENTHESIS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
RIGHT_PARENTHESIS	TokenNameIdentifier	 RIGHT  PARENTHESIS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ASTERISK	TokenNameIdentifier	 ASTERISK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLSpace	TokenNameIdentifier	 is XML Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
string1	TokenNameIdentifier	 string1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
string2	TokenNameIdentifier	 string2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"identifier.character"	TokenNameStringLiteral	identifier.character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Scans a single quoted string. */	TokenNameCOMMENT_JAVADOC	 Scans a single quoted string. 
protected	TokenNameprotected	
int	TokenNameint	
string1	TokenNameIdentifier	 string1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a double quoted string. */	TokenNameCOMMENT_JAVADOC	 Scans a double quoted string. 
protected	TokenNameprotected	
int	TokenNameint	
string2	TokenNameIdentifier	 string2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a number. */	TokenNameCOMMENT_JAVADOC	 Scans a number. 
protected	TokenNameprotected	
int	TokenNameint	
number	TokenNameIdentifier	 number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
dotNumber	TokenNameIdentifier	 dot Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
NUMBER	TokenNameIdentifier	 NUMBER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans the decimal part of a number. */	TokenNameCOMMENT_JAVADOC	 Scans the decimal part of a number. 
protected	TokenNameprotected	
int	TokenNameint	
dotNumber	TokenNameIdentifier	 dot Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
NUMBER	TokenNameIdentifier	 NUMBER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
