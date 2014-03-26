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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * Formats a logger name. * * @author Ceki G&uuml;lc&uuml; * */	TokenNameCOMMENT_JAVADOC	 Formats a logger name. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
extends	TokenNameextends	
NamePatternConverter	TokenNameIdentifier	 Name Pattern Converter
{	TokenNameLBRACE	
/** * Singleton. */	TokenNameCOMMENT_JAVADOC	 Singleton. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor. * @param options options, may be null. */	TokenNameCOMMENT_JAVADOC	 Private constructor. @param options options, may be null. 
private	TokenNameprivate	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Logger"	TokenNameStringLiteral	Logger
,	TokenNameCOMMA	
"logger"	TokenNameStringLiteral	logger
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtains an instance of pattern converter. * @param options options, may be null. * @return instance of pattern converter. */	TokenNameCOMMENT_JAVADOC	 Obtains an instance of pattern converter. @param options options, may be null. @return instance of pattern converter. 
public	TokenNamepublic	
static	TokenNamestatic	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
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
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
initialLength	TokenNameIdentifier	 initial Length
=	TokenNameEQUAL	
toAppendTo	TokenNameIdentifier	 to Append To
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toAppendTo	TokenNameIdentifier	 to Append To
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
initialLength	TokenNameIdentifier	 initial Length
,	TokenNameCOMMA	
toAppendTo	TokenNameIdentifier	 to Append To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
