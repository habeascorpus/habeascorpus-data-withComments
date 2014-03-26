/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: $ */	TokenNameCOMMENT_BLOCK	 $Id: $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
DOM3Serializer	TokenNameIdentifier	 DO M3 Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
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
Node	TokenNameIdentifier	 Node
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
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
;	TokenNameSEMICOLON	
/** * This class implements the DOM3Serializer interface. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class implements the DOM3Serializer interface. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DOM3SerializerImpl	TokenNameIdentifier	 DO M3 Serializer Impl
implements	TokenNameimplements	
DOM3Serializer	TokenNameIdentifier	 DO M3 Serializer
{	TokenNameLBRACE	
/** * Private class members */	TokenNameCOMMENT_JAVADOC	 Private class members 
// The DOMErrorHandler 	TokenNameCOMMENT_LINE	The DOMErrorHandler 
private	TokenNameprivate	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
// A LSSerializerFilter 	TokenNameCOMMENT_LINE	A LSSerializerFilter 
private	TokenNameprivate	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
fSerializerFilter	TokenNameIdentifier	 f Serializer Filter
;	TokenNameSEMICOLON	
// A LSSerializerFilter 	TokenNameCOMMENT_LINE	A LSSerializerFilter 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fNewLine	TokenNameIdentifier	 f New Line
;	TokenNameSEMICOLON	
// A SerializationHandler ex. an instance of ToXMLStream 	TokenNameCOMMENT_LINE	A SerializationHandler ex. an instance of ToXMLStream 
private	TokenNameprivate	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
fSerializationHandler	TokenNameIdentifier	 f Serialization Handler
;	TokenNameSEMICOLON	
/** * Constructor * * @param handler An instance of the SerializationHandler interface. */	TokenNameCOMMENT_JAVADOC	 Constructor * @param handler An instance of the SerializationHandler interface. 
public	TokenNamepublic	
DOM3SerializerImpl	TokenNameIdentifier	 DO M3 Serializer Impl
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSerializationHandler	TokenNameIdentifier	 f Serialization Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Public memebers 	TokenNameCOMMENT_LINE	Public memebers 
/** * Returns a DOMErrorHandler set on the DOM Level 3 Serializer. * * This interface is a public API. * * @return A Level 3 DOMErrorHandler */	TokenNameCOMMENT_JAVADOC	 Returns a DOMErrorHandler set on the DOM Level 3 Serializer. * This interface is a public API. * @return A Level 3 DOMErrorHandler 
public	TokenNamepublic	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorHandler	TokenNameIdentifier	 f Error Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a LSSerializerFilter set on the DOM Level 3 Serializer to filter nodes * during serialization. * * This interface is a public API. * * @return The Level 3 LSSerializerFilter */	TokenNameCOMMENT_JAVADOC	 Returns a LSSerializerFilter set on the DOM Level 3 Serializer to filter nodes during serialization. * This interface is a public API. * @return The Level 3 LSSerializerFilter 
public	TokenNamepublic	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
getNodeFilter	TokenNameIdentifier	 get Node Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSerializerFilter	TokenNameIdentifier	 f Serializer Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the end-of-line sequence of characters to be used during serialization. */	TokenNameCOMMENT_JAVADOC	 Gets the end-of-line sequence of characters to be used during serialization. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNewLine	TokenNameIdentifier	 get New Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fNewLine	TokenNameIdentifier	 f New Line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fNewLine	TokenNameIdentifier	 f New Line
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the Level 3 DOM node by creating an instance of DOM3TreeWalker * which traverses the DOM tree and invokes handler events to serialize * the DOM NOde. Throws an exception only if an I/O exception occured * while serializing. * This interface is a public API. * * @param node the Level 3 DOM node to serialize * @throws IOException if an I/O exception occured while serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the Level 3 DOM node by creating an instance of DOM3TreeWalker which traverses the DOM tree and invokes handler events to serialize the DOM NOde. Throws an exception only if an I/O exception occured while serializing. This interface is a public API. * @param node the Level 3 DOM node to serialize @throws IOException if an I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serializeDOM3	TokenNameIdentifier	 serialize DO M3
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DOM3TreeWalker	TokenNameIdentifier	 DO M3 Tree Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
new	TokenNamenew	
DOM3TreeWalker	TokenNameIdentifier	 DO M3 Tree Walker
(	TokenNameLPAREN	
fSerializationHandler	TokenNameIdentifier	 f Serialization Handler
,	TokenNameCOMMA	
fErrorHandler	TokenNameIdentifier	 f Error Handler
,	TokenNameCOMMA	
fSerializerFilter	TokenNameIdentifier	 f Serializer Filter
,	TokenNameCOMMA	
fNewLine	TokenNameIdentifier	 f New Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets a DOMErrorHandler on the DOM Level 3 Serializer. * * This interface is a public API. * * @param handler the Level 3 DOMErrorHandler */	TokenNameCOMMENT_JAVADOC	 Sets a DOMErrorHandler on the DOM Level 3 Serializer. * This interface is a public API. * @param handler the Level 3 DOMErrorHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorHandler	TokenNameIdentifier	 f Error Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a LSSerializerFilter on the DOM Level 3 Serializer to filter nodes * during serialization. * * This interface is a public API. * * @param filter the Level 3 LSSerializerFilter */	TokenNameCOMMENT_JAVADOC	 Sets a LSSerializerFilter on the DOM Level 3 Serializer to filter nodes during serialization. * This interface is a public API. * @param filter the Level 3 LSSerializerFilter 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeFilter	TokenNameIdentifier	 set Node Filter
(	TokenNameLPAREN	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSerializerFilter	TokenNameIdentifier	 f Serializer Filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a SerializationHandler on the DOM Serializer. * * This interface is a public API. * * @param handler An instance of SerializationHandler */	TokenNameCOMMENT_JAVADOC	 Sets a SerializationHandler on the DOM Serializer. * This interface is a public API. * @param handler An instance of SerializationHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setSerializationHandler	TokenNameIdentifier	 set Serialization Handler
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSerializationHandler	TokenNameIdentifier	 f Serialization Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the end-of-line sequence of characters to be used during serialization. * @param newLine The end-of-line sequence of characters to be used during serialization. */	TokenNameCOMMENT_JAVADOC	 Sets the end-of-line sequence of characters to be used during serialization. @param newLine The end-of-line sequence of characters to be used during serialization. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewLine	TokenNameIdentifier	 set New Line
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNewLine	TokenNameIdentifier	 f New Line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
