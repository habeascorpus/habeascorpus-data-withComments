/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMError	TokenNameIdentifier	 DOM Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
bootstrap	TokenNameIdentifier	 bootstrap
.	TokenNameDOT	
DOMImplementationRegistry	TokenNameIdentifier	 DOM Implementation Registry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
DOMImplementationLS	TokenNameIdentifier	 DOM Implementation LS
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSOutput	TokenNameIdentifier	 LS Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSParser	TokenNameIdentifier	 LS Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSParserFilter	TokenNameIdentifier	 LS Parser Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSSerializer	TokenNameIdentifier	 LS Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
;	TokenNameSEMICOLON	
/** * This sample program illustrates how to use DOM L3 * DOMBuilder, DOMBuilderFilter DOMWriter and other DOM L3 functionality * to preparse, revalidate and safe document. * * @version $Id: DOM3.java 950355 2010-06-02 03:43:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample program illustrates how to use DOM L3 DOMBuilder, DOMBuilderFilter DOMWriter and other DOM L3 functionality to preparse, revalidate and safe document. * @version $Id: DOM3.java 950355 2010-06-02 03:43:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOM3	TokenNameIdentifier	 DO M3
implements	TokenNameimplements	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
,	TokenNameCOMMA	
LSParserFilter	TokenNameIdentifier	 LS Parser Filter
{	TokenNameLBRACE	
/** Default namespaces support (true). */	TokenNameCOMMENT_JAVADOC	 Default namespaces support (true). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Default validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default Schema validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LSParser	TokenNameIdentifier	 LS Parser
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// get DOM Implementation using DOM Registry 	TokenNameCOMMENT_LINE	get DOM Implementation using DOM Registry 
// System.setProperty(DOMImplementationRegistry.PROPERTY,"org.apache.xerces.dom.DOMXSImplementationSourceImpl"); 	TokenNameCOMMENT_LINE	System.setProperty(DOMImplementationRegistry.PROPERTY,"org.apache.xerces.dom.DOMXSImplementationSourceImpl"); 
DOMImplementationRegistry	TokenNameIdentifier	 DOM Implementation Registry
registry	TokenNameIdentifier	 registry
=	TokenNameEQUAL	
DOMImplementationRegistry	TokenNameIdentifier	 DOM Implementation Registry
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMImplementationLS	TokenNameIdentifier	 DOM Implementation LS
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMImplementationLS	TokenNameIdentifier	 DOM Implementation LS
)	TokenNameRPAREN	
registry	TokenNameIdentifier	 registry
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
"LS"	TokenNameStringLiteral	LS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create DOMBuilder 	TokenNameCOMMENT_LINE	create DOMBuilder 
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
createLSParser	TokenNameIdentifier	 create LS Parser
(	TokenNameLPAREN	
DOMImplementationLS	TokenNameIdentifier	 DOM Implementation LS
.	TokenNameDOT	
MODE_SYNCHRONOUS	TokenNameIdentifier	 MODE  SYNCHRONOUS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getDomConfig	TokenNameIdentifier	 get Dom Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create Error Handler 	TokenNameCOMMENT_LINE	create Error Handler 
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DOM3	TokenNameIdentifier	 DO M3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create filter 	TokenNameCOMMENT_LINE	create filter 
LSParserFilter	TokenNameIdentifier	 LS Parser Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
DOM3	TokenNameIdentifier	 DO M3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set error handler 	TokenNameCOMMENT_LINE	set error handler 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"error-handler"	TokenNameStringLiteral	error-handler
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set validation feature 	TokenNameCOMMENT_LINE	set validation feature 
//config.setParameter("validate", Boolean.FALSE); 	TokenNameCOMMENT_LINE	config.setParameter("validate", Boolean.FALSE); 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"validate"	TokenNameStringLiteral	validate
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set schema language 	TokenNameCOMMENT_LINE	set schema language 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"schema-type"	TokenNameStringLiteral	schema-type
,	TokenNameCOMMA	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//config.setParameter("psvi",Boolean.TRUE); 	TokenNameCOMMENT_LINE	config.setParameter("psvi",Boolean.TRUE); 
//config.setParameter("schema-type","http://www.w3.org/TR/REC-xml"); 	TokenNameCOMMENT_LINE	config.setParameter("schema-type","http://www.w3.org/TR/REC-xml"); 
// set schema location 	TokenNameCOMMENT_LINE	set schema location 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"schema-location"	TokenNameStringLiteral	schema-location
,	TokenNameCOMMA	
"personal.xsd"	TokenNameStringLiteral	personal.xsd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse document 	TokenNameCOMMENT_LINE	parse document 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parsing "	TokenNameStringLiteral	Parsing 
+	TokenNamePLUS	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
parseURI	TokenNameIdentifier	 parse URI
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set error handler on the Document 	TokenNameCOMMENT_LINE	set error handler on the Document 
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDomConfig	TokenNameIdentifier	 get Dom Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"error-handler"	TokenNameStringLiteral	error-handler
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set validation feature 	TokenNameCOMMENT_LINE	set validation feature 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"validate"	TokenNameStringLiteral	validate
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"schema-type"	TokenNameStringLiteral	schema-type
,	TokenNameCOMMA	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//config.setParameter("schema-type","http://www.w3.org/TR/REC-xml"); 	TokenNameCOMMENT_LINE	config.setParameter("schema-type","http://www.w3.org/TR/REC-xml"); 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"schema-location"	TokenNameStringLiteral	schema-location
,	TokenNameCOMMA	
"data/personal.xsd"	TokenNameStringLiteral	data/personal.xsd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove comments from the document 	TokenNameCOMMENT_LINE	remove comments from the document 
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"comments"	TokenNameStringLiteral	comments
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Normalizing document... "	TokenNameStringLiteral	Normalizing document... 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
normalizeDocument	TokenNameIdentifier	 normalize Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create DOMWriter 	TokenNameCOMMENT_LINE	create DOMWriter 
LSSerializer	TokenNameIdentifier	 LS Serializer
domWriter	TokenNameIdentifier	 dom Writer
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
createLSSerializer	TokenNameIdentifier	 create LS Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Serializing document... "	TokenNameStringLiteral	Serializing document... 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
domWriter	TokenNameIdentifier	 dom Writer
.	TokenNameDOT	
getDomConfig	TokenNameIdentifier	 get Dom Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
"xml-declaration"	TokenNameStringLiteral	xml-declaration
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//config.setParameter("validate",errorHandler); 	TokenNameCOMMENT_LINE	config.setParameter("validate",errorHandler); 
// serialize document to standard output 	TokenNameCOMMENT_LINE	serialize document to standard output 
//domWriter.writeNode(System.out, doc); 	TokenNameCOMMENT_LINE	domWriter.writeNode(System.out, doc); 
LSOutput	TokenNameIdentifier	 LS Output
dOut	TokenNameIdentifier	 d Out
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
createLSOutput	TokenNameIdentifier	 create LS Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dOut	TokenNameIdentifier	 d Out
.	TokenNameDOT	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
domWriter	TokenNameIdentifier	 dom Writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
dOut	TokenNameIdentifier	 d Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: java dom.DOM3 uri ..."	TokenNameStringLiteral	usage: java dom.DOM3 uri ...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NOTE: You can only validate DOM tree against XML Schemas."	TokenNameStringLiteral	NOTE: You can only validate DOM tree against XML Schemas.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
public	TokenNamepublic	
boolean	TokenNameboolean	
handleError	TokenNameIdentifier	 handle Error
(	TokenNameLPAREN	
DOMError	TokenNameIdentifier	 DOM Error
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
severity	TokenNameIdentifier	 severity
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
==	TokenNameEQUAL_EQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[dom3-error]: "	TokenNameStringLiteral	[dom3-error]: 
+	TokenNamePLUS	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
severity	TokenNameIdentifier	 severity
==	TokenNameEQUAL_EQUAL	
DOMError	TokenNameIdentifier	 DOM Error
.	TokenNameDOT	
SEVERITY_WARNING	TokenNameIdentifier	 SEVERITY  WARNING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[dom3-warning]: "	TokenNameStringLiteral	[dom3-warning]: 
+	TokenNamePLUS	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.ls.LSParserFilter#acceptNode(Node) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.ls.LSParserFilter#acceptNode(Node) 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
enode	TokenNameIdentifier	 enode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.ls.LSParserFilter#getWhatToShow() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.ls.LSParserFilter#getWhatToShow() 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeFilter	TokenNameIdentifier	 Node Filter
.	TokenNameDOT	
SHOW_ELEMENT	TokenNameIdentifier	 SHOW  ELEMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.ls.LSParserFilter#startElement(Element) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.ls.LSParserFilter#startElement(Element) 
public	TokenNamepublic	
short	TokenNameshort	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LSParserFilter	TokenNameIdentifier	 LS Parser Filter
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
