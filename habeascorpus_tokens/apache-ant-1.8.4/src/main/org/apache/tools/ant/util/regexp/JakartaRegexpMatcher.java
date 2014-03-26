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
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RE	TokenNameIdentifier	 RE
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RESyntaxException	TokenNameIdentifier	 RE Syntax Exception
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
/** * Implementation of RegexpMatcher for Jakarta-Regexp. * */	TokenNameCOMMENT_JAVADOC	 Implementation of RegexpMatcher for Jakarta-Regexp. 
public	TokenNamepublic	
class	TokenNameclass	
JakartaRegexpMatcher	TokenNameIdentifier	 Jakarta Regexp Matcher
implements	TokenNameimplements	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
/** * Set the regexp pattern from the String description. * @param pattern the pattern to match */	TokenNameCOMMENT_JAVADOC	 Set the regexp pattern from the String description. @param pattern the pattern to match 
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
/** * Get a String representation of the regexp pattern * @return the pattern */	TokenNameCOMMENT_JAVADOC	 Get a String representation of the regexp pattern @return the pattern 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compile the pattern. * * @param options the ant regexp options * @return a compiled pattern * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Compile the pattern. * @param options the ant regexp options @return a compiled pattern @exception BuildException if an error occurs 
protected	TokenNameprotected	
RE	TokenNameIdentifier	 RE
getCompiledPattern	TokenNameIdentifier	 get Compiled Pattern
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
cOptions	TokenNameIdentifier	 c Options
=	TokenNameEQUAL	
getCompilerOptions	TokenNameIdentifier	 get Compiler Options
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
RE	TokenNameIdentifier	 RE
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
new	TokenNamenew	
RE	TokenNameIdentifier	 RE
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setMatchFlags	TokenNameIdentifier	 set Match Flags
(	TokenNameLPAREN	
cOptions	TokenNameIdentifier	 c Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reg	TokenNameIdentifier	 reg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RESyntaxException	TokenNameIdentifier	 RE Syntax Exception
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
/** * Does the given argument match the pattern? * @param argument the string to match against * @return true if the pattern matches * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Does the given argument match the pattern? @param argument the string to match against @return true if the pattern matches @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the given argument match the pattern? * @param input the string to match against * @param options the regex options to use * @return true if the pattern matches * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Does the given argument match the pattern? @param input the string to match against @param options the regex options to use @return true if the pattern matches @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
getCompiledPattern	TokenNameIdentifier	 get Compiled Pattern
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
RE	TokenNameIdentifier	 RE
reg	TokenNameIdentifier	 reg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Vector of matched groups found in the argument * using default options. * * <p>Group 0 will be the full match, the rest are the * parenthesized subexpressions</p>. * * @param argument the string to match against * @return the vector of groups * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Returns a Vector of matched groups found in the argument using default options. * <p>Group 0 will be the full match, the rest are the parenthesized subexpressions</p>. * @param argument the string to match against @return the vector of groups @throws BuildException on error 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Vector of matched groups found in the argument. * * <p>Group 0 will be the full match, the rest are the * parenthesized subexpressions</p>. * * @param input the string to match against * @param options the regex options to use * @return the vector of groups * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Returns a Vector of matched groups found in the argument. * <p>Group 0 will be the full match, the rest are the parenthesized subexpressions</p>. * @param input the string to match against @param options the regex options to use @return the vector of groups @throws BuildException on error 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
RE	TokenNameIdentifier	 RE
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
getCompiledPattern	TokenNameIdentifier	 get Compiled Pattern
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getParenCount	TokenNameIdentifier	 get Paren Count
(	TokenNameLPAREN	
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
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
getParen	TokenNameIdentifier	 get Paren
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// treat non-matching groups as empty matches 	TokenNameCOMMENT_LINE	treat non-matching groups as empty matches 
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the generic options to the regex compiler specific options. * @param options the generic options * @return the specific options */	TokenNameCOMMENT_JAVADOC	 Convert the generic options to the regex compiler specific options. @param options the generic options @return the specific options 
protected	TokenNameprotected	
int	TokenNameint	
getCompilerOptions	TokenNameIdentifier	 get Compiler Options
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cOptions	TokenNameIdentifier	 c Options
=	TokenNameEQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_NORMAL	TokenNameIdentifier	 MATCH  NORMAL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
MATCH_CASE_INSENSITIVE	TokenNameIdentifier	 MATCH  CASE  INSENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cOptions	TokenNameIdentifier	 c Options
|=	TokenNameOR_EQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_CASEINDEPENDENT	TokenNameIdentifier	 MATCH  CASEINDEPENDENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cOptions	TokenNameIdentifier	 c Options
|=	TokenNameOR_EQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cOptions	TokenNameIdentifier	 c Options
|=	TokenNameOR_EQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cOptions	TokenNameIdentifier	 c Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
