/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * This class provides parameterized logging services * using the pattern syntax of java.text.MessageFormat. * Message formatting is only performed when the * request exceeds the threshold level of the logger. * When the pattern only contains literal text and * default conversion patterns (that is "{0}" and similar) * a simple fast compatible formatter is used. * If the pattern contains more complex conversion patterns, * formatting will be delegated to java.text.MessageFormatter * which can be substantially slower. * * @see org.apache.log4j.LogSF * @since 1.2.16 * */	TokenNameCOMMENT_JAVADOC	 This class provides parameterized logging services using the pattern syntax of java.text.MessageFormat. Message formatting is only performed when the request exceeds the threshold level of the logger. When the pattern only contains literal text and default conversion patterns (that is "{0}" and similar) a simple fast compatible formatter is used. If the pattern contains more complex conversion patterns, formatting will be delegated to java.text.MessageFormatter which can be substantially slower. * @see org.apache.log4j.LogSF @since 1.2.16 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LogMF	TokenNameIdentifier	 Log MF
extends	TokenNameextends	
LogXF	TokenNameIdentifier	 Log XF
{	TokenNameLBRACE	
/** * private constructor. * */	TokenNameCOMMENT_JAVADOC	 private constructor. 
private	TokenNameprivate	
LogMF	TokenNameIdentifier	 Log MF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Number format. */	TokenNameCOMMENT_JAVADOC	 Number format. 
private	TokenNameprivate	
static	TokenNamestatic	
NumberFormat	TokenNameIdentifier	 Number Format
numberFormat	TokenNameIdentifier	 number Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Locale at time of last number format request. */	TokenNameCOMMENT_JAVADOC	 Locale at time of last number format request. 
private	TokenNameprivate	
static	TokenNamestatic	
Locale	TokenNameIdentifier	 Locale
numberLocale	TokenNameIdentifier	 number Locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Date format. */	TokenNameCOMMENT_JAVADOC	 Date format. 
private	TokenNameprivate	
static	TokenNamestatic	
DateFormat	TokenNameIdentifier	 Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Locale at time of last date format request. */	TokenNameCOMMENT_JAVADOC	 Locale at time of last date format request. 
private	TokenNameprivate	
static	TokenNamestatic	
Locale	TokenNameIdentifier	 Locale
dateLocale	TokenNameIdentifier	 date Locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Format number. * @param n number to format, may not be null. * @return formatted value. */	TokenNameCOMMENT_JAVADOC	 Format number. @param n number to format, may not be null. @return formatted value. 
private	TokenNameprivate	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
currentLocale	TokenNameIdentifier	 current Locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentLocale	TokenNameIdentifier	 current Locale
!=	TokenNameNOT_EQUAL	
numberLocale	TokenNameIdentifier	 number Locale
||	TokenNameOR_OR	
numberFormat	TokenNameIdentifier	 number Format
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberLocale	TokenNameIdentifier	 number Locale
=	TokenNameEQUAL	
currentLocale	TokenNameIdentifier	 current Locale
;	TokenNameSEMICOLON	
numberFormat	TokenNameIdentifier	 number Format
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
currentLocale	TokenNameIdentifier	 current Locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numberFormat	TokenNameIdentifier	 number Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format date. * @param d date, may not be null. * @return formatted value. */	TokenNameCOMMENT_JAVADOC	 Format date. @param d date, may not be null. @return formatted value. 
private	TokenNameprivate	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
formatDate	TokenNameIdentifier	 format Date
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
currentLocale	TokenNameIdentifier	 current Locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentLocale	TokenNameIdentifier	 current Locale
!=	TokenNameNOT_EQUAL	
dateLocale	TokenNameIdentifier	 date Locale
||	TokenNameOR_OR	
dateFormat	TokenNameIdentifier	 date Format
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateLocale	TokenNameIdentifier	 date Locale
=	TokenNameEQUAL	
currentLocale	TokenNameIdentifier	 current Locale
;	TokenNameSEMICOLON	
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
currentLocale	TokenNameIdentifier	 current Locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format a single parameter like a "{0}" formatting specifier. * * @param arg0 parameter, may be null. * @return string representation of arg0. */	TokenNameCOMMENT_JAVADOC	 Format a single parameter like a "{0}" formatting specifier. * @param arg0 parameter, may be null. @return string representation of arg0. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatObject	TokenNameIdentifier	 format Object
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
instanceof	TokenNameinstanceof	
Double	TokenNameIdentifier	 Double
||	TokenNameOR_OR	
arg0	TokenNameIdentifier	 arg0
instanceof	TokenNameinstanceof	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
instanceof	TokenNameinstanceof	
Date	TokenNameIdentifier	 Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatDate	TokenNameIdentifier	 format Date
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if pattern contains only {n} format elements * and not apostrophes. * * @param pattern pattern, may not be null. * @return true if pattern only contains {n} format elements. */	TokenNameCOMMENT_JAVADOC	 Determines if pattern contains only {n} format elements and not apostrophes. * @param pattern pattern, may not be null. @return true if pattern only contains {n} format elements. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSimple	TokenNameIdentifier	 is Simple
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
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'}'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
'0'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
'9'	TokenNameCharacterLiteral	
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
/** * Formats arguments using MessageFormat. * @param pattern pattern, may be malformed or null. * @param arguments arguments, may be null or mismatched. * @return Message string or null */	TokenNameCOMMENT_JAVADOC	 Formats arguments using MessageFormat. @param pattern pattern, may be malformed or null. @param arguments arguments, may be null or mismatched. @return Message string or null 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'}'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
formatted	TokenNameIdentifier	 formatted
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatted	TokenNameIdentifier	 formatted
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
formatted	TokenNameIdentifier	 formatted
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
formatObject	TokenNameIdentifier	 format Object
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
formatted	TokenNameIdentifier	 formatted
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Formats a single argument using MessageFormat. * @param pattern pattern, may be malformed or null. * @param arguments arguments, may be null or mismatched. * @return Message string or null */	TokenNameCOMMENT_JAVADOC	 Formats a single argument using MessageFormat. @param pattern pattern, may be malformed or null. @param arguments arguments, may be null or mismatched. @return Message string or null 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'}'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
formatted	TokenNameIdentifier	 formatted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatted	TokenNameIdentifier	 formatted
=	TokenNameEQUAL	
formatObject	TokenNameIdentifier	 format Object
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
formatted	TokenNameIdentifier	 formatted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
retval	TokenNameIdentifier	 retval
+=	TokenNamePLUS_EQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
MessageFormat	TokenNameIdentifier	 Message Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
arg0	TokenNameIdentifier	 arg0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Formats arguments using MessageFormat using a pattern from * a resource bundle. * @param resourceBundleName name of resource bundle, may be null. * @param key key for pattern in resource bundle, may be null. * @param arguments arguments, may be null or mismatched. * @return Message string or null */	TokenNameCOMMENT_JAVADOC	 Formats arguments using MessageFormat using a pattern from a resource bundle. @param resourceBundleName name of resource bundle, may be null. @param key key for pattern in resource bundle, may be null. @param arguments arguments, may be null or mismatched. @return Message string or null 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
resourceBundleName	TokenNameIdentifier	 resource Bundle Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fully Qualified Class Name of this class. */	TokenNameCOMMENT_JAVADOC	 Fully Qualified Class Name of this class. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FQCN	TokenNameIdentifier	 FQCN
=	TokenNameEQUAL	
LogMF	TokenNameIdentifier	 Log MF
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Equivalent of Logger.forcedLog. * * @param logger logger, may not be null. * @param level level, may not be null. * @param msg message, may be null. */	TokenNameCOMMENT_JAVADOC	 Equivalent of Logger.forcedLog. * @param logger logger, may not be null. @param level level, may not be null. @param msg message, may be null. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equivalent of Logger.forcedLog. * * @param logger logger, may not be null. * @param level level, may not be null. * @param msg message, may be null. * @param t throwable. */	TokenNameCOMMENT_JAVADOC	 Equivalent of Logger.forcedLog. * @param logger logger, may not be null. @param level level, may not be null. @param msg message, may be null. @param t throwable. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
callAppenders	TokenNameIdentifier	 call Appenders
(	TokenNameLPAREN	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be * formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at error level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at error level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at fatal level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at fatal level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be * formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at error level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at error level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at fatal level. * @param logger logger, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param arguments an array of arguments to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at fatal level. @param logger logger, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param arguments an array of arguments to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at trace level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at trace level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at debug level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at debug level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at info level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at info level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param argument a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param argument a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at warn level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at warn level. @param logger logger, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param t throwable, may be null. * @param pattern pattern, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param t throwable, may be null. @param pattern pattern, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param param1 parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param param1 parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specifed level. * @param logger logger, may not be null. * @param level level, may not be null. * @param pattern pattern, may be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specifed level. @param logger logger, may not be null. @param level level, may not be null. @param pattern pattern, may be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message at specified level. * @param logger logger, may not be null. * @param pattern pattern, may be null. * @param level level, may not be null. * @param arg0 a value to be formatted and substituted. * @param arg1 a value to be formatted and substituted. * @param arg2 a value to be formatted and substituted. * @param arg3 a value to be formatted and substituted. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message at specified level. @param logger logger, may not be null. @param pattern pattern, may be null. @param level level, may not be null. @param arg0 a value to be formatted and substituted. @param arg1 a value to be formatted and substituted. @param arg2 a value to be formatted and substituted. @param arg3 a value to be formatted and substituted. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param t throwable, may be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param parameters parameters to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param t throwable, may be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param parameters parameters to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
char	TokenNamechar	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
short	TokenNameshort	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. * @param param2 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. @param param2 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Log a parameterized message using a pattern from a resource bundle. * @param logger logger, may not be null. * @param level level, may not be null. * @param bundleName resource bundle name, may be null. * @param key key, may be null. * @param param0 Parameter to the log message. * @param param1 Parameter to the log message. * @param param2 Parameter to the log message. * @param param3 Parameter to the log message. */	TokenNameCOMMENT_JAVADOC	 Log a parameterized message using a pattern from a resource bundle. @param logger logger, may not be null. @param level level, may not be null. @param bundleName resource bundle name, may be null. @param key key, may be null. @param param0 Parameter to the log message. @param param1 Parameter to the log message. @param param2 Parameter to the log message. @param param3 Parameter to the log message. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
logrb	TokenNameIdentifier	 logrb
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
param3	TokenNameIdentifier	 param3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isEnabledFor	TokenNameIdentifier	 is Enabled For
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
bundleName	TokenNameIdentifier	 bundle Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
param0	TokenNameIdentifier	 param0
,	TokenNameCOMMA	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
,	TokenNameCOMMA	
param3	TokenNameIdentifier	 param3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
