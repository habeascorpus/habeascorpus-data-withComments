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
File	TokenNameIdentifier	 File
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Commandline objects help handling command lines specifying processes to * execute. * * The class can be used to define a command line as nested elements or as a * helper to define a command line by an application. * <p> * <code> * &lt;someelement&gt;<br> * &nbsp;&nbsp;&lt;acommandline executable="/executable/to/run"&gt;<br> * &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument value="argument 1" /&gt;<br> * &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument line="argument_1 argument_2 argument_3" /&gt;<br> * &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument value="argument 4" /&gt;<br> * &nbsp;&nbsp;&lt;/acommandline&gt;<br> * &lt;/someelement&gt;<br> * </code> * The element <code>someelement</code> must provide a method * <code>createAcommandline</code> which returns an instance of this class. * */	TokenNameCOMMENT_JAVADOC	 Commandline objects help handling command lines specifying processes to execute. * The class can be used to define a command line as nested elements or as a helper to define a command line by an application. <p> <code> &lt;someelement&gt;<br> &nbsp;&nbsp;&lt;acommandline executable="/executable/to/run"&gt;<br> &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument value="argument 1" /&gt;<br> &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument line="argument_1 argument_2 argument_3" /&gt;<br> &nbsp;&nbsp;&nbsp;&nbsp;&lt;argument value="argument 4" /&gt;<br> &nbsp;&nbsp;&lt;/acommandline&gt;<br> &lt;/someelement&gt;<br> </code> The element <code>someelement</code> must provide a method <code>createAcommandline</code> which returns an instance of this class. 
public	TokenNamepublic	
class	TokenNameclass	
Commandline	TokenNameIdentifier	 Commandline
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** win9x uses a (shudder) bat file (antRun.bat) for executing commands */	TokenNameCOMMENT_JAVADOC	 win9x uses a (shudder) bat file (antRun.bat) for executing commands 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
IS_WIN_9X	TokenNameIdentifier	 IS  WIN 9 X
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"win9x"	TokenNameStringLiteral	win9x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The arguments of the command */	TokenNameCOMMENT_JAVADOC	 The arguments of the command 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
arguments	TokenNameIdentifier	 arguments
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * the program to execute */	TokenNameCOMMENT_JAVADOC	 the program to execute 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DISCLAIMER	TokenNameIdentifier	 DISCLAIMER
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"The ' characters around the executable and arguments are"	TokenNameStringLiteral	The ' characters around the executable and arguments are
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"not part of the command."	TokenNameStringLiteral	not part of the command.
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
;	TokenNameSEMICOLON	
/** * Create a command line from a string. * @param toProcess the line: the first element becomes the executable, the rest * the arguments. */	TokenNameCOMMENT_JAVADOC	 Create a command line from a string. @param toProcess the line: the first element becomes the executable, the rest the arguments. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toProcess	TokenNameIdentifier	 to Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
translateCommandline	TokenNameIdentifier	 translate Commandline
(	TokenNameLPAREN	
toProcess	TokenNameIdentifier	 to Process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an empty command line. */	TokenNameCOMMENT_JAVADOC	 Create an empty command line. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used for nested xml command line definitions. */	TokenNameCOMMENT_JAVADOC	 Used for nested xml command line definitions. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Argument	TokenNameIdentifier	 Argument
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Set a single commandline argument. * * @param value a single commandline argument. */	TokenNameCOMMENT_JAVADOC	 Set a single commandline argument. * @param value a single commandline argument. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the line to split into several commandline arguments. * * @param line line to split into several commandline arguments. */	TokenNameCOMMENT_JAVADOC	 Set the line to split into several commandline arguments. * @param line line to split into several commandline arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
translateCommandline	TokenNameIdentifier	 translate Commandline
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a single commandline argument and treats it like a * PATH--ensuring the right separator for the local platform * is used. * * @param value a single commandline argument. */	TokenNameCOMMENT_JAVADOC	 Set a single commandline argument and treats it like a PATH--ensuring the right separator for the local platform is used. * @param value a single commandline argument. 
public	TokenNamepublic	
void	TokenNamevoid	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a single commandline argument from a reference to a * path--ensuring the right separator for the local platform * is used. * * @param value a single commandline argument. */	TokenNameCOMMENT_JAVADOC	 Set a single commandline argument from a reference to a path--ensuring the right separator for the local platform is used. * @param value a single commandline argument. 
public	TokenNamepublic	
void	TokenNamevoid	
setPathref	TokenNameIdentifier	 set Pathref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a single commandline argument to the absolute filename * of the given file. * * @param value a single commandline argument. */	TokenNameCOMMENT_JAVADOC	 Set a single commandline argument to the absolute filename of the given file. * @param value a single commandline argument. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the prefix to be placed in front of every part of the * argument. * * @param prefix fixed prefix string. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the prefix to be placed in front of every part of the argument. * @param prefix fixed prefix string. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the suffix to be placed at the end of every part of the * argument. * * @param suffix fixed suffix string. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the suffix to be placed at the end of every part of the argument. * @param suffix fixed suffix string. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
suffix	TokenNameIdentifier	 suffix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the constituent parts of this Argument. * @return an array of strings. */	TokenNameCOMMENT_JAVADOC	 Return the constituent parts of this Argument. @return an array of strings. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parts	TokenNameIdentifier	 parts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fullParts	TokenNameIdentifier	 full Parts
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
fullParts	TokenNameIdentifier	 full Parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullParts	TokenNameIdentifier	 full Parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fullParts	TokenNameIdentifier	 full Parts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Class to keep track of the position of an Argument. * * <p>This class is there to support the srcfile and targetfile * elements of &lt;apply&gt;.</p> */	TokenNameCOMMENT_JAVADOC	 Class to keep track of the position of an Argument. * <p>This class is there to support the srcfile and targetfile elements of &lt;apply&gt;.</p> 
public	TokenNamepublic	
class	TokenNameclass	
Marker	TokenNameIdentifier	 Marker
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
realPos	TokenNameIdentifier	 real Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Construct a marker for the specified position. * @param position the position to mark. */	TokenNameCOMMENT_JAVADOC	 Construct a marker for the specified position. @param position the position to mark. 
Marker	TokenNameIdentifier	 Marker
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of arguments that preceded this marker. * * <p>The name of the executable -- if set -- is counted as the * first argument.</p> * @return the position of this marker. */	TokenNameCOMMENT_JAVADOC	 Return the number of arguments that preceded this marker. * <p>The name of the executable -- if set -- is counted as the first argument.</p> @return the position of this marker. 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realPos	TokenNameIdentifier	 real Pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realPos	TokenNameIdentifier	 real Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
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
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Argument	TokenNameIdentifier	 Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Argument	TokenNameIdentifier	 Argument
)	TokenNameRPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
realPos	TokenNameIdentifier	 real Pos
+=	TokenNamePLUS_EQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
realPos	TokenNameIdentifier	 real Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the prefix to be placed in front of the inserted argument. * * @param prefix fixed prefix string. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the prefix to be placed in front of the inserted argument. * @param prefix fixed prefix string. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the prefix to be placed in front of the inserted argument. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get the prefix to be placed in front of the inserted argument. * @since Ant 1.8.0 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the suffix to be placed at the end of the inserted argument. * * @param suffix fixed suffix string. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the suffix to be placed at the end of the inserted argument. * @param suffix fixed suffix string. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
suffix	TokenNameIdentifier	 suffix
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the suffix to be placed at the end of the inserted argument. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get the suffix to be placed at the end of the inserted argument. * @since Ant 1.8.0 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSuffix	TokenNameIdentifier	 get Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an argument object. * * <p>Each commandline object has at most one instance of the * argument class. This method calls * <code>this.createArgument(false)</code>.</p> * * @see #createArgument(boolean) * @return the argument object. */	TokenNameCOMMENT_JAVADOC	 Create an argument object. * <p>Each commandline object has at most one instance of the argument class. This method calls <code>this.createArgument(false)</code>.</p> * @see #createArgument(boolean) @return the argument object. 
public	TokenNamepublic	
Argument	TokenNameIdentifier	 Argument
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an argument object and add it to our list of args. * * <p>Each commandline object has at most one instance of the * argument class.</p> * * @param insertAtStart if true, the argument is inserted at the * beginning of the list of args, otherwise it is appended. * @return an argument to be configured */	TokenNameCOMMENT_JAVADOC	 Create an argument object and add it to our list of args. * <p>Each commandline object has at most one instance of the argument class.</p> * @param insertAtStart if true, the argument is inserted at the beginning of the list of args, otherwise it is appended. @return an argument to be configured 
public	TokenNamepublic	
Argument	TokenNameIdentifier	 Argument
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
boolean	TokenNameboolean	
insertAtStart	TokenNameIdentifier	 insert At Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Argument	TokenNameIdentifier	 Argument
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
new	TokenNamenew	
Argument	TokenNameIdentifier	 Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insertAtStart	TokenNameIdentifier	 insert At Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
argument	TokenNameIdentifier	 argument
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the executable to run. All file separators in the string * are converted to the platform specific value. * @param executable the String executable name. */	TokenNameCOMMENT_JAVADOC	 Set the executable to run. All file separators in the string are converted to the platform specific value. @param executable the String executable name. 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executable	TokenNameIdentifier	 executable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
executable	TokenNameIdentifier	 executable
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
executable	TokenNameIdentifier	 executable
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the executable. * @return the program to run--null if not yet set. */	TokenNameCOMMENT_JAVADOC	 Get the executable. @return the program to run--null if not yet set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executable	TokenNameIdentifier	 executable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the arguments to the existing command. * @param line an array of arguments to append. */	TokenNameCOMMENT_JAVADOC	 Append the arguments to the existing command. @param line an array of arguments to append. 
public	TokenNamepublic	
void	TokenNamevoid	
addArguments	TokenNameIdentifier	 add Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
line	TokenNameIdentifier	 line
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
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the executable and all defined arguments. * @return the commandline as an array of strings. */	TokenNameCOMMENT_JAVADOC	 Return the executable and all defined arguments. @return the commandline as an array of strings. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
commands	TokenNameIdentifier	 commands
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
commands	TokenNameIdentifier	 commands
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCommandToList	TokenNameIdentifier	 add Command To List
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
commands	TokenNameIdentifier	 commands
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
commands	TokenNameIdentifier	 commands
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the entire command, including (optional) executable to a list. * @param list the list to add to. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Add the entire command, including (optional) executable to a list. @param list the list to add to. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
addCommandToList	TokenNameIdentifier	 add Command To List
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addArgumentsToList	TokenNameIdentifier	 add Arguments To List
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns all arguments defined by <code>addLine</code>, * <code>addValue</code> or the argument object. * @return the arguments as an array of strings. */	TokenNameCOMMENT_JAVADOC	 Returns all arguments defined by <code>addLine</code>, <code>addValue</code> or the argument object. @return the arguments as an array of strings. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArgumentsToList	TokenNameIdentifier	 add Arguments To List
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append all the arguments to the tail of a supplied list. * @param list the list of arguments. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Append all the arguments to the tail of a supplied list. @param list the list of arguments. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
addArgumentsToList	TokenNameIdentifier	 add Arguments To List
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Argument	TokenNameIdentifier	 Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Argument	TokenNameIdentifier	 Argument
)	TokenNameRPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the command line as a string. * @return the command line. */	TokenNameCOMMENT_JAVADOC	 Return the command line as a string. @return the command line. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put quotes around the given String if necessary. * * <p>If the argument doesn't include spaces or quotes, return it * as is. If it contains double quotes, use single quotes - else * surround the argument by double quotes.</p> * @param argument the argument to quote if necessary. * @return the quoted argument. * @exception BuildException if the argument contains both, single * and double quotes. */	TokenNameCOMMENT_JAVADOC	 Put quotes around the given String if necessary. * <p>If the argument doesn't include spaces or quotes, return it as is. If it contains double quotes, use single quotes - else surround the argument by double quotes.</p> @param argument the argument to quote if necessary. @return the quoted argument. @exception BuildException if the argument contains both, single and double quotes. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
quoteArgument	TokenNameIdentifier	 quote Argument
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Can't handle single and double"	TokenNameStringLiteral	Can't handle single and double
+	TokenNamePLUS	
" quotes in same argument"	TokenNameStringLiteral	 quotes in same argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
// WIN9x uses a bat file for executing commands 	TokenNameCOMMENT_LINE	WIN9x uses a bat file for executing commands 
||	TokenNameOR_OR	
(	TokenNameLPAREN	
IS_WIN_9X	TokenNameIdentifier	 IS  WIN 9 X
&&	TokenNameAND_AND	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
'\"'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
'\"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
argument	TokenNameIdentifier	 argument
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Quote the parts of the given array in way that makes them * usable as command line arguments. * @param line the list of arguments to quote. * @return empty string for null or no command, else every argument split * by spaces and quoted by quoting rules. */	TokenNameCOMMENT_JAVADOC	 Quote the parts of the given array in way that makes them usable as command line arguments. @param line the list of arguments to quote. @return empty string for null or no command, else every argument split by spaces and quoted by quoting rules. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty path return empty string 	TokenNameCOMMENT_LINE	empty path return empty string 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// path containing one or more elements 	TokenNameCOMMENT_LINE	path containing one or more elements 
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
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
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
quoteArgument	TokenNameIdentifier	 quote Argument
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Crack a command line. * @param toProcess the command line to process. * @return the command line broken into strings. * An empty or null toProcess parameter results in a zero sized array. */	TokenNameCOMMENT_JAVADOC	 Crack a command line. @param toProcess the command line to process. @return the command line broken into strings. An empty or null toProcess parameter results in a zero sized array. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
translateCommandline	TokenNameIdentifier	 translate Commandline
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toProcess	TokenNameIdentifier	 to Process
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toProcess	TokenNameIdentifier	 to Process
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
toProcess	TokenNameIdentifier	 to Process
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no command? no string 	TokenNameCOMMENT_LINE	no command? no string 
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse with a simple finite state machine 	TokenNameCOMMENT_LINE	parse with a simple finite state machine 
final	TokenNamefinal	
int	TokenNameint	
normal	TokenNameIdentifier	 normal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
inQuote	TokenNameIdentifier	 in Quote
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
inDoubleQuote	TokenNameIdentifier	 in Double Quote
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
normal	TokenNameIdentifier	 normal
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
toProcess	TokenNameIdentifier	 to Process
,	TokenNameCOMMA	
""' "	TokenNameStringLiteral	"' 
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
=	TokenNameEQUAL	
false	TokenNamefalse	
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
String	TokenNameIdentifier	 String
nextTok	TokenNameIdentifier	 next Tok
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
inQuote	TokenNameIdentifier	 in Quote
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
normal	TokenNameIdentifier	 normal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
inDoubleQuote	TokenNameIdentifier	 in Double Quote
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
normal	TokenNameIdentifier	 normal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
inQuote	TokenNameIdentifier	 in Quote
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
inDoubleQuote	TokenNameIdentifier	 in Double Quote
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastTokenHasBeenQuoted	TokenNameIdentifier	 last Token Has Been Quoted
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
inQuote	TokenNameIdentifier	 in Quote
||	TokenNameOR_OR	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
inDoubleQuote	TokenNameIdentifier	 in Double Quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"unbalanced quotes in "	TokenNameStringLiteral	unbalanced quotes in 
+	TokenNamePLUS	
toProcess	TokenNameIdentifier	 to Process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Size operator. This actually creates the command line, so it is not * a zero cost operation. * @return number of elements in the command, including the executable. */	TokenNameCOMMENT_JAVADOC	 Size operator. This actually creates the command line, so it is not a zero cost operation. @return number of elements in the command, including the executable. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generate a deep clone of the contained object. * @return a clone of the contained object */	TokenNameCOMMENT_JAVADOC	 Generate a deep clone of the contained object. @return a clone of the contained object 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
arguments	TokenNameIdentifier	 arguments
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
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
/** * Clear out the whole command line. */	TokenNameCOMMENT_JAVADOC	 Clear out the whole command line. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear out the arguments but leave the executable in place for * another operation. */	TokenNameCOMMENT_JAVADOC	 Clear out the arguments but leave the executable in place for another operation. 
public	TokenNamepublic	
void	TokenNamevoid	
clearArgs	TokenNameIdentifier	 clear Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a marker. * * <p>This marker can be used to locate a position on the * commandline--to insert something for example--when all * parameters have been set.</p> * @return a marker */	TokenNameCOMMENT_JAVADOC	 Return a marker. * <p>This marker can be used to locate a position on the commandline--to insert something for example--when all parameters have been set.</p> @return a marker 
public	TokenNamepublic	
Marker	TokenNameIdentifier	 Marker
createMarker	TokenNameIdentifier	 create Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Marker	TokenNameIdentifier	 Marker
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the command and arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @return a string that describes the command and arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the command and arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @return a string that describes the command and arguments. @since Ant 1.5 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @return a string that describes the arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @return a string that describes the arguments. @since Ant 1.5 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the command and arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @param line the Commandline to describe. * @return a string that describes the command and arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the command and arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @param line the Commandline to describe. @return a string that describes the command and arguments. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @param line the Commandline whose arguments to describe. * @return a string that describes the arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @param line the Commandline whose arguments to describe. @return a string that describes the arguments. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the command and arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * * <p>This method assumes that the first entry in the array is the * executable to run.</p> * @param args the command line to describe as an array of strings * @return a string that describes the command and arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the command and arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. * <p>This method assumes that the first entry in the array is the executable to run.</p> @param args the command line to describe as an array of strings @return a string that describes the command and arguments. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Executing '"	TokenNameStringLiteral	Executing '
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" with "	TokenNameStringLiteral	 with 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
DISCLAIMER	TokenNameIdentifier	 DISCLAIMER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @param args the command line to describe as an array of strings. * @return a string that describes the arguments. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @param args the command line to describe as an array of strings. @return a string that describes the arguments. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * * @param args the command line to describe as an array of strings. * @param offset ignore entries before this index. * @return a string that describes the arguments * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. * @param args the command line to describe as an array of strings. @param offset ignore entries before this index. @return a string that describes the arguments * @since Ant 1.5 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"argument"	TokenNameStringLiteral	argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
DISCLAIMER	TokenNameIdentifier	 DISCLAIMER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an iterator to the arguments list. * @since Ant 1.7 * @return an Iterator. */	TokenNameCOMMENT_JAVADOC	 Get an iterator to the arguments list. @since Ant 1.7 @return an Iterator. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
