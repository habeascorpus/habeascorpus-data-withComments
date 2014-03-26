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
File	TokenNameIdentifier	 File
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
RegularExpression	TokenNameIdentifier	 Regular Expression
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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
Regexp	TokenNameIdentifier	 Regexp
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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RegexpUtil	TokenNameIdentifier	 Regexp Util
;	TokenNameSEMICOLON	
/** * Selector that filters files based on the filename. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that filters files based on the filename. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
FilenameSelector	TokenNameIdentifier	 Filename Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
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
negated	TokenNameIdentifier	 negated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME_KEY	TokenNameIdentifier	 NAME  KEY
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
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
NEGATE_KEY	TokenNameIdentifier	 NEGATE  KEY
=	TokenNameEQUAL	
"negate"	TokenNameStringLiteral	negate
;	TokenNameSEMICOLON	
/** Used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REGEX_KEY	TokenNameIdentifier	 REGEX  KEY
=	TokenNameEQUAL	
"regex"	TokenNameStringLiteral	regex
;	TokenNameSEMICOLON	
// caches for performance reasons 	TokenNameCOMMENT_LINE	caches for performance reasons 
private	TokenNameprivate	
RegularExpression	TokenNameIdentifier	 Regular Expression
reg	TokenNameIdentifier	 reg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Regexp	TokenNameIdentifier	 Regexp
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
/** * Creates a new <code>FilenameSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>FilenameSelector</code> instance. 
public	TokenNamepublic	
FilenameSelector	TokenNameIdentifier	 Filename Selector
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
"{filenameselector name: "	TokenNameStringLiteral	{filenameselector name: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" [as regular expression]"	TokenNameStringLiteral	 [as regular expression]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" negate: "	TokenNameStringLiteral	 negate: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
negated	TokenNameIdentifier	 negated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" casesensitive: "	TokenNameStringLiteral	 casesensitive: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
casesensitive	TokenNameIdentifier	 casesensitive
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
/** * The name of the file, or the pattern for the name, that * should be used for selection. * * @param pattern the file pattern that any filename must match * against in order to be selected. */	TokenNameCOMMENT_JAVADOC	 The name of the file, or the pattern for the name, that should be used for selection. * @param pattern the file pattern that any filename must match against in order to be selected. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
+=	TokenNamePLUS_EQUAL	
"**"	TokenNameStringLiteral	**
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The regular expression the file name will be matched against. * * @param pattern the regular expression that any filename must match * against in order to be selected. */	TokenNameCOMMENT_JAVADOC	 The regular expression the file name will be matched against. * @param pattern the regular expression that any filename must match against in order to be selected. 
public	TokenNamepublic	
void	TokenNamevoid	
setRegex	TokenNameIdentifier	 set Regex
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to ignore case when checking filenames. * * @param casesensitive whether to pay attention to case sensitivity */	TokenNameCOMMENT_JAVADOC	 Whether to ignore case when checking filenames. * @param casesensitive whether to pay attention to case sensitivity 
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
/** * You can optionally reverse the selection of this selector, * thereby emulating an &lt;exclude&gt; tag, by setting the attribute * negate to true. This is identical to surrounding the selector * with &lt;not&gt;&lt;/not&gt;. * * @param negated whether to negate this selection */	TokenNameCOMMENT_JAVADOC	 You can optionally reverse the selection of this selector, thereby emulating an &lt;exclude&gt; tag, by setting the attribute negate to true. This is identical to surrounding the selector with &lt;not&gt;&lt;/not&gt;. * @param negated whether to negate this selection 
public	TokenNamepublic	
void	TokenNamevoid	
setNegate	TokenNameIdentifier	 set Negate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
negated	TokenNameIdentifier	 negated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
negated	TokenNameIdentifier	 negated
=	TokenNameEQUAL	
negated	TokenNameIdentifier	 negated
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
NAME_KEY	TokenNameIdentifier	 NAME  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
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
NEGATE_KEY	TokenNameIdentifier	 NEGATE  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNegate	TokenNameIdentifier	 set Negate
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
REGEX_KEY	TokenNameIdentifier	 REGEX  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRegex	TokenNameIdentifier	 set Regex
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
/** * Checks to make sure all settings are kosher. In this case, it * means that the name attribute has been set. * */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the name attribute has been set. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
regex	TokenNameIdentifier	 regex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The name or regex attribute is required"	TokenNameStringLiteral	The name or regex attribute is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
regex	TokenNameIdentifier	 regex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Only one of name and regex attribute is allowed"	TokenNameStringLiteral	Only one of name and regex attribute is allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. Most of the work * for this selector is offloaded into SelectorUtils, a static class * that provides the same services for both FilenameSelector and * DirectoryScanner. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object the selector can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. Most of the work for this selector is offloaded into SelectorUtils, a static class that provides the same services for both FilenameSelector and DirectoryScanner. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object the selector can use @return whether the file should be selected or not 
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
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
casesensitive	TokenNameIdentifier	 casesensitive
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
!	TokenNameNOT	
(	TokenNameLPAREN	
negated	TokenNameIdentifier	 negated
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reg	TokenNameIdentifier	 reg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
new	TokenNamenew	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getRegexp	TokenNameIdentifier	 get Regexp
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
casesensitive	TokenNameIdentifier	 casesensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
!	TokenNameNOT	
negated	TokenNameIdentifier	 negated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
