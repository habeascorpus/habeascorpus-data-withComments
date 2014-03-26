package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * Implements a {@link Reader} over a {@link StringBuilder} instance. Although * one can use {@link java.io.StringReader} by passing it * {@link StringBuilder#toString()}, it is better to use this class, as it * doesn't mark the passed-in {@link StringBuilder} as shared (which will cause * inner char[] allocations at the next append() attempt).<br> * Notes: * <ul> * <li>This implementation assumes the underlying {@link StringBuilder} is not * changed during the use of this {@link Reader} implementation. * <li>This implementation is thread-safe. * <li>The implementation looks very much like {@link java.io.StringReader} (for * the right reasons). * <li>If one wants to reuse that instance, then the following needs to be done: * <pre> * StringBuilder sb = new StringBuilder("some text"); * Reader reader = new StringBuilderReader(sb); * ... read from reader - don't close it ! ... * sb.setLength(0); * sb.append("some new text"); * reader.reset(); * ... read the new string from the reader ... * </pre> * </ul> */	TokenNameCOMMENT_JAVADOC	 Implements a {@link Reader} over a {@link StringBuilder} instance. Although one can use {@link java.io.StringReader} by passing it {@link StringBuilder#toString()}, it is better to use this class, as it doesn't mark the passed-in {@link StringBuilder} as shared (which will cause inner char[] allocations at the next append() attempt).<br> Notes: <ul> <li>This implementation assumes the underlying {@link StringBuilder} is not changed during the use of this {@link Reader} implementation. <li>This implementation is thread-safe. <li>The implementation looks very much like {@link java.io.StringReader} (for the right reasons). <li>If one wants to reuse that instance, then the following needs to be done: <pre> StringBuilder sb = new StringBuilder("some text"); Reader reader = new StringBuilderReader(sb); ... read from reader - don't close it ! ... sb.setLength(0); sb.append("some new text"); reader.reset(); ... read the new string from the reader ... </pre> </ul> 
public	TokenNamepublic	
class	TokenNameclass	
StringBuilderReader	TokenNameIdentifier	 String Builder Reader
extends	TokenNameextends	
Reader	TokenNameIdentifier	 Reader
{	TokenNameLBRACE	
// The StringBuilder to read from. 	TokenNameCOMMENT_LINE	The StringBuilder to read from. 
private	TokenNameprivate	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
// The length of 'sb'. 	TokenNameCOMMENT_LINE	The length of 'sb'. 
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// The next position to read from the StringBuilder. 	TokenNameCOMMENT_LINE	The next position to read from the StringBuilder. 
private	TokenNameprivate	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The mark position. The default value 0 means the start of the text. 	TokenNameCOMMENT_LINE	The mark position. The default value 0 means the start of the text. 
private	TokenNameprivate	
int	TokenNameint	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringBuilderReader	TokenNameIdentifier	 String Builder Reader
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Check to make sure that the stream has not been closed. */	TokenNameCOMMENT_JAVADOC	 Check to make sure that the stream has not been closed. 
private	TokenNameprivate	
void	TokenNamevoid	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Stream has already been closed"	TokenNameStringLiteral	Stream has already been closed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Mark the present position in the stream. Subsequent calls to reset() will * reposition the stream to this point. * * @param readAheadLimit Limit on the number of characters that may be read * while still preserving the mark. Because the stream's input comes * from a StringBuilder, there is no actual limit, so this argument * must not be negative, but is otherwise ignored. * @exception IllegalArgumentException If readAheadLimit is < 0 * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Mark the present position in the stream. Subsequent calls to reset() will reposition the stream to this point. * @param readAheadLimit Limit on the number of characters that may be read while still preserving the mark. Because the stream's input comes from a StringBuilder, there is no actual limit, so this argument must not be negative, but is otherwise ignored. @exception IllegalArgumentException If readAheadLimit is < 0 @exception IOException If an I/O error occurs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Read-ahead limit cannpt be negative: "	TokenNameStringLiteral	Read-ahead limit cannpt be negative: 
+	TokenNamePLUS	
readAheadLimit	TokenNameIdentifier	 read Ahead Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
cbuf	TokenNameIdentifier	 cbuf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Validate parameters 	TokenNameCOMMENT_LINE	Validate parameters 
if	TokenNameif	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
off	TokenNameIdentifier	 off
>	TokenNameGREATER	
cbuf	TokenNameIdentifier	 cbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
cbuf	TokenNameIdentifier	 cbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"off="	TokenNameStringLiteral	off=
+	TokenNamePLUS	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
" len="	TokenNameStringLiteral	 len=
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
" cbuf.length="	TokenNameStringLiteral	 cbuf.length=
+	TokenNamePLUS	
cbuf	TokenNameIdentifier	 cbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
mark	TokenNameIdentifier	 mark
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
lock	TokenNameIdentifier	 lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bound skip by beginning and end of the source 	TokenNameCOMMENT_LINE	Bound skip by beginning and end of the source 
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
-	TokenNameMINUS	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
