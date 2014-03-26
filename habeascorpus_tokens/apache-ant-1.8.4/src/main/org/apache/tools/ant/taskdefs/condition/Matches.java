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
/** * Simple regular expression condition. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Simple regular expression condition. * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Matches	TokenNameIdentifier	 Matches
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
multiLine	TokenNameIdentifier	 multi Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
singleLine	TokenNameIdentifier	 single Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RegularExpression	TokenNameIdentifier	 Regular Expression
regularExpression	TokenNameIdentifier	 regular Expression
;	TokenNameSEMICOLON	
/** * Set the string * * @param string the string to match */	TokenNameCOMMENT_JAVADOC	 Set the string * @param string the string to match 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the regular expression to match against * * @param pattern the regular expression pattern */	TokenNameCOMMENT_JAVADOC	 Set the regular expression to match against * @param pattern the regular expression pattern 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
regularExpression	TokenNameIdentifier	 regular Expression
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one regular expression is allowed."	TokenNameStringLiteral	Only one regular expression is allowed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
regularExpression	TokenNameIdentifier	 regular Expression
=	TokenNameEQUAL	
new	TokenNamenew	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
regularExpression	TokenNameIdentifier	 regular Expression
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A regular expression. * You can use this element to refer to a previously * defined regular expression datatype instance * @param regularExpression the regular expression object * to be configured as an element */	TokenNameCOMMENT_JAVADOC	 A regular expression. You can use this element to refer to a previously defined regular expression datatype instance @param regularExpression the regular expression object to be configured as an element 
public	TokenNamepublic	
void	TokenNamevoid	
addRegexp	TokenNameIdentifier	 add Regexp
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
regularExpression	TokenNameIdentifier	 regular Expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regularExpression	TokenNameIdentifier	 regular Expression
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one regular expression is allowed."	TokenNameStringLiteral	Only one regular expression is allowed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regularExpression	TokenNameIdentifier	 regular Expression
=	TokenNameEQUAL	
regularExpression	TokenNameIdentifier	 regular Expression
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to ignore case or not. * @param b if false, ignore case. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Whether to ignore case or not. @param b if false, ignore case. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to match should be multiline. * @param b the value to set. */	TokenNameCOMMENT_JAVADOC	 Whether to match should be multiline. @param b the value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setMultiline	TokenNameIdentifier	 set Multiline
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiLine	TokenNameIdentifier	 multi Line
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to treat input as singleline ('.' matches newline). * Corresponsds to java.util.regex.Pattern.DOTALL. * @param b the value to set. */	TokenNameCOMMENT_JAVADOC	 Whether to treat input as singleline ('.' matches newline). Corresponsds to java.util.regex.Pattern.DOTALL. @param b the value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setSingleLine	TokenNameIdentifier	 set Single Line
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
singleLine	TokenNameIdentifier	 single Line
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the string matches the regular expression pattern * @exception BuildException if the attributes are not set correctly */	TokenNameCOMMENT_JAVADOC	 @return true if the string matches the regular expression pattern @exception BuildException if the attributes are not set correctly 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Parameter string is required in matches."	TokenNameStringLiteral	Parameter string is required in matches.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
regularExpression	TokenNameIdentifier	 regular Expression
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing pattern in matches."	TokenNameStringLiteral	Missing pattern in matches.
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
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
multiLine	TokenNameIdentifier	 multi Line
,	TokenNameCOMMA	
singleLine	TokenNameIdentifier	 single Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Regexp	TokenNameIdentifier	 Regexp
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
regularExpression	TokenNameIdentifier	 regular Expression
.	TokenNameDOT	
getRegexp	TokenNameIdentifier	 get Regexp
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
