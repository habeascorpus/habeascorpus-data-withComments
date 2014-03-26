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
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ConstantClass	TokenNameIdentifier	 Constant Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ConstantPool	TokenNameIdentifier	 Constant Pool
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
EmptyVisitor	TokenNameIdentifier	 Empty Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
JavaClass	TokenNameIdentifier	 Java Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ConstantNameAndType	TokenNameIdentifier	 Constant Name And Type
;	TokenNameSEMICOLON	
/** * A BCEL visitor implementation to collect class dependency information * */	TokenNameCOMMENT_JAVADOC	 A BCEL visitor implementation to collect class dependency information 
public	TokenNamepublic	
class	TokenNameclass	
DependencyVisitor	TokenNameIdentifier	 Dependency Visitor
extends	TokenNameextends	
EmptyVisitor	TokenNameIdentifier	 Empty Visitor
{	TokenNameLBRACE	
/** The collectd dependencies */	TokenNameCOMMENT_JAVADOC	 The collectd dependencies 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current class's constant pool - used to determine class names * from class references. */	TokenNameCOMMENT_JAVADOC	 The current class's constant pool - used to determine class names from class references. 
private	TokenNameprivate	
ConstantPool	TokenNameIdentifier	 Constant Pool
constantPool	TokenNameIdentifier	 constant Pool
;	TokenNameSEMICOLON	
/** * Get the dependencies collected by this visitor * * @return a Enumeration of classnames, being the classes upon which the * visited classes depend. */	TokenNameCOMMENT_JAVADOC	 Get the dependencies collected by this visitor * @return a Enumeration of classnames, being the classes upon which the visited classes depend. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Clear the curretn set of collected dependencies. */	TokenNameCOMMENT_JAVADOC	 Clear the curretn set of collected dependencies. 
public	TokenNamepublic	
void	TokenNamevoid	
clearDependencies	TokenNameIdentifier	 clear Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit the constant pool of a class * * @param constantPool the constant pool of the class being visited. */	TokenNameCOMMENT_JAVADOC	 Visit the constant pool of a class * @param constantPool the constant pool of the class being visited. 
public	TokenNamepublic	
void	TokenNamevoid	
visitConstantPool	TokenNameIdentifier	 visit Constant Pool
(	TokenNameLPAREN	
ConstantPool	TokenNameIdentifier	 Constant Pool
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
constantPool	TokenNameIdentifier	 constant Pool
=	TokenNameEQUAL	
constantPool	TokenNameIdentifier	 constant Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a class reference * * @param constantClass the constantClass entry for the class reference */	TokenNameCOMMENT_JAVADOC	 Visit a class reference * @param constantClass the constantClass entry for the class reference 
public	TokenNamepublic	
void	TokenNamevoid	
visitConstantClass	TokenNameIdentifier	 visit Constant Class
(	TokenNameLPAREN	
ConstantClass	TokenNameIdentifier	 Constant Class
constantClass	TokenNameIdentifier	 constant Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
constantClass	TokenNameIdentifier	 constant Class
.	TokenNameDOT	
getConstantValue	TokenNameIdentifier	 get Constant Value
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addSlashClass	TokenNameIdentifier	 add Slash Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a name and type ref * * Look for class references in this * * @param obj the name and type reference being visited. */	TokenNameCOMMENT_JAVADOC	 Visit a name and type ref * Look for class references in this * @param obj the name and type reference being visited. 
public	TokenNamepublic	
void	TokenNamevoid	
visitConstantNameAndType	TokenNameIdentifier	 visit Constant Name And Type
(	TokenNameLPAREN	
ConstantNameAndType	TokenNameIdentifier	 Constant Name And Type
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Ljava/lang/Class;"	TokenNameStringLiteral	Ljava/lang/Class;
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"class$"	TokenNameStringLiteral	class$
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"class$"	TokenNameStringLiteral	class$
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// does the class have a package structure 	TokenNameCOMMENT_LINE	does the class have a package structure 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
// check if the package structure is more than 1 level deep 	TokenNameCOMMENT_LINE	check if the package structure is more than 1 level deep 
int	TokenNameint	
index2	TokenNameIdentifier	 index2
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// class name has more than 1 package level 'com.company.Class' 	TokenNameCOMMENT_LINE	class name has more than 1 package level 'com.company.Class' 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index2	TokenNameIdentifier	 index2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// class name has only 1 package level 'package.Class' 	TokenNameCOMMENT_LINE	class name has only 1 package level 'package.Class' 
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check to see if it's an inner class 'com.company.Class$Inner' 	TokenNameCOMMENT_LINE	Check to see if it's an inner class 'com.company.Class$Inner' 
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
0x40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0x5B	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first letter of the previous segment of the class name 'Class' 	TokenNameCOMMENT_LINE	first letter of the previous segment of the class name 'Class' 
// is upper case ascii. so according to the spec it's an inner class 	TokenNameCOMMENT_LINE	is upper case ascii. so according to the spec it's an inner class 
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Add the class in dotted notation 'com.company.Class' 	TokenNameCOMMENT_LINE	Add the class in dotted notation 'com.company.Class' 
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Add a class with no package 'Class' 	TokenNameCOMMENT_LINE	Add a class with no package 'Class' 
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Visit a field of the class. * * @param field the field being visited */	TokenNameCOMMENT_JAVADOC	 Visit a field of the class. * @param field the field being visited 
public	TokenNamepublic	
void	TokenNamevoid	
visitField	TokenNameIdentifier	 visit Field
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addClasses	TokenNameIdentifier	 add Classes
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a Java class * * @param javaClass the class being visited. */	TokenNameCOMMENT_JAVADOC	 Visit a Java class * @param javaClass the class being visited. 
public	TokenNamepublic	
void	TokenNamevoid	
visitJavaClass	TokenNameIdentifier	 visit Java Class
(	TokenNameLPAREN	
JavaClass	TokenNameIdentifier	 Java Class
javaClass	TokenNameIdentifier	 java Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a method of the current class * * @param method the method being visited. */	TokenNameCOMMENT_JAVADOC	 Visit a method of the current class * @param method the method being visited. 
public	TokenNamepublic	
void	TokenNamevoid	
visitMethod	TokenNameIdentifier	 visit Method
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
signature	TokenNameIdentifier	 signature
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
signature	TokenNameIdentifier	 signature
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addClasses	TokenNameIdentifier	 add Classes
(	TokenNameLPAREN	
signature	TokenNameIdentifier	 signature
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addClasses	TokenNameIdentifier	 add Classes
(	TokenNameLPAREN	
signature	TokenNameIdentifier	 signature
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a classname to the list of dependency classes * * @param classname the class to be added to the list of dependencies. */	TokenNameCOMMENT_JAVADOC	 Add a classname to the list of dependency classes * @param classname the class to be added to the list of dependencies. 
void	TokenNamevoid	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add all the classes from a descriptor string. * * @param string the descriptor string, being descriptors separated by * ';' characters. */	TokenNameCOMMENT_JAVADOC	 Add all the classes from a descriptor string. * @param string the descriptor string, being descriptors separated by ';' characters. 
private	TokenNameprivate	
void	TokenNamevoid	
addClasses	TokenNameIdentifier	 add Classes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
descriptor	TokenNameIdentifier	 descriptor
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'L'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addSlashClass	TokenNameIdentifier	 add Slash Class
(	TokenNameLPAREN	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a class name in slash format * (for example org/apache/tools/ant/Main). * * @param classname the class name in slash format */	TokenNameCOMMENT_JAVADOC	 Adds a class name in slash format (for example org/apache/tools/ant/Main). * @param classname the class name in slash format 
private	TokenNameprivate	
void	TokenNamevoid	
addSlashClass	TokenNameIdentifier	 add Slash Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
