/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringNormalizingReader	TokenNameIdentifier	 String Normalizing Reader
;	TokenNameSEMICOLON	
/** * This class represents a CSS scanner - an object which decodes CSS lexical * units. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Scanner.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a CSS scanner - an object which decodes CSS lexical units. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Scanner.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Scanner	TokenNameIdentifier	 Scanner
{	TokenNameLBRACE	
/** * The reader. */	TokenNameCOMMENT_JAVADOC	 The reader. 
protected	TokenNameprotected	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
/** * The current char. */	TokenNameCOMMENT_JAVADOC	 The current char. 
protected	TokenNameprotected	
int	TokenNameint	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
/** * The recording buffer. */	TokenNameCOMMENT_JAVADOC	 The recording buffer. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The current position in the buffer. */	TokenNameCOMMENT_JAVADOC	 The current position in the buffer. 
protected	TokenNameprotected	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
/** * The type of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 The type of the current lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * The start offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 The start offset of the last lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
/** * The end offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 The end offset of the last lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * The characters to skip to create the string which represents the * current token. */	TokenNameCOMMENT_JAVADOC	 The characters to skip to create the string which represents the current token. 
protected	TokenNameprotected	
int	TokenNameint	
blankCharacters	TokenNameIdentifier	 blank Characters
;	TokenNameSEMICOLON	
/** * Creates a new Scanner object. * @param r The reader to scan. */	TokenNameCOMMENT_JAVADOC	 Creates a new Scanner object. @param r The reader to scan. 
public	TokenNamepublic	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new Scanner object. * @param is The input stream to scan. * @param enc The encoding to use to decode the input stream, or null. */	TokenNameCOMMENT_JAVADOC	 Creates a new Scanner object. @param is The input stream to scan. @param enc The encoding to use to decode the input stream, or null. 
public	TokenNamepublic	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new Scanner object. * @param s The string to scan. */	TokenNameCOMMENT_JAVADOC	 Creates a new Scanner object. @param s The string to scan. 
public	TokenNamepublic	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringNormalizingReader	TokenNameIdentifier	 String Normalizing Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current line. */	TokenNameCOMMENT_JAVADOC	 Returns the current line. 
public	TokenNamepublic	
int	TokenNameint	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current column. */	TokenNameCOMMENT_JAVADOC	 Returns the current column. 
public	TokenNamepublic	
int	TokenNameint	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the buffer used to store the chars. */	TokenNameCOMMENT_JAVADOC	 Returns the buffer used to store the chars. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the start offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the start offset of the last lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end offset of the last lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the end offset of the last lexical unit. 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the buffer. */	TokenNameCOMMENT_JAVADOC	 Clears the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
clearBuffer	TokenNameIdentifier	 clear Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The current lexical unit type like defined in LexicalUnits. */	TokenNameCOMMENT_JAVADOC	 The current lexical unit type like defined in LexicalUnits. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the string representation of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the string representation of the current lexical unit. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a @rule value. This method assumes that the current * lexical unit is a at keyword. */	TokenNameCOMMENT_JAVADOC	 Scans a @rule value. This method assumes that the current lexical unit is a at keyword. 
public	TokenNamepublic	
void	TokenNamevoid	
scanAtRule	TokenNameIdentifier	 scan At Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// waiting for EOF, ';' or '{' 	TokenNameCOMMENT_LINE	waiting for EOF, ';' or '{' 
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
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
brackets	TokenNameIdentifier	 brackets
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'}'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
brackets	TokenNameIdentifier	 brackets
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
brackets	TokenNameIdentifier	 brackets
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the next token. */	TokenNameCOMMENT_JAVADOC	 Returns the next token. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
blankCharacters	TokenNameIdentifier	 blank Characters
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
endGap	TokenNameIdentifier	 end Gap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end gap of the current lexical unit. */	TokenNameCOMMENT_JAVADOC	 Returns the end gap of the current lexical unit. 
protected	TokenNameprotected	
int	TokenNameint	
endGap	TokenNameIdentifier	 end Gap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FUNCTION	TokenNameIdentifier	 FUNCTION
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PERCENTAGE	TokenNameIdentifier	 PERCENTAGE
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
HZ	TokenNameIdentifier	 HZ
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EM	TokenNameIdentifier	 EM
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EX	TokenNameIdentifier	 EX
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PC	TokenNameIdentifier	 PC
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PT	TokenNameIdentifier	 PT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PX	TokenNameIdentifier	 PX
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CM	TokenNameIdentifier	 CM
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MM	TokenNameIdentifier	 MM
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MS	TokenNameIdentifier	 MS
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
KHZ	TokenNameIdentifier	 KHZ
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DEG	TokenNameIdentifier	 DEG
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RAD	TokenNameIdentifier	 RAD
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
GRAD	TokenNameIdentifier	 GRAD
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
blankCharacters	TokenNameIdentifier	 blank Characters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next token. */	TokenNameCOMMENT_JAVADOC	 Returns the next token. 
protected	TokenNameprotected	
void	TokenNamevoid	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
try	TokenNametry	
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_CURLY_BRACE	TokenNameIdentifier	 LEFT  CURLY  BRACE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'}'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_CURLY_BRACE	TokenNameIdentifier	 RIGHT  CURLY  BRACE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'='	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PLUS	TokenNameIdentifier	 PLUS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMA	TokenNameIdentifier	 COMMA
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SEMI_COLON	TokenNameIdentifier	 SEMI  COLON
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PRECEDE	TokenNameIdentifier	 PRECEDE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACKET	TokenNameIdentifier	 LEFT  BRACKET
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACKET	TokenNameIdentifier	 RIGHT  BRACKET
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'*'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
LEFT_BRACE	TokenNameIdentifier	 LEFT  BRACE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RIGHT_BRACE	TokenNameIdentifier	 RIGHT  BRACE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
':'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COLON	TokenNameIdentifier	 COLON
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
SPACE	TokenNameIdentifier	 SPACE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'/'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIVIDE	TokenNameIdentifier	 DIVIDE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Comment 	TokenNameCOMMENT_LINE	Comment 
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'/'	TokenNameCharacterLiteral	
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
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// String1 	TokenNameCOMMENT_LINE	String1 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
string1	TokenNameIdentifier	 string1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// String2 	TokenNameCOMMENT_LINE	String2 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
string2	TokenNameIdentifier	 string2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'!'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDO	TokenNameIdentifier	 CDO
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MINUS	TokenNameIdentifier	 MINUS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CDC	TokenNameIdentifier	 CDC
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'|'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DASHMATCH	TokenNameIdentifier	 DASHMATCH
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'~'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
INCLUDES	TokenNameIdentifier	 INCLUDES
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'#'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
HASH	TokenNameIdentifier	 HASH
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'@'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
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
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'h'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CHARSET_SYMBOL	TokenNameIdentifier	 CHARSET  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'F'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FONT_FACE_SYMBOL	TokenNameIdentifier	 FONT  FACE  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IMPORT_SYMBOL	TokenNameIdentifier	 IMPORT  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'd'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MEDIA_SYMBOL	TokenNameIdentifier	 MEDIA  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PAGE_SYMBOL	TokenNameIdentifier	 PAGE  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSIdentifierStartCharacter	TokenNameIdentifier	 is CSS Identifier Start Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"identifier.character"	TokenNameStringLiteral	identifier.character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
AT_KEYWORD	TokenNameIdentifier	 AT  KEYWORD
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IMPORTANT_SYMBOL	TokenNameIdentifier	 IMPORTANT  SYMBOL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
dotNumber	TokenNameIdentifier	 dot Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'U'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'+'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
boolean	TokenNameboolean	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'?'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
&&	TokenNameAND_AND	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
UNICODE_RANGE	TokenNameIdentifier	 UNICODE  RANGE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'R'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'L'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'('	TokenNameCharacterLiteral	
:	TokenNameCOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
string1	TokenNameIdentifier	 string1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blankCharacters	TokenNameIdentifier	 blank Characters
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blankCharacters	TokenNameIdentifier	 blank Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
string2	TokenNameIdentifier	 string2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blankCharacters	TokenNameIdentifier	 blank Characters
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blankCharacters	TokenNameIdentifier	 blank Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
')'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSURICharacter	TokenNameIdentifier	 is CSSURI Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSURICharacter	TokenNameIdentifier	 is CSSURI Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
blankCharacters	TokenNameIdentifier	 blank Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blankCharacters	TokenNameIdentifier	 blank Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
URI	TokenNameIdentifier	 URI
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FUNCTION	TokenNameIdentifier	 FUNCTION
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDENTIFIER	TokenNameIdentifier	 IDENTIFIER
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSIdentifierStartCharacter	TokenNameIdentifier	 is CSS Identifier Start Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"identifier.character"	TokenNameStringLiteral	identifier.character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Identifier 	TokenNameCOMMENT_LINE	Identifier 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
FUNCTION	TokenNameIdentifier	 FUNCTION
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IDENTIFIER	TokenNameIdentifier	 IDENTIFIER
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Scans a single quoted string. */	TokenNameCOMMENT_JAVADOC	 Scans a single quoted string. 
protected	TokenNameprotected	
int	TokenNameint	
string1	TokenNameIdentifier	 string1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// fix bug #29416 	TokenNameCOMMENT_LINE	fix bug #29416 
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
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
escape	TokenNameIdentifier	 escape
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
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSStringCharacter	TokenNameIdentifier	 is CSS String Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a double quoted string. */	TokenNameCOMMENT_JAVADOC	 Scans a double quoted string. 
protected	TokenNameprotected	
int	TokenNameint	
string2	TokenNameIdentifier	 string2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// fix bug #29416 	TokenNameCOMMENT_LINE	fix bug #29416 
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
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"eof"	TokenNameStringLiteral	eof
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\\'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
escape	TokenNameIdentifier	 escape
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
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSStringCharacter	TokenNameIdentifier	 is CSS String Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a number. */	TokenNameCOMMENT_JAVADOC	 Scans a number. 
protected	TokenNameprotected	
int	TokenNameint	
number	TokenNameIdentifier	 number
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
dotNumber	TokenNameIdentifier	 dot Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
return	TokenNamereturn	
numberUnit	TokenNameIdentifier	 number Unit
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans the decimal part of a number. */	TokenNameCOMMENT_JAVADOC	 Scans the decimal part of a number. 
protected	TokenNameprotected	
int	TokenNameint	
dotNumber	TokenNameIdentifier	 dot Number
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
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
return	TokenNamereturn	
numberUnit	TokenNameIdentifier	 number Unit
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans the unit of a number. */	TokenNameCOMMENT_JAVADOC	 Scans the unit of a number. 
protected	TokenNameprotected	
int	TokenNameint	
numberUnit	TokenNameIdentifier	 number Unit
(	TokenNameLPAREN	
boolean	TokenNameboolean	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PERCENTAGE	TokenNameIdentifier	 PERCENTAGE
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
CM	TokenNameIdentifier	 CM
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'g'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'G'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DEG	TokenNameIdentifier	 DEG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EM	TokenNameIdentifier	 EM
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'X'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
EX	TokenNameIdentifier	 EX
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'g'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'G'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'R'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
GRAD	TokenNameIdentifier	 GRAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'H'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
HZ	TokenNameIdentifier	 HZ
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'N'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'k'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'K'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'h'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'H'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
KHZ	TokenNameIdentifier	 KHZ
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MM	TokenNameIdentifier	 MM
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
MS	TokenNameIdentifier	 MS
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'P'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PC	TokenNameIdentifier	 PC
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'T'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PT	TokenNameIdentifier	 PT
;	TokenNameSEMICOLON	
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'X'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
PX	TokenNameIdentifier	 PX
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'R'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
RAD	TokenNameIdentifier	 RAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'S'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
S	TokenNameIdentifier	 S
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSIdentifierStartCharacter	TokenNameIdentifier	 is CSS Identifier Start Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
DIMENSION	TokenNameIdentifier	 DIMENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
integer	TokenNameIdentifier	 integer
)	TokenNameRPAREN	
?	TokenNameQUESTION	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
INTEGER	TokenNameIdentifier	 INTEGER
:	TokenNameCOLON	
LexicalUnits	TokenNameIdentifier	 Lexical Units
.	TokenNameDOT	
REAL	TokenNameIdentifier	 REAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Scans an escape sequence, if one. */	TokenNameCOMMENT_JAVADOC	 Scans an escape sequence, if one. 
protected	TokenNameprotected	
void	TokenNamevoid	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
.	TokenNameDOT	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
'~'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"character"	TokenNameStringLiteral	character
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares the given int with the given character, ignoring case. */	TokenNameCOMMENT_JAVADOC	 Compares the given int with the given character, ignoring case. 
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isEqualIgnoreCase	TokenNameIdentifier	 is Equal Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the current char to the next character or -1 if the * end of stream has been reached. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the current char to the next character or -1 if the end of stream has been reached. 
protected	TokenNameprotected	
int	TokenNameint	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
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
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// list is full, grow to 1.5 * size 	TokenNameCOMMENT_LINE	list is full, grow to 1.5 * size 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
/	TokenNameDIVIDE	
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
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
