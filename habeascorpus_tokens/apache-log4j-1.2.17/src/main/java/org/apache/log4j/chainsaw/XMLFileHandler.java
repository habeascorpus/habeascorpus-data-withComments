/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
/** * A content handler for document containing Log4J events logged using the * XMLLayout class. It will create events and add them to a supplied model. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 A content handler for document containing Log4J events logged using the XMLLayout class. It will create events and add them to a supplied model. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> @version 1.0 
class	TokenNameclass	
XMLFileHandler	TokenNameIdentifier	 XML File Handler
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
/** represents the event tag **/	TokenNameCOMMENT_JAVADOC	 represents the event tag *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG_EVENT	TokenNameIdentifier	 TAG  EVENT
=	TokenNameEQUAL	
"log4j:event"	TokenNameStringLiteral	log4j:event
;	TokenNameSEMICOLON	
/** represents the message tag **/	TokenNameCOMMENT_JAVADOC	 represents the message tag *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG_MESSAGE	TokenNameIdentifier	 TAG  MESSAGE
=	TokenNameEQUAL	
"log4j:message"	TokenNameStringLiteral	log4j:message
;	TokenNameSEMICOLON	
/** represents the ndc tag **/	TokenNameCOMMENT_JAVADOC	 represents the ndc tag *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG_NDC	TokenNameIdentifier	 TAG  NDC
=	TokenNameEQUAL	
"log4j:NDC"	TokenNameStringLiteral	log4j:NDC
;	TokenNameSEMICOLON	
/** represents the throwable tag **/	TokenNameCOMMENT_JAVADOC	 represents the throwable tag *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG_THROWABLE	TokenNameIdentifier	 TAG  THROWABLE
=	TokenNameEQUAL	
"log4j:throwable"	TokenNameStringLiteral	log4j:throwable
;	TokenNameSEMICOLON	
/** represents the location info tag **/	TokenNameCOMMENT_JAVADOC	 represents the location info tag *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG_LOCATION_INFO	TokenNameIdentifier	 TAG  LOCATION  INFO
=	TokenNameEQUAL	
"log4j:locationInfo"	TokenNameStringLiteral	log4j:locationInfo
;	TokenNameSEMICOLON	
/** where to put the events **/	TokenNameCOMMENT_JAVADOC	 where to put the events *
private	TokenNameprivate	
final	TokenNamefinal	
MyTableModel	TokenNameIdentifier	 My Table Model
mModel	TokenNameIdentifier	 m Model
;	TokenNameSEMICOLON	
/** the number of events in the document **/	TokenNameCOMMENT_JAVADOC	 the number of events in the document *
private	TokenNameprivate	
int	TokenNameint	
mNumEvents	TokenNameIdentifier	 m Num Events
;	TokenNameSEMICOLON	
/** the time of the event **/	TokenNameCOMMENT_JAVADOC	 the time of the event *
private	TokenNameprivate	
long	TokenNamelong	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
;	TokenNameSEMICOLON	
/** the priority (level) of the event **/	TokenNameCOMMENT_JAVADOC	 the priority (level) of the event *
private	TokenNameprivate	
Level	TokenNameIdentifier	 Level
mLevel	TokenNameIdentifier	 m Level
;	TokenNameSEMICOLON	
/** the category of the event **/	TokenNameCOMMENT_JAVADOC	 the category of the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mCategoryName	TokenNameIdentifier	 m Category Name
;	TokenNameSEMICOLON	
/** the NDC for the event **/	TokenNameCOMMENT_JAVADOC	 the NDC for the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mNDC	TokenNameIdentifier	 m NDC
;	TokenNameSEMICOLON	
/** the thread for the event **/	TokenNameCOMMENT_JAVADOC	 the thread for the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mThreadName	TokenNameIdentifier	 m Thread Name
;	TokenNameSEMICOLON	
/** the msg for the event **/	TokenNameCOMMENT_JAVADOC	 the msg for the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mMessage	TokenNameIdentifier	 m Message
;	TokenNameSEMICOLON	
/** the throwable details the event **/	TokenNameCOMMENT_JAVADOC	 the throwable details the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
;	TokenNameSEMICOLON	
/** the location details for the event **/	TokenNameCOMMENT_JAVADOC	 the location details for the event *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mLocationDetails	TokenNameIdentifier	 m Location Details
;	TokenNameSEMICOLON	
/** buffer for collecting text **/	TokenNameCOMMENT_JAVADOC	 buffer for collecting text *
private	TokenNameprivate	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
mBuf	TokenNameIdentifier	 m Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new <code>XMLFileHandler</code> instance. * * @param aModel where to add the events */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>XMLFileHandler</code> instance. * @param aModel where to add the events 
XMLFileHandler	TokenNameIdentifier	 XML File Handler
(	TokenNameLPAREN	
MyTableModel	TokenNameIdentifier	 My Table Model
aModel	TokenNameIdentifier	 a Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mModel	TokenNameIdentifier	 m Model
=	TokenNameEQUAL	
aModel	TokenNameIdentifier	 a Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see DefaultHandler **/	TokenNameCOMMENT_JAVADOC	 @see DefaultHandler *
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
mNumEvents	TokenNameIdentifier	 m Num Events
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see DefaultHandler **/	TokenNameCOMMENT_JAVADOC	 @see DefaultHandler *
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aChars	TokenNameIdentifier	 a Chars
,	TokenNameCOMMA	
int	TokenNameint	
aStart	TokenNameIdentifier	 a Start
,	TokenNameCOMMA	
int	TokenNameint	
aLength	TokenNameIdentifier	 a Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mBuf	TokenNameIdentifier	 m Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
aChars	TokenNameIdentifier	 a Chars
,	TokenNameCOMMA	
aStart	TokenNameIdentifier	 a Start
,	TokenNameCOMMA	
aLength	TokenNameIdentifier	 a Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see DefaultHandler **/	TokenNameCOMMENT_JAVADOC	 @see DefaultHandler *
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aNamespaceURI	TokenNameIdentifier	 a Namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aLocalName	TokenNameIdentifier	 a Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_EVENT	TokenNameIdentifier	 TAG  EVENT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addEvent	TokenNameIdentifier	 add Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetData	TokenNameIdentifier	 reset Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_NDC	TokenNameIdentifier	 TAG  NDC
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNDC	TokenNameIdentifier	 m NDC
=	TokenNameEQUAL	
mBuf	TokenNameIdentifier	 m Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_MESSAGE	TokenNameIdentifier	 TAG  MESSAGE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mMessage	TokenNameIdentifier	 m Message
=	TokenNameEQUAL	
mBuf	TokenNameIdentifier	 m Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_THROWABLE	TokenNameIdentifier	 TAG  THROWABLE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
mBuf	TokenNameIdentifier	 m Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @see DefaultHandler **/	TokenNameCOMMENT_JAVADOC	 @see DefaultHandler *
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aNamespaceURI	TokenNameIdentifier	 a Namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aLocalName	TokenNameIdentifier	 a Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aQName	TokenNameIdentifier	 a Q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
aAtts	TokenNameIdentifier	 a Atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mBuf	TokenNameIdentifier	 m Buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_EVENT	TokenNameIdentifier	 TAG  EVENT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mThreadName	TokenNameIdentifier	 m Thread Name
=	TokenNameEQUAL	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"thread"	TokenNameStringLiteral	thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"timestamp"	TokenNameStringLiteral	timestamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mCategoryName	TokenNameIdentifier	 m Category Name
=	TokenNameEQUAL	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"logger"	TokenNameStringLiteral	logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mLevel	TokenNameIdentifier	 m Level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"level"	TokenNameStringLiteral	level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
TAG_LOCATION_INFO	TokenNameIdentifier	 TAG  LOCATION  INFO
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mLocationDetails	TokenNameIdentifier	 m Location Details
=	TokenNameEQUAL	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"class"	TokenNameStringLiteral	class
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"method"	TokenNameStringLiteral	method
)	TokenNameRPAREN	
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
aAtts	TokenNameIdentifier	 a Atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"line"	TokenNameStringLiteral	line
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @return the number of events in the document **/	TokenNameCOMMENT_JAVADOC	 @return the number of events in the document *
int	TokenNameint	
getNumEvents	TokenNameIdentifier	 get Num Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mNumEvents	TokenNameIdentifier	 m Num Events
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
/** Add an event to the model **/	TokenNameCOMMENT_JAVADOC	 Add an event to the model *
private	TokenNameprivate	
void	TokenNamevoid	
addEvent	TokenNameIdentifier	 add Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mModel	TokenNameIdentifier	 m Model
.	TokenNameDOT	
addEvent	TokenNameIdentifier	 add Event
(	TokenNameLPAREN	
new	TokenNamenew	
EventDetails	TokenNameIdentifier	 Event Details
(	TokenNameLPAREN	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
,	TokenNameCOMMA	
mLevel	TokenNameIdentifier	 m Level
,	TokenNameCOMMA	
mCategoryName	TokenNameIdentifier	 m Category Name
,	TokenNameCOMMA	
mNDC	TokenNameIdentifier	 m NDC
,	TokenNameCOMMA	
mThreadName	TokenNameIdentifier	 m Thread Name
,	TokenNameCOMMA	
mMessage	TokenNameIdentifier	 m Message
,	TokenNameCOMMA	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
,	TokenNameCOMMA	
mLocationDetails	TokenNameIdentifier	 m Location Details
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mNumEvents	TokenNameIdentifier	 m Num Events
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Reset the data for an event **/	TokenNameCOMMENT_JAVADOC	 Reset the data for an event *
private	TokenNameprivate	
void	TokenNamevoid	
resetData	TokenNameIdentifier	 reset Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mTimeStamp	TokenNameIdentifier	 m Time Stamp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mLevel	TokenNameIdentifier	 m Level
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mCategoryName	TokenNameIdentifier	 m Category Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mNDC	TokenNameIdentifier	 m NDC
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mThreadName	TokenNameIdentifier	 m Thread Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mMessage	TokenNameIdentifier	 m Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mThrowableStrRep	TokenNameIdentifier	 m Throwable Str Rep
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mLocationDetails	TokenNameIdentifier	 m Location Details
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
