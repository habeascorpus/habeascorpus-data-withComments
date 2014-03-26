/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerTrace.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerTrace.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * This interface defines a set of integer constants that identify trace event * types. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This interface defines a set of integer constants that identify trace event types. * @xsl.usage internal 
public	TokenNamepublic	
interface	TokenNameinterface	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
{	TokenNameLBRACE	
/** * Event type generated when a document begins. * */	TokenNameCOMMENT_JAVADOC	 Event type generated when a document begins. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_STARTDOCUMENT	TokenNameIdentifier	 EVENTTYPE  STARTDOCUMENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated when a document ends. */	TokenNameCOMMENT_JAVADOC	 Event type generated when a document ends. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_ENDDOCUMENT	TokenNameIdentifier	 EVENTTYPE  ENDDOCUMENT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated when an element begins (after the attributes have been processed but before the children have been added). */	TokenNameCOMMENT_JAVADOC	 Event type generated when an element begins (after the attributes have been processed but before the children have been added). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_STARTELEMENT	TokenNameIdentifier	 EVENTTYPE  STARTELEMENT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated when an element ends, after it's children have been added. */	TokenNameCOMMENT_JAVADOC	 Event type generated when an element ends, after it's children have been added. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_ENDELEMENT	TokenNameIdentifier	 EVENTTYPE  ENDELEMENT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated for character data (CDATA and Ignorable Whitespace have their own events). */	TokenNameCOMMENT_JAVADOC	 Event type generated for character data (CDATA and Ignorable Whitespace have their own events). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  CHARACTERS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated for ignorable whitespace (I'm not sure how much this is actually called. */	TokenNameCOMMENT_JAVADOC	 Event type generated for ignorable whitespace (I'm not sure how much this is actually called. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_IGNORABLEWHITESPACE	TokenNameIdentifier	 EVENTTYPE  IGNORABLEWHITESPACE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated for processing instructions. */	TokenNameCOMMENT_JAVADOC	 Event type generated for processing instructions. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_PI	TokenNameIdentifier	 EVENTTYPE  PI
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated after a comment has been added. */	TokenNameCOMMENT_JAVADOC	 Event type generated after a comment has been added. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_COMMENT	TokenNameIdentifier	 EVENTTYPE  COMMENT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generate after an entity ref is created. */	TokenNameCOMMENT_JAVADOC	 Event type generate after an entity ref is created. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_ENTITYREF	TokenNameIdentifier	 EVENTTYPE  ENTITYREF
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated after CDATA is generated. */	TokenNameCOMMENT_JAVADOC	 Event type generated after CDATA is generated. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_CDATA	TokenNameIdentifier	 EVENTTYPE  CDATA
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated when characters might be written to an output stream, * but these characters never are. They will ultimately be written out via * EVENTTYPE_OUTPUT_CHARACTERS. This type is used as attributes are collected. * Whenever the attributes change this event type is fired. At the very end * however, when the attributes do not change anymore and are going to be * ouput to the document the real characters will be written out using the * EVENTTYPE_OUTPUT_CHARACTERS. */	TokenNameCOMMENT_JAVADOC	 Event type generated when characters might be written to an output stream, but these characters never are. They will ultimately be written out via EVENTTYPE_OUTPUT_CHARACTERS. This type is used as attributes are collected. Whenever the attributes change this event type is fired. At the very end however, when the attributes do not change anymore and are going to be ouput to the document the real characters will be written out using the EVENTTYPE_OUTPUT_CHARACTERS. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  OUTPUT  PSEUDO  CHARACTERS
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Event type generated when characters are written to an output stream. */	TokenNameCOMMENT_JAVADOC	 Event type generated when characters are written to an output stream. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENTTYPE_OUTPUT_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  OUTPUT  CHARACTERS
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Tell if trace listeners are present. * * @return True if there are trace listeners */	TokenNameCOMMENT_JAVADOC	 Tell if trace listeners are present. * @return True if there are trace listeners 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fire startDocument, endDocument events. * * @param eventType One of the EVENTTYPE_XXX constants. */	TokenNameCOMMENT_JAVADOC	 Fire startDocument, endDocument events. * @param eventType One of the EVENTTYPE_XXX constants. 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fire startElement, endElement events. * * @param eventType One of the EVENTTYPE_XXX constants. * @param name The name of the element. * @param atts The SAX attribute list. */	TokenNameCOMMENT_JAVADOC	 Fire startElement, endElement events. * @param eventType One of the EVENTTYPE_XXX constants. @param name The name of the element. @param atts The SAX attribute list. 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fire characters, cdata events. * * @param eventType One of the EVENTTYPE_XXX constants. * @param ch The char array from the SAX event. * @param start The start offset to be used in the char array. * @param length The end offset to be used in the chara array. */	TokenNameCOMMENT_JAVADOC	 Fire characters, cdata events. * @param eventType One of the EVENTTYPE_XXX constants. @param ch The char array from the SAX event. @param start The start offset to be used in the char array. @param length The end offset to be used in the chara array. 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fire processingInstruction events. * * @param eventType One of the EVENTTYPE_XXX constants. * @param name The name of the processing instruction. * @param data The processing instruction data. */	TokenNameCOMMENT_JAVADOC	 Fire processingInstruction events. * @param eventType One of the EVENTTYPE_XXX constants. @param name The name of the processing instruction. @param data The processing instruction data. 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fire comment and entity ref events. * * @param eventType One of the EVENTTYPE_XXX constants. * @param data The comment or entity ref data. */	TokenNameCOMMENT_JAVADOC	 Fire comment and entity ref events. * @param eventType One of the EVENTTYPE_XXX constants. @param data The comment or entity ref data. 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
