/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
Loader	TokenNameIdentifier	 Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
Collection	TokenNameIdentifier	 Collection
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
List	TokenNameIdentifier	 List
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
// Contributors: Nelson Minar <(nelson@monkey.org> 	TokenNameCOMMENT_LINE	Contributors: Nelson Minar <(nelson@monkey.org> 
// Igor E. Poteryaev <jah@mail.ru> 	TokenNameCOMMENT_LINE	Igor E. Poteryaev <jah@mail.ru> 
// Reinhard Deschler <reinhard.deschler@web.de> 	TokenNameCOMMENT_LINE	Reinhard Deschler <reinhard.deschler@web.de> 
/** * Most of the work of the {@link org.apache.log4j.EnhancedPatternLayout} class * is delegated to the PatternParser class. * <p>It is this class that parses conversion patterns and creates * a chained list of {@link PatternConverter PatternConverters}. * * @author James P. Cakalic * @author Ceki G&uuml;lc&uuml; * @author Anders Kristensen * @author Paul Smith * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 Most of the work of the {@link org.apache.log4j.EnhancedPatternLayout} class is delegated to the PatternParser class. <p>It is this class that parses conversion patterns and creates a chained list of {@link PatternConverter PatternConverters}. * @author James P. Cakalic @author Ceki G&uuml;lc&uuml; @author Anders Kristensen @author Paul Smith @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PatternParser	TokenNameIdentifier	 Pattern Parser
{	TokenNameLBRACE	
/** * Escape character for format specifier. */	TokenNameCOMMENT_JAVADOC	 Escape character for format specifier. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ESCAPE_CHAR	TokenNameIdentifier	 ESCAPE  CHAR
=	TokenNameEQUAL	
'%'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Literal state. */	TokenNameCOMMENT_JAVADOC	 Literal state. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * In converter name state. */	TokenNameCOMMENT_JAVADOC	 In converter name state. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONVERTER_STATE	TokenNameIdentifier	 CONVERTER  STATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Dot state. */	TokenNameCOMMENT_JAVADOC	 Dot state. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Min state. */	TokenNameCOMMENT_JAVADOC	 Min state. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_STATE	TokenNameIdentifier	 MIN  STATE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Max state. */	TokenNameCOMMENT_JAVADOC	 Max state. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_STATE	TokenNameIdentifier	 MAX  STATE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Standard format specifiers for EnhancedPatternLayout. */	TokenNameCOMMENT_JAVADOC	 Standard format specifiers for EnhancedPatternLayout. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
PATTERN_LAYOUT_RULES	TokenNameIdentifier	 PATTERN  LAYOUT  RULES
;	TokenNameSEMICOLON	
/** * Standard format specifiers for rolling file appenders. */	TokenNameCOMMENT_JAVADOC	 Standard format specifiers for rolling file appenders. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
FILENAME_PATTERN_RULES	TokenNameIdentifier	 FILENAME  PATTERN  RULES
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// We set the global rules in the static initializer of PatternParser class 	TokenNameCOMMENT_LINE	We set the global rules in the static initializer of PatternParser class 
Map	TokenNameIdentifier	 Map
rules	TokenNameIdentifier	 rules
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"logger"	TokenNameStringLiteral	logger
,	TokenNameCOMMA	
LoggerPatternConverter	TokenNameIdentifier	 Logger Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
ClassNamePatternConverter	TokenNameIdentifier	 Class Name Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"class"	TokenNameStringLiteral	class
,	TokenNameCOMMA	
ClassNamePatternConverter	TokenNameIdentifier	 Class Name Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"F"	TokenNameStringLiteral	F
,	TokenNameCOMMA	
FileLocationPatternConverter	TokenNameIdentifier	 File Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
FileLocationPatternConverter	TokenNameIdentifier	 File Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"l"	TokenNameStringLiteral	l
,	TokenNameCOMMA	
FullLocationPatternConverter	TokenNameIdentifier	 Full Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L"	TokenNameStringLiteral	L
,	TokenNameCOMMA	
LineLocationPatternConverter	TokenNameIdentifier	 Line Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
LineLocationPatternConverter	TokenNameIdentifier	 Line Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"m"	TokenNameStringLiteral	m
,	TokenNameCOMMA	
MessagePatternConverter	TokenNameIdentifier	 Message Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
,	TokenNameCOMMA	
MessagePatternConverter	TokenNameIdentifier	 Message Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
,	TokenNameCOMMA	
LineSeparatorPatternConverter	TokenNameIdentifier	 Line Separator Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"M"	TokenNameStringLiteral	M
,	TokenNameCOMMA	
MethodLocationPatternConverter	TokenNameIdentifier	 Method Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"method"	TokenNameStringLiteral	method
,	TokenNameCOMMA	
MethodLocationPatternConverter	TokenNameIdentifier	 Method Location Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"level"	TokenNameStringLiteral	level
,	TokenNameCOMMA	
LevelPatternConverter	TokenNameIdentifier	 Level Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"r"	TokenNameStringLiteral	r
,	TokenNameCOMMA	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"relative"	TokenNameStringLiteral	relative
,	TokenNameCOMMA	
RelativeTimePatternConverter	TokenNameIdentifier	 Relative Time Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"t"	TokenNameStringLiteral	t
,	TokenNameCOMMA	
ThreadPatternConverter	TokenNameIdentifier	 Thread Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"thread"	TokenNameStringLiteral	thread
,	TokenNameCOMMA	
ThreadPatternConverter	TokenNameIdentifier	 Thread Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
NDCPatternConverter	TokenNameIdentifier	 NDC Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ndc"	TokenNameStringLiteral	ndc
,	TokenNameCOMMA	
NDCPatternConverter	TokenNameIdentifier	 NDC Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"X"	TokenNameStringLiteral	X
,	TokenNameCOMMA	
PropertiesPatternConverter	TokenNameIdentifier	 Properties Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"properties"	TokenNameStringLiteral	properties
,	TokenNameCOMMA	
PropertiesPatternConverter	TokenNameIdentifier	 Properties Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sn"	TokenNameStringLiteral	sn
,	TokenNameCOMMA	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sequenceNumber"	TokenNameStringLiteral	sequenceNumber
,	TokenNameCOMMA	
SequenceNumberPatternConverter	TokenNameIdentifier	 Sequence Number Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"throwable"	TokenNameStringLiteral	throwable
,	TokenNameCOMMA	
ThrowableInformationPatternConverter	TokenNameIdentifier	 Throwable Information Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PATTERN_LAYOUT_RULES	TokenNameIdentifier	 PATTERN  LAYOUT  RULES
=	TokenNameEQUAL	
new	TokenNamenew	
ReadOnlyMap	TokenNameIdentifier	 Read Only Map
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
fnameRules	TokenNameIdentifier	 fname Rules
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnameRules	TokenNameIdentifier	 fname Rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
FileDatePatternConverter	TokenNameIdentifier	 File Date Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnameRules	TokenNameIdentifier	 fname Rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
FileDatePatternConverter	TokenNameIdentifier	 File Date Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnameRules	TokenNameIdentifier	 fname Rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
IntegerPatternConverter	TokenNameIdentifier	 Integer Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnameRules	TokenNameIdentifier	 fname Rules
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"index"	TokenNameStringLiteral	index
,	TokenNameCOMMA	
IntegerPatternConverter	TokenNameIdentifier	 Integer Pattern Converter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FILENAME_PATTERN_RULES	TokenNameIdentifier	 FILENAME  PATTERN  RULES
=	TokenNameEQUAL	
new	TokenNamenew	
ReadOnlyMap	TokenNameIdentifier	 Read Only Map
(	TokenNameLPAREN	
fnameRules	TokenNameIdentifier	 fname Rules
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
private	TokenNameprivate	
PatternParser	TokenNameIdentifier	 Pattern Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get standard format specifiers for EnhancedPatternLayout. * @return read-only map of format converter classes keyed by format specifier strings. */	TokenNameCOMMENT_JAVADOC	 Get standard format specifiers for EnhancedPatternLayout. @return read-only map of format converter classes keyed by format specifier strings. 
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
getPatternLayoutRules	TokenNameIdentifier	 get Pattern Layout Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PATTERN_LAYOUT_RULES	TokenNameIdentifier	 PATTERN  LAYOUT  RULES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get standard format specifiers for rolling file appender file specification. * @return read-only map of format converter classes keyed by format specifier strings. */	TokenNameCOMMENT_JAVADOC	 Get standard format specifiers for rolling file appender file specification. @return read-only map of format converter classes keyed by format specifier strings. 
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
getFileNamePatternRules	TokenNameIdentifier	 get File Name Pattern Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FILENAME_PATTERN_RULES	TokenNameIdentifier	 FILENAME  PATTERN  RULES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Extract the converter identifier found at position i. * * After this function returns, the variable i will point to the * first char after the end of the converter identifier. * * If i points to a char which is not a character acceptable at the * start of a unicode identifier, the value null is returned. * * @param lastChar last processed character. * @param pattern format string. * @param i current index into pattern format. * @param convBuf buffer to receive conversion specifier. * @param currentLiteral literal to be output in case format specifier in unrecognized. * @return position in pattern after converter. */	TokenNameCOMMENT_JAVADOC	 Extract the converter identifier found at position i. * After this function returns, the variable i will point to the first char after the end of the converter identifier. * If i points to a char which is not a character acceptable at the start of a unicode identifier, the value null is returned. * @param lastChar last processed character. @param pattern format string. @param i current index into pattern format. @param convBuf buffer to receive conversion specifier. @param currentLiteral literal to be output in case format specifier in unrecognized. @return position in pattern after converter. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
extractConverter	TokenNameIdentifier	 extract Converter
(	TokenNameLPAREN	
char	TokenNamechar	
lastChar	TokenNameIdentifier	 last Char
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
convBuf	TokenNameIdentifier	 conv Buf
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
currentLiteral	TokenNameIdentifier	 current Literal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
convBuf	TokenNameIdentifier	 conv Buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// When this method is called, lastChar points to the first character of the 	TokenNameCOMMENT_LINE	When this method is called, lastChar points to the first character of the 
// conversion word. For example: 	TokenNameCOMMENT_LINE	conversion word. For example: 
// For "%hello" lastChar = 'h' 	TokenNameCOMMENT_LINE	For "%hello" lastChar = 'h' 
// For "%-5hello" lastChar = 'h' 	TokenNameCOMMENT_LINE	For "%-5hello" lastChar = 'h' 
//System.out.println("lastchar is "+lastChar); 	TokenNameCOMMENT_LINE	System.out.println("lastchar is "+lastChar); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isUnicodeIdentifierStart	TokenNameIdentifier	 is Unicode Identifier Start
(	TokenNameLPAREN	
lastChar	TokenNameIdentifier	 last Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
convBuf	TokenNameIdentifier	 conv Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lastChar	TokenNameIdentifier	 last Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isUnicodeIdentifierPart	TokenNameIdentifier	 is Unicode Identifier Part
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
convBuf	TokenNameIdentifier	 conv Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("conv buffer is now ["+convBuf+"]."); 	TokenNameCOMMENT_LINE	System.out.println("conv buffer is now ["+convBuf+"]."); 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extract options. * @param pattern conversion pattern. * @param i start of options. * @param options array to receive extracted options * @return position in pattern after options. */	TokenNameCOMMENT_JAVADOC	 Extract options. @param pattern conversion pattern. @param i start of options. @param options array to receive extracted options @return position in pattern after options. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
extractOptions	TokenNameIdentifier	 extract Options
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a format specifier. * @param pattern pattern to parse. * @param patternConverters list to receive pattern converters. * @param formattingInfos list to receive field specifiers corresponding to pattern converters. * @param converterRegistry map of user-supported pattern converters keyed by format specifier, may be null. * @param rules map of stock pattern converters keyed by format specifier. */	TokenNameCOMMENT_JAVADOC	 Parse a format specifier. @param pattern pattern to parse. @param patternConverters list to receive pattern converters. @param formattingInfos list to receive field specifiers corresponding to pattern converters. @param converterRegistry map of user-supported pattern converters keyed by format specifier, may be null. @param rules map of stock pattern converters keyed by format specifier. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
patternConverters	TokenNameIdentifier	 pattern Converters
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
formattingInfos	TokenNameIdentifier	 formatting Infos
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"pattern"	TokenNameStringLiteral	pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
currentLiteral	TokenNameIdentifier	 current Literal
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
patternLength	TokenNameIdentifier	 pattern Length
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
patternLength	TokenNameIdentifier	 pattern Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
:	TokenNameCOLON	
// In literal state, the last char is always a literal. 	TokenNameCOMMENT_LINE	In literal state, the last char is always a literal. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
patternLength	TokenNameIdentifier	 pattern Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
ESCAPE_CHAR	TokenNameIdentifier	 ESCAPE  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// peek at the next char. 	TokenNameCOMMENT_LINE	peek at the next char. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ESCAPE_CHAR	TokenNameIdentifier	 ESCAPE  CHAR
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// move pointer 	TokenNameCOMMENT_LINE	move pointer 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formattingInfos	TokenNameIdentifier	 formatting Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// append % 	TokenNameCOMMENT_LINE	append % 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
CONVERTER_STATE	TokenNameIdentifier	 CONVERTER  STATE
;	TokenNameSEMICOLON	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONVERTER_STATE	TokenNameIdentifier	 CONVERTER  STATE
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'.'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
MIN_STATE	TokenNameIdentifier	 MIN  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
patternConverters	TokenNameIdentifier	 pattern Converters
,	TokenNameCOMMA	
formattingInfos	TokenNameIdentifier	 formatting Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Next pattern is assumed to be a literal. 	TokenNameCOMMENT_LINE	Next pattern is assumed to be a literal. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// switch 	TokenNameCOMMENT_LINE	switch 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MIN_STATE	TokenNameIdentifier	 MIN  STATE
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
patternConverters	TokenNameIdentifier	 pattern Converters
,	TokenNameCOMMA	
formattingInfos	TokenNameIdentifier	 formatting Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
MAX_STATE	TokenNameIdentifier	 MAX  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error occured in position "	TokenNameStringLiteral	Error occured in position 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". Was expecting digit, instead got char ""	TokenNameStringLiteral	. Was expecting digit, instead got char "
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
""."	TokenNameStringLiteral	".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MAX_STATE	TokenNameIdentifier	 MAX  STATE
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
isLeftAligned	TokenNameIdentifier	 is Left Aligned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
getMaxLength	TokenNameIdentifier	 get Max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
patternConverters	TokenNameIdentifier	 pattern Converters
,	TokenNameCOMMA	
formattingInfos	TokenNameIdentifier	 formatting Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// switch 	TokenNameCOMMENT_LINE	switch 
}	TokenNameRBRACE	
// while 	TokenNameCOMMENT_LINE	while 
if	TokenNameif	
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formattingInfos	TokenNameIdentifier	 formatting Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new PatternConverter. * * * @param converterId converterId. * @param currentLiteral literal to be used if converter is unrecognized or following converter * if converterId contains extra characters. * @param converterRegistry map of user-supported pattern converters keyed by format specifier, may be null. * @param rules map of stock pattern converters keyed by format specifier. * @param options converter options. * @return converter or null. */	TokenNameCOMMENT_JAVADOC	 Creates a new PatternConverter. * @param converterId converterId. @param currentLiteral literal to be used if converter is unrecognized or following converter if converterId contains extra characters. @param converterRegistry map of user-supported pattern converters keyed by format specifier, may be null. @param rules map of stock pattern converters keyed by format specifier. @param options converter options. @return converter or null. 
private	TokenNameprivate	
static	TokenNamestatic	
PatternConverter	TokenNameIdentifier	 Pattern Converter
createConverter	TokenNameIdentifier	 create Converter
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
converterId	TokenNameIdentifier	 converter Id
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
converterName	TokenNameIdentifier	 converter Name
=	TokenNameEQUAL	
converterId	TokenNameIdentifier	 converter Id
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
converterObj	TokenNameIdentifier	 converter Obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
converterId	TokenNameIdentifier	 converter Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
converterObj	TokenNameIdentifier	 converter Obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
converterName	TokenNameIdentifier	 converter Name
=	TokenNameEQUAL	
converterName	TokenNameIdentifier	 converter Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
converterRegistry	TokenNameIdentifier	 converter Registry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
converterObj	TokenNameIdentifier	 converter Obj
=	TokenNameEQUAL	
converterRegistry	TokenNameIdentifier	 converter Registry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
converterName	TokenNameIdentifier	 converter Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
converterObj	TokenNameIdentifier	 converter Obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rules	TokenNameIdentifier	 rules
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
converterObj	TokenNameIdentifier	 converter Obj
=	TokenNameEQUAL	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
converterName	TokenNameIdentifier	 converter Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
converterObj	TokenNameIdentifier	 converter Obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Unrecognized format specifier ["	TokenNameStringLiteral	Unrecognized format specifier [
+	TokenNamePLUS	
converterId	TokenNameIdentifier	 converter Id
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
converterClass	TokenNameIdentifier	 converter Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
converterObj	TokenNameIdentifier	 converter Obj
instanceof	TokenNameinstanceof	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
converterClass	TokenNameIdentifier	 converter Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
converterObj	TokenNameIdentifier	 converter Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
converterObj	TokenNameIdentifier	 converter Obj
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
converterClass	TokenNameIdentifier	 converter Class
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
converterObj	TokenNameIdentifier	 converter Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Class for conversion pattern %"	TokenNameStringLiteral	Class for conversion pattern %
+	TokenNamePLUS	
converterName	TokenNameIdentifier	 converter Name
+	TokenNamePLUS	
" not found"	TokenNameStringLiteral	 not found
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Bad map entry for conversion pattern %"	TokenNameStringLiteral	Bad map entry for conversion pattern %
+	TokenNamePLUS	
converterName	TokenNameIdentifier	 converter Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
converterClass	TokenNameIdentifier	 converter Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"newInstance"	TokenNameStringLiteral	newInstance
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"[Ljava.lang.String;"	TokenNameStringLiteral	[Ljava.lang.String;
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionsArray	TokenNameIdentifier	 options Array
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
optionsArray	TokenNameIdentifier	 options Array
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
optionsArray	TokenNameIdentifier	 options Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
newObj	TokenNameIdentifier	 new Obj
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
optionsArray	TokenNameIdentifier	 options Array
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newObj	TokenNameIdentifier	 new Obj
instanceof	TokenNameinstanceof	
PatternConverter	TokenNameIdentifier	 Pattern Converter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
converterName	TokenNameIdentifier	 converter Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
)	TokenNameRPAREN	
newObj	TokenNameIdentifier	 new Obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Class "	TokenNameStringLiteral	Class 
+	TokenNamePLUS	
converterClass	TokenNameIdentifier	 converter Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not extend PatternConverter."	TokenNameStringLiteral	 does not extend PatternConverter.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error creating converter for "	TokenNameStringLiteral	Error creating converter for 
+	TokenNamePLUS	
converterId	TokenNameIdentifier	 converter Id
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// try default constructor 	TokenNameCOMMENT_LINE	try default constructor 
PatternConverter	TokenNameIdentifier	 Pattern Converter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
)	TokenNameRPAREN	
converterClass	TokenNameIdentifier	 converter Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
converterName	TokenNameIdentifier	 converter Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error creating converter for "	TokenNameStringLiteral	Error creating converter for 
+	TokenNamePLUS	
converterId	TokenNameIdentifier	 converter Id
,	TokenNameCOMMA	
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Processes a format specifier sequence. * * @param c initial character of format specifier. * @param pattern conversion pattern * @param i current position in conversion pattern. * @param currentLiteral current literal. * @param formattingInfo current field specifier. * @param converterRegistry map of user-provided pattern converters keyed by format specifier, may be null. * @param rules map of stock pattern converters keyed by format specifier. * @param patternConverters list to receive parsed pattern converter. * @param formattingInfos list to receive corresponding field specifier. * @return position after format specifier sequence. */	TokenNameCOMMENT_JAVADOC	 Processes a format specifier sequence. * @param c initial character of format specifier. @param pattern conversion pattern @param i current position in conversion pattern. @param currentLiteral current literal. @param formattingInfo current field specifier. @param converterRegistry map of user-provided pattern converters keyed by format specifier, may be null. @param rules map of stock pattern converters keyed by format specifier. @param patternConverters list to receive parsed pattern converter. @param formattingInfos list to receive corresponding field specifier. @return position after format specifier sequence. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
final	TokenNamefinal	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
patternConverters	TokenNameIdentifier	 pattern Converters
,	TokenNameCOMMA	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
formattingInfos	TokenNameIdentifier	 formatting Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
convBuf	TokenNameIdentifier	 conv Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
extractConverter	TokenNameIdentifier	 extract Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
convBuf	TokenNameIdentifier	 conv Buf
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
converterId	TokenNameIdentifier	 converter Id
=	TokenNameEQUAL	
convBuf	TokenNameIdentifier	 conv Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
extractOptions	TokenNameIdentifier	 extract Options
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternConverter	TokenNameIdentifier	 Pattern Converter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
createConverter	TokenNameIdentifier	 create Converter
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
,	TokenNameCOMMA	
currentLiteral	TokenNameIdentifier	 current Literal
,	TokenNameCOMMA	
converterRegistry	TokenNameIdentifier	 converter Registry
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Empty conversion specifier starting at position "	TokenNameStringLiteral	Empty conversion specifier starting at position 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Unrecognized conversion specifier ["	TokenNameStringLiteral	Unrecognized conversion specifier [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
converterId	TokenNameIdentifier	 converter Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] starting at position "	TokenNameStringLiteral	] starting at position 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" in conversion pattern."	TokenNameStringLiteral	 in conversion pattern.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formattingInfos	TokenNameIdentifier	 formatting Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formattingInfos	TokenNameIdentifier	 formatting Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patternConverters	TokenNameIdentifier	 pattern Converters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formattingInfos	TokenNameIdentifier	 formatting Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The class wraps another Map but throws exceptions on any attempt to modify the map. */	TokenNameCOMMENT_JAVADOC	 The class wraps another Map but throws exceptions on any attempt to modify the map. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ReadOnlyMap	TokenNameIdentifier	 Read Only Map
implements	TokenNameimplements	
Map	TokenNameIdentifier	 Map
{	TokenNameLBRACE	
/** * Wrapped map. */	TokenNameCOMMENT_JAVADOC	 Wrapped map. 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
/** * Constructor * @param src source map. */	TokenNameCOMMENT_JAVADOC	 Constructor @param src source map. 
public	TokenNamepublic	
ReadOnlyMap	TokenNameIdentifier	 Read Only Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
