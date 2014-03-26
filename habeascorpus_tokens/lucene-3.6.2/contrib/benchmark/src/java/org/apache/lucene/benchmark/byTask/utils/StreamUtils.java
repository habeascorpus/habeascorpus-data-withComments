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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
compressors	TokenNameIdentifier	 compressors
.	TokenNameDOT	
CompressorException	TokenNameIdentifier	 Compressor Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
compressors	TokenNameIdentifier	 compressors
.	TokenNameDOT	
CompressorStreamFactory	TokenNameIdentifier	 Compressor Stream Factory
;	TokenNameSEMICOLON	
/** * Stream utilities. */	TokenNameCOMMENT_JAVADOC	 Stream utilities. 
public	TokenNamepublic	
class	TokenNameclass	
StreamUtils	TokenNameIdentifier	 Stream Utils
{	TokenNameLBRACE	
/** Buffer size used across the benchmark package */	TokenNameCOMMENT_JAVADOC	 Buffer size used across the benchmark package 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 64K 	TokenNameCOMMENT_LINE	64K 
/** File format type */	TokenNameCOMMENT_JAVADOC	 File format type 
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
/** BZIP2 is automatically used for <b>.bz2</b> and <b>.bzip2</b> extensions. */	TokenNameCOMMENT_JAVADOC	 BZIP2 is automatically used for <b>.bz2</b> and <b>.bzip2</b> extensions. 
BZIP2	TokenNameIdentifier	 BZI P2
(	TokenNameLPAREN	
CompressorStreamFactory	TokenNameIdentifier	 Compressor Stream Factory
.	TokenNameDOT	
BZIP2	TokenNameIdentifier	 BZI P2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/** GZIP is automatically used for <b>.gz</b> and <b>.gzip</b> extensions. */	TokenNameCOMMENT_JAVADOC	 GZIP is automatically used for <b>.gz</b> and <b>.gzip</b> extensions. 
GZIP	TokenNameIdentifier	 GZIP
(	TokenNameLPAREN	
CompressorStreamFactory	TokenNameIdentifier	 Compressor Stream Factory
.	TokenNameDOT	
GZIP	TokenNameIdentifier	 GZIP
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/** Plain text is used for anything which is not GZIP or BZIP. */	TokenNameCOMMENT_JAVADOC	 Plain text is used for anything which is not GZIP or BZIP. 
PLAIN	TokenNameIdentifier	 PLAIN
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
csfType	TokenNameIdentifier	 csf Type
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
csfType	TokenNameIdentifier	 csf Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
csfType	TokenNameIdentifier	 csf Type
=	TokenNameEQUAL	
csfType	TokenNameIdentifier	 csf Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
csfType	TokenNameIdentifier	 csf Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
in	TokenNameIdentifier	 in
:	TokenNameCOLON	
new	TokenNamenew	
CompressorStreamFactory	TokenNameIdentifier	 Compressor Stream Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createCompressorInputStream	TokenNameIdentifier	 create Compressor Input Stream
(	TokenNameLPAREN	
csfType	TokenNameIdentifier	 csf Type
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CompressorException	TokenNameIdentifier	 Compressor Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
outputStream	TokenNameIdentifier	 output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
csfType	TokenNameIdentifier	 csf Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
os	TokenNameIdentifier	 os
:	TokenNameCOLON	
new	TokenNamenew	
CompressorStreamFactory	TokenNameIdentifier	 Compressor Stream Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createCompressorOutputStream	TokenNameIdentifier	 create Compressor Output Stream
(	TokenNameLPAREN	
csfType	TokenNameIdentifier	 csf Type
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CompressorException	TokenNameIdentifier	 Compressor Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
extensionToType	TokenNameIdentifier	 extension To Type
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// these in are lower case, we will lower case at the test as well 	TokenNameCOMMENT_LINE	these in are lower case, we will lower case at the test as well 
extensionToType	TokenNameIdentifier	 extension To Type
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
".bz2"	TokenNameStringLiteral	.bz2
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BZIP2	TokenNameIdentifier	 BZI P2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extensionToType	TokenNameIdentifier	 extension To Type
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
".bzip"	TokenNameStringLiteral	.bzip
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BZIP2	TokenNameIdentifier	 BZI P2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extensionToType	TokenNameIdentifier	 extension To Type
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
".gz"	TokenNameStringLiteral	.gz
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
GZIP	TokenNameIdentifier	 GZIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extensionToType	TokenNameIdentifier	 extension To Type
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
".gzip"	TokenNameStringLiteral	.gzip
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
GZIP	TokenNameIdentifier	 GZIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an {@link InputStream} over the requested file. This method * attempts to identify the appropriate {@link InputStream} instance to return * based on the file name (e.g., if it ends with .bz2 or .bzip, return a * 'bzip' {@link InputStream}). */	TokenNameCOMMENT_JAVADOC	 Returns an {@link InputStream} over the requested file. This method attempts to identify the appropriate {@link InputStream} instance to return based on the file name (e.g., if it ends with .bz2 or .bzip, return a 'bzip' {@link InputStream}). 
public	TokenNamepublic	
static	TokenNamestatic	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// First, create a FileInputStream, as this will be required by all types. 	TokenNameCOMMENT_LINE	First, create a FileInputStream, as this will be required by all types. 
// Wrap with BufferedInputStream for better performance 	TokenNameCOMMENT_LINE	Wrap with BufferedInputStream for better performance 
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fileType	TokenNameIdentifier	 file Type
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
.	TokenNameDOT	
inputStream	TokenNameIdentifier	 input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the type of the file, or null if unknown */	TokenNameCOMMENT_JAVADOC	 Return the type of the file, or null if unknown 
private	TokenNameprivate	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
fileType	TokenNameIdentifier	 file Type
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
extensionToType	TokenNameIdentifier	 extension To Type
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
PLAIN	TokenNameIdentifier	 PLAIN
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an {@link OutputStream} over the requested file, identifying * the appropriate {@link OutputStream} instance similar to {@link #inputStream(File)}. */	TokenNameCOMMENT_JAVADOC	 Returns an {@link OutputStream} over the requested file, identifying the appropriate {@link OutputStream} instance similar to {@link #inputStream(File)}. 
public	TokenNamepublic	
static	TokenNamestatic	
OutputStream	TokenNameIdentifier	 Output Stream
outputStream	TokenNameIdentifier	 output Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// First, create a FileInputStream, as this will be required by all types. 	TokenNameCOMMENT_LINE	First, create a FileInputStream, as this will be required by all types. 
// Wrap with BufferedInputStream for better performance 	TokenNameCOMMENT_LINE	Wrap with BufferedInputStream for better performance 
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fileType	TokenNameIdentifier	 file Type
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
.	TokenNameDOT	
outputStream	TokenNameIdentifier	 output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
