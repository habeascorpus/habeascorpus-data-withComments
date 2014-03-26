/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
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
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
;	TokenNameSEMICOLON	
/** * Default serializer factory can construct serializers for the three * markup serializers (XML, HTML, XHTML ). * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more * information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 Default serializer factory can construct serializers for the three markup serializers (XML, HTML, XHTML ). * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
final	TokenNamefinal	
class	TokenNameclass	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
extends	TokenNameextends	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"MethodNotSupported"	TokenNameStringLiteral	MethodNotSupported
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputCharStream	TokenNameIdentifier	 set Output Char Stream
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
setOutputByteStream	TokenNameIdentifier	 set Output Byte Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Serializer	TokenNameIdentifier	 Serializer
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLSerializer	TokenNameIdentifier	 XML Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HTMLSerializer	TokenNameIdentifier	 HTML Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XHTMLSerializer	TokenNameIdentifier	 XHTML Serializer
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_method	TokenNameIdentifier	 method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TextSerializer	TokenNameIdentifier	 Text Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
SERIALIZER_DOMAIN	TokenNameIdentifier	 SERIALIZER  DOMAIN
,	TokenNameCOMMA	
"MethodNotSupported"	TokenNameStringLiteral	MethodNotSupported
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
_method	TokenNameIdentifier	 method
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSupportedMethod	TokenNameIdentifier	 get Supported Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
