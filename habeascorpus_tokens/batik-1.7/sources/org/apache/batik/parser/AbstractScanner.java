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
/** * An abstract scanner class to be extended. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AbstractScanner.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An abstract scanner class to be extended. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AbstractScanner.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
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
/** * The previous lexical unit type that was scanned. */	TokenNameCOMMENT_JAVADOC	 The previous lexical unit type that was scanned. 
protected	TokenNameprotected	
int	TokenNameint	
previousType	TokenNameIdentifier	 previous Type
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
/** * Creates a new AbstractScanner object. * @param r The reader to scan. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractScanner object. @param r The reader to scan. 
public	TokenNamepublic	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
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
/** * Creates a new AbstractScanner object. * @param is The input stream to scan. * @param enc The encoding to use to decode the input stream, or null. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractScanner object. @param is The input stream to scan. @param enc The encoding to use to decode the input stream, or null. 
public	TokenNamepublic	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
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
/** * Creates a new AbstractScanner object. * @param s The string to scan. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractScanner object. @param s The string to scan. 
public	TokenNamepublic	
AbstractScanner	TokenNameIdentifier	 Abstract Scanner
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
previousType	TokenNameIdentifier	 previous Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
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
abstract	TokenNameabstract	
int	TokenNameint	
endGap	TokenNameIdentifier	 end Gap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the next token. */	TokenNameCOMMENT_JAVADOC	 Returns the next token. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
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
