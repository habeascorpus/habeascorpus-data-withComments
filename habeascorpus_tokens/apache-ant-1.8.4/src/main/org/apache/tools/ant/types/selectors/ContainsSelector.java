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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
File	TokenNameIdentifier	 File
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
ResourceSelector	TokenNameIdentifier	 Resource Selector
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
/** * Selector that filters files/resources based on whether they contain a * particular string. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files/resources based on whether they contain a particular string. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
ContainsSelector	TokenNameIdentifier	 Contains Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
casesensitive	TokenNameIdentifier	 casesensitive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXPRESSION_KEY	TokenNameIdentifier	 EXPRESSION  KEY
=	TokenNameEQUAL	
"expression"	TokenNameStringLiteral	expression
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONTAINS_KEY	TokenNameIdentifier	 CONTAINS  KEY
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CASE_KEY	TokenNameIdentifier	 CASE  KEY
=	TokenNameEQUAL	
"casesensitive"	TokenNameStringLiteral	casesensitive
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WHITESPACE_KEY	TokenNameIdentifier	 WHITESPACE  KEY
=	TokenNameEQUAL	
"ignorewhitespace"	TokenNameStringLiteral	ignorewhitespace
;	TokenNameSEMICOLON	
/** * Creates a new <code>ContainsSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>ContainsSelector</code> instance. 
public	TokenNamepublic	
ContainsSelector	TokenNameIdentifier	 Contains Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{containsselector text: "	TokenNameStringLiteral	{containsselector text: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" casesensitive: "	TokenNameStringLiteral	 casesensitive: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
casesensitive	TokenNameIdentifier	 casesensitive
?	TokenNameQUESTION	
"true"	TokenNameStringLiteral	true
:	TokenNameCOLON	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ignorewhitespace: "	TokenNameStringLiteral	 ignorewhitespace: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
?	TokenNameQUESTION	
"true"	TokenNameStringLiteral	true
:	TokenNameCOLON	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The string to search for within a file. * * @param contains the string that a file must contain to be selected. */	TokenNameCOMMENT_JAVADOC	 The string to search for within a file. * @param contains the string that a file must contain to be selected. 
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
=	TokenNameEQUAL	
contains	TokenNameIdentifier	 contains
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to ignore case in the string being searched. * * @param casesensitive whether to pay attention to case sensitivity */	TokenNameCOMMENT_JAVADOC	 Whether to ignore case in the string being searched. * @param casesensitive whether to pay attention to case sensitivity 
public	TokenNamepublic	
void	TokenNamevoid	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
casesensitive	TokenNameIdentifier	 casesensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
casesensitive	TokenNameIdentifier	 casesensitive
=	TokenNameEQUAL	
casesensitive	TokenNameIdentifier	 casesensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to ignore whitespace in the string being searched. * * @param ignorewhitespace whether to ignore any whitespace * (spaces, tabs, etc.) in the searchstring */	TokenNameCOMMENT_JAVADOC	 Whether to ignore whitespace in the string being searched. * @param ignorewhitespace whether to ignore any whitespace (spaces, tabs, etc.) in the searchstring 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnorewhitespace	TokenNameIdentifier	 set Ignorewhitespace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
=	TokenNameEQUAL	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When using this as a custom selector, this method will be called. * It translates each parameter into the appropriate setXXX() call. * * @param parameters the complete set of parameters for this selector */	TokenNameCOMMENT_JAVADOC	 When using this as a custom selector, this method will be called. It translates each parameter into the appropriate setXXX() call. * @param parameters the complete set of parameters for this selector 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramname	TokenNameIdentifier	 paramname
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
CONTAINS_KEY	TokenNameIdentifier	 CONTAINS  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
CASE_KEY	TokenNameIdentifier	 CASE  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
WHITESPACE_KEY	TokenNameIdentifier	 WHITESPACE  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIgnorewhitespace	TokenNameIdentifier	 set Ignorewhitespace
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid parameter "	TokenNameStringLiteral	Invalid parameter 
+	TokenNamePLUS	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks to make sure all settings are kosher. In this case, it * means that the pattern attribute has been set. * */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the pattern attribute has been set. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The text attribute is required"	TokenNameStringLiteral	The text attribute is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object the selector can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a Resource. * * @param r the Resource to check. * @return whether the Resource is selected. */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a Resource. * @param r the Resource to check. @return whether the Resource is selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw BuildException on error 	TokenNameCOMMENT_LINE	throw BuildException on error 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
contains	TokenNameIdentifier	 contains
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
userstr	TokenNameIdentifier	 userstr
=	TokenNameEQUAL	
contains	TokenNameIdentifier	 contains
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
casesensitive	TokenNameIdentifier	 casesensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userstr	TokenNameIdentifier	 userstr
=	TokenNameEQUAL	
contains	TokenNameIdentifier	 contains
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userstr	TokenNameIdentifier	 userstr
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
removeWhitespace	TokenNameIdentifier	 remove Whitespace
(	TokenNameLPAREN	
userstr	TokenNameIdentifier	 userstr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"Could not get InputStream from "	TokenNameStringLiteral	Could not get InputStream from 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toLongString	TokenNameIdentifier	 to Long String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
teststr	TokenNameIdentifier	 teststr
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
teststr	TokenNameIdentifier	 teststr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
casesensitive	TokenNameIdentifier	 casesensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
teststr	TokenNameIdentifier	 teststr
=	TokenNameEQUAL	
teststr	TokenNameIdentifier	 teststr
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignorewhitespace	TokenNameIdentifier	 ignorewhitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
teststr	TokenNameIdentifier	 teststr
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
removeWhitespace	TokenNameIdentifier	 remove Whitespace
(	TokenNameLPAREN	
teststr	TokenNameIdentifier	 teststr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
teststr	TokenNameIdentifier	 teststr
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
userstr	TokenNameIdentifier	 userstr
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
teststr	TokenNameIdentifier	 teststr
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not read "	TokenNameStringLiteral	Could not read 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toLongString	TokenNameIdentifier	 to Long String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
