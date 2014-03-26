/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
Charset	TokenNameIdentifier	 Charset
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
UnsupportedCharsetException	TokenNameIdentifier	 Unsupported Charset Exception
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
/** * Static helper functions for robustly encoding filenames in zip files. */	TokenNameCOMMENT_JAVADOC	 Static helper functions for robustly encoding filenames in zip files. 
abstract	TokenNameabstract	
class	TokenNameclass	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
{	TokenNameLBRACE	
/** * A class, which holds the high characters of a simple encoding * and lazily instantiates a Simple8BitZipEncoding instance in a * thread-safe manner. */	TokenNameCOMMENT_JAVADOC	 A class, which holds the high characters of a simple encoding and lazily instantiates a Simple8BitZipEncoding instance in a thread-safe manner. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highChars	TokenNameIdentifier	 high Chars
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Simple8BitZipEncoding	TokenNameIdentifier	 Simple8 Bit Zip Encoding
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
/** * Instantiate a simple encoding holder. * * @param highChars The characters for byte codes 128 to 255. * * @see Simple8BitZipEncoding#Simple8BitZipEncoding(char[]) */	TokenNameCOMMENT_JAVADOC	 Instantiate a simple encoding holder. * @param highChars The characters for byte codes 128 to 255. * @see Simple8BitZipEncoding#Simple8BitZipEncoding(char[]) 
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highChars	TokenNameIdentifier	 high Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
=	TokenNameEQUAL	
highChars	TokenNameIdentifier	 high Chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The associated {@link Simple8BitZipEncoding}, which * is instantiated if not done so far. */	TokenNameCOMMENT_JAVADOC	 @return The associated {@link Simple8BitZipEncoding}, which is instantiated if not done so far. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Simple8BitZipEncoding	TokenNameIdentifier	 Simple8 Bit Zip Encoding
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
new	TokenNamenew	
Simple8BitZipEncoding	TokenNameIdentifier	 Simple8 Bit Zip Encoding
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
highChars	TokenNameIdentifier	 high Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
simpleEncodings	TokenNameIdentifier	 simple Encodings
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
simpleEncodings	TokenNameIdentifier	 simple Encodings
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cp437_high_chars	TokenNameIdentifier	 cp437 high chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00c7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ea	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00eb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ef	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ee	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ec	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ff	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00dc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20a7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ed	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fa	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00aa	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ba	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2310	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ac	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ab	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2591	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2592	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2593	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2502	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2561	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2562	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2556	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2555	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2563	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2551	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2557	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255d	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255b	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2510	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2514	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2534	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x252c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x251c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x253c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255e	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255a	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2554	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2569	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2566	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2560	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2550	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x256c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2567	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2568	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2564	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2565	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2559	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2558	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2552	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2553	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x256b	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x256a	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2518	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x250c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x258c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2580	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03b1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00df	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0393	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03c0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03a3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03c3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03c4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03a6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0398	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03a9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03b4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221e	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03c6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03b5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2229	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2261	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2265	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2320	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2248	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2219	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221a	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25a0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
cp437	TokenNameIdentifier	 cp437
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
(	TokenNameLPAREN	
cp437_high_chars	TokenNameIdentifier	 cp437 high chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP437"	TokenNameStringLiteral	CP437
,	TokenNameCOMMA	
cp437	TokenNameIdentifier	 cp437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Cp437"	TokenNameStringLiteral	Cp437
,	TokenNameCOMMA	
cp437	TokenNameIdentifier	 cp437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cp437"	TokenNameStringLiteral	cp437
,	TokenNameCOMMA	
cp437	TokenNameIdentifier	 cp437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM437"	TokenNameStringLiteral	IBM437
,	TokenNameCOMMA	
cp437	TokenNameIdentifier	 cp437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ibm437"	TokenNameStringLiteral	ibm437
,	TokenNameCOMMA	
cp437	TokenNameIdentifier	 cp437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cp850_high_chars	TokenNameIdentifier	 cp850 high chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00c7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ea	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00eb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ef	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ee	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ec	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ff	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00dc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0192	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ed	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fa	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00aa	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ba	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ae	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ac	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ab	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00bb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2591	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2592	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2593	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2502	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2524	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2563	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2551	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2557	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255d	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2510	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2514	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2534	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x252c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x251c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x253c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00e3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x255a	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2554	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2569	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2566	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2560	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2550	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x256c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ca	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00cb	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00c8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0131	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00cd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ce	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00cf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2518	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x250c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2588	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2584	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00cc	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2580	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00df	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fe	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00de	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00da	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00db	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00d9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00fd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00dd	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00af	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ad	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2017	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00be	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00f7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00b2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25a0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00a0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
cp850	TokenNameIdentifier	 cp850
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
(	TokenNameLPAREN	
cp850_high_chars	TokenNameIdentifier	 cp850 high chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP850"	TokenNameStringLiteral	CP850
,	TokenNameCOMMA	
cp850	TokenNameIdentifier	 cp850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Cp850"	TokenNameStringLiteral	Cp850
,	TokenNameCOMMA	
cp850	TokenNameIdentifier	 cp850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cp850"	TokenNameStringLiteral	cp850
,	TokenNameCOMMA	
cp850	TokenNameIdentifier	 cp850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM850"	TokenNameStringLiteral	IBM850
,	TokenNameCOMMA	
cp850	TokenNameIdentifier	 cp850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ibm850"	TokenNameStringLiteral	ibm850
,	TokenNameCOMMA	
cp850	TokenNameIdentifier	 cp850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Grow a byte buffer, so it has a minimal capacity or at least * the double capacity of the original buffer * * @param b The original buffer. * @param newCapacity The minimal requested new capacity. * @return A byte buffer <code>r</code> with * <code>r.capacity() = max(b.capacity()*2,newCapacity)</code> and * all the data contained in <code>b</code> copied to the beginning * of <code>r</code>. * */	TokenNameCOMMENT_JAVADOC	 Grow a byte buffer, so it has a minimal capacity or at least the double capacity of the original buffer * @param b The original buffer. @param newCapacity The minimal requested new capacity. @return A byte buffer <code>r</code> with <code>r.capacity() = max(b.capacity()*2,newCapacity)</code> and all the data contained in <code>b</code> copied to the beginning of <code>r</code>. 
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
growBuffer	TokenNameIdentifier	 grow Buffer
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
newCapacity	TokenNameIdentifier	 new Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
on	TokenNameIdentifier	 on
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
<	TokenNameLESS	
newCapacity	TokenNameIdentifier	 new Capacity
?	TokenNameQUESTION	
newCapacity	TokenNameIdentifier	 new Capacity
:	TokenNameCOLON	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
on	TokenNameIdentifier	 on
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
on	TokenNameIdentifier	 on
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The hexadecimal digits <code>0,...,9,A,...,F</code> encoded as * ASCII bytes. */	TokenNameCOMMENT_JAVADOC	 The hexadecimal digits <code>0,...,9,A,...,F</code> encoded as ASCII bytes. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
HEX_DIGITS	TokenNameIdentifier	 HEX  DIGITS
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Append <code>%Uxxxx</code> to the given byte buffer. * The caller must assure, that <code>bb.remaining()&gt;=6</code>. * * @param bb The byte buffer to write to. * @param c The character to write. */	TokenNameCOMMENT_JAVADOC	 Append <code>%Uxxxx</code> to the given byte buffer. The caller must assure, that <code>bb.remaining()&gt;=6</code>. * @param bb The byte buffer to write to. @param c The character to write. 
static	TokenNamestatic	
void	TokenNamevoid	
appendSurrogate	TokenNameIdentifier	 append Surrogate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'U'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEX_DIGITS	TokenNameIdentifier	 HEX  DIGITS
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEX_DIGITS	TokenNameIdentifier	 HEX  DIGITS
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEX_DIGITS	TokenNameIdentifier	 HEX  DIGITS
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEX_DIGITS	TokenNameIdentifier	 HEX  DIGITS
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * name of the encoding UTF-8 */	TokenNameCOMMENT_JAVADOC	 name of the encoding UTF-8 
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTF8	TokenNameIdentifier	 UT F8
=	TokenNameEQUAL	
"UTF8"	TokenNameStringLiteral	UTF8
;	TokenNameSEMICOLON	
/** * variant name of the encoding UTF-8 used for comparisions. */	TokenNameCOMMENT_JAVADOC	 variant name of the encoding UTF-8 used for comparisions. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTF_DASH_8	TokenNameIdentifier	 UTF  DASH 8
=	TokenNameEQUAL	
"utf-8"	TokenNameStringLiteral	utf-8
;	TokenNameSEMICOLON	
/** * name of the encoding UTF-8 */	TokenNameCOMMENT_JAVADOC	 name of the encoding UTF-8 
static	TokenNamestatic	
final	TokenNamefinal	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
=	TokenNameEQUAL	
new	TokenNamenew	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
(	TokenNameLPAREN	
UTF8	TokenNameIdentifier	 UT F8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Instantiates a zip encoding. * * @param name The name of the zip encoding. Specify <code>null</code> for * the platform's default encoding. * @return A zip encoding for the given encoding name. */	TokenNameCOMMENT_JAVADOC	 Instantiates a zip encoding. * @param name The name of the zip encoding. Specify <code>null</code> for the platform's default encoding. @return A zip encoding for the given encoding name. 
static	TokenNamestatic	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fallback encoding is good enough for utf-8. 	TokenNameCOMMENT_LINE	fallback encoding is good enough for utf-8. 
if	TokenNameif	
(	TokenNameLPAREN	
isUTF8	TokenNameIdentifier	 is UT F8
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UTF8_ZIP_ENCODING	TokenNameIdentifier	 UT F8  ZIP  ENCODING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SimpleEncodingHolder	TokenNameIdentifier	 Simple Encoding Holder
)	TokenNameRPAREN	
simpleEncodings	TokenNameIdentifier	 simple Encodings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Charset	TokenNameIdentifier	 Charset
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
Charset	TokenNameIdentifier	 Charset
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
NioZipEncoding	TokenNameIdentifier	 Nio Zip Encoding
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedCharsetException	TokenNameIdentifier	 Unsupported Charset Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FallbackZipEncoding	TokenNameIdentifier	 Fallback Zip Encoding
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Whether a given encoding - or the platform's default encoding * if the parameter is null - is UTF-8. */	TokenNameCOMMENT_JAVADOC	 Whether a given encoding - or the platform's default encoding if the parameter is null - is UTF-8. 
static	TokenNamestatic	
boolean	TokenNameboolean	
isUTF8	TokenNameIdentifier	 is UT F8
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check platform's default encoding 	TokenNameCOMMENT_LINE	check platform's default encoding 
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"file.encoding"	TokenNameStringLiteral	file.encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
UTF8	TokenNameIdentifier	 UT F8
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
||	TokenNameOR_OR	
UTF_DASH_8	TokenNameIdentifier	 UTF  DASH 8
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
