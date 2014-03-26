/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerConstants.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerConstants.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * Constants used in serialization, such as the string "xmlns" * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Constants used in serialization, such as the string "xmlns" @xsl.usage internal 
interface	TokenNameinterface	
SerializerConstants	TokenNameIdentifier	 Serializer Constants
{	TokenNameLBRACE	
/** To insert ]]> in a CDATA section by ending the last CDATA section with * ]] and starting the next CDATA section with > */	TokenNameCOMMENT_JAVADOC	 To insert ]]> in a CDATA section by ending the last CDATA section with ]] and starting the next CDATA section with > 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CDATA_CONTINUE	TokenNameIdentifier	 CDATA  CONTINUE
=	TokenNameEQUAL	
"]]]]><![CDATA[>"	TokenNameStringLiteral	]]]]><![CDATA[>
;	TokenNameSEMICOLON	
/** * The constant "]]>" */	TokenNameCOMMENT_JAVADOC	 The constant "]]>" 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CDATA_DELIMITER_CLOSE	TokenNameIdentifier	 CDATA  DELIMITER  CLOSE
=	TokenNameEQUAL	
"]]>"	TokenNameStringLiteral	]]>
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CDATA_DELIMITER_OPEN	TokenNameIdentifier	 CDATA  DELIMITER  OPEN
=	TokenNameEQUAL	
"<![CDATA["	TokenNameStringLiteral	<![CDATA[
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_AMP	TokenNameIdentifier	 ENTITY  AMP
=	TokenNameEQUAL	
"&amp;"	TokenNameStringLiteral	&amp;
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_CRLF	TokenNameIdentifier	 ENTITY  CRLF
=	TokenNameEQUAL	
"&#xA;"	TokenNameStringLiteral	&#xA;
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_GT	TokenNameIdentifier	 ENTITY  GT
=	TokenNameEQUAL	
"&gt;"	TokenNameStringLiteral	&gt;
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_LT	TokenNameIdentifier	 ENTITY  LT
=	TokenNameEQUAL	
"&lt;"	TokenNameStringLiteral	&lt;
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_QUOT	TokenNameIdentifier	 ENTITY  QUOT
=	TokenNameEQUAL	
"&quot;"	TokenNameStringLiteral	&quot;
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_PREFIX	TokenNameIdentifier	 XML  PREFIX
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_PREFIX	TokenNameIdentifier	 XMLNS  PREFIX
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
=	TokenNameEQUAL	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_SAX_SERIALIZER	TokenNameIdentifier	 DEFAULT  SAX  SERIALIZER
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
+	TokenNamePLUS	
".ToXMLSAXHandler"	TokenNameStringLiteral	.ToXMLSAXHandler
;	TokenNameSEMICOLON	
/** * Define the XML version. */	TokenNameCOMMENT_JAVADOC	 Define the XML version. 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLVERSION11	TokenNameIdentifier	 XMLVERSIO N11
=	TokenNameEQUAL	
"1.1"	TokenNameStringLiteral	1.1
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLVERSION10	TokenNameIdentifier	 XMLVERSIO N10
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
