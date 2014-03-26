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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CollectionUtils	TokenNameIdentifier	 Collection Utils
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Holds the data of a jar manifest. * * Manifests are processed according to the * {@link <a href="http://java.sun.com/j2se/1.5.0/docs/guide/jar/jar.html">Jar * file specification.</a>}. * Specifically, a manifest element consists of * a set of attributes and sections. These sections in turn may contain * attributes. Note in particular that this may result in manifest lines * greater than 72 bytes being wrapped and continued on the next * line. If an application can not handle the continuation mechanism, it * is a defect in the application, not this task. * * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Holds the data of a jar manifest. * Manifests are processed according to the {@link <a href="http://java.sun.com/j2se/1.5.0/docs/guide/jar/jar.html">Jar file specification.</a>}. Specifically, a manifest element consists of a set of attributes and sections. These sections in turn may contain attributes. Note in particular that this may result in manifest lines greater than 72 bytes being wrapped and continued on the next line. If an application can not handle the continuation mechanism, it is a defect in the application, not this task. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Manifest	TokenNameIdentifier	 Manifest
{	TokenNameLBRACE	
/** The standard manifest version header */	TokenNameCOMMENT_JAVADOC	 The standard manifest version header 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_MANIFEST_VERSION	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION
=	TokenNameEQUAL	
"Manifest-Version"	TokenNameStringLiteral	Manifest-Version
;	TokenNameSEMICOLON	
/** The standard Signature Version header */	TokenNameCOMMENT_JAVADOC	 The standard Signature Version header 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_SIGNATURE_VERSION	TokenNameIdentifier	 ATTRIBUTE  SIGNATURE  VERSION
=	TokenNameEQUAL	
"Signature-Version"	TokenNameStringLiteral	Signature-Version
;	TokenNameSEMICOLON	
/** The Name Attribute is the first in a named section */	TokenNameCOMMENT_JAVADOC	 The Name Attribute is the first in a named section 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
=	TokenNameEQUAL	
"Name"	TokenNameStringLiteral	Name
;	TokenNameSEMICOLON	
/** The From Header is disallowed in a Manifest */	TokenNameCOMMENT_JAVADOC	 The From Header is disallowed in a Manifest 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_FROM	TokenNameIdentifier	 ATTRIBUTE  FROM
=	TokenNameEQUAL	
"From"	TokenNameStringLiteral	From
;	TokenNameSEMICOLON	
/** The Class-Path Header is special - it can be duplicated */	TokenNameCOMMENT_JAVADOC	 The Class-Path Header is special - it can be duplicated 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_CLASSPATH	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH
=	TokenNameEQUAL	
"Class-Path"	TokenNameStringLiteral	Class-Path
;	TokenNameSEMICOLON	
/** Default Manifest version if one is not specified */	TokenNameCOMMENT_JAVADOC	 Default Manifest version if one is not specified 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_MANIFEST_VERSION	TokenNameIdentifier	 DEFAULT  MANIFEST  VERSION
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
;	TokenNameSEMICOLON	
/** The max length of a line in a Manifest */	TokenNameCOMMENT_JAVADOC	 The max length of a line in a Manifest 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_LINE_LENGTH	TokenNameIdentifier	 MAX  LINE  LENGTH
=	TokenNameEQUAL	
72	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Max length of a line section which is continued. Need to allow * for the CRLF. */	TokenNameCOMMENT_JAVADOC	 Max length of a line section which is continued. Need to allow for the CRLF. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_SECTION_LENGTH	TokenNameIdentifier	 MAX  SECTION  LENGTH
=	TokenNameEQUAL	
MAX_LINE_LENGTH	TokenNameIdentifier	 MAX  LINE  LENGTH
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The End-Of-Line marker in manifests */	TokenNameCOMMENT_JAVADOC	 The End-Of-Line marker in manifests 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EOL	TokenNameIdentifier	 EOL
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Error for attributes */	TokenNameCOMMENT_JAVADOC	 Error for attributes 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_FROM_FORBIDDEN	TokenNameIdentifier	 ERROR  FROM  FORBIDDEN
=	TokenNameEQUAL	
"Manifest attributes should not start "	TokenNameStringLiteral	Manifest attributes should not start 
+	TokenNamePLUS	
"with ""	TokenNameStringLiteral	with "
+	TokenNamePLUS	
ATTRIBUTE_FROM	TokenNameIdentifier	 ATTRIBUTE  FROM
+	TokenNamePLUS	
"" in ""	TokenNameStringLiteral	" in "
;	TokenNameSEMICOLON	
/** Encoding to be used for JAR files. */	TokenNameCOMMENT_JAVADOC	 Encoding to be used for JAR files. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAR_ENCODING	TokenNameIdentifier	 JAR  ENCODING
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_MANIFEST_VERSION_LC	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION  LC
=	TokenNameEQUAL	
ATTRIBUTE_MANIFEST_VERSION	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_NAME_LC	TokenNameIdentifier	 ATTRIBUTE  NAME  LC
=	TokenNameEQUAL	
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_FROM_LC	TokenNameIdentifier	 ATTRIBUTE  FROM  LC
=	TokenNameEQUAL	
ATTRIBUTE_FROM	TokenNameIdentifier	 ATTRIBUTE  FROM
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_CLASSPATH_LC	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH  LC
=	TokenNameEQUAL	
ATTRIBUTE_CLASSPATH	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An attribute for the manifest. * Those attributes that are not nested into a section will be added to the "Main" section. */	TokenNameCOMMENT_JAVADOC	 An attribute for the manifest. Those attributes that are not nested into a section will be added to the "Main" section. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * Maximum length of the name to have the value starting on the same * line as the name. This to stay under 72 bytes total line length * (including CRLF). */	TokenNameCOMMENT_JAVADOC	 Maximum length of the name to have the value starting on the same line as the name. This to stay under 72 bytes total line length (including CRLF). 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_NAME_VALUE_LENGTH	TokenNameIdentifier	 MAX  NAME  VALUE  LENGTH
=	TokenNameEQUAL	
68	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Maximum length of the name according to the jar specification. * In this case the first line will have 74 bytes total line length * (including CRLF). This conflicts with the 72 bytes total line length * max, but is the only possible conclusion from the manifest specification, if * names with 70 bytes length are allowed, have to be on the first line, and * have to be followed by ": ". */	TokenNameCOMMENT_JAVADOC	 Maximum length of the name according to the jar specification. In this case the first line will have 74 bytes total line length (including CRLF). This conflicts with the 72 bytes total line length max, but is the only possible conclusion from the manifest specification, if names with 70 bytes length are allowed, have to be on the first line, and have to be followed by ": ". 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_NAME_LENGTH	TokenNameIdentifier	 MAX  NAME  LENGTH
=	TokenNameEQUAL	
70	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The attribute's name */	TokenNameCOMMENT_JAVADOC	 The attribute's name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The attribute's value */	TokenNameCOMMENT_JAVADOC	 The attribute's value 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * For multivalued attributes, this is the index of the attribute * currently being defined. */	TokenNameCOMMENT_JAVADOC	 For multivalued attributes, this is the index of the attribute currently being defined. 
private	TokenNameprivate	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct an empty attribute */	TokenNameCOMMENT_JAVADOC	 Construct an empty attribute 
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct an attribute by parsing a line from the Manifest * * @param line the line containing the attribute name and value * * @throws ManifestException if the line is not valid */	TokenNameCOMMENT_JAVADOC	 Construct an attribute by parsing a line from the Manifest * @param line the line containing the attribute name and value * @throws ManifestException if the line is not valid 
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a manifest by specifying its name and value * * @param name the attribute's name * @param value the Attribute's value */	TokenNameCOMMENT_JAVADOC	 Construct a manifest by specifying its name and value * @param name the attribute's name @param value the Attribute's value 
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#hashCode * @return a hashcode based on the key and values. */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#hashCode @return a hashcode based on the key and values. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashCode	TokenNameIdentifier	 hash Code
+=	TokenNamePLUS_EQUAL	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hashCode	TokenNameIdentifier	 hash Code
+=	TokenNamePLUS_EQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param rhs the object to check for equality. * @see java.lang.Object#equals * @return true if the key and values are the same. */	TokenNameCOMMENT_JAVADOC	 @param rhs the object to check for equality. @see java.lang.Object#equals @return true if the key and values are the same. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Attribute	TokenNameIdentifier	 Attribute
rhsAttribute	TokenNameIdentifier	 rhs Attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lhsKey	TokenNameIdentifier	 lhs Key
=	TokenNameEQUAL	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rhsKey	TokenNameIdentifier	 rhs Key
=	TokenNameEQUAL	
rhsAttribute	TokenNameIdentifier	 rhs Attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lhsKey	TokenNameIdentifier	 lhs Key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhsKey	TokenNameIdentifier	 rhs Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lhsKey	TokenNameIdentifier	 lhs Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lhsKey	TokenNameIdentifier	 lhs Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsKey	TokenNameIdentifier	 rhs Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsAttribute	TokenNameIdentifier	 rhs Attribute
.	TokenNameDOT	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a line into name and value pairs * * @param line the line to be parsed * * @throws ManifestException if the line does not contain a colon * separating the name and value */	TokenNameCOMMENT_JAVADOC	 Parse a line into name and value pairs * @param line the line to be parsed * @throws ManifestException if the line does not contain a colon separating the name and value 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ManifestException	TokenNameIdentifier	 Manifest Exception
(	TokenNameLPAREN	
"Manifest line ""	TokenNameStringLiteral	Manifest line "
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"" is not valid as it does not "	TokenNameStringLiteral	" is not valid as it does not 
+	TokenNamePLUS	
"contain a name and a value separated by ': ' "	TokenNameStringLiteral	contain a name and a value separated by ': ' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Attribute's name; required * * @param name the attribute's name */	TokenNameCOMMENT_JAVADOC	 Set the Attribute's name; required * @param name the attribute's name 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Attribute's name * * @return the attribute's name. */	TokenNameCOMMENT_JAVADOC	 Get the Attribute's name * @return the attribute's name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute's Key - its name in lower case. * * @return the attribute's key. */	TokenNameCOMMENT_JAVADOC	 Get the attribute's Key - its name in lower case. * @return the attribute's key. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Attribute's value; required * * @param value the attribute's value */	TokenNameCOMMENT_JAVADOC	 Set the Attribute's value; required * @param value the attribute's value 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
>=	TokenNameGREATER_EQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the Attribute's value. * * @return the attribute's value. */	TokenNameCOMMENT_JAVADOC	 Get the Attribute's value. * @return the attribute's value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
fullValue	TokenNameIdentifier	 full Value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fullValue	TokenNameIdentifier	 full Value
+=	TokenNamePLUS_EQUAL	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fullValue	TokenNameIdentifier	 full Value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new value to this attribute - making it multivalued. * * @param value the attribute's additional value */	TokenNameCOMMENT_JAVADOC	 Add a new value to this attribute - making it multivalued. * @param value the attribute's additional value 
public	TokenNamepublic	
void	TokenNamevoid	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get all the attribute's values. * * @return an enumeration of the attributes values */	TokenNameCOMMENT_JAVADOC	 Get all the attribute's values. * @return an enumeration of the attributes values 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a continuation line from the Manifest file. * * When lines are too long in a manifest, they are continued on the * next line by starting with a space. This method adds the continuation * data to the attribute value by skipping the first character. * * @param line the continuation line. */	TokenNameCOMMENT_JAVADOC	 Add a continuation line from the Manifest file. * When lines are too long in a manifest, they are continued on the next line by starting with a space. This method adds the continuation data to the attribute value by skipping the first character. * @param line the continuation line. 
public	TokenNamepublic	
void	TokenNamevoid	
addContinuation	TokenNameIdentifier	 add Continuation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentValue	TokenNameIdentifier	 current Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
currentValue	TokenNameIdentifier	 current Value
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the attribute out to a print writer without * flattening multi-values attributes (i.e. Class-Path). * * @param writer the Writer to which the attribute is written * * @throws IOException if the attribute value cannot be written */	TokenNameCOMMENT_JAVADOC	 Write the attribute out to a print writer without flattening multi-values attributes (i.e. Class-Path). * @param writer the Writer to which the attribute is written * @throws IOException if the attribute value cannot be written 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the attribute out to a print writer. * * @param writer the Writer to which the attribute is written * @param flatten whether to collapse multi-valued attributes * (i.e. potentially Class-Path) Class-Path into a * single attribute. * * @throws IOException if the attribute value cannot be written * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Write the attribute out to a print writer. * @param writer the Writer to which the attribute is written @param flatten whether to collapse multi-valued attributes (i.e. potentially Class-Path) Class-Path into a single attribute. * @throws IOException if the attribute value cannot be written @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write a single attribute value out * * @param writer the Writer to which the attribute is written * @param value the attribute value * * @throws IOException if the attribute value cannot be written */	TokenNameCOMMENT_JAVADOC	 Write a single attribute value out * @param writer the Writer to which the attribute is written @param value the attribute value * @throws IOException if the attribute value cannot be written 
private	TokenNameprivate	
void	TokenNamevoid	
writeValue	TokenNameIdentifier	 write Value
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nameLength	TokenNameIdentifier	 name Length
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
JAR_ENCODING	TokenNameIdentifier	 JAR  ENCODING
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameLength	TokenNameIdentifier	 name Length
>	TokenNameGREATER	
MAX_NAME_VALUE_LENGTH	TokenNameIdentifier	 MAX  NAME  VALUE  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nameLength	TokenNameIdentifier	 name Length
>	TokenNameGREATER	
MAX_NAME_LENGTH	TokenNameIdentifier	 MAX  NAME  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unable to write manifest line "	TokenNameStringLiteral	Unable to write manifest line 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
JAR_ENCODING	TokenNameIdentifier	 JAR  ENCODING
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
MAX_SECTION_LENGTH	TokenNameIdentifier	 MAX  SECTION  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to find a MAX_LINE_LENGTH byte section 	TokenNameCOMMENT_LINE	try to find a MAX_LINE_LENGTH byte section 
int	TokenNameint	
breakIndex	TokenNameIdentifier	 break Index
=	TokenNameEQUAL	
MAX_SECTION_LENGTH	TokenNameIdentifier	 MAX  SECTION  LENGTH
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
breakIndex	TokenNameIdentifier	 break Index
>=	TokenNameGREATER_EQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
breakIndex	TokenNameIdentifier	 break Index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
breakIndex	TokenNameIdentifier	 break Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
JAR_ENCODING	TokenNameIdentifier	 JAR  ENCODING
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
MAX_SECTION_LENGTH	TokenNameIdentifier	 MAX  SECTION  LENGTH
&&	TokenNameAND_AND	
breakIndex	TokenNameIdentifier	 break Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
breakIndex	TokenNameIdentifier	 break Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
breakIndex	TokenNameIdentifier	 break Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
breakIndex	TokenNameIdentifier	 break Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unable to write manifest line "	TokenNameStringLiteral	Unable to write manifest line 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
breakIndex	TokenNameIdentifier	 break Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A manifest section - you can nest attribute elements into sections. * A section consists of a set of attribute values, * separated from other sections by a blank line. */	TokenNameCOMMENT_JAVADOC	 A manifest section - you can nest attribute elements into sections. A section consists of a set of attribute values, separated from other sections by a blank line. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Section	TokenNameIdentifier	 Section
{	TokenNameLBRACE	
/** Warnings for this section */	TokenNameCOMMENT_JAVADOC	 Warnings for this section 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
warnings	TokenNameIdentifier	 warnings
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The section's name if any. The main section in a * manifest is unnamed. */	TokenNameCOMMENT_JAVADOC	 The section's name if any. The main section in a manifest is unnamed. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The section's attributes.*/	TokenNameCOMMENT_JAVADOC	 The section's attributes.
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The name of the section; optional -default is the main section. * @param name the section's name */	TokenNameCOMMENT_JAVADOC	 The name of the section; optional -default is the main section. @param name the section's name 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Section's name. * * @return the section's name. */	TokenNameCOMMENT_JAVADOC	 Get the Section's name. * @return the section's name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a section through a reader. * * @param reader the reader from which the section is read * * @return the name of the next section if it has been read as * part of this section - This only happens if the * Manifest is malformed. * * @throws ManifestException if the section is not valid according * to the JAR spec * @throws IOException if the section cannot be read from the reader. */	TokenNameCOMMENT_JAVADOC	 Read a section through a reader. * @param reader the reader from which the section is read * @return the name of the next section if it has been read as part of this section - This only happens if the Manifest is malformed. * @throws ManifestException if the section is not valid according to the JAR spec @throws IOException if the section cannot be read from the reader. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// continuation line 	TokenNameCOMMENT_LINE	continuation line 
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a continuation on the first line is a 	TokenNameCOMMENT_LINE	a continuation on the first line is a 
// continuation of the name - concatenate this 	TokenNameCOMMENT_LINE	continuation of the name - concatenate this 
// line and the name 	TokenNameCOMMENT_LINE	line and the name 
name	TokenNameIdentifier	 name
+=	TokenNamePLUS_EQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ManifestException	TokenNameIdentifier	 Manifest Exception
(	TokenNameLPAREN	
"Can't start an "	TokenNameStringLiteral	Can't start an 
+	TokenNamePLUS	
"attribute with a continuation line "	TokenNameStringLiteral	attribute with a continuation line 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
addContinuation	TokenNameIdentifier	 add Continuation
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameReadAhead	TokenNameIdentifier	 name Read Ahead
=	TokenNameEQUAL	
addAttributeAndCheck	TokenNameIdentifier	 add Attribute And Check
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// refresh attribute in case of multivalued attributes. 	TokenNameCOMMENT_LINE	refresh attribute in case of multivalued attributes. 
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameReadAhead	TokenNameIdentifier	 name Read Ahead
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nameReadAhead	TokenNameIdentifier	 name Read Ahead
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Merge in another section without merging Class-Path attributes. * * @param section the section to be merged with this one. * * @throws ManifestException if the sections cannot be merged. */	TokenNameCOMMENT_JAVADOC	 Merge in another section without merging Class-Path attributes. * @param section the section to be merged with this one. * @throws ManifestException if the sections cannot be merged. 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge in another section * * @param section the section to be merged with this one. * @param mergeClassPaths whether Class-Path attributes should * be merged. * * @throws ManifestException if the sections cannot be merged. */	TokenNameCOMMENT_JAVADOC	 Merge in another section * @param section the section to be merged with this one. @param mergeClassPaths whether Class-Path attributes should be merged. * @throws ManifestException if the sections cannot be merged. 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ManifestException	TokenNameIdentifier	 Manifest Exception
(	TokenNameLPAREN	
"Unable to merge sections "	TokenNameStringLiteral	Unable to merge sections 
+	TokenNamePLUS	
"with different names"	TokenNameStringLiteral	with different names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attribute	TokenNameIdentifier	 Attribute
classpathAttribute	TokenNameIdentifier	 classpath Attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ATTRIBUTE_CLASSPATH	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
ATTRIBUTE_CLASSPATH	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
cpe	TokenNameIdentifier	 cpe
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cpe	TokenNameIdentifier	 cpe
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
cpe	TokenNameIdentifier	 cpe
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
.	TokenNameDOT	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the merge file always wins 	TokenNameCOMMENT_LINE	the merge file always wins 
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
currentCp	TokenNameIdentifier	 current Cp
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
ATTRIBUTE_CLASSPATH	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentCp	TokenNameIdentifier	 current Cp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
attribEnum	TokenNameIdentifier	 attrib Enum
=	TokenNameEQUAL	
currentCp	TokenNameIdentifier	 current Cp
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attribEnum	TokenNameIdentifier	 attrib Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attribEnum	TokenNameIdentifier	 attrib Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
.	TokenNameDOT	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add in the warnings 	TokenNameCOMMENT_LINE	add in the warnings 
Enumeration	TokenNameIdentifier	 Enumeration
warnEnum	TokenNameIdentifier	 warn Enum
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
warnEnum	TokenNameIdentifier	 warn Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
warnEnum	TokenNameIdentifier	 warn Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write the section out to a print writer without flattening * multi-values attributes (i.e. Class-Path). * * @param writer the Writer to which the section is written * * @throws IOException if the section cannot be written */	TokenNameCOMMENT_JAVADOC	 Write the section out to a print writer without flattening multi-values attributes (i.e. Class-Path). * @param writer the Writer to which the section is written * @throws IOException if the section cannot be written 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the section out to a print writer. * * @param writer the Writer to which the section is written * @param flatten whether to collapse multi-valued attributes * (i.e. potentially Class-Path) Class-Path into a * single attribute. * * @throws IOException if the section cannot be written * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Write the section out to a print writer. * @param writer the Writer to which the section is written @param flatten whether to collapse multi-valued attributes (i.e. potentially Class-Path) Class-Path into a single attribute. * @throws IOException if the section cannot be written @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
nameAttr	TokenNameIdentifier	 name Attr
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameAttr	TokenNameIdentifier	 name Attr
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a attribute of the section * * @param attributeName the name of the attribute * @return a Manifest.Attribute instance if the attribute is * single-valued, otherwise a Vector of Manifest.Attribute * instances. */	TokenNameCOMMENT_JAVADOC	 Get a attribute of the section * @param attributeName the name of the attribute @return a Manifest.Attribute instance if the attribute is single-valued, otherwise a Vector of Manifest.Attribute instances. 
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute keys. * * @return an Enumeration of Strings, each string being the lower case * key of an attribute of the section. */	TokenNameCOMMENT_JAVADOC	 Get the attribute keys. * @return an Enumeration of Strings, each string being the lower case key of an attribute of the section. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
asEnumeration	TokenNameIdentifier	 as Enumeration
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of the attribute with the name given. * * @param attributeName the name of the attribute to be returned. * * @return the attribute's value or null if the attribute does not exist * in the section */	TokenNameCOMMENT_JAVADOC	 Get the value of the attribute with the name given. * @param attributeName the name of the attribute to be returned. * @return the attribute's value or null if the attribute does not exist in the section 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove the given attribute from the section * * @param attributeName the name of the attribute to be removed. */	TokenNameCOMMENT_JAVADOC	 Remove the given attribute from the section * @param attributeName the name of the attribute to be removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an attribute to the section. * * @param attribute the attribute to be added to the section * * @exception ManifestException if the attribute is not valid. */	TokenNameCOMMENT_JAVADOC	 Add an attribute to the section. * @param attribute the attribute to be added to the section * @exception ManifestException if the attribute is not valid. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
addAttributeAndCheck	TokenNameIdentifier	 add Attribute And Check
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Specify the section name using "	TokenNameStringLiteral	Specify the section name using 
+	TokenNamePLUS	
"the "name" attribute of the <section> element rather "	TokenNameStringLiteral	the "name" attribute of the <section> element rather 
+	TokenNamePLUS	
"than using a "Name" manifest attribute"	TokenNameStringLiteral	than using a "Name" manifest attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add an attribute to the section * * @param attribute the attribute to be added. * * @return the value of the attribute if it is a name * attribute - null other wise * * @exception ManifestException if the attribute already * exists in this section. */	TokenNameCOMMENT_JAVADOC	 Add an attribute to the section * @param attribute the attribute to be added. * @return the value of the attribute if it is a name attribute - null other wise * @exception ManifestException if the attribute already exists in this section. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addAttributeAndCheck	TokenNameIdentifier	 add Attribute And Check
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Attributes must have name and value"	TokenNameStringLiteral	Attributes must have name and value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
attributeKey	TokenNameIdentifier	 attribute Key
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ATTRIBUTE_NAME_LC	TokenNameIdentifier	 ATTRIBUTE  NAME  LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
+	TokenNamePLUS	
"" attributes "	TokenNameStringLiteral	" attributes 
+	TokenNamePLUS	
"should not occur in the main section and must be the "	TokenNameStringLiteral	should not occur in the main section and must be the 
+	TokenNamePLUS	
"first element in all other sections: ""	TokenNameStringLiteral	first element in all other sections: "
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ATTRIBUTE_FROM_LC	TokenNameIdentifier	 ATTRIBUTE  FROM  LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ERROR_FROM_FORBIDDEN	TokenNameIdentifier	 ERROR  FROM  FORBIDDEN
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// classpath attributes go into a vector 	TokenNameCOMMENT_LINE	classpath attributes go into a vector 
if	TokenNameif	
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ATTRIBUTE_CLASSPATH_LC	TokenNameIdentifier	 ATTRIBUTE  CLASSPATH  LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
classpathAttribute	TokenNameIdentifier	 classpath Attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"Multiple Class-Path attributes "	TokenNameStringLiteral	Multiple Class-Path attributes 
+	TokenNamePLUS	
"are supported but violate the Jar "	TokenNameStringLiteral	are supported but violate the Jar 
+	TokenNamePLUS	
"specification and may not be correctly "	TokenNameStringLiteral	specification and may not be correctly 
+	TokenNamePLUS	
"processed in all environments"	TokenNameStringLiteral	processed in all environments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpathAttribute	TokenNameIdentifier	 classpath Attribute
.	TokenNameDOT	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ManifestException	TokenNameIdentifier	 Manifest Exception
(	TokenNameLPAREN	
"The attribute ""	TokenNameStringLiteral	The attribute "
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" may not occur more "	TokenNameStringLiteral	" may not occur more 
+	TokenNamePLUS	
"than once in the same section"	TokenNameStringLiteral	than once in the same section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone this section * * @return the cloned Section * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Clone this section * @return the cloned Section @since Ant 1.5.2 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Section	TokenNameIdentifier	 Section
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
new	TokenNamenew	
Section	TokenNameIdentifier	 Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getAttributeKeys	TokenNameIdentifier	 get Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cloned	TokenNameIdentifier	 cloned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Store an attribute and update the index. * * @param attribute the attribute to be stored */	TokenNameCOMMENT_JAVADOC	 Store an attribute and update the index. * @param attribute the attribute to be stored 
private	TokenNameprivate	
void	TokenNamevoid	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
attributeKey	TokenNameIdentifier	 attribute Key
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
attributeKey	TokenNameIdentifier	 attribute Key
,	TokenNameCOMMA	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the warnings for this section. * * @return an Enumeration of warning strings. */	TokenNameCOMMENT_JAVADOC	 Get the warnings for this section. * @return an Enumeration of warning strings. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#hashCode * @return a hash value based on the attributes. */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#hashCode @return a hash value based on the attributes. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#equals * @param rhs the object to check for equality. * @return true if the attributes are the same. */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#equals @param rhs the object to check for equality. @return true if the attributes are the same. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Section	TokenNameIdentifier	 Section
rhsSection	TokenNameIdentifier	 rhs Section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsSection	TokenNameIdentifier	 rhs Section
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The version of this manifest */	TokenNameCOMMENT_JAVADOC	 The version of this manifest 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
manifestVersion	TokenNameIdentifier	 manifest Version
=	TokenNameEQUAL	
DEFAULT_MANIFEST_VERSION	TokenNameIdentifier	 DEFAULT  MANIFEST  VERSION
;	TokenNameSEMICOLON	
/** The main section of this manifest */	TokenNameCOMMENT_JAVADOC	 The main section of this manifest 
private	TokenNameprivate	
Section	TokenNameIdentifier	 Section
mainSection	TokenNameIdentifier	 main Section
=	TokenNameEQUAL	
new	TokenNamenew	
Section	TokenNameIdentifier	 Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The named sections of this manifest */	TokenNameCOMMENT_JAVADOC	 The named sections of this manifest 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
sections	TokenNameIdentifier	 sections
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a manifest from Ant's default manifest file. * * @return the default manifest. * @exception BuildException if there is a problem loading the * default manifest */	TokenNameCOMMENT_JAVADOC	 Construct a manifest from Ant's default manifest file. * @return the default manifest. @exception BuildException if there is a problem loading the default manifest 
public	TokenNamepublic	
static	TokenNamestatic	
Manifest	TokenNameIdentifier	 Manifest
getDefaultManifest	TokenNameIdentifier	 get Default Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
insr	TokenNameIdentifier	 insr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
defManifest	TokenNameIdentifier	 def Manifest
=	TokenNameEQUAL	
"/org/apache/tools/ant/defaultManifest.mf"	TokenNameStringLiteral	/org/apache/tools/ant/defaultManifest.mf
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
Manifest	TokenNameIdentifier	 Manifest
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
defManifest	TokenNameIdentifier	 def Manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not find default manifest: "	TokenNameStringLiteral	Could not find default manifest: 
+	TokenNamePLUS	
defManifest	TokenNameIdentifier	 def Manifest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
insr	TokenNameIdentifier	 insr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Manifest	TokenNameIdentifier	 Manifest
defaultManifest	TokenNameIdentifier	 default Manifest
=	TokenNameEQUAL	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
insr	TokenNameIdentifier	 insr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.runtime.version"	TokenNameStringLiteral	java.runtime.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vm.version"	TokenNameStringLiteral	java.vm.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Attribute	TokenNameIdentifier	 Attribute
createdBy	TokenNameIdentifier	 created By
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
"Created-By"	TokenNameStringLiteral	Created-By
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vm.vendor"	TokenNameStringLiteral	java.vm.vendor
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultManifest	TokenNameIdentifier	 default Manifest
.	TokenNameDOT	
getMainSection	TokenNameIdentifier	 get Main Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
storeAttribute	TokenNameIdentifier	 store Attribute
(	TokenNameLPAREN	
createdBy	TokenNameIdentifier	 created By
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultManifest	TokenNameIdentifier	 default Manifest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insr	TokenNameIdentifier	 insr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
insr	TokenNameIdentifier	 insr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ManifestException	TokenNameIdentifier	 Manifest Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Default manifest is invalid !!"	TokenNameStringLiteral	Default manifest is invalid !!
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to read default manifest"	TokenNameStringLiteral	Unable to read default manifest
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
insr	TokenNameIdentifier	 insr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Construct an empty manifest */	TokenNameCOMMENT_JAVADOC	 Construct an empty manifest 
public	TokenNamepublic	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manifestVersion	TokenNameIdentifier	 manifest Version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a manifest file from the given reader * * @param r is the reader from which the Manifest is read * * @throws ManifestException if the manifest is not valid according * to the JAR spec * @throws IOException if the manifest cannot be read from the reader. */	TokenNameCOMMENT_JAVADOC	 Read a manifest file from the given reader * @param r is the reader from which the Manifest is read * @throws ManifestException if the manifest is not valid according to the JAR spec @throws IOException if the manifest cannot be read from the reader. 
public	TokenNamepublic	
Manifest	TokenNameIdentifier	 Manifest
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This should be the manifest version 	TokenNameCOMMENT_LINE	This should be the manifest version 
String	TokenNameIdentifier	 String
nextSectionName	TokenNameIdentifier	 next Section Name
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
readManifestVersion	TokenNameIdentifier	 read Manifest Version
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
ATTRIBUTE_MANIFEST_VERSION	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readManifestVersion	TokenNameIdentifier	 read Manifest Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manifestVersion	TokenNameIdentifier	 manifest Version
=	TokenNameEQUAL	
readManifestVersion	TokenNameIdentifier	 read Manifest Version
;	TokenNameSEMICOLON	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
ATTRIBUTE_MANIFEST_VERSION	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
new	TokenNamenew	
Section	TokenNameIdentifier	 Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextSectionName	TokenNameIdentifier	 next Section Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
sectionName	TokenNameIdentifier	 section Name
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sectionName	TokenNameIdentifier	 section Name
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ManifestException	TokenNameIdentifier	 Manifest Exception
(	TokenNameLPAREN	
"Manifest sections should "	TokenNameStringLiteral	Manifest sections should 
+	TokenNamePLUS	
"start with a ""	TokenNameStringLiteral	start with a "
+	TokenNamePLUS	
ATTRIBUTE_NAME	TokenNameIdentifier	 ATTRIBUTE  NAME
+	TokenNamePLUS	
"" attribute and not ""	TokenNameStringLiteral	" attribute and not "
+	TokenNamePLUS	
sectionName	TokenNameIdentifier	 section Name
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextSectionName	TokenNameIdentifier	 next Section Name
=	TokenNameEQUAL	
sectionName	TokenNameIdentifier	 section Name
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we have already started reading this section 	TokenNameCOMMENT_LINE	we have already started reading this section 
// this line is the first attribute. set it and then 	TokenNameCOMMENT_LINE	this line is the first attribute. set it and then 
// let the normal read handle the rest 	TokenNameCOMMENT_LINE	let the normal read handle the rest 
Attribute	TokenNameIdentifier	 Attribute
firstAttribute	TokenNameIdentifier	 first Attribute
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
addAttributeAndCheck	TokenNameIdentifier	 add Attribute And Check
(	TokenNameLPAREN	
firstAttribute	TokenNameIdentifier	 first Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
nextSectionName	TokenNameIdentifier	 next Section Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextSectionName	TokenNameIdentifier	 next Section Name
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addConfiguredSection	TokenNameIdentifier	 add Configured Section
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a section to the manifest * * @param section the manifest section to be added * * @exception ManifestException if the secti0on is not valid. */	TokenNameCOMMENT_JAVADOC	 Add a section to the manifest * @param section the manifest section to be added * @exception ManifestException if the secti0on is not valid. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredSection	TokenNameIdentifier	 add Configured Section
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sectionName	TokenNameIdentifier	 section Name
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sectionName	TokenNameIdentifier	 section Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Sections must have a name"	TokenNameStringLiteral	Sections must have a name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
sectionName	TokenNameIdentifier	 section Name
,	TokenNameCOMMA	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an attribute to the manifest - it is added to the main section. * * @param attribute the attribute to be added. * * @exception ManifestException if the attribute is not valid. */	TokenNameCOMMENT_JAVADOC	 Add an attribute to the manifest - it is added to the main section. * @param attribute the attribute to be added. * @exception ManifestException if the attribute is not valid. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Attributes must have name and value"	TokenNameStringLiteral	Attributes must have name and value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ATTRIBUTE_MANIFEST_VERSION_LC	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION  LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manifestVersion	TokenNameIdentifier	 manifest Version
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Merge the contents of the given manifest into this manifest * without merging Class-Path attributes. * * @param other the Manifest to be merged with this one. * * @throws ManifestException if there is a problem merging the * manifest according to the Manifest spec. */	TokenNameCOMMENT_JAVADOC	 Merge the contents of the given manifest into this manifest without merging Class-Path attributes. * @param other the Manifest to be merged with this one. * @throws ManifestException if there is a problem merging the manifest according to the Manifest spec. 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge the contents of the given manifest into this manifest * without merging Class-Path attributes. * * @param other the Manifest to be merged with this one. * @param overwriteMain whether to overwrite the main section * of the current manifest * * @throws ManifestException if there is a problem merging the * manifest according to the Manifest spec. */	TokenNameCOMMENT_JAVADOC	 Merge the contents of the given manifest into this manifest without merging Class-Path attributes. * @param other the Manifest to be merged with this one. @param overwriteMain whether to overwrite the main section of the current manifest * @throws ManifestException if there is a problem merging the manifest according to the Manifest spec. 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overwriteMain	TokenNameIdentifier	 overwrite Main
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
overwriteMain	TokenNameIdentifier	 overwrite Main
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge the contents of the given manifest into this manifest * * @param other the Manifest to be merged with this one. * @param overwriteMain whether to overwrite the main section * of the current manifest * @param mergeClassPaths whether Class-Path attributes should be * merged. * * @throws ManifestException if there is a problem merging the * manifest according to the Manifest spec. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Merge the contents of the given manifest into this manifest * @param other the Manifest to be merged with this one. @param overwriteMain whether to overwrite the main section of the current manifest @param mergeClassPaths whether Class-Path attributes should be merged. * @throws ManifestException if there is a problem merging the manifest according to the Manifest spec. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
overwriteMain	TokenNameIdentifier	 overwrite Main
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
ManifestException	TokenNameIdentifier	 Manifest Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
overwriteMain	TokenNameIdentifier	 overwrite Main
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mainSection	TokenNameIdentifier	 main Section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
mainSection	TokenNameIdentifier	 main Section
,	TokenNameCOMMA	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
manifestVersion	TokenNameIdentifier	 manifest Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
manifestVersion	TokenNameIdentifier	 manifest Version
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
manifestVersion	TokenNameIdentifier	 manifest Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSectionNames	TokenNameIdentifier	 get Section Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sectionName	TokenNameIdentifier	 section Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Section	TokenNameIdentifier	 Section
ourSection	TokenNameIdentifier	 our Section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sectionName	TokenNameIdentifier	 section Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Section	TokenNameIdentifier	 Section
otherSection	TokenNameIdentifier	 other Section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sectionName	TokenNameIdentifier	 section Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ourSection	TokenNameIdentifier	 our Section
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherSection	TokenNameIdentifier	 other Section
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConfiguredSection	TokenNameIdentifier	 add Configured Section
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
otherSection	TokenNameIdentifier	 other Section
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ourSection	TokenNameIdentifier	 our Section
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
otherSection	TokenNameIdentifier	 other Section
,	TokenNameCOMMA	
mergeClassPaths	TokenNameIdentifier	 merge Class Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Write the manifest out to a print writer without flattening * multi-values attributes (i.e. Class-Path). * * @param writer the Writer to which the manifest is written * * @throws IOException if the manifest cannot be written */	TokenNameCOMMENT_JAVADOC	 Write the manifest out to a print writer without flattening multi-values attributes (i.e. Class-Path). * @param writer the Writer to which the manifest is written * @throws IOException if the manifest cannot be written 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the manifest out to a print writer. * * @param writer the Writer to which the manifest is written * @param flatten whether to collapse multi-valued attributes * (i.e. potentially Class-Path) Class-Path into a single * attribute. * * @throws IOException if the manifest cannot be written * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Write the manifest out to a print writer. * @param writer the Writer to which the manifest is written @param flatten whether to collapse multi-valued attributes (i.e. potentially Class-Path) Class-Path into a single attribute. * @throws IOException if the manifest cannot be written @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ATTRIBUTE_MANIFEST_VERSION	TokenNameIdentifier	 ATTRIBUTE  MANIFEST  VERSION
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
manifestVersion	TokenNameIdentifier	 manifest Version
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
signatureVersion	TokenNameIdentifier	 signature Version
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getAttributeValue	TokenNameIdentifier	 get Attribute Value
(	TokenNameLPAREN	
ATTRIBUTE_SIGNATURE_VERSION	TokenNameIdentifier	 ATTRIBUTE  SIGNATURE  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
signatureVersion	TokenNameIdentifier	 signature Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ATTRIBUTE_SIGNATURE_VERSION	TokenNameIdentifier	 ATTRIBUTE  SIGNATURE  VERSION
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
signatureVersion	TokenNameIdentifier	 signature Version
+	TokenNamePLUS	
EOL	TokenNameIdentifier	 EOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
ATTRIBUTE_SIGNATURE_VERSION	TokenNameIdentifier	 ATTRIBUTE  SIGNATURE  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add it back 	TokenNameCOMMENT_LINE	add it back 
if	TokenNameif	
(	TokenNameLPAREN	
signatureVersion	TokenNameIdentifier	 signature Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
svAttr	TokenNameIdentifier	 sv Attr
=	TokenNameEQUAL	
new	TokenNamenew	
Attribute	TokenNameIdentifier	 Attribute
(	TokenNameLPAREN	
ATTRIBUTE_SIGNATURE_VERSION	TokenNameIdentifier	 ATTRIBUTE  SIGNATURE  VERSION
,	TokenNameCOMMA	
signatureVersion	TokenNameIdentifier	 signature Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
addConfiguredAttribute	TokenNameIdentifier	 add Configured Attribute
(	TokenNameLPAREN	
svAttr	TokenNameIdentifier	 sv Attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ManifestException	TokenNameIdentifier	 Manifest Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shouldn't happen - ignore 	TokenNameCOMMENT_LINE	shouldn't happen - ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sectionName	TokenNameIdentifier	 section Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
getSection	TokenNameIdentifier	 get Section
(	TokenNameLPAREN	
sectionName	TokenNameIdentifier	 section Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
flatten	TokenNameIdentifier	 flatten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convert the manifest to its string representation * * @return a multiline string with the Manifest as it * appears in a Manifest file. */	TokenNameCOMMENT_JAVADOC	 Convert the manifest to its string representation * @return a multiline string with the Manifest as it appears in a Manifest file. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the warnings for this manifest. * * @return an enumeration of warning strings */	TokenNameCOMMENT_JAVADOC	 Get the warnings for this manifest. * @return an enumeration of warning strings 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
warnings	TokenNameIdentifier	 warnings
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
warnEnum	TokenNameIdentifier	 warn Enum
=	TokenNameEQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
warnEnum	TokenNameIdentifier	 warn Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
warnEnum	TokenNameIdentifier	 warn Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create a vector and add in the warnings for all the sections 	TokenNameCOMMENT_LINE	create a vector and add in the warnings for all the sections 
Iterator	TokenNameIdentifier	 Iterator
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Section	TokenNameIdentifier	 Section
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
section	TokenNameIdentifier	 section
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
warnings	TokenNameIdentifier	 warnings
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#hashCode * @return a hashcode based on the version, main and sections. */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#hashCode @return a hashcode based on the version, main and sections. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
manifestVersion	TokenNameIdentifier	 manifest Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashCode	TokenNameIdentifier	 hash Code
+=	TokenNamePLUS_EQUAL	
manifestVersion	TokenNameIdentifier	 manifest Version
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hashCode	TokenNameIdentifier	 hash Code
+=	TokenNamePLUS_EQUAL	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashCode	TokenNameIdentifier	 hash Code
+=	TokenNamePLUS_EQUAL	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.lang.Object#equals * @param rhs the object to check for equality. * @return true if the version, main and sections are the same. */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#equals @param rhs the object to check for equality. @return true if the version, main and sections are the same. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Manifest	TokenNameIdentifier	 Manifest
rhsManifest	TokenNameIdentifier	 rhs Manifest
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Manifest	TokenNameIdentifier	 Manifest
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
manifestVersion	TokenNameIdentifier	 manifest Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rhsManifest	TokenNameIdentifier	 rhs Manifest
.	TokenNameDOT	
manifestVersion	TokenNameIdentifier	 manifest Version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
manifestVersion	TokenNameIdentifier	 manifest Version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsManifest	TokenNameIdentifier	 rhs Manifest
.	TokenNameDOT	
manifestVersion	TokenNameIdentifier	 manifest Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mainSection	TokenNameIdentifier	 main Section
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsManifest	TokenNameIdentifier	 rhs Manifest
.	TokenNameDOT	
mainSection	TokenNameIdentifier	 main Section
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhsManifest	TokenNameIdentifier	 rhs Manifest
.	TokenNameDOT	
sections	TokenNameIdentifier	 sections
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the version of the manifest * * @return the manifest's version string */	TokenNameCOMMENT_JAVADOC	 Get the version of the manifest * @return the manifest's version string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getManifestVersion	TokenNameIdentifier	 get Manifest Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
manifestVersion	TokenNameIdentifier	 manifest Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the main section of the manifest * * @return the main section of the manifest */	TokenNameCOMMENT_JAVADOC	 Get the main section of the manifest * @return the main section of the manifest 
public	TokenNamepublic	
Section	TokenNameIdentifier	 Section
getMainSection	TokenNameIdentifier	 get Main Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mainSection	TokenNameIdentifier	 main Section
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a particular section from the manifest * * @param name the name of the section desired. * @return the specified section or null if that section * does not exist in the manifest */	TokenNameCOMMENT_JAVADOC	 Get a particular section from the manifest * @param name the name of the section desired. @return the specified section or null if that section does not exist in the manifest 
public	TokenNamepublic	
Section	TokenNameIdentifier	 Section
getSection	TokenNameIdentifier	 get Section
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Section	TokenNameIdentifier	 Section
)	TokenNameRPAREN	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the section names in this manifest. * * @return an Enumeration of section names */	TokenNameCOMMENT_JAVADOC	 Get the section names in this manifest. * @return an Enumeration of section names 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getSectionNames	TokenNameIdentifier	 get Section Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
asEnumeration	TokenNameIdentifier	 as Enumeration
(	TokenNameLPAREN	
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
