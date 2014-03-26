package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
/** * Subclass of FilteredTermEnum for enumerating all terms that match the * specified wildcard filter term. * <p> * Term enumerations are always ordered by Term.compareTo(). Each term in * the enumeration is greater than all that precede it. */	TokenNameCOMMENT_JAVADOC	 Subclass of FilteredTermEnum for enumerating all terms that match the specified wildcard filter term. <p> Term enumerations are always ordered by Term.compareTo(). Each term in the enumeration is greater than all that precede it. 
public	TokenNamepublic	
class	TokenNameclass	
WildcardTermEnum	TokenNameIdentifier	 Wildcard Term Enum
extends	TokenNameextends	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
{	TokenNameLBRACE	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
searchTerm	TokenNameIdentifier	 search Term
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pre	TokenNameIdentifier	 pre
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
preLen	TokenNameIdentifier	 pre Len
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates a new <code>WildcardTermEnum</code>. * <p> * After calling the constructor the enumeration is already pointing to the first * valid term if such a term exists. */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>WildcardTermEnum</code>. <p> After calling the constructor the enumeration is already pointing to the first valid term if such a term exists. 
public	TokenNamepublic	
WildcardTermEnum	TokenNameIdentifier	 Wildcard Term Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searchTerm	TokenNameIdentifier	 search Term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
searchTermText	TokenNameIdentifier	 search Term Text
=	TokenNameEQUAL	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sidx	TokenNameIdentifier	 sidx
=	TokenNameEQUAL	
searchTermText	TokenNameIdentifier	 search Term Text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WILDCARD_STRING	TokenNameIdentifier	 WILDCARD  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
cidx	TokenNameIdentifier	 cidx
=	TokenNameEQUAL	
searchTermText	TokenNameIdentifier	 search Term Text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WILDCARD_CHAR	TokenNameIdentifier	 WILDCARD  CHAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
sidx	TokenNameIdentifier	 sidx
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
cidx	TokenNameIdentifier	 cidx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cidx	TokenNameIdentifier	 cidx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
cidx	TokenNameIdentifier	 cidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pre	TokenNameIdentifier	 pre
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
preLen	TokenNameIdentifier	 pre Len
=	TokenNameEQUAL	
pre	TokenNameIdentifier	 pre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
searchTermText	TokenNameIdentifier	 search Term Text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
preLen	TokenNameIdentifier	 pre Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEnum	TokenNameIdentifier	 set Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
searchTerm	TokenNameIdentifier	 search Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pre	TokenNameIdentifier	 pre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
searchText	TokenNameIdentifier	 search Text
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
searchText	TokenNameIdentifier	 search Text
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
pre	TokenNameIdentifier	 pre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wildcardEquals	TokenNameIdentifier	 wildcard Equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
searchText	TokenNameIdentifier	 search Text
,	TokenNameCOMMA	
preLen	TokenNameIdentifier	 pre Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
endEnum	TokenNameIdentifier	 end Enum
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endEnum	TokenNameIdentifier	 end Enum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/******************************************** * String equality with support for wildcards ********************************************/	TokenNameCOMMENT_JAVADOC	****************************************** String equality with support for wildcards *******************************************
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
WILDCARD_STRING	TokenNameIdentifier	 WILDCARD  STRING
=	TokenNameEQUAL	
'*'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
WILDCARD_CHAR	TokenNameIdentifier	 WILDCARD  CHAR
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Determines if a word matches a wildcard pattern. * <small>Work released by Granta Design Ltd after originally being done on * company time.</small> */	TokenNameCOMMENT_JAVADOC	 Determines if a word matches a wildcard pattern. <small>Work released by Granta Design Ltd after originally being done on company time.</small> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
wildcardEquals	TokenNameIdentifier	 wildcard Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
int	TokenNameint	
patternIdx	TokenNameIdentifier	 pattern Idx
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
int	TokenNameint	
stringIdx	TokenNameIdentifier	 string Idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
patternIdx	TokenNameIdentifier	 pattern Idx
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stringIdx	TokenNameIdentifier	 string Idx
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// End of string yet? 	TokenNameCOMMENT_LINE	End of string yet? 
boolean	TokenNameboolean	
sEnd	TokenNameIdentifier	 s End
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>=	TokenNameGREATER_EQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// End of pattern yet? 	TokenNameCOMMENT_LINE	End of pattern yet? 
boolean	TokenNameboolean	
pEnd	TokenNameIdentifier	 p End
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>=	TokenNameGREATER_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we're looking at the end of the string... 	TokenNameCOMMENT_LINE	If we're looking at the end of the string... 
if	TokenNameif	
(	TokenNameLPAREN	
sEnd	TokenNameIdentifier	 s End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume the only thing left on the pattern is/are wildcards 	TokenNameCOMMENT_LINE	Assume the only thing left on the pattern is/are wildcards 
boolean	TokenNameboolean	
justWildcardsLeft	TokenNameIdentifier	 just Wildcards Left
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Current wildcard position 	TokenNameCOMMENT_LINE	Current wildcard position 
int	TokenNameint	
wildcardSearchPos	TokenNameIdentifier	 wildcard Search Pos
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
// While we haven't found the end of the pattern, 	TokenNameCOMMENT_LINE	While we haven't found the end of the pattern, 
// and haven't encountered any non-wildcard characters 	TokenNameCOMMENT_LINE	and haven't encountered any non-wildcard characters 
while	TokenNamewhile	
(	TokenNameLPAREN	
wildcardSearchPos	TokenNameIdentifier	 wildcard Search Pos
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
justWildcardsLeft	TokenNameIdentifier	 just Wildcards Left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check the character at the current position 	TokenNameCOMMENT_LINE	Check the character at the current position 
char	TokenNamechar	
wildchar	TokenNameIdentifier	 wildchar
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
wildcardSearchPos	TokenNameIdentifier	 wildcard Search Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If it's not a wildcard character, then there is more 	TokenNameCOMMENT_LINE	If it's not a wildcard character, then there is more 
// pattern information after this/these wildcards. 	TokenNameCOMMENT_LINE	pattern information after this/these wildcards. 
if	TokenNameif	
(	TokenNameLPAREN	
wildchar	TokenNameIdentifier	 wildchar
!=	TokenNameNOT_EQUAL	
WILDCARD_CHAR	TokenNameIdentifier	 WILDCARD  CHAR
&&	TokenNameAND_AND	
wildchar	TokenNameIdentifier	 wildchar
!=	TokenNameNOT_EQUAL	
WILDCARD_STRING	TokenNameIdentifier	 WILDCARD  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
justWildcardsLeft	TokenNameIdentifier	 just Wildcards Left
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// to prevent "cat" matches "ca??" 	TokenNameCOMMENT_LINE	to prevent "cat" matches "ca??" 
if	TokenNameif	
(	TokenNameLPAREN	
wildchar	TokenNameIdentifier	 wildchar
==	TokenNameEQUAL_EQUAL	
WILDCARD_CHAR	TokenNameIdentifier	 WILDCARD  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look at the next character 	TokenNameCOMMENT_LINE	Look at the next character 
wildcardSearchPos	TokenNameIdentifier	 wildcard Search Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This was a prefix wildcard search, and we've matched, so 	TokenNameCOMMENT_LINE	This was a prefix wildcard search, and we've matched, so 
// return true. 	TokenNameCOMMENT_LINE	return true. 
if	TokenNameif	
(	TokenNameLPAREN	
justWildcardsLeft	TokenNameIdentifier	 just Wildcards Left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we've gone past the end of the string, or the pattern, 	TokenNameCOMMENT_LINE	If we've gone past the end of the string, or the pattern, 
// return false. 	TokenNameCOMMENT_LINE	return false. 
if	TokenNameif	
(	TokenNameLPAREN	
sEnd	TokenNameIdentifier	 s End
||	TokenNameOR_OR	
pEnd	TokenNameIdentifier	 p End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Match a single character, so continue. 	TokenNameCOMMENT_LINE	Match a single character, so continue. 
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
WILDCARD_CHAR	TokenNameIdentifier	 WILDCARD  CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
WILDCARD_STRING	TokenNameIdentifier	 WILDCARD  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Look at the character beyond the '*' characters. 	TokenNameCOMMENT_LINE	Look at the character beyond the '*' characters. 
while	TokenNamewhile	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
<	TokenNameLESS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
WILDCARD_STRING	TokenNameIdentifier	 WILDCARD  STRING
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
// Examine the string, starting at the last character. 	TokenNameCOMMENT_LINE	Examine the string, starting at the last character. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wildcardEquals	TokenNameIdentifier	 wildcard Equals
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
