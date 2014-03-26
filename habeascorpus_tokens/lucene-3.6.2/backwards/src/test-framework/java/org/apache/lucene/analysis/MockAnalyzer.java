package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** * Analyzer for testing * <p> * This analyzer is a replacement for Whitespace/Simple/KeywordAnalyzers * for unit tests. If you are testing a custom component such as a queryparser * or analyzer-wrapper that consumes analysis streams, its a great idea to test * it with this analyzer instead. MockAnalyzer has the following behavior: * <ul> * <li>By default, the assertions in {@link MockTokenizer} are turned on for extra * checks that the consumer is consuming properly. These checks can be disabled * with {@link #setEnableChecks(boolean)}. * <li>Payload data is randomly injected into the stream for more thorough testing * of payloads. * </ul> * @see MockTokenizer */	TokenNameCOMMENT_JAVADOC	 Analyzer for testing <p> This analyzer is a replacement for Whitespace/Simple/KeywordAnalyzers for unit tests. If you are testing a custom component such as a queryparser or analyzer-wrapper that consumes analysis streams, its a great idea to test it with this analyzer instead. MockAnalyzer has the following behavior: <ul> <li>By default, the assertions in {@link MockTokenizer} are turned on for extra checks that the consumer is consuming properly. These checks can be disabled with {@link #setEnableChecks(boolean)}. <li>Payload data is randomly injected into the stream for more thorough testing of payloads. </ul> @see MockTokenizer 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
positionIncrementGap	TokenNameIdentifier	 position Increment Gap
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
previousMappings	TokenNameIdentifier	 previous Mappings
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enableChecks	TokenNameIdentifier	 enable Checks
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Creates a new MockAnalyzer. * * @param random Random for payloads behavior * @param pattern pattern constant describing how tokenization should happen * @param lowerCase true if the tokenizer should lowercase terms * @param filter CharArraySet describing how terms should be filtered (set of stopwords, etc) * @param enablePositionIncrements true if position increments should reflect filtered terms. */	TokenNameCOMMENT_JAVADOC	 Creates a new MockAnalyzer. * @param random Random for payloads behavior @param pattern pattern constant describing how tokenization should happen @param lowerCase true if the tokenizer should lowercase terms @param filter CharArraySet describing how terms should be filtered (set of stopwords, etc) @param enablePositionIncrements true if position increments should reflect filtered terms. 
public	TokenNamepublic	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lowerCase	TokenNameIdentifier	 lower Case
=	TokenNameEQUAL	
lowerCase	TokenNameIdentifier	 lower Case
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
=	TokenNameEQUAL	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link #MockAnalyzer(Random, int, boolean, CharArraySet, boolean) * MockAnalyzer(random, pattern, lowerCase, CharArraySet.EMPTY_STOPSET, false}). */	TokenNameCOMMENT_JAVADOC	 Calls {@link #MockAnalyzer(Random, int, boolean, CharArraySet, boolean) MockAnalyzer(random, pattern, lowerCase, CharArraySet.EMPTY_STOPSET, false}). 
public	TokenNamepublic	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
int	TokenNameint	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerCase	TokenNameIdentifier	 lower Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
lowerCase	TokenNameIdentifier	 lower Case
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Whitespace-lowercasing analyzer with no stopwords removal. * <p> * Calls {@link #MockAnalyzer(Random, int, boolean) * MockAnalyzer(random, MockTokenizer.WHITESPACE, true)}. */	TokenNameCOMMENT_JAVADOC	 Create a Whitespace-lowercasing analyzer with no stopwords removal. <p> Calls {@link #MockAnalyzer(Random, int, boolean) MockAnalyzer(random, MockTokenizer.WHITESPACE, true)}. 
public	TokenNamepublic	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
lowerCase	TokenNameIdentifier	 lower Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
setEnableChecks	TokenNameIdentifier	 set Enable Checks
(	TokenNameLPAREN	
enableChecks	TokenNameIdentifier	 enable Checks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StopFilter	TokenNameIdentifier	 Stop Filter
filt	TokenNameIdentifier	 filt
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filt	TokenNameIdentifier	 filt
.	TokenNameDOT	
setEnablePositionIncrements	TokenNameIdentifier	 set Enable Position Increments
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
maybePayload	TokenNameIdentifier	 maybe Payload
(	TokenNameLPAREN	
filt	TokenNameIdentifier	 filt
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SavedStreams	TokenNameIdentifier	 Saved Streams
{	TokenNameLBRACE	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
TokenFilter	TokenNameIdentifier	 Token Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SavedStreams	TokenNameIdentifier	 Saved Streams
saved	TokenNameIdentifier	 saved
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
saved	TokenNameIdentifier	 saved
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
saved	TokenNameIdentifier	 saved
=	TokenNameEQUAL	
new	TokenNamenew	
SavedStreams	TokenNameIdentifier	 Saved Streams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
lowerCase	TokenNameIdentifier	 lower Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
setEnableChecks	TokenNameIdentifier	 set Enable Checks
(	TokenNameLPAREN	
enableChecks	TokenNameIdentifier	 enable Checks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StopFilter	TokenNameIdentifier	 Stop Filter
filt	TokenNameIdentifier	 filt
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filt	TokenNameIdentifier	 filt
.	TokenNameDOT	
setEnablePositionIncrements	TokenNameIdentifier	 set Enable Position Increments
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filt	TokenNameIdentifier	 filt
;	TokenNameSEMICOLON	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
maybePayload	TokenNameIdentifier	 maybe Payload
(	TokenNameLPAREN	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
saved	TokenNameIdentifier	 saved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
saved	TokenNameIdentifier	 saved
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
TokenFilter	TokenNameIdentifier	 Token Filter
maybePayload	TokenNameIdentifier	 maybe Payload
(	TokenNameLPAREN	
TokenFilter	TokenNameIdentifier	 Token Filter
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
previousMappings	TokenNameIdentifier	 previous Mappings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no payloads 	TokenNameCOMMENT_LINE	no payloads 
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// no payloads 	TokenNameCOMMENT_LINE	no payloads 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// variable length payload 	TokenNameCOMMENT_LINE	variable length payload 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fixed length payload 	TokenNameCOMMENT_LINE	fixed length payload 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
previousMappings	TokenNameIdentifier	 previous Mappings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save it so we are consistent for this field 	TokenNameCOMMENT_LINE	save it so we are consistent for this field 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
MockVariableLengthPayloadFilter	TokenNameIdentifier	 Mock Variable Length Payload Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MockFixedLengthPayloadFilter	TokenNameIdentifier	 Mock Fixed Length Payload Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPositionIncrementGap	TokenNameIdentifier	 set Position Increment Gap
(	TokenNameLPAREN	
int	TokenNameint	
positionIncrementGap	TokenNameIdentifier	 position Increment Gap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionIncrementGap	TokenNameIdentifier	 position Increment Gap
=	TokenNameEQUAL	
positionIncrementGap	TokenNameIdentifier	 position Increment Gap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getPositionIncrementGap	TokenNameIdentifier	 get Position Increment Gap
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionIncrementGap	TokenNameIdentifier	 position Increment Gap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Toggle consumer workflow checking: if your test consumes tokenstreams normally you * should leave this enabled. */	TokenNameCOMMENT_JAVADOC	 Toggle consumer workflow checking: if your test consumes tokenstreams normally you should leave this enabled. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableChecks	TokenNameIdentifier	 set Enable Checks
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enableChecks	TokenNameIdentifier	 enable Checks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enableChecks	TokenNameIdentifier	 enable Checks
=	TokenNameEQUAL	
enableChecks	TokenNameIdentifier	 enable Checks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
