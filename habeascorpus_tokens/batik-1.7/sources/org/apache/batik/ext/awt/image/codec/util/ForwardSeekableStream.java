/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
/** * A subclass of <code>SeekableStream</code> that may be used * to wrap a regular <code>InputStream</code> efficiently. * Seeking backwards is not supported. * * @version $Id: ForwardSeekableStream.java 522271 2007-03-25 14:42:45Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A subclass of <code>SeekableStream</code> that may be used to wrap a regular <code>InputStream</code> efficiently. Seeking backwards is not supported. * @version $Id: ForwardSeekableStream.java 522271 2007-03-25 14:42:45Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ForwardSeekableStream	TokenNameIdentifier	 Forward Seekable Stream
extends	TokenNameextends	
SeekableStream	TokenNameIdentifier	 Seekable Stream
{	TokenNameLBRACE	
/** The source <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 The source <code>InputStream</code>. 
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
/** The current position. */	TokenNameCOMMENT_JAVADOC	 The current position. 
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a <code>InputStreamForwardSeekableStream</code> from a * regular <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a <code>InputStreamForwardSeekableStream</code> from a regular <code>InputStream</code>. 
public	TokenNamepublic	
ForwardSeekableStream	TokenNameIdentifier	 Forward Seekable Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
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
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
skipped	TokenNameIdentifier	 skipped
;	TokenNameSEMICOLON	
return	TokenNamereturn	
skipped	TokenNameIdentifier	 skipped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Forwards the request to the real <code>InputStream</code>. * We use {@link SeekableStream#markPos} */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. We use {@link SeekableStream#markPos} 
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
int	TokenNameint	
readLimit	TokenNameIdentifier	 read Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markPos	TokenNameIdentifier	 mark Pos
=	TokenNameEQUAL	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
readLimit	TokenNameIdentifier	 read Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Forwards the request to the real <code>InputStream</code>. * We use {@link SeekableStream#markPos} */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. We use {@link SeekableStream#markPos} 
public	TokenNamepublic	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
markPos	TokenNameIdentifier	 mark Pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
markPos	TokenNameIdentifier	 mark Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Forwards the request to the real <code>InputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Forwards the request to the real <code>InputStream</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>false</code> since seking backwards is not supported. */	TokenNameCOMMENT_JAVADOC	 Returns <code>false</code> since seking backwards is not supported. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
canSeekBackwards	TokenNameIdentifier	 can Seek Backwards
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current position in the stream (bytes read). */	TokenNameCOMMENT_JAVADOC	 Returns the current position in the stream (bytes read). 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Seeks forward to the given position in the stream. * If <code>pos</code> is smaller than the current position * as returned by <code>getFilePointer()</code>, nothing * happens. */	TokenNameCOMMENT_JAVADOC	 Seeks forward to the given position in the stream. If <code>pos</code> is smaller than the current position as returned by <code>getFilePointer()</code>, nothing happens. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
pointer	TokenNameIdentifier	 pointer
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
