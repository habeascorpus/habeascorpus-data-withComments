/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: LocaleUtility.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: LocaleUtility.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * @author Igor Hersht, igorh@ca.ibm.com */	TokenNameCOMMENT_JAVADOC	 @author Igor Hersht, igorh@ca.ibm.com 
public	TokenNamepublic	
class	TokenNameclass	
LocaleUtility	TokenNameIdentifier	 Locale Utility
{	TokenNameLBRACE	
/** * IETF RFC 1766 tag separator */	TokenNameCOMMENT_JAVADOC	 IETF RFC 1766 tag separator 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
IETF_SEPARATOR	TokenNameIdentifier	 IETF  SEPARATOR
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Locale	TokenNameIdentifier	 Locale
langToLocale	TokenNameIdentifier	 lang To Locale
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not specified => getDefault 	TokenNameCOMMENT_LINE	not specified => getDefault 
return	TokenNamereturn	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
variant	TokenNameIdentifier	 variant
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
IETF_SEPARATOR	TokenNameIdentifier	 IETF  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i1	TokenNameIdentifier	 i1
;	TokenNameSEMICOLON	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
IETF_SEPARATOR	TokenNameIdentifier	 IETF  SEPARATOR
,	TokenNameCOMMA	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
,	TokenNameCOMMA	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
variant	TokenNameIdentifier	 variant
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
language	TokenNameIdentifier	 language
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
country	TokenNameIdentifier	 country
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
country	TokenNameIdentifier	 country
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
variant	TokenNameIdentifier	 variant
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
country	TokenNameIdentifier	 country
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
variant	TokenNameIdentifier	 variant
=	TokenNameEQUAL	
variant	TokenNameIdentifier	 variant
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
variant	TokenNameIdentifier	 variant
=	TokenNameEQUAL	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
country	TokenNameIdentifier	 country
,	TokenNameCOMMA	
variant	TokenNameIdentifier	 variant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
