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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for NameAbbrevator. * */	TokenNameCOMMENT_JAVADOC	 Tests for NameAbbrevator. 
public	TokenNamepublic	
class	TokenNameclass	
NameAbbreviatorTest	TokenNameIdentifier	 Name Abbreviator Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create a new instance. * * @param name test name */	TokenNameCOMMENT_JAVADOC	 Create a new instance. * @param name test name 
public	TokenNamepublic	
NameAbbreviatorTest	TokenNameIdentifier	 Name Abbreviator Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getDefaultAbbreviator does not return null. * */	TokenNameCOMMENT_JAVADOC	 Check that getDefaultAbbreviator does not return null. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetDefault	TokenNameIdentifier	 test Get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getDefaultAbbreviator	TokenNameIdentifier	 get Default Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
abbrev	TokenNameIdentifier	 abbrev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that "0" drops all name content. * */	TokenNameCOMMENT_JAVADOC	 Check that "0" drops all name content. 
public	TokenNamepublic	
void	TokenNamevoid	
testZero	TokenNameIdentifier	 test Zero
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator(" ") returns default abbreviator. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator(" ") returns default abbreviator. 
public	TokenNamepublic	
void	TokenNamevoid	
testBlank	TokenNameIdentifier	 test Blank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
defaultAbbrev	TokenNameIdentifier	 default Abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getDefaultAbbreviator	TokenNameIdentifier	 get Default Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
abbrev	TokenNameIdentifier	 abbrev
==	TokenNameEQUAL_EQUAL	
defaultAbbrev	TokenNameIdentifier	 default Abbrev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("1").abbreviate() drops all but the final name element. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("1").abbreviate() drops all but the final name element. 
public	TokenNamepublic	
void	TokenNamevoid	
testOne	TokenNameIdentifier	 test One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that blanks are trimmed in evaluating abbreviation pattern. */	TokenNameCOMMENT_JAVADOC	 Check that blanks are trimmed in evaluating abbreviation pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
testBlankOne	TokenNameIdentifier	 test Blank One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
" 1 "	TokenNameStringLiteral	 1 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("2").abbreviate drops all but the last two elements. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("2").abbreviate drops all but the last two elements. 
public	TokenNamepublic	
void	TokenNamevoid	
testTwo	TokenNameIdentifier	 test Two
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - foo.bar"	TokenNameStringLiteral	DEBUG - foo.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foo.bar"	TokenNameStringLiteral	foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - foo.bar"	TokenNameStringLiteral	DEBUG - foo.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("1.").abbreviate abbreviates non-final elements * to one character. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("1.").abbreviate abbreviates non-final elements to one character. 
public	TokenNamepublic	
void	TokenNamevoid	
testOneDot	TokenNameIdentifier	 test One Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"1."	TokenNameStringLiteral	1.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o.e.f.bar"	TokenNameStringLiteral	DEBUG - o.e.f.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo."	TokenNameStringLiteral	org.example.foo.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o.e.f."	TokenNameStringLiteral	DEBUG - o.e.f.
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foo.bar"	TokenNameStringLiteral	foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - f.bar"	TokenNameStringLiteral	DEBUG - f.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - ."	TokenNameStringLiteral	DEBUG - .
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("1~.").abbreviate abbreviates non-final elements * to one character and a tilde. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("1~.").abbreviate abbreviates non-final elements to one character and a tilde. 
public	TokenNamepublic	
void	TokenNamevoid	
testOneTildeDot	TokenNameIdentifier	 test One Tilde Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"1~."	TokenNameStringLiteral	1~.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o~.e~.f~.bar"	TokenNameStringLiteral	DEBUG - o~.e~.f~.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo."	TokenNameStringLiteral	org.example.foo.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o~.e~.f~."	TokenNameStringLiteral	DEBUG - o~.e~.f~.
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foo.bar"	TokenNameStringLiteral	foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - f~.bar"	TokenNameStringLiteral	DEBUG - f~.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - ."	TokenNameStringLiteral	DEBUG - .
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"o.e.f.bar"	TokenNameStringLiteral	o.e.f.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o.e.f.bar"	TokenNameStringLiteral	DEBUG - o.e.f.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("1.*.2").abbreviate drops all but the first * character from the first element, uses all of the second element and * drops all but the first two characters of the rest of the non-final elements. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("1.*.2").abbreviate drops all but the first character from the first element, uses all of the second element and drops all but the first two characters of the rest of the non-final elements. 
public	TokenNamepublic	
void	TokenNamevoid	
testMulti	TokenNameIdentifier	 test Multi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"1.*.2"	TokenNameStringLiteral	1.*.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o.example.fo.bar"	TokenNameStringLiteral	DEBUG - o.example.fo.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo."	TokenNameStringLiteral	org.example.foo.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - o.example.fo."	TokenNameStringLiteral	DEBUG - o.example.fo.
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foo.bar"	TokenNameStringLiteral	foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - f.bar"	TokenNameStringLiteral	DEBUG - f.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - ."	TokenNameStringLiteral	DEBUG - .
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check that getAbbreviator("-1").abbreviate() drops first name element. * */	TokenNameCOMMENT_JAVADOC	 Check that getAbbreviator("-1").abbreviate() drops first name element. 
public	TokenNamepublic	
void	TokenNamevoid	
testMinusOne	TokenNameIdentifier	 test Minus One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
abbrev	TokenNameIdentifier	 abbrev
=	TokenNameEQUAL	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
.	TokenNameDOT	
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
"-1"	TokenNameStringLiteral	-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"org.example.foo.bar"	TokenNameStringLiteral	org.example.foo.bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - example.foo.bar"	TokenNameStringLiteral	DEBUG - example.foo.bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - bar"	TokenNameStringLiteral	DEBUG - bar
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldStart	TokenNameIdentifier	 field Start
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrev	TokenNameIdentifier	 abbrev
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
fieldStart	TokenNameIdentifier	 field Start
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DEBUG - "	TokenNameStringLiteral	DEBUG - 
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
