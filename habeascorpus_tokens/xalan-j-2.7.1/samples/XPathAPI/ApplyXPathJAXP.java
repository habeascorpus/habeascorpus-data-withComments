/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * JAXP 1.3 XPath API sample. * * Basic utility for applying an XPath expression to an input xml file and printing * the evaluation result, using JAXP 1.3 XPath API. * * Takes 3 arguments: * (1) an xml file name * (2) an XPath expression to apply to the input document * (3) the return type, which is one of the following Strings: * num, bool, str, node, nodeset * * Examples: * java ApplyXPathJAXP foo.xml /doc/name[1]/@last str * java ApplyXPathJAXP foo.xml /doc/name nodeset */	TokenNameCOMMENT_JAVADOC	 JAXP 1.3 XPath API sample. * Basic utility for applying an XPath expression to an input xml file and printing the evaluation result, using JAXP 1.3 XPath API. * Takes 3 arguments: (1) an xml file name (2) an XPath expression to apply to the input document (3) the return type, which is one of the following Strings: num, bool, str, node, nodeset * Examples: java ApplyXPathJAXP foo.xml /doc/name[1]/@last str java ApplyXPathJAXP foo.xml /doc/name nodeset 
public	TokenNamepublic	
class	TokenNameclass	
ApplyXPathJAXP	TokenNameIdentifier	 Apply X Path JAXP
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java ApplyXPathAPI xml_file xpath_expression type"	TokenNameStringLiteral	Usage: java ApplyXPathAPI xml_file xpath_expression type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InputSource	TokenNameIdentifier	 Input Source
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// set the return type 	TokenNameCOMMENT_LINE	set the return type 
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"num"	TokenNameStringLiteral	num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"bool"	TokenNameStringLiteral	bool
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"str"	TokenNameStringLiteral	str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"node"	TokenNameStringLiteral	node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODE	TokenNameIdentifier	 NODE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"nodeset"	TokenNameStringLiteral	nodeset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
returnType	TokenNameIdentifier	 return Type
=	TokenNameEQUAL	
XPathConstants	TokenNameIdentifier	 X Path Constants
.	TokenNameDOT	
NODESET	TokenNameIdentifier	 NODESET
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Invalid return type: "	TokenNameStringLiteral	Invalid return type: 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new XPath 	TokenNameCOMMENT_LINE	Create a new XPath 
XPathFactory	TokenNameIdentifier	 X Path Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
XPathFactory	TokenNameIdentifier	 X Path Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newXPath	TokenNameIdentifier	 new X Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// compile the XPath expression 	TokenNameCOMMENT_LINE	compile the XPath expression 
XPathExpression	TokenNameIdentifier	 X Path Expression
xpathExpr	TokenNameIdentifier	 xpath Expr
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Evaluate the XPath expression against the input document 	TokenNameCOMMENT_LINE	Evaluate the XPath expression against the input document 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
xpathExpr	TokenNameIdentifier	 xpath Expr
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
,	TokenNameCOMMA	
returnType	TokenNameIdentifier	 return Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Print the result to System.out. 	TokenNameCOMMENT_LINE	Print the result to System.out. 
printResult	TokenNameIdentifier	 print Result
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print the type and value of the evaluation result. */	TokenNameCOMMENT_JAVADOC	 Print the type and value of the evaluation result. 
static	TokenNamestatic	
void	TokenNamevoid	
printResult	TokenNameIdentifier	 print Result
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result type: double"	TokenNameStringLiteral	Result type: double
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Value: "	TokenNameStringLiteral	Value: 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result type: boolean"	TokenNameStringLiteral	Result type: boolean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Value: "	TokenNameStringLiteral	Value: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result type: String"	TokenNameStringLiteral	Result type: String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Value: "	TokenNameStringLiteral	Value: 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result type: Node"	TokenNameStringLiteral	Result type: Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<output>"	TokenNameStringLiteral	<output>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</output>"	TokenNameStringLiteral	</output>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result type: NodeList"	TokenNameStringLiteral	Result type: NodeList
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<output>"	TokenNameStringLiteral	<output>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printNodeList	TokenNameIdentifier	 print Node List
(	TokenNameLPAREN	
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</output>"	TokenNameStringLiteral	</output>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Decide if the node is text, and so must be handled specially */	TokenNameCOMMENT_JAVADOC	 Decide if the node is text, and so must be handled specially 
static	TokenNamestatic	
boolean	TokenNameboolean	
isTextNode	TokenNameIdentifier	 is Text Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTextNode	TokenNameIdentifier	 is Text Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Set up an identity transformer to use as serializer. 	TokenNameCOMMENT_LINE	Set up an identity transformer to use as serializer. 
Transformer	TokenNameIdentifier	 Transformer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
,	TokenNameCOMMA	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
printNodeList	TokenNameIdentifier	 print Node List
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nodelist	TokenNameIdentifier	 nodelist
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
// Set up an identity transformer to use as serializer. 	TokenNameCOMMENT_LINE	Set up an identity transformer to use as serializer. 
Transformer	TokenNameIdentifier	 Transformer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
,	TokenNameCOMMA	
"yes"	TokenNameStringLiteral	yes
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
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nodelist	TokenNameIdentifier	 nodelist
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTextNode	TokenNameIdentifier	 is Text Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM may have more than one node corresponding to a 	TokenNameCOMMENT_LINE	DOM may have more than one node corresponding to a 
// single XPath text node. Coalesce all contiguous text nodes 	TokenNameCOMMENT_LINE	single XPath text node. Coalesce all contiguous text nodes 
// at this level 	TokenNameCOMMENT_LINE	at this level 
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nn	TokenNameIdentifier	 nn
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isTextNode	TokenNameIdentifier	 is Text Node
(	TokenNameLPAREN	
nn	TokenNameIdentifier	 nn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nn	TokenNameIdentifier	 nn
=	TokenNameEQUAL	
nn	TokenNameIdentifier	 nn
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nn	TokenNameIdentifier	 nn
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
DOMSource	TokenNameIdentifier	 DOM Source
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
