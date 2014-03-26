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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
/** * The assertion datatype. This type describes * assertion settings for the &lt;java&gt; task and others. * One can set the system assertions, and enable/disable those in * packages and classes. * Assertions can only be enabled or disabled when forking Java. * * Example: set system assertions and all org.apache packages except * for ant, and the class org.apache.tools.ant.Main. * <pre> * &lt;assertions enableSystemAssertions="true" &gt; * &lt;enable package="org.apache" /&gt; * &lt;disable package="org.apache.ant" /&gt; * &lt;enable class="org.apache.tools.ant.Main"/&gt; * &lt;/assertions&gt; *</pre> * Disable system assertions; enable those in the anonymous package * <pre> * &lt;assertions enableSystemAssertions="false" &gt; * &lt;enable package="..." /&gt; * &lt;/assertions&gt; * </pre> * enable assertions in a class called Test * <pre> * &lt;assertions &gt; * &lt;enable class="Test" /&gt; * &lt;/assertions&gt; * </pre> * This type is a datatype, so you can declare assertions and use them later * * <pre> * &lt;assertions id="project.assertions" &gt; * &lt;enable project="org.apache.test" /&gt; * &lt;/assertions&gt; * * &lt;assertions refid="project.assertions" /&gt; * * </pre> * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 The assertion datatype. This type describes assertion settings for the &lt;java&gt; task and others. One can set the system assertions, and enable/disable those in packages and classes. Assertions can only be enabled or disabled when forking Java. * Example: set system assertions and all org.apache packages except for ant, and the class org.apache.tools.ant.Main. <pre> &lt;assertions enableSystemAssertions="true" &gt; &lt;enable package="org.apache" /&gt; &lt;disable package="org.apache.ant" /&gt; &lt;enable class="org.apache.tools.ant.Main"/&gt; &lt;/assertions&gt; *</pre> Disable system assertions; enable those in the anonymous package <pre> &lt;assertions enableSystemAssertions="false" &gt; &lt;enable package="..." /&gt; &lt;/assertions&gt; </pre> enable assertions in a class called Test <pre> &lt;assertions &gt; &lt;enable class="Test" /&gt; &lt;/assertions&gt; </pre> This type is a datatype, so you can declare assertions and use them later * <pre> &lt;assertions id="project.assertions" &gt; &lt;enable project="org.apache.test" /&gt; &lt;/assertions&gt; * &lt;assertions refid="project.assertions" /&gt; * </pre> @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Assertions	TokenNameIdentifier	 Assertions
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * enable/disable sys assertions; null means undefined */	TokenNameCOMMENT_JAVADOC	 enable/disable sys assertions; null means undefined 
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
;	TokenNameSEMICOLON	
/** * list of type BaseAssertion */	TokenNameCOMMENT_JAVADOC	 list of type BaseAssertion 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
assertionList	TokenNameIdentifier	 assertion List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * enable assertions * @param assertion an enable assertion nested element */	TokenNameCOMMENT_JAVADOC	 enable assertions @param assertion an enable assertion nested element 
public	TokenNamepublic	
void	TokenNamevoid	
addEnable	TokenNameIdentifier	 add Enable
(	TokenNameLPAREN	
EnabledAssertion	TokenNameIdentifier	 Enabled Assertion
assertion	TokenNameIdentifier	 assertion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
assertion	TokenNameIdentifier	 assertion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * disable assertions * @param assertion a disable assertion nested element */	TokenNameCOMMENT_JAVADOC	 disable assertions @param assertion a disable assertion nested element 
public	TokenNamepublic	
void	TokenNamevoid	
addDisable	TokenNameIdentifier	 add Disable
(	TokenNameLPAREN	
DisabledAssertion	TokenNameIdentifier	 Disabled Assertion
assertion	TokenNameIdentifier	 assertion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
assertion	TokenNameIdentifier	 assertion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * enable or disable system assertions. * Default is not set (neither -enablesystemassersions or -disablesytemassertions * are used on the command line). * @param enableSystemAssertions if true enable system assertions */	TokenNameCOMMENT_JAVADOC	 enable or disable system assertions. Default is not set (neither -enablesystemassersions or -disablesytemassertions are used on the command line). @param enableSystemAssertions if true enable system assertions 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableSystemAssertions	TokenNameIdentifier	 set Enable System Assertions
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
=	TokenNameEQUAL	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value of the refid attribute. * * <p>Subclasses may need to check whether any other attributes * have been set as well or child elements have been created and * thus override this method. if they do the must call * <code>super.setRefid</code>.</p> * @param ref the reference to use */	TokenNameCOMMENT_JAVADOC	 Set the value of the refid attribute. * <p>Subclasses may need to check whether any other attributes have been set as well or child elements have been created and thus override this method. if they do the must call <code>super.setRefid</code>.</p> @param ref the reference to use 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get whatever we are referencing to. This could be ourself. * @return the object that contains the assertion info */	TokenNameCOMMENT_JAVADOC	 get whatever we are referencing to. This could be ourself. @return the object that contains the assertion info 
private	TokenNameprivate	
Assertions	TokenNameIdentifier	 Assertions
getFinalReference	TokenNameIdentifier	 get Final Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Assertions	TokenNameIdentifier	 Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"reference is of wrong type"	TokenNameStringLiteral	reference is of wrong type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Assertions	TokenNameIdentifier	 Assertions
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * how many assertions are made...will resolve references before returning * @return total # of commands to make */	TokenNameCOMMENT_JAVADOC	 how many assertions are made...will resolve references before returning @return total # of commands to make 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assertions	TokenNameIdentifier	 Assertions
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
getFinalReference	TokenNameIdentifier	 get Final Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
getFinalSize	TokenNameIdentifier	 get Final Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * what is the final size of this object * @return */	TokenNameCOMMENT_JAVADOC	 what is the final size of this object @return 
private	TokenNameprivate	
int	TokenNameint	
getFinalSize	TokenNameIdentifier	 get Final Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add the assertions to a list in a format suitable * for adding to a command line * @param commandList the command line to format */	TokenNameCOMMENT_JAVADOC	 add the assertions to a list in a format suitable for adding to a command line @param commandList the command line to format 
public	TokenNamepublic	
void	TokenNamevoid	
applyAssertions	TokenNameIdentifier	 apply Assertions
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
commandList	TokenNameIdentifier	 command List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Applying assertions"	TokenNameStringLiteral	Applying assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assertions	TokenNameIdentifier	 Assertions
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
getFinalReference	TokenNameIdentifier	 get Final Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//do the system assertions 	TokenNameCOMMENT_LINE	do the system assertions 
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Enabling system assertions"	TokenNameStringLiteral	Enabling system assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandList	TokenNameIdentifier	 command List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-enablesystemassertions"	TokenNameStringLiteral	-enablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"disabling system assertions"	TokenNameStringLiteral	disabling system assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandList	TokenNameIdentifier	 command List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-disablesystemassertions"	TokenNameStringLiteral	-disablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now any inner assertions 	TokenNameCOMMENT_LINE	now any inner assertions 
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BaseAssertion	TokenNameIdentifier	 Base Assertion
assertion	TokenNameIdentifier	 assertion
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BaseAssertion	TokenNameIdentifier	 Base Assertion
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
assertion	TokenNameIdentifier	 assertion
.	TokenNameDOT	
toCommand	TokenNameIdentifier	 to Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"adding assertion "	TokenNameStringLiteral	adding assertion 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandList	TokenNameIdentifier	 command List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * apply all the assertions to the command. * @param command the command line to format */	TokenNameCOMMENT_JAVADOC	 apply all the assertions to the command. @param command the command line to format 
public	TokenNamepublic	
void	TokenNamevoid	
applyAssertions	TokenNameIdentifier	 apply Assertions
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assertions	TokenNameIdentifier	 Assertions
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
getFinalReference	TokenNameIdentifier	 get Final Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//do the system assertions 	TokenNameCOMMENT_LINE	do the system assertions 
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addVmArgument	TokenNameIdentifier	 add Vm Argument
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
"-enablesystemassertions"	TokenNameStringLiteral	-enablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addVmArgument	TokenNameIdentifier	 add Vm Argument
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
"-disablesystemassertions"	TokenNameStringLiteral	-disablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now any inner assertions 	TokenNameCOMMENT_LINE	now any inner assertions 
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BaseAssertion	TokenNameIdentifier	 Base Assertion
assertion	TokenNameIdentifier	 assertion
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BaseAssertion	TokenNameIdentifier	 Base Assertion
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
assertion	TokenNameIdentifier	 assertion
.	TokenNameDOT	
toCommand	TokenNameIdentifier	 to Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addVmArgument	TokenNameIdentifier	 add Vm Argument
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add the assertions to a list in a format suitable * for adding to a command line * @param commandIterator list of commands */	TokenNameCOMMENT_JAVADOC	 add the assertions to a list in a format suitable for adding to a command line @param commandIterator list of commands 
public	TokenNamepublic	
void	TokenNamevoid	
applyAssertions	TokenNameIdentifier	 apply Assertions
(	TokenNameLPAREN	
final	TokenNamefinal	
ListIterator	TokenNameIdentifier	 List Iterator
commandIterator	TokenNameIdentifier	 command Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Applying assertions"	TokenNameStringLiteral	Applying assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assertions	TokenNameIdentifier	 Assertions
clause	TokenNameIdentifier	 clause
=	TokenNameEQUAL	
getFinalReference	TokenNameIdentifier	 get Final Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//do the system assertions 	TokenNameCOMMENT_LINE	do the system assertions 
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Enabling system assertions"	TokenNameStringLiteral	Enabling system assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandIterator	TokenNameIdentifier	 command Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-enablesystemassertions"	TokenNameStringLiteral	-enablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
enableSystemAssertions	TokenNameIdentifier	 enable System Assertions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"disabling system assertions"	TokenNameStringLiteral	disabling system assertions
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandIterator	TokenNameIdentifier	 command Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-disablesystemassertions"	TokenNameStringLiteral	-disablesystemassertions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now any inner assertions 	TokenNameCOMMENT_LINE	now any inner assertions 
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BaseAssertion	TokenNameIdentifier	 Base Assertion
assertion	TokenNameIdentifier	 assertion
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BaseAssertion	TokenNameIdentifier	 Base Assertion
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
assertion	TokenNameIdentifier	 assertion
.	TokenNameDOT	
toCommand	TokenNameIdentifier	 to Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"adding assertion "	TokenNameStringLiteral	adding assertion 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
commandIterator	TokenNameIdentifier	 command Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * helper method to add a string JVM argument to a command * @param command * @param arg */	TokenNameCOMMENT_JAVADOC	 helper method to add a string JVM argument to a command @param command @param arg 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
addVmArgument	TokenNameIdentifier	 add Vm Argument
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
argument	TokenNameIdentifier	 argument
;	TokenNameSEMICOLON	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * clone the objects. * This is not a full depth clone; the list of assertions is cloned, * but it does not clone the underlying assertions. * @return a cli * @throws CloneNotSupportedException if the super class does not support cloning */	TokenNameCOMMENT_JAVADOC	 clone the objects. This is not a full depth clone; the list of assertions is cloned, but it does not clone the underlying assertions. @return a cli @throws CloneNotSupportedException if the super class does not support cloning 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
Assertions	TokenNameIdentifier	 Assertions
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Assertions	TokenNameIdentifier	 Assertions
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
assertionList	TokenNameIdentifier	 assertion List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
assertionList	TokenNameIdentifier	 assertion List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
that	TokenNameIdentifier	 that
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * base class for our assertion elements. */	TokenNameCOMMENT_JAVADOC	 base class for our assertion elements. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
BaseAssertion	TokenNameIdentifier	 Base Assertion
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
packageName	TokenNameIdentifier	 package Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
/** * name a class * @param className a class name */	TokenNameCOMMENT_JAVADOC	 name a class @param className a class name 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * name a package * @param packageName a package name */	TokenNameCOMMENT_JAVADOC	 name a package @param packageName a package name 
public	TokenNamepublic	
void	TokenNamevoid	
setPackage	TokenNameIdentifier	 set Package
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
packageName	TokenNameIdentifier	 package Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
packageName	TokenNameIdentifier	 package Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * what is the class name? * @return classname or null * @see #setClass */	TokenNameCOMMENT_JAVADOC	 what is the class name? @return classname or null @see #setClass 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * what is the package name? * @return package name or null * @see #setPackage */	TokenNameCOMMENT_JAVADOC	 what is the package name? @return package name or null @see #setPackage 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getPackageName	TokenNameIdentifier	 get Package Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
packageName	TokenNameIdentifier	 package Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the prefix used to begin the command; -ea or -da. * @return prefix */	TokenNameCOMMENT_JAVADOC	 get the prefix used to begin the command; -ea or -da. @return prefix 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getCommandPrefix	TokenNameIdentifier	 get Command Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * create a full command string from this class * @throws BuildException in case of trouble * @return The command string */	TokenNameCOMMENT_JAVADOC	 create a full command string from this class @throws BuildException in case of trouble @return The command string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toCommand	TokenNameIdentifier	 to Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//catch invalidness 	TokenNameCOMMENT_LINE	catch invalidness 
if	TokenNameif	
(	TokenNameLPAREN	
getPackageName	TokenNameIdentifier	 get Package Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Both package and class have been set"	TokenNameStringLiteral	Both package and class have been set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getCommandPrefix	TokenNameIdentifier	 get Command Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//see if it is a package or a class 	TokenNameCOMMENT_LINE	see if it is a package or a class 
if	TokenNameif	
(	TokenNameLPAREN	
getPackageName	TokenNameIdentifier	 get Package Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//packages get a ... prefix 	TokenNameCOMMENT_LINE	packages get a ... prefix 
command	TokenNameIdentifier	 command
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getPackageName	TokenNameIdentifier	 get Package Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//append the ... suffix if not there already 	TokenNameCOMMENT_LINE	append the ... suffix if not there already 
command	TokenNameIdentifier	 command
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//classes just get the classname 	TokenNameCOMMENT_LINE	classes just get the classname 
command	TokenNameIdentifier	 command
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * an enabled assertion enables things */	TokenNameCOMMENT_JAVADOC	 an enabled assertion enables things 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
EnabledAssertion	TokenNameIdentifier	 Enabled Assertion
extends	TokenNameextends	
BaseAssertion	TokenNameIdentifier	 Base Assertion
{	TokenNameLBRACE	
/** * get the prefix used to begin the command; -ea or -da. * @return prefix */	TokenNameCOMMENT_JAVADOC	 get the prefix used to begin the command; -ea or -da. @return prefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCommandPrefix	TokenNameIdentifier	 get Command Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-ea"	TokenNameStringLiteral	-ea
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A disabled assertion disables things */	TokenNameCOMMENT_JAVADOC	 A disabled assertion disables things 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DisabledAssertion	TokenNameIdentifier	 Disabled Assertion
extends	TokenNameextends	
BaseAssertion	TokenNameIdentifier	 Base Assertion
{	TokenNameLBRACE	
/** * get the prefix used to begin the command; -ea or -da. * @return prefix */	TokenNameCOMMENT_JAVADOC	 get the prefix used to begin the command; -ea or -da. @return prefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCommandPrefix	TokenNameIdentifier	 get Command Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-da"	TokenNameStringLiteral	-da
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
