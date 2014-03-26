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
FileReader	TokenNameIdentifier	 File Reader
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
/** * Named collection of include/exclude tags. * * <p>Moved out of MatchingTask to make it a standalone object that * could be referenced (by scripts for example). * */	TokenNameCOMMENT_JAVADOC	 Named collection of include/exclude tags. * <p>Moved out of MatchingTask to make it a standalone object that could be referenced (by scripts for example). 
public	TokenNamepublic	
class	TokenNameclass	
PatternSet	TokenNameIdentifier	 Pattern Set
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
includeList	TokenNameIdentifier	 include List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
excludeList	TokenNameIdentifier	 exclude List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
includesFileList	TokenNameIdentifier	 includes File List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
excludesFileList	TokenNameIdentifier	 excludes File List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * inner class to hold a name on list. "If" and "Unless" attributes * may be used to invalidate the entry based on the existence of a * property (typically set thru the use of the Available task) * or value of an expression. */	TokenNameCOMMENT_JAVADOC	 inner class to hold a name on list. "If" and "Unless" attributes may be used to invalidate the entry based on the existence of a property (typically set thru the use of the Available task) or value of an expression. 
public	TokenNamepublic	
class	TokenNameclass	
NameEntry	TokenNameIdentifier	 Name Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
ifCond	TokenNameIdentifier	 if Cond
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
unlessCond	TokenNameIdentifier	 unless Cond
;	TokenNameSEMICOLON	
/** * Sets the name pattern. * * @param name The pattern string. */	TokenNameCOMMENT_JAVADOC	 Sets the name pattern. * @param name The pattern string. 
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
/** * Sets the if attribute. This attribute and the "unless" * attribute are used to validate the name, based on the * existence of the property or the value of the evaluated * property expression. * * @param cond A property name or expression. If the * expression evaluates to false or no property of * its value is present, the name is invalid. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the if attribute. This attribute and the "unless" attribute are used to validate the name, based on the existence of the property or the value of the evaluated property expression. * @param cond A property name or expression. If the expression evaluates to false or no property of its value is present, the name is invalid. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifCond	TokenNameIdentifier	 if Cond
=	TokenNameEQUAL	
cond	TokenNameIdentifier	 cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the if attribute. This attribute and the "unless" * attribute are used to validate the name, based on the * existence of the property or the value of the evaluated * property expression. * * @param cond A property name or expression. If the * expression evaluates to false or no property of * its value is present, the name is invalid. */	TokenNameCOMMENT_JAVADOC	 Sets the if attribute. This attribute and the "unless" attribute are used to validate the name, based on the existence of the property or the value of the evaluated property expression. * @param cond A property name or expression. If the expression evaluates to false or no property of its value is present, the name is invalid. 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the unless attribute. This attribute and the "if" * attribute are used to validate the name, based on the * existence of the property or the value of the evaluated * property expression. * * @param cond A property name or expression. If the * expression evaluates to true or a property of * its value is present, the name is invalid. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the unless attribute. This attribute and the "if" attribute are used to validate the name, based on the existence of the property or the value of the evaluated property expression. * @param cond A property name or expression. If the expression evaluates to true or a property of its value is present, the name is invalid. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlessCond	TokenNameIdentifier	 unless Cond
=	TokenNameEQUAL	
cond	TokenNameIdentifier	 cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the unless attribute. This attribute and the "if" * attribute are used to validate the name, based on the * existence of the property or the value of the evaluated * property expression. * * @param cond A property name or expression. If the * expression evaluates to true or a property of * its value is present, the name is invalid. */	TokenNameCOMMENT_JAVADOC	 Sets the unless attribute. This attribute and the "if" attribute are used to validate the name, based on the existence of the property or the value of the evaluated property expression. * @param cond A property name or expression. If the expression evaluates to true or a property of its value is present, the name is invalid. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
cond	TokenNameIdentifier	 cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the name attribute. */	TokenNameCOMMENT_JAVADOC	 @return the name attribute. 
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
/** * This validates the name - checks the if and unless * properties. * * @param p the current project, used to check the presence or * absence of a property. * @return the name attribute or null if the "if" or "unless" * properties are not/are set. */	TokenNameCOMMENT_JAVADOC	 This validates the name - checks the if and unless properties. * @param p the current project, used to check the presence or absence of a property. @return the name attribute or null if the "if" or "unless" properties are not/are set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
evalName	TokenNameIdentifier	 eval Name
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
?	TokenNameQUESTION	
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a printable form of this object. */	TokenNameCOMMENT_JAVADOC	 @return a printable form of this object. 
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"noname"	TokenNameStringLiteral	noname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ifCond	TokenNameIdentifier	 if Cond
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
connector	TokenNameIdentifier	 connector
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ifCond	TokenNameIdentifier	 if Cond
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"if->"	TokenNameStringLiteral	if->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connector	TokenNameIdentifier	 connector
=	TokenNameEQUAL	
";"	TokenNameStringLiteral	;
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
connector	TokenNameIdentifier	 connector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"unless->"	TokenNameStringLiteral	unless->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
InvertedPatternSet	TokenNameIdentifier	 Inverted Pattern Set
extends	TokenNameextends	
PatternSet	TokenNameIdentifier	 Pattern Set
{	TokenNameLBRACE	
private	TokenNameprivate	
InvertedPatternSet	TokenNameIdentifier	 Inverted Pattern Set
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addConfiguredPatternset	TokenNameIdentifier	 add Configured Patternset
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new <code>PatternSet</code> instance. */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>PatternSet</code> instance. 
public	TokenNamepublic	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes this instance in effect a reference to another PatternSet * instance. * * <p>You must not set another attribute or nest elements inside * this element if you make it a reference.</p> * @param r the reference to another patternset. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Makes this instance in effect a reference to another PatternSet instance. * <p>You must not set another attribute or nest elements inside this element if you make it a reference.</p> @param r the reference to another patternset. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeList	TokenNameIdentifier	 include List
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
excludeList	TokenNameIdentifier	 exclude List
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a patternset nested element. * * @param p a configured patternset nested element. */	TokenNameCOMMENT_JAVADOC	 This is a patternset nested element. * @param p a configured patternset nested element. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredPatternset	TokenNameIdentifier	 add Configured Patternset
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nestedIncludes	TokenNameIdentifier	 nested Includes
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nestedExcludes	TokenNameIdentifier	 nested Excludes
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nestedIncludes	TokenNameIdentifier	 nested Includes
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
nestedIncludes	TokenNameIdentifier	 nested Includes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
nestedIncludes	TokenNameIdentifier	 nested Includes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nestedExcludes	TokenNameIdentifier	 nested Excludes
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
nestedExcludes	TokenNameIdentifier	 nested Excludes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
nestedExcludes	TokenNameIdentifier	 nested Excludes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add a name entry on the include list * @return a nested include element to be configured. */	TokenNameCOMMENT_JAVADOC	 add a name entry on the include list @return a nested include element to be configured. 
public	TokenNamepublic	
NameEntry	TokenNameIdentifier	 Name Entry
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
includeList	TokenNameIdentifier	 include List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a name entry on the include files list * @return a nested includesfile element to be configured. */	TokenNameCOMMENT_JAVADOC	 add a name entry on the include files list @return a nested includesfile element to be configured. 
public	TokenNamepublic	
NameEntry	TokenNameIdentifier	 Name Entry
createIncludesFile	TokenNameIdentifier	 create Includes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
includesFileList	TokenNameIdentifier	 includes File List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a name entry on the exclude list * @return a nested exclude element to be configured. */	TokenNameCOMMENT_JAVADOC	 add a name entry on the exclude list @return a nested exclude element to be configured. 
public	TokenNamepublic	
NameEntry	TokenNameIdentifier	 Name Entry
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
excludeList	TokenNameIdentifier	 exclude List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a name entry on the exclude files list * @return a nested excludesfile element to be configured. */	TokenNameCOMMENT_JAVADOC	 add a name entry on the exclude files list @return a nested excludesfile element to be configured. 
public	TokenNamepublic	
NameEntry	TokenNameIdentifier	 Name Entry
createExcludesFile	TokenNameIdentifier	 create Excludes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
excludesFileList	TokenNameIdentifier	 excludes File List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends <code>includes</code> to the current list of include patterns. * Patterns may be separated by a comma or a space. * * @param includes the string containing the include patterns */	TokenNameCOMMENT_JAVADOC	 Appends <code>includes</code> to the current list of include patterns. Patterns may be separated by a comma or a space. * @param includes the string containing the include patterns 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
includes	TokenNameIdentifier	 includes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Appends <code>excludes</code> to the current list of exclude patterns. * Patterns may be separated by a comma or a space. * * @param excludes the string containing the exclude patterns */	TokenNameCOMMENT_JAVADOC	 Appends <code>excludes</code> to the current list of exclude patterns. Patterns may be separated by a comma or a space. * @param excludes the string containing the exclude patterns 
public	TokenNamepublic	
void	TokenNamevoid	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
excludes	TokenNameIdentifier	 excludes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add a name entry to the given list */	TokenNameCOMMENT_JAVADOC	 add a name entry to the given list 
private	TokenNameprivate	
NameEntry	TokenNameIdentifier	 Name Entry
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameEntry	TokenNameIdentifier	 Name Entry
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
NameEntry	TokenNameIdentifier	 Name Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name of the file containing the includes patterns. * * @param includesFile The file to fetch the include patterns from. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the file containing the includes patterns. * @param includesFile The file to fetch the include patterns from. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludesfile	TokenNameIdentifier	 set Includesfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
includesFile	TokenNameIdentifier	 includes File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
createIncludesFile	TokenNameIdentifier	 create Includes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
includesFile	TokenNameIdentifier	 includes File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name of the file containing the excludes patterns. * * @param excludesFile The file to fetch the exclude patterns from. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the file containing the excludes patterns. * @param excludesFile The file to fetch the exclude patterns from. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
setExcludesfile	TokenNameIdentifier	 set Excludesfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
excludesFile	TokenNameIdentifier	 excludes File
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
createExcludesFile	TokenNameIdentifier	 create Excludes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
excludesFile	TokenNameIdentifier	 excludes File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads path matching patterns from a file and adds them to the * includes or excludes list (as appropriate). */	TokenNameCOMMENT_JAVADOC	 Reads path matching patterns from a file and adds them to the includes or excludes list (as appropriate). 
private	TokenNameprivate	
void	TokenNamevoid	
readPatterns	TokenNameIdentifier	 read Patterns
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
patternfile	TokenNameIdentifier	 patternfile
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
patternlist	TokenNameIdentifier	 patternlist
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
patternReader	TokenNameIdentifier	 pattern Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Get a FileReader 	TokenNameCOMMENT_LINE	Get a FileReader 
patternReader	TokenNameIdentifier	 pattern Reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
patternfile	TokenNameIdentifier	 patternfile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create one NameEntry in the appropriate pattern list for each 	TokenNameCOMMENT_LINE	Create one NameEntry in the appropriate pattern list for each 
// line in the file. 	TokenNameCOMMENT_LINE	line in the file. 
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
patternReader	TokenNameIdentifier	 pattern Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
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
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPatternToList	TokenNameIdentifier	 add Pattern To List
(	TokenNameLPAREN	
patternlist	TokenNameIdentifier	 patternlist
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
patternReader	TokenNameIdentifier	 pattern Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"An error occurred while reading from pattern file: "	TokenNameStringLiteral	An error occurred while reading from pattern file: 
+	TokenNamePLUS	
patternfile	TokenNameIdentifier	 patternfile
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
patternReader	TokenNameIdentifier	 pattern Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the patterns of the other instance to this set. * @param other the other PatternSet instance. * @param p the current project. */	TokenNameCOMMENT_JAVADOC	 Adds the patterns of the other instance to this set. @param other the other PatternSet instance. @param p the current project. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot append to a reference"	TokenNameStringLiteral	Cannot append to a reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
incl	TokenNameIdentifier	 incl
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
incl	TokenNameIdentifier	 incl
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
incl	TokenNameIdentifier	 incl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
incl	TokenNameIdentifier	 incl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excl	TokenNameIdentifier	 excl
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
excl	TokenNameIdentifier	 excl
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
excl	TokenNameIdentifier	 excl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
excl	TokenNameIdentifier	 excl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the filtered include patterns. * @param p the current project. * @return the filtered included patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the filtered include patterns. @param p the current project. @return the filtered included patterns. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readFiles	TokenNameIdentifier	 read Files
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeArray	TokenNameIdentifier	 make Array
(	TokenNameLPAREN	
includeList	TokenNameIdentifier	 include List
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the filtered include patterns. * @param p the current project. * @return the filtered excluded patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the filtered include patterns. @param p the current project. @return the filtered excluded patterns. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readFiles	TokenNameIdentifier	 read Files
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeArray	TokenNameIdentifier	 make Array
(	TokenNameLPAREN	
excludeList	TokenNameIdentifier	 exclude List
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper for FileSet classes. * Check if there are patterns defined. * @param p the current project. * @return true if there are patterns. */	TokenNameCOMMENT_JAVADOC	 Helper for FileSet classes. Check if there are patterns defined. @param p the current project. @return true if there are patterns. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
includesFileList	TokenNameIdentifier	 includes File List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
excludesFileList	TokenNameIdentifier	 excludes File List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
includeList	TokenNameIdentifier	 include List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
excludeList	TokenNameIdentifier	 exclude List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the check for circular references and returns the * referenced PatternSet. */	TokenNameCOMMENT_JAVADOC	 Performs the check for circular references and returns the referenced PatternSet. 
private	TokenNameprivate	
PatternSet	TokenNameIdentifier	 Pattern Set
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a vector of NameEntry elements into an array of Strings. */	TokenNameCOMMENT_JAVADOC	 Convert a vector of NameEntry elements into an array of Strings. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
makeArray	TokenNameIdentifier	 make Array
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
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
Vector	TokenNameIdentifier	 Vector
tmpNames	TokenNameIdentifier	 tmp Names
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
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
NameEntry	TokenNameIdentifier	 Name Entry
ne	TokenNameIdentifier	 ne
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameEntry	TokenNameIdentifier	 Name Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
evalName	TokenNameIdentifier	 eval Name
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpNames	TokenNameIdentifier	 tmp Names
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tmpNames	TokenNameIdentifier	 tmp Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tmpNames	TokenNameIdentifier	 tmp Names
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read includesfile ot excludesfile if not already done so. */	TokenNameCOMMENT_JAVADOC	 Read includesfile ot excludesfile if not already done so. 
private	TokenNameprivate	
void	TokenNamevoid	
readFiles	TokenNameIdentifier	 read Files
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
includesFileList	TokenNameIdentifier	 includes File List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
includesFileList	TokenNameIdentifier	 includes File List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
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
NameEntry	TokenNameIdentifier	 Name Entry
ne	TokenNameIdentifier	 ne
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameEntry	TokenNameIdentifier	 Name Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
evalName	TokenNameIdentifier	 eval Name
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
inclFile	TokenNameIdentifier	 incl File
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inclFile	TokenNameIdentifier	 incl File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Includesfile "	TokenNameStringLiteral	Includesfile 
+	TokenNamePLUS	
inclFile	TokenNameIdentifier	 incl File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readPatterns	TokenNameIdentifier	 read Patterns
(	TokenNameLPAREN	
inclFile	TokenNameIdentifier	 incl File
,	TokenNameCOMMA	
includeList	TokenNameIdentifier	 include List
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
includesFileList	TokenNameIdentifier	 includes File List
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
excludesFileList	TokenNameIdentifier	 excludes File List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
excludesFileList	TokenNameIdentifier	 excludes File List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
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
NameEntry	TokenNameIdentifier	 Name Entry
ne	TokenNameIdentifier	 ne
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameEntry	TokenNameIdentifier	 Name Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
evalName	TokenNameIdentifier	 eval Name
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
exclFile	TokenNameIdentifier	 excl File
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
exclFile	TokenNameIdentifier	 excl File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Excludesfile "	TokenNameStringLiteral	Excludesfile 
+	TokenNamePLUS	
exclFile	TokenNameIdentifier	 excl File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readPatterns	TokenNameIdentifier	 read Patterns
(	TokenNameLPAREN	
exclFile	TokenNameIdentifier	 excl File
,	TokenNameCOMMA	
excludeList	TokenNameIdentifier	 exclude List
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
excludesFileList	TokenNameIdentifier	 excludes File List
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return a printable form of this object. */	TokenNameCOMMENT_JAVADOC	 @return a printable form of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"patternSet{ includes: "	TokenNameStringLiteral	patternSet{ includes: 
+	TokenNamePLUS	
includeList	TokenNameIdentifier	 include List
+	TokenNamePLUS	
" excludes: "	TokenNameStringLiteral	 excludes: 
+	TokenNamePLUS	
excludeList	TokenNameIdentifier	 exclude List
+	TokenNamePLUS	
" }"	TokenNameStringLiteral	 }
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.6 * @return a clone of this patternset. */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6 @return a clone of this patternset. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
PatternSet	TokenNameIdentifier	 Pattern Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
includeList	TokenNameIdentifier	 include List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
includeList	TokenNameIdentifier	 include List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
excludeList	TokenNameIdentifier	 exclude List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
excludeList	TokenNameIdentifier	 exclude List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
includesFileList	TokenNameIdentifier	 includes File List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
includesFileList	TokenNameIdentifier	 includes File List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
excludesFileList	TokenNameIdentifier	 excludes File List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
excludesFileList	TokenNameIdentifier	 excludes File List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
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
/** * Add an inverted patternset. * @param p the pattern to invert and add. */	TokenNameCOMMENT_JAVADOC	 Add an inverted patternset. @param p the pattern to invert and add. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredInvert	TokenNameIdentifier	 add Configured Invert
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConfiguredPatternset	TokenNameIdentifier	 add Configured Patternset
(	TokenNameLPAREN	
new	TokenNamenew	
InvertedPatternSet	TokenNameIdentifier	 Inverted Pattern Set
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
