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
/** * This class implements an event-based parser for the SVG transform * attribute values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: TransformListParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements an event-based parser for the SVG transform attribute values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: TransformListParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TransformListParser	TokenNameIdentifier	 Transform List Parser
extends	TokenNameextends	
NumberParser	TokenNameIdentifier	 Number Parser
{	TokenNameLBRACE	
/** * The transform list handler used to report parse events. */	TokenNameCOMMENT_JAVADOC	 The transform list handler used to report parse events. 
protected	TokenNameprotected	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
transformListHandler	TokenNameIdentifier	 transform List Handler
;	TokenNameSEMICOLON	
/** * Creates a new TransformListParser. */	TokenNameCOMMENT_JAVADOC	 Creates a new TransformListParser. 
public	TokenNamepublic	
TransformListParser	TokenNameIdentifier	 Transform List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
=	TokenNameEQUAL	
DefaultTransformListHandler	TokenNameIdentifier	 Default Transform List Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a transform list handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The transform handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a transform list handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The transform handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformListHandler	TokenNameIdentifier	 set Transform List Handler
(	TokenNameLPAREN	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transform list handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the transform list handler in use. 
public	TokenNamepublic	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
getTransformListHandler	TokenNameIdentifier	 get Transform List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformListHandler	TokenNameIdentifier	 transform List Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the current reader. */	TokenNameCOMMENT_JAVADOC	 Parses the current reader. 
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
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
startTransformList	TokenNameIdentifier	 start Transform List
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
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseMatrix	TokenNameIdentifier	 parse Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseRotate	TokenNameIdentifier	 parse Rotate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseTranslate	TokenNameIdentifier	 parse Translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
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
parseScale	TokenNameIdentifier	 parse Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'k'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
parseSkew	TokenNameIdentifier	 parse Skew
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
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
skipTransform	TokenNameIdentifier	 skip Transform
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
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
endTransformList	TokenNameIdentifier	 end Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a matrix transform. 'm' is assumed to be the current character. */	TokenNameCOMMENT_JAVADOC	 Parses a matrix transform. 'm' is assumed to be the current character. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseMatrix	TokenNameIdentifier	 parse Matrix
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
// Parse 'atrix wsp? ( wsp?' 	TokenNameCOMMENT_LINE	Parse 'atrix wsp? ( wsp?' 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
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
b	TokenNameIdentifier	 b
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
c	TokenNameIdentifier	 c
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
d	TokenNameIdentifier	 d
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
e	TokenNameIdentifier	 e
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
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a rotate transform. 'r' is assumed to be the current character. */	TokenNameCOMMENT_JAVADOC	 Parses a rotate transform. 'r' is assumed to be the current character. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseRotate	TokenNameIdentifier	 parse Rotate
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
// Parse 'otate wsp? ( wsp?' 	TokenNameCOMMENT_LINE	Parse 'otate wsp? ( wsp?' 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
}	TokenNameRBRACE	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
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
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a translate transform. 't' is assumed to be * the current character. */	TokenNameCOMMENT_JAVADOC	 Parses a translate transform. 't' is assumed to be the current character. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseTranslate	TokenNameIdentifier	 parse Translate
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
// Parse 'ranslate wsp? ( wsp?' 	TokenNameCOMMENT_LINE	Parse 'ranslate wsp? ( wsp?' 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
}	TokenNameRBRACE	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a scale transform. 'c' is assumed to be the current character. */	TokenNameCOMMENT_JAVADOC	 Parses a scale transform. 'c' is assumed to be the current character. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseScale	TokenNameIdentifier	 parse Scale
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
// Parse 'ale wsp? ( wsp?' 	TokenNameCOMMENT_LINE	Parse 'ale wsp? ( wsp?' 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
}	TokenNameRBRACE	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a skew transform. 'e' is assumed to be the current character. */	TokenNameCOMMENT_JAVADOC	 Parses a skew transform. 'e' is assumed to be the current character. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseSkew	TokenNameIdentifier	 parse Skew
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
// Parse 'ew[XY] wsp? ( wsp?' 	TokenNameCOMMENT_LINE	Parse 'ew[XY] wsp? ( wsp?' 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'w'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'w'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
boolean	TokenNameboolean	
skewX	TokenNameIdentifier	 skew X
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'X'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
skewX	TokenNameIdentifier	 skew X
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
'Y'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'X'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sk	TokenNameIdentifier	 sk
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skewX	TokenNameIdentifier	 skew X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
sk	TokenNameIdentifier	 sk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transformListHandler	TokenNameIdentifier	 transform List Handler
.	TokenNameDOT	
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
sk	TokenNameIdentifier	 sk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Skips characters in the given reader until a ')' is encountered. */	TokenNameCOMMENT_JAVADOC	 Skips characters in the given reader until a ')' is encountered. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipTransform	TokenNameIdentifier	 skip Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
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
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
