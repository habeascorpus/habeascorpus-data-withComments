/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
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
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * Return the event's level in a StringBuffer. * * @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Return the event's level in a StringBuffer. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
extends	TokenNameextends	
LoggingEventPatternConverter	TokenNameIdentifier	 Logging Event Pattern Converter
{	TokenNameLBRACE	
/** * Integer severity for Level.TRACE. */	TokenNameCOMMENT_JAVADOC	 Integer severity for Level.TRACE. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Singleton. */	TokenNameCOMMENT_JAVADOC	 Singleton. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
private	TokenNameprivate	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Level"	TokenNameStringLiteral	Level
,	TokenNameCOMMA	
"level"	TokenNameStringLiteral	level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of pattern converter. * @param options options, may be null. * @return instance of pattern converter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of pattern converter. @param options options, may be null. @return instance of pattern converter. 
public	TokenNamepublic	
static	TokenNamestatic	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
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
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStyleClass	TokenNameIdentifier	 get Style Class
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lint	TokenNameIdentifier	 lint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lint	TokenNameIdentifier	 lint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TRACE_INT	TokenNameIdentifier	 TRACE  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level trace"	TokenNameStringLiteral	level trace
;	TokenNameSEMICOLON	
case	TokenNamecase	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG_INT	TokenNameIdentifier	 DEBUG  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level debug"	TokenNameStringLiteral	level debug
;	TokenNameSEMICOLON	
case	TokenNamecase	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO_INT	TokenNameIdentifier	 INFO  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level info"	TokenNameStringLiteral	level info
;	TokenNameSEMICOLON	
case	TokenNamecase	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN_INT	TokenNameIdentifier	 WARN  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level warn"	TokenNameStringLiteral	level warn
;	TokenNameSEMICOLON	
case	TokenNamecase	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR_INT	TokenNameIdentifier	 ERROR  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level error"	TokenNameStringLiteral	level error
;	TokenNameSEMICOLON	
case	TokenNamecase	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL_INT	TokenNameIdentifier	 FATAL  INT
:	TokenNameCOLON	
return	TokenNamereturn	
"level fatal"	TokenNameStringLiteral	level fatal
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
"level "	TokenNameStringLiteral	level 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
"level"	TokenNameStringLiteral	level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
