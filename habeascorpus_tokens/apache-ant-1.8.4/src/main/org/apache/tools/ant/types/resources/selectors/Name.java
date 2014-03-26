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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
SelectorUtils	TokenNameIdentifier	 Selector Utils
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
/** * Name ResourceSelector. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Name ResourceSelector. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Name	TokenNameIdentifier	 Name
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
=	TokenNameEQUAL	
false	TokenNamefalse	
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
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the pattern to compare names against. * @param n the pattern String to set. */	TokenNameCOMMENT_JAVADOC	 Set the pattern to compare names against. @param n the pattern String to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the pattern used by this Name ResourceSelector. * @return the String selection pattern. */	TokenNameCOMMENT_JAVADOC	 Get the pattern used by this Name ResourceSelector. @return the String selection pattern. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the regular expression to compare names against. * @param r the regex to set. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the regular expression to compare names against. @param r the regex to set. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setRegex	TokenNameIdentifier	 set Regex
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the regular expression used by this Name ResourceSelector. * @return the String selection pattern. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get the regular expression used by this Name ResourceSelector. @return the String selection pattern. @since Ant 1.8.0 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRegex	TokenNameIdentifier	 get Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether the name comparisons are case-sensitive. * @param b boolean case-sensitivity flag. */	TokenNameCOMMENT_JAVADOC	 Set whether the name comparisons are case-sensitive. @param b boolean case-sensitivity flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether this Name ResourceSelector is case-sensitive. * @return boolean case-sensitivity flag. */	TokenNameCOMMENT_JAVADOC	 Learn whether this Name ResourceSelector is case-sensitive. @return boolean case-sensitivity flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cs	TokenNameIdentifier	 cs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attribute specifing whether to ignore the difference * between / and \ (the two common directory characters). * @param handleDirSep a boolean, default is false. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Attribute specifing whether to ignore the difference between / and \ (the two common directory characters). @param handleDirSep a boolean, default is false. @since Ant 1.8.0 
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
/** * Whether the difference between / and \ (the two common * directory characters) is ignored. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether the difference between / and \ (the two common directory characters) is ignored. * @since Ant 1.8.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
doesHandledirSep	TokenNameIdentifier	 does Handledir Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if this Resource is selected. * @param r the Resource to check. * @return whether the Resource was selected. */	TokenNameCOMMENT_JAVADOC	 Return true if this Resource is selected. @param r the Resource to check. @return whether the Resource was selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
modify	TokenNameIdentifier	 modify
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
,	TokenNameCOMMA	
modify	TokenNameIdentifier	 modify
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
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
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
modify	TokenNameIdentifier	 modify
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
modify	TokenNameIdentifier	 modify
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
handleDirSep	TokenNameIdentifier	 handle Dir Sep
||	TokenNameOR_OR	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
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
