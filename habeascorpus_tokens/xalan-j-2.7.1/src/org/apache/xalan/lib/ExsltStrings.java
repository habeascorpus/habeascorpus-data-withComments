/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExsltStrings.java 468639 2006-10-28 06:52:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExsltStrings.java 468639 2006-10-28 06:52:33Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSet	TokenNameIdentifier	 Node Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
/** * This class contains EXSLT strings extension functions. * * It is accessed by specifying a namespace URI as follows: * <pre> * xmlns:str="http://exslt.org/strings" * </pre> * The documentation for each function has been copied from the relevant * EXSLT Implementer page. * * @see <a href="http://www.exslt.org/">EXSLT</a> * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class contains EXSLT strings extension functions. * It is accessed by specifying a namespace URI as follows: <pre> xmlns:str="http://exslt.org/strings" </pre> The documentation for each function has been copied from the relevant EXSLT Implementer page. * @see <a href="http://www.exslt.org/">EXSLT</a> @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
ExsltStrings	TokenNameIdentifier	 Exslt Strings
extends	TokenNameextends	
ExsltBase	TokenNameIdentifier	 Exslt Base
{	TokenNameLBRACE	
/** * The str:align function aligns a string within another string. * <p> * The first argument gives the target string to be aligned. The second argument gives * the padding string within which it is to be aligned. * <p> * If the target string is shorter than the padding string then a range of characters * in the padding string are repaced with those in the target string. Which characters * are replaced depends on the value of the third argument, which gives the type of * alignment. It can be one of 'left', 'right' or 'center'. If no third argument is * given or if it is not one of these values, then it defaults to left alignment. * <p> * With left alignment, the range of characters replaced by the target string begins * with the first character in the padding string. With right alignment, the range of * characters replaced by the target string ends with the last character in the padding * string. With center alignment, the range of characters replaced by the target string * is in the middle of the padding string, such that either the number of unreplaced * characters on either side of the range is the same or there is one less on the left * than there is on the right. * <p> * If the target string is longer than the padding string, then it is truncated to be * the same length as the padding string and returned. * * @param targetStr The target string * @param paddingStr The padding string * @param type The type of alignment * * @return The string after alignment */	TokenNameCOMMENT_JAVADOC	 The str:align function aligns a string within another string. <p> The first argument gives the target string to be aligned. The second argument gives the padding string within which it is to be aligned. <p> If the target string is shorter than the padding string then a range of characters in the padding string are repaced with those in the target string. Which characters are replaced depends on the value of the third argument, which gives the type of alignment. It can be one of 'left', 'right' or 'center'. If no third argument is given or if it is not one of these values, then it defaults to left alignment. <p> With left alignment, the range of characters replaced by the target string begins with the first character in the padding string. With right alignment, the range of characters replaced by the target string ends with the last character in the padding string. With center alignment, the range of characters replaced by the target string is in the middle of the padding string, such that either the number of unreplaced characters on either side of the range is the same or there is one less on the left than there is on the right. <p> If the target string is longer than the padding string, then it is truncated to be the same length as the padding string and returned. * @param targetStr The target string @param paddingStr The padding string @param type The type of alignment * @return The string after alignment 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
align	TokenNameIdentifier	 align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetStr	TokenNameIdentifier	 target Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
paddingStr	TokenNameIdentifier	 padding Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"right"	TokenNameStringLiteral	right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
targetStr	TokenNameIdentifier	 target Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"center"	TokenNameStringLiteral	center
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
+	TokenNamePLUS	
targetStr	TokenNameIdentifier	 target Str
+	TokenNamePLUS	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
+	TokenNamePLUS	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Default is left 	TokenNameCOMMENT_LINE	Default is left 
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
targetStr	TokenNameIdentifier	 target Str
+	TokenNamePLUS	
paddingStr	TokenNameIdentifier	 padding Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
targetStr	TokenNameIdentifier	 target Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * See above */	TokenNameCOMMENT_JAVADOC	 See above 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
align	TokenNameIdentifier	 align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetStr	TokenNameIdentifier	 target Str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
paddingStr	TokenNameIdentifier	 padding Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
align	TokenNameIdentifier	 align
(	TokenNameLPAREN	
targetStr	TokenNameIdentifier	 target Str
,	TokenNameCOMMA	
paddingStr	TokenNameIdentifier	 padding Str
,	TokenNameCOMMA	
"left"	TokenNameStringLiteral	left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The str:concat function takes a node set and returns the concatenation of the * string values of the nodes in that node set. If the node set is empty, it returns * an empty string. * * @param nl A node set * @return The concatenation of the string values of the nodes in that node set */	TokenNameCOMMENT_JAVADOC	 The str:concat function takes a node set and returns the concatenation of the string values of the nodes in that node set. If the node set is empty, it returns an empty string. * @param nl A node set @return The concatenation of the string values of the nodes in that node set 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
concat	TokenNameIdentifier	 concat
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The str:padding function creates a padding string of a certain length. * The first argument gives the length of the padding string to be created. * The second argument gives a string to be used to create the padding. This * string is repeated as many times as is necessary to create a string of the * length specified by the first argument; if the string is more than a character * long, it may have to be truncated to produce the required length. If no second * argument is specified, it defaults to a space (' '). If the second argument is * an empty string, str:padding returns an empty string. * * @param length The length of the padding string to be created * @param pattern The string to be used as pattern * * @return A padding string of the given length */	TokenNameCOMMENT_JAVADOC	 The str:padding function creates a padding string of a certain length. The first argument gives the length of the padding string to be created. The second argument gives a string to be used to create the padding. This string is repeated as many times as is necessary to create a string of the length specified by the first argument; if the string is more than a character long, it may have to be truncated to produce the required length. If no second argument is specified, it defaults to a space (' '). If the second argument is an empty string, str:padding returns an empty string. * @param length The length of the padding string to be created @param pattern The string to be used as pattern * @return A padding string of the given length 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
padding	TokenNameIdentifier	 padding
(	TokenNameLPAREN	
double	TokenNamedouble	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
numAdded	TokenNameIdentifier	 num Added
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numAdded	TokenNameIdentifier	 num Added
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numAdded	TokenNameIdentifier	 num Added
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above */	TokenNameCOMMENT_JAVADOC	 See above 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
padding	TokenNameIdentifier	 padding
(	TokenNameLPAREN	
double	TokenNamedouble	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
padding	TokenNameIdentifier	 padding
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The str:split function splits up a string and returns a node set of token * elements, each containing one token from the string. * <p> * The first argument is the string to be split. The second argument is a pattern * string. The string given by the first argument is split at any occurrence of * this pattern. For example: * <pre> * str:split('a, simple, list', ', ') gives the node set consisting of: * * <token>a</token> * <token>simple</token> * <token>list</token> * </pre> * If the second argument is omitted, the default is the string '&#x20;' (i.e. a space). * * @param str The string to be split * @param pattern The pattern * * @return A node set of split tokens */	TokenNameCOMMENT_JAVADOC	 The str:split function splits up a string and returns a node set of token elements, each containing one token from the string. <p> The first argument is the string to be split. The second argument is a pattern string. The string given by the first argument is split at any occurrence of this pattern. For example: <pre> str:split('a, simple, list', ', ') gives the node set consisting of: * <token>a</token> <token>simple</token> <token>list</token> </pre> If the second argument is omitted, the default is the string '&#x20;' (i.e. a space). * @param str The string to be split @param pattern The pattern * @return A node set of split tokens 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
resultSet	TokenNameIdentifier	 result Set
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultSet	TokenNameIdentifier	 result Set
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
matchIndex	TokenNameIdentifier	 match Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
&&	TokenNameAND_AND	
fromIndex	TokenNameIdentifier	 from Index
<	TokenNameLESS	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchIndex	TokenNameIdentifier	 match Index
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchIndex	TokenNameIdentifier	 match Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
matchIndex	TokenNameIdentifier	 match Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
matchIndex	TokenNameIdentifier	 match Index
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
DocumentHolder	TokenNameIdentifier	 Document Holder
.	TokenNameDOT	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Text	TokenNameIdentifier	 Text
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultSet	TokenNameIdentifier	 result Set
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultSet	TokenNameIdentifier	 result Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above */	TokenNameCOMMENT_JAVADOC	 See above 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The str:tokenize function splits up a string and returns a node set of token * elements, each containing one token from the string. * <p> * The first argument is the string to be tokenized. The second argument is a * string consisting of a number of characters. Each character in this string is * taken as a delimiting character. The string given by the first argument is split * at any occurrence of any of these characters. For example: * <pre> * str:tokenize('2001-06-03T11:40:23', '-T:') gives the node set consisting of: * * <token>2001</token> * <token>06</token> * <token>03</token> * <token>11</token> * <token>40</token> * <token>23</token> * </pre> * If the second argument is omitted, the default is the string '&#x9;&#xA;&#xD;&#x20;' * (i.e. whitespace characters). * <p> * If the second argument is an empty string, the function returns a set of token * elements, each of which holds a single character. * <p> * Note: This one is different from the tokenize extension function in the Xalan * namespace. The one in Xalan returns a set of Text nodes, while this one wraps * the Text nodes inside the token Element nodes. * * @param toTokenize The string to be tokenized * @param delims The delimiter string * * @return A node set of split token elements */	TokenNameCOMMENT_JAVADOC	 The str:tokenize function splits up a string and returns a node set of token elements, each containing one token from the string. <p> The first argument is the string to be tokenized. The second argument is a string consisting of a number of characters. Each character in this string is taken as a delimiting character. The string given by the first argument is split at any occurrence of any of these characters. For example: <pre> str:tokenize('2001-06-03T11:40:23', '-T:') gives the node set consisting of: * <token>2001</token> <token>06</token> <token>03</token> <token>11</token> <token>40</token> <token>23</token> </pre> If the second argument is omitted, the default is the string '&#x9;&#xA;&#xD;&#x20;' (i.e. whitespace characters). <p> If the second argument is an empty string, the function returns a set of token elements, each of which holds a single character. <p> Note: This one is different from the tokenize extension function in the Xalan namespace. The one in Xalan returns a set of Text nodes, while this one wraps the Text nodes inside the token Element nodes. * @param toTokenize The string to be tokenized @param delims The delimiter string * @return A node set of split token elements 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toTokenize	TokenNameIdentifier	 to Tokenize
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
delims	TokenNameIdentifier	 delims
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeSet	TokenNameIdentifier	 Node Set
resultSet	TokenNameIdentifier	 result Set
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSet	TokenNameIdentifier	 Node Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delims	TokenNameIdentifier	 delims
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
delims	TokenNameIdentifier	 delims
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
lTokenizer	TokenNameIdentifier	 l Tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
toTokenize	TokenNameIdentifier	 to Tokenize
,	TokenNameCOMMA	
delims	TokenNameIdentifier	 delims
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
DocumentHolder	TokenNameIdentifier	 Document Holder
.	TokenNameDOT	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
lTokenizer	TokenNameIdentifier	 l Tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
lTokenizer	TokenNameIdentifier	 l Tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultSet	TokenNameIdentifier	 result Set
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the delimiter is an empty string, create one token Element for 	TokenNameCOMMENT_LINE	If the delimiter is an empty string, create one token Element for 
// every single character. 	TokenNameCOMMENT_LINE	every single character. 
else	TokenNameelse	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
DocumentHolder	TokenNameIdentifier	 Document Holder
.	TokenNameDOT	
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
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
toTokenize	TokenNameIdentifier	 to Tokenize
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"token"	TokenNameStringLiteral	token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
toTokenize	TokenNameIdentifier	 to Tokenize
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultSet	TokenNameIdentifier	 result Set
.	TokenNameDOT	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultSet	TokenNameIdentifier	 result Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * See above */	TokenNameCOMMENT_JAVADOC	 See above 
public	TokenNamepublic	
static	TokenNamestatic	
NodeList	TokenNameIdentifier	 Node List
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toTokenize	TokenNameIdentifier	 to Tokenize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenize	TokenNameIdentifier	 tokenize
(	TokenNameLPAREN	
toTokenize	TokenNameIdentifier	 to Tokenize
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is not loaded until first referenced (see Java Language * Specification by Gosling/Joy/Steele, section 12.4.1) * * The static members are created when this class is first referenced, as a * lazy initialization not needing checking against null or any * synchronization. * */	TokenNameCOMMENT_JAVADOC	 This class is not loaded until first referenced (see Java Language Specification by Gosling/Joy/Steele, section 12.4.1) * The static members are created when this class is first referenced, as a lazy initialization not needing checking against null or any synchronization. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DocumentHolder	TokenNameIdentifier	 Document Holder
{	TokenNameLBRACE	
// Reuse the Document object to reduce memory usage. 	TokenNameCOMMENT_LINE	Reuse the Document object to reduce memory usage. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
m_doc	TokenNameIdentifier	 m doc
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_doc	TokenNameIdentifier	 m doc
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
pce	TokenNameIdentifier	 pce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
