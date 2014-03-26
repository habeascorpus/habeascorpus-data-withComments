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
facade	TokenNameIdentifier	 facade
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
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * Helper class for facade implementations - encapsulates treatment of * explicit implementation choices, magic properties and * implementation specific command line arguments. * * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Helper class for facade implementations - encapsulates treatment of explicit implementation choices, magic properties and implementation specific command line arguments. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
{	TokenNameLBRACE	
/** * Command line arguments. */	TokenNameCOMMENT_JAVADOC	 Command line arguments. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The explicitly chosen implementation. */	TokenNameCOMMENT_JAVADOC	 The explicitly chosen implementation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userChoice	TokenNameIdentifier	 user Choice
;	TokenNameSEMICOLON	
/** * The magic property to consult. */	TokenNameCOMMENT_JAVADOC	 The magic property to consult. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
magicValue	TokenNameIdentifier	 magic Value
;	TokenNameSEMICOLON	
/** * The default value. */	TokenNameCOMMENT_JAVADOC	 The default value. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
/** * User specified path used as classpath when loading the implementation. */	TokenNameCOMMENT_JAVADOC	 User specified path used as classpath when loading the implementation. 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
implementationClasspath	TokenNameIdentifier	 implementation Classpath
;	TokenNameSEMICOLON	
/** * @param defaultValue The default value for the implementation. * Must not be null. */	TokenNameCOMMENT_JAVADOC	 @param defaultValue The default value for the implementation. Must not be null. 
public	TokenNamepublic	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param defaultValue The default value for the implementation. * Must not be null. * @param magicValue the value of a magic property that may hold a user. * choice. May be null. */	TokenNameCOMMENT_JAVADOC	 @param defaultValue The default value for the implementation. Must not be null. @param magicValue the value of a magic property that may hold a user. choice. May be null. 
public	TokenNamepublic	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
magicValue	TokenNameIdentifier	 magic Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
magicValue	TokenNameIdentifier	 magic Value
=	TokenNameEQUAL	
magicValue	TokenNameIdentifier	 magic Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to set the value of the magic property. * @param magicValue the value of a magic property that may hold a user. */	TokenNameCOMMENT_JAVADOC	 Used to set the value of the magic property. @param magicValue the value of a magic property that may hold a user. 
public	TokenNamepublic	
void	TokenNamevoid	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
magicValue	TokenNameIdentifier	 magic Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
magicValue	TokenNameIdentifier	 magic Value
=	TokenNameEQUAL	
magicValue	TokenNameIdentifier	 magic Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used for explicit user choices. * @param userChoice the explicitly chosen implementation. */	TokenNameCOMMENT_JAVADOC	 Used for explicit user choices. @param userChoice the explicitly chosen implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userChoice	TokenNameIdentifier	 user Choice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userChoice	TokenNameIdentifier	 user Choice
=	TokenNameEQUAL	
userChoice	TokenNameIdentifier	 user Choice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the implementation. * @return the implementation. */	TokenNameCOMMENT_JAVADOC	 Retrieves the implementation. @return the implementation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userChoice	TokenNameIdentifier	 user Choice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
userChoice	TokenNameIdentifier	 user Choice
:	TokenNameCOLON	
(	TokenNameLPAREN	
magicValue	TokenNameIdentifier	 magic Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
magicValue	TokenNameIdentifier	 magic Value
:	TokenNameCOLON	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the explicit user choice. * @return the explicit user choice. */	TokenNameCOMMENT_JAVADOC	 Retrieves the explicit user choice. @return the explicit user choice. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExplicitChoice	TokenNameIdentifier	 get Explicit Choice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userChoice	TokenNameIdentifier	 user Choice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Command line argument. * @param arg an argument to add. */	TokenNameCOMMENT_JAVADOC	 Command line argument. @param arg an argument to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addImplementationArgument	TokenNameIdentifier	 add Implementation Argument
(	TokenNameLPAREN	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the command line arguments enabled for the current * facade implementation. * @return an array of command line arguements. */	TokenNameCOMMENT_JAVADOC	 Retrieves the command line arguments enabled for the current facade implementation. @return an array of command line arguements. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArgs	TokenNameIdentifier	 get Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
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
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the implementation has been chosen by the user * (either via a magic property or explicitly. * @return true if magic or user choice has be set. * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Tests whether the implementation has been chosen by the user (either via a magic property or explicitly. @return true if magic or user choice has be set. @since Ant 1.5.2 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userChoice	TokenNameIdentifier	 user Choice
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
magicValue	TokenNameIdentifier	 magic Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The classpath to use when loading the implementation. * * @param project the current project * @return a Path instance that may be appended to * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The classpath to use when loading the implementation. * @param project the current project @return a Path instance that may be appended to @since Ant 1.8.0 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getImplementationClasspath	TokenNameIdentifier	 get Implementation Classpath
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
implementationClasspath	TokenNameIdentifier	 implementation Classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
implementationClasspath	TokenNameIdentifier	 implementation Classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
implementationClasspath	TokenNameIdentifier	 implementation Classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
