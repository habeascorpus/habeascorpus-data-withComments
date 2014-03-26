/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
/** * A class that represents a CSS unicode range. This only handles * a single range of contigous chars, to handle multiple ranges * (comma seperated) use a list of these. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: UnicodeRange.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that represents a CSS unicode range. This only handles a single range of contigous chars, to handle multiple ranges (comma seperated) use a list of these. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: UnicodeRange.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
UnicodeRange	TokenNameIdentifier	 Unicode Range
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
firstUnicodeValue	TokenNameIdentifier	 first Unicode Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastUnicodeValue	TokenNameIdentifier	 last Unicode Value
;	TokenNameSEMICOLON	
/** * Constructs a unicode range from a CSS unicode range string. */	TokenNameCOMMENT_JAVADOC	 Constructs a unicode range from a CSS unicode range string. 
public	TokenNamepublic	
UnicodeRange	TokenNameIdentifier	 Unicode Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unicodeRange	TokenNameIdentifier	 unicode Range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"U+"	TokenNameStringLiteral	U+
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// strip off the U+ 	TokenNameCOMMENT_LINE	strip off the U+ 
unicodeRange	TokenNameIdentifier	 unicode Range
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dashIndex	TokenNameIdentifier	 dash Index
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
firstValue	TokenNameIdentifier	 first Value
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lastValue	TokenNameIdentifier	 last Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dashIndex	TokenNameIdentifier	 dash Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// it is a simple 2 value range 	TokenNameCOMMENT_LINE	it is a simple 2 value range 
firstValue	TokenNameIdentifier	 first Value
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dashIndex	TokenNameIdentifier	 dash Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastValue	TokenNameIdentifier	 last Value
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
dashIndex	TokenNameIdentifier	 dash Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
firstValue	TokenNameIdentifier	 first Value
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
;	TokenNameSEMICOLON	
lastValue	TokenNameIdentifier	 last Value
=	TokenNameEQUAL	
unicodeRange	TokenNameIdentifier	 unicode Range
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unicodeRange	TokenNameIdentifier	 unicode Range
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstValue	TokenNameIdentifier	 first Value
=	TokenNameEQUAL	
firstValue	TokenNameIdentifier	 first Value
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastValue	TokenNameIdentifier	 last Value
=	TokenNameEQUAL	
lastValue	TokenNameIdentifier	 last Value
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
firstUnicodeValue	TokenNameIdentifier	 first Unicode Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
firstValue	TokenNameIdentifier	 first Value
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastUnicodeValue	TokenNameIdentifier	 last Unicode Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
lastValue	TokenNameIdentifier	 last Value
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstUnicodeValue	TokenNameIdentifier	 first Unicode Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastUnicodeValue	TokenNameIdentifier	 last Unicode Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// not a valid unicode range 	TokenNameCOMMENT_LINE	not a valid unicode range 
firstUnicodeValue	TokenNameIdentifier	 first Unicode Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastUnicodeValue	TokenNameIdentifier	 last Unicode Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the specified unicode value is within this range. */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified unicode value is within this range. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unicode	TokenNameIdentifier	 unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unicode	TokenNameIdentifier	 unicode
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
unicodeVal	TokenNameIdentifier	 unicode Val
=	TokenNameEQUAL	
unicode	TokenNameIdentifier	 unicode
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
unicodeVal	TokenNameIdentifier	 unicode Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
unicodeVal	TokenNameIdentifier	 unicode Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
unicodeVal	TokenNameIdentifier	 unicode Val
>=	TokenNameGREATER_EQUAL	
firstUnicodeValue	TokenNameIdentifier	 first Unicode Value
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
unicodeVal	TokenNameIdentifier	 unicode Val
<=	TokenNameLESS_EQUAL	
lastUnicodeValue	TokenNameIdentifier	 last Unicode Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
