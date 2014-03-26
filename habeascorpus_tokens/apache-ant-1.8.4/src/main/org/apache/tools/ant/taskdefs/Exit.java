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
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Condition	TokenNameIdentifier	 Condition
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
ConditionBase	TokenNameIdentifier	 Condition Base
;	TokenNameSEMICOLON	
/** * Exits the active build, giving an additional message * if available. * * The <code>if</code> and <code>unless</code> attributes make the * failure conditional -both probe for the named property being defined. * The <code>if</code> tests for the property being defined, the * <code>unless</code> for a property being undefined. * * If both attributes are set, then the test fails only if both tests * are true. i.e. * <pre>fail := defined(ifProperty) && !defined(unlessProperty)</pre> * * A single nested<code>&lt;condition&gt;</code> element can be specified * instead of using <code>if</code>/<code>unless</code> (a combined * effect can be achieved using <code>isset</code> conditions). * * @since Ant 1.2 * * @ant.task name="fail" category="control" */	TokenNameCOMMENT_JAVADOC	 Exits the active build, giving an additional message if available. * The <code>if</code> and <code>unless</code> attributes make the failure conditional -both probe for the named property being defined. The <code>if</code> tests for the property being defined, the <code>unless</code> for a property being undefined. * If both attributes are set, then the test fails only if both tests are true. i.e. <pre>fail := defined(ifProperty) && !defined(unlessProperty)</pre> * A single nested<code>&lt;condition&gt;</code> element can be specified instead of using <code>if</code>/<code>unless</code> (a combined effect can be achieved using <code>isset</code> conditions). * @since Ant 1.2 * @ant.task name="fail" category="control" 
public	TokenNamepublic	
class	TokenNameclass	
Exit	TokenNameIdentifier	 Exit
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NestedCondition	TokenNameIdentifier	 Nested Condition
extends	TokenNameextends	
ConditionBase	TokenNameIdentifier	 Condition Base
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
countConditions	TokenNameIdentifier	 count Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"A single nested condition is required."	TokenNameStringLiteral	A single nested condition is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getConditions	TokenNameIdentifier	 get Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
ifCondition	TokenNameIdentifier	 if Condition
,	TokenNameCOMMA	
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NestedCondition	TokenNameIdentifier	 Nested Condition
nestedCondition	TokenNameIdentifier	 nested Condition
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
/** * A message giving further information on why the build exited. * * @param value message to output */	TokenNameCOMMENT_JAVADOC	 A message giving further information on why the build exited. * @param value message to output 
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Only fail if the given expression evaluates to true or the name * of an existing property. * @param c property name or evaluated expression * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Only fail if the given expression evaluates to true or the name of an existing property. @param c property name or evaluated expression @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifCondition	TokenNameIdentifier	 if Condition
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Only fail if the given expression evaluates to true or the name * of an existing property. * @param c property name or evaluated expression */	TokenNameCOMMENT_JAVADOC	 Only fail if the given expression evaluates to true or the name of an existing property. @param c property name or evaluated expression 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Only fail if the given expression evaluates to false or tno * property of the given name exists. * @param c property name or evaluated expression * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Only fail if the given expression evaluates to false or tno property of the given name exists. @param c property name or evaluated expression @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlessCondition	TokenNameIdentifier	 unless Condition
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Only fail if the given expression evaluates to false or tno * property of the given name exists. * @param c property name or evaluated expression */	TokenNameCOMMENT_JAVADOC	 Only fail if the given expression evaluates to false or tno property of the given name exists. @param c property name or evaluated expression 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the status code to associate with the thrown Exception. * @param i the <code>int</code> status */	TokenNameCOMMENT_JAVADOC	 Set the status code to associate with the thrown Exception. @param i the <code>int</code> status 
public	TokenNamepublic	
void	TokenNamevoid	
setStatus	TokenNameIdentifier	 set Status
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Throw a <code>BuildException</code> to exit (fail) the build. * If specified, evaluate conditions: * A single nested condition is accepted, but requires that the * <code>if</code>/<code>unless</code> attributes be omitted. * If the nested condition evaluates to true, or the * ifCondition is true or unlessCondition is false, the build will exit. * The error message is constructed from the text fields, from * the nested condition (if specified), or finally from * the if and unless parameters (if present). * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Throw a <code>BuildException</code> to exit (fail) the build. If specified, evaluate conditions: A single nested condition is accepted, but requires that the <code>if</code>/<code>unless</code> attributes be omitted. If the nested condition evaluates to true, or the ifCondition is true or unlessCondition is false, the build will exit. The error message is constructed from the text fields, from the nested condition (if specified), or finally from the if and unless parameters (if present). @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nestedConditionPresent	TokenNameIdentifier	 nested Condition Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
testNestedCondition	TokenNameIdentifier	 test Nested Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"if="	TokenNameStringLiteral	if=
+	TokenNamePLUS	
ifCondition	TokenNameIdentifier	 if Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
+=	TokenNamePLUS_EQUAL	
" and "	TokenNameStringLiteral	 and 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
text	TokenNameIdentifier	 text
+=	TokenNamePLUS_EQUAL	
"unless="	TokenNameStringLiteral	unless=
+	TokenNamePLUS	
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nestedConditionPresent	TokenNameIdentifier	 nested Condition Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"condition satisfied"	TokenNameStringLiteral	condition satisfied
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"No message"	TokenNameStringLiteral	No message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"failing due to "	TokenNameStringLiteral	failing due to 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
status	TokenNameIdentifier	 status
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set a multiline message. * @param msg the message to display */	TokenNameCOMMENT_JAVADOC	 Set a multiline message. @param msg the message to display 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
+=	TokenNamePLUS_EQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a condition element. * @return <code>ConditionBase</code>. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Add a condition element. @return <code>ConditionBase</code>. @since Ant 1.6.2 
public	TokenNamepublic	
ConditionBase	TokenNameIdentifier	 Condition Base
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nestedCondition	TokenNameIdentifier	 nested Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one nested condition is allowed."	TokenNameStringLiteral	Only one nested condition is allowed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nestedCondition	TokenNameIdentifier	 nested Condition
=	TokenNameEQUAL	
new	TokenNamenew	
NestedCondition	TokenNameIdentifier	 Nested Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nestedCondition	TokenNameIdentifier	 nested Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the if condition * @return true if there is no if condition, or the named property exists */	TokenNameCOMMENT_JAVADOC	 test the if condition @return true if there is no if condition, or the named property exists 
private	TokenNameprivate	
boolean	TokenNameboolean	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the unless condition * @return true if there is no unless condition, * or there is a named property but it doesn't exist */	TokenNameCOMMENT_JAVADOC	 test the unless condition @return true if there is no unless condition, or there is a named property but it doesn't exist 
private	TokenNameprivate	
boolean	TokenNameboolean	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test the nested condition * @return true if there is none, or it evaluates to true */	TokenNameCOMMENT_JAVADOC	 test the nested condition @return true if there is none, or it evaluates to true 
private	TokenNameprivate	
boolean	TokenNameboolean	
testNestedCondition	TokenNameIdentifier	 test Nested Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
nestedConditionPresent	TokenNameIdentifier	 nested Condition Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
&&	TokenNameAND_AND	
ifCondition	TokenNameIdentifier	 if Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
unlessCondition	TokenNameIdentifier	 unless Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Nested conditions "	TokenNameStringLiteral	Nested conditions 
+	TokenNamePLUS	
"not permitted in conjunction with if/unless attributes"	TokenNameStringLiteral	not permitted in conjunction with if/unless attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
&&	TokenNameAND_AND	
nestedCondition	TokenNameIdentifier	 nested Condition
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test whether there is a nested condition. * @return <code>boolean</code>. */	TokenNameCOMMENT_JAVADOC	 test whether there is a nested condition. @return <code>boolean</code>. 
private	TokenNameprivate	
boolean	TokenNameboolean	
nestedConditionPresent	TokenNameIdentifier	 nested Condition Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
nestedCondition	TokenNameIdentifier	 nested Condition
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
