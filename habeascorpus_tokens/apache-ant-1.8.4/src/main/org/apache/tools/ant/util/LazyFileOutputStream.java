/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Class that delays opening the output file until the first bytes * shall be written or the method {@link #open open} has been invoked * explicitly. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Class that delays opening the output file until the first bytes shall be written or the method {@link #open open} has been invoked explicitly. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
alwaysCreate	TokenNameIdentifier	 always Create
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
opened	TokenNameIdentifier	 opened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates a stream that will eventually write to the file with * the given name and replace it. * @param name the filename. */	TokenNameCOMMENT_JAVADOC	 Creates a stream that will eventually write to the file with the given name and replace it. @param name the filename. 
public	TokenNamepublic	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream that will eventually write to the file with * the given name and optionally append to instead of replacing * it. * @param name the filename. * @param append if true append rather than replace. */	TokenNameCOMMENT_JAVADOC	 Creates a stream that will eventually write to the file with the given name and optionally append to instead of replacing it. @param name the filename. @param append if true append rather than replace. 
public	TokenNamepublic	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream that will eventually write to the file with * the given name and replace it. * @param f the file to create. */	TokenNameCOMMENT_JAVADOC	 Creates a stream that will eventually write to the file with the given name and replace it. @param f the file to create. 
public	TokenNamepublic	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream that will eventually write to the file with * the given name and optionally append to instead of replacing * it. * @param file the file to create. * @param append if true append rather than replace. */	TokenNameCOMMENT_JAVADOC	 Creates a stream that will eventually write to the file with the given name and optionally append to instead of replacing it. @param file the file to create. @param append if true append rather than replace. 
public	TokenNamepublic	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stream that will eventually write to the file with * the given name, optionally append to instead of replacing * it, and optionally always create a file (even if zero length). * @param file the file to create. * @param append if true append rather than replace. * @param alwaysCreate if true create the file even if nothing to write. */	TokenNameCOMMENT_JAVADOC	 Creates a stream that will eventually write to the file with the given name, optionally append to instead of replacing it, and optionally always create a file (even if zero length). @param file the file to create. @param append if true append rather than replace. @param alwaysCreate if true create the file even if nothing to write. 
public	TokenNamepublic	
LazyFileOutputStream	TokenNameIdentifier	 Lazy File Output Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
boolean	TokenNameboolean	
alwaysCreate	TokenNameIdentifier	 always Create
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
alwaysCreate	TokenNameIdentifier	 always Create
=	TokenNameEQUAL	
alwaysCreate	TokenNameIdentifier	 always Create
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Explicitly open the file for writing. * * <p>Returns silently if the file has already been opened.</p> * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Explicitly open the file for writing. * <p>Returns silently if the file has already been opened.</p> @throws IOException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpened	TokenNameIdentifier	 ensure Opened
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the file. * @throws IOException if there is an error. */	TokenNameCOMMENT_JAVADOC	 Close the file. @throws IOException if there is an error. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
alwaysCreate	TokenNameIdentifier	 always Create
&&	TokenNameAND_AND	
!	TokenNameNOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpened	TokenNameIdentifier	 ensure Opened
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
opened	TokenNameIdentifier	 opened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the three-arg version. * @param b the bytearray to write. * @throws IOException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Delegates to the three-arg version. @param b the bytearray to write. @throws IOException if there is a problem. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write part of a byte array. * @param b the byte array. * @param offset write from this index. * @param len the number of bytes to write. * @throws IOException if there is a probem. */	TokenNameCOMMENT_JAVADOC	 Write part of a byte array. @param b the byte array. @param offset write from this index. @param len the number of bytes to write. @throws IOException if there is a probem. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpened	TokenNameIdentifier	 ensure Opened
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a byte. * @param b the byte to write. * @throws IOException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Write a byte. @param b the byte to write. @throws IOException if there is a problem. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpened	TokenNameIdentifier	 ensure Opened
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
ensureOpened	TokenNameIdentifier	 ensure Opened
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" has already been closed."	TokenNameStringLiteral	 has already been closed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
opened	TokenNameIdentifier	 opened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opened	TokenNameIdentifier	 opened
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
