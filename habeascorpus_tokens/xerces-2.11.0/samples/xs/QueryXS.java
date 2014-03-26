/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xs	TokenNameIdentifier	 xs
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
XSConstants	TokenNameIdentifier	 XS Constants
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
XSImplementation	TokenNameIdentifier	 XS Implementation
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
XSLoader	TokenNameIdentifier	 XS Loader
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
XSModel	TokenNameIdentifier	 XS Model
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
XSNamedMap	TokenNameIdentifier	 XS Named Map
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
XSObject	TokenNameIdentifier	 XS Object
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
LSParser	TokenNameIdentifier	 LS Parser
;	TokenNameSEMICOLON	
/** * This sample program illustrates how to use load XML Schemas and * use XML Schema API (org.apache.xerces.xs) to navigate XML Schema components. * * @author Elena Litani, IBM * @version $Id: QueryXS.java 902707 2010-01-25 05:09:04Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample program illustrates how to use load XML Schemas and use XML Schema API (org.apache.xerces.xs) to navigate XML Schema components. * @author Elena Litani, IBM @version $Id: QueryXS.java 902707 2010-01-25 05:09:04Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
QueryXS	TokenNameIdentifier	 Query XS
implements	TokenNameimplements	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
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
// System.setProperty( 	TokenNameCOMMENT_LINE	System.setProperty( 
// DOMImplementationRegistry.PROPERTY, 	TokenNameCOMMENT_LINE	DOMImplementationRegistry.PROPERTY, 
// "org.apache.xerces.dom.DOMXSImplementationSourceImpl"); 	TokenNameCOMMENT_LINE	"org.apache.xerces.dom.DOMXSImplementationSourceImpl"); 
DOMImplementationRegistry	TokenNameIdentifier	 DOM Implementation Registry
registry	TokenNameIdentifier	 registry
=	TokenNameEQUAL	
DOMImplementationRegistry	TokenNameIdentifier	 DOM Implementation Registry
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSImplementation	TokenNameIdentifier	 XS Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSImplementation	TokenNameIdentifier	 XS Implementation
)	TokenNameRPAREN	
registry	TokenNameIdentifier	 registry
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
"XS-Loader"	TokenNameStringLiteral	XS-Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSLoader	TokenNameIdentifier	 XS Loader
schemaLoader	TokenNameIdentifier	 schema Loader
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
createXSLoader	TokenNameIdentifier	 create XS Loader
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMConfiguration	TokenNameIdentifier	 DOM Configuration
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
schemaLoader	TokenNameIdentifier	 schema Loader
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create Error Handler 	TokenNameCOMMENT_LINE	create Error Handler 
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
QueryXS	TokenNameIdentifier	 Query XS
(	TokenNameLPAREN	
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
XSModel	TokenNameIdentifier	 XS Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
schemaLoader	TokenNameIdentifier	 schema Loader
.	TokenNameDOT	
loadURI	TokenNameIdentifier	 load URI
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// element declarations 	TokenNameCOMMENT_LINE	element declarations 
XSNamedMap	TokenNameIdentifier	 XS Named Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ELEMENT_DECLARATION	TokenNameIdentifier	 ELEMENT  DECLARATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"* Global element declarations: {namespace} name "	TokenNameStringLiteral	* Global element declarations: {namespace} name 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// attribute declarations 	TokenNameCOMMENT_LINE	attribute declarations 
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ATTRIBUTE_DECLARATION	TokenNameIdentifier	 ATTRIBUTE  DECLARATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"* Global attribute declarations: {namespace} name"	TokenNameStringLiteral	* Global attribute declarations: {namespace} name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// notation declarations 	TokenNameCOMMENT_LINE	notation declarations 
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
TYPE_DEFINITION	TokenNameIdentifier	 TYPE  DEFINITION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"* Global type declarations: {namespace} name"	TokenNameStringLiteral	* Global type declarations: {namespace} name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// notation declarations 	TokenNameCOMMENT_LINE	notation declarations 
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getComponents	TokenNameIdentifier	 get Components
(	TokenNameLPAREN	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NOTATION_DECLARATION	TokenNameIdentifier	 NOTATION  DECLARATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"* Global notation declarations: {namespace} name"	TokenNameStringLiteral	* Global notation declarations: {namespace} name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"*************************************************"	TokenNameStringLiteral	*************************************************
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
map	TokenNameIdentifier	 map
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"usage: java dom.QueryXS uri ..."	TokenNameStringLiteral	usage: java dom.QueryXS uri ...
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
"[xs-error]: "	TokenNameStringLiteral	[xs-error]: 
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
"[xs-warning]: "	TokenNameStringLiteral	[xs-warning]: 
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
}	TokenNameRBRACE	
