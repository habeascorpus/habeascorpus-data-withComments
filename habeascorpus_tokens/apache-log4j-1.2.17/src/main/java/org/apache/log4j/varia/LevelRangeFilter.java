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
/** This is a very simple filter based on level matching, which can be used to reject messages with priorities outside a certain range. <p>The filter admits three options <b>LevelMin</b>, <b>LevelMax</b> and <b>AcceptOnMatch</b>. <p>If the level of the {@link LoggingEvent} is not between Min and Max (inclusive), then {@link Filter#DENY} is returned. <p> If the Logging event level is within the specified range, then if <b>AcceptOnMatch</b> is true, {@link Filter#ACCEPT} is returned, and if <b>AcceptOnMatch</b> is false, {@link Filter#NEUTRAL} is returned. <p>If <code>LevelMin</code>w is not defined, then there is no minimum acceptable level (ie a level is never rejected for being too "low"/unimportant). If <code>LevelMax</code> is not defined, then there is no maximum acceptable level (ie a level is never rejected for beeing too "high"/important). <p>Refer to the {@link org.apache.log4j.AppenderSkeleton#setThreshold setThreshold} method available to <code>all</code> appenders extending {@link org.apache.log4j.AppenderSkeleton} for a more convenient way to filter out events by level. @author Simon Kitching @author based on code by Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 This is a very simple filter based on level matching, which can be used to reject messages with priorities outside a certain range. <p>The filter admits three options <b>LevelMin</b>, <b>LevelMax</b> and <b>AcceptOnMatch</b>. <p>If the level of the {@link LoggingEvent} is not between Min and Max (inclusive), then {@link Filter#DENY} is returned. <p> If the Logging event level is within the specified range, then if <b>AcceptOnMatch</b> is true, {@link Filter#ACCEPT} is returned, and if <b>AcceptOnMatch</b> is false, {@link Filter#NEUTRAL} is returned. <p>If <code>LevelMin</code>w is not defined, then there is no minimum acceptable level (ie a level is never rejected for being too "low"/unimportant). If <code>LevelMax</code> is not defined, then there is no maximum acceptable level (ie a level is never rejected for beeing too "high"/important). <p>Refer to the {@link org.apache.log4j.AppenderSkeleton#setThreshold setThreshold} method available to <code>all</code> appenders extending {@link org.apache.log4j.AppenderSkeleton} for a more convenient way to filter out events by level. @author Simon Kitching @author based on code by Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
LevelRangeFilter	TokenNameIdentifier	 Level Range Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** Do we return ACCEPT when a match occurs. Default is <code>false</code>, so that later filters get run by default */	TokenNameCOMMENT_JAVADOC	 Do we return ACCEPT when a match occurs. Default is <code>false</code>, so that later filters get run by default 
boolean	TokenNameboolean	
acceptOnMatch	TokenNameIdentifier	 accept On Match
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
levelMin	TokenNameIdentifier	 level Min
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
levelMax	TokenNameIdentifier	 level Max
;	TokenNameSEMICOLON	
/** Return the decision of this filter. */	TokenNameCOMMENT_JAVADOC	 Return the decision of this filter. 
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
levelMin	TokenNameIdentifier	 level Min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
levelMin	TokenNameIdentifier	 level Min
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// level of event is less than minimum 	TokenNameCOMMENT_LINE	level of event is less than minimum 
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
levelMax	TokenNameIdentifier	 level Max
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
levelMax	TokenNameIdentifier	 level Max
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// level of event is greater than maximum 	TokenNameCOMMENT_LINE	level of event is greater than maximum 
// Alas, there is no Level.isGreater method. and using 	TokenNameCOMMENT_LINE	Alas, there is no Level.isGreater method. and using 
// a combo of isGreaterOrEqual && !Equal seems worse than 	TokenNameCOMMENT_LINE	a combo of isGreaterOrEqual && !Equal seems worse than 
// checking the int values of the level objects.. 	TokenNameCOMMENT_LINE	checking the int values of the level objects.. 
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
acceptOnMatch	TokenNameIdentifier	 accept On Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this filter set up to bypass later filters and always return 	TokenNameCOMMENT_LINE	this filter set up to bypass later filters and always return 
// accept if level in range 	TokenNameCOMMENT_LINE	accept if level in range 
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ACCEPT	TokenNameIdentifier	 ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// event is ok for this filter; allow later filters to have a look.. 	TokenNameCOMMENT_LINE	event is ok for this filter; allow later filters to have a look.. 
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the value of the <code>LevelMax</code> option. */	TokenNameCOMMENT_JAVADOC	 Get the value of the <code>LevelMax</code> option. 
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getLevelMax	TokenNameIdentifier	 get Level Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
levelMax	TokenNameIdentifier	 level Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the value of the <code>LevelMin</code> option. */	TokenNameCOMMENT_JAVADOC	 Get the value of the <code>LevelMin</code> option. 
public	TokenNamepublic	
Level	TokenNameIdentifier	 Level
getLevelMin	TokenNameIdentifier	 get Level Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
levelMin	TokenNameIdentifier	 level Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the value of the <code>AcceptOnMatch</code> option. */	TokenNameCOMMENT_JAVADOC	 Get the value of the <code>AcceptOnMatch</code> option. 
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
/** Set the <code>LevelMax</code> option. */	TokenNameCOMMENT_JAVADOC	 Set the <code>LevelMax</code> option. 
public	TokenNamepublic	
void	TokenNamevoid	
setLevelMax	TokenNameIdentifier	 set Level Max
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
levelMax	TokenNameIdentifier	 level Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
levelMax	TokenNameIdentifier	 level Max
=	TokenNameEQUAL	
levelMax	TokenNameIdentifier	 level Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the <code>LevelMin</code> option. */	TokenNameCOMMENT_JAVADOC	 Set the <code>LevelMin</code> option. 
public	TokenNamepublic	
void	TokenNamevoid	
setLevelMin	TokenNameIdentifier	 set Level Min
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
levelMin	TokenNameIdentifier	 level Min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
levelMin	TokenNameIdentifier	 level Min
=	TokenNameEQUAL	
levelMin	TokenNameIdentifier	 level Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the <code>AcceptOnMatch</code> option. */	TokenNameCOMMENT_JAVADOC	 Set the <code>AcceptOnMatch</code> option. 
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
}	TokenNameRBRACE	
