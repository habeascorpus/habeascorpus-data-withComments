/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
ui	TokenNameIdentifier	 ui
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DOMParser	TokenNameIdentifier	 DOM Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EncodingMap	TokenNameIdentifier	 Encoding Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
Augmentations	TokenNameIdentifier	 Augmentations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The DOMParserSaveEncoding class extends DOMParser. It also provides * the Java Encoding of the XML document by overriding the startDocument method * and providing a way to capture the MIME encoding from the XML document which * in turn is converted to the Java Encoding by the internal MIME2Java class. * * @version $Id: DOMParserSaveEncoding.java 950355 2010-06-02 03:43:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The DOMParserSaveEncoding class extends DOMParser. It also provides the Java Encoding of the XML document by overriding the startDocument method and providing a way to capture the MIME encoding from the XML document which in turn is converted to the Java Encoding by the internal MIME2Java class. * @version $Id: DOMParserSaveEncoding.java 950355 2010-06-02 03:43:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMParserSaveEncoding	TokenNameIdentifier	 DOM Parser Save Encoding
extends	TokenNameextends	
DOMParser	TokenNameIdentifier	 DOM Parser
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
_mimeEncoding	TokenNameIdentifier	 mime Encoding
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
//Default MIME so we check the file.encoding 	TokenNameCOMMENT_LINE	Default MIME so we check the file.encoding 
private	TokenNameprivate	
void	TokenNamevoid	
setMimeEncoding	TokenNameIdentifier	 set Mime Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_mimeEncoding	TokenNameIdentifier	 mime Encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getMimeEncoding	TokenNameIdentifier	 get Mime Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_mimeEncoding	TokenNameIdentifier	 mime Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJavaEncoding	TokenNameIdentifier	 get Java Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mimeEncoding	TokenNameIdentifier	 mime Encoding
=	TokenNameEQUAL	
getMimeEncoding	TokenNameIdentifier	 get Mime Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mimeEncoding	TokenNameIdentifier	 mime Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mimeEncoding	TokenNameIdentifier	 mime Encoding
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"DEFAULT"	TokenNameStringLiteral	DEFAULT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
=	TokenNameEQUAL	
"UTF8"	TokenNameStringLiteral	UTF8
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mimeEncoding	TokenNameIdentifier	 mime Encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
)	TokenNameRPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
=	TokenNameEQUAL	
"Unicode"	TokenNameStringLiteral	Unicode
;	TokenNameSEMICOLON	
else	TokenNameelse	
javaEncoding	TokenNameIdentifier	 java Encoding
=	TokenNameEQUAL	
EncodingMap	TokenNameIdentifier	 Encoding Map
.	TokenNameDOT	
getIANA2JavaMapping	TokenNameIdentifier	 get IAN A2 Java Mapping
(	TokenNameLPAREN	
mimeEncoding	TokenNameIdentifier	 mime Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// Should never return null 	TokenNameCOMMENT_LINE	Should never return null 
javaEncoding	TokenNameIdentifier	 java Encoding
=	TokenNameEQUAL	
"UTF8"	TokenNameStringLiteral	UTF8
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startGeneralEntity	TokenNameIdentifier	 start General Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMimeEncoding	TokenNameIdentifier	 set Mime Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startGeneralEntity	TokenNameIdentifier	 start General Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
