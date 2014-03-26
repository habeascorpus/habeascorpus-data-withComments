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
FormattingInfo	TokenNameIdentifier	 Formatting Info
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
PatternConverter	TokenNameIdentifier	 Pattern Converter
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
/** Example showing how to extend PatternParser to recognize additional conversion characters. The examples shows that minimum and maximum width and alignment settings apply for "extension" conversion characters just as they do for PatternLayout recognized characters. <p>In this case MyPatternParser recognizes %# and outputs the value of an internal counter which is also incremented at each call. See <a href=doc-files/MyPatternParser.java><b>source</b></a> code for more details. @see org.apache.log4j.examples.MyPatternLayout @see org.apache.log4j.helpers.PatternParser @see org.apache.log4j.PatternLayout @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 Example showing how to extend PatternParser to recognize additional conversion characters. The examples shows that minimum and maximum width and alignment settings apply for "extension" conversion characters just as they do for PatternLayout recognized characters. <p>In this case MyPatternParser recognizes %# and outputs the value of an internal counter which is also incremented at each call. See <a href=doc-files/MyPatternParser.java><b>source</b></a> code for more details. @see org.apache.log4j.examples.MyPatternLayout @see org.apache.log4j.helpers.PatternParser @see org.apache.log4j.PatternLayout @author Anders Kristensen 
public	TokenNamepublic	
class	TokenNameclass	
MyPatternParser	TokenNameIdentifier	 My Pattern Parser
extends	TokenNameextends	
PatternParser	TokenNameIdentifier	 Pattern Parser
{	TokenNameLBRACE	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MyPatternParser	TokenNameIdentifier	 My Pattern Parser
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
void	TokenNamevoid	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConverter	TokenNameIdentifier	 add Converter
(	TokenNameLPAREN	
new	TokenNamenew	
UserDirPatternConverter	TokenNameIdentifier	 User Dir Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
UserDirPatternConverter	TokenNameIdentifier	 User Dir Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
UserDirPatternConverter	TokenNameIdentifier	 User Dir Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
