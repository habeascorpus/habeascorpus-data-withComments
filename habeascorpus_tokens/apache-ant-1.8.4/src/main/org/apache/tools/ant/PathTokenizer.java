/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
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
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * A Path tokenizer takes a path and returns the components that make up * that path. * * The path can use path separators of either ':' or ';' and file separators * of either '/' or '\'. * */	TokenNameCOMMENT_JAVADOC	 A Path tokenizer takes a path and returns the components that make up that path. * The path can use path separators of either ':' or ';' and file separators of either '/' or '\'. 
public	TokenNamepublic	
class	TokenNameclass	
PathTokenizer	TokenNameIdentifier	 Path Tokenizer
{	TokenNameLBRACE	
/** * A tokenizer to break the string up based on the ':' or ';' separators. */	TokenNameCOMMENT_JAVADOC	 A tokenizer to break the string up based on the ':' or ';' separators. 
private	TokenNameprivate	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
/** * A String which stores any path components which have been read ahead * due to DOS filesystem compensation. */	TokenNameCOMMENT_JAVADOC	 A String which stores any path components which have been read ahead due to DOS filesystem compensation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A boolean that determines if we are running on Novell NetWare, which * exhibits slightly different path name characteristics (multi-character * volume / drive names) */	TokenNameCOMMENT_JAVADOC	 A boolean that determines if we are running on Novell NetWare, which exhibits slightly different path name characteristics (multi-character volume / drive names) 
private	TokenNameprivate	
boolean	TokenNameboolean	
onNetWare	TokenNameIdentifier	 on Net Ware
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flag to indicate whether or not we are running on a platform with a * DOS style filesystem */	TokenNameCOMMENT_JAVADOC	 Flag to indicate whether or not we are running on a platform with a DOS style filesystem 
private	TokenNameprivate	
boolean	TokenNameboolean	
dosStyleFilesystem	TokenNameIdentifier	 dos Style Filesystem
;	TokenNameSEMICOLON	
/** * Constructs a path tokenizer for the specified path. * * @param path The path to tokenize. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a path tokenizer for the specified path. * @param path The path to tokenize. Must not be <code>null</code>. 
public	TokenNamepublic	
PathTokenizer	TokenNameIdentifier	 Path Tokenizer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
onNetWare	TokenNameIdentifier	 on Net Ware
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For NetWare, use the boolean=true mode, so we can use delimiter 	TokenNameCOMMENT_LINE	For NetWare, use the boolean=true mode, so we can use delimiter 
// information to make a better decision later. 	TokenNameCOMMENT_LINE	information to make a better decision later. 
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
":;"	TokenNameStringLiteral	:;
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// on Windows and Unix, we can ignore delimiters and still have 	TokenNameCOMMENT_LINE	on Windows and Unix, we can ignore delimiters and still have 
// enough information to tokenize correctly. 	TokenNameCOMMENT_LINE	enough information to tokenize correctly. 
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
":;"	TokenNameStringLiteral	:;
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dosStyleFilesystem	TokenNameIdentifier	 dos Style Filesystem
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
==	TokenNameEQUAL_EQUAL	
';'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if there are more path elements available from this tokenizer's * path. If this method returns <code>true</code>, then a subsequent call * to nextToken will successfully return a token. * * @return <code>true</code> if and only if there is at least one token * in the string after the current position; <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if there are more path elements available from this tokenizer's path. If this method returns <code>true</code>, then a subsequent call to nextToken will successfully return a token. * @return <code>true</code> if and only if there is at least one token in the string after the current position; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next path element from this tokenizer. * * @return the next path element from this tokenizer. * * @exception NoSuchElementException if there are no more elements in this * tokenizer's path. */	TokenNameCOMMENT_JAVADOC	 Returns the next path element from this tokenizer. * @return the next path element from this tokenizer. * @exception NoSuchElementException if there are no more elements in this tokenizer's path. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
lookahead	TokenNameIdentifier	 lookahead
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
onNetWare	TokenNameIdentifier	 on Net Ware
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
dosStyleFilesystem	TokenNameIdentifier	 dos Style Filesystem
&&	TokenNameAND_AND	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are on a dos style system so this path could be a drive 	TokenNameCOMMENT_LINE	we are on a dos style system so this path could be a drive 
// spec. We look at the next token 	TokenNameCOMMENT_LINE	spec. We look at the next token 
String	TokenNameIdentifier	 String
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
||	TokenNameOR_OR	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we know we are on a DOS style platform and the next path 	TokenNameCOMMENT_LINE	we know we are on a DOS style platform and the next path 
// starts with a slash or backslash, so we know this is a 	TokenNameCOMMENT_LINE	starts with a slash or backslash, so we know this is a 
// drive spec 	TokenNameCOMMENT_LINE	drive spec 
token	TokenNameIdentifier	 token
+=	TokenNamePLUS_EQUAL	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
nextToken	TokenNameIdentifier	 next Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// store the token just read for next time 	TokenNameCOMMENT_LINE	store the token just read for next time 
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
nextToken	TokenNameIdentifier	 next Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we are on NetWare, tokenizing is handled a little differently, 	TokenNameCOMMENT_LINE	we are on NetWare, tokenizing is handled a little differently, 
// due to the fact that NetWare has multiple-character volume names. 	TokenNameCOMMENT_LINE	due to the fact that NetWare has multiple-character volume names. 
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore ";" and get the next token 	TokenNameCOMMENT_LINE	ignore ";" and get the next token 
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this path could be a drive spec, so look at the next token 	TokenNameCOMMENT_LINE	this path could be a drive spec, so look at the next token 
String	TokenNameIdentifier	 String
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure we aren't going to get the path separator next 	TokenNameCOMMENT_LINE	make sure we aren't going to get the path separator next 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
".."	TokenNameStringLiteral	..
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it indeed is a drive spec, get the next bit 	TokenNameCOMMENT_LINE	it indeed is a drive spec, get the next bit 
String	TokenNameIdentifier	 String
oneMore	TokenNameIdentifier	 one More
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
oneMore	TokenNameIdentifier	 one More
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
+=	TokenNamePLUS_EQUAL	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
oneMore	TokenNameIdentifier	 one More
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
+=	TokenNamePLUS_EQUAL	
":"	TokenNameStringLiteral	:
;	TokenNameSEMICOLON	
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
oneMore	TokenNameIdentifier	 one More
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// implicit else: ignore the ':' since we have either a 	TokenNameCOMMENT_LINE	implicit else: ignore the ':' since we have either a 
// UNIX or a relative path 	TokenNameCOMMENT_LINE	UNIX or a relative path 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// store the token just read for next time 	TokenNameCOMMENT_LINE	store the token just read for next time 
lookahead	TokenNameIdentifier	 lookahead
=	TokenNameEQUAL	
nextToken	TokenNameIdentifier	 next Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
