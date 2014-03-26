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
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
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
Characters	TokenNameIdentifier	 Characters
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
EndElement	TokenNameIdentifier	 End Element
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
StartElement	TokenNameIdentifier	 Start Element
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
XMLEvent	TokenNameIdentifier	 XML Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
EmptyLocation	TokenNameIdentifier	 Empty Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
ImmutableLocation	TokenNameIdentifier	 Immutable Location
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * * @version $Id: XMLEventImpl.java 956312 2010-06-20 00:47:28Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland * @version $Id: XMLEventImpl.java 956312 2010-06-20 00:47:28Z mrglavas $ 
abstract	TokenNameabstract	
class	TokenNameclass	
XMLEventImpl	TokenNameIdentifier	 XML Event Impl
implements	TokenNameimplements	
XMLEvent	TokenNameIdentifier	 XML Event
{	TokenNameLBRACE	
/** * Constant representing the type of this event. * {@see javax.xml.stream.XMLStreamConstants} */	TokenNameCOMMENT_JAVADOC	 Constant representing the type of this event. {@see javax.xml.stream.XMLStreamConstants} 
private	TokenNameprivate	
int	TokenNameint	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
/** * Location object for this event. */	TokenNameCOMMENT_JAVADOC	 Location object for this event. 
private	TokenNameprivate	
Location	TokenNameIdentifier	 Location
fLocation	TokenNameIdentifier	 f Location
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
XMLEventImpl	TokenNameIdentifier	 XML Event Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEventType	TokenNameIdentifier	 f Event Type
=	TokenNameEQUAL	
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLocation	TokenNameIdentifier	 f Location
=	TokenNameEQUAL	
new	TokenNamenew	
ImmutableLocation	TokenNameIdentifier	 Immutable Location
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fLocation	TokenNameIdentifier	 f Location
=	TokenNameEQUAL	
EmptyLocation	TokenNameIdentifier	 Empty Location
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#getEventType() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#getEventType() 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#getLocation() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#getLocation() 
public	TokenNamepublic	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocation	TokenNameIdentifier	 f Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isStartElement() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isStartElement() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStartElement	TokenNameIdentifier	 is Start Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
START_ELEMENT	TokenNameIdentifier	 START  ELEMENT
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isAttribute() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isAttribute() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isNamespace() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isNamespace() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isNamespace	TokenNameIdentifier	 is Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isEndElement() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isEndElement() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEndElement	TokenNameIdentifier	 is End Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
END_ELEMENT	TokenNameIdentifier	 END  ELEMENT
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isEntityReference() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isEntityReference() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEntityReference	TokenNameIdentifier	 is Entity Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isProcessingInstruction() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isProcessingInstruction() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isProcessingInstruction	TokenNameIdentifier	 is Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PROCESSING_INSTRUCTION	TokenNameIdentifier	 PROCESSING  INSTRUCTION
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isCharacters() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isCharacters() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCharacters	TokenNameIdentifier	 is Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CHARACTERS	TokenNameIdentifier	 CHARACTERS
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
||	TokenNameOR_OR	
CDATA	TokenNameIdentifier	 CDATA
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
||	TokenNameOR_OR	
SPACE	TokenNameIdentifier	 SPACE
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isStartDocument() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isStartDocument() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStartDocument	TokenNameIdentifier	 is Start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
START_DOCUMENT	TokenNameIdentifier	 START  DOCUMENT
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#isEndDocument() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#isEndDocument() 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEndDocument	TokenNameIdentifier	 is End Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
END_DOCUMENT	TokenNameIdentifier	 END  DOCUMENT
==	TokenNameEQUAL_EQUAL	
fEventType	TokenNameIdentifier	 f Event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#asStartElement() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#asStartElement() 
public	TokenNamepublic	
final	TokenNamefinal	
StartElement	TokenNameIdentifier	 Start Element
asStartElement	TokenNameIdentifier	 as Start Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
StartElement	TokenNameIdentifier	 Start Element
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#asEndElement() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#asEndElement() 
public	TokenNamepublic	
final	TokenNamefinal	
EndElement	TokenNameIdentifier	 End Element
asEndElement	TokenNameIdentifier	 as End Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EndElement	TokenNameIdentifier	 End Element
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#asCharacters() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#asCharacters() 
public	TokenNamepublic	
final	TokenNamefinal	
Characters	TokenNameIdentifier	 Characters
asCharacters	TokenNameIdentifier	 as Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Characters	TokenNameIdentifier	 Characters
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.XMLEvent#getSchemaType() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.XMLEvent#getSchemaType() 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
getSchemaType	TokenNameIdentifier	 get Schema Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringWriter	TokenNameIdentifier	 String Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
xse	TokenNameIdentifier	 xse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
