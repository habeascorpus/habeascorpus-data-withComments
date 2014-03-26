// FastCharStream.java 	TokenNameCOMMENT_LINE	FastCharStream.java 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** An efficient implementation of JavaCC's CharStream interface. <p>Note that * this does not do line-number counting, but instead keeps track of the * character position of the token in the input, as required by Lucene's {@link * org.apache.lucene.analysis.Token} API. */	TokenNameCOMMENT_JAVADOC	 An efficient implementation of JavaCC's CharStream interface. <p>Note that this does not do line-number counting, but instead keeps track of the character position of the token in the input, as required by Lucene's {@link org.apache.lucene.analysis.Token} API. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FastCharStream	TokenNameIdentifier	 Fast Char Stream
implements	TokenNameimplements	
CharStream	TokenNameIdentifier	 Char Stream
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferLength	TokenNameIdentifier	 buffer Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// end of valid chars 	TokenNameCOMMENT_LINE	end of valid chars 
int	TokenNameint	
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// next char to read 	TokenNameCOMMENT_LINE	next char to read 
int	TokenNameint	
tokenStart	TokenNameIdentifier	 token Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// offset in buffer 	TokenNameCOMMENT_LINE	offset in buffer 
int	TokenNameint	
bufferStart	TokenNameIdentifier	 buffer Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// position in file of buffer 	TokenNameCOMMENT_LINE	position in file of buffer 
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
// source of chars 	TokenNameCOMMENT_LINE	source of chars 
/** Constructs from a Reader. */	TokenNameCOMMENT_JAVADOC	 Constructs from a Reader. 
public	TokenNamepublic	
FastCharStream	TokenNameIdentifier	 Fast Char Stream
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferPosition	TokenNameIdentifier	 buffer Position
>=	TokenNameGREATER_EQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
bufferPosition	TokenNameIdentifier	 buffer Position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
refill	TokenNameIdentifier	 refill
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
newPosition	TokenNameIdentifier	 new Position
=	TokenNameEQUAL	
bufferLength	TokenNameIdentifier	 buffer Length
-	TokenNameMINUS	
tokenStart	TokenNameIdentifier	 token Start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenStart	TokenNameIdentifier	 token Start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// token won't fit in buffer 	TokenNameCOMMENT_LINE	token won't fit in buffer 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first time: alloc buffer 	TokenNameCOMMENT_LINE	first time: alloc buffer 
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2048	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bufferLength	TokenNameIdentifier	 buffer Length
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// grow buffer 	TokenNameCOMMENT_LINE	grow buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
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
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufferLength	TokenNameIdentifier	 buffer Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// shift token to front 	TokenNameCOMMENT_LINE	shift token to front 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
tokenStart	TokenNameIdentifier	 token Start
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newPosition	TokenNameIdentifier	 new Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bufferLength	TokenNameIdentifier	 buffer Length
=	TokenNameEQUAL	
newPosition	TokenNameIdentifier	 new Position
;	TokenNameSEMICOLON	
// update state 	TokenNameCOMMENT_LINE	update state 
bufferPosition	TokenNameIdentifier	 buffer Position
=	TokenNameEQUAL	
newPosition	TokenNameIdentifier	 new Position
;	TokenNameSEMICOLON	
bufferStart	TokenNameIdentifier	 buffer Start
+=	TokenNamePLUS_EQUAL	
tokenStart	TokenNameIdentifier	 token Start
;	TokenNameSEMICOLON	
tokenStart	TokenNameIdentifier	 token Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
charsRead	TokenNameIdentifier	 chars Read
=	TokenNameEQUAL	
// fill space in buffer 	TokenNameCOMMENT_LINE	fill space in buffer 
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
newPosition	TokenNameIdentifier	 new Position
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newPosition	TokenNameIdentifier	 new Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charsRead	TokenNameIdentifier	 chars Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"read past eof"	TokenNameStringLiteral	read past eof
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
bufferLength	TokenNameIdentifier	 buffer Length
+=	TokenNamePLUS_EQUAL	
charsRead	TokenNameIdentifier	 chars Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
BeginToken	TokenNameIdentifier	 Begin Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
tokenStart	TokenNameIdentifier	 token Start
=	TokenNameEQUAL	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
backup	TokenNameIdentifier	 backup
(	TokenNameLPAREN	
int	TokenNameint	
amount	TokenNameIdentifier	 amount
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferPosition	TokenNameIdentifier	 buffer Position
-=	TokenNameMINUS_EQUAL	
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GetImage	TokenNameIdentifier	 Get Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
tokenStart	TokenNameIdentifier	 token Start
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
-	TokenNameMINUS	
tokenStart	TokenNameIdentifier	 token Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
GetSuffix	TokenNameIdentifier	 Get Suffix
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferPosition	TokenNameIdentifier	 buffer Position
-	TokenNameMINUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
Done	TokenNameIdentifier	 Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Caught: "	TokenNameStringLiteral	Caught: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
+	TokenNamePLUS	
"; ignoring."	TokenNameStringLiteral	; ignoring.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getEndColumn	TokenNameIdentifier	 get End Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
bufferPosition	TokenNameIdentifier	 buffer Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getEndLine	TokenNameIdentifier	 get End Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getBeginColumn	TokenNameIdentifier	 get Begin Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferStart	TokenNameIdentifier	 buffer Start
+	TokenNamePLUS	
tokenStart	TokenNameIdentifier	 token Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getBeginLine	TokenNameIdentifier	 get Begin Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
