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
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
/*** * Regular expression implementation using the JDK 1.4 regular expression package */	TokenNameCOMMENT_JAVADOC	* Regular expression implementation using the JDK 1.4 regular expression package 
public	TokenNamepublic	
class	TokenNameclass	
Jdk14RegexpRegexp	TokenNameIdentifier	 Jdk14 Regexp Regexp
extends	TokenNameextends	
Jdk14RegexpMatcher	TokenNameIdentifier	 Jdk14 Regexp Matcher
implements	TokenNameimplements	
Regexp	TokenNameIdentifier	 Regexp
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DECIMAL	TokenNameIdentifier	 DECIMAL
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constructor for Jdk14RegexpRegexp */	TokenNameCOMMENT_JAVADOC	 Constructor for Jdk14RegexpRegexp 
public	TokenNamepublic	
Jdk14RegexpRegexp	TokenNameIdentifier	 Jdk14 Regexp Regexp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert ant regexp substitution option to jdk1.4 options. * * @param options the ant regexp options * @return the jdk14 substition options */	TokenNameCOMMENT_JAVADOC	 Convert ant regexp substitution option to jdk1.4 options. * @param options the ant regexp options @return the jdk14 substition options 
protected	TokenNameprotected	
int	TokenNameint	
getSubsOptions	TokenNameIdentifier	 get Subs Options
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
subsOptions	TokenNameIdentifier	 subs Options
=	TokenNameEQUAL	
REPLACE_FIRST	TokenNameIdentifier	 REPLACE  FIRST
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subsOptions	TokenNameIdentifier	 subs Options
=	TokenNameEQUAL	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
subsOptions	TokenNameIdentifier	 subs Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform a substitution on the regular expression. * @param input The string to substitute on * @param argument The string which defines the substitution * @param options The list of options for the match and replace. * @return the result of the operation * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Perform a substitution on the regular expression. @param input The string to substitute on @param argument The string which defines the substitution @param options The list of options for the match and replace. @return the result of the operation @throws BuildException on error 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// translate \1 to $(1) so that the Matcher will work 	TokenNameCOMMENT_LINE	translate \1 to $(1) so that the Matcher will work 
StringBuffer	TokenNameIdentifier	 String Buffer
subst	TokenNameIdentifier	 subst
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
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
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// XXX - should throw an exception instead? 	TokenNameCOMMENT_LINE	XXX - should throw an exception instead? 
subst	TokenNameIdentifier	 subst
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
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
subst	TokenNameIdentifier	 subst
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sOptions	TokenNameIdentifier	 s Options
=	TokenNameEQUAL	
getSubsOptions	TokenNameIdentifier	 get Subs Options
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pattern	TokenNameIdentifier	 Pattern
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getCompiledPattern	TokenNameIdentifier	 get Compiled Pattern
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Matcher	TokenNameIdentifier	 Matcher
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
sOptions	TokenNameIdentifier	 s Options
,	TokenNameCOMMA	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
appendReplacement	TokenNameIdentifier	 append Replacement
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
appendTail	TokenNameIdentifier	 append Tail
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
