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
/** * This class implements an event-based parser for the SVG path's d * attribute values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: PathParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for the SVG path's d attribute values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: PathParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PathParser	TokenNameIdentifier	 Path Parser
extends	TokenNameextends	
NumberParser	TokenNameIdentifier	 Number Parser
{	TokenNameLBRACE	
/** * The path handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The path handler used to report parse events. 
protected	TokenNameprotected	
PathHandler	TokenNameIdentifier	 Path Handler
pathHandler	TokenNameIdentifier	 path Handler
;	TokenNameSEMICOLON	
/** * Creates a new PathParser. */	TokenNameCOMMENT_JAVADOC	 Creates a new PathParser. 
public	TokenNamepublic	
PathParser	TokenNameIdentifier	 Path Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathHandler	TokenNameIdentifier	 path Handler
=	TokenNameEQUAL	
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a path handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The transform list handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a path handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The transform list handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setPathHandler	TokenNameIdentifier	 set Path Handler
(	TokenNameLPAREN	
PathHandler	TokenNameIdentifier	 Path Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathHandler	TokenNameIdentifier	 path Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the path handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the path handler in use. 
public	TokenNamepublic	
PathHandler	TokenNameIdentifier	 Path Handler
getPathHandler	TokenNameIdentifier	 get Path Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathHandler	TokenNameIdentifier	 path Handler
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
startPath	TokenNameIdentifier	 start Path
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
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
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
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parsem	TokenNameIdentifier	 parsem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseM	TokenNameIdentifier	 parse M
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parsel	TokenNameIdentifier	 parsel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'L'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseL	TokenNameIdentifier	 parse L
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseh	TokenNameIdentifier	 parseh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'H'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseH	TokenNameIdentifier	 parse H
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parsev	TokenNameIdentifier	 parsev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'V'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseV	TokenNameIdentifier	 parse V
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parsec	TokenNameIdentifier	 parsec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseC	TokenNameIdentifier	 parse C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'q'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseq	TokenNameIdentifier	 parseq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'Q'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseQ	TokenNameIdentifier	 parse Q
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parses	TokenNameIdentifier	 parses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseS	TokenNameIdentifier	 parse S
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parset	TokenNameIdentifier	 parset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'T'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseT	TokenNameIdentifier	 parse T
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parsea	TokenNameIdentifier	 parsea
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseA	TokenNameIdentifier	 parse A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSubPath	TokenNameIdentifier	 skip Sub Path
(	TokenNameLPAREN	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
endPath	TokenNameIdentifier	 end Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a 'm' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'm' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsem	TokenNameIdentifier	 parsem
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
movetoRel	TokenNameIdentifier	 moveto Rel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parsel	TokenNameIdentifier	 parsel
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a 'M' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'M' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseM	TokenNameIdentifier	 parse M
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
movetoAbs	TokenNameIdentifier	 moveto Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parseL	TokenNameIdentifier	 parse L
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a 'l' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'l' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsel	TokenNameIdentifier	 parsel
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parsel	TokenNameIdentifier	 parsel
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
_parsel	TokenNameIdentifier	 parsel
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoRel	TokenNameIdentifier	 lineto Rel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'L' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'L' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseL	TokenNameIdentifier	 parse L
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_parseL	TokenNameIdentifier	 parse L
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
_parseL	TokenNameIdentifier	 parse L
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'h' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'h' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseh	TokenNameIdentifier	 parseh
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoHorizontalRel	TokenNameIdentifier	 lineto Horizontal Rel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'H' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'H' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseH	TokenNameIdentifier	 parse H
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoHorizontalAbs	TokenNameIdentifier	 lineto Horizontal Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'v' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'v' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsev	TokenNameIdentifier	 parsev
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoVerticalRel	TokenNameIdentifier	 lineto Vertical Rel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'V' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'V' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseV	TokenNameIdentifier	 parse V
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
linetoVerticalAbs	TokenNameIdentifier	 lineto Vertical Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'c' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'c' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsec	TokenNameIdentifier	 parsec
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
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
y1	TokenNameIdentifier	 y1
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
x2	TokenNameIdentifier	 x2
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
y2	TokenNameIdentifier	 y2
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoCubicRel	TokenNameIdentifier	 curveto Cubic Rel
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'C' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'C' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseC	TokenNameIdentifier	 parse C
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
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
y1	TokenNameIdentifier	 y1
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
x2	TokenNameIdentifier	 x2
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
y2	TokenNameIdentifier	 y2
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'q' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'q' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseq	TokenNameIdentifier	 parseq
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
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
y1	TokenNameIdentifier	 y1
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoQuadraticRel	TokenNameIdentifier	 curveto Quadratic Rel
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'Q' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'Q' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseQ	TokenNameIdentifier	 parse Q
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
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
y1	TokenNameIdentifier	 y1
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoQuadraticAbs	TokenNameIdentifier	 curveto Quadratic Abs
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 's' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 's' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parses	TokenNameIdentifier	 parses
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
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
y2	TokenNameIdentifier	 y2
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoCubicSmoothRel	TokenNameIdentifier	 curveto Cubic Smooth Rel
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'S' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'S' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseS	TokenNameIdentifier	 parse S
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
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
y2	TokenNameIdentifier	 y2
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoCubicSmoothAbs	TokenNameIdentifier	 curveto Cubic Smooth Abs
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 't' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 't' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parset	TokenNameIdentifier	 parset
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoQuadraticSmoothRel	TokenNameIdentifier	 curveto Quadratic Smooth Rel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'T' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'T' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseT	TokenNameIdentifier	 parse T
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
curvetoQuadraticSmoothAbs	TokenNameIdentifier	 curveto Quadratic Smooth Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'a' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'a' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsea	TokenNameIdentifier	 parsea
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
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
ry	TokenNameIdentifier	 ry
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
ax	TokenNameIdentifier	 ax
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
laf	TokenNameIdentifier	 laf
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
laf	TokenNameIdentifier	 laf
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
laf	TokenNameIdentifier	 laf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sf	TokenNameIdentifier	 sf
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
sf	TokenNameIdentifier	 sf
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
sf	TokenNameIdentifier	 sf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
arcRel	TokenNameIdentifier	 arc Rel
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
ax	TokenNameIdentifier	 ax
,	TokenNameCOMMA	
laf	TokenNameIdentifier	 laf
,	TokenNameCOMMA	
sf	TokenNameIdentifier	 sf
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a 'A' command. */	TokenNameCOMMENT_JAVADOC	 Parses a 'A' command. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseA	TokenNameIdentifier	 parse A
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectNumber	TokenNameIdentifier	 expect Number
)	TokenNameRPAREN	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
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
ry	TokenNameIdentifier	 ry
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
ax	TokenNameIdentifier	 ax
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
laf	TokenNameIdentifier	 laf
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
laf	TokenNameIdentifier	 laf
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
laf	TokenNameIdentifier	 laf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sf	TokenNameIdentifier	 sf
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
sf	TokenNameIdentifier	 sf
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
sf	TokenNameIdentifier	 sf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pathHandler	TokenNameIdentifier	 path Handler
.	TokenNameDOT	
arcAbs	TokenNameIdentifier	 arc Abs
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
ax	TokenNameIdentifier	 ax
,	TokenNameCOMMA	
laf	TokenNameIdentifier	 laf
,	TokenNameCOMMA	
sf	TokenNameIdentifier	 sf
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectNumber	TokenNameIdentifier	 expect Number
=	TokenNameEQUAL	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Skips a sub-path. */	TokenNameCOMMENT_JAVADOC	 Skips a sub-path. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipSubPath	TokenNameIdentifier	 skip Sub Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
reportUnexpected	TokenNameIdentifier	 report Unexpected
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSubPath	TokenNameIdentifier	 skip Sub Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips the whitespaces and an optional comma. * @return true if comma was skipped. */	TokenNameCOMMENT_JAVADOC	 Skips the whitespaces and an optional comma. @return true if comma was skipped. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
skipCommaSpaces2	TokenNameIdentifier	 skip Comma Spaces2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
wsp1	TokenNameIdentifier	 wsp1
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
wsp1	TokenNameIdentifier	 wsp1
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// no comma. 	TokenNameCOMMENT_LINE	no comma. 
wsp2	TokenNameIdentifier	 wsp2
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
wsp2	TokenNameIdentifier	 wsp2
;	TokenNameSEMICOLON	
case	TokenNamecase	
0x20	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0x9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xD	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
0xA	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// had comma 	TokenNameCOMMENT_LINE	had comma 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
