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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * <p>This is a utility class used by selectors and DirectoryScanner. The * functionality more properly belongs just to selectors, but unfortunately * DirectoryScanner exposed these as protected methods. Thus we have to * support any subclasses of DirectoryScanner that may access these methods. * </p> * <p>This is a Singleton.</p> * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 <p>This is a utility class used by selectors and DirectoryScanner. The functionality more properly belongs just to selectors, but unfortunately DirectoryScanner exposed these as protected methods. Thus we have to support any subclasses of DirectoryScanner that may access these methods. </p> <p>This is a Singleton.</p> * @since 1.5 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SelectorUtils	TokenNameIdentifier	 Selector Utils
{	TokenNameLBRACE	
/** * The pattern that matches an arbitrary number of directories. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The pattern that matches an arbitrary number of directories. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
=	TokenNameEQUAL	
"**"	TokenNameStringLiteral	**
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SelectorUtils	TokenNameIdentifier	 Selector Utils
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
SelectorUtils	TokenNameIdentifier	 Selector Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private Constructor */	TokenNameCOMMENT_JAVADOC	 Private Constructor 
private	TokenNameprivate	
SelectorUtils	TokenNameIdentifier	 Selector Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Retrieves the instance of the Singleton. * @return singleton instance */	TokenNameCOMMENT_JAVADOC	 Retrieves the instance of the Singleton. @return singleton instance 
public	TokenNamepublic	
static	TokenNamestatic	
SelectorUtils	TokenNameIdentifier	 Selector Utils
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches the start of a given * pattern up to the first "**". * <p> * This is not a general purpose test and should only be used if you * can live with false positives. For example, <code>pattern=**\a</code> * and <code>str=b</code> will yield <code>true</code>. * * @param pattern The pattern to match against. Must not be * <code>null</code>. * @param str The path to match, as a String. Must not be * <code>null</code>. * * @return whether or not a given path matches the start of a given * pattern up to the first "**". */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches the start of a given pattern up to the first "**". <p> This is not a general purpose test and should only be used if you can live with false positives. For example, <code>pattern=**\a</code> and <code>str=b</code> will yield <code>true</code>. * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The path to match, as a String. Must not be <code>null</code>. * @return whether or not a given path matches the start of a given pattern up to the first "**". 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches the start of a given * pattern up to the first "**". * <p> * This is not a general purpose test and should only be used if you * can live with false positives. For example, <code>pattern=**\a</code> * and <code>str=b</code> will yield <code>true</code>. * * @param pattern The pattern to match against. Must not be * <code>null</code>. * @param str The path to match, as a String. Must not be * <code>null</code>. * @param isCaseSensitive Whether or not matching should be performed * case sensitively. * * @return whether or not a given path matches the start of a given * pattern up to the first "**". */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches the start of a given pattern up to the first "**". <p> This is not a general purpose test and should only be used if you can live with false positives. For example, <code>pattern=**\a</code> and <code>str=b</code> will yield <code>true</code>. * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The path to match, as a String. Must not be <code>null</code>. @param isCaseSensitive Whether or not matching should be performed case sensitively. * @return whether or not a given path matches the start of a given pattern up to the first "**". 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When str starts with a File.separator, pattern has to start with a 	TokenNameCOMMENT_LINE	When str starts with a File.separator, pattern has to start with a 
// File.separator. 	TokenNameCOMMENT_LINE	File.separator. 
// When pattern starts with a File.separator, str has to start with a 	TokenNameCOMMENT_LINE	When pattern starts with a File.separator, str has to start with a 
// File.separator. 	TokenNameCOMMENT_LINE	File.separator. 
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patDirs	TokenNameIdentifier	 pat Dirs
=	TokenNameEQUAL	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strDirs	TokenNameIdentifier	 str Dirs
=	TokenNameEQUAL	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
patDirs	TokenNameIdentifier	 pat Dirs
,	TokenNameCOMMA	
strDirs	TokenNameIdentifier	 str Dirs
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches the start of a given * pattern up to the first "**". * <p> * This is not a general purpose test and should only be used if you * can live with false positives. For example, <code>pattern=**\a</code> * and <code>str=b</code> will yield <code>true</code>. * * @param patDirs The tokenized pattern to match against. Must not be * <code>null</code>. * @param strDirs The tokenized path to match. Must not be * <code>null</code>. * @param isCaseSensitive Whether or not matching should be performed * case sensitively. * * @return whether or not a given path matches the start of a given * pattern up to the first "**". */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches the start of a given pattern up to the first "**". <p> This is not a general purpose test and should only be used if you can live with false positives. For example, <code>pattern=**\a</code> and <code>str=b</code> will yield <code>true</code>. * @param patDirs The tokenized pattern to match against. Must not be <code>null</code>. @param strDirs The tokenized path to match. Must not be <code>null</code>. @param isCaseSensitive Whether or not matching should be performed case sensitively. * @return whether or not a given path matches the start of a given pattern up to the first "**". 
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPatternStart	TokenNameIdentifier	 match Pattern Start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patDirs	TokenNameIdentifier	 pat Dirs
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strDirs	TokenNameIdentifier	 str Dirs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
patIdxStart	TokenNameIdentifier	 pat Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
patIdxEnd	TokenNameIdentifier	 pat Idx End
=	TokenNameEQUAL	
patDirs	TokenNameIdentifier	 pat Dirs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxStart	TokenNameIdentifier	 str Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxEnd	TokenNameIdentifier	 str Idx End
=	TokenNameEQUAL	
strDirs	TokenNameIdentifier	 str Dirs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// up to first '**' 	TokenNameCOMMENT_LINE	up to first '**' 
while	TokenNamewhile	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
&&	TokenNameAND_AND	
strIdxStart	TokenNameIdentifier	 str Idx Start
<=	TokenNameLESS_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
patDir	TokenNameIdentifier	 pat Dir
=	TokenNameEQUAL	
patDirs	TokenNameIdentifier	 pat Dirs
[	TokenNameLBRACKET	
patIdxStart	TokenNameIdentifier	 pat Idx Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
,	TokenNameCOMMA	
strDirs	TokenNameIdentifier	 str Dirs
[	TokenNameLBRACKET	
strIdxStart	TokenNameIdentifier	 str Idx Start
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
patIdxStart	TokenNameIdentifier	 pat Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
strIdxStart	TokenNameIdentifier	 str Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:SimplifyBooleanReturnCheck OFF 	TokenNameCOMMENT_LINE	CheckStyle:SimplifyBooleanReturnCheck OFF 
// Check turned off as the code needs the comments for the various 	TokenNameCOMMENT_LINE	Check turned off as the code needs the comments for the various 
// code paths. 	TokenNameCOMMENT_LINE	code paths. 
if	TokenNameif	
(	TokenNameLPAREN	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String is exhausted 	TokenNameCOMMENT_LINE	String is exhausted 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
>	TokenNameGREATER	
patIdxEnd	TokenNameIdentifier	 pat Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String not exhausted, but pattern is. Failure. 	TokenNameCOMMENT_LINE	String not exhausted, but pattern is. Failure. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pattern now holds ** while string is not exhausted 	TokenNameCOMMENT_LINE	pattern now holds ** while string is not exhausted 
// this will generate false positives but we can live with that. 	TokenNameCOMMENT_LINE	this will generate false positives but we can live with that. 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches a given pattern. * * If you need to call this method multiple times with the same * pattern you should rather use TokenizedPath * * @see TokenizedPath * * @param pattern The pattern to match against. Must not be * <code>null</code>. * @param str The path to match, as a String. Must not be * <code>null</code>. * * @return <code>true</code> if the pattern matches against the string, * or <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches a given pattern. * If you need to call this method multiple times with the same pattern you should rather use TokenizedPath * @see TokenizedPath * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The path to match, as a String. Must not be <code>null</code>. * @return <code>true</code> if the pattern matches against the string, or <code>false</code> otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patDirs	TokenNameIdentifier	 pat Dirs
=	TokenNameEQUAL	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
patDirs	TokenNameIdentifier	 pat Dirs
,	TokenNameCOMMA	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a given path matches a given pattern. * * If you need to call this method multiple times with the same * pattern you should rather use TokenizedPattern * * @see TokenizedPattern * * @param pattern The pattern to match against. Must not be * <code>null</code>. * @param str The path to match, as a String. Must not be * <code>null</code>. * @param isCaseSensitive Whether or not matching should be performed * case sensitively. * * @return <code>true</code> if the pattern matches against the string, * or <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a given path matches a given pattern. * If you need to call this method multiple times with the same pattern you should rather use TokenizedPattern * @see TokenizedPattern * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The path to match, as a String. Must not be <code>null</code>. @param isCaseSensitive Whether or not matching should be performed case sensitively. * @return <code>true</code> if the pattern matches against the string, or <code>false</code> otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patDirs	TokenNameIdentifier	 pat Dirs
=	TokenNameEQUAL	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
patDirs	TokenNameIdentifier	 pat Dirs
,	TokenNameCOMMA	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Core implementation of matchPath. It is isolated so that it * can be called from TokenizedPattern. */	TokenNameCOMMENT_JAVADOC	 Core implementation of matchPath. It is isolated so that it can be called from TokenizedPattern. 
static	TokenNamestatic	
boolean	TokenNameboolean	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strDirs	TokenNameIdentifier	 str Dirs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
patIdxStart	TokenNameIdentifier	 pat Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
patIdxEnd	TokenNameIdentifier	 pat Idx End
=	TokenNameEQUAL	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxStart	TokenNameIdentifier	 str Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxEnd	TokenNameIdentifier	 str Idx End
=	TokenNameEQUAL	
strDirs	TokenNameIdentifier	 str Dirs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// up to first '**' 	TokenNameCOMMENT_LINE	up to first '**' 
while	TokenNamewhile	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
&&	TokenNameAND_AND	
strIdxStart	TokenNameIdentifier	 str Idx Start
<=	TokenNameLESS_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
patDir	TokenNameIdentifier	 pat Dir
=	TokenNameEQUAL	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
patIdxStart	TokenNameIdentifier	 pat Idx Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
,	TokenNameCOMMA	
strDirs	TokenNameIdentifier	 str Dirs
[	TokenNameLBRACKET	
strIdxStart	TokenNameIdentifier	 str Idx Start
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
patIdxStart	TokenNameIdentifier	 pat Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
strIdxStart	TokenNameIdentifier	 str Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String is exhausted 	TokenNameCOMMENT_LINE	String is exhausted 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
>	TokenNameGREATER	
patIdxEnd	TokenNameIdentifier	 pat Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String not exhausted, but pattern is. Failure. 	TokenNameCOMMENT_LINE	String not exhausted, but pattern is. Failure. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// up to last '**' 	TokenNameCOMMENT_LINE	up to last '**' 
while	TokenNamewhile	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
&&	TokenNameAND_AND	
strIdxStart	TokenNameIdentifier	 str Idx Start
<=	TokenNameLESS_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
patDir	TokenNameIdentifier	 pat Dir
=	TokenNameEQUAL	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
patIdxEnd	TokenNameIdentifier	 pat Idx End
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
patDir	TokenNameIdentifier	 pat Dir
,	TokenNameCOMMA	
strDirs	TokenNameIdentifier	 str Dirs
[	TokenNameLBRACKET	
strIdxEnd	TokenNameIdentifier	 str Idx End
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
patIdxEnd	TokenNameIdentifier	 pat Idx End
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
strIdxEnd	TokenNameIdentifier	 str Idx End
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String is exhausted 	TokenNameCOMMENT_LINE	String is exhausted 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
!=	TokenNameNOT_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
&&	TokenNameAND_AND	
strIdxStart	TokenNameIdentifier	 str Idx Start
<=	TokenNameLESS_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
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
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
==	TokenNameEQUAL_EQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// '**/**' situation, so skip one 	TokenNameCOMMENT_LINE	'**/**' situation, so skip one 
patIdxStart	TokenNameIdentifier	 pat Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the pattern between padIdxStart & padIdxTmp in str between 	TokenNameCOMMENT_LINE	Find the pattern between padIdxStart & padIdxTmp in str between 
// strIdxStart & strIdxEnd 	TokenNameCOMMENT_LINE	strIdxStart & strIdxEnd 
int	TokenNameint	
patLength	TokenNameIdentifier	 pat Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
-	TokenNameMINUS	
patIdxStart	TokenNameIdentifier	 pat Idx Start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
strLength	TokenNameIdentifier	 str Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
strIdxEnd	TokenNameIdentifier	 str Idx End
-	TokenNameMINUS	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
foundIdx	TokenNameIdentifier	 found Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
strLoop	TokenNameIdentifier	 str Loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
strLength	TokenNameIdentifier	 str Length
-	TokenNameMINUS	
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
subPat	TokenNameIdentifier	 sub Pat
=	TokenNameEQUAL	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
subStr	TokenNameIdentifier	 sub Str
=	TokenNameEQUAL	
strDirs	TokenNameIdentifier	 str Dirs
[	TokenNameLBRACKET	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
subPat	TokenNameIdentifier	 sub Pat
,	TokenNameCOMMA	
subStr	TokenNameIdentifier	 sub Str
,	TokenNameCOMMA	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
strLoop	TokenNameIdentifier	 str Loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
foundIdx	TokenNameIdentifier	 found Idx
=	TokenNameEQUAL	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
foundIdx	TokenNameIdentifier	 found Idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
patIdxStart	TokenNameIdentifier	 pat Idx Start
=	TokenNameEQUAL	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
;	TokenNameSEMICOLON	
strIdxStart	TokenNameIdentifier	 str Idx Start
=	TokenNameEQUAL	
foundIdx	TokenNameIdentifier	 found Idx
+	TokenNamePLUS	
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokenizedPattern	TokenNameIdentifier	 tokenized Pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a string matches against a pattern. * The pattern may contain two special characters:<br> * '*' means zero or more characters<br> * '?' means one and only one character * * @param pattern The pattern to match against. * Must not be <code>null</code>. * @param str The string which must be matched against the pattern. * Must not be <code>null</code>. * * @return <code>true</code> if the string matches against the pattern, * or <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a string matches against a pattern. The pattern may contain two special characters:<br> '*' means zero or more characters<br> '?' means one and only one character * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The string which must be matched against the pattern. Must not be <code>null</code>. * @return <code>true</code> if the string matches against the pattern, or <code>false</code> otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not a string matches against a pattern. * The pattern may contain two special characters:<br> * '*' means zero or more characters<br> * '?' means one and only one character * * @param pattern The pattern to match against. * Must not be <code>null</code>. * @param str The string which must be matched against the pattern. * Must not be <code>null</code>. * @param caseSensitive Whether or not matching should be performed * case sensitively. * * * @return <code>true</code> if the string matches against the pattern, * or <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests whether or not a string matches against a pattern. The pattern may contain two special characters:<br> '*' means zero or more characters<br> '?' means one and only one character * @param pattern The pattern to match against. Must not be <code>null</code>. @param str The string which must be matched against the pattern. Must not be <code>null</code>. @param caseSensitive Whether or not matching should be performed case sensitively. * @return <code>true</code> if the string matches against the pattern, or <code>false</code> otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
patArr	TokenNameIdentifier	 pat Arr
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strArr	TokenNameIdentifier	 str Arr
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
patIdxStart	TokenNameIdentifier	 pat Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
patIdxEnd	TokenNameIdentifier	 pat Idx End
=	TokenNameEQUAL	
patArr	TokenNameIdentifier	 pat Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxStart	TokenNameIdentifier	 str Idx Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
strIdxEnd	TokenNameIdentifier	 str Idx End
=	TokenNameEQUAL	
strArr	TokenNameIdentifier	 str Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
containsStar	TokenNameIdentifier	 contains Star
=	TokenNameEQUAL	
false	TokenNamefalse	
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
patArr	TokenNameIdentifier	 pat Arr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
containsStar	TokenNameIdentifier	 contains Star
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
containsStar	TokenNameIdentifier	 contains Star
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No '*'s, so we make a shortcut 	TokenNameCOMMENT_LINE	No '*'s, so we make a shortcut 
if	TokenNameif	
(	TokenNameLPAREN	
patIdxEnd	TokenNameIdentifier	 pat Idx End
!=	TokenNameNOT_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Pattern and string do not have the same size 	TokenNameCOMMENT_LINE	Pattern and string do not have the same size 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
different	TokenNameIdentifier	 different
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
strArr	TokenNameIdentifier	 str Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Character mismatch 	TokenNameCOMMENT_LINE	Character mismatch 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// String matches against pattern 	TokenNameCOMMENT_LINE	String matches against pattern 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patIdxEnd	TokenNameIdentifier	 pat Idx End
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Pattern contains only '*', which matches anything 	TokenNameCOMMENT_LINE	Pattern contains only '*', which matches anything 
}	TokenNameRBRACE	
// Process characters before first star 	TokenNameCOMMENT_LINE	Process characters before first star 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
patIdxStart	TokenNameIdentifier	 pat Idx Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
different	TokenNameIdentifier	 different
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
strArr	TokenNameIdentifier	 str Arr
[	TokenNameLBRACKET	
strIdxStart	TokenNameIdentifier	 str Idx Start
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Character mismatch 	TokenNameCOMMENT_LINE	Character mismatch 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
patIdxStart	TokenNameIdentifier	 pat Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
strIdxStart	TokenNameIdentifier	 str Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All characters in the string are used. Check if only '*'s are 	TokenNameCOMMENT_LINE	All characters in the string are used. Check if only '*'s are 
// left in the pattern. If so, we succeeded. Otherwise failure. 	TokenNameCOMMENT_LINE	left in the pattern. If so, we succeeded. Otherwise failure. 
return	TokenNamereturn	
allStars	TokenNameIdentifier	 all Stars
(	TokenNameLPAREN	
patArr	TokenNameIdentifier	 pat Arr
,	TokenNameCOMMA	
patIdxStart	TokenNameIdentifier	 pat Idx Start
,	TokenNameCOMMA	
patIdxEnd	TokenNameIdentifier	 pat Idx End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Process characters after last star 	TokenNameCOMMENT_LINE	Process characters after last star 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
patIdxEnd	TokenNameIdentifier	 pat Idx End
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
different	TokenNameIdentifier	 different
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
strArr	TokenNameIdentifier	 str Arr
[	TokenNameLBRACKET	
strIdxEnd	TokenNameIdentifier	 str Idx End
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Character mismatch 	TokenNameCOMMENT_LINE	Character mismatch 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
patIdxEnd	TokenNameIdentifier	 pat Idx End
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
strIdxEnd	TokenNameIdentifier	 str Idx End
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strIdxStart	TokenNameIdentifier	 str Idx Start
>	TokenNameGREATER	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All characters in the string are used. Check if only '*'s are 	TokenNameCOMMENT_LINE	All characters in the string are used. Check if only '*'s are 
// left in the pattern. If so, we succeeded. Otherwise failure. 	TokenNameCOMMENT_LINE	left in the pattern. If so, we succeeded. Otherwise failure. 
return	TokenNamereturn	
allStars	TokenNameIdentifier	 all Stars
(	TokenNameLPAREN	
patArr	TokenNameIdentifier	 pat Arr
,	TokenNameCOMMA	
patIdxStart	TokenNameIdentifier	 pat Idx Start
,	TokenNameCOMMA	
patIdxEnd	TokenNameIdentifier	 pat Idx End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// process pattern between stars. padIdxStart and patIdxEnd point 	TokenNameCOMMENT_LINE	process pattern between stars. padIdxStart and patIdxEnd point 
// always to a '*'. 	TokenNameCOMMENT_LINE	always to a '*'. 
while	TokenNamewhile	
(	TokenNameLPAREN	
patIdxStart	TokenNameIdentifier	 pat Idx Start
!=	TokenNameNOT_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
&&	TokenNameAND_AND	
strIdxStart	TokenNameIdentifier	 str Idx Start
<=	TokenNameLESS_EQUAL	
strIdxEnd	TokenNameIdentifier	 str Idx End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
patIdxEnd	TokenNameIdentifier	 pat Idx End
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
==	TokenNameEQUAL_EQUAL	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Two stars next to each other, skip the first one. 	TokenNameCOMMENT_LINE	Two stars next to each other, skip the first one. 
patIdxStart	TokenNameIdentifier	 pat Idx Start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the pattern between padIdxStart & padIdxTmp in str between 	TokenNameCOMMENT_LINE	Find the pattern between padIdxStart & padIdxTmp in str between 
// strIdxStart & strIdxEnd 	TokenNameCOMMENT_LINE	strIdxStart & strIdxEnd 
int	TokenNameint	
patLength	TokenNameIdentifier	 pat Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
-	TokenNameMINUS	
patIdxStart	TokenNameIdentifier	 pat Idx Start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
strLength	TokenNameIdentifier	 str Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
strIdxEnd	TokenNameIdentifier	 str Idx End
-	TokenNameMINUS	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
foundIdx	TokenNameIdentifier	 found Idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
strLoop	TokenNameIdentifier	 str Loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
strLength	TokenNameIdentifier	 str Length
-	TokenNameMINUS	
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
patArr	TokenNameIdentifier	 pat Arr
[	TokenNameLBRACKET	
patIdxStart	TokenNameIdentifier	 pat Idx Start
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
different	TokenNameIdentifier	 different
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
strArr	TokenNameIdentifier	 str Arr
[	TokenNameLBRACKET	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
strLoop	TokenNameIdentifier	 str Loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
foundIdx	TokenNameIdentifier	 found Idx
=	TokenNameEQUAL	
strIdxStart	TokenNameIdentifier	 str Idx Start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
foundIdx	TokenNameIdentifier	 found Idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
patIdxStart	TokenNameIdentifier	 pat Idx Start
=	TokenNameEQUAL	
patIdxTmp	TokenNameIdentifier	 pat Idx Tmp
;	TokenNameSEMICOLON	
strIdxStart	TokenNameIdentifier	 str Idx Start
=	TokenNameEQUAL	
foundIdx	TokenNameIdentifier	 found Idx
+	TokenNamePLUS	
patLength	TokenNameIdentifier	 pat Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// All characters in the string are used. Check if only '*'s are left 	TokenNameCOMMENT_LINE	All characters in the string are used. Check if only '*'s are left 
// in the pattern. If so, we succeeded. Otherwise failure. 	TokenNameCOMMENT_LINE	in the pattern. If so, we succeeded. Otherwise failure. 
return	TokenNamereturn	
allStars	TokenNameIdentifier	 all Stars
(	TokenNameLPAREN	
patArr	TokenNameIdentifier	 pat Arr
,	TokenNameCOMMA	
patIdxStart	TokenNameIdentifier	 pat Idx Start
,	TokenNameCOMMA	
patIdxEnd	TokenNameIdentifier	 pat Idx End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
allStars	TokenNameIdentifier	 all Stars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
different	TokenNameIdentifier	 different
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
char	TokenNamechar	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
caseSensitive	TokenNameIdentifier	 case Sensitive
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
:	TokenNameCOLON	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Breaks a path up into a Vector of path elements, tokenizing on * <code>File.separator</code>. * * @param path Path to tokenize. Must not be <code>null</code>. * * @return a Vector of path elements from the tokenized path */	TokenNameCOMMENT_JAVADOC	 Breaks a path up into a Vector of path elements, tokenizing on <code>File.separator</code>. * @param path Path to tokenize. Must not be <code>null</code>. * @return a Vector of path elements from the tokenized path 
public	TokenNamepublic	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
tokenizePath	TokenNameIdentifier	 tokenize Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizePath	TokenNameIdentifier	 tokenize Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Breaks a path up into a Vector of path elements, tokenizing on * * @param path Path to tokenize. Must not be <code>null</code>. * @param separator the separator against which to tokenize. * * @return a Vector of path elements from the tokenized path * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Breaks a path up into a Vector of path elements, tokenizing on * @param path Path to tokenize. Must not be <code>null</code>. @param separator the separator against which to tokenize. * @return a Vector of path elements from the tokenized path @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
tokenizePath	TokenNameIdentifier	 tokenize Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
dissect	TokenNameIdentifier	 dissect
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Same as {@link #tokenizePath tokenizePath} but hopefully faster. */	TokenNameCOMMENT_JAVADOC	 Same as {@link #tokenizePath tokenizePath} but hopefully faster. 
/*package*/	TokenNameCOMMENT_BLOCK	package
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
dissect	TokenNameIdentifier	 dissect
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
sep	TokenNameIdentifier	 sep
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
/*++*/	TokenNameCOMMENT_BLOCK	++
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns dependency information on these two files. If src has been * modified later than target, it returns true. If target doesn't exist, * it likewise returns true. Otherwise, target is newer than src and * is not out of date, thus the method returns false. It also returns * false if the src file doesn't even exist, since how could the * target then be out of date. * * @param src the original file * @param target the file being compared against * @param granularity the amount in seconds of slack we will give in * determining out of dateness * @return whether the target is out of date */	TokenNameCOMMENT_JAVADOC	 Returns dependency information on these two files. If src has been modified later than target, it returns true. If target doesn't exist, it likewise returns true. Otherwise, target is newer than src and is not out of date, thus the method returns false. It also returns false if the src file doesn't even exist, since how could the target then be out of date. * @param src the original file @param target the file being compared against @param granularity the amount in seconds of slack we will give in determining out of dateness @return whether the target is out of date 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOutOfDate	TokenNameIdentifier	 is Out Of Date
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
>	TokenNameGREATER	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns dependency information on these two resources. If src has been * modified later than target, it returns true. If target doesn't exist, * it likewise returns true. Otherwise, target is newer than src and * is not out of date, thus the method returns false. It also returns * false if the src file doesn't even exist, since how could the * target then be out of date. * * @param src the original resource * @param target the resource being compared against * @param granularity the int amount in seconds of slack we will give in * determining out of dateness * @return whether the target is out of date */	TokenNameCOMMENT_JAVADOC	 Returns dependency information on these two resources. If src has been modified later than target, it returns true. If target doesn't exist, it likewise returns true. Otherwise, target is newer than src and is not out of date, thus the method returns false. It also returns false if the src file doesn't even exist, since how could the target then be out of date. * @param src the original resource @param target the resource being compared against @param granularity the int amount in seconds of slack we will give in determining out of dateness @return whether the target is out of date 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOutOfDate	TokenNameIdentifier	 is Out Of Date
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Resource	TokenNameIdentifier	 Resource
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOutOfDate	TokenNameIdentifier	 is Out Of Date
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns dependency information on these two resources. If src has been * modified later than target, it returns true. If target doesn't exist, * it likewise returns true. Otherwise, target is newer than src and * is not out of date, thus the method returns false. It also returns * false if the src file doesn't even exist, since how could the * target then be out of date. * * @param src the original resource * @param target the resource being compared against * @param granularity the long amount in seconds of slack we will give in * determining out of dateness * @return whether the target is out of date */	TokenNameCOMMENT_JAVADOC	 Returns dependency information on these two resources. If src has been modified later than target, it returns true. If target doesn't exist, it likewise returns true. Otherwise, target is newer than src and is not out of date, thus the method returns false. It also returns false if the src file doesn't even exist, since how could the target then be out of date. * @param src the original resource @param target the resource being compared against @param granularity the long amount in seconds of slack we will give in determining out of dateness @return whether the target is out of date 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOutOfDate	TokenNameIdentifier	 is Out Of Date
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Resource	TokenNameIdentifier	 Resource
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sourceLastModified	TokenNameIdentifier	 source Last Modified
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
targetLastModified	TokenNameIdentifier	 target Last Modified
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
sourceLastModified	TokenNameIdentifier	 source Last Modified
==	TokenNameEQUAL_EQUAL	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
||	TokenNameOR_OR	
targetLastModified	TokenNameIdentifier	 target Last Modified
==	TokenNameEQUAL_EQUAL	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
||	TokenNameOR_OR	
(	TokenNameLPAREN	
sourceLastModified	TokenNameIdentifier	 source Last Modified
-	TokenNameMINUS	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
>	TokenNameGREATER	
targetLastModified	TokenNameIdentifier	 target Last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * "Flattens" a string by removing all whitespace (space, tab, linefeed, * carriage return, and formfeed). This uses StringTokenizer and the * default set of tokens as documented in the single arguement constructor. * * @param input a String to remove all whitespace. * @return a String that has had all whitespace removed. */	TokenNameCOMMENT_JAVADOC	 "Flattens" a string by removing all whitespace (space, tab, linefeed, carriage return, and formfeed). This uses StringTokenizer and the default set of tokens as documented in the single arguement constructor. * @param input a String to remove all whitespace. @return a String that has had all whitespace removed. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
removeWhitespace	TokenNameIdentifier	 remove Whitespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if a string contains stars or question marks * @param input a String which one wants to test for containing wildcard * @return true if the string contains at least a star or a question mark */	TokenNameCOMMENT_JAVADOC	 Tests if a string contains stars or question marks @param input a String which one wants to test for containing wildcard @return true if the string contains at least a star or a question mark 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasWildcards	TokenNameIdentifier	 has Wildcards
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * removes from a pattern all tokens to the right containing wildcards * @param input the input string * @return the leftmost part of the pattern without wildcards */	TokenNameCOMMENT_JAVADOC	 removes from a pattern all tokens to the right containing wildcards @param input the input string @return the leftmost part of the pattern without wildcards 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rtrimWildcardTokens	TokenNameIdentifier	 rtrim Wildcard Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
.	TokenNameDOT	
rtrimWildcardTokens	TokenNameIdentifier	 rtrim Wildcard Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
