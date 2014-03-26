/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LocationInfo	TokenNameIdentifier	 Location Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
// Contributors: Nelson Minar <(nelson@monkey.org> 	TokenNameCOMMENT_LINE	Contributors: Nelson Minar <(nelson@monkey.org> 
// Igor E. Poteryaev <jah@mail.ru> 	TokenNameCOMMENT_LINE	Igor E. Poteryaev <jah@mail.ru> 
// Reinhard Deschler <reinhard.deschler@web.de> 	TokenNameCOMMENT_LINE	Reinhard Deschler <reinhard.deschler@web.de> 
/** Most of the work of the {@link org.apache.log4j.PatternLayout} class is delegated to the PatternParser class. <p>It is this class that parses conversion patterns and creates a chained list of {@link OptionConverter OptionConverters}. @author <a href=mailto:"cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @author Anders Kristensen @since 0.8.2 */	TokenNameCOMMENT_JAVADOC	 Most of the work of the {@link org.apache.log4j.PatternLayout} class is delegated to the PatternParser class. <p>It is this class that parses conversion patterns and creates a chained list of {@link OptionConverter OptionConverters}. @author <a href=mailto:"cakalijp@Maritz.com">James P. Cakalic</a> @author Ceki G&uuml;lc&uuml; @author Anders Kristensen @since 0.8.2 
public	TokenNamepublic	
class	TokenNameclass	
PatternParser	TokenNameIdentifier	 Pattern Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ESCAPE_CHAR	TokenNameIdentifier	 ESCAPE  CHAR
=	TokenNameEQUAL	
'%'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONVERTER_STATE	TokenNameIdentifier	 CONVERTER  STATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_STATE	TokenNameIdentifier	 MIN  STATE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_STATE	TokenNameIdentifier	 MAX  STATE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FULL_LOCATION_CONVERTER	TokenNameIdentifier	 FULL  LOCATION  CONVERTER
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
METHOD_LOCATION_CONVERTER	TokenNameIdentifier	 METHOD  LOCATION  CONVERTER
=	TokenNameEQUAL	
1001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_LOCATION_CONVERTER	TokenNameIdentifier	 CLASS  LOCATION  CONVERTER
=	TokenNameEQUAL	
1002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LINE_LOCATION_CONVERTER	TokenNameIdentifier	 LINE  LOCATION  CONVERTER
=	TokenNameEQUAL	
1003	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FILE_LOCATION_CONVERTER	TokenNameIdentifier	 FILE  LOCATION  CONVERTER
=	TokenNameEQUAL	
1004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RELATIVE_TIME_CONVERTER	TokenNameIdentifier	 RELATIVE  TIME  CONVERTER
=	TokenNameEQUAL	
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
THREAD_CONVERTER	TokenNameIdentifier	 THREAD  CONVERTER
=	TokenNameEQUAL	
2001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEVEL_CONVERTER	TokenNameIdentifier	 LEVEL  CONVERTER
=	TokenNameEQUAL	
2002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NDC_CONVERTER	TokenNameIdentifier	 NDC  CONVERTER
=	TokenNameEQUAL	
2003	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MESSAGE_CONVERTER	TokenNameIdentifier	 MESSAGE  CONVERTER
=	TokenNameEQUAL	
2004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
StringBuffer	TokenNameIdentifier	 String Buffer
currentLiteral	TokenNameIdentifier	 current Literal
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
patternLength	TokenNameIdentifier	 pattern Length
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
PatternConverter	TokenNameIdentifier	 Pattern Converter
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
PatternConverter	TokenNameIdentifier	 Pattern Converter
tail	TokenNameIdentifier	 tail
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
=	TokenNameEQUAL	
new	TokenNamenew	
FormattingInfo	TokenNameIdentifier	 Formatting Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PatternParser	TokenNameIdentifier	 Pattern Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
patternLength	TokenNameIdentifier	 pattern Length
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addToList	TokenNameIdentifier	 add To List
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tail	TokenNameIdentifier	 tail
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
extractOption	TokenNameIdentifier	 extract Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
patternLength	TokenNameIdentifier	 pattern Length
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
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The option is expected to be in decimal and positive. In case of error, zero is returned. */	TokenNameCOMMENT_JAVADOC	 The option is expected to be in decimal and positive. In case of error, zero is returned. 
protected	TokenNameprotected	
int	TokenNameint	
extractPrecisionOption	TokenNameIdentifier	 extract Precision Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
extractOption	TokenNameIdentifier	 extract Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Precision option ("	TokenNameStringLiteral	Precision option (
+	TokenNamePLUS	
opt	TokenNameIdentifier	 opt
+	TokenNamePLUS	
") isn't a positive integer."	TokenNameStringLiteral	) isn't a positive integer.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Category option ""	TokenNameStringLiteral	Category option "
+	TokenNamePLUS	
opt	TokenNameIdentifier	 opt
+	TokenNamePLUS	
"" not a decimal integer."	TokenNameStringLiteral	" not a decimal integer.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PatternConverter	TokenNameIdentifier	 Pattern Converter
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
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
addToList	TokenNameIdentifier	 add To List
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
//LogLog.debug("Parsed LITERAL converter: \"" 	TokenNameCOMMENT_LINE	LogLog.debug("Parsed LITERAL converter: \"" 
// +currentLiteral+"\"."); 	TokenNameCOMMENT_LINE	+currentLiteral+"\"."); 
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
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
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
.	TokenNameDOT	
leftAlign	TokenNameIdentifier	 left Align
=	TokenNameEQUAL	
true	TokenNametrue	
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
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
MIN_STATE	TokenNameIdentifier	 MIN  STATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
min	TokenNameIdentifier	 min
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
DOT_STATE	TokenNameIdentifier	 DOT  STATE
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
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
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
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
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
max	TokenNameIdentifier	 max
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
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
addToList	TokenNameIdentifier	 add To List
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
//LogLog.debug("Parsed LITERAL converter: \""+currentLiteral+"\"."); 	TokenNameCOMMENT_LINE	LogLog.debug("Parsed LITERAL converter: \""+currentLiteral+"\"."); 
}	TokenNameRBRACE	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
finalizeConverter	TokenNameIdentifier	 finalize Converter
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PatternConverter	TokenNameIdentifier	 Pattern Converter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPatternConverter	TokenNameIdentifier	 Category Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
extractPrecisionOption	TokenNameIdentifier	 extract Precision Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("CATEGORY converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("CATEGORY converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ClassNamePatternConverter	TokenNameIdentifier	 Class Name Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
extractPrecisionOption	TokenNameIdentifier	 extract Precision Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("CLASS_NAME converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("CLASS_NAME converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
dateFormatStr	TokenNameIdentifier	 date Format Str
=	TokenNameEQUAL	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
ISO8601_DATE_FORMAT	TokenNameIdentifier	 IS O8601  DATE  FORMAT
;	TokenNameSEMICOLON	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dOpt	TokenNameIdentifier	 d Opt
=	TokenNameEQUAL	
extractOption	TokenNameIdentifier	 extract Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dOpt	TokenNameIdentifier	 d Opt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dateFormatStr	TokenNameIdentifier	 date Format Str
=	TokenNameEQUAL	
dOpt	TokenNameIdentifier	 d Opt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatStr	TokenNameIdentifier	 date Format Str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
ISO8601_DATE_FORMAT	TokenNameIdentifier	 IS O8601  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
ISO8601DateFormat	TokenNameIdentifier	 IS O8601 Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatStr	TokenNameIdentifier	 date Format Str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
ABS_TIME_DATE_FORMAT	TokenNameIdentifier	 ABS  TIME  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dateFormatStr	TokenNameIdentifier	 date Format Str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
AbsoluteTimeDateFormat	TokenNameIdentifier	 Absolute Time Date Format
.	TokenNameDOT	
DATE_AND_TIME_DATE_FORMAT	TokenNameIdentifier	 DATE  AND  TIME  DATE  FORMAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
DateTimeDateFormat	TokenNameIdentifier	 Date Time Date Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
dateFormatStr	TokenNameIdentifier	 date Format Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate SimpleDateFormat with "	TokenNameStringLiteral	Could not instantiate SimpleDateFormat with 
+	TokenNamePLUS	
dateFormatStr	TokenNameIdentifier	 date Format Str
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
)	TokenNameRPAREN	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
"org.apache.log4j.helpers.ISO8601DateFormat"	TokenNameStringLiteral	org.apache.log4j.helpers.ISO8601DateFormat
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("DATE converter {"+dateFormatStr+"}."); 	TokenNameCOMMENT_LINE	LogLog.debug("DATE converter {"+dateFormatStr+"}."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'F'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
FILE_LOCATION_CONVERTER	TokenNameIdentifier	 FILE  LOCATION  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("File name converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("File name converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
FULL_LOCATION_CONVERTER	TokenNameIdentifier	 FULL  LOCATION  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("Location converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("Location converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'L'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
LINE_LOCATION_CONVERTER	TokenNameIdentifier	 LINE  LOCATION  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("LINE NUMBER converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("LINE NUMBER converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
MESSAGE_CONVERTER	TokenNameIdentifier	 MESSAGE  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("MESSAGE converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("MESSAGE converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'M'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
METHOD_LOCATION_CONVERTER	TokenNameIdentifier	 METHOD  LOCATION  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("METHOD converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("METHOD converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
LEVEL_CONVERTER	TokenNameIdentifier	 LEVEL  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("LEVEL converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("LEVEL converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
RELATIVE_TIME_CONVERTER	TokenNameIdentifier	 RELATIVE  TIME  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("RELATIVE time converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("RELATIVE time converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
THREAD_CONVERTER	TokenNameIdentifier	 THREAD  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("THREAD converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("THREAD converter."); 
//formattingInfo.dump(); 	TokenNameCOMMENT_LINE	formattingInfo.dump(); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
/*case 'u': if(i < patternLength) { char cNext = pattern.charAt(i); if(cNext >= '0' && cNext <= '9') { pc = new UserFieldPatternConverter(formattingInfo, cNext - '0'); LogLog.debug("USER converter ["+cNext+"]."); formattingInfo.dump(); currentLiteral.setLength(0); i++; } else LogLog.error("Unexpected char" +cNext+" at position "+i); } break;*/	TokenNameCOMMENT_BLOCK	case 'u': if(i < patternLength) { char cNext = pattern.charAt(i); if(cNext >= '0' && cNext <= '9') { pc = new UserFieldPatternConverter(formattingInfo, cNext - '0'); LogLog.debug("USER converter ["+cNext+"]."); formattingInfo.dump(); currentLiteral.setLength(0); i++; } else LogLog.error("Unexpected char" +cNext+" at position "+i); } break;
case	TokenNamecase	
'x'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
NDC_CONVERTER	TokenNameIdentifier	 NDC  CONVERTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//LogLog.debug("NDC converter."); 	TokenNameCOMMENT_LINE	LogLog.debug("NDC converter."); 
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'X'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
xOpt	TokenNameIdentifier	 x Opt
=	TokenNameEQUAL	
extractOption	TokenNameIdentifier	 extract Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
MDCPatternConverter	TokenNameIdentifier	 MDC Pattern Converter
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
xOpt	TokenNameIdentifier	 x Opt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Unexpected char ["	TokenNameStringLiteral	Unexpected char [
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"] at position "	TokenNameStringLiteral	] at position 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" in conversion patterrn."	TokenNameStringLiteral	 in conversion patterrn.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
addConverter	TokenNameIdentifier	 add Converter
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
addConverter	TokenNameIdentifier	 add Converter
(	TokenNameLPAREN	
PatternConverter	TokenNameIdentifier	 Pattern Converter
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentLiteral	TokenNameIdentifier	 current Literal
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the pattern converter to the list. 	TokenNameCOMMENT_LINE	Add the pattern converter to the list. 
addToList	TokenNameIdentifier	 add To List
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Next pattern is assumed to be a literal. 	TokenNameCOMMENT_LINE	Next pattern is assumed to be a literal. 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
LITERAL_STATE	TokenNameIdentifier	 LITERAL  STATE
;	TokenNameSEMICOLON	
// Reset formatting info 	TokenNameCOMMENT_LINE	Reset formatting info 
formattingInfo	TokenNameIdentifier	 formatting Info
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
// PatternConverters 	TokenNameCOMMENT_LINE	PatternConverters 
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
BasicPatternConverter	TokenNameIdentifier	 Basic Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RELATIVE_TIME_CONVERTER	TokenNameIdentifier	 RELATIVE  TIME  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
-	TokenNameMINUS	
LoggingEvent	TokenNameIdentifier	 Logging Event
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREAD_CONVERTER	TokenNameIdentifier	 THREAD  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LEVEL_CONVERTER	TokenNameIdentifier	 LEVEL  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NDC_CONVERTER	TokenNameIdentifier	 NDC  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MESSAGE_CONVERTER	TokenNameIdentifier	 MESSAGE  CONVERTER
:	TokenNameCOLON	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
literal	TokenNameIdentifier	 literal
;	TokenNameSEMICOLON	
LiteralPatternConverter	TokenNameIdentifier	 Literal Pattern Converter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
literal	TokenNameIdentifier	 literal
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
,	TokenNameCOMMA	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
literal	TokenNameIdentifier	 literal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
private	TokenNameprivate	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
DatePatternConverter	TokenNameIdentifier	 Date Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
converted	TokenNameIdentifier	 converted
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
converted	TokenNameIdentifier	 converted
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"Error occured while converting date."	TokenNameStringLiteral	Error occured while converting date.
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
converted	TokenNameIdentifier	 converted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MDCPatternConverter	TokenNameIdentifier	 MDC Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
MDCPatternConverter	TokenNameIdentifier	 MDC Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
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
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMDC	TokenNameIdentifier	 get MDC
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
LocationPatternConverter	TokenNameIdentifier	 Location Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocationInfo	TokenNameIdentifier	 Location Info
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
FULL_LOCATION_CONVERTER	TokenNameIdentifier	 FULL  LOCATION  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
;	TokenNameSEMICOLON	
case	TokenNamecase	
METHOD_LOCATION_CONVERTER	TokenNameIdentifier	 METHOD  LOCATION  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LINE_LOCATION_CONVERTER	TokenNameIdentifier	 LINE  LOCATION  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FILE_LOCATION_CONVERTER	TokenNameIdentifier	 FILE  LOCATION  CONVERTER
:	TokenNameCOLON	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
.	TokenNameDOT	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
NamedPatternConverter	TokenNameIdentifier	 Named Pattern Converter
extends	TokenNameextends	
PatternConverter	TokenNameIdentifier	 Pattern Converter
{	TokenNameLBRACE	
int	TokenNameint	
precision	TokenNameIdentifier	 precision
;	TokenNameSEMICOLON	
NamedPatternConverter	TokenNameIdentifier	 Named Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
int	TokenNameint	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precision	TokenNameIdentifier	 precision
=	TokenNameEQUAL	
precision	TokenNameIdentifier	 precision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getFullyQualifiedName	TokenNameIdentifier	 get Fully Qualified Name
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFullyQualifiedName	TokenNameIdentifier	 get Fully Qualified Name
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
precision	TokenNameIdentifier	 precision
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We substract 1 from 'len' when assigning to 'end' to avoid out of 	TokenNameCOMMENT_LINE	We substract 1 from 'len' when assigning to 'end' to avoid out of 
// bounds exception in return r.substring(end+1, len). This can happen if 	TokenNameCOMMENT_LINE	bounds exception in return r.substring(end+1, len). This can happen if 
// precision is 1 and the category name ends with a dot. 	TokenNameCOMMENT_LINE	precision is 1 and the category name ends with a dot. 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
precision	TokenNameIdentifier	 precision
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ClassNamePatternConverter	TokenNameIdentifier	 Class Name Pattern Converter
extends	TokenNameextends	
NamedPatternConverter	TokenNameIdentifier	 Named Pattern Converter
{	TokenNameLBRACE	
ClassNamePatternConverter	TokenNameIdentifier	 Class Name Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
int	TokenNameint	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getFullyQualifiedName	TokenNameIdentifier	 get Fully Qualified Name
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
CategoryPatternConverter	TokenNameIdentifier	 Category Pattern Converter
extends	TokenNameextends	
NamedPatternConverter	TokenNameIdentifier	 Named Pattern Converter
{	TokenNameLBRACE	
CategoryPatternConverter	TokenNameIdentifier	 Category Pattern Converter
(	TokenNameLPAREN	
FormattingInfo	TokenNameIdentifier	 Formatting Info
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
int	TokenNameint	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
formattingInfo	TokenNameIdentifier	 formatting Info
,	TokenNameCOMMA	
precision	TokenNameIdentifier	 precision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getFullyQualifiedName	TokenNameIdentifier	 get Fully Qualified Name
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
