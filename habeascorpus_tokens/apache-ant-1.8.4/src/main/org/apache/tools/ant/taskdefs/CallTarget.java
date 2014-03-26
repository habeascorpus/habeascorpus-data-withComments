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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
Task	TokenNameIdentifier	 Task
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
PropertySet	TokenNameIdentifier	 Property Set
;	TokenNameSEMICOLON	
/** * Call another target in the same project. * * <pre> * &lt;target name="foo"&gt; * &lt;antcall target="bar"&gt; * &lt;param name="property1" value="aaaaa" /&gt; * &lt;param name="foo" value="baz" /&gt; * &lt;/antcall&gt; * &lt;/target&gt; * * &lt;target name="bar" depends="init"&gt; * &lt;echo message="prop is ${property1} ${foo}" /&gt; * &lt;/target&gt; * </pre> * * <p>This only works as expected if neither property1 nor foo are * defined in the project itself. * * * @since Ant 1.2 * * @ant.task name="antcall" category="control" */	TokenNameCOMMENT_JAVADOC	 Call another target in the same project. * <pre> &lt;target name="foo"&gt; &lt;antcall target="bar"&gt; &lt;param name="property1" value="aaaaa" /&gt; &lt;param name="foo" value="baz" /&gt; &lt;/antcall&gt; &lt;/target&gt; * &lt;target name="bar" depends="init"&gt; &lt;echo message="prop is ${property1} ${foo}" /&gt; &lt;/target&gt; </pre> * <p>This only works as expected if neither property1 nor foo are defined in the project itself. * @since Ant 1.2 * @ant.task name="antcall" category="control" 
public	TokenNamepublic	
class	TokenNameclass	
CallTarget	TokenNameIdentifier	 Call Target
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
Ant	TokenNameIdentifier	 Ant
callee	TokenNameIdentifier	 callee
;	TokenNameSEMICOLON	
// must match the default value of Ant#inheritAll 	TokenNameCOMMENT_LINE	must match the default value of Ant#inheritAll 
private	TokenNameprivate	
boolean	TokenNameboolean	
inheritAll	TokenNameIdentifier	 inherit All
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// must match the default value of Ant#inheritRefs 	TokenNameCOMMENT_LINE	must match the default value of Ant#inheritRefs 
private	TokenNameprivate	
boolean	TokenNameboolean	
inheritRefs	TokenNameIdentifier	 inherit Refs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
targetSet	TokenNameIdentifier	 target Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * If true, pass all properties to the new Ant project. * Defaults to true. * @param inherit <code>boolean</code> flag. */	TokenNameCOMMENT_JAVADOC	 If true, pass all properties to the new Ant project. Defaults to true. @param inherit <code>boolean</code> flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setInheritAll	TokenNameIdentifier	 set Inherit All
(	TokenNameLPAREN	
boolean	TokenNameboolean	
inherit	TokenNameIdentifier	 inherit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inheritAll	TokenNameIdentifier	 inherit All
=	TokenNameEQUAL	
inherit	TokenNameIdentifier	 inherit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, pass all references to the new Ant project. * Defaults to false. * @param inheritRefs <code>boolean</code> flag. */	TokenNameCOMMENT_JAVADOC	 If true, pass all references to the new Ant project. Defaults to false. @param inheritRefs <code>boolean</code> flag. 
public	TokenNamepublic	
void	TokenNamevoid	
setInheritRefs	TokenNameIdentifier	 set Inherit Refs
(	TokenNameLPAREN	
boolean	TokenNameboolean	
inheritRefs	TokenNameIdentifier	 inherit Refs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inheritRefs	TokenNameIdentifier	 inherit Refs
=	TokenNameEQUAL	
inheritRefs	TokenNameIdentifier	 inherit Refs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize this task by creating new instance of the ant task and * configuring it by calling its own init method. */	TokenNameCOMMENT_JAVADOC	 Initialize this task by creating new instance of the ant task and configuring it by calling its own init method. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callee	TokenNameIdentifier	 callee
=	TokenNameEQUAL	
new	TokenNamenew	
Ant	TokenNameIdentifier	 Ant
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegate the work to the ant task instance, after setting it up. * @throws BuildException on validation failure or if the target didn't * execute. */	TokenNameCOMMENT_JAVADOC	 Delegate the work to the ant task instance, after setting it up. @throws BuildException on validation failure or if the target didn't execute. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
targetSet	TokenNameIdentifier	 target Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Attribute target or at least one nested target is required."	TokenNameStringLiteral	Attribute target or at least one nested target is required.
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
setAntfile	TokenNameIdentifier	 set Antfile
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ant.file"	TokenNameStringLiteral	ant.file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
setInheritAll	TokenNameIdentifier	 set Inherit All
(	TokenNameLPAREN	
inheritAll	TokenNameIdentifier	 inherit All
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
setInheritRefs	TokenNameIdentifier	 set Inherit Refs
(	TokenNameLPAREN	
inheritRefs	TokenNameIdentifier	 inherit Refs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new Property to pass to the invoked target(s). * @return a <code>Property</code> object. */	TokenNameCOMMENT_JAVADOC	 Create a new Property to pass to the invoked target(s). @return a <code>Property</code> object. 
public	TokenNamepublic	
Property	TokenNameIdentifier	 Property
createParam	TokenNameIdentifier	 create Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
createProperty	TokenNameIdentifier	 create Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reference element identifying a data type to carry * over to the invoked target. * @param r the specified <code>Ant.Reference</code>. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Reference element identifying a data type to carry over to the invoked target. @param r the specified <code>Ant.Reference</code>. @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
Ant	TokenNameIdentifier	 Ant
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set of properties to pass to the new project. * @param ps the <code>PropertySet</code> to pass. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Set of properties to pass to the new project. @param ps the <code>PropertySet</code> to pass. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
addPropertyset	TokenNameIdentifier	 add Propertyset
(	TokenNameLPAREN	
PropertySet	TokenNameIdentifier	 Property Set
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
addPropertyset	TokenNameIdentifier	 add Propertyset
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set target to execute. * @param target the name of the target to execute. */	TokenNameCOMMENT_JAVADOC	 Set target to execute. @param target the name of the target to execute. 
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetSet	TokenNameIdentifier	 target Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a target to the list of targets to invoke. * @param t <code>Ant.TargetElement</code> representing the target. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Add a target to the list of targets to invoke. @param t <code>Ant.TargetElement</code> representing the target. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredTarget	TokenNameIdentifier	 add Configured Target
(	TokenNameLPAREN	
Ant	TokenNameIdentifier	 Ant
.	TokenNameDOT	
TargetElement	TokenNameIdentifier	 Target Element
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
addConfiguredTarget	TokenNameIdentifier	 add Configured Target
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetSet	TokenNameIdentifier	 target Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles output. * Send it the the new project if is present, otherwise * call the super class. * @param output The string output to output. * @see Task#handleOutput(String) * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Handles output. Send it the the new project if is present, otherwise call the super class. @param output The string output to output. @see Task#handleOutput(String) @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles input. * Deleate to the created project, if present, otherwise * call the super class. * @param buffer the buffer into which data is to be read. * @param offset the offset into the buffer at which data is stored. * @param length the amount of data to read. * * @return the number of bytes read. * * @exception IOException if the data cannot be read. * @see Task#handleInput(byte[], int, int) * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Handles input. Deleate to the created project, if present, otherwise call the super class. @param buffer the buffer into which data is to be read. @param offset the offset into the buffer at which data is stored. @param length the amount of data to read. * @return the number of bytes read. * @exception IOException if the data cannot be read. @see Task#handleInput(byte[], int, int) @since Ant 1.6 
public	TokenNamepublic	
int	TokenNameint	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles output. * Send it the the new project if is present, otherwise * call the super class. * @param output The string to output. * @see Task#handleFlush(String) * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Handles output. Send it the the new project if is present, otherwise call the super class. @param output The string to output. @see Task#handleFlush(String) @since Ant 1.5.2 
public	TokenNamepublic	
void	TokenNamevoid	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handle error output. * Send it the the new project if is present, otherwise * call the super class. * @param output The string to output. * * @see Task#handleErrorOutput(String) * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Handle error output. Send it the the new project if is present, otherwise call the super class. @param output The string to output. * @see Task#handleErrorOutput(String) @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handle error output. * Send it the the new project if is present, otherwise * call the super class. * @param output The string to output. * @see Task#handleErrorFlush(String) * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Handle error output. Send it the the new project if is present, otherwise call the super class. @param output The string to output. @see Task#handleErrorFlush(String) @since Ant 1.5.2 
public	TokenNamepublic	
void	TokenNamevoid	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
callee	TokenNameIdentifier	 callee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
callee	TokenNameIdentifier	 callee
.	TokenNameDOT	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
