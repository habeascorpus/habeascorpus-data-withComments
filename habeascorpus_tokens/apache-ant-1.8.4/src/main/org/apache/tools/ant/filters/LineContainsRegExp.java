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
filters	TokenNameIdentifier	 filters
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
Reader	TokenNameIdentifier	 Reader
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
/** * Filter which includes only those lines that contain the user-specified * regular expression matching strings. * * Example: * <pre>&lt;linecontainsregexp&gt; * &lt;regexp pattern=&quot;foo*&quot;&gt; * &lt;/linecontainsregexp&gt;</pre> * * Or: * * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.LineContainsRegExp&quot;&gt; * &lt;param type=&quot;regexp&quot; value=&quot;foo*&quot;/&gt; * &lt;/filterreader&gt;</pre> * * This will fetch all those lines that contain the pattern <code>foo</code> * */	TokenNameCOMMENT_JAVADOC	 Filter which includes only those lines that contain the user-specified regular expression matching strings. * Example: <pre>&lt;linecontainsregexp&gt; &lt;regexp pattern=&quot;foo*&quot;&gt; &lt;/linecontainsregexp&gt;</pre> * Or: * <pre>&lt;filterreader classname=&quot;org.apache.tools.ant.filters.LineContainsRegExp&quot;&gt; &lt;param type=&quot;regexp&quot; value=&quot;foo*&quot;/&gt; &lt;/filterreader&gt;</pre> * This will fetch all those lines that contain the pattern <code>foo</code> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
extends	TokenNameextends	
BaseParamFilterReader	TokenNameIdentifier	 Base Param Filter Reader
implements	TokenNameimplements	
ChainableReader	TokenNameIdentifier	 Chainable Reader
{	TokenNameLBRACE	
/** Parameter name for the regular expression to filter on. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the regular expression to filter on. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REGEXP_KEY	TokenNameIdentifier	 REGEXP  KEY
=	TokenNameEQUAL	
"regexp"	TokenNameStringLiteral	regexp
;	TokenNameSEMICOLON	
/** Parameter name for the negate attribute. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the negate attribute. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEGATE_KEY	TokenNameIdentifier	 NEGATE  KEY
=	TokenNameEQUAL	
"negate"	TokenNameStringLiteral	negate
;	TokenNameSEMICOLON	
/** Parameter name for the casesensitive attribute. */	TokenNameCOMMENT_JAVADOC	 Parameter name for the casesensitive attribute. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CS_KEY	TokenNameIdentifier	 CS  KEY
=	TokenNameEQUAL	
"casesensitive"	TokenNameStringLiteral	casesensitive
;	TokenNameSEMICOLON	
/** Vector that holds the expressions that input lines must contain. */	TokenNameCOMMENT_JAVADOC	 Vector that holds the expressions that input lines must contain. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
regexps	TokenNameIdentifier	 regexps
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remaining line to be read from this filter, or <code>null</code> if * the next call to <code>read()</code> should read the original stream * to find the next matching line. */	TokenNameCOMMENT_JAVADOC	 Remaining line to be read from this filter, or <code>null</code> if the next call to <code>read()</code> should read the original stream to find the next matching line. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
regexpOptions	TokenNameIdentifier	 regexp Options
=	TokenNameEQUAL	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
;	TokenNameSEMICOLON	
/** * Constructor for "dummy" instances. * * @see BaseFilterReader#BaseFilterReader() */	TokenNameCOMMENT_JAVADOC	 Constructor for "dummy" instances. * @see BaseFilterReader#BaseFilterReader() 
public	TokenNamepublic	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new filtered reader. * * @param in A Reader object providing the underlying stream. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a new filtered reader. * @param in A Reader object providing the underlying stream. Must not be <code>null</code>. 
public	TokenNamepublic	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next character in the filtered stream, only including * lines from the original stream which match all of the specified * regular expressions. * * @return the next character in the resulting stream, or -1 * if the end of the resulting stream has been reached * * @exception IOException if the underlying stream throws an IOException * during reading */	TokenNameCOMMENT_JAVADOC	 Returns the next character in the filtered stream, only including lines from the original stream which match all of the specified regular expressions. * @return the next character in the resulting stream, or -1 if the end of the resulting stream has been reached * @exception IOException if the underlying stream throws an IOException during reading 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getInitialized	TokenNameIdentifier	 get Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setInitialized	TokenNameIdentifier	 set Initialized
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
regexpsSize	TokenNameIdentifier	 regexps Size
=	TokenNameEQUAL	
regexps	TokenNameIdentifier	 regexps
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
matches	TokenNameIdentifier	 matches
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
regexpsSize	TokenNameIdentifier	 regexps Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RegularExpression	TokenNameIdentifier	 Regular Expression
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
)	TokenNameRPAREN	
regexps	TokenNameIdentifier	 regexps
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Regexp	TokenNameIdentifier	 Regexp
re	TokenNameIdentifier	 re
=	TokenNameEQUAL	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
getRegexp	TokenNameIdentifier	 get Regexp
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
re	TokenNameIdentifier	 re
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
regexpOptions	TokenNameIdentifier	 regexp Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
^	TokenNameXOR	
isNegated	TokenNameIdentifier	 is Negated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a <code>regexp</code> element. * * @param regExp The <code>regexp</code> element to add. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a <code>regexp</code> element. * @param regExp The <code>regexp</code> element to add. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredRegexp	TokenNameIdentifier	 add Configured Regexp
(	TokenNameLPAREN	
final	TokenNamefinal	
RegularExpression	TokenNameIdentifier	 Regular Expression
regExp	TokenNameIdentifier	 reg Exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regexps	TokenNameIdentifier	 regexps
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
regExp	TokenNameIdentifier	 reg Exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the vector of regular expressions which must be contained within * a line read from the original stream in order for it to match this * filter. * * @param regexps A vector of regular expressions which must be contained * within a line in order for it to match in this filter. Must not be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the vector of regular expressions which must be contained within a line read from the original stream in order for it to match this filter. * @param regexps A vector of regular expressions which must be contained within a line in order for it to match in this filter. Must not be <code>null</code>. 
private	TokenNameprivate	
void	TokenNamevoid	
setRegexps	TokenNameIdentifier	 set Regexps
(	TokenNameLPAREN	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
regexps	TokenNameIdentifier	 regexps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regexps	TokenNameIdentifier	 regexps
=	TokenNameEQUAL	
regexps	TokenNameIdentifier	 regexps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vector of regular expressions which must be contained within * a line read from the original stream in order for it to match this * filter. * * @return the vector of regular expressions which must be contained within * a line read from the original stream in order for it to match this * filter. The returned object is "live" - in other words, changes made to * the returned object are mirrored in the filter. */	TokenNameCOMMENT_JAVADOC	 Returns the vector of regular expressions which must be contained within a line read from the original stream in order for it to match this filter. * @return the vector of regular expressions which must be contained within a line read from the original stream in order for it to match this filter. The returned object is "live" - in other words, changes made to the returned object are mirrored in the filter. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
getRegexps	TokenNameIdentifier	 get Regexps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
regexps	TokenNameIdentifier	 regexps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new LineContainsRegExp using the passed in * Reader for instantiation. * * @param rdr A Reader object providing the underlying stream. * Must not be <code>null</code>. * * @return a new filter based on this configuration, but filtering * the specified reader */	TokenNameCOMMENT_JAVADOC	 Creates a new LineContainsRegExp using the passed in Reader for instantiation. * @param rdr A Reader object providing the underlying stream. Must not be <code>null</code>. * @return a new filter based on this configuration, but filtering the specified reader 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
chain	TokenNameIdentifier	 chain
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
newFilter	TokenNameIdentifier	 new Filter
=	TokenNameEQUAL	
new	TokenNamenew	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
(	TokenNameLPAREN	
rdr	TokenNameIdentifier	 rdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setRegexps	TokenNameIdentifier	 set Regexps
(	TokenNameLPAREN	
getRegexps	TokenNameIdentifier	 get Regexps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setNegate	TokenNameIdentifier	 set Negate
(	TokenNameLPAREN	
isNegated	TokenNameIdentifier	 is Negated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFilter	TokenNameIdentifier	 new Filter
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
!	TokenNameNOT	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
regexpOptions	TokenNameIdentifier	 regexp Options
,	TokenNameCOMMA	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
MATCH_CASE_INSENSITIVE	TokenNameIdentifier	 MATCH  CASE  INSENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFilter	TokenNameIdentifier	 new Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the negation mode. Default false (no negation). * @param b the boolean negation mode to set. */	TokenNameCOMMENT_JAVADOC	 Set the negation mode. Default false (no negation). @param b the boolean negation mode to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setNegate	TokenNameIdentifier	 set Negate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
negate	TokenNameIdentifier	 negate
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether to match casesensitevly. * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Whether to match casesensitevly. @since Ant 1.8.2 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
regexpOptions	TokenNameIdentifier	 regexp Options
=	TokenNameEQUAL	
RegexpUtil	TokenNameIdentifier	 Regexp Util
.	TokenNameDOT	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether we have been negated. * @return boolean negation flag. */	TokenNameCOMMENT_JAVADOC	 Find out whether we have been negated. @return boolean negation flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNegated	TokenNameIdentifier	 is Negated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
negate	TokenNameIdentifier	 negate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses parameters to add user defined regular expressions. */	TokenNameCOMMENT_JAVADOC	 Parses parameters to add user defined regular expressions. 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
REGEXP_KEY	TokenNameIdentifier	 REGEXP  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RegularExpression	TokenNameIdentifier	 Regular Expression
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
new	TokenNamenew	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
regexps	TokenNameIdentifier	 regexps
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
regexp	TokenNameIdentifier	 regexp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NEGATE_KEY	TokenNameIdentifier	 NEGATE  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNegate	TokenNameIdentifier	 set Negate
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
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
CS_KEY	TokenNameIdentifier	 CS  KEY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
