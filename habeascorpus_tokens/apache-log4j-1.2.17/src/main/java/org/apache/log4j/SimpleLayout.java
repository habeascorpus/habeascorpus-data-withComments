/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
/** SimpleLayout consists of the level of the log statement, followed by " - " and then the log message itself. For example, <pre> DEBUG - Hello world </pre> <p> @author Ceki G&uuml;lc&uuml; @since version 0.7.0 <p>{@link PatternLayout} offers a much more powerful alternative. */	TokenNameCOMMENT_JAVADOC	 SimpleLayout consists of the level of the log statement, followed by " - " and then the log message itself. For example, <pre> DEBUG - Hello world </pre> <p> @author Ceki G&uuml;lc&uuml; @since version 0.7.0 <p>{@link PatternLayout} offers a much more powerful alternative. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleLayout	TokenNameIdentifier	 Simple Layout
extends	TokenNameextends	
Layout	TokenNameIdentifier	 Layout
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Returns the log statement in a format consisting of the <code>level</code>, followed by " - " and then the <code>message</code>. For example, <pre> INFO - "A message" </pre> <p>The <code>category</code> parameter is ignored. <p> @return A byte array in SimpleLayout format. */	TokenNameCOMMENT_JAVADOC	 Returns the log statement in a format consisting of the <code>level</code>, followed by " - " and then the <code>message</code>. For example, <pre> INFO - "A message" </pre> <p>The <code>category</code> parameter is ignored. <p> @return A byte array in SimpleLayout format. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" - "	TokenNameStringLiteral	 - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The SimpleLayout does not handle the throwable contained within {@link LoggingEvent LoggingEvents}. Thus, it returns <code>true</code>. @since version 0.8.4 */	TokenNameCOMMENT_JAVADOC	 The SimpleLayout does not handle the throwable contained within {@link LoggingEvent LoggingEvents}. Thus, it returns <code>true</code>. @since version 0.8.4 
public	TokenNamepublic	
boolean	TokenNameboolean	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
