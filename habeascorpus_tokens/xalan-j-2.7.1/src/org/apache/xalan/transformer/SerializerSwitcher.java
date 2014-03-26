/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerSwitcher.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerSwitcher.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
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
Serializer	TokenNameIdentifier	 Serializer
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
SerializerFactory	TokenNameIdentifier	 Serializer Factory
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
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
OutputProperties	TokenNameIdentifier	 Output Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * This is a helper class that decides if Xalan needs to switch * serializers, based on the first output element. */	TokenNameCOMMENT_JAVADOC	 This is a helper class that decides if Xalan needs to switch serializers, based on the first output element. 
public	TokenNamepublic	
class	TokenNameclass	
SerializerSwitcher	TokenNameIdentifier	 Serializer Switcher
{	TokenNameLBRACE	
/** * Switch to HTML serializer if element is HTML * * * @param transformer Non-null transformer instance * @param ns Namespace URI of the element * @param localName Local part of name of element * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Switch to HTML serializer if element is HTML * @param transformer Non-null transformer instance @param ns Namespace URI of the element @param localName Local part of name of element * @throws TransformerException 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
switchSerializerIfHTML	TokenNameIdentifier	 switch Serializer If HTML
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("transformer.getOutputPropertyNoDefault(OutputKeys.METHOD): "+ 	TokenNameCOMMENT_LINE	System.out.println("transformer.getOutputPropertyNoDefault(OutputKeys.METHOD): "+ 
// transformer.getOutputPropertyNoDefault(OutputKeys.METHOD)); 	TokenNameCOMMENT_LINE	transformer.getOutputPropertyNoDefault(OutputKeys.METHOD)); 
// Access at level of hashtable to see if the method has been set. 	TokenNameCOMMENT_LINE	Access at level of hashtable to see if the method has been set. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getOutputPropertyNoDefault	TokenNameIdentifier	 get Output Property No Default
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Getting the output properties this way won't cause a clone of 	TokenNameCOMMENT_LINE	Getting the output properties this way won't cause a clone of 
// the properties. 	TokenNameCOMMENT_LINE	the properties. 
Properties	TokenNameIdentifier	 Properties
prevProperties	TokenNameIdentifier	 prev Properties
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We have to make sure we get an output properties with the proper 	TokenNameCOMMENT_LINE	We have to make sure we get an output properties with the proper 
// defaults for the HTML method. The easiest way to do this is to 	TokenNameCOMMENT_LINE	defaults for the HTML method. The easiest way to do this is to 
// have the OutputProperties class do it. 	TokenNameCOMMENT_LINE	have the OutputProperties class do it. 
OutputProperties	TokenNameIdentifier	 Output Properties
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
prevProperties	TokenNameIdentifier	 prev Properties
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
htmlProperties	TokenNameIdentifier	 html Properties
=	TokenNameEQUAL	
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Serializer oldSerializer = transformer.getSerializer(); 	TokenNameCOMMENT_LINE	Serializer oldSerializer = transformer.getSerializer(); 
Serializer	TokenNameIdentifier	 Serializer
oldSerializer	TokenNameIdentifier	 old Serializer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
htmlProperties	TokenNameIdentifier	 html Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// transformer.setSerializer(serializer); 	TokenNameCOMMENT_LINE	transformer.setSerializer(serializer); 
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the value of a property, without using the default properties. This * can be used to test if a property has been explicitly set by the stylesheet * or user. * * @param name The property name, which is a fully-qualified URI. * * @return The value of the property, or null if not found. * * @throws IllegalArgumentException If the property is not supported, * and is not namespaced. */	TokenNameCOMMENT_JAVADOC	 Get the value of a property, without using the default properties. This can be used to test if a property has been explicitly set by the stylesheet or user. * @param name The property name, which is a fully-qualified URI. * @return The value of the property, or null if not found. * @throws IllegalArgumentException If the property is not supported, and is not namespaced. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getOutputPropertyNoDefault	TokenNameIdentifier	 get Output Property No Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qnameString	TokenNameIdentifier	 qname String
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qnameString	TokenNameIdentifier	 qname String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Switch to HTML serializer if element is HTML * * * @param ns Namespace URI of the element * @param localName Local part of name of element * * @throws TransformerException * @return new contentHandler. */	TokenNameCOMMENT_JAVADOC	 Switch to HTML serializer if element is HTML * @param ns Namespace URI of the element @param localName Local part of name of element * @throws TransformerException @return new contentHandler. 
public	TokenNamepublic	
static	TokenNamestatic	
Serializer	TokenNameIdentifier	 Serializer
switchSerializerIfHTML	TokenNameIdentifier	 switch Serializer If HTML
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
,	TokenNameCOMMA	
Serializer	TokenNameIdentifier	 Serializer
oldSerializer	TokenNameIdentifier	 old Serializer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
newSerializer	TokenNameIdentifier	 new Serializer
=	TokenNameEQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("transformer.getOutputPropertyNoDefault(OutputKeys.METHOD): "+ 	TokenNameCOMMENT_LINE	System.out.println("transformer.getOutputPropertyNoDefault(OutputKeys.METHOD): "+ 
// transformer.getOutputPropertyNoDefault(OutputKeys.METHOD)); 	TokenNameCOMMENT_LINE	transformer.getOutputPropertyNoDefault(OutputKeys.METHOD)); 
// Access at level of hashtable to see if the method has been set. 	TokenNameCOMMENT_LINE	Access at level of hashtable to see if the method has been set. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
getOutputPropertyNoDefault	TokenNameIdentifier	 get Output Property No Default
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
newSerializer	TokenNameIdentifier	 new Serializer
;	TokenNameSEMICOLON	
// Getting the output properties this way won't cause a clone of 	TokenNameCOMMENT_LINE	Getting the output properties this way won't cause a clone of 
// the properties. 	TokenNameCOMMENT_LINE	the properties. 
Properties	TokenNameIdentifier	 Properties
prevProperties	TokenNameIdentifier	 prev Properties
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
// We have to make sure we get an output properties with the proper 	TokenNameCOMMENT_LINE	We have to make sure we get an output properties with the proper 
// defaults for the HTML method. The easiest way to do this is to 	TokenNameCOMMENT_LINE	defaults for the HTML method. The easiest way to do this is to 
// have the OutputProperties class do it. 	TokenNameCOMMENT_LINE	have the OutputProperties class do it. 
OutputProperties	TokenNameIdentifier	 Output Properties
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
=	TokenNameEQUAL	
new	TokenNamenew	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
prevProperties	TokenNameIdentifier	 prev Properties
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
htmlProperties	TokenNameIdentifier	 html Properties
=	TokenNameEQUAL	
htmlOutputProperties	TokenNameIdentifier	 html Output Properties
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try 	TokenNameCOMMENT_LINE	try 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
htmlProperties	TokenNameIdentifier	 html Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
oldSerializer	TokenNameIdentifier	 old Serializer
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newSerializer	TokenNameIdentifier	 new Serializer
=	TokenNameEQUAL	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// catch (java.io.IOException e) 	TokenNameCOMMENT_LINE	catch (java.io.IOException e) 
// { 	TokenNameCOMMENT_LINE	{ 
// throw new TransformerException(e); 	TokenNameCOMMENT_LINE	throw new TransformerException(e); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
return	TokenNamereturn	
newSerializer	TokenNameIdentifier	 new Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
