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
MagicNames	TokenNameIdentifier	 Magic Names
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
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
;	TokenNameSEMICOLON	
/** * Simple Factory Class that produces an implementation of RegexpMatcher based on the system * property <code>ant.regexp.regexpimpl</code> and the classes available. * * <p> * In a more general framework this class would be abstract and have a static newInstance method. * </p> * */	TokenNameCOMMENT_JAVADOC	 Simple Factory Class that produces an implementation of RegexpMatcher based on the system property <code>ant.regexp.regexpimpl</code> and the classes available. * <p> In a more general framework this class would be abstract and have a static newInstance method. </p> 
public	TokenNamepublic	
class	TokenNameclass	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
{	TokenNameLBRACE	
/** Constructor for RegexpMatcherFactory. */	TokenNameCOMMENT_JAVADOC	 Constructor for RegexpMatcherFactory. 
public	TokenNamepublic	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/*** * Create a new regular expression instance. * @return the matcher * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Create a new regular expression instance. @return the matcher @throws BuildException on error 
public	TokenNamepublic	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
newRegexpMatcher	TokenNameIdentifier	 new Regexp Matcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
newRegexpMatcher	TokenNameIdentifier	 new Regexp Matcher
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * Create a new regular expression instance. * * @param p Project whose ant.regexp.regexpimpl property will be used. * @return the matcher * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Create a new regular expression instance. * @param p Project whose ant.regexp.regexpimpl property will be used. @return the matcher @throws BuildException on error 
public	TokenNamepublic	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
newRegexpMatcher	TokenNameIdentifier	 new Regexp Matcher
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemDefault	TokenNameIdentifier	 system Default
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemDefault	TokenNameIdentifier	 system Default
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REGEXP_IMPL	TokenNameIdentifier	 REGEXP  IMPL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
systemDefault	TokenNameIdentifier	 system Default
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REGEXP_IMPL	TokenNameIdentifier	 REGEXP  IMPL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemDefault	TokenNameIdentifier	 system Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createInstance	TokenNameIdentifier	 create Instance
(	TokenNameLPAREN	
systemDefault	TokenNameIdentifier	 system Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX should we silently catch possible exceptions and try to 	TokenNameCOMMENT_LINE	XXX should we silently catch possible exceptions and try to 
// load a different implementation? 	TokenNameCOMMENT_LINE	load a different implementation? 
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Jdk14RegexpMatcher	TokenNameIdentifier	 Jdk14 Regexp Matcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an instance of a matcher from a classname. * * @param className a <code>String</code> value * @return a <code>RegexpMatcher</code> value * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Create an instance of a matcher from a classname. * @param className a <code>String</code> value @return a <code>RegexpMatcher</code> value @exception BuildException if an error occurs 
protected	TokenNameprotected	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
createInstance	TokenNameIdentifier	 create Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
)	TokenNameRPAREN	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test if a particular class is available to be used. * * @param className a <code>String</code> value * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Test if a particular class is available to be used. * @param className a <code>String</code> value @exception BuildException if an error occurs 
protected	TokenNameprotected	
void	TokenNamevoid	
testAvailability	TokenNameIdentifier	 test Availability
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks if a RegExp-Matcher is available. * @param project The project to check for (may be <code>null</code>) * @return <code>true</code> if available otherwise <code>false</code> */	TokenNameCOMMENT_JAVADOC	 Checks if a RegExp-Matcher is available. @param project The project to check for (may be <code>null</code>) @return <code>true</code> if available otherwise <code>false</code> 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
regexpMatcherPresent	TokenNameIdentifier	 regexp Matcher Present
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// The factory throws a BuildException if no usable matcher 	TokenNameCOMMENT_LINE	The factory throws a BuildException if no usable matcher 
// cant be instantiated. We dont need the matcher itself here. 	TokenNameCOMMENT_LINE	cant be instantiated. We dont need the matcher itself here. 
new	TokenNamenew	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newRegexpMatcher	TokenNameIdentifier	 new Regexp Matcher
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
