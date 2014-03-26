/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
RandomAccessFile	TokenNameIdentifier	 Random Access File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
ByteOrder	TokenNameIdentifier	 Byte Order
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
AnalyzerProfile	TokenNameIdentifier	 Analyzer Profile
;	TokenNameSEMICOLON	
/** * SmartChineseAnalyzer Bigram dictionary. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 SmartChineseAnalyzer Bigram dictionary. @lucene.experimental 
class	TokenNameclass	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
extends	TokenNameextends	
AbstractDictionary	TokenNameIdentifier	 Abstract Dictionary
{	TokenNameLBRACE	
private	TokenNameprivate	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
WORD_SEGMENT_CHAR	TokenNameIdentifier	 WORD  SEGMENT  CHAR
=	TokenNameEQUAL	
'@'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
singleInstance	TokenNameIdentifier	 single Instance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
=	TokenNameEQUAL	
402137	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * The word associations are stored as FNV1 hashcodes, which have a small probability of collision, but save memory. */	TokenNameCOMMENT_BLOCK	 The word associations are stored as FNV1 hashcodes, which have a small probability of collision, but save memory. 
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
frequencyTable	TokenNameIdentifier	 frequency Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
repeat	TokenNameIdentifier	 repeat
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// static Logger log = Logger.getLogger(BigramDictionary.class); 	TokenNameCOMMENT_LINE	static Logger log = Logger.getLogger(BigramDictionary.class); 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
singleInstance	TokenNameIdentifier	 single Instance
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
singleInstance	TokenNameIdentifier	 single Instance
=	TokenNameEQUAL	
new	TokenNamenew	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
singleInstance	TokenNameIdentifier	 single Instance
.	TokenNameDOT	
load	TokenNameIdentifier	 load
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
String	TokenNameIdentifier	 String
dictRoot	TokenNameIdentifier	 dict Root
=	TokenNameEQUAL	
AnalyzerProfile	TokenNameIdentifier	 Analyzer Profile
.	TokenNameDOT	
ANALYSIS_DATA_DIR	TokenNameIdentifier	 ANALYSIS  DATA  DIR
;	TokenNameSEMICOLON	
singleInstance	TokenNameIdentifier	 single Instance
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
dictRoot	TokenNameIdentifier	 dict Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
singleInstance	TokenNameIdentifier	 single Instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
loadFromObj	TokenNameIdentifier	 load From Obj
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
loadFromInputStream	TokenNameIdentifier	 load From Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
loadFromInputStream	TokenNameIdentifier	 load From Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
serialObjectInputStream	TokenNameIdentifier	 serial Object Input Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
serialObjectInputStream	TokenNameIdentifier	 serial Object Input Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frequencyTable	TokenNameIdentifier	 frequency Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("load bigram dict from serialization."); 	TokenNameCOMMENT_LINE	log.info("load bigram dict from serialization."); 
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
saveToObj	TokenNameIdentifier	 save To Obj
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
frequencyTable	TokenNameIdentifier	 frequency Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("serialize bigram dict."); 	TokenNameCOMMENT_LINE	log.info("serialize bigram dict."); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// log.warn(e.getMessage()); 	TokenNameCOMMENT_LINE	log.warn(e.getMessage()); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"bigramdict.mem"	TokenNameStringLiteral	bigramdict.mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadFromInputStream	TokenNameIdentifier	 load From Input Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dictRoot	TokenNameIdentifier	 dict Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
bigramDictPath	TokenNameIdentifier	 bigram Dict Path
=	TokenNameEQUAL	
dictRoot	TokenNameIdentifier	 dict Root
+	TokenNamePLUS	
"/bigramdict.dct"	TokenNameStringLiteral	/bigramdict.dct
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
serialObj	TokenNameIdentifier	 serial Obj
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dictRoot	TokenNameIdentifier	 dict Root
+	TokenNamePLUS	
"/bigramdict.mem"	TokenNameStringLiteral	/bigramdict.mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
serialObj	TokenNameIdentifier	 serial Obj
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
loadFromObj	TokenNameIdentifier	 load From Obj
(	TokenNameLPAREN	
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frequencyTable	TokenNameIdentifier	 frequency Table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
]	TokenNameRBRACKET	
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
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it is possible for a value to hash to 0, but the probability is extremely low 	TokenNameCOMMENT_LINE	it is possible for a value to hash to 0, but the probability is extremely low 
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
frequencyTable	TokenNameIdentifier	 frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
loadFromFile	TokenNameIdentifier	 load From File
(	TokenNameLPAREN	
bigramDictPath	TokenNameIdentifier	 bigram Dict Path
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
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
saveToObj	TokenNameIdentifier	 save To Obj
(	TokenNameLPAREN	
serialObj	TokenNameIdentifier	 serial Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Load the datafile into this BigramDictionary * * @param dctFilePath path to the Bigramdictionary (bigramdict.dct) * @throws FileNotFoundException * @throws IOException * @throws UnsupportedEncodingException */	TokenNameCOMMENT_JAVADOC	 Load the datafile into this BigramDictionary * @param dctFilePath path to the Bigramdictionary (bigramdict.dct) @throws FileNotFoundException @throws IOException @throws UnsupportedEncodingException 
public	TokenNamepublic	
void	TokenNamevoid	
loadFromFile	TokenNameIdentifier	 load From File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dctFilePath	TokenNameIdentifier	 dct File Path
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
cnt	TokenNameIdentifier	 cnt
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The file only counted 6763 Chinese characters plus 5 reserved slots 3756~3760. 	TokenNameCOMMENT_LINE	The file only counted 6763 Chinese characters plus 5 reserved slots 3756~3760. 
// The 3756th is used (as a header) to store information. 	TokenNameCOMMENT_LINE	The 3756th is used (as a header) to store information. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intBuffer	TokenNameIdentifier	 int Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmpword	TokenNameIdentifier	 tmpword
;	TokenNameSEMICOLON	
RandomAccessFile	TokenNameIdentifier	 Random Access File
dctFile	TokenNameIdentifier	 dct File
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
dctFilePath	TokenNameIdentifier	 dct File Path
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// GB2312 characters 0 - 6768 	TokenNameCOMMENT_LINE	GB2312 characters 0 - 6768 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
GB2312_FIRST_CHAR	TokenNameIdentifier	 G B2312  FIRST  CHAR
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
GB2312_FIRST_CHAR	TokenNameIdentifier	 G B2312  FIRST  CHAR
+	TokenNamePLUS	
CHAR_NUM_IN_FILE	TokenNameIdentifier	 CHAR  NUM  IN  FILE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentStr	TokenNameIdentifier	 current Str
=	TokenNameEQUAL	
getCCByGB2312Id	TokenNameIdentifier	 get CC By G B2312 Id
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if (i == 5231) 	TokenNameCOMMENT_LINE	if (i == 5231) 
// System.out.println(i); 	TokenNameCOMMENT_LINE	System.out.println(i); 
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the dictionary was developed for C, and byte order must be converted to work with Java 	TokenNameCOMMENT_LINE	the dictionary was developed for C, and byte order must be converted to work with Java 
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
(	TokenNameLPAREN	
ByteOrder	TokenNameIdentifier	 Byte Order
.	TokenNameDOT	
LITTLE_ENDIAN	TokenNameIdentifier	 LITTLE  ENDIAN
)	TokenNameRPAREN	
.	TokenNameDOT	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
cnt	TokenNameIdentifier	 cnt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
(	TokenNameLPAREN	
ByteOrder	TokenNameIdentifier	 Byte Order
.	TokenNameDOT	
LITTLE_ENDIAN	TokenNameIdentifier	 LITTLE  ENDIAN
)	TokenNameRPAREN	
.	TokenNameDOT	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// frequency 	TokenNameCOMMENT_LINE	frequency 
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
(	TokenNameLPAREN	
ByteOrder	TokenNameIdentifier	 Byte Order
.	TokenNameDOT	
LITTLE_ENDIAN	TokenNameIdentifier	 LITTLE  ENDIAN
)	TokenNameRPAREN	
.	TokenNameDOT	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// length 	TokenNameCOMMENT_LINE	length 
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
intBuffer	TokenNameIdentifier	 int Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// buffer[2] = ByteBuffer.wrap(intBuffer).order( 	TokenNameCOMMENT_LINE	buffer[2] = ByteBuffer.wrap(intBuffer).order( 
// ByteOrder.LITTLE_ENDIAN).getInt();// handle 	TokenNameCOMMENT_LINE	ByteOrder.LITTLE_ENDIAN).getInt();// handle 
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lchBuffer	TokenNameIdentifier	 lch Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
lchBuffer	TokenNameIdentifier	 lch Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpword	TokenNameIdentifier	 tmpword
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
lchBuffer	TokenNameIdentifier	 lch Buffer
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
3755	TokenNameIntegerLiteral	
+	TokenNamePLUS	
GB2312_FIRST_CHAR	TokenNameIdentifier	 G B2312  FIRST  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpword	TokenNameIdentifier	 tmpword
=	TokenNameEQUAL	
currentStr	TokenNameIdentifier	 current Str
+	TokenNamePLUS	
tmpword	TokenNameIdentifier	 tmpword
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmpword	TokenNameIdentifier	 tmpword
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
hashId	TokenNameIdentifier	 hash Id
=	TokenNameEQUAL	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getAvaliableIndex	TokenNameIdentifier	 get Avaliable Index
(	TokenNameLPAREN	
hashId	TokenNameIdentifier	 hash Id
,	TokenNameCOMMA	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hashId	TokenNameIdentifier	 hash Id
;	TokenNameSEMICOLON	
// bigramStringTable[index] = tmpword; 	TokenNameCOMMENT_LINE	bigramStringTable[index] = tmpword; 
}	TokenNameRBRACE	
frequencyTable	TokenNameIdentifier	 frequency Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("load dictionary done! " + dctFilePath + " total:" + total); 	TokenNameCOMMENT_LINE	log.info("load dictionary done! " + dctFilePath + " total:" + total); 
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getAvaliableIndex	TokenNameIdentifier	 get Avaliable Index
(	TokenNameLPAREN	
long	TokenNamelong	
hashId	TokenNameIdentifier	 hash Id
,	TokenNameCOMMA	
char	TokenNamechar	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hashId	TokenNameIdentifier	 hash Id
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
+	TokenNamePLUS	
hash1	TokenNameIdentifier	 hash1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash2	TokenNameIdentifier	 hash2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
+	TokenNamePLUS	
hash2	TokenNameIdentifier	 hash2
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash1	TokenNameIdentifier	 hash1
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
hashId	TokenNameIdentifier	 hash Id
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
hash2	TokenNameIdentifier	 hash2
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(i - 1); 	TokenNameCOMMENT_LINE	System.out.println(i - 1); 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
hashId	TokenNameIdentifier	 hash Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * lookup the index into the frequency array. */	TokenNameCOMMENT_BLOCK	 lookup the index into the frequency array. 
private	TokenNameprivate	
int	TokenNameint	
getBigramItemIndex	TokenNameIdentifier	 get Bigram Item Index
(	TokenNameLPAREN	
char	TokenNamechar	
carray	TokenNameIdentifier	 carray
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
hashId	TokenNameIdentifier	 hash Id
=	TokenNameEQUAL	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hashId	TokenNameIdentifier	 hash Id
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
+	TokenNamePLUS	
hash1	TokenNameIdentifier	 hash1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash2	TokenNameIdentifier	 hash2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
+	TokenNamePLUS	
hash2	TokenNameIdentifier	 hash2
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash1	TokenNameIdentifier	 hash1
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
repeat	TokenNameIdentifier	 repeat
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
hashId	TokenNameIdentifier	 hash Id
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
hash2	TokenNameIdentifier	 hash2
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
repeat	TokenNameIdentifier	 repeat
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(i - 1); 	TokenNameCOMMENT_LINE	System.out.println(i - 1); 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_BIGRAM_LENGTH	TokenNameIdentifier	 PRIME  BIGRAM  LENGTH
&&	TokenNameAND_AND	
bigramHashTable	TokenNameIdentifier	 bigram Hash Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
hashId	TokenNameIdentifier	 hash Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getBigramItemIndex	TokenNameIdentifier	 get Bigram Item Index
(	TokenNameLPAREN	
carray	TokenNameIdentifier	 carray
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
frequencyTable	TokenNameIdentifier	 frequency Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
