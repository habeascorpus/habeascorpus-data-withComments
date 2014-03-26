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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * NameAbbreviator generates abbreviated logger and class names. * */	TokenNameCOMMENT_JAVADOC	 NameAbbreviator generates abbreviated logger and class names. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
{	TokenNameLBRACE	
/** * Default (no abbreviation) abbreviator. */	TokenNameCOMMENT_JAVADOC	 Default (no abbreviation) abbreviator. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
NOPAbbreviator	TokenNameIdentifier	 NOP Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets an abbreviator. * * For example, "%logger{2}" will output only 2 elements of the logger name, * %logger{-2} will drop 2 elements from the logger name, * "%logger{1.}" will output only the first character of the non-final elements in the name, * "%logger{1~.2~} will output the first character of the first element, two characters of * the second and subsequent elements and will use a tilde to indicate abbreviated characters. * * @param pattern abbreviation pattern. * @return abbreviator, will not be null. */	TokenNameCOMMENT_JAVADOC	 Gets an abbreviator. * For example, "%logger{2}" will output only 2 elements of the logger name, %logger{-2} will drop 2 elements from the logger name, "%logger{1.}" will output only the first character of the non-final elements in the name, "%logger{1~.2~} will output the first character of the first element, two characters of the second and subsequent elements and will use a tilde to indicate abbreviated characters. * @param pattern abbreviation pattern. @return abbreviator, will not be null. 
public	TokenNamepublic	
static	TokenNamestatic	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
getAbbreviator	TokenNameIdentifier	 get Abbreviator
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if pattern is just spaces and numbers then 	TokenNameCOMMENT_LINE	if pattern is just spaces and numbers then 
// use MaxElementAbbreviator 	TokenNameCOMMENT_LINE	use MaxElementAbbreviator 
String	TokenNameIdentifier	 String
trimmed	TokenNameIdentifier	 trimmed
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// if all blanks and digits 	TokenNameCOMMENT_LINE	if all blanks and digits 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MaxElementAbbreviator	TokenNameIdentifier	 Max Element Abbreviator
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DropElementAbbreviator	TokenNameIdentifier	 Drop Element Abbreviator
(	TokenNameLPAREN	
-	TokenNameMINUS	
elements	TokenNameIdentifier	 elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
fragments	TokenNameIdentifier	 fragments
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ellipsis	TokenNameIdentifier	 ellipsis
;	TokenNameSEMICOLON	
int	TokenNameint	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ellipsisPos	TokenNameIdentifier	 ellipsis Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
ellipsisPos	TokenNameIdentifier	 ellipsis Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
ellipsisPos	TokenNameIdentifier	 ellipsis Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ellipsis	TokenNameIdentifier	 ellipsis
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ellipsisPos	TokenNameIdentifier	 ellipsis Pos
<	TokenNameLESS	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ellipsis	TokenNameIdentifier	 ellipsis
=	TokenNameEQUAL	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ellipsisPos	TokenNameIdentifier	 ellipsis Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ellipsis	TokenNameIdentifier	 ellipsis
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ellipsis	TokenNameIdentifier	 ellipsis
=	TokenNameEQUAL	
'\0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
(	TokenNameLPAREN	
charCount	TokenNameIdentifier	 char Count
,	TokenNameCOMMA	
ellipsis	TokenNameIdentifier	 ellipsis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PatternAbbreviator	TokenNameIdentifier	 Pattern Abbreviator
(	TokenNameLPAREN	
fragments	TokenNameIdentifier	 fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// no matching abbreviation, return defaultAbbreviator 	TokenNameCOMMENT_LINE	no matching abbreviation, return defaultAbbreviator 
// 	TokenNameCOMMENT_LINE	 
return	TokenNamereturn	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets default abbreviator. * * @return default abbreviator. */	TokenNameCOMMENT_JAVADOC	 Gets default abbreviator. * @return default abbreviator. 
public	TokenNamepublic	
static	TokenNamestatic	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
getDefaultAbbreviator	TokenNameIdentifier	 get Default Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abbreviates a name in a StringBuffer. * * @param nameStart starting position of name in buf. * @param buf buffer, may not be null. */	TokenNameCOMMENT_JAVADOC	 Abbreviates a name in a StringBuffer. * @param nameStart starting position of name in buf. @param buf buffer, may not be null. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Abbreviator that simply appends full name to buffer. */	TokenNameCOMMENT_JAVADOC	 Abbreviator that simply appends full name to buffer. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NOPAbbreviator	TokenNameIdentifier	 NOP Abbreviator
extends	TokenNameextends	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
{	TokenNameLBRACE	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NOPAbbreviator	TokenNameIdentifier	 NOP Abbreviator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Abbreviator that drops starting path elements. */	TokenNameCOMMENT_JAVADOC	 Abbreviator that drops starting path elements. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MaxElementAbbreviator	TokenNameIdentifier	 Max Element Abbreviator
extends	TokenNameextends	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
{	TokenNameLBRACE	
/** * Maximum number of path elements to output. */	TokenNameCOMMENT_JAVADOC	 Maximum number of path elements to output. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Create new instance. * @param count maximum number of path elements to output. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param count maximum number of path elements to output. 
public	TokenNamepublic	
MaxElementAbbreviator	TokenNameIdentifier	 Max Element Abbreviator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abbreviate name. * @param buf buffer to append abbreviation. * @param nameStart start of name to abbreviate. */	TokenNameCOMMENT_JAVADOC	 Abbreviate name. @param buf buffer to append abbreviation. @param nameStart start of name to abbreviate. 
public	TokenNamepublic	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We substract 1 from 'len' when assigning to 'end' to avoid out of 	TokenNameCOMMENT_LINE	We substract 1 from 'len' when assigning to 'end' to avoid out of 
// bounds exception in return r.substring(end+1, len). This can happen if 	TokenNameCOMMENT_LINE	bounds exception in return r.substring(end+1, len). This can happen if 
// precision is 1 and the category name ends with a dot. 	TokenNameCOMMENT_LINE	precision is 1 and the category name ends with a dot. 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
bufString	TokenNameIdentifier	 buf String
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
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
bufString	TokenNameIdentifier	 buf String
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
nameStart	TokenNameIdentifier	 name Start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Abbreviator that drops starting path elements. */	TokenNameCOMMENT_JAVADOC	 Abbreviator that drops starting path elements. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DropElementAbbreviator	TokenNameIdentifier	 Drop Element Abbreviator
extends	TokenNameextends	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
{	TokenNameLBRACE	
/** * Maximum number of path elements to output. */	TokenNameCOMMENT_JAVADOC	 Maximum number of path elements to output. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Create new instance. * @param count maximum number of path elements to output. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param count maximum number of path elements to output. 
public	TokenNamepublic	
DropElementAbbreviator	TokenNameIdentifier	 Drop Element Abbreviator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abbreviate name. * @param buf buffer to append abbreviation. * @param nameStart start of name to abbreviate. */	TokenNameCOMMENT_JAVADOC	 Abbreviate name. @param buf buffer to append abbreviation. @param nameStart start of name to abbreviate. 
public	TokenNamepublic	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
nameStart	TokenNameIdentifier	 name Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fragment of an pattern abbreviator. * */	TokenNameCOMMENT_JAVADOC	 Fragment of an pattern abbreviator. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
{	TokenNameLBRACE	
/** * Count of initial characters of element to output. */	TokenNameCOMMENT_JAVADOC	 Count of initial characters of element to output. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
/** * Character used to represent dropped characters. * '\0' indicates no representation of dropped characters. */	TokenNameCOMMENT_JAVADOC	 Character used to represent dropped characters. '\0' indicates no representation of dropped characters. 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
ellipsis	TokenNameIdentifier	 ellipsis
;	TokenNameSEMICOLON	
/** * Creates a PatternAbbreviatorFragment. * @param charCount number of initial characters to preserve. * @param ellipsis character to represent elimination of characters, * '\0' if no ellipsis is desired. */	TokenNameCOMMENT_JAVADOC	 Creates a PatternAbbreviatorFragment. @param charCount number of initial characters to preserve. @param ellipsis character to represent elimination of characters, '\0' if no ellipsis is desired. 
public	TokenNamepublic	
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
charCount	TokenNameIdentifier	 char Count
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
ellipsis	TokenNameIdentifier	 ellipsis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ellipsis	TokenNameIdentifier	 ellipsis
=	TokenNameEQUAL	
ellipsis	TokenNameIdentifier	 ellipsis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abbreviate element of name. * @param buf buffer to receive element. * @param startPos starting index of name element. * @return starting index of next element. */	TokenNameCOMMENT_JAVADOC	 Abbreviate element of name. @param buf buffer to receive element. @param startPos starting index of name element. @return starting index of next element. 
public	TokenNamepublic	
int	TokenNameint	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextDot	TokenNameIdentifier	 next Dot
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextDot	TokenNameIdentifier	 next Dot
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nextDot	TokenNameIdentifier	 next Dot
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
>	TokenNameGREATER	
charCount	TokenNameIdentifier	 char Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
startPos	TokenNameIdentifier	 start Pos
+	TokenNamePLUS	
charCount	TokenNameIdentifier	 char Count
,	TokenNameCOMMA	
nextDot	TokenNameIdentifier	 next Dot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextDot	TokenNameIdentifier	 next Dot
=	TokenNameEQUAL	
startPos	TokenNameIdentifier	 start Pos
+	TokenNamePLUS	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ellipsis	TokenNameIdentifier	 ellipsis
!=	TokenNameNOT_EQUAL	
'\0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
nextDot	TokenNameIdentifier	 next Dot
,	TokenNameCOMMA	
ellipsis	TokenNameIdentifier	 ellipsis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextDot	TokenNameIdentifier	 next Dot
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
nextDot	TokenNameIdentifier	 next Dot
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nextDot	TokenNameIdentifier	 next Dot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pattern abbreviator. * * */	TokenNameCOMMENT_JAVADOC	 Pattern abbreviator. * 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
PatternAbbreviator	TokenNameIdentifier	 Pattern Abbreviator
extends	TokenNameextends	
NameAbbreviator	TokenNameIdentifier	 Name Abbreviator
{	TokenNameLBRACE	
/** * Element abbreviation patterns. */	TokenNameCOMMENT_JAVADOC	 Element abbreviation patterns. 
private	TokenNameprivate	
final	TokenNamefinal	
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fragments	TokenNameIdentifier	 fragments
;	TokenNameSEMICOLON	
/** * Create PatternAbbreviator. * * @param fragments element abbreviation patterns. */	TokenNameCOMMENT_JAVADOC	 Create PatternAbbreviator. * @param fragments element abbreviation patterns. 
public	TokenNamepublic	
PatternAbbreviator	TokenNameIdentifier	 Pattern Abbreviator
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
fragments	TokenNameIdentifier	 fragments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"fragments must have at least one element"	TokenNameStringLiteral	fragments must have at least one element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fragments	TokenNameIdentifier	 fragments
=	TokenNameEQUAL	
new	TokenNamenew	
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
[	TokenNameLBRACKET	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fragments	TokenNameIdentifier	 fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abbreviate name. * @param buf buffer that abbreviated name is appended. * @param nameStart start of name. */	TokenNameCOMMENT_JAVADOC	 Abbreviate name. @param buf buffer that abbreviated name is appended. @param nameStart start of name. 
public	TokenNamepublic	
void	TokenNamevoid	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nameStart	TokenNameIdentifier	 name Start
,	TokenNameCOMMA	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// all non-terminal patterns are executed once 	TokenNameCOMMENT_LINE	all non-terminal patterns are executed once 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nameStart	TokenNameIdentifier	 name Start
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
fragments	TokenNameIdentifier	 fragments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// last pattern in executed repeatedly 	TokenNameCOMMENT_LINE	last pattern in executed repeatedly 
// 	TokenNameCOMMENT_LINE	 
PatternAbbreviatorFragment	TokenNameIdentifier	 Pattern Abbreviator Fragment
terminalFragment	TokenNameIdentifier	 terminal Fragment
=	TokenNameEQUAL	
fragments	TokenNameIdentifier	 fragments
[	TokenNameLBRACKET	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
terminalFragment	TokenNameIdentifier	 terminal Fragment
.	TokenNameDOT	
abbreviate	TokenNameIdentifier	 abbreviate
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
