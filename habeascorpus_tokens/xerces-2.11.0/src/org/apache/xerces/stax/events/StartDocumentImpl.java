/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
events	TokenNameIdentifier	 events
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
StartDocument	TokenNameIdentifier	 Start Document
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * * @version $Id: StartDocumentImpl.java 730471 2008-12-31 20:45:32Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland * @version $Id: StartDocumentImpl.java 730471 2008-12-31 20:45:32Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StartDocumentImpl	TokenNameIdentifier	 Start Document Impl
extends	TokenNameextends	
XMLEventImpl	TokenNameIdentifier	 XML Event Impl
implements	TokenNameimplements	
StartDocument	TokenNameIdentifier	 Start Document
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fCharEncoding	TokenNameIdentifier	 f Char Encoding
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fEncodingSet	TokenNameIdentifier	 f Encoding Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fVersion	TokenNameIdentifier	 f Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fStandaloneSet	TokenNameIdentifier	 f Standalone Set
;	TokenNameSEMICOLON	
/** * @param location */	TokenNameCOMMENT_JAVADOC	 @param location 
public	TokenNamepublic	
StartDocumentImpl	TokenNameIdentifier	 Start Document Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
charEncoding	TokenNameIdentifier	 char Encoding
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
encodingSet	TokenNameIdentifier	 encoding Set
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStandalone	TokenNameIdentifier	 is Standalone
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
standaloneSet	TokenNameIdentifier	 standalone Set
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
START_DOCUMENT	TokenNameIdentifier	 START  DOCUMENT
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCharEncoding	TokenNameIdentifier	 f Char Encoding
=	TokenNameEQUAL	
charEncoding	TokenNameIdentifier	 char Encoding
;	TokenNameSEMICOLON	
fEncodingSet	TokenNameIdentifier	 f Encoding Set
=	TokenNameEQUAL	
encodingSet	TokenNameIdentifier	 encoding Set
;	TokenNameSEMICOLON	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
=	TokenNameEQUAL	
isStandalone	TokenNameIdentifier	 is Standalone
;	TokenNameSEMICOLON	
fStandaloneSet	TokenNameIdentifier	 f Standalone Set
=	TokenNameEQUAL	
standaloneSet	TokenNameIdentifier	 standalone Set
;	TokenNameSEMICOLON	
fVersion	TokenNameIdentifier	 f Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#getSystemId() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#getSystemId() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#getCharacterEncodingScheme() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#getCharacterEncodingScheme() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCharacterEncodingScheme	TokenNameIdentifier	 get Character Encoding Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCharEncoding	TokenNameIdentifier	 f Char Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#encodingSet() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#encodingSet() 
public	TokenNamepublic	
boolean	TokenNameboolean	
encodingSet	TokenNameIdentifier	 encoding Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEncodingSet	TokenNameIdentifier	 f Encoding Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#isStandalone() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#isStandalone() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStandalone	TokenNameIdentifier	 is Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#standaloneSet() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#standaloneSet() 
public	TokenNamepublic	
boolean	TokenNameboolean	
standaloneSet	TokenNameIdentifier	 standalone Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fStandaloneSet	TokenNameIdentifier	 f Standalone Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartDocument#getVersion() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartDocument#getVersion() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fVersion	TokenNameIdentifier	 f Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<?xml version=""	TokenNameStringLiteral	<?xml version="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fVersion	TokenNameIdentifier	 f Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fVersion	TokenNameIdentifier	 f Version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fVersion	TokenNameIdentifier	 f Version
:	TokenNameCOLON	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encodingSet	TokenNameIdentifier	 encoding Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" encoding=""	TokenNameStringLiteral	 encoding="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fCharEncoding	TokenNameIdentifier	 f Char Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
standaloneSet	TokenNameIdentifier	 standalone Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" standalone=""	TokenNameStringLiteral	 standalone="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
fIsStandalone	TokenNameIdentifier	 f Is Standalone
?	TokenNameQUESTION	
"yes"	TokenNameStringLiteral	yes
:	TokenNameCOLON	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
