/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
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
Configurator	TokenNameIdentifier	 Configurator
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
LoggerRepository	TokenNameIdentifier	 Logger Repository
;	TokenNameSEMICOLON	
// Contributors: Avy Sharell (sharell@online.fr) 	TokenNameCOMMENT_LINE	Contributors: Avy Sharell (sharell@online.fr) 
// Matthieu Verbert (mve@zurich.ibm.com) 	TokenNameCOMMENT_LINE	Matthieu Verbert (mve@zurich.ibm.com) 
// Colin Sampaleanu 	TokenNameCOMMENT_LINE	Colin Sampaleanu 
/** A convenience class to convert property values to specific types. @author Ceki G&uuml;lc&uuml; @author Simon Kitching; @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 A convenience class to convert property values to specific types. @author Ceki G&uuml;lc&uuml; @author Simon Kitching; @author Anders Kristensen 
public	TokenNamepublic	
class	TokenNameclass	
OptionConverter	TokenNameIdentifier	 Option Converter
{	TokenNameLBRACE	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DELIM_START	TokenNameIdentifier	 DELIM  START
=	TokenNameEQUAL	
"${"	TokenNameStringLiteral	${
;	TokenNameSEMICOLON	
static	TokenNamestatic	
char	TokenNamechar	
DELIM_STOP	TokenNameIdentifier	 DELIM  STOP
=	TokenNameEQUAL	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
DELIM_START_LEN	TokenNameIdentifier	 DELIM  START  LEN
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
DELIM_STOP_LEN	TokenNameIdentifier	 DELIM  STOP  LEN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** OptionConverter is a static class. */	TokenNameCOMMENT_JAVADOC	 OptionConverter is a static class. 
private	TokenNameprivate	
OptionConverter	TokenNameIdentifier	 Option Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
concatanateArrays	TokenNameIdentifier	 concatanate Arrays
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
convertSpecialChars	TokenNameIdentifier	 convert Special Chars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\r'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\f'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\b'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\\'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Very similar to <code>System.getProperty</code> except that the {@link SecurityException} is hidden. @param key The key to search for. @param def The default value to return. @return the string value of the system property, or the default value if there is no property with that key. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Very similar to <code>System.getProperty</code> except that the {@link SecurityException} is hidden. @param key The key to search for. @param def The default value to return. @return the string value of the system property, or the default value if there is no property with that key. @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// MS-Java throws com.ms.security.SecurityExceptionEx 	TokenNameCOMMENT_LINE	MS-Java throws com.ms.security.SecurityExceptionEx 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Was not allowed to read system property ""	TokenNameStringLiteral	Was not allowed to read system property "
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
""."	TokenNameStringLiteral	".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
instantiateByKey	TokenNameIdentifier	 instantiate By Key
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
superClass	TokenNameIdentifier	 super Class
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the value of the property in string form 	TokenNameCOMMENT_LINE	Get the value of the property in string form 
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
findAndSubst	TokenNameIdentifier	 find And Subst
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not find value for key "	TokenNameStringLiteral	Could not find value for key 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Trim className to avoid trailing spaces that cause problems. 	TokenNameCOMMENT_LINE	Trim className to avoid trailing spaces that cause problems. 
return	TokenNamereturn	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
superClass	TokenNameIdentifier	 super Class
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If <code>value</code> is "true", then <code>true</code> is returned. If <code>value</code> is "false", then <code>true</code> is returned. Otherwise, <code>default</code> is returned. <p>Case of value is unimportant. */	TokenNameCOMMENT_JAVADOC	 If <code>value</code> is "true", then <code>true</code> is returned. If <code>value</code> is "false", then <code>true</code> is returned. Otherwise, <code>default</code> is returned. <p>Case of value is unimportant. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
dEfault	TokenNameIdentifier	 d Efault
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
dEfault	TokenNameIdentifier	 d Efault
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
trimmedVal	TokenNameIdentifier	 trimmed Val
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
trimmedVal	TokenNameIdentifier	 trimmed Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"false"	TokenNameStringLiteral	false
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
trimmedVal	TokenNameIdentifier	 trimmed Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dEfault	TokenNameIdentifier	 d Efault
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
dEfault	TokenNameIdentifier	 d Efault
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"] is not in proper int form."	TokenNameStringLiteral	] is not in proper int form.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dEfault	TokenNameIdentifier	 d Efault
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Converts a standard or custom priority level to a Level object. <p> If <code>value</code> is of form "level#classname", then the specified class' toLevel method is called to process the specified level string; if no '#' character is present, then the default {@link org.apache.log4j.Level} class is used to process the level value. <p>As a special case, if the <code>value</code> parameter is equal to the string "NULL", then the value <code>null</code> will be returned. <p> If any error occurs while converting the value to a level, the <code>defaultValue</code> parameter, which may be <code>null</code>, is returned. <p> Case of <code>value</code> is insignificant for the level level, but is significant for the class name part, if present. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Converts a standard or custom priority level to a Level object. <p> If <code>value</code> is of form "level#classname", then the specified class' toLevel method is called to process the specified level string; if no '#' character is present, then the default {@link org.apache.log4j.Level} class is used to process the level value. <p>As a special case, if the <code>value</code> parameter is equal to the string "NULL", then the value <code>null</code> will be returned. <p> If any error occurs while converting the value to a level, the <code>defaultValue</code> parameter, which may be <code>null</code>, is returned. <p> Case of <code>value</code> is insignificant for the level level, but is significant for the class name part, if present. @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
Level	TokenNameIdentifier	 Level
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hashIndex	TokenNameIdentifier	 hash Index
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashIndex	TokenNameIdentifier	 hash Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"NULL"	TokenNameStringLiteral	NULL
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// no class name specified : use standard Level class 	TokenNameCOMMENT_LINE	no class name specified : use standard Level class 
return	TokenNamereturn	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Level	TokenNameIdentifier	 Level
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
hashIndex	TokenNameIdentifier	 hash Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
levelName	TokenNameIdentifier	 level Name
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hashIndex	TokenNameIdentifier	 hash Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is degenerate case but you never know. 	TokenNameCOMMENT_LINE	This is degenerate case but you never know. 
if	TokenNameif	
(	TokenNameLPAREN	
"NULL"	TokenNameStringLiteral	NULL
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
levelName	TokenNameIdentifier	 level Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"toLevel"	TokenNameStringLiteral	toLevel
+	TokenNamePLUS	
":class=["	TokenNameStringLiteral	:class=[
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
+	TokenNamePLUS	
":pri=["	TokenNameStringLiteral	:pri=[
+	TokenNamePLUS	
levelName	TokenNameIdentifier	 level Name
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
customLevel	TokenNameIdentifier	 custom Level
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get a ref to the specified class' static method 	TokenNameCOMMENT_LINE	get a ref to the specified class' static method 
// toLevel(String, org.apache.log4j.Level) 	TokenNameCOMMENT_LINE	toLevel(String, org.apache.log4j.Level) 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
toLevelMethod	TokenNameIdentifier	 to Level Method
=	TokenNameEQUAL	
customLevel	TokenNameIdentifier	 custom Level
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"toLevel"	TokenNameStringLiteral	toLevel
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now call the toLevel method, passing level string + default 	TokenNameCOMMENT_LINE	now call the toLevel method, passing level string + default 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
levelName	TokenNameIdentifier	 level Name
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
toLevelMethod	TokenNameIdentifier	 to Level Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"custom level class ["	TokenNameStringLiteral	custom level class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"] not found."	TokenNameStringLiteral	] not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"custom level class ["	TokenNameStringLiteral	custom level class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
+	TokenNamePLUS	
" does not have a class function toLevel(String, Level)"	TokenNameStringLiteral	 does not have a class function toLevel(String, Level)
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"custom level class ["	TokenNameStringLiteral	custom level class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
+	TokenNamePLUS	
" could not be instantiated"	TokenNameStringLiteral	 could not be instantiated
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"class ["	TokenNameStringLiteral	class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"] is not a subclass of org.apache.log4j.Level"	TokenNameStringLiteral	] is not a subclass of org.apache.log4j.Level
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"class ["	TokenNameStringLiteral	class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"] cannot be instantiated due to access restrictions"	TokenNameStringLiteral	] cannot be instantiated due to access restrictions
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"class ["	TokenNameStringLiteral	class [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"], level ["	TokenNameStringLiteral	], level [
+	TokenNamePLUS	
levelName	TokenNameIdentifier	 level Name
+	TokenNamePLUS	
"] conversion failed."	TokenNameStringLiteral	] conversion failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
toFileSize	TokenNameIdentifier	 to File Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
long	TokenNamelong	
dEfault	TokenNameIdentifier	 d Efault
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
dEfault	TokenNameIdentifier	 d Efault
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"KB"	TokenNameStringLiteral	KB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"MB"	TokenNameStringLiteral	MB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"GB"	TokenNameStringLiteral	GB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiplier	TokenNameIdentifier	 multiplier
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
multiplier	TokenNameIdentifier	 multiplier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"] is not in proper int form."	TokenNameStringLiteral	] is not in proper int form.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"] not in expected format."	TokenNameStringLiteral	] not in expected format.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dEfault	TokenNameIdentifier	 d Efault
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Find the value corresponding to <code>key</code> in <code>props</code>. Then perform variable substitution on the found value. */	TokenNameCOMMENT_JAVADOC	 Find the value corresponding to <code>key</code> in <code>props</code>. Then perform variable substitution on the found value. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
findAndSubst	TokenNameIdentifier	 find And Subst
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Bad option value ["	TokenNameStringLiteral	Bad option value [
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Instantiate an object given a class name. Check that the <code>className</code> is a subclass of <code>superClass</code>. If that test fails or the object could not be instantiated, then <code>defaultValue</code> is returned. @param className The fully qualified class name of the object to instantiate. @param superClass The class to which the new object should belong. @param defaultValue The object to return in case of non-fulfillment */	TokenNameCOMMENT_JAVADOC	 Instantiate an object given a class name. Check that the <code>className</code> is a subclass of <code>superClass</code>. If that test fails or the object could not be instantiated, then <code>defaultValue</code> is returned. @param className The fully qualified class name of the object to instantiate. @param superClass The class to which the new object should belong. @param defaultValue The object to return in case of non-fulfillment 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
superClass	TokenNameIdentifier	 super Class
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
classObj	TokenNameIdentifier	 class Obj
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
superClass	TokenNameIdentifier	 super Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
classObj	TokenNameIdentifier	 class Obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"A ""	TokenNameStringLiteral	A "
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"" object is not assignable to a ""	TokenNameStringLiteral	" object is not assignable to a "
+	TokenNamePLUS	
superClass	TokenNameIdentifier	 super Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" variable."	TokenNameStringLiteral	" variable.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"The class ""	TokenNameStringLiteral	The class "
+	TokenNamePLUS	
superClass	TokenNameIdentifier	 super Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" was loaded by "	TokenNameStringLiteral	" was loaded by 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
superClass	TokenNameIdentifier	 super Class
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] whereas object of type "	TokenNameStringLiteral	] whereas object of type 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" was loaded by ["	TokenNameStringLiteral	" was loaded by [
+	TokenNamePLUS	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classObj	TokenNameIdentifier	 class Obj
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate class ["	TokenNameStringLiteral	Could not instantiate class [
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate class ["	TokenNameStringLiteral	Could not instantiate class [
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate class ["	TokenNameStringLiteral	Could not instantiate class [
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate class ["	TokenNameStringLiteral	Could not instantiate class [
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Perform variable substitution in string <code>val</code> from the values of keys found in the system propeties. <p>The variable substitution delimeters are <b>${</b> and <b>}</b>. <p>For example, if the System properties contains "key=value", then the call <pre> String s = OptionConverter.substituteVars("Value of key is ${key}."); </pre> will set the variable <code>s</code> to "Value of key is value.". <p>If no value could be found for the specified key, then the <code>props</code> parameter is searched, if the value could not be found there, then substitution defaults to the empty string. <p>For example, if system propeties contains no value for the key "inexistentKey", then the call <pre> String s = OptionConverter.subsVars("Value of inexistentKey is [${inexistentKey}]"); </pre> will set <code>s</code> to "Value of inexistentKey is []" <p>An {@link java.lang.IllegalArgumentException} is thrown if <code>val</code> contains a start delimeter "${" which is not balanced by a stop delimeter "}". </p> <p><b>Author</b> Avy Sharell</a></p> @param val The string on which variable substitution is performed. @throws IllegalArgumentException if <code>val</code> is malformed. */	TokenNameCOMMENT_JAVADOC	 Perform variable substitution in string <code>val</code> from the values of keys found in the system propeties. <p>The variable substitution delimeters are <b>${</b> and <b>}</b>. <p>For example, if the System properties contains "key=value", then the call <pre> String s = OptionConverter.substituteVars("Value of key is ${key}."); </pre> will set the variable <code>s</code> to "Value of key is value.". <p>If no value could be found for the specified key, then the <code>props</code> parameter is searched, if the value could not be found there, then substitution defaults to the empty string. <p>For example, if system propeties contains no value for the key "inexistentKey", then the call <pre> String s = OptionConverter.subsVars("Value of inexistentKey is [${inexistentKey}]"); </pre> will set <code>s</code> to "Value of inexistentKey is []" <p>An {@link java.lang.IllegalArgumentException} is thrown if <code>val</code> contains a start delimeter "${" which is not balanced by a stop delimeter "}". </p> <p><b>Author</b> Avy Sharell</a></p> @param val The string on which variable substitution is performed. @throws IllegalArgumentException if <code>val</code> is malformed. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DELIM_START	TokenNameIdentifier	 DELIM  START
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no more variables 	TokenNameCOMMENT_LINE	no more variables 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is a simple string 	TokenNameCOMMENT_LINE	this is a simple string 
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// add the tail string which contails no variables and return the result. 	TokenNameCOMMENT_LINE	add the tail string which contails no variables and return the result. 
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DELIM_STOP	TokenNameIdentifier	 DELIM  STOP
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
"" has no closing brace. Opening brace at position "	TokenNameStringLiteral	" has no closing brace. Opening brace at position 
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
+=	TokenNamePLUS_EQUAL	
DELIM_START_LEN	TokenNameIdentifier	 DELIM  START  LEN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first try in System properties 	TokenNameCOMMENT_LINE	first try in System properties 
String	TokenNameIdentifier	 String
replacement	TokenNameIdentifier	 replacement
=	TokenNameEQUAL	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// then try props parameter 	TokenNameCOMMENT_LINE	then try props parameter 
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
props	TokenNameIdentifier	 props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replacement	TokenNameIdentifier	 replacement
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do variable substitution on the replacement string 	TokenNameCOMMENT_LINE	Do variable substitution on the replacement string 
// such that we can solve "Hello ${x2}" as "Hello p1" 	TokenNameCOMMENT_LINE	such that we can solve "Hello ${x2}" as "Hello p1" 
// the where the properties are 	TokenNameCOMMENT_LINE	the where the properties are 
// x1=p1 	TokenNameCOMMENT_LINE	x1=p1 
// x2=${x1} 	TokenNameCOMMENT_LINE	x2=${x1} 
String	TokenNameIdentifier	 String
recursiveReplacement	TokenNameIdentifier	 recursive Replacement
=	TokenNameEQUAL	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
recursiveReplacement	TokenNameIdentifier	 recursive Replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
DELIM_STOP_LEN	TokenNameIdentifier	 DELIM  STOP  LEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Configure log4j given an {@link InputStream}. * * <p> * The InputStream will be interpreted by a new instance of a log4j configurator. * </p> * <p> * All configurations steps are taken on the <code>hierarchy</code> passed as a parameter. * </p> * * @param inputStream * The configuration input stream. * @param clazz * The class name, of the log4j configurator which will parse the <code>inputStream</code>. This must be a * subclass of {@link Configurator}, or null. If this value is null then a default configurator of * {@link PropertyConfigurator} is used. * @param hierarchy * The {@link org.apache.log4j.Hierarchy} to act on. * @since 1.2.17 */	TokenNameCOMMENT_JAVADOC	 Configure log4j given an {@link InputStream}. * <p> The InputStream will be interpreted by a new instance of a log4j configurator. </p> <p> All configurations steps are taken on the <code>hierarchy</code> passed as a parameter. </p> * @param inputStream The configuration input stream. @param clazz The class name, of the log4j configurator which will parse the <code>inputStream</code>. This must be a subclass of {@link Configurator}, or null. If this value is null then a default configurator of {@link PropertyConfigurator} is used. @param hierarchy The {@link org.apache.log4j.Hierarchy} to act on. @since 1.2.17 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
selectAndConfigure	TokenNameIdentifier	 select And Configure
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
LoggerRepository	TokenNameIdentifier	 Logger Repository
hierarchy	TokenNameIdentifier	 hierarchy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Configurator	TokenNameIdentifier	 Configurator
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Preferred configurator class: "	TokenNameStringLiteral	Preferred configurator class: 
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Configurator	TokenNameIdentifier	 Configurator
)	TokenNameRPAREN	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
Configurator	TokenNameIdentifier	 Configurator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configurator	TokenNameIdentifier	 configurator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate configurator ["	TokenNameStringLiteral	Could not instantiate configurator [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
hierarchy	TokenNameIdentifier	 hierarchy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Configure log4j given a URL. <p>The url must point to a file or resource which will be interpreted by a new instance of a log4j configurator. <p>All configurations steps are taken on the <code>hierarchy</code> passed as a parameter. <p> @param url The location of the configuration file or resource. @param clazz The classname, of the log4j configurator which will parse the file or resource at <code>url</code>. This must be a subclass of {@link Configurator}, or null. If this value is null then a default configurator of {@link PropertyConfigurator} is used, unless the filename pointed to by <code>url</code> ends in '.xml', in which case {@link org.apache.log4j.xml.DOMConfigurator} is used. @param hierarchy The {@link org.apache.log4j.Hierarchy} to act on. @since 1.1.4 */	TokenNameCOMMENT_JAVADOC	 Configure log4j given a URL. <p>The url must point to a file or resource which will be interpreted by a new instance of a log4j configurator. <p>All configurations steps are taken on the <code>hierarchy</code> passed as a parameter. <p> @param url The location of the configuration file or resource. @param clazz The classname, of the log4j configurator which will parse the file or resource at <code>url</code>. This must be a subclass of {@link Configurator}, or null. If this value is null then a default configurator of {@link PropertyConfigurator} is used, unless the filename pointed to by <code>url</code> ends in '.xml', in which case {@link org.apache.log4j.xml.DOMConfigurator} is used. @param hierarchy The {@link org.apache.log4j.Hierarchy} to act on. @since 1.1.4 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
selectAndConfigure	TokenNameIdentifier	 select And Configure
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
LoggerRepository	TokenNameIdentifier	 Logger Repository
hierarchy	TokenNameIdentifier	 hierarchy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Configurator	TokenNameIdentifier	 Configurator
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
filename	TokenNameIdentifier	 filename
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
"org.apache.log4j.xml.DOMConfigurator"	TokenNameStringLiteral	org.apache.log4j.xml.DOMConfigurator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Preferred configurator class: "	TokenNameStringLiteral	Preferred configurator class: 
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Configurator	TokenNameIdentifier	 Configurator
)	TokenNameRPAREN	
instantiateByClassName	TokenNameIdentifier	 instantiate By Class Name
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
Configurator	TokenNameIdentifier	 Configurator
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configurator	TokenNameIdentifier	 configurator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not instantiate configurator ["	TokenNameStringLiteral	Could not instantiate configurator [
+	TokenNamePLUS	
clazz	TokenNameIdentifier	 clazz
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
configurator	TokenNameIdentifier	 configurator
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
doConfigure	TokenNameIdentifier	 do Configure
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
hierarchy	TokenNameIdentifier	 hierarchy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
