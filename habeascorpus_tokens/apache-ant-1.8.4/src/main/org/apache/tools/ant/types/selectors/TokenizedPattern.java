/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Provides reusable path pattern matching. PathPattern is preferable * to equivalent SelectorUtils methods if you need to execute multiple * matching with the same pattern because here the pattern itself will * be parsed only once. * @see SelectorUtils#matchPath(String, String) * @see SelectorUtils#matchPath(String, String, boolean) * @since 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Provides reusable path pattern matching. PathPattern is preferable to equivalent SelectorUtils methods if you need to execute multiple matching with the same pattern because here the pattern itself will be parsed only once. @see SelectorUtils#matchPath(String, String) @see SelectorUtils#matchPath(String, String, boolean) @since 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
{	TokenNameLBRACE	
/** * Instance that holds no tokens at all. */	TokenNameCOMMENT_JAVADOC	 Instance that holds no tokens at all. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
EMPTY_PATTERN	TokenNameIdentifier	 EMPTY  PATTERN
=	TokenNameEQUAL	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Initialize the PathPattern by parsing it. * @param pattern The pattern to match against. Must not be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Initialize the PathPattern by parsing it. @param pattern The pattern to match against. Must not be <code>null</code>. 
public	TokenNamepublic	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches a given pattern. * * @param path The path to match, as a String. Must not be * <code>null</code>. * @param isCaseSensitive Whether or not matching should be performed * case sensitively. * * @return <code>true</code> if the pattern matches against the string, * or <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches a given pattern. * @param path The path to match, as a String. Must not be <code>null</code>. @param isCaseSensitive Whether or not matching should be performed case sensitively. * @return <code>true</code> if the pattern matches against the string, or <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not this pattern matches the start of * a path. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not this pattern matches the start of a path. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchStartOf	TokenNameIdentifier	 match Start Of
(	TokenNameLPAREN	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The pattern String */	TokenNameCOMMENT_JAVADOC	 @return The pattern String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * true if the original patterns are equal. */	TokenNameCOMMENT_JAVADOC	 true if the original patterns are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The depth (or length) of a pattern. */	TokenNameCOMMENT_JAVADOC	 The depth (or length) of a pattern. 
public	TokenNamepublic	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the tokenized pattern contain the given string? */	TokenNameCOMMENT_JAVADOC	 Does the tokenized pattern contain the given string? 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsPattern	TokenNameIdentifier	 contains Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new TokenizedPath where all tokens of this pattern to * the right containing wildcards have been removed * @return the leftmost part of the pattern without wildcards */	TokenNameCOMMENT_JAVADOC	 Returns a new TokenizedPath where all tokens of this pattern to the right containing wildcards have been removed @return the leftmost part of the pattern without wildcards 
public	TokenNamepublic	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
rtrimWildcardTokens	TokenNameIdentifier	 rtrim Wildcard Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
newLen	TokenNameIdentifier	 new Len
<	TokenNameLESS	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
newLen	TokenNameIdentifier	 new Len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
hasWildcards	TokenNameIdentifier	 has Wildcards
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newLen	TokenNameIdentifier	 new Len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newLen	TokenNameIdentifier	 new Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
.	TokenNameDOT	
EMPTY_PATH	TokenNameIdentifier	 EMPTY  PATH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newPats	TokenNameIdentifier	 new Pats
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newPats	TokenNameIdentifier	 new Pats
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newPats	TokenNameIdentifier	 new Pats
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * true if the last token equals the given string. */	TokenNameCOMMENT_JAVADOC	 true if the last token equals the given string. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new pattern without the last token of this pattern. */	TokenNameCOMMENT_JAVADOC	 Returns a new pattern without the last token of this pattern. 
public	TokenNamepublic	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
withoutLastToken	TokenNameIdentifier	 without Last Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"cant strip a token from nothing"	TokenNameStringLiteral	cant strip a token from nothing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_PATTERN	TokenNameIdentifier	 EMPTY  PATTERN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
toStrip	TokenNameIdentifier	 to Strip
=	TokenNameEQUAL	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
toStrip	TokenNameIdentifier	 to Strip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
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
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
