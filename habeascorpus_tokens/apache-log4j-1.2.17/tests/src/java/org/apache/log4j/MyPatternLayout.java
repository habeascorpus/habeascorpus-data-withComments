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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PatternParser	TokenNameIdentifier	 Pattern Parser
;	TokenNameSEMICOLON	
/** Example showing how to extend PatternLayout to recognize additional conversion characters. <p>In this case MyPatternLayout recognizes %# conversion pattern. It outputs the value of an internal counter which is also incremented at each call. <p>See <a href=doc-files/MyPatternLayout.java><b>source</b></a> code for more details. @see MyPatternParser @see org.apache.log4j.PatternLayout @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 Example showing how to extend PatternLayout to recognize additional conversion characters. <p>In this case MyPatternLayout recognizes %# conversion pattern. It outputs the value of an internal counter which is also incremented at each call. <p>See <a href=doc-files/MyPatternLayout.java><b>source</b></a> code for more details. @see MyPatternParser @see org.apache.log4j.PatternLayout @author Anders Kristensen 
public	TokenNamepublic	
class	TokenNameclass	
MyPatternLayout	TokenNameIdentifier	 My Pattern Layout
extends	TokenNameextends	
PatternLayout	TokenNameIdentifier	 Pattern Layout
{	TokenNameLBRACE	
public	TokenNamepublic	
MyPatternLayout	TokenNameIdentifier	 My Pattern Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MyPatternLayout	TokenNameIdentifier	 My Pattern Layout
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PatternParser	TokenNameIdentifier	 Pattern Parser
createPatternParser	TokenNameIdentifier	 create Pattern Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyPatternParser	TokenNameIdentifier	 My Pattern Parser
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier	 DEFAULT  CONVERSION  PATTERN
:	TokenNameCOLON	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
MyPatternLayout	TokenNameIdentifier	 My Pattern Layout
(	TokenNameLPAREN	
"[counter=%.10#] - %m%n"	TokenNameStringLiteral	[counter=%.10#] - %m%n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"some.cat"	TokenNameStringLiteral	some.cat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
new	TokenNamenew	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
ConsoleAppender	TokenNameIdentifier	 Console Appender
.	TokenNameDOT	
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, log"	TokenNameStringLiteral	Hello, log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello again..."	TokenNameStringLiteral	Hello again...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
