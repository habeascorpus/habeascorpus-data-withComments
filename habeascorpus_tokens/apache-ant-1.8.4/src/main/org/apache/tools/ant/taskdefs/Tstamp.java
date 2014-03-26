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
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
BuildException	TokenNameIdentifier	 Build Exception
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
Location	TokenNameIdentifier	 Location
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
Project	TokenNameIdentifier	 Project
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
Task	TokenNameIdentifier	 Task
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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
/** * Sets properties to the current time, or offsets from the current time. * The default properties are TSTAMP, DSTAMP and TODAY; * * @since Ant 1.1 * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Sets properties to the current time, or offsets from the current time. The default properties are TSTAMP, DSTAMP and TODAY; * @since Ant 1.1 @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
Tstamp	TokenNameIdentifier	 Tstamp
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
customFormats	TokenNameIdentifier	 custom Formats
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Set a prefix for the properties. If the prefix does not end with a "." * one is automatically added. * @param prefix the prefix to use. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Set a prefix for the properties. If the prefix does not end with a "." one is automatically added. @param prefix the prefix to use. @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
+=	TokenNamePLUS_EQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create the timestamps. Custom ones are done before * the standard ones, to get their retaliation in early. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 create the timestamps. Custom ones are done before the standard ones, to get their retaliation in early. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
customFormats	TokenNameIdentifier	 custom Formats
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CustomFormat	TokenNameIdentifier	 Custom Format
cts	TokenNameIdentifier	 cts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CustomFormat	TokenNameIdentifier	 Custom Format
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cts	TokenNameIdentifier	 cts
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dstamp	TokenNameIdentifier	 dstamp
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyyMMdd"	TokenNameStringLiteral	yyyyMMdd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"DSTAMP"	TokenNameStringLiteral	DSTAMP
,	TokenNameCOMMA	
dstamp	TokenNameIdentifier	 dstamp
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
tstamp	TokenNameIdentifier	 tstamp
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HHmm"	TokenNameStringLiteral	HHmm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"TSTAMP"	TokenNameStringLiteral	TSTAMP
,	TokenNameCOMMA	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
today	TokenNameIdentifier	 today
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"MMMM d yyyy"	TokenNameStringLiteral	MMMM d yyyy
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"TODAY"	TokenNameStringLiteral	TODAY
,	TokenNameCOMMA	
today	TokenNameIdentifier	 today
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create a custom format with the current prefix. * @return a ready to fill-in format */	TokenNameCOMMENT_JAVADOC	 create a custom format with the current prefix. @return a ready to fill-in format 
public	TokenNamepublic	
CustomFormat	TokenNameIdentifier	 Custom Format
createFormat	TokenNameIdentifier	 create Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CustomFormat	TokenNameIdentifier	 Custom Format
cts	TokenNameIdentifier	 cts
=	TokenNameEQUAL	
new	TokenNamenew	
CustomFormat	TokenNameIdentifier	 Custom Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
customFormats	TokenNameIdentifier	 custom Formats
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
cts	TokenNameIdentifier	 cts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cts	TokenNameIdentifier	 cts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * helper that encapsulates prefix logic and property setting * policy (i.e. we use setNewProperty instead of setProperty). */	TokenNameCOMMENT_JAVADOC	 helper that encapsulates prefix logic and property setting policy (i.e. we use setNewProperty instead of setProperty). 
private	TokenNameprivate	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This nested element that allows a property to be set * to the current date and time in a given format. * The date/time patterns are as defined in the * Java SimpleDateFormat class. * The format element also allows offsets to be applied to * the time to generate different time values. * @todo consider refactoring out into a re-usable element. */	TokenNameCOMMENT_JAVADOC	 This nested element that allows a property to be set to the current date and time in a given format. The date/time patterns are as defined in the Java SimpleDateFormat class. The format element also allows offsets to be applied to the time to generate different time values. @todo consider refactoring out into a re-usable element. 
public	TokenNamepublic	
class	TokenNameclass	
CustomFormat	TokenNameIdentifier	 Custom Format
{	TokenNameLBRACE	
private	TokenNameprivate	
TimeZone	TokenNameIdentifier	 Time Zone
timeZone	TokenNameIdentifier	 time Zone
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
country	TokenNameIdentifier	 country
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
variant	TokenNameIdentifier	 variant
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
;	TokenNameSEMICOLON	
/** * Create a format */	TokenNameCOMMENT_JAVADOC	 Create a format 
public	TokenNamepublic	
CustomFormat	TokenNameIdentifier	 Custom Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The property to receive the date/time string in the given pattern * @param propertyName the name of the property. */	TokenNameCOMMENT_JAVADOC	 The property to receive the date/time string in the given pattern @param propertyName the name of the property. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
propertyName	TokenNameIdentifier	 property Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The date/time pattern to be used. The values are as * defined by the Java SimpleDateFormat class. * @param pattern the pattern to use. * @see java.text.SimpleDateFormat */	TokenNameCOMMENT_JAVADOC	 The date/time pattern to be used. The values are as defined by the Java SimpleDateFormat class. @param pattern the pattern to use. @see java.text.SimpleDateFormat 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The locale used to create date/time string. * The general form is "language, country, variant" but * either variant or variant and country may be omitted. * For more information please refer to documentation * for the java.util.Locale class. * @param locale the locale to use. * @see java.util.Locale */	TokenNameCOMMENT_JAVADOC	 The locale used to create date/time string. The general form is "language, country, variant" but either variant or variant and country may be omitted. For more information please refer to documentation for the java.util.Locale class. @param locale the locale to use. @see java.util.Locale 
public	TokenNamepublic	
void	TokenNamevoid	
setLocale	TokenNameIdentifier	 set Locale
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
" ,"	TokenNameStringLiteral	 ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
variant	TokenNameIdentifier	 variant
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"bad locale format"	TokenNameStringLiteral	bad locale format
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
country	TokenNameIdentifier	 country
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"bad locale format"	TokenNameStringLiteral	bad locale format
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The timezone to use for displaying time. * The values are as defined by the Java TimeZone class. * @param id the timezone value. * @see java.util.TimeZone */	TokenNameCOMMENT_JAVADOC	 The timezone to use for displaying time. The values are as defined by the Java TimeZone class. @param id the timezone value. @see java.util.TimeZone 
public	TokenNamepublic	
void	TokenNamevoid	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timeZone	TokenNameIdentifier	 time Zone
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The numeric offset to the current time. * @param offset the offset to use. */	TokenNameCOMMENT_JAVADOC	 The numeric offset to the current time. @param offset the offset to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the unit type (using String). * @param unit the unit to use. * @deprecated since 1.5.x. * setUnit(String) is deprecated and is replaced with * setUnit(Tstamp.Unit) to make Ant's * Introspection mechanism do the work and also to * encapsulate operations on the unit in its own * class. */	TokenNameCOMMENT_JAVADOC	 Set the unit type (using String). @param unit the unit to use. @deprecated since 1.5.x. setUnit(String) is deprecated and is replaced with setUnit(Tstamp.Unit) to make Ant's Introspection mechanism do the work and also to encapsulate operations on the unit in its own class. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnit	TokenNameIdentifier	 set Unit
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The setUnit(String) method has been deprecated."	TokenNameStringLiteral	DEPRECATED - The setUnit(String) method has been deprecated.
+	TokenNamePLUS	
" Use setUnit(Tstamp.Unit) instead."	TokenNameStringLiteral	 Use setUnit(Tstamp.Unit) instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Unit	TokenNameIdentifier	 Unit
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
Unit	TokenNameIdentifier	 Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
getCalendarField	TokenNameIdentifier	 get Calendar Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The unit of the offset to be applied to the current time. * Valid Values are * <ul> * <li>millisecond</li> * <li>second</li> * <li>minute</li> * <li>hour</li> * <li>day</li> * <li>week</li> * <li>month</li> * <li>year</li> * </ul> * The default unit is day. * @param unit the unit to use. */	TokenNameCOMMENT_JAVADOC	 The unit of the offset to be applied to the current time. Valid Values are <ul> <li>millisecond</li> <li>second</li> <li>minute</li> <li>hour</li> <li>day</li> <li>week</li> <li>month</li> <li>year</li> </ul> The default unit is day. @param unit the unit to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnit	TokenNameIdentifier	 set Unit
(	TokenNameLPAREN	
Unit	TokenNameIdentifier	 Unit
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
getCalendarField	TokenNameIdentifier	 get Calendar Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * validate parameter and execute the format. * @param project project to set property in. * @param date date to use as a starting point. * @param location line in file (for errors) */	TokenNameCOMMENT_JAVADOC	 validate parameter and execute the format. @param project project to set property in. @param date date to use as a starting point. @param location line in file (for errors) 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"property attribute must be provided"	TokenNameStringLiteral	property attribute must be provided
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"pattern attribute must be provided"	TokenNameStringLiteral	pattern attribute must be provided
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
variant	TokenNameIdentifier	 variant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
country	TokenNameIdentifier	 country
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
country	TokenNameIdentifier	 country
,	TokenNameCOMMA	
variant	TokenNameIdentifier	 variant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
calendar	TokenNameIdentifier	 calendar
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
calendar	TokenNameIdentifier	 calendar
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
timeZone	TokenNameIdentifier	 time Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Tstamp	TokenNameIdentifier	 Tstamp
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * set of valid units to use for time offsets. */	TokenNameCOMMENT_JAVADOC	 set of valid units to use for time offsets. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Unit	TokenNameIdentifier	 Unit
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MILLISECOND	TokenNameIdentifier	 MILLISECOND
=	TokenNameEQUAL	
"millisecond"	TokenNameStringLiteral	millisecond
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SECOND	TokenNameIdentifier	 SECOND
=	TokenNameEQUAL	
"second"	TokenNameStringLiteral	second
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MINUTE	TokenNameIdentifier	 MINUTE
=	TokenNameEQUAL	
"minute"	TokenNameStringLiteral	minute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HOUR	TokenNameIdentifier	 HOUR
=	TokenNameEQUAL	
"hour"	TokenNameStringLiteral	hour
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DAY	TokenNameIdentifier	 DAY
=	TokenNameEQUAL	
"day"	TokenNameStringLiteral	day
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WEEK	TokenNameIdentifier	 WEEK
=	TokenNameEQUAL	
"week"	TokenNameStringLiteral	week
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MONTH	TokenNameIdentifier	 MONTH
=	TokenNameEQUAL	
"month"	TokenNameStringLiteral	month
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
YEAR	TokenNameIdentifier	 YEAR
=	TokenNameEQUAL	
"year"	TokenNameStringLiteral	year
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNITS	TokenNameIdentifier	 UNITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
WEEK	TokenNameIdentifier	 WEEK
,	TokenNameCOMMA	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
YEAR	TokenNameIdentifier	 YEAR
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
calendarFields	TokenNameIdentifier	 calendar Fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Constructor for Unit enumerated type. */	TokenNameCOMMENT_JAVADOC	 Constructor for Unit enumerated type. 
public	TokenNamepublic	
Unit	TokenNameIdentifier	 Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HOUR	TokenNameIdentifier	 HOUR
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
WEEK	TokenNameIdentifier	 WEEK
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
WEEK_OF_YEAR	TokenNameIdentifier	 WEEK  OF  YEAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the value to int unit value. * @return an int value. */	TokenNameCOMMENT_JAVADOC	 Convert the value to int unit value. @return an int value. 
public	TokenNamepublic	
int	TokenNameint	
getCalendarField	TokenNameIdentifier	 get Calendar Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
calendarFields	TokenNameIdentifier	 calendar Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the valid values. * @return the value values. */	TokenNameCOMMENT_JAVADOC	 Get the valid values. @return the value values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNITS	TokenNameIdentifier	 UNITS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
