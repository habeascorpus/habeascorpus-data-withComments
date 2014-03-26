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
filters	TokenNameIdentifier	 filters
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilterReader	TokenNameIdentifier	 Filter Reader
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Base class for core filter readers. * */	TokenNameCOMMENT_JAVADOC	 Base class for core filter readers. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseFilterReader	TokenNameIdentifier	 Base Filter Reader
extends	TokenNameextends	
FilterReader	TokenNameIdentifier	 Filter Reader
{	TokenNameLBRACE	
/** Buffer size used when reading */	TokenNameCOMMENT_JAVADOC	 Buffer size used when reading 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
8192	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Have the parameters passed been interpreted? */	TokenNameCOMMENT_JAVADOC	 Have the parameters passed been interpreted? 
private	TokenNameprivate	
boolean	TokenNameboolean	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The Ant project this filter is part of. */	TokenNameCOMMENT_JAVADOC	 The Ant project this filter is part of. 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor used by Ant's introspection mechanism. * The original filter reader is only used for chaining * purposes, never for filtering purposes (and indeed * it would be useless for filtering purposes, as it has * no real data to filter). ChainedReaderHelper uses * this placeholder instance to create a chain of real filters. */	TokenNameCOMMENT_JAVADOC	 Constructor used by Ant's introspection mechanism. The original filter reader is only used for chaining purposes, never for filtering purposes (and indeed it would be useless for filtering purposes, as it has no real data to filter). ChainedReaderHelper uses this placeholder instance to create a chain of real filters. 
public	TokenNamepublic	
BaseFilterReader	TokenNameIdentifier	 Base Filter Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new filtered reader. * * @param in A Reader object providing the underlying stream. * Must not be <code>null</code>. * */	TokenNameCOMMENT_JAVADOC	 Creates a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. 
public	TokenNamepublic	
BaseFilterReader	TokenNameIdentifier	 Base Filter Reader
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads characters into a portion of an array. This method will block * until some input is available, an I/O error occurs, or the end of the * stream is reached. * * @param cbuf Destination buffer to write characters to. * Must not be <code>null</code>. * @param off Offset at which to start storing characters. * @param len Maximum number of characters to read. * * @return the number of characters read, or -1 if the end of the * stream has been reached * * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Reads characters into a portion of an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached. * @param cbuf Destination buffer to write characters to. Must not be <code>null</code>. @param off Offset at which to start storing characters. @param len Maximum number of characters to read. * @return the number of characters read, or -1 if the end of the stream has been reached * @exception IOException If an I/O error occurs 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cbuf	TokenNameIdentifier	 cbuf
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips characters. This method will block until some characters are * available, an I/O error occurs, or the end of the stream is reached. * * @param n The number of characters to skip * * @return the number of characters actually skipped * * @exception IllegalArgumentException If <code>n</code> is negative. * @exception IOException If an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Skips characters. This method will block until some characters are available, an I/O error occurs, or the end of the stream is reached. * @param n The number of characters to skip * @return the number of characters actually skipped * @exception IllegalArgumentException If <code>n</code> is negative. @exception IOException If an I/O error occurs 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"skip value is negative"	TokenNameStringLiteral	skip value is negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the initialized status. * * @param initialized Whether or not the filter is initialized. */	TokenNameCOMMENT_JAVADOC	 Sets the initialized status. * @param initialized Whether or not the filter is initialized. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
initialized	TokenNameIdentifier	 initialized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initialized	TokenNameIdentifier	 initialized
=	TokenNameEQUAL	
initialized	TokenNameIdentifier	 initialized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the initialized status. * * @return whether or not the filter is initialized */	TokenNameCOMMENT_JAVADOC	 Returns the initialized status. * @return whether or not the filter is initialized 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
getInitialized	TokenNameIdentifier	 get Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initialized	TokenNameIdentifier	 initialized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the project to work with. * * @param project The project this filter is part of. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the project to work with. * @param project The project this filter is part of. Should not be <code>null</code>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the project this filter is part of. * * @return the project this filter is part of */	TokenNameCOMMENT_JAVADOC	 Returns the project this filter is part of. * @return the project this filter is part of 
protected	TokenNameprotected	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a line of text ending with '\n' (or until the end of the stream). * The returned String retains the '\n'. * * @return the line read, or <code>null</code> if the end of the stream * has already been reached * * @exception IOException if the underlying reader throws one during * reading */	TokenNameCOMMENT_JAVADOC	 Reads a line of text ending with '\n' (or until the end of the stream). The returned String retains the '\n'. * @return the line read, or <code>null</code> if the end of the stream has already been reached * @exception IOException if the underlying reader throws one during reading 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads to the end of the stream, returning the contents as a String. * * @return the remaining contents of the reader, as a String * * @exception IOException if the underlying reader throws one during * reading */	TokenNameCOMMENT_JAVADOC	 Reads to the end of the stream, returning the contents as a String. * @return the remaining contents of the reader, as a String * @exception IOException if the underlying reader throws one during reading 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
