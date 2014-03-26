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
RegexpFactory	TokenNameIdentifier	 Regexp Factory
;	TokenNameSEMICOLON	
/** * A regular expression datatype. Keeps an instance of the * compiled expression for speed purposes. This compiled * expression is lazily evaluated (it is compiled the first * time it is needed). The syntax is the dependent on which * regular expression type you are using. The system property * "ant.regexp.regexpimpl" will be the classname of the implementation * that will be used. * * <pre> * Available implementations: * * org.apache.tools.ant.util.regexp.Jdk14RegexpRegexp (default) * Based on the JDK's built-in regular expression package * * org.apache.tools.ant.util.regexp.JakartaOroRegexp * Based on the jakarta-oro package * * org.apache.tools.ant.util.regexp.JakartaRegexpRegexp * Based on the jakarta-regexp package * </pre> * * <pre> * &lt;regexp [ [id="id"] pattern="expression" | refid="id" ] * /&gt; * </pre> * * @see org.apache.oro.text.regex.Perl5Compiler * @see org.apache.regexp.RE * @see java.util.regex.Pattern * * @see org.apache.tools.ant.util.regexp.Regexp * * @ant.datatype name="regexp" */	TokenNameCOMMENT_JAVADOC	 A regular expression datatype. Keeps an instance of the compiled expression for speed purposes. This compiled expression is lazily evaluated (it is compiled the first time it is needed). The syntax is the dependent on which regular expression type you are using. The system property "ant.regexp.regexpimpl" will be the classname of the implementation that will be used. * <pre> Available implementations: * org.apache.tools.ant.util.regexp.Jdk14RegexpRegexp (default) Based on the JDK's built-in regular expression package * org.apache.tools.ant.util.regexp.JakartaOroRegexp Based on the jakarta-oro package * org.apache.tools.ant.util.regexp.JakartaRegexpRegexp Based on the jakarta-regexp package </pre> * <pre> &lt;regexp [ [id="id"] pattern="expression" | refid="id" ] /&gt; </pre> * @see org.apache.oro.text.regex.Perl5Compiler @see org.apache.regexp.RE @see java.util.regex.Pattern * @see org.apache.tools.ant.util.regexp.Regexp * @ant.datatype name="regexp" 
public	TokenNamepublic	
class	TokenNameclass	
RegularExpression	TokenNameIdentifier	 Regular Expression
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
/** Name of this data type */	TokenNameCOMMENT_JAVADOC	 Name of this data type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_TYPE_NAME	TokenNameIdentifier	 DATA  TYPE  NAME
=	TokenNameEQUAL	
"regexp"	TokenNameStringLiteral	regexp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
alreadyInit	TokenNameIdentifier	 already Init
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// The regular expression factory 	TokenNameCOMMENT_LINE	The regular expression factory 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
RegexpFactory	TokenNameIdentifier	 Regexp Factory
FACTORY	TokenNameIdentifier	 FACTORY
=	TokenNameEQUAL	
new	TokenNamenew	
RegexpFactory	TokenNameIdentifier	 Regexp Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Regexp	TokenNameIdentifier	 Regexp
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// temporary variable 	TokenNameCOMMENT_LINE	temporary variable 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
myPattern	TokenNameIdentifier	 my Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
setPatternPending	TokenNameIdentifier	 set Pattern Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * default constructor */	TokenNameCOMMENT_JAVADOC	 default constructor 
public	TokenNamepublic	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
alreadyInit	TokenNameIdentifier	 already Init
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
FACTORY	TokenNameIdentifier	 FACTORY
.	TokenNameDOT	
newRegexp	TokenNameIdentifier	 new Regexp
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
alreadyInit	TokenNameIdentifier	 already Init
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setPatternPending	TokenNameIdentifier	 set Pattern Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
myPattern	TokenNameIdentifier	 my Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPatternPending	TokenNameIdentifier	 set Pattern Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * sets the regular expression pattern * @param pattern regular expression pattern */	TokenNameCOMMENT_JAVADOC	 sets the regular expression pattern @param pattern regular expression pattern 
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
regexp	TokenNameIdentifier	 regexp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
myPattern	TokenNameIdentifier	 my Pattern
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
setPatternPending	TokenNameIdentifier	 set Pattern Pending
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*** * Gets the pattern string for this RegularExpression in the * given project. * @param p project * @return pattern */	TokenNameCOMMENT_JAVADOC	* Gets the pattern string for this RegularExpression in the given project. @param p project @return pattern 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * provides a reference to the Regexp contained in this * @param p project * @return Regexp instance associated with this RegularExpression instance */	TokenNameCOMMENT_JAVADOC	 provides a reference to the Regexp contained in this @param p project @return Regexp instance associated with this RegularExpression instance 
public	TokenNamepublic	
Regexp	TokenNameIdentifier	 Regexp
getRegexp	TokenNameIdentifier	 get Regexp
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getRegexp	TokenNameIdentifier	 get Regexp
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * Get the RegularExpression this reference refers to in * the given project. Check for circular references too * @param p project * @return resolved RegularExpression instance */	TokenNameCOMMENT_JAVADOC	* Get the RegularExpression this reference refers to in the given project. Check for circular references too @param p project @return resolved RegularExpression instance 
public	TokenNamepublic	
RegularExpression	TokenNameIdentifier	 Regular Expression
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
