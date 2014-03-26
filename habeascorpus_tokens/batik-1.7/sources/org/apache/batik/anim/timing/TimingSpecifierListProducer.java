/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
TimingSpecifierListParser	TokenNameIdentifier	 Timing Specifier List Parser
;	TokenNameSEMICOLON	
/** * A {@link org.apache.batik.parser.TimingSpecifierListHandler} that creates * {@link TimingSpecifier}s. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimingSpecifierListProducer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A {@link org.apache.batik.parser.TimingSpecifierListHandler} that creates {@link TimingSpecifier}s. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimingSpecifierListProducer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
extends	TokenNameextends	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
{	TokenNameLBRACE	
/** * The list of parsed timing specifiers. */	TokenNameCOMMENT_JAVADOC	 The list of parsed timing specifiers. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The owner TimedElement used when creating the TimingSpecifiers. */	TokenNameCOMMENT_JAVADOC	 The owner TimedElement used when creating the TimingSpecifiers. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
/** * Whether the created TimingSpecifiers should be begin times. */	TokenNameCOMMENT_JAVADOC	 Whether the created TimingSpecifiers should be begin times. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
;	TokenNameSEMICOLON	
/** * Creates a new TimingSpecifierListProducer. */	TokenNameCOMMENT_JAVADOC	 Creates a new TimingSpecifierListProducer. 
public	TokenNamepublic	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBegin	TokenNameIdentifier	 is Begin
=	TokenNameEQUAL	
isBegin	TokenNameIdentifier	 is Begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of the parsed TimingSpecifiers. */	TokenNameCOMMENT_JAVADOC	 Returns an array of the parsed TimingSpecifiers. 
public	TokenNamepublic	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTimingSpecifiers	TokenNameIdentifier	 get Timing Specifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a timing specifier list. */	TokenNameCOMMENT_JAVADOC	 Parses a timing specifier list. 
public	TokenNamepublic	
static	TokenNamestatic	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseTimingSpecifierList	TokenNameIdentifier	 parse Timing Specifier List
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spec	TokenNameIdentifier	 spec
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifierListParser	TokenNameIdentifier	 Timing Specifier List Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
TimingSpecifierListParser	TokenNameIdentifier	 Timing Specifier List Parser
(	TokenNameLPAREN	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
new	TokenNamenew	
TimingSpecifierListProducer	TokenNameIdentifier	 Timing Specifier List Producer
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTimingSpecifierListHandler	TokenNameIdentifier	 set Timing Specifier List Handler
(	TokenNameLPAREN	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
specs	TokenNameIdentifier	 specs
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
getTimingSpecifiers	TokenNameIdentifier	 get Timing Specifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
specs	TokenNameIdentifier	 specs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TimingSpecifierHandler //////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	TimingSpecifierHandler //////////////////////////////////////////////// 
/** * Invoked when an offset value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an offset value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
offset	TokenNameIdentifier	 offset
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
OffsetTimingSpecifier	TokenNameIdentifier	 Offset Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a syncbase value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a syncbase value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
syncbase	TokenNameIdentifier	 syncbase
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
timeSymbol	TokenNameIdentifier	 time Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
SyncbaseTimingSpecifier	TokenNameIdentifier	 Syncbase Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
timeSymbol	TokenNameIdentifier	 time Symbol
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when an eventbase value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an eventbase value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
eventbase	TokenNameIdentifier	 eventbase
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventbaseID	TokenNameIdentifier	 eventbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
EventbaseTimingSpecifier	TokenNameIdentifier	 Eventbase Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
eventbaseID	TokenNameIdentifier	 eventbase ID
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a repeat value timing specifier with no iteration * is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a repeat value timing specifier with no iteration is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
repeat	TokenNameIdentifier	 repeat
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
RepeatTimingSpecifier	TokenNameIdentifier	 Repeat Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a repeat value timing specifier with an iteration * is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a repeat value timing specifier with an iteration is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
repeat	TokenNameIdentifier	 repeat
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
RepeatTimingSpecifier	TokenNameIdentifier	 Repeat Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when an accesskey value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an accesskey value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
accesskey	TokenNameIdentifier	 accesskey
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
char	TokenNamechar	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
AccesskeyTimingSpecifier	TokenNameIdentifier	 Accesskey Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when an SVG 1.2 accessKey value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an SVG 1.2 accessKey value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
accessKeySVG12	TokenNameIdentifier	 access Key SV G12
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyName	TokenNameIdentifier	 key Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
AccesskeyTimingSpecifier	TokenNameIdentifier	 Accesskey Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
keyName	TokenNameIdentifier	 key Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a media marker value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a media marker value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
mediaMarker	TokenNameIdentifier	 media Marker
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
markerName	TokenNameIdentifier	 marker Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
MediaMarkerTimingSpecifier	TokenNameIdentifier	 Media Marker Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
markerName	TokenNameIdentifier	 marker Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when a wallclock value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a wallclock value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
wallclock	TokenNameIdentifier	 wallclock
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
WallclockTimingSpecifier	TokenNameIdentifier	 Wallclock Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when an indefinite value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an indefinite value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
indefinite	TokenNameIdentifier	 indefinite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
IndefiniteTimingSpecifier	TokenNameIdentifier	 Indefinite Timing Specifier
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifiers	TokenNameIdentifier	 timing Specifiers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
