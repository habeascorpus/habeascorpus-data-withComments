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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This class implements an event-based parser for SMIL timing specifier * list values. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimingSpecifierListParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for SMIL timing specifier list values. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimingSpecifierListParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TimingSpecifierListParser	TokenNameIdentifier	 Timing Specifier List Parser
extends	TokenNameextends	
TimingSpecifierParser	TokenNameIdentifier	 Timing Specifier Parser
{	TokenNameLBRACE	
/** * Creates a new TimingSpecifierListParser. * @param useSVG11AccessKeys allows the use of accessKey() timing * specifiers with a single character * @param useSVG12AccessKeys allows the use of accessKey() with a * DOM 3 key name */	TokenNameCOMMENT_JAVADOC	 Creates a new TimingSpecifierListParser. @param useSVG11AccessKeys allows the use of accessKey() timing specifiers with a single character @param useSVG12AccessKeys allows the use of accessKey() with a DOM 3 key name 
public	TokenNamepublic	
TimingSpecifierListParser	TokenNameIdentifier	 Timing Specifier List Parser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
=	TokenNameEQUAL	
DefaultTimingSpecifierListHandler	TokenNameIdentifier	 Default Timing Specifier List Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a parse event handler. */	TokenNameCOMMENT_JAVADOC	 Registers a parse event handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimingSpecifierListHandler	TokenNameIdentifier	 set Timing Specifier List Handler
(	TokenNameLPAREN	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parse event handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the parse event handler in use. 
public	TokenNamepublic	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
getTimingSpecifierListHandler	TokenNameIdentifier	 get Timing Specifier List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
)	TokenNameRPAREN	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a timing specifier list. */	TokenNameCOMMENT_JAVADOC	 Parses a timing specifier list. 
protected	TokenNameprotected	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
)	TokenNameRPAREN	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
startTimingSpecifierList	TokenNameIdentifier	 start Timing Specifier List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
parseTimingSpecifier	TokenNameIdentifier	 parse Timing Specifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handleTimingSpecifier	TokenNameIdentifier	 handle Timing Specifier
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimingSpecifierListHandler	TokenNameIdentifier	 Timing Specifier List Handler
)	TokenNameRPAREN	
timingSpecifierHandler	TokenNameIdentifier	 timing Specifier Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
endTimingSpecifierList	TokenNameIdentifier	 end Timing Specifier List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
