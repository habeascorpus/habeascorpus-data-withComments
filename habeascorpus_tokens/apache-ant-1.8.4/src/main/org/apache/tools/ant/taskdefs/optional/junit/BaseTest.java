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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Baseclass for BatchTest and JUnitTest. * */	TokenNameCOMMENT_JAVADOC	 Baseclass for BatchTest and JUnitTest. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseTest	TokenNameIdentifier	 Base Test
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
boolean	TokenNameboolean	
haltOnError	TokenNameIdentifier	 halt On Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
haltOnFail	TokenNameIdentifier	 halt On Fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
filtertrace	TokenNameIdentifier	 filtertrace
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
fork	TokenNameIdentifier	 fork
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ifProperty	TokenNameIdentifier	 if Property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
unlessProperty	TokenNameIdentifier	 unless Property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
formatters	TokenNameIdentifier	 formatters
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** destination directory */	TokenNameCOMMENT_JAVADOC	 destination directory 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
failureProperty	TokenNameIdentifier	 failure Property
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
errorProperty	TokenNameIdentifier	 error Property
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
ifCond	TokenNameIdentifier	 if Cond
,	TokenNameCOMMA	
unlessCond	TokenNameIdentifier	 unless Cond
;	TokenNameSEMICOLON	
/** * Set the filtertrace attribute. * @param value a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Set the filtertrace attribute. @param value a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setFiltertrace	TokenNameIdentifier	 set Filtertrace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filtertrace	TokenNameIdentifier	 filtertrace
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the filtertrace attribute. * @return the attribute. */	TokenNameCOMMENT_JAVADOC	 Get the filtertrace attribute. @return the attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFiltertrace	TokenNameIdentifier	 get Filtertrace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filtertrace	TokenNameIdentifier	 filtertrace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the fork attribute. * @param value a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Set the fork attribute. @param value a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fork	TokenNameIdentifier	 fork
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the fork attribute. * @return the attribute. */	TokenNameCOMMENT_JAVADOC	 Get the fork attribute. @return the attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFork	TokenNameIdentifier	 get Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fork	TokenNameIdentifier	 fork
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the haltonerror attribute. * @param value a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Set the haltonerror attribute. @param value a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setHaltonerror	TokenNameIdentifier	 set Haltonerror
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haltOnError	TokenNameIdentifier	 halt On Error
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the haltonfailure attribute. * @param value a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Set the haltonfailure attribute. @param value a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setHaltonfailure	TokenNameIdentifier	 set Haltonfailure
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haltOnFail	TokenNameIdentifier	 halt On Fail
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the haltonerror attribute. * @return the attribute. */	TokenNameCOMMENT_JAVADOC	 Get the haltonerror attribute. @return the attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getHaltonerror	TokenNameIdentifier	 get Haltonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
haltOnError	TokenNameIdentifier	 halt On Error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the haltonfailure attribute. * @return the attribute. */	TokenNameCOMMENT_JAVADOC	 Get the haltonfailure attribute. @return the attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getHaltonfailure	TokenNameIdentifier	 get Haltonfailure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
haltOnFail	TokenNameIdentifier	 halt On Fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the if attribute. * If this expression evaluates to true or the name of a property * which is present in project, the test will be run. * @param ifCondition the expression to evaluate * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the if attribute. If this expression evaluates to true or the name of a property which is present in project, the test will be run. @param ifCondition the expression to evaluate @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifCond	TokenNameIdentifier	 if Cond
=	TokenNameEQUAL	
ifCondition	TokenNameIdentifier	 if Condition
;	TokenNameSEMICOLON	
ifProperty	TokenNameIdentifier	 if Property
=	TokenNameEQUAL	
ifCondition	TokenNameIdentifier	 if Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the if attribute. * If this expression evaluates to true or the name of a property * which is present in project, the test will be run. * @param propertyName the expression to evaluate */	TokenNameCOMMENT_JAVADOC	 Set the if attribute. If this expression evaluates to true or the name of a property which is present in project, the test will be run. @param propertyName the expression to evaluate 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The if expression * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The if expression @since Ant 1.8.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getIfCondition	TokenNameIdentifier	 get If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ifCond	TokenNameIdentifier	 if Cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the unless attribute. If this expression evaluates to * false or the name of a property which is not present in * project, the test will be run. * @param unlessCondition the expression to evaluate * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the unless attribute. If this expression evaluates to false or the name of a property which is not present in project, the test will be run. @param unlessCondition the expression to evaluate @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlessCond	TokenNameIdentifier	 unless Cond
=	TokenNameEQUAL	
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
unlessProperty	TokenNameIdentifier	 unless Property
=	TokenNameEQUAL	
unlessCondition	TokenNameIdentifier	 unless Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the unless attribute. If this expression evaluates to * false or the name of a property which is not present in * project, the test will be run. * @param propertyName the expression to evaluate */	TokenNameCOMMENT_JAVADOC	 Set the unless attribute. If this expression evaluates to false or the name of a property which is not present in project, the test will be run. @param propertyName the expression to evaluate 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The unless expression * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The unless expression @since Ant 1.8.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUnlessCondition	TokenNameIdentifier	 get Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unlessCond	TokenNameIdentifier	 unless Cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allow a formatter nested element. * @param elem a formatter nested element. */	TokenNameCOMMENT_JAVADOC	 Allow a formatter nested element. @param elem a formatter nested element. 
public	TokenNamepublic	
void	TokenNamevoid	
addFormatter	TokenNameIdentifier	 add Formatter
(	TokenNameLPAREN	
FormatterElement	TokenNameIdentifier	 Formatter Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the destination directory. * @param destDir the destination directory. */	TokenNameCOMMENT_JAVADOC	 Sets the destination directory. @param destDir the destination directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the destination directory. * @return the destination directory as an absolute path if it exists * otherwise return <tt>null</tt> */	TokenNameCOMMENT_JAVADOC	 Get the destination directory. @return the destination directory as an absolute path if it exists otherwise return <tt>null</tt> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTodir	TokenNameIdentifier	 get Todir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the failure property name. * @return the name of the property to set on failure. */	TokenNameCOMMENT_JAVADOC	 Get the failure property name. @return the name of the property to set on failure. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFailureProperty	TokenNameIdentifier	 get Failure Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
failureProperty	TokenNameIdentifier	 failure Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the failure property. * @param failureProperty the name of the property to set if * the test fails. */	TokenNameCOMMENT_JAVADOC	 Set the name of the failure property. @param failureProperty the name of the property to set if the test fails. 
public	TokenNamepublic	
void	TokenNamevoid	
setFailureProperty	TokenNameIdentifier	 set Failure Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
failureProperty	TokenNameIdentifier	 failure Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failureProperty	TokenNameIdentifier	 failure Property
=	TokenNameEQUAL	
failureProperty	TokenNameIdentifier	 failure Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the failure property name. * @return the name of the property to set on failure. */	TokenNameCOMMENT_JAVADOC	 Get the failure property name. @return the name of the property to set on failure. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getErrorProperty	TokenNameIdentifier	 get Error Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorProperty	TokenNameIdentifier	 error Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the error property. * @param errorProperty the name of the property to set if * the test has an error. */	TokenNameCOMMENT_JAVADOC	 Set the name of the error property. @param errorProperty the name of the property to set if the test has an error. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorProperty	TokenNameIdentifier	 set Error Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorProperty	TokenNameIdentifier	 error Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorProperty	TokenNameIdentifier	 error Property
=	TokenNameEQUAL	
errorProperty	TokenNameIdentifier	 error Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
