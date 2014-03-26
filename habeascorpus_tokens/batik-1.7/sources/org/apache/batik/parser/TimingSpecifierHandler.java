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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** * This interface must be implemented and then registered as the * handler of a {@link TimingSpecifierParser} instance in order * to be notified of parsing events. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimingSpecifierHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface must be implemented and then registered as the handler of a {@link TimingSpecifierParser} instance in order to be notified of parsing events. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimingSpecifierHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
{	TokenNameLBRACE	
/** * Invoked when an offset value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an offset value timing specifier is parsed. 
void	TokenNamevoid	
offset	TokenNameIdentifier	 offset
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a syncbase value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a syncbase value timing specifier is parsed. 
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
;	TokenNameSEMICOLON	
/** * Invoked when an eventbase value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an eventbase value timing specifier is parsed. 
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
;	TokenNameSEMICOLON	
/** * Invoked when a repeat value timing specifier with no iteration * is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a repeat value timing specifier with no iteration is parsed. 
void	TokenNamevoid	
repeat	TokenNameIdentifier	 repeat
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a repeat value timing specifier with an iteration * is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a repeat value timing specifier with an iteration is parsed. 
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
;	TokenNameSEMICOLON	
/** * Invoked when an accesskey value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an accesskey value timing specifier is parsed. 
void	TokenNamevoid	
accesskey	TokenNameIdentifier	 accesskey
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
char	TokenNamechar	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an SVG 1.2 accessKey value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an SVG 1.2 accessKey value timing specifier is parsed. 
void	TokenNamevoid	
accessKeySVG12	TokenNameIdentifier	 access Key SV G12
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyName	TokenNameIdentifier	 key Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a media marker value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a media marker value timing specifier is parsed. 
void	TokenNamevoid	
mediaMarker	TokenNameIdentifier	 media Marker
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
markerName	TokenNameIdentifier	 marker Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when a wallclock value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a wallclock value timing specifier is parsed. 
void	TokenNamevoid	
wallclock	TokenNameIdentifier	 wallclock
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an indefinite value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an indefinite value timing specifier is parsed. 
void	TokenNamevoid	
indefinite	TokenNameIdentifier	 indefinite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
