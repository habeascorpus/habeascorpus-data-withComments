/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
io	TokenNameIdentifier	 io
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
Map	TokenNameIdentifier	 Map
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
EncodingUtilities	TokenNameIdentifier	 Encoding Utilities
;	TokenNameSEMICOLON	
/** * This class represents a NormalizingReader which handles streams of * bytes. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StreamNormalizingReader.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a NormalizingReader which handles streams of bytes. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StreamNormalizingReader.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
extends	TokenNameextends	
NormalizingReader	TokenNameIdentifier	 Normalizing Reader
{	TokenNameLBRACE	
/** * The char decoder. */	TokenNameCOMMENT_JAVADOC	 The char decoder. 
protected	TokenNameprotected	
CharDecoder	TokenNameIdentifier	 Char Decoder
charDecoder	TokenNameIdentifier	 char Decoder
;	TokenNameSEMICOLON	
/** * The next char. */	TokenNameCOMMENT_JAVADOC	 The next char. 
protected	TokenNameprotected	
int	TokenNameint	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current line in the stream. */	TokenNameCOMMENT_JAVADOC	 The current line in the stream. 
protected	TokenNameprotected	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current column in the stream. */	TokenNameCOMMENT_JAVADOC	 The current column in the stream. 
protected	TokenNameprotected	
int	TokenNameint	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
/** * Creates a new NormalizingReader. The encoding is assumed to be * ISO-8859-1. * @param is The input stream to decode. */	TokenNameCOMMENT_JAVADOC	 Creates a new NormalizingReader. The encoding is assumed to be ISO-8859-1. @param is The input stream to decode. 
public	TokenNamepublic	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new NormalizingReader. * @param is The input stream to decode. * @param enc The standard encoding name. A null encoding means * ISO-8859-1. */	TokenNameCOMMENT_JAVADOC	 Creates a new NormalizingReader. @param is The input stream to decode. @param enc The standard encoding name. A null encoding means ISO-8859-1. 
public	TokenNamepublic	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enc	TokenNameIdentifier	 enc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new NormalizingReader. * @param r The reader to wrap. */	TokenNameCOMMENT_JAVADOC	 Creates a new NormalizingReader. @param r The reader to wrap. 
public	TokenNamepublic	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
new	TokenNamenew	
GenericDecoder	TokenNameIdentifier	 Generic Decoder
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This constructor is intended for use by subclasses. */	TokenNameCOMMENT_JAVADOC	 This constructor is intended for use by subclasses. 
protected	TokenNameprotected	
StreamNormalizingReader	TokenNameIdentifier	 Stream Normalizing Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Read a single character. This method will block until a * character is available, an I/O error occurs, or the end of the * stream is reached. */	TokenNameCOMMENT_JAVADOC	 Read a single character. This method will block until a character is available, an I/O error occurs, or the end of the stream is reached. 
public	TokenNamepublic	
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
nextChar	TokenNameIdentifier	 next Char
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
column	TokenNameIdentifier	 column
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
charDecoder	TokenNameIdentifier	 char Decoder
.	TokenNameDOT	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
charDecoder	TokenNameIdentifier	 char Decoder
.	TokenNameDOT	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
return	TokenNamereturn	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current line in the stream. */	TokenNameCOMMENT_JAVADOC	 Returns the current line in the stream. 
public	TokenNamepublic	
int	TokenNameint	
getLine	TokenNameIdentifier	 get Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current column in the stream. */	TokenNameCOMMENT_JAVADOC	 Returns the current column in the stream. 
public	TokenNamepublic	
int	TokenNameint	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the stream. */	TokenNameCOMMENT_JAVADOC	 Close the stream. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
charDecoder	TokenNameIdentifier	 char Decoder
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoder	TokenNameIdentifier	 char Decoder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the CharDecoder mapped with the given encoding name. */	TokenNameCOMMENT_JAVADOC	 Creates the CharDecoder mapped with the given encoding name. 
protected	TokenNameprotected	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
cdf	TokenNameIdentifier	 cdf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
)	TokenNameRPAREN	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cdf	TokenNameIdentifier	 cdf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cdf	TokenNameIdentifier	 cdf
.	TokenNameDOT	
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
EncodingUtilities	TokenNameIdentifier	 Encoding Utilities
.	TokenNameDOT	
javaEncoding	TokenNameIdentifier	 java Encoding
(	TokenNameLPAREN	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericDecoder	TokenNameIdentifier	 Generic Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The CharDecoder factories map. */	TokenNameCOMMENT_JAVADOC	 The CharDecoder factories map. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
cdf	TokenNameIdentifier	 cdf
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIDecoderFactory	TokenNameIdentifier	 ASCII Decoder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ASCII"	TokenNameStringLiteral	ASCII
,	TokenNameCOMMA	
cdf	TokenNameIdentifier	 cdf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
,	TokenNameCOMMA	
cdf	TokenNameIdentifier	 cdf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
new	TokenNamenew	
ISO_8859_1DecoderFactory	TokenNameIdentifier	 ISO 8859 1 Decoder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
,	TokenNameCOMMA	
new	TokenNamenew	
UTF8DecoderFactory	TokenNameIdentifier	 UT F8 Decoder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charDecoderFactories	TokenNameIdentifier	 char Decoder Factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
,	TokenNameCOMMA	
new	TokenNamenew	
UTF16DecoderFactory	TokenNameIdentifier	 UT F16 Decoder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represents a CharDecoder factory. */	TokenNameCOMMENT_JAVADOC	 Represents a CharDecoder factory. 
protected	TokenNameprotected	
interface	TokenNameinterface	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
{	TokenNameLBRACE	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To create an ASCIIDecoder. */	TokenNameCOMMENT_JAVADOC	 To create an ASCIIDecoder. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ASCIIDecoderFactory	TokenNameIdentifier	 ASCII Decoder Factory
implements	TokenNameimplements	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ASCIIDecoder	TokenNameIdentifier	 ASCII Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create an ISO_8859_1Decoder. */	TokenNameCOMMENT_JAVADOC	 To create an ISO_8859_1Decoder. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ISO_8859_1DecoderFactory	TokenNameIdentifier	 ISO 8859 1 Decoder Factory
implements	TokenNameimplements	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISO_8859_1Decoder	TokenNameIdentifier	 ISO 8859 1 Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a UTF8Decoder. */	TokenNameCOMMENT_JAVADOC	 To create a UTF8Decoder. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
UTF8DecoderFactory	TokenNameIdentifier	 UT F8 Decoder Factory
implements	TokenNameimplements	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UTF8Decoder	TokenNameIdentifier	 UT F8 Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a UTF16Decoder. */	TokenNameCOMMENT_JAVADOC	 To create a UTF16Decoder. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
UTF16DecoderFactory	TokenNameIdentifier	 UT F16 Decoder Factory
implements	TokenNameimplements	
CharDecoderFactory	TokenNameIdentifier	 Char Decoder Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
CharDecoder	TokenNameIdentifier	 Char Decoder
createCharDecoder	TokenNameIdentifier	 create Char Decoder
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UTF16Decoder	TokenNameIdentifier	 UT F16 Decoder
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
