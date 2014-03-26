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
/** * This class implements an event-based parser for the SVG points * attribute values (used with polyline and polygon elements). * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: PointsParser.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for the SVG points attribute values (used with polyline and polygon elements). * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: PointsParser.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
PointsParser	TokenNameIdentifier	 Points Parser
extends	TokenNameextends	
NumberParser	TokenNameIdentifier	 Number Parser
{	TokenNameLBRACE	
/** * The points handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The points handler used to report parse events. 
protected	TokenNameprotected	
PointsHandler	TokenNameIdentifier	 Points Handler
pointsHandler	TokenNameIdentifier	 points Handler
;	TokenNameSEMICOLON	
/** * Whether the last character was a 'e' or 'E'. */	TokenNameCOMMENT_JAVADOC	 Whether the last character was a 'e' or 'E'. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
eRead	TokenNameIdentifier	 e Read
;	TokenNameSEMICOLON	
/** * Creates a new PointsParser. */	TokenNameCOMMENT_JAVADOC	 Creates a new PointsParser. 
public	TokenNamepublic	
PointsParser	TokenNameIdentifier	 Points Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointsHandler	TokenNameIdentifier	 points Handler
=	TokenNameEQUAL	
DefaultPointsHandler	TokenNameIdentifier	 Default Points Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a points handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The transform list handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a points handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The transform list handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setPointsHandler	TokenNameIdentifier	 set Points Handler
(	TokenNameLPAREN	
PointsHandler	TokenNameIdentifier	 Points Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointsHandler	TokenNameIdentifier	 points Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the points handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the points handler in use. 
public	TokenNamepublic	
PointsHandler	TokenNameIdentifier	 Points Handler
getPointsHandler	TokenNameIdentifier	 get Points Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointsHandler	TokenNameIdentifier	 points Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the current stream. */	TokenNameCOMMENT_JAVADOC	 Parses the current stream. 
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
pointsHandler	TokenNameIdentifier	 points Handler
.	TokenNameDOT	
startPoints	TokenNameIdentifier	 start Points
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
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsHandler	TokenNameIdentifier	 points Handler
.	TokenNameDOT	
point	TokenNameIdentifier	 point
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointsHandler	TokenNameIdentifier	 points Handler
.	TokenNameDOT	
endPoints	TokenNameIdentifier	 end Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
