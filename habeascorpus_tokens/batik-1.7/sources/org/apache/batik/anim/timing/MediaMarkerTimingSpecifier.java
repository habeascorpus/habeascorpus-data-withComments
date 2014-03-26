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
/** * A class to handle media marker SMIL timing specifiers. This class * of timing specifier is currently unused. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: MediaMarkerTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle media marker SMIL timing specifiers. This class of timing specifier is currently unused. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: MediaMarkerTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
MediaMarkerTimingSpecifier	TokenNameIdentifier	 Media Marker Timing Specifier
extends	TokenNameextends	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
{	TokenNameLBRACE	
/** * The ID of the media element. */	TokenNameCOMMENT_JAVADOC	 The ID of the media element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
;	TokenNameSEMICOLON	
/** * The media element. */	TokenNameCOMMENT_JAVADOC	 The media element. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
mediaElement	TokenNameIdentifier	 media Element
;	TokenNameSEMICOLON	
/** * The media marker name. */	TokenNameCOMMENT_JAVADOC	 The media marker name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
markerName	TokenNameIdentifier	 marker Name
;	TokenNameSEMICOLON	
/** * The instance time. */	TokenNameCOMMENT_JAVADOC	 The instance time. 
protected	TokenNameprotected	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
/** * Creates a new MediaMarkerTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new MediaMarkerTimingSpecifier object. 
public	TokenNamepublic	
MediaMarkerTimingSpecifier	TokenNameIdentifier	 Media Marker Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
markerName	TokenNameIdentifier	 marker Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syncbaseID	TokenNameIdentifier	 syncbase ID
=	TokenNameEQUAL	
syncbaseID	TokenNameIdentifier	 syncbase ID
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
markerName	TokenNameIdentifier	 marker Name
=	TokenNameEQUAL	
markerName	TokenNameIdentifier	 marker Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mediaElement	TokenNameIdentifier	 media Element
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getTimedElementById	TokenNameIdentifier	 get Timed Element By Id
(	TokenNameLPAREN	
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this timing specifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
syncbaseID	TokenNameIdentifier	 syncbase ID
+	TokenNamePLUS	
".marker("	TokenNameStringLiteral	.marker(
+	TokenNamePLUS	
markerName	TokenNameIdentifier	 marker Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this timing specifier is event-like (i.e., if it is * an eventbase, accesskey or a repeat timing specifier). */	TokenNameCOMMENT_JAVADOC	 Returns whether this timing specifier is event-like (i.e., if it is an eventbase, accesskey or a repeat timing specifier). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEventCondition	TokenNameIdentifier	 is Event Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
