package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
hunspell	TokenNameIdentifier	 hunspell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
CharArrayMap	TokenNameIdentifier	 Char Array Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * In-memory structure for the dictionary (.dic) and affix (.aff) * data of a hunspell dictionary. */	TokenNameCOMMENT_JAVADOC	 In-memory structure for the dictionary (.dic) and affix (.aff) data of a hunspell dictionary. 
public	TokenNamepublic	
class	TokenNameclass	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
HunspellWord	TokenNameIdentifier	 Hunspell Word
NOFLAGS	TokenNameIdentifier	 NOFLAGS
=	TokenNameEQUAL	
new	TokenNamenew	
HunspellWord	TokenNameIdentifier	 Hunspell Word
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALIAS_KEY	TokenNameIdentifier	 ALIAS  KEY
=	TokenNameEQUAL	
"AF"	TokenNameStringLiteral	AF
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_KEY	TokenNameIdentifier	 PREFIX  KEY
=	TokenNameEQUAL	
"PFX"	TokenNameStringLiteral	PFX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUFFIX_KEY	TokenNameIdentifier	 SUFFIX  KEY
=	TokenNameEQUAL	
"SFX"	TokenNameStringLiteral	SFX
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLAG_KEY	TokenNameIdentifier	 FLAG  KEY
=	TokenNameEQUAL	
"FLAG"	TokenNameStringLiteral	FLAG
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NUM_FLAG_TYPE	TokenNameIdentifier	 NUM  FLAG  TYPE
=	TokenNameEQUAL	
"num"	TokenNameStringLiteral	num
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTF8_FLAG_TYPE	TokenNameIdentifier	 UT F8  FLAG  TYPE
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_FLAG_TYPE	TokenNameIdentifier	 LONG  FLAG  TYPE
=	TokenNameEQUAL	
"long"	TokenNameStringLiteral	long
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_CONDITION_REGEX_PATTERN	TokenNameIdentifier	 PREFIX  CONDITION  REGEX  PATTERN
=	TokenNameEQUAL	
"%s.*"	TokenNameStringLiteral	%s.*
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUFFIX_CONDITION_REGEX_PATTERN	TokenNameIdentifier	 SUFFIX  CONDITION  REGEX  PATTERN
=	TokenNameEQUAL	
".*%s"	TokenNameStringLiteral	.*%s
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IGNORE_CASE_DEFAULT	TokenNameIdentifier	 IGNORE  CASE  DEFAULT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>>	TokenNameRIGHT_SHIFT	
words	TokenNameIdentifier	 words
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>>	TokenNameRIGHT_SHIFT	
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>>	TokenNameRIGHT_SHIFT	
suffixes	TokenNameIdentifier	 suffixes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
flagParsingStrategy	TokenNameIdentifier	 flag Parsing Strategy
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFlagParsingStrategy	TokenNameIdentifier	 Simple Flag Parsing Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Default flag parsing strategy 	TokenNameCOMMENT_LINE	Default flag parsing strategy 
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
IGNORE_CASE_DEFAULT	TokenNameIdentifier	 IGNORE  CASE  DEFAULT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aliases	TokenNameIdentifier	 aliases
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
aliasCount	TokenNameIdentifier	 alias Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix * and dictionary files. * You have to close the provided InputStreams yourself. * * @param affix InputStream for reading the hunspell affix file (won't be closed). * @param dictionary InputStream for reading the hunspell dictionary file (won't be closed). * @param version Lucene Version * @throws IOException Can be thrown while reading from the InputStreams * @throws ParseException Can be thrown if the content of the files does not meet expected formats */	TokenNameCOMMENT_JAVADOC	 Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix and dictionary files. You have to close the provided InputStreams yourself. * @param affix InputStream for reading the hunspell affix file (won't be closed). @param dictionary InputStream for reading the hunspell dictionary file (won't be closed). @param version Lucene Version @throws IOException Can be thrown while reading from the InputStreams @throws ParseException Can be thrown if the content of the files does not meet expected formats 
public	TokenNamepublic	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
IGNORE_CASE_DEFAULT	TokenNameIdentifier	 IGNORE  CASE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix * and dictionary files. * You have to close the provided InputStreams yourself. * * @param affix InputStream for reading the hunspell affix file (won't be closed). * @param dictionary InputStream for reading the hunspell dictionary file (won't be closed). * @param version Lucene Version * @param ignoreCase If true, dictionary matching will be case insensitive * @throws IOException Can be thrown while reading from the InputStreams * @throws ParseException Can be thrown if the content of the files does not meet expected formats */	TokenNameCOMMENT_JAVADOC	 Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix and dictionary files. You have to close the provided InputStreams yourself. * @param affix InputStream for reading the hunspell affix file (won't be closed). @param dictionary InputStream for reading the hunspell dictionary file (won't be closed). @param version Lucene Version @param ignoreCase If true, dictionary matching will be case insensitive @throws IOException Can be thrown while reading from the InputStreams @throws ParseException Can be thrown if the content of the files does not meet expected formats 
public	TokenNamepublic	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix * and dictionary files. * You have to close the provided InputStreams yourself. * * @param affix InputStream for reading the hunspell affix file (won't be closed). * @param dictionaries InputStreams for reading the hunspell dictionary file (won't be closed). * @param version Lucene Version * @param ignoreCase If true, dictionary matching will be case insensitive * @throws IOException Can be thrown while reading from the InputStreams * @throws ParseException Can be thrown if the content of the files does not meet expected formats */	TokenNameCOMMENT_JAVADOC	 Creates a new HunspellDictionary containing the information read from the provided InputStreams to hunspell affix and dictionary files. You have to close the provided InputStreams yourself. * @param affix InputStream for reading the hunspell affix file (won't be closed). @param dictionaries InputStreams for reading the hunspell dictionary file (won't be closed). @param version Lucene Version @param ignoreCase If true, dictionary matching will be case insensitive @throws IOException Can be thrown while reading from the InputStreams @throws ParseException Can be thrown if the content of the files does not meet expected formats 
public	TokenNamepublic	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InputStream	TokenNameIdentifier	 Input Stream
>	TokenNameGREATER	
dictionaries	TokenNameIdentifier	 dictionaries
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getDictionaryEncoding	TokenNameIdentifier	 get Dictionary Encoding
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
getJavaEncoding	TokenNameIdentifier	 get Java Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readAffixFile	TokenNameIdentifier	 read Affix File
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
65535	TokenNameIntegerLiteral	
/* guess */	TokenNameCOMMENT_BLOCK	 guess 
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
dictionary	TokenNameIdentifier	 dictionary
:	TokenNameCOLON	
dictionaries	TokenNameIdentifier	 dictionaries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readDictionaryFile	TokenNameIdentifier	 read Dictionary File
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Looks up HunspellWords that match the String created from the given char array, offset and length * * @param word Char array to generate the String from * @param offset Offset in the char array that the String starts at * @param length Length from the offset that the String is * @return List of HunspellWords that match the generated String, or {@code null} if none are found */	TokenNameCOMMENT_JAVADOC	 Looks up HunspellWords that match the String created from the given char array, offset and length * @param word Char array to generate the String from @param offset Offset in the char array that the String starts at @param length Length from the offset that the String is @return List of HunspellWords that match the generated String, or {@code null} if none are found 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>	TokenNameGREATER	
lookupWord	TokenNameIdentifier	 lookup Word
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks up HunspellAffix prefixes that have an append that matches the String created from the given char array, offset and length * * @param word Char array to generate the String from * @param offset Offset in the char array that the String starts at * @param length Length from the offset that the String is * @return List of HunspellAffix prefixes with an append that matches the String, or {@code null} if none are found */	TokenNameCOMMENT_JAVADOC	 Looks up HunspellAffix prefixes that have an append that matches the String created from the given char array, offset and length * @param word Char array to generate the String from @param offset Offset in the char array that the String starts at @param length Length from the offset that the String is @return List of HunspellAffix prefixes with an append that matches the String, or {@code null} if none are found 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks up HunspellAffix suffixes that have an append that matches the String created from the given char array, offset and length * * @param word Char array to generate the String from * @param offset Offset in the char array that the String starts at * @param length Length from the offset that the String is * @return List of HunspellAffix suffixes with an append that matches the String, or {@code null} if none are found */	TokenNameCOMMENT_JAVADOC	 Looks up HunspellAffix suffixes that have an append that matches the String created from the given char array, offset and length * @param word Char array to generate the String from @param offset Offset in the char array that the String starts at @param length Length from the offset that the String is @return List of HunspellAffix suffixes with an append that matches the String, or {@code null} if none are found 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
lookupSuffix	TokenNameIdentifier	 lookup Suffix
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suffixes	TokenNameIdentifier	 suffixes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the affix file through the provided InputStream, building up the prefix and suffix maps * * @param affixStream InputStream to read the content of the affix file from * @param decoder CharsetDecoder to decode the content of the file * @throws IOException Can be thrown while reading from the InputStream */	TokenNameCOMMENT_JAVADOC	 Reads the affix file through the provided InputStream, building up the prefix and suffix maps * @param affixStream InputStream to read the content of the affix file from @param decoder CharsetDecoder to decode the content of the file @throws IOException Can be thrown while reading from the InputStream 
private	TokenNameprivate	
void	TokenNamevoid	
readAffixFile	TokenNameIdentifier	 read Affix File
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
affixStream	TokenNameIdentifier	 affix Stream
,	TokenNameCOMMA	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suffixes	TokenNameIdentifier	 suffixes
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
affixStream	TokenNameIdentifier	 affix Stream
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ALIAS_KEY	TokenNameIdentifier	 ALIAS  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseAlias	TokenNameIdentifier	 parse Alias
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PREFIX_KEY	TokenNameIdentifier	 PREFIX  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseAffix	TokenNameIdentifier	 parse Affix
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
PREFIX_CONDITION_REGEX_PATTERN	TokenNameIdentifier	 PREFIX  CONDITION  REGEX  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
SUFFIX_KEY	TokenNameIdentifier	 SUFFIX  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseAffix	TokenNameIdentifier	 parse Affix
(	TokenNameLPAREN	
suffixes	TokenNameIdentifier	 suffixes
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
SUFFIX_CONDITION_REGEX_PATTERN	TokenNameIdentifier	 SUFFIX  CONDITION  REGEX  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
FLAG_KEY	TokenNameIdentifier	 FLAG  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that the FLAG line comes before any prefix or suffixes 	TokenNameCOMMENT_LINE	Assume that the FLAG line comes before any prefix or suffixes 
// Store the strategy so it can be used when parsing the dic file 	TokenNameCOMMENT_LINE	Store the strategy so it can be used when parsing the dic file 
flagParsingStrategy	TokenNameIdentifier	 flag Parsing Strategy
=	TokenNameEQUAL	
getFlagParsingStrategy	TokenNameIdentifier	 get Flag Parsing Strategy
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a specific affix rule putting the result into the provided affix map * * @param affixes Map where the result of the parsing will be put * @param header Header line of the affix rule * @param reader BufferedReader to read the content of the rule from * @param conditionPattern {@link String#format(String, Object...)} pattern to be used to generate the condition regex * pattern * @throws IOException Can be thrown while reading the rule */	TokenNameCOMMENT_JAVADOC	 Parses a specific affix rule putting the result into the provided affix map * @param affixes Map where the result of the parsing will be put @param header Header line of the affix rule @param reader BufferedReader to read the content of the rule from @param conditionPattern {@link String#format(String, Object...)} pattern to be used to generate the condition regex pattern @throws IOException Can be thrown while reading the rule 
private	TokenNameprivate	
void	TokenNamevoid	
parseAffix	TokenNameIdentifier	 parse Affix
(	TokenNameLPAREN	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>>	TokenNameRIGHT_SHIFT	
affixes	TokenNameIdentifier	 affixes
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
conditionPattern	TokenNameIdentifier	 condition Pattern
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
crossProduct	TokenNameIdentifier	 cross Product
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numLines	TokenNameIdentifier	 num Lines
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
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
numLines	TokenNameIdentifier	 num Lines
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
affix	TokenNameIdentifier	 affix
=	TokenNameEQUAL	
new	TokenNamenew	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setFlag	TokenNameIdentifier	 set Flag
(	TokenNameLPAREN	
flagParsingStrategy	TokenNameIdentifier	 flag Parsing Strategy
.	TokenNameDOT	
parseFlag	TokenNameIdentifier	 parse Flag
(	TokenNameLPAREN	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setStrip	TokenNameIdentifier	 set Strip
(	TokenNameLPAREN	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
affixArg	TokenNameIdentifier	 affix Arg
=	TokenNameEQUAL	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
flagSep	TokenNameIdentifier	 flag Sep
=	TokenNameEQUAL	
affixArg	TokenNameIdentifier	 affix Arg
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flagSep	TokenNameIdentifier	 flag Sep
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
flagPart	TokenNameIdentifier	 flag Part
=	TokenNameEQUAL	
affixArg	TokenNameIdentifier	 affix Arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
flagSep	TokenNameIdentifier	 flag Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aliasCount	TokenNameIdentifier	 alias Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flagPart	TokenNameIdentifier	 flag Part
=	TokenNameEQUAL	
getAliasValue	TokenNameIdentifier	 get Alias Value
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
flagPart	TokenNameIdentifier	 flag Part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
appendFlags	TokenNameIdentifier	 append Flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
flagParsingStrategy	TokenNameIdentifier	 flag Parsing Strategy
.	TokenNameDOT	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
flagPart	TokenNameIdentifier	 flag Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
appendFlags	TokenNameIdentifier	 append Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setAppendFlags	TokenNameIdentifier	 set Append Flags
(	TokenNameLPAREN	
appendFlags	TokenNameIdentifier	 append Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
affixArg	TokenNameIdentifier	 affix Arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flagSep	TokenNameIdentifier	 flag Sep
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
affixArg	TokenNameIdentifier	 affix Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setCondition	TokenNameIdentifier	 set Condition
(	TokenNameLPAREN	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
conditionPattern	TokenNameIdentifier	 condition Pattern
,	TokenNameCOMMA	
condition	TokenNameIdentifier	 condition
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
setCrossProduct	TokenNameIdentifier	 set Cross Product
(	TokenNameLPAREN	
crossProduct	TokenNameIdentifier	 cross Product
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
affixes	TokenNameIdentifier	 affixes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affixes	TokenNameIdentifier	 affixes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses the encoding specificed in the affix file readable through the provided InputStream * * @param affix InputStream for reading the affix file * @return Encoding specified in the affix file * @throws IOException Can be thrown while reading from the InputStream * @throws ParseException Thrown if the first non-empty non-comment line read from the file does not adhere to the format {@code SET <encoding>} */	TokenNameCOMMENT_JAVADOC	 Parses the encoding specificed in the affix file readable through the provided InputStream * @param affix InputStream for reading the affix file @return Encoding specified in the affix file @throws IOException Can be thrown while reading from the InputStream @throws ParseException Thrown if the first non-empty non-comment line read from the file does not adhere to the format {@code SET <encoding>} 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getDictionaryEncoding	TokenNameIdentifier	 get Dictionary Encoding
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
affix	TokenNameIdentifier	 affix
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
// this test only at the end as ineffective but would allow lines only containing spaces: 	TokenNameCOMMENT_LINE	this test only at the end as ineffective but would allow lines only containing spaces: 
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"Unexpected end of affix file."	TokenNameStringLiteral	Unexpected end of affix file.
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"SET "	TokenNameStringLiteral	SET 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cleanup the encoding string, too (whitespace) 	TokenNameCOMMENT_LINE	cleanup the encoding string, too (whitespace) 
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"The first non-comment line in the affix file must "	TokenNameStringLiteral	The first non-comment line in the affix file must 
+	TokenNamePLUS	
"be a 'SET charset', was: '"	TokenNameStringLiteral	be a 'SET charset', was: '
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Retrieves the CharsetDecoder for the given encoding. Note, This isn't perfect as I think ISCII-DEVANAGARI and * MICROSOFT-CP1251 etc are allowed... * * @param encoding Encoding to retrieve the CharsetDecoder for * @return CharSetDecoder for the given encoding */	TokenNameCOMMENT_JAVADOC	 Retrieves the CharsetDecoder for the given encoding. Note, This isn't perfect as I think ISCII-DEVANAGARI and MICROSOFT-CP1251 etc are allowed... * @param encoding Encoding to retrieve the CharsetDecoder for @return CharSetDecoder for the given encoding 
private	TokenNameprivate	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
getJavaEncoding	TokenNameIdentifier	 get Java Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Charset	TokenNameIdentifier	 Charset
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
Charset	TokenNameIdentifier	 Charset
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
newDecoder	TokenNameIdentifier	 new Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the appropriate {@link FlagParsingStrategy} based on the FLAG definiton line taken from the affix file * * @param flagLine Line containing the flag information * @return FlagParsingStrategy that handles parsing flags in the way specified in the FLAG definiton */	TokenNameCOMMENT_JAVADOC	 Determines the appropriate {@link FlagParsingStrategy} based on the FLAG definiton line taken from the affix file * @param flagLine Line containing the flag information @return FlagParsingStrategy that handles parsing flags in the way specified in the FLAG definiton 
private	TokenNameprivate	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
getFlagParsingStrategy	TokenNameIdentifier	 get Flag Parsing Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
flagLine	TokenNameIdentifier	 flag Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
flagType	TokenNameIdentifier	 flag Type
=	TokenNameEQUAL	
flagLine	TokenNameIdentifier	 flag Line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NUM_FLAG_TYPE	TokenNameIdentifier	 NUM  FLAG  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
flagType	TokenNameIdentifier	 flag Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumFlagParsingStrategy	TokenNameIdentifier	 Num Flag Parsing Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
UTF8_FLAG_TYPE	TokenNameIdentifier	 UT F8  FLAG  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
flagType	TokenNameIdentifier	 flag Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleFlagParsingStrategy	TokenNameIdentifier	 Simple Flag Parsing Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
LONG_FLAG_TYPE	TokenNameIdentifier	 LONG  FLAG  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
flagType	TokenNameIdentifier	 flag Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DoubleASCIIFlagParsingStrategy	TokenNameIdentifier	 Double ASCII Flag Parsing Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unknown flag type: "	TokenNameStringLiteral	Unknown flag type: 
+	TokenNamePLUS	
flagType	TokenNameIdentifier	 flag Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the dictionary file through the provided InputStream, building up the words map * * @param dictionary InputStream to read the dictionary file through * @param decoder CharsetDecoder used to decode the contents of the file * @throws IOException Can be thrown while reading from the file */	TokenNameCOMMENT_JAVADOC	 Reads the dictionary file through the provided InputStream, building up the words map * @param dictionary InputStream to read the dictionary file through @param decoder CharsetDecoder used to decode the contents of the file @throws IOException Can be thrown while reading from the file 
private	TokenNameprivate	
void	TokenNamevoid	
readDictionaryFile	TokenNameIdentifier	 read Dictionary File
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: don't create millions of strings. 	TokenNameCOMMENT_LINE	TODO: don't create millions of strings. 
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first line is number of entries 	TokenNameCOMMENT_LINE	first line is number of entries 
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: the flags themselves can be double-chars (long) or also numeric 	TokenNameCOMMENT_LINE	TODO: the flags themselves can be double-chars (long) or also numeric 
// either way the trick is to encode them as char... but they must be parsed differently 	TokenNameCOMMENT_LINE	either way the trick is to encode them as char... but they must be parsed differently 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
HunspellWord	TokenNameIdentifier	 Hunspell Word
wordForm	TokenNameIdentifier	 word Form
;	TokenNameSEMICOLON	
int	TokenNameint	
flagSep	TokenNameIdentifier	 flag Sep
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flagSep	TokenNameIdentifier	 flag Sep
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordForm	TokenNameIdentifier	 word Form
=	TokenNameEQUAL	
NOFLAGS	TokenNameIdentifier	 NOFLAGS
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// note, there can be comments (morph description) after a flag. 	TokenNameCOMMENT_LINE	note, there can be comments (morph description) after a flag. 
// we should really look for any whitespace 	TokenNameCOMMENT_LINE	we should really look for any whitespace 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
flagSep	TokenNameIdentifier	 flag Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
flagPart	TokenNameIdentifier	 flag Part
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
flagSep	TokenNameIdentifier	 flag Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aliasCount	TokenNameIdentifier	 alias Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flagPart	TokenNameIdentifier	 flag Part
=	TokenNameEQUAL	
getAliasValue	TokenNameIdentifier	 get Alias Value
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
flagPart	TokenNameIdentifier	 flag Part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordForm	TokenNameIdentifier	 word Form
=	TokenNameEQUAL	
new	TokenNamenew	
HunspellWord	TokenNameIdentifier	 Hunspell Word
(	TokenNameLPAREN	
flagParsingStrategy	TokenNameIdentifier	 flag Parsing Strategy
.	TokenNameDOT	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
flagPart	TokenNameIdentifier	 flag Part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
wordForm	TokenNameIdentifier	 word Form
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flagSep	TokenNameIdentifier	 flag Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
wordForm	TokenNameIdentifier	 word Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Version	TokenNameIdentifier	 Version
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseAlias	TokenNameIdentifier	 parse Alias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aliases	TokenNameIdentifier	 aliases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//first line should be the aliases count 	TokenNameCOMMENT_LINE	first line should be the aliases count 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aliases	TokenNameIdentifier	 aliases
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
aliases	TokenNameIdentifier	 aliases
[	TokenNameLBRACKET	
aliasCount	TokenNameIdentifier	 alias Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ruleArgs	TokenNameIdentifier	 rule Args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getAliasValue	TokenNameIdentifier	 get Alias Value
(	TokenNameLPAREN	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
aliases	TokenNameIdentifier	 aliases
[	TokenNameLBRACKET	
id	TokenNameIdentifier	 id
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Bad flag alias number:"	TokenNameStringLiteral	Bad flag alias number:
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Abstraction of the process of parsing flags taken from the affix and dic files */	TokenNameCOMMENT_JAVADOC	 Abstraction of the process of parsing flags taken from the affix and dic files 
private	TokenNameprivate	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
{	TokenNameLBRACE	
/** * Parses the given String into a single flag * * @param rawFlag String to parse into a flag * @return Parsed flag */	TokenNameCOMMENT_JAVADOC	 Parses the given String into a single flag * @param rawFlag String to parse into a flag @return Parsed flag 
char	TokenNamechar	
parseFlag	TokenNameIdentifier	 parse Flag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawFlag	TokenNameIdentifier	 raw Flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
rawFlag	TokenNameIdentifier	 raw Flag
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the given String into multiple flags * * @param rawFlags String to parse into flags * @return Parsed flags */	TokenNameCOMMENT_JAVADOC	 Parses the given String into multiple flags * @param rawFlags String to parse into flags @return Parsed flags 
abstract	TokenNameabstract	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawFlags	TokenNameIdentifier	 raw Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple implementation of {@link FlagParsingStrategy} that treats the chars in each String as a individual flags. * Can be used with both the ASCII and UTF-8 flag types. */	TokenNameCOMMENT_JAVADOC	 Simple implementation of {@link FlagParsingStrategy} that treats the chars in each String as a individual flags. Can be used with both the ASCII and UTF-8 flag types. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SimpleFlagParsingStrategy	TokenNameIdentifier	 Simple Flag Parsing Strategy
extends	TokenNameextends	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
{	TokenNameLBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawFlags	TokenNameIdentifier	 raw Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implementation of {@link FlagParsingStrategy} that assumes each flag is encoded in its numerical form. In the case * of multiple flags, each number is separated by a comma. */	TokenNameCOMMENT_JAVADOC	 Implementation of {@link FlagParsingStrategy} that assumes each flag is encoded in its numerical form. In the case of multiple flags, each number is separated by a comma. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NumFlagParsingStrategy	TokenNameIdentifier	 Num Flag Parsing Strategy
extends	TokenNameextends	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
{	TokenNameLBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawFlags	TokenNameIdentifier	 raw Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rawFlagParts	TokenNameIdentifier	 raw Flag Parts
=	TokenNameEQUAL	
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
rawFlagParts	TokenNameIdentifier	 raw Flag Parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
rawFlagParts	TokenNameIdentifier	 raw Flag Parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// note, removing the trailing X/leading I for nepali... what is the rule here?! 	TokenNameCOMMENT_LINE	note, removing the trailing X/leading I for nepali... what is the rule here?! 
flags	TokenNameIdentifier	 flags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
rawFlagParts	TokenNameIdentifier	 raw Flag Parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"[^0-9]"	TokenNameStringLiteral	[^0-9]
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implementation of {@link FlagParsingStrategy} that assumes each flag is encoded as two ASCII characters whose codes * must be combined into a single character. * * TODO (rmuir) test */	TokenNameCOMMENT_JAVADOC	 Implementation of {@link FlagParsingStrategy} that assumes each flag is encoded as two ASCII characters whose codes must be combined into a single character. * TODO (rmuir) test 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DoubleASCIIFlagParsingStrategy	TokenNameIdentifier	 Double ASCII Flag Parsing Strategy
extends	TokenNameextends	
FlagParsingStrategy	TokenNameIdentifier	 Flag Parsing Strategy
{	TokenNameLBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseFlags	TokenNameIdentifier	 parse Flags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rawFlags	TokenNameIdentifier	 raw Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
cookedFlag	TokenNameIdentifier	 cooked Flag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
rawFlags	TokenNameIdentifier	 raw Flags
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cookedFlag	TokenNameIdentifier	 cooked Flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
flags	TokenNameIdentifier	 flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoreCase	TokenNameIdentifier	 is Ignore Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
