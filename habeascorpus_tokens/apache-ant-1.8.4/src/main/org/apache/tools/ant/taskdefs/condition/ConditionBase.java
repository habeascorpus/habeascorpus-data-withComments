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
condition	TokenNameIdentifier	 condition
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
Available	TokenNameIdentifier	 Available
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
Checksum	TokenNameIdentifier	 Checksum
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
UpToDate	TokenNameIdentifier	 Up To Date
;	TokenNameSEMICOLON	
/** * Baseclass for the &lt;condition&gt; task as well as several * conditions - ensures that the types of conditions inside the task * and the "container" conditions are in sync. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Baseclass for the &lt;condition&gt; task as well as several conditions - ensures that the types of conditions inside the task and the "container" conditions are in sync. * @since Ant 1.4 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ConditionBase	TokenNameIdentifier	 Condition Base
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
{	TokenNameLBRACE	
/** * name of the component */	TokenNameCOMMENT_JAVADOC	 name of the component 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
=	TokenNameEQUAL	
"condition"	TokenNameStringLiteral	condition
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
conditions	TokenNameIdentifier	 conditions
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Simple constructor. */	TokenNameCOMMENT_JAVADOC	 Simple constructor. 
protected	TokenNameprotected	
ConditionBase	TokenNameIdentifier	 Condition Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taskName	TokenNameIdentifier	 task Name
=	TokenNameEQUAL	
"component"	TokenNameStringLiteral	component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor that takes the name of the task in the task name. * @param taskName the name of the task. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Constructor that takes the name of the task in the task name. @param taskName the name of the task. @since Ant 1.7 
protected	TokenNameprotected	
ConditionBase	TokenNameIdentifier	 Condition Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taskName	TokenNameIdentifier	 task Name
=	TokenNameEQUAL	
taskName	TokenNameIdentifier	 task Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Count the conditions. * * @return the number of conditions in the container * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Count the conditions. * @return the number of conditions in the container @since 1.1 
protected	TokenNameprotected	
int	TokenNameint	
countConditions	TokenNameIdentifier	 count Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate through all conditions. * * @return an enumeration to use for iteration * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Iterate through all conditions. * @return an enumeration to use for iteration @since 1.1 
protected	TokenNameprotected	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
getConditions	TokenNameIdentifier	 get Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name to use in logging messages. * * @param name The name to use in logging messages. * Should not be <code>null</code>. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Sets the name to use in logging messages. * @param name The name to use in logging messages. Should not be <code>null</code>. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
taskName	TokenNameIdentifier	 task Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name to use in logging messages. * * @return the name to use in logging messages. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Returns the name to use in logging messages. * @return the name to use in logging messages. @since Ant 1.7 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taskName	TokenNameIdentifier	 task Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;available&gt; condition. * @param a an available condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;available&gt; condition. @param a an available condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addAvailable	TokenNameIdentifier	 add Available
(	TokenNameLPAREN	
Available	TokenNameIdentifier	 Available
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;checksum&gt; condition. * * @param c a Checksum condition * @since 1.4, Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;checksum&gt; condition. * @param c a Checksum condition @since 1.4, Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addChecksum	TokenNameIdentifier	 add Checksum
(	TokenNameLPAREN	
Checksum	TokenNameIdentifier	 Checksum
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;uptodate&gt; condition. * * @param u an UpToDate condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;uptodate&gt; condition. * @param u an UpToDate condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addUptodate	TokenNameIdentifier	 add Uptodate
(	TokenNameLPAREN	
UpToDate	TokenNameIdentifier	 Up To Date
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;not&gt; condition "container". * * @param n a Not condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;not&gt; condition "container". * @param n a Not condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addNot	TokenNameIdentifier	 add Not
(	TokenNameLPAREN	
Not	TokenNameIdentifier	 Not
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;and&gt; condition "container". * * @param a an And condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;and&gt; condition "container". * @param a an And condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addAnd	TokenNameIdentifier	 add And
(	TokenNameLPAREN	
And	TokenNameIdentifier	 And
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;or&gt; condition "container". * * @param o an Or condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;or&gt; condition "container". * @param o an Or condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addOr	TokenNameIdentifier	 add Or
(	TokenNameLPAREN	
Or	TokenNameIdentifier	 Or
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;equals&gt; condition. * * @param e an Equals condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;equals&gt; condition. * @param e an Equals condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addEquals	TokenNameIdentifier	 add Equals
(	TokenNameLPAREN	
Equals	TokenNameIdentifier	 Equals
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;os&gt; condition. * * @param o an Os condition * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;os&gt; condition. * @param o an Os condition @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
addOs	TokenNameIdentifier	 add Os
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;isset&gt; condition. * * @param i an IsSet condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;isset&gt; condition. * @param i an IsSet condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addIsSet	TokenNameIdentifier	 add Is Set
(	TokenNameLPAREN	
IsSet	TokenNameIdentifier	 Is Set
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;http&gt; condition. * * @param h an Http condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;http&gt; condition. * @param h an Http condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addHttp	TokenNameIdentifier	 add Http
(	TokenNameLPAREN	
Http	TokenNameIdentifier	 Http
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a &lt;socket&gt; condition. * * @param s a Socket condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add a &lt;socket&gt; condition. * @param s a Socket condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addSocket	TokenNameIdentifier	 add Socket
(	TokenNameLPAREN	
Socket	TokenNameIdentifier	 Socket
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a &lt;filesmatch&gt; condition. * * @param test a FilesMatch condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add a &lt;filesmatch&gt; condition. * @param test a FilesMatch condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addFilesMatch	TokenNameIdentifier	 add Files Match
(	TokenNameLPAREN	
FilesMatch	TokenNameIdentifier	 Files Match
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a &lt;contains&gt; condition. * * @param test a Contains condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add a &lt;contains&gt; condition. * @param test a Contains condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addContains	TokenNameIdentifier	 add Contains
(	TokenNameLPAREN	
Contains	TokenNameIdentifier	 Contains
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a &lt;istrue&gt; condition. * * @param test an IsTrue condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add a &lt;istrue&gt; condition. * @param test an IsTrue condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addIsTrue	TokenNameIdentifier	 add Is True
(	TokenNameLPAREN	
IsTrue	TokenNameIdentifier	 Is True
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a &lt;isfalse&gt; condition. * * @param test an IsFalse condition * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Add a &lt;isfalse&gt; condition. * @param test an IsFalse condition @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
addIsFalse	TokenNameIdentifier	 add Is False
(	TokenNameLPAREN	
IsFalse	TokenNameIdentifier	 Is False
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;isreference&gt; condition. * * @param i an IsReference condition * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Add an &lt;isreference&gt; condition. * @param i an IsReference condition @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
addIsReference	TokenNameIdentifier	 add Is Reference
(	TokenNameLPAREN	
IsReference	TokenNameIdentifier	 Is Reference
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an &lt;isfileselected&gt; condition. * @param test the condition */	TokenNameCOMMENT_JAVADOC	 Add an &lt;isfileselected&gt; condition. @param test the condition 
public	TokenNamepublic	
void	TokenNamevoid	
addIsFileSelected	TokenNameIdentifier	 add Is File Selected
(	TokenNameLPAREN	
IsFileSelected	TokenNameIdentifier	 Is File Selected
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an arbitrary condition * @param c a condition * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Add an arbitrary condition @param c a condition @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Condition	TokenNameIdentifier	 Condition
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conditions	TokenNameIdentifier	 conditions
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
