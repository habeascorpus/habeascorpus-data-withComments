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
/** * This is a very simple filter based on string matching. * * <p>The filter admits two options <b>StringToMatch</b> and * <b>AcceptOnMatch</b>. If there is a match between the value of the * StringToMatch option and the message of the {@link org.apache.log4j.spi.LoggingEvent}, * then the {@link #decide(LoggingEvent)} method returns {@link org.apache.log4j.spi.Filter#ACCEPT} if * the <b>AcceptOnMatch</b> option value is true, if it is false then * {@link org.apache.log4j.spi.Filter#DENY} is returned. If there is no match, {@link * org.apache.log4j.spi.Filter#NEUTRAL} is returned. * * @author Ceki G&uuml;lc&uuml; * @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 This is a very simple filter based on string matching. * <p>The filter admits two options <b>StringToMatch</b> and <b>AcceptOnMatch</b>. If there is a match between the value of the StringToMatch option and the message of the {@link org.apache.log4j.spi.LoggingEvent}, then the {@link #decide(LoggingEvent)} method returns {@link org.apache.log4j.spi.Filter#ACCEPT} if the <b>AcceptOnMatch</b> option value is true, if it is false then {@link org.apache.log4j.spi.Filter#DENY} is returned. If there is no match, {@link org.apache.log4j.spi.Filter#NEUTRAL} is returned. * @author Ceki G&uuml;lc&uuml; @since 0.9.0 
public	TokenNamepublic	
class	TokenNameclass	
StringMatchFilter	TokenNameIdentifier	 String Match Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. */	TokenNameCOMMENT_JAVADOC	 @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING_TO_MATCH_OPTION	TokenNameIdentifier	 STRING  TO  MATCH  OPTION
=	TokenNameEQUAL	
"StringToMatch"	TokenNameStringLiteral	StringToMatch
;	TokenNameSEMICOLON	
/** @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. */	TokenNameCOMMENT_JAVADOC	 @deprecated Options are now handled using the JavaBeans paradigm. This constant is not longer needed and will be removed in the <em>near</em> term. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ACCEPT_ON_MATCH_OPTION	TokenNameIdentifier	 ACCEPT  ON  MATCH  OPTION
=	TokenNameEQUAL	
"AcceptOnMatch"	TokenNameStringLiteral	AcceptOnMatch
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
acceptOnMatch	TokenNameIdentifier	 accept On Match
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
stringToMatch	TokenNameIdentifier	 string To Match
;	TokenNameSEMICOLON	
/** @deprecated We now use JavaBeans introspection to configure components. Options strings are no longer needed. */	TokenNameCOMMENT_JAVADOC	 @deprecated We now use JavaBeans introspection to configure components. Options strings are no longer needed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
STRING_TO_MATCH_OPTION	TokenNameIdentifier	 STRING  TO  MATCH  OPTION
,	TokenNameCOMMA	
ACCEPT_ON_MATCH_OPTION	TokenNameIdentifier	 ACCEPT  ON  MATCH  OPTION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use the setter method for the option directly instead of the generic <code>setOption</code> method. 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
STRING_TO_MATCH_OPTION	TokenNameIdentifier	 STRING  TO  MATCH  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringToMatch	TokenNameIdentifier	 string To Match
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ACCEPT_ON_MATCH_OPTION	TokenNameIdentifier	 ACCEPT  ON  MATCH  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
acceptOnMatch	TokenNameIdentifier	 accept On Match
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
acceptOnMatch	TokenNameIdentifier	 accept On Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStringToMatch	TokenNameIdentifier	 set String To Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringToMatch	TokenNameIdentifier	 string To Match
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringToMatch	TokenNameIdentifier	 get String To Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stringToMatch	TokenNameIdentifier	 string To Match
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
/** Returns {@link Filter#NEUTRAL} is there is no string match. */	TokenNameCOMMENT_JAVADOC	 Returns {@link Filter#NEUTRAL} is there is no string match. 
public	TokenNamepublic	
int	TokenNameint	
decide	TokenNameIdentifier	 decide
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
stringToMatch	TokenNameIdentifier	 string To Match
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
stringToMatch	TokenNameIdentifier	 string To Match
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
NEUTRAL	TokenNameIdentifier	 NEUTRAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we've got a match 	TokenNameCOMMENT_LINE	we've got a match 
if	TokenNameif	
(	TokenNameLPAREN	
acceptOnMatch	TokenNameIdentifier	 accept On Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
ACCEPT	TokenNameIdentifier	 ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Filter	TokenNameIdentifier	 Filter
.	TokenNameDOT	
DENY	TokenNameIdentifier	 DENY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
