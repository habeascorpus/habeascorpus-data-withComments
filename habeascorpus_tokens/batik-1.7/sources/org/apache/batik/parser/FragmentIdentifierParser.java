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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
;	TokenNameSEMICOLON	
/** * This class represents an event-based parser for the SVG * fragment identifiers. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: FragmentIdentifierParser.java 502167 2007-02-01 09:26:51Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event-based parser for the SVG fragment identifiers. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: FragmentIdentifierParser.java 502167 2007-02-01 09:26:51Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FragmentIdentifierParser	TokenNameIdentifier	 Fragment Identifier Parser
extends	TokenNameextends	
NumberParser	TokenNameIdentifier	 Number Parser
{	TokenNameLBRACE	
/** * The buffer used for numbers. */	TokenNameCOMMENT_JAVADOC	 The buffer used for numbers. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The buffer size. */	TokenNameCOMMENT_JAVADOC	 The buffer size. 
protected	TokenNameprotected	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
/** * The FragmentIdentifierHandler. */	TokenNameCOMMENT_JAVADOC	 The FragmentIdentifierHandler. 
protected	TokenNameprotected	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
;	TokenNameSEMICOLON	
/** * Creates a new FragmentIdentifier parser. */	TokenNameCOMMENT_JAVADOC	 Creates a new FragmentIdentifier parser. 
public	TokenNamepublic	
FragmentIdentifierParser	TokenNameIdentifier	 Fragment Identifier Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
=	TokenNameEQUAL	
DefaultFragmentIdentifierHandler	TokenNameIdentifier	 Default Fragment Identifier Handler
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows an application to register a fragment identifier handler. * * <p>If the application does not register a handler, all * events reported by the parser will be silently ignored. * * <p>Applications may register a new or different handler in the * middle of a parse, and the parser must begin using the new * handler immediately.</p> * @param handler The transform list handler. */	TokenNameCOMMENT_JAVADOC	 Allows an application to register a fragment identifier handler. * <p>If the application does not register a handler, all events reported by the parser will be silently ignored. * <p>Applications may register a new or different handler in the middle of a parse, and the parser must begin using the new handler immediately.</p> @param handler The transform list handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setFragmentIdentifierHandler	TokenNameIdentifier	 set Fragment Identifier Handler
(	TokenNameLPAREN	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the points handler in use. */	TokenNameCOMMENT_JAVADOC	 Returns the points handler in use. 
public	TokenNamepublic	
FragmentIdentifierHandler	TokenNameIdentifier	 Fragment Identifier Handler
getFragmentIdentifierHandler	TokenNameIdentifier	 get Fragment Identifier Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
startFragmentIdentifier	TokenNameIdentifier	 start Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ident	TokenNameIdentifier	 ident
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
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
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'd'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
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
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
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
'"'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getBufferContent	TokenNameIdentifier	 get Buffer Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
idReference	TokenNameIdentifier	 id Reference
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
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
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
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
}	TokenNameRBRACE	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'V'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'w'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseViewAttributes	TokenNameIdentifier	 parse View Attributes
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
}	TokenNameRBRACE	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
ident	TokenNameIdentifier	 ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getBufferContent	TokenNameIdentifier	 get Buffer Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
idReference	TokenNameIdentifier	 id Reference
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
endFragmentIdentifier	TokenNameIdentifier	 end Fragment Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the svgView attributes. */	TokenNameCOMMENT_JAVADOC	 Parses the svgView attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseViewAttributes	TokenNameIdentifier	 parse View Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
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
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fallthrough 	TokenNameCOMMENT_LINE	fallthrough 
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
case	TokenNamecase	
'B'	TokenNameCharacterLiteral	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
float	TokenNamefloat	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
float	TokenNamefloat	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
float	TokenNamefloat	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
parseFloat	TokenNameIdentifier	 parse Float
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
viewBox	TokenNameIdentifier	 view Box
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'T'	TokenNameCharacterLiteral	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
startViewTarget	TokenNameIdentifier	 start View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameFirstCharacter	TokenNameIdentifier	 is XML Name First Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
parseIdentifier	TokenNameIdentifier	 parse Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getBufferContent	TokenNameIdentifier	 get Buffer Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
viewTarget	TokenNameIdentifier	 view Target
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
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
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
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
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
endViewTarget	TokenNameIdentifier	 end View Target
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'v'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'p'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'R'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'R'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
parsePreserveAspectRatio	TokenNameIdentifier	 parse Preserve Aspect Ratio
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'f'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
startTransformList	TokenNameIdentifier	 start Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tloop	TokenNameIdentifier	 tloop
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
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
tloop	TokenNameIdentifier	 tloop
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
endTransformList	TokenNameIdentifier	 end Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
loop	TokenNameIdentifier	 loop
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
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'd'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'P'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'P'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'f'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
zoomAndPan	TokenNameIdentifier	 zoom And Pan
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
zoomAndPan	TokenNameIdentifier	 zoom And Pan
(	TokenNameLPAREN	
false	TokenNamefalse	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
}	TokenNameRBRACE	
/** * Parses an identifier. */	TokenNameCOMMENT_JAVADOC	 Parses an identifier. 
protected	TokenNameprotected	
void	TokenNamevoid	
parseIdentifier	TokenNameIdentifier	 parse Identifier
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLUtilities	TokenNameIdentifier	 XML Utilities
.	TokenNameDOT	
isXMLNameCharacter	TokenNameIdentifier	 is XML Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferize	TokenNameIdentifier	 bufferize
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the content of the buffer. */	TokenNameCOMMENT_JAVADOC	 Returns the content of the buffer. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getBufferContent	TokenNameIdentifier	 get Buffer Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the current character to the buffer. * If necessary, the buffer grows. */	TokenNameCOMMENT_JAVADOC	 Adds the current character to the buffer. If necessary, the buffer grows. 
protected	TokenNameprotected	
void	TokenNamevoid	
bufferize	TokenNameIdentifier	 bufferize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
>=	TokenNameGREATER_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips the whitespaces in the current reader. */	TokenNameCOMMENT_JAVADOC	 Skips the whitespaces in the current reader. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Skips the whitespaces and an optional comma. */	TokenNameCOMMENT_JAVADOC	 Skips the whitespaces and an optional comma. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
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
}	TokenNameRBRACE	
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
// fall-through 	TokenNameCOMMENT_LINE	fall-through 
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
sk	TokenNameIdentifier	 sk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
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
/** * Parses a PreserveAspectRatio attribute. */	TokenNameCOMMENT_JAVADOC	 Parses a PreserveAspectRatio attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
parsePreserveAspectRatio	TokenNameIdentifier	 parse Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
startPreserveAspectRatio	TokenNameIdentifier	 start Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
align	TokenNameIdentifier	 align
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
none	TokenNameIdentifier	 none
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
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
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'Y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMaxYMax	TokenNameIdentifier	 x Max Y Max
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMaxYMid	TokenNameIdentifier	 x Max Y Mid
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
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMaxYMin	TokenNameIdentifier	 x Max Y Min
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
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
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'Y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMidYMax	TokenNameIdentifier	 x Mid Y Max
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMidYMid	TokenNameIdentifier	 x Mid Y Mid
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
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMidYMin	TokenNameIdentifier	 x Mid Y Min
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
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
'Y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'Y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
'M'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'M'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
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
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMinYMax	TokenNameIdentifier	 x Min Y Max
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMinYMid	TokenNameIdentifier	 x Min Y Mid
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
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
xMinYMin	TokenNameIdentifier	 x Min Y Min
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
reportUnexpectedCharacterError	TokenNameIdentifier	 report Unexpected Character Error
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
skipCommaSpaces	TokenNameIdentifier	 skip Comma Spaces
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
meet	TokenNameIdentifier	 meet
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportCharacterExpectedError	TokenNameIdentifier	 report Character Expected Error
(	TokenNameLPAREN	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
skipIdentifier	TokenNameIdentifier	 skip Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
slice	TokenNameIdentifier	 slice
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
}	TokenNameRBRACE	
fragmentIdentifierHandler	TokenNameIdentifier	 fragment Identifier Handler
.	TokenNameDOT	
endPreserveAspectRatio	TokenNameIdentifier	 end Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips characters in the given reader until a white space is encountered. */	TokenNameCOMMENT_JAVADOC	 Skips characters in the given reader until a white space is encountered. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipIdentifier	TokenNameIdentifier	 skip Identifier
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
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
