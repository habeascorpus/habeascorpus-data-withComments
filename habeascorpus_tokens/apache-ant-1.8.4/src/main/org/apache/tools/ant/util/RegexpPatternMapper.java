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
util	TokenNameIdentifier	 util
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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
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
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
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
/** * Implementation of FileNameMapper that does regular expression * replacements. * */	TokenNameCOMMENT_JAVADOC	 Implementation of FileNameMapper that does regular expression replacements. 
public	TokenNamepublic	
class	TokenNameclass	
RegexpPatternMapper	TokenNameIdentifier	 Regexp Pattern Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DECIMAL	TokenNameIdentifier	 DECIMAL
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Constructor for RegexpPatternMapper. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Constructor for RegexpPatternMapper. @throws BuildException on error. 
public	TokenNamepublic	
RegexpPatternMapper	TokenNameIdentifier	 Regexp Pattern Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newRegexpMatcher	TokenNameIdentifier	 new Regexp Matcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
regexpOptions	TokenNameIdentifier	 regexp Options
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Attribute specifing whether to ignore the difference * between / and \ (the two common directory characters). * @param handleDirSep a boolean, default is false. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Attribute specifing whether to ignore the difference between / and \ (the two common directory characters). @param handleDirSep a boolean, default is false. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setHandleDirSep	TokenNameIdentifier	 set Handle Dir Sep
(	TokenNameLPAREN	
boolean	TokenNameboolean	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
=	TokenNameEQUAL	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attribute specifing whether to ignore the case difference * in the names. * * @param caseSensitive a boolean, default is false. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Attribute specifing whether to ignore the case difference in the names. * @param caseSensitive a boolean, default is false. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
regexpOptions	TokenNameIdentifier	 regexp Options
=	TokenNameEQUAL	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the &quot;from&quot; pattern. Required. * @param from the from pattern. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Sets the &quot;from&quot; pattern. Required. @param from the from pattern. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// depending on the implementation the actual RE won't 	TokenNameCOMMENT_LINE	depending on the implementation the actual RE won't 
// get instantiated in the constructor. 	TokenNameCOMMENT_LINE	get instantiated in the constructor. 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot load regular expression matcher"	TokenNameStringLiteral	Cannot load regular expression matcher
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"this mapper requires a 'from' attribute"	TokenNameStringLiteral	this mapper requires a 'from' attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the &quot;to&quot; pattern. Required. * @param to the to pattern. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Sets the &quot;to&quot; pattern. Required. @param to the to pattern. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"this mapper requires a 'to' attribute"	TokenNameStringLiteral	this mapper requires a 'to' attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns null if the source file name doesn't match the * &quot;from&quot; pattern, an one-element array containing the * translated file otherwise. * @param sourceFileName the source file name * @return a one-element array containing the translated file or * null if the to pattern did not match */	TokenNameCOMMENT_JAVADOC	 Returns null if the source file name doesn't match the &quot;from&quot; pattern, an one-element array containing the translated file otherwise. @param sourceFileName the source file name @return a one-element array containing the translated file or null if the to pattern did not match 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sourceFileName	TokenNameIdentifier	 source File Name
=	TokenNameEQUAL	
sourceFileName	TokenNameIdentifier	 source File Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reg	TokenNameIdentifier	 reg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
to	TokenNameIdentifier	 to
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
,	TokenNameCOMMA	
regexpOptions	TokenNameIdentifier	 regexp Options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
replaceReferences	TokenNameIdentifier	 replace References
(	TokenNameLPAREN	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace all backreferences in the to pattern with the matched * groups of the source. * @param source the source file name. * @return the translated file name. */	TokenNameCOMMENT_JAVADOC	 Replace all backreferences in the to pattern with the matched groups of the source. @param source the source file name. @return the translated file name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
replaceReferences	TokenNameIdentifier	 replace References
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
regexpOptions	TokenNameIdentifier	 regexp Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
DECIMAL	TokenNameIdentifier	 DECIMAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// XXX - should throw an exception instead? 	TokenNameCOMMENT_LINE	XXX - should throw an exception instead? 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
