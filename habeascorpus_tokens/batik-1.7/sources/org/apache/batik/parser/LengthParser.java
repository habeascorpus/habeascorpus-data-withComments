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
/** * This class implements an event-based parser for the SVG length * values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LengthParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for the SVG length values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LengthParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
LengthParser	TokenNameIdentifier	 Length Parser
extends	TokenNameextends	
AbstractParser	TokenNameIdentifier	 Abstract Parser
{	TokenNameLBRACE	
/** * The length handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The length handler used to report parse events. 
protected	TokenNameprotected	
LengthHandler	TokenNameIdentifier	 Length Handler
lengthHandler	TokenNameIdentifier	 length Handler
;	TokenNameSEMICOLON	
/** * Creates a new LengthParser. */	TokenNameCOMMENT_JAVADOC	 Creates a new LengthParser. 
public	TokenNamepublic	
LengthParser	TokenNameIdentifier	 Length Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
=	TokenNameEQUAL	
DefaultLengthHandler	TokenNameIdentifier	 Default Length Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a length handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The transform list handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a length handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The transform list handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setLengthHandler	TokenNameIdentifier	 set Length Handler
(	TokenNameLPAREN	
LengthHandler	TokenNameIdentifier	 Length Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the length handler in use. 
public	TokenNamepublic	
LengthHandler	TokenNameIdentifier	 Length Handler
getLengthHandler	TokenNameIdentifier	 get Length Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lengthHandler	TokenNameIdentifier	 length Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
startLength	TokenNameIdentifier	 start Length
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
parseLength	TokenNameIdentifier	 parse Length
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
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
"end.of.stream.expected"	TokenNameStringLiteral	end.of.stream.expected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
endLength	TokenNameIdentifier	 end Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a length value. */	TokenNameCOMMENT_JAVADOC	 Parses a length value. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseLength	TokenNameIdentifier	 parse Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mantDig	TokenNameIdentifier	 mant Dig
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mantPos	TokenNameIdentifier	 mant Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
expDig	TokenNameIdentifier	 exp Dig
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
expAdj	TokenNameIdentifier	 exp Adj
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expPos	TokenNameIdentifier	 exp Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
unitState	TokenNameIdentifier	 unit State
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantPos	TokenNameIdentifier	 mant Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m1	TokenNameIdentifier	 m1
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
m1	TokenNameIdentifier	 m1
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
mantRead	TokenNameIdentifier	 mant Read
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
<	TokenNameLESS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mantDig	TokenNameIdentifier	 mant Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
mant	TokenNameIdentifier	 mant
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expAdj	TokenNameIdentifier	 exp Adj
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
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
m2	TokenNameIdentifier	 m2
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mantRead	TokenNameIdentifier	 mant Read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
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
expAdj	TokenNameIdentifier	 exp Adj
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
m2	TokenNameIdentifier	 m2
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mantDig	TokenNameIdentifier	 mant Dig
<	TokenNameLESS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mantDig	TokenNameIdentifier	 mant Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
mant	TokenNameIdentifier	 mant
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expAdj	TokenNameIdentifier	 exp Adj
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
le	TokenNameIdentifier	 le
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
es	TokenNameIdentifier	 es
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
le	TokenNameIdentifier	 le
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
le	TokenNameIdentifier	 le
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unitState	TokenNameIdentifier	 unit State
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
es	TokenNameIdentifier	 es
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
le	TokenNameIdentifier	 le
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
unitState	TokenNameIdentifier	 unit State
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
es	TokenNameIdentifier	 es
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
expPos	TokenNameIdentifier	 exp Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
en	TokenNameIdentifier	 en
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
en	TokenNameIdentifier	 en
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expDig	TokenNameIdentifier	 exp Dig
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expDig	TokenNameIdentifier	 exp Dig
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expPos	TokenNameIdentifier	 exp Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
-	TokenNameMINUS	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exp	TokenNameIdentifier	 exp
+=	TokenNamePLUS_EQUAL	
expAdj	TokenNameIdentifier	 exp Adj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mantPos	TokenNameIdentifier	 mant Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mant	TokenNameIdentifier	 mant
=	TokenNameEQUAL	
-	TokenNameMINUS	
mant	TokenNameIdentifier	 mant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
lengthValue	TokenNameIdentifier	 length Value
(	TokenNameLPAREN	
NumberParser	TokenNameIdentifier	 Number Parser
.	TokenNameDOT	
buildFloat	TokenNameIdentifier	 build Float
(	TokenNameLPAREN	
mant	TokenNameIdentifier	 mant
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
unitState	TokenNameIdentifier	 unit State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
em	TokenNameIdentifier	 em
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
em	TokenNameIdentifier	 em
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
pc	TokenNameIdentifier	 pc
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
pt	TokenNameIdentifier	 pt
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
px	TokenNameIdentifier	 px
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
in	TokenNameIdentifier	 in
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
cm	TokenNameIdentifier	 cm
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
mm	TokenNameIdentifier	 mm
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
lengthHandler	TokenNameIdentifier	 length Handler
.	TokenNameDOT	
percentage	TokenNameIdentifier	 percentage
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
