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
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
;	TokenNameSEMICOLON	
/*** * Regular expression factory, which will create Regexp objects. The * actual implementation class depends on the System or Ant Property: * <code>ant.regexp.regexpimpl</code>. * */	TokenNameCOMMENT_JAVADOC	* Regular expression factory, which will create Regexp objects. The actual implementation class depends on the System or Ant Property: <code>ant.regexp.regexpimpl</code>. 
public	TokenNamepublic	
class	TokenNameclass	
RegexpFactory	TokenNameIdentifier	 Regexp Factory
extends	TokenNameextends	
RegexpMatcherFactory	TokenNameIdentifier	 Regexp Matcher Factory
{	TokenNameLBRACE	
/** Constructor for RegexpFactory */	TokenNameCOMMENT_JAVADOC	 Constructor for RegexpFactory 
public	TokenNamepublic	
RegexpFactory	TokenNameIdentifier	 Regexp Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/*** * Create a new regular expression matcher instance. * @return the matcher instance * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Create a new regular expression matcher instance. @return the matcher instance @throws BuildException on error 
public	TokenNamepublic	
Regexp	TokenNameIdentifier	 Regexp
newRegexp	TokenNameIdentifier	 new Regexp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
newRegexp	TokenNameIdentifier	 new Regexp
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** * Create a new regular expression matcher instance. * * @param p Project whose ant.regexp.regexpimpl property will be used. * @return the matcher instance * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Create a new regular expression matcher instance. * @param p Project whose ant.regexp.regexpimpl property will be used. @return the matcher instance @throws BuildException on error 
public	TokenNamepublic	
Regexp	TokenNameIdentifier	 Regexp
newRegexp	TokenNameIdentifier	 new Regexp
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
createRegexpInstance	TokenNameIdentifier	 create Regexp Instance
(	TokenNameLPAREN	
systemDefault	TokenNameIdentifier	 system Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX should we silently catch possible exceptions and try to 	TokenNameCOMMENT_LINE	XXX should we silently catch possible exceptions and try to 
// load a different implementation? 	TokenNameCOMMENT_LINE	load a different implementation? 
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Jdk14RegexpRegexp	TokenNameIdentifier	 Jdk14 Regexp Regexp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrapper over RegexpMatcherFactory.createInstance that ensures that * we are dealing with a Regexp implementation. * @param classname the name of the class to use. * @return the instance. * @throws BuildException if there is a problem. * @since 1.3 * * @see RegexpMatcherFactory#createInstance(String) */	TokenNameCOMMENT_JAVADOC	 Wrapper over RegexpMatcherFactory.createInstance that ensures that we are dealing with a Regexp implementation. @param classname the name of the class to use. @return the instance. @throws BuildException if there is a problem. @since 1.3 * @see RegexpMatcherFactory#createInstance(String) 
protected	TokenNameprotected	
Regexp	TokenNameIdentifier	 Regexp
createRegexpInstance	TokenNameIdentifier	 create Regexp Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Regexp	TokenNameIdentifier	 Regexp
)	TokenNameRPAREN	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
RegexpFactory	TokenNameIdentifier	 Regexp Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
