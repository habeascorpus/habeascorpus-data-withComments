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
Utility	TokenNameIdentifier	 Utility
;	TokenNameSEMICOLON	
/** * SmartChineseAnalyzer Word Dictionary * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 SmartChineseAnalyzer Word Dictionary @lucene.experimental 
class	TokenNameclass	
WordDictionary	TokenNameIdentifier	 Word Dictionary
extends	TokenNameextends	
AbstractDictionary	TokenNameIdentifier	 Abstract Dictionary
{	TokenNameLBRACE	
private	TokenNameprivate	
WordDictionary	TokenNameIdentifier	 Word Dictionary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
WordDictionary	TokenNameIdentifier	 Word Dictionary
singleInstance	TokenNameIdentifier	 single Instance
;	TokenNameSEMICOLON	
/** * Large prime number for hash function */	TokenNameCOMMENT_JAVADOC	 Large prime number for hash function 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
=	TokenNameEQUAL	
12071	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * wordIndexTable guarantees to hash all Chinese characters in Unicode into * PRIME_INDEX_LENGTH array. There will be conflict, but in reality this * program only handles the 6768 characters found in GB2312 plus some * ASCII characters. Therefore in order to guarantee better precision, it is * necessary to retain the original symbol in the charIndexTable. */	TokenNameCOMMENT_JAVADOC	 wordIndexTable guarantees to hash all Chinese characters in Unicode into PRIME_INDEX_LENGTH array. There will be conflict, but in reality this program only handles the 6768 characters found in GB2312 plus some ASCII characters. Therefore in order to guarantee better precision, it is necessary to retain the original symbol in the charIndexTable. 
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordIndexTable	TokenNameIdentifier	 word Index Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charIndexTable	TokenNameIdentifier	 char Index Table
;	TokenNameSEMICOLON	
/** * To avoid taking too much space, the data structure needed to store the * lexicon requires two multidimensional arrays to store word and frequency. * Each word is placed in a char[]. Each char represents a Chinese char or * other symbol. Each frequency is put into an int. These two arrays * correspond to each other one-to-one. Therefore, one can use * wordItem_charArrayTable[i][j] to look up word from lexicon, and * wordItem_frequencyTable[i][j] to look up the corresponding frequency. */	TokenNameCOMMENT_JAVADOC	 To avoid taking too much space, the data structure needed to store the lexicon requires two multidimensional arrays to store word and frequency. Each word is placed in a char[]. Each char represents a Chinese char or other symbol. Each frequency is put into an int. These two arrays correspond to each other one-to-one. Therefore, one can use wordItem_charArrayTable[i][j] to look up word from lexicon, and wordItem_frequencyTable[i][j] to look up the corresponding frequency. 
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
;	TokenNameSEMICOLON	
// static Logger log = Logger.getLogger(WordDictionary.class); 	TokenNameCOMMENT_LINE	static Logger log = Logger.getLogger(WordDictionary.class); 
/** * Get the singleton dictionary instance. * @return singleton */	TokenNameCOMMENT_JAVADOC	 Get the singleton dictionary instance. @return singleton 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
WordDictionary	TokenNameIdentifier	 Word Dictionary
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
WordDictionary	TokenNameIdentifier	 Word Dictionary
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
wordDictRoot	TokenNameIdentifier	 word Dict Root
=	TokenNameEQUAL	
AnalyzerProfile	TokenNameIdentifier	 Analyzer Profile
.	TokenNameDOT	
ANALYSIS_DATA_DIR	TokenNameIdentifier	 ANALYSIS  DATA  DIR
;	TokenNameSEMICOLON	
singleInstance	TokenNameIdentifier	 single Instance
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
wordDictRoot	TokenNameIdentifier	 word Dict Root
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
/** * Attempt to load dictionary from provided directory, first trying coredict.mem, failing back on coredict.dct * * @param dctFileRoot path to dictionary directory */	TokenNameCOMMENT_JAVADOC	 Attempt to load dictionary from provided directory, first trying coredict.mem, failing back on coredict.dct * @param dctFileRoot path to dictionary directory 
public	TokenNamepublic	
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dctFileRoot	TokenNameIdentifier	 dct File Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dctFilePath	TokenNameIdentifier	 dct File Path
=	TokenNameEQUAL	
dctFileRoot	TokenNameIdentifier	 dct File Root
+	TokenNamePLUS	
"/coredict.dct"	TokenNameStringLiteral	/coredict.dct
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
serialObj	TokenNameIdentifier	 serial Obj
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dctFileRoot	TokenNameIdentifier	 dct File Root
+	TokenNamePLUS	
"/coredict.mem"	TokenNameStringLiteral	/coredict.mem
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
wordIndexTable	TokenNameIdentifier	 word Index Table
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charIndexTable	TokenNameIdentifier	 char Index Table
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
GB2312_CHAR_NUM	TokenNameIdentifier	 G B2312  CHAR  NUM
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
GB2312_CHAR_NUM	TokenNameIdentifier	 G B2312  CHAR  NUM
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// int total = 	TokenNameCOMMENT_LINE	int total = 
loadMainDataFromFile	TokenNameIdentifier	 load Main Data From File
(	TokenNameLPAREN	
dctFilePath	TokenNameIdentifier	 dct File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandDelimiterData	TokenNameIdentifier	 expand Delimiter Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeSameWords	TokenNameIdentifier	 merge Same Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortEachItems	TokenNameIdentifier	 sort Each Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("load dictionary: " + dctFilePath + " total:" + total); 	TokenNameCOMMENT_LINE	log.info("load dictionary: " + dctFilePath + " total:" + total); 
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
/** * Load coredict.mem internally from the jar file. * * @throws ClassNotFoundException * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Load coredict.mem internally from the jar file. * @throws ClassNotFoundException @throws IOException 
public	TokenNamepublic	
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
"coredict.mem"	TokenNameStringLiteral	coredict.mem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadFromObjectInputStream	TokenNameIdentifier	 load From Object Input Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
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
loadFromObjectInputStream	TokenNameIdentifier	 load From Object Input Stream
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
loadFromObjectInputStream	TokenNameIdentifier	 load From Object Input Stream
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
wordIndexTable	TokenNameIdentifier	 word Index Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charIndexTable	TokenNameIdentifier	 char Index Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("load core dict from serialization."); 	TokenNameCOMMENT_LINE	log.info("load core dict from serialization."); 
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
wordIndexTable	TokenNameIdentifier	 word Index Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
charIndexTable	TokenNameIdentifier	 char Index Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("serialize core dict."); 	TokenNameCOMMENT_LINE	log.info("serialize core dict."); 
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
/** * Load the datafile into this WordDictionary * * @param dctFilePath path to word dictionary (coredict.dct) * @return number of words read * @throws FileNotFoundException * @throws IOException * @throws UnsupportedEncodingException */	TokenNameCOMMENT_JAVADOC	 Load the datafile into this WordDictionary * @param dctFilePath path to word dictionary (coredict.dct) @return number of words read @throws FileNotFoundException @throws IOException @throws UnsupportedEncodingException 
private	TokenNameprivate	
int	TokenNameint	
loadMainDataFromFile	TokenNameIdentifier	 load Main Data From File
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
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
cnt	TokenNameIdentifier	 cnt
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
cnt	TokenNameIdentifier	 cnt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
// wordItemTable[i][j] = new WordItem(); 	TokenNameCOMMENT_LINE	wordItemTable[i][j] = new WordItem(); 
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
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
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
// handle 	TokenNameCOMMENT_LINE	handle 
// wordItemTable[i][j].frequency = buffer[0]; 	TokenNameCOMMENT_LINE	wordItemTable[i][j].frequency = buffer[0]; 
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
// indexTable[i].wordItems[j].word = tmpword; 	TokenNameCOMMENT_LINE	indexTable[i].wordItems[j].word = tmpword; 
// wordItemTable[i][j].charArray = tmpword.toCharArray(); 	TokenNameCOMMENT_LINE	wordItemTable[i][j].charArray = tmpword.toCharArray(); 
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmpword	TokenNameIdentifier	 tmpword
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// wordItemTable[i][j].charArray = null; 	TokenNameCOMMENT_LINE	wordItemTable[i][j].charArray = null; 
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(indexTable[i].wordItems[j]); 	TokenNameCOMMENT_LINE	System.out.println(indexTable[i].wordItems[j]); 
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getCCByGB2312Id	TokenNameIdentifier	 get CC By G B2312 Id
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTableIndex	TokenNameIdentifier	 set Table Index
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dctFile	TokenNameIdentifier	 dct File
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The original lexicon puts all information with punctuation into a * chart (from 1 to 3755). Here it then gets expanded, separately being * placed into the chart that has the corresponding symbol. */	TokenNameCOMMENT_JAVADOC	 The original lexicon puts all information with punctuation into a chart (from 1 to 3755). Here it then gets expanded, separately being placed into the chart that has the corresponding symbol. 
private	TokenNameprivate	
void	TokenNamevoid	
expandDelimiterData	TokenNameIdentifier	 expand Delimiter Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
// Punctuation then treating index 3755 as 1, 	TokenNameCOMMENT_LINE	Punctuation then treating index 3755 as 1, 
// distribute the original punctuation corresponding dictionary into 	TokenNameCOMMENT_LINE	distribute the original punctuation corresponding dictionary into 
int	TokenNameint	
delimiterIndex	TokenNameIdentifier	 delimiter Index
=	TokenNameEQUAL	
3755	TokenNameIntegerLiteral	
+	TokenNamePLUS	
GB2312_FIRST_CHAR	TokenNameIdentifier	 G B2312  FIRST  CHAR
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
getGB2312Id	TokenNameIdentifier	 get G B2312 Id
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the id value of the punctuation 	TokenNameCOMMENT_LINE	the id value of the punctuation 
if	TokenNameif	
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Starting from i, count the number of the following worditem symbol from j 	TokenNameCOMMENT_LINE	Starting from i, count the number of the following worditem symbol from j 
while	TokenNamewhile	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// c is the punctuation character, j is the id value of c 	TokenNameCOMMENT_LINE	c is the punctuation character, j is the id value of c 
// k-1 represents the index of the last punctuation character 	TokenNameCOMMENT_LINE	k-1 represents the index of the last punctuation character 
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
cnt	TokenNameIdentifier	 cnt
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
cnt	TokenNameIdentifier	 cnt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Assign value for each wordItem. 	TokenNameCOMMENT_LINE	Assign value for each wordItem. 
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wordItemTable[j][k] = new WordItem(); 	TokenNameCOMMENT_LINE	wordItemTable[j][k] = new WordItem(); 
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setTableIndex	TokenNameIdentifier	 set Table Index
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Delete the original corresponding symbol array. 	TokenNameCOMMENT_LINE	Delete the original corresponding symbol array. 
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
delimiterIndex	TokenNameIdentifier	 delimiter Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * since we aren't doing POS-tagging, merge the frequencies for entries of the same word (with different POS) */	TokenNameCOMMENT_BLOCK	 since we aren't doing POS-tagging, merge the frequencies for entries of the same word (with different POS) 
private	TokenNameprivate	
void	TokenNamevoid	
mergeSameWords	TokenNameIdentifier	 merge Same Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArray	TokenNameIdentifier	 compare Array
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempArray	TokenNameIdentifier	 temp Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempFreq	TokenNameIdentifier	 temp Freq
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempArray	TokenNameIdentifier	 temp Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tempFreq	TokenNameIdentifier	 temp Freq
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArray	TokenNameIdentifier	 compare Array
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tempArray	TokenNameIdentifier	 temp Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// temp[k] = wordItemTable[i][j]; 	TokenNameCOMMENT_LINE	temp[k] = wordItemTable[i][j]; 
tempArray	TokenNameIdentifier	 temp Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tempFreq	TokenNameIdentifier	 temp Freq
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// temp[k].frequency += wordItemTable[i][j].frequency; 	TokenNameCOMMENT_LINE	temp[k].frequency += wordItemTable[i][j].frequency; 
tempFreq	TokenNameIdentifier	 temp Freq
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// wordItemTable[i] = temp; 	TokenNameCOMMENT_LINE	wordItemTable[i] = temp; 
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tempArray	TokenNameIdentifier	 temp Array
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tempFreq	TokenNameIdentifier	 temp Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sortEachItems	TokenNameIdentifier	 sort Each Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmpArray	TokenNameIdentifier	 tmp Array
;	TokenNameSEMICOLON	
int	TokenNameint	
tmpFreq	TokenNameIdentifier	 tmp Freq
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
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j2	TokenNameIdentifier	 j2
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
<	TokenNameLESS	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArray	TokenNameIdentifier	 compare Array
(	TokenNameLPAREN	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpArray	TokenNameIdentifier	 tmp Array
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tmpFreq	TokenNameIdentifier	 tmp Freq
=	TokenNameEQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmpArray	TokenNameIdentifier	 tmp Array
;	TokenNameSEMICOLON	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j2	TokenNameIdentifier	 j2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmpFreq	TokenNameIdentifier	 tmp Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Calculate character c's position in hash table, * then initialize the value of that position in the address table. */	TokenNameCOMMENT_BLOCK	 Calculate character c's position in hash table, then initialize the value of that position in the address table. 
private	TokenNameprivate	
boolean	TokenNameboolean	
setTableIndex	TokenNameIdentifier	 set Table Index
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getAvaliableTableIndex	TokenNameIdentifier	 get Avaliable Table Index
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
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
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
getAvaliableTableIndex	TokenNameIdentifier	 get Avaliable Table Index
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
getWordItemTableIndex	TokenNameIdentifier	 get Word Item Table Index
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash2	TokenNameIdentifier	 hash2
=	TokenNameEQUAL	
hash2	TokenNameIdentifier	 hash2
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash1	TokenNameIdentifier	 hash1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
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
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PRIME_INDEX_LENGTH	TokenNameIdentifier	 PRIME  INDEX  LENGTH
&&	TokenNameAND_AND	
charIndexTable	TokenNameIdentifier	 char Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the text string corresponding with the word char array, * and return the position of the word list. * * @param knownHashIndex already figure out position of the first word * symbol charArray[0] in hash table. If not calculated yet, can be * replaced with function int findInTable(char[] charArray). * @param charArray look up the char array corresponding with the word. * @return word location in word array. If not found, then return -1. */	TokenNameCOMMENT_JAVADOC	 Look up the text string corresponding with the word char array, and return the position of the word list. * @param knownHashIndex already figure out position of the first word symbol charArray[0] in hash table. If not calculated yet, can be replaced with function int findInTable(char[] charArray). @param charArray look up the char array corresponding with the word. @return word location in word array. If not found, then return -1. 
private	TokenNameprivate	
int	TokenNameint	
findInTable	TokenNameIdentifier	 find In Table
(	TokenNameLPAREN	
short	TokenNameshort	
knownHashIndex	TokenNameIdentifier	 known Hash Index
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
knownHashIndex	TokenNameIdentifier	 known Hash Index
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmpResult	TokenNameIdentifier	 cmp Result
;	TokenNameSEMICOLON	
// Binary search for the index of idArray 	TokenNameCOMMENT_LINE	Binary search for the index of idArray 
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmpResult	TokenNameIdentifier	 cmp Result
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArray	TokenNameIdentifier	 compare Array
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmpResult	TokenNameIdentifier	 cmp Result
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
// find it 	TokenNameCOMMENT_LINE	find it 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmpResult	TokenNameIdentifier	 cmp Result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmpResult	TokenNameIdentifier	 cmp Result
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the first word in the dictionary that starts with the supplied prefix * * @see #getPrefixMatch(char[], int) * @param charArray input prefix * @return index of word, or -1 if not found */	TokenNameCOMMENT_JAVADOC	 Find the first word in the dictionary that starts with the supplied prefix * @see #getPrefixMatch(char[], int) @param charArray input prefix @return index of word, or -1 if not found 
public	TokenNamepublic	
int	TokenNameint	
getPrefixMatch	TokenNameIdentifier	 get Prefix Match
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPrefixMatch	TokenNameIdentifier	 get Prefix Match
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the nth word in the dictionary that starts with the supplied prefix * * @see #getPrefixMatch(char[]) * @param charArray input prefix * @param knownStart relative position in the dictionary to start * @return index of word, or -1 if not found */	TokenNameCOMMENT_JAVADOC	 Find the nth word in the dictionary that starts with the supplied prefix * @see #getPrefixMatch(char[]) @param charArray input prefix @param knownStart relative position in the dictionary to start @return index of word, or -1 if not found 
public	TokenNamepublic	
int	TokenNameint	
getPrefixMatch	TokenNameIdentifier	 get Prefix Match
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
int	TokenNameint	
knownStart	TokenNameIdentifier	 known Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getWordItemTableIndex	TokenNameIdentifier	 get Word Item Table Index
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
knownStart	TokenNameIdentifier	 known Start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmpResult	TokenNameIdentifier	 cmp Result
;	TokenNameSEMICOLON	
// Binary search for the index of idArray 	TokenNameCOMMENT_LINE	Binary search for the index of idArray 
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmpResult	TokenNameIdentifier	 cmp Result
=	TokenNameEQUAL	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArrayByPrefix	TokenNameIdentifier	 compare Array By Prefix
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmpResult	TokenNameIdentifier	 cmp Result
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the first item which match the current word 	TokenNameCOMMENT_LINE	Get the first item which match the current word 
while	TokenNamewhile	
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArrayByPrefix	TokenNameIdentifier	 compare Array By Prefix
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
items	TokenNameIdentifier	 items
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
mid	TokenNameIdentifier	 mid
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
mid	TokenNameIdentifier	 mid
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
// Find the first word that uses charArray as prefix. 	TokenNameCOMMENT_LINE	Find the first word that uses charArray as prefix. 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmpResult	TokenNameIdentifier	 cmp Result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the frequency of a word from the dictionary * * @param charArray input word * @return word frequency, or zero if the word is not found */	TokenNameCOMMENT_JAVADOC	 Get the frequency of a word from the dictionary * @param charArray input word @return word frequency, or zero if the word is not found 
public	TokenNamepublic	
int	TokenNameint	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
hashIndex	TokenNameIdentifier	 hash Index
=	TokenNameEQUAL	
getWordItemTableIndex	TokenNameIdentifier	 get Word Item Table Index
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashIndex	TokenNameIdentifier	 hash Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
itemIndex	TokenNameIdentifier	 item Index
=	TokenNameEQUAL	
findInTable	TokenNameIdentifier	 find In Table
(	TokenNameLPAREN	
hashIndex	TokenNameIdentifier	 hash Index
,	TokenNameCOMMA	
charArray	TokenNameIdentifier	 char Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
itemIndex	TokenNameIdentifier	 item Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
wordItem_frequencyTable	TokenNameIdentifier	 word Item frequency Table
[	TokenNameLBRACKET	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
hashIndex	TokenNameIdentifier	 hash Index
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
itemIndex	TokenNameIdentifier	 item Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the dictionary entry at itemIndex for table charArray[0] is charArray * * @param charArray input word * @param itemIndex item index for table charArray[0] * @return true if the entry exists */	TokenNameCOMMENT_JAVADOC	 Return true if the dictionary entry at itemIndex for table charArray[0] is charArray * @param charArray input word @param itemIndex item index for table charArray[0] @return true if the entry exists 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
int	TokenNameint	
itemIndex	TokenNameIdentifier	 item Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
hashIndex	TokenNameIdentifier	 hash Index
=	TokenNameEQUAL	
getWordItemTableIndex	TokenNameIdentifier	 get Word Item Table Index
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
compareArray	TokenNameIdentifier	 compare Array
(	TokenNameLPAREN	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordItem_charArrayTable	TokenNameIdentifier	 word Item char Array Table
[	TokenNameLBRACKET	
wordIndexTable	TokenNameIdentifier	 word Index Table
[	TokenNameLBRACKET	
hashIndex	TokenNameIdentifier	 hash Index
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
itemIndex	TokenNameIdentifier	 item Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
