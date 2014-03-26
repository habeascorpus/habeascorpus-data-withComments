package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
path	TokenNameIdentifier	 path
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Tokenizer	TokenNameIdentifier	 Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
;	TokenNameSEMICOLON	
/** * Tokenizer for path-like hierarchies. * <p> * Take something like: * * <pre> * /something/something/else * </pre> * * and make: * * <pre> * /something * /something/something * /something/something/else * </pre> */	TokenNameCOMMENT_JAVADOC	 Tokenizer for path-like hierarchies. <p> Take something like: * <pre> /something/something/else </pre> * and make: * <pre> /something /something/something /something/something/else </pre> 
public	TokenNamepublic	
class	TokenNameclass	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
DEFAULT_SKIP	TokenNameIdentifier	 DEFAULT  SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
DEFAULT_SKIP	TokenNameIdentifier	 DEFAULT  SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
char	TokenNamechar	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
DEFAULT_SKIP	TokenNameIdentifier	 DEFAULT  SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
char	TokenNamechar	
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
int	TokenNameint	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathHierarchyTokenizer	TokenNameIdentifier	 Path Hierarchy Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
char	TokenNamechar	
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
int	TokenNameint	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"bufferSize cannot be negative"	TokenNameStringLiteral	bufferSize cannot be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"skip cannot be negative"	TokenNameStringLiteral	skip cannot be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delimiter	TokenNameIdentifier	 delimiter
=	TokenNameEQUAL	
delimiter	TokenNameIdentifier	 delimiter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
replacement	TokenNameIdentifier	 replacement
=	TokenNameEQUAL	
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
resultToken	TokenNameIdentifier	 result Token
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_DELIMITER	TokenNameIdentifier	 DEFAULT  DELIMITER
=	TokenNameEQUAL	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SKIP	TokenNameIdentifier	 DEFAULT  SKIP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posAtt	TokenNameIdentifier	 pos Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
endDelimiter	TokenNameIdentifier	 end Delimiter
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuilder	TokenNameIdentifier	 String Builder
resultToken	TokenNameIdentifier	 result Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
charsRead	TokenNameIdentifier	 chars Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
resultToken	TokenNameIdentifier	 result Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posAtt	TokenNameIdentifier	 pos Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
posAtt	TokenNameIdentifier	 pos Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endDelimiter	TokenNameIdentifier	 end Delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
endDelimiter	TokenNameIdentifier	 end Delimiter
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charsRead	TokenNameIdentifier	 chars Read
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
>	TokenNameGREATER	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
startPosition	TokenNameIdentifier	 start Position
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
added	TokenNameIdentifier	 added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
added	TokenNameIdentifier	 added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
skipped	TokenNameIdentifier	 skipped
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
>	TokenNameGREATER	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
delimiter	TokenNameIdentifier	 delimiter
?	TokenNameQUESTION	
replacement	TokenNameIdentifier	 replacement
:	TokenNameCOLON	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startPosition	TokenNameIdentifier	 start Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
>	TokenNameGREATER	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endDelimiter	TokenNameIdentifier	 end Delimiter
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
skipped	TokenNameIdentifier	 skipped
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
>	TokenNameGREATER	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startPosition	TokenNameIdentifier	 start Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipped	TokenNameIdentifier	 skipped
>	TokenNameGREATER	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startPosition	TokenNameIdentifier	 start Position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
startPosition	TokenNameIdentifier	 start Position
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set final offset 	TokenNameCOMMENT_LINE	set final offset 
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
charsRead	TokenNameIdentifier	 chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultToken	TokenNameIdentifier	 result Token
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charsRead	TokenNameIdentifier	 chars Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endDelimiter	TokenNameIdentifier	 end Delimiter
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
skipped	TokenNameIdentifier	 skipped
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
