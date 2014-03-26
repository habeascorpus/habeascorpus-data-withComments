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
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
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
ParseException	TokenNameIdentifier	 Parse Exception
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
Date	TokenNameIdentifier	 Date
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
Touch	TokenNameIdentifier	 Touch
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
/** * Condition that makes assertions about the last modified date of a * resource. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Condition that makes assertions about the last modified date of a resource. * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
IsLastModified	TokenNameIdentifier	 Is Last Modified
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Touch	TokenNameIdentifier	 Touch
.	TokenNameDOT	
DateFormatFactory	TokenNameIdentifier	 Date Format Factory
dfFactory	TokenNameIdentifier	 df Factory
=	TokenNameEQUAL	
Touch	TokenNameIdentifier	 Touch
.	TokenNameDOT	
DEFAULT_DF_FACTORY	TokenNameIdentifier	 DEFAULT  DF  FACTORY
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CompareMode	TokenNameIdentifier	 Compare Mode
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
EQUALS	TokenNameIdentifier	 EQUALS
;	TokenNameSEMICOLON	
/** * Set the new modification time of file(s) touched * in milliseconds since midnight Jan 1 1970. * @param millis the <code>long</code> timestamp to use. */	TokenNameCOMMENT_JAVADOC	 Set the new modification time of file(s) touched in milliseconds since midnight Jan 1 1970. @param millis the <code>long</code> timestamp to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
long	TokenNamelong	
millis	TokenNameIdentifier	 millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
millis	TokenNameIdentifier	 millis
=	TokenNameEQUAL	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the new modification time of file(s) touched * in the format &quot;MM/DD/YYYY HH:MM AM <i>or</i> PM&quot; * or &quot;MM/DD/YYYY HH:MM:SS AM <i>or</i> PM&quot;. * @param dateTime the <code>String</code> date in the specified format. */	TokenNameCOMMENT_JAVADOC	 Set the new modification time of file(s) touched in the format &quot;MM/DD/YYYY HH:MM AM <i>or</i> PM&quot; or &quot;MM/DD/YYYY HH:MM:SS AM <i>or</i> PM&quot;. @param dateTime the <code>String</code> date in the specified format. 
public	TokenNamepublic	
void	TokenNamevoid	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dateTime	TokenNameIdentifier	 date Time
=	TokenNameEQUAL	
dateTime	TokenNameIdentifier	 date Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the format of the datetime attribute. * @param pattern the <code>SimpleDateFormat</code>-compatible * format pattern. */	TokenNameCOMMENT_JAVADOC	 Set the format of the datetime attribute. @param pattern the <code>SimpleDateFormat</code>-compatible format pattern. 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dfFactory	TokenNameIdentifier	 df Factory
=	TokenNameEQUAL	
new	TokenNamenew	
Touch	TokenNameIdentifier	 Touch
.	TokenNameDOT	
DateFormatFactory	TokenNameIdentifier	 Date Format Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
DateFormat	TokenNameIdentifier	 Date Format
getPrimaryFormat	TokenNameIdentifier	 get Primary Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateFormat	TokenNameIdentifier	 Date Format
getFallbackFormat	TokenNameIdentifier	 get Fallback Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The resource to test. */	TokenNameCOMMENT_JAVADOC	 The resource to test. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only one resource can be tested"	TokenNameStringLiteral	only one resource can be tested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The type of comparison to test. */	TokenNameCOMMENT_JAVADOC	 The type of comparison to test. 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Argument validation. */	TokenNameCOMMENT_JAVADOC	 Argument validation. 
protected	TokenNameprotected	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dateTime	TokenNameIdentifier	 date Time
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one of dateTime and millis can be"	TokenNameStringLiteral	Only one of dateTime and millis can be
+	TokenNamePLUS	
" set"	TokenNameStringLiteral	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dateTime	TokenNameIdentifier	 date Time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"millis or dateTime is required"	TokenNameStringLiteral	millis or dateTime is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"resource is required"	TokenNameStringLiteral	resource is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Calculate timestamp as millis either based on millis or * dateTime (and pattern) attribute. */	TokenNameCOMMENT_JAVADOC	 Calculate timestamp as millis either based on millis or dateTime (and pattern) attribute. 
protected	TokenNameprotected	
long	TokenNamelong	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
millis	TokenNameIdentifier	 millis
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
millis	TokenNameIdentifier	 millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"now"	TokenNameStringLiteral	now
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DateFormat	TokenNameIdentifier	 Date Format
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
dfFactory	TokenNameIdentifier	 df Factory
.	TokenNameDOT	
getPrimaryFormat	TokenNameIdentifier	 get Primary Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParseException	TokenNameIdentifier	 Parse Exception
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
peOne	TokenNameIdentifier	 pe One
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
dfFactory	TokenNameIdentifier	 df Factory
.	TokenNameDOT	
getFallbackFormat	TokenNameIdentifier	 get Fallback Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
df	TokenNameIdentifier	 df
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
peOne	TokenNameIdentifier	 pe One
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
dateTime	TokenNameIdentifier	 date Time
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
peTwo	TokenNameIdentifier	 pe Two
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pe	TokenNameIdentifier	 pe
=	TokenNameEQUAL	
peTwo	TokenNameIdentifier	 pe Two
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pe	TokenNameIdentifier	 pe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
pe	TokenNameIdentifier	 pe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pe	TokenNameIdentifier	 pe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* NOTREACHED */	TokenNameCOMMENT_BLOCK	 NOTREACHED 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"expected timestamp: "	TokenNameStringLiteral	expected timestamp: 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
", actual timestamp: "	TokenNameStringLiteral	, actual timestamp: 
+	TokenNamePLUS	
actual	TokenNameIdentifier	 actual
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
EQUALS_TEXT	TokenNameIdentifier	 EQUALS  TEXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expected	TokenNameIdentifier	 expected
==	TokenNameEQUAL_EQUAL	
actual	TokenNameIdentifier	 actual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
BEFORE_TEXT	TokenNameIdentifier	 BEFORE  TEXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expected	TokenNameIdentifier	 expected
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
NOT_BEFORE_TEXT	TokenNameIdentifier	 NOT  BEFORE  TEXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expected	TokenNameIdentifier	 expected
<=	TokenNameLESS_EQUAL	
actual	TokenNameIdentifier	 actual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
AFTER_TEXT	TokenNameIdentifier	 AFTER  TEXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expected	TokenNameIdentifier	 expected
<	TokenNameLESS	
actual	TokenNameIdentifier	 actual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
CompareMode	TokenNameIdentifier	 Compare Mode
.	TokenNameDOT	
NOT_AFTER_TEXT	TokenNameIdentifier	 NOT  AFTER  TEXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expected	TokenNameIdentifier	 expected
>=	TokenNameGREATER_EQUAL	
actual	TokenNameIdentifier	 actual
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unknown mode "	TokenNameStringLiteral	Unknown mode 
+	TokenNamePLUS	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CompareMode	TokenNameIdentifier	 Compare Mode
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EQUALS_TEXT	TokenNameIdentifier	 EQUALS  TEXT
=	TokenNameEQUAL	
"equals"	TokenNameStringLiteral	equals
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BEFORE_TEXT	TokenNameIdentifier	 BEFORE  TEXT
=	TokenNameEQUAL	
"before"	TokenNameStringLiteral	before
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
AFTER_TEXT	TokenNameIdentifier	 AFTER  TEXT
=	TokenNameEQUAL	
"after"	TokenNameStringLiteral	after
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_BEFORE_TEXT	TokenNameIdentifier	 NOT  BEFORE  TEXT
=	TokenNameEQUAL	
"not-before"	TokenNameStringLiteral	not-before
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOT_AFTER_TEXT	TokenNameIdentifier	 NOT  AFTER  TEXT
=	TokenNameEQUAL	
"not-after"	TokenNameStringLiteral	not-after
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
CompareMode	TokenNameIdentifier	 Compare Mode
EQUALS	TokenNameIdentifier	 EQUALS
=	TokenNameEQUAL	
new	TokenNamenew	
CompareMode	TokenNameIdentifier	 Compare Mode
(	TokenNameLPAREN	
EQUALS_TEXT	TokenNameIdentifier	 EQUALS  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompareMode	TokenNameIdentifier	 Compare Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
EQUALS_TEXT	TokenNameIdentifier	 EQUALS  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompareMode	TokenNameIdentifier	 Compare Mode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
EQUALS_TEXT	TokenNameIdentifier	 EQUALS  TEXT
,	TokenNameCOMMA	
BEFORE_TEXT	TokenNameIdentifier	 BEFORE  TEXT
,	TokenNameCOMMA	
AFTER_TEXT	TokenNameIdentifier	 AFTER  TEXT
,	TokenNameCOMMA	
NOT_BEFORE_TEXT	TokenNameIdentifier	 NOT  BEFORE  TEXT
,	TokenNameCOMMA	
NOT_AFTER_TEXT	TokenNameIdentifier	 NOT  AFTER  TEXT
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
