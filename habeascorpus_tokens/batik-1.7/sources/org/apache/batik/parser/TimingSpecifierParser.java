/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** * This class implements an event-based parser for SMIL timing specifier * list values. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimingSpecifierParser.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for SMIL timing specifier list values. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimingSpecifierParser.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TimingSpecifierParser	TokenNameIdentifier	 Timing Specifier Parser
extends	TokenNameextends	
TimingParser	TokenNameIdentifier	 Timing Parser
{	TokenNameLBRACE	
/** * The handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The handler used to report parse events. 
protected	TokenNameprotected	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
;	TokenNameSEMICOLON	
/** * Creates a new TimingSpecifierParser. * @param useSVG11AccessKeys allows the use of accessKey() timing * specifiers with a single character * @param useSVG12AccessKeys allows the use of accessKey() with a * DOM 3 key name */	TokenNameCOMMENT_JAVADOC	 Creates a new TimingSpecifierParser. @param useSVG11AccessKeys allows the use of accessKey() timing specifiers with a single character @param useSVG12AccessKeys allows the use of accessKey() with a DOM 3 key name 
public	TokenNamepublic	
TimingSpecifierParser	TokenNameIdentifier	 Timing Specifier Parser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
=	TokenNameEQUAL	
DefaultTimingSpecifierHandler	TokenNameIdentifier	 Default Timing Specifier Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a parse event handler. */	TokenNameCOMMENT_JAVADOC	 Registers a parse event handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimingSpecifierHandler	TokenNameIdentifier	 set Timing Specifier Handler
(	TokenNameLPAREN	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parse event handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the parse event handler in use. 
public	TokenNamepublic	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
getTimingSpecifierHandler	TokenNameIdentifier	 get Timing Specifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a timing specifier. */	TokenNameCOMMENT_JAVADOC	 Parses a timing specifier. 
protected	TokenNameprotected	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
parseTimingSpecifier	TokenNameIdentifier	 parse Timing Specifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"end.of.stream.expected"	TokenNameStringLiteral	end.of.stream.expected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handleTimingSpecifier	TokenNameIdentifier	 handle Timing Specifier
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls the appropriate parse event handler function for the given * parsed timing specifier. */	TokenNameCOMMENT_JAVADOC	 Calls the appropriate parse event handler function for the given parsed timing specifier. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleTimingSpecifier	TokenNameIdentifier	 handle Timing Specifier
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TIME_OFFSET	TokenNameIdentifier	 TIME  OFFSET
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_SYNCBASE	TokenNameIdentifier	 TIME  SYNCBASE
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
syncbase	TokenNameIdentifier	 syncbase
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_EVENTBASE	TokenNameIdentifier	 TIME  EVENTBASE
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
eventbase	TokenNameIdentifier	 eventbase
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_REPEAT	TokenNameIdentifier	 TIME  REPEAT
:	TokenNameCOLON	
{	TokenNameLBRACE	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
repeat	TokenNameIdentifier	 repeat
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
repeat	TokenNameIdentifier	 repeat
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
TIME_ACCESSKEY	TokenNameIdentifier	 TIME  ACCESSKEY
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
accesskey	TokenNameIdentifier	 accesskey
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
charValue	TokenNameIdentifier	 char Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_ACCESSKEY_SVG12	TokenNameIdentifier	 TIME  ACCESSKEY  SV G12
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
accessKeySVG12	TokenNameIdentifier	 access Key SV G12
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_MEDIA_MARKER	TokenNameIdentifier	 TIME  MEDIA  MARKER
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
mediaMarker	TokenNameIdentifier	 media Marker
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_WALLCLOCK	TokenNameIdentifier	 TIME  WALLCLOCK
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
wallclock	TokenNameIdentifier	 wallclock
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
)	TokenNameRPAREN	
spec	TokenNameIdentifier	 spec
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIME_INDEFINITE	TokenNameIdentifier	 TIME  INDEFINITE
:	TokenNameCOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
.	TokenNameDOT	
indefinite	TokenNameIdentifier	 indefinite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
