/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
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
LSSerializer	TokenNameIdentifier	 LS Serializer
;	TokenNameSEMICOLON	
/** * Simple Sample that: * - Generates a DOM from scratch. * - Writes the DOM to a String using an LSSerializer * @author Jeffrey Rodriguez * @version $Id: DOMGenerate.java 546623 2007-06-12 20:25:08Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Simple Sample that: - Generates a DOM from scratch. - Writes the DOM to a String using an LSSerializer @author Jeffrey Rodriguez @version $Id: DOMGenerate.java 546623 2007-06-12 20:25:08Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMGenerate	TokenNameIdentifier	 DOM Generate
{	TokenNameLBRACE	
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
try	TokenNametry	
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
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"person"	TokenNameStringLiteral	person
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create Root Element 	TokenNameCOMMENT_LINE	Create Root Element 
Element	TokenNameIdentifier	 Element
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create element 	TokenNameCOMMENT_LINE	Create element 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
"Jeff"	TokenNameStringLiteral	Jeff
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Attach element to Root element 	TokenNameCOMMENT_LINE	Attach element to Root element 
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"age"	TokenNameStringLiteral	age
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create another Element 	TokenNameCOMMENT_LINE	Create another Element 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
"28"	TokenNameStringLiteral	28
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Attach Element to previous element down tree 	TokenNameCOMMENT_LINE	Attach Element to previous element down tree 
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"height"	TokenNameStringLiteral	height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
"1.80"	TokenNameStringLiteral	1.80
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Attach another Element - grandaugther 	TokenNameCOMMENT_LINE	Attach another Element - grandaugther 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add Root to Document 	TokenNameCOMMENT_LINE	Add Root to Document 
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
domImplLS	TokenNameIdentifier	 dom Impl LS
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
LSSerializer	TokenNameIdentifier	 LS Serializer
ser	TokenNameIdentifier	 ser
=	TokenNameEQUAL	
domImplLS	TokenNameIdentifier	 dom Impl LS
.	TokenNameDOT	
createLSSerializer	TokenNameIdentifier	 create LS Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a serializer for the DOM 	TokenNameCOMMENT_LINE	Create a serializer for the DOM 
LSOutput	TokenNameIdentifier	 LS Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
domImplLS	TokenNameIdentifier	 dom Impl LS
.	TokenNameDOT	
createLSOutput	TokenNameIdentifier	 create LS Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
stringOut	TokenNameIdentifier	 string Out
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Writer will be a String 	TokenNameCOMMENT_LINE	Writer will be a String 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
stringOut	TokenNameIdentifier	 string Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ser	TokenNameIdentifier	 ser
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Serialize the DOM 	TokenNameCOMMENT_LINE	Serialize the DOM 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"STRXML = "	TokenNameStringLiteral	STRXML = 
+	TokenNamePLUS	
stringOut	TokenNameIdentifier	 string Out
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Spit out the DOM as a String 	TokenNameCOMMENT_LINE	Spit out the DOM as a String 
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
}	TokenNameRBRACE	
