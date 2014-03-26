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
/** * This class implements an event-based parser for the SVG Number * list values. * * @author tonny@kiyut.com * @version $Id: NumberListParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for the SVG Number list values. * @author tonny@kiyut.com @version $Id: NumberListParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
NumberListParser	TokenNameIdentifier	 Number List Parser
extends	TokenNameextends	
NumberParser	TokenNameIdentifier	 Number Parser
{	TokenNameLBRACE	
/** * The number list handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The number list handler used to report parse events. 
protected	TokenNameprotected	
NumberListHandler	TokenNameIdentifier	 Number List Handler
numberListHandler	TokenNameIdentifier	 number List Handler
;	TokenNameSEMICOLON	
/** Creates a new instance of NumberListParser */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of NumberListParser 
public	TokenNamepublic	
NumberListParser	TokenNameIdentifier	 Number List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberListHandler	TokenNameIdentifier	 number List Handler
=	TokenNameEQUAL	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a number list handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The number list handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a number list handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The number list handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setNumberListHandler	TokenNameIdentifier	 set Number List Handler
(	TokenNameLPAREN	
NumberListHandler	TokenNameIdentifier	 Number List Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberListHandler	TokenNameIdentifier	 number List Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number list handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the number list handler in use. 
public	TokenNamepublic	
NumberListHandler	TokenNameIdentifier	 Number List Handler
getNumberListHandler	TokenNameIdentifier	 get Number List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberListHandler	TokenNameIdentifier	 number List Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the given reader. */	TokenNameCOMMENT_JAVADOC	 Parses the given reader. 
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
numberListHandler	TokenNameIdentifier	 number List Handler
.	TokenNameDOT	
startNumberList	TokenNameIdentifier	 start Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberListHandler	TokenNameIdentifier	 number List Handler
.	TokenNameDOT	
startNumber	TokenNameIdentifier	 start Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numberListHandler	TokenNameIdentifier	 number List Handler
.	TokenNameDOT	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numberListHandler	TokenNameIdentifier	 number List Handler
.	TokenNameDOT	
endNumber	TokenNameIdentifier	 end Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numberListHandler	TokenNameIdentifier	 number List Handler
.	TokenNameDOT	
endNumberList	TokenNameIdentifier	 end Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
