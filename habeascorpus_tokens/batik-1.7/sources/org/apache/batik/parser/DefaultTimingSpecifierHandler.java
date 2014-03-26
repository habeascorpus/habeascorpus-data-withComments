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
/** * An adapter class for {@link TimingSpecifierHandler}. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DefaultTimingSpecifierHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An adapter class for {@link TimingSpecifierHandler}. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DefaultTimingSpecifierHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultTimingSpecifierHandler	TokenNameIdentifier	 Default Timing Specifier Handler
implements	TokenNameimplements	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
{	TokenNameLBRACE	
/** * The default handler. */	TokenNameCOMMENT_JAVADOC	 The default handler. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimingSpecifierHandler	TokenNameIdentifier	 Timing Specifier Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultTimingSpecifierHandler	TokenNameIdentifier	 Default Timing Specifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DefaultTimingSpecifierHandler	TokenNameIdentifier	 Default Timing Specifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked when an offset value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an offset value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
offset	TokenNameIdentifier	 offset
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
/** * Invoked when an indefinite value timing specifier is parsed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an indefinite value timing specifier is parsed. 
public	TokenNamepublic	
void	TokenNamevoid	
indefinite	TokenNameIdentifier	 indefinite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
