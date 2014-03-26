/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
varia	TokenNameIdentifier	 varia
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
/** This is a very simple filter based on level matching. <p>The filter admits two options <b>LevelToMatch</b> and <b>AcceptOnMatch</b>. If there is an exact match between the value of the <b>LevelToMatch</b> option and the level of the {@link LoggingEvent}, then the {@link #decide} method returns {@link Filter#ACCEPT} in case the <b>AcceptOnMatch</b> option value is set to <code>true</code>, if it is <code>false</code> then {@link Filter#DENY} is returned. If there is no match, {@link Filter#NEUTRAL} is returned. @author Ceki G&uuml;lc&uuml; @since 1.2 */	TokenNameCOMMENT_JAVADOC	 This is a very simple filter based on level matching. <p>The filter admits two options <b>LevelToMatch</b> and <b>AcceptOnMatch</b>. If there is an exact match between the value of the <b>LevelToMatch</b> option and the level of the {@link LoggingEvent}, then the {@link #decide} method returns {@link Filter#ACCEPT} in case the <b>AcceptOnMatch</b> option value is set to <code>true</code>, if it is <code>false</code> then {@link Filter#DENY} is returned. If there is no match, {@link Filter#NEUTRAL} is returned. @author Ceki G&uuml;lc&uuml; @since 1.2 
public	TokenNamepublic	
class	TokenNameclass	
LevelMatchFilter	TokenNameIdentifier	 Level Match Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** Do we return ACCEPT when a match occurs. Default is <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Do we return ACCEPT when a match occurs. Default is <code>true</code>. 
boolean	TokenNameboolean	
acceptOnMatch	TokenNameIdentifier	 accept On Match
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
Level	TokenNameIdentifier	 Level
levelToMatch	TokenNameIdentifier	 level To Match
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setLevelToMatch	TokenNameIdentifier	 set Level To Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
levelToMatch	TokenNameIdentifier	 level To Match
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLevelToMatch	TokenNameIdentifier	 get Level To Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
levelToMatch	TokenNameIdentifier	 level To Match
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
levelToMatch	TokenNameIdentifier	 level To Match
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAcceptOnMatch	TokenNameIdentifier	 set Accept On Match
(	TokenNameLPAREN	
boolean	TokenNameboolean	
acceptOnMatch	TokenNameIdentifier	 accept On Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
acceptOnMatch	TokenNameIdentifier	 accept On Match
=	TokenNameEQUAL	
acceptOnMatch	TokenNameIdentifier	 accept On Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAcceptOnMatch	TokenNameIdentifier	 get Accept On Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
acceptOnMatch	TokenNameIdentifier	 accept On Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the decision of this filter. Returns {@link Filter#NEUTRAL} if the <b>LevelToMatch</b> option is not set or if there is not match. Otherwise, if there is a match, then the returned decision is {@link Filter#ACCEPT} if the <b>AcceptOnMatch</b> property is set to <code>true</code>. The returned decision is {@link Filter#DENY} if the <b>AcceptOnMatch</b> property is set to false. */	TokenNameCOMMENT_JAVADOC	 Return the decision of this filter. Returns {@link Filter#NEUTRAL} if the <b>LevelToMatch</b> option is not set or if there is not match. Otherwise, if there is a match, then the returned decision is {@link Filter#ACCEPT} if the <b>AcceptOnMatch</b> property is set to <code>true</code>. The returned decision is {@link Filter#DENY} if the <b>AcceptOnMatch</b> property is set to false. 
public	TokenNamepublic	
int	TokenNameint	
decide	TokenNameIdentifier	 decide
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
levelToMatch	TokenNameIdentifier	 level To Match
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
matchOccured	TokenNameIdentifier	 match Occured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
levelToMatch	TokenNameIdentifier	 level To Match
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchOccured	TokenNameIdentifier	 match Occured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchOccured	TokenNameIdentifier	 match Occured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
acceptOnMatch	TokenNameIdentifier	 accept On Match
)	TokenNameRPAREN	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ACCEPT	TokenNameIdentifier	 ACCEPT
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
