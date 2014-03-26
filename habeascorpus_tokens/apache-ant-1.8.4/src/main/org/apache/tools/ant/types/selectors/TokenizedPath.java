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
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
FileUtils	TokenNameIdentifier	 File Utils
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
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
;	TokenNameSEMICOLON	
/** * Container for a path that has been split into its components. * @since 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Container for a path that has been split into its components. @since 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
{	TokenNameLBRACE	
/** * Instance that holds no tokens at all. */	TokenNameCOMMENT_JAVADOC	 Instance that holds no tokens at all. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
EMPTY_PATH	TokenNameIdentifier	 EMPTY  PATH
=	TokenNameEQUAL	
new	TokenNamenew	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Helper. */	TokenNameCOMMENT_JAVADOC	 Helper. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Helper. */	TokenNameCOMMENT_JAVADOC	 Helper. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
SYMLINK_UTILS	TokenNameIdentifier	 SYMLINK  UTILS
=	TokenNameEQUAL	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
.	TokenNameDOT	
getSymbolicLinkUtils	TokenNameIdentifier	 get Symbolic Link Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** iterations for case-sensitive scanning. */	TokenNameCOMMENT_JAVADOC	 iterations for case-sensitive scanning. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CS_SCAN_ONLY	TokenNameIdentifier	 CS  SCAN  ONLY
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** iterations for non-case-sensitive scanning. */	TokenNameCOMMENT_JAVADOC	 iterations for non-case-sensitive scanning. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CS_THEN_NON_CS	TokenNameIdentifier	 CS  THEN  NON  CS
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tokenizedPath	TokenNameIdentifier	 tokenized Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Initialize the TokenizedPath by parsing it. * @param path The path to tokenize. Must not be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Initialize the TokenizedPath by parsing it. @param path The path to tokenize. Must not be <code>null</code>. 
public	TokenNamepublic	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new path as a child of another path. * * @param parent the parent path * @param child the child, must not contain the file separator */	TokenNameCOMMENT_JAVADOC	 Creates a new path as a child of another path. * @param parent the parent path @param child the child, must not contain the file separator 
public	TokenNamepublic	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokenizedPath	TokenNameIdentifier	 tokenized Path
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
tokenizedPath	TokenNameIdentifier	 tokenized Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
tokenizedPath	TokenNameIdentifier	 tokenized Path
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tokenizedPath	TokenNameIdentifier	 tokenized Path
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
tokenizedPath	TokenNameIdentifier	 tokenized Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenizedPath	TokenNameIdentifier	 tokenized Path
[	TokenNameLBRACKET	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
tokenizedPath	TokenNameIdentifier	 tokenized Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* package */	TokenNameCOMMENT_BLOCK	 package 
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenizedPath	TokenNameIdentifier	 tokenized Path
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The original path String */	TokenNameCOMMENT_JAVADOC	 @return The original path String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The depth (or length) of a path. */	TokenNameCOMMENT_JAVADOC	 The depth (or length) of a path. 
public	TokenNamepublic	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizedPath	TokenNameIdentifier	 tokenized Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* package */	TokenNameCOMMENT_BLOCK	 package 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenizedPath	TokenNameIdentifier	 tokenized Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From <code>base</code> traverse the filesystem in order to find * a file that matches the given name. * * @param base base File (dir). * @param cs whether to scan case-sensitively. * @return File object that points to the file in question or null. */	TokenNameCOMMENT_JAVADOC	 From <code>base</code> traverse the filesystem in order to find a file that matches the given name. * @param base base File (dir). @param cs whether to scan case-sensitively. @return File object that points to the file in question or null. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
findFile	TokenNameIdentifier	 find File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
tokenizedPath	TokenNameIdentifier	 tokenized Path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isAbsolutePath	TokenNameIdentifier	 is Absolute Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
dissect	TokenNameIdentifier	 dissect
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
removeLeadingPath	TokenNameIdentifier	 remove Leading Path
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//removing base from path yields no change; path 	TokenNameCOMMENT_LINE	removing base from path yields no change; path 
//not child of base 	TokenNameCOMMENT_LINE	not child of base 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
tokenizePathAsArray	TokenNameIdentifier	 tokenize Path As Array
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
findFile	TokenNameIdentifier	 find File
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do we have to traverse a symlink when trying to reach path from * basedir? * @param base base File (dir). */	TokenNameCOMMENT_JAVADOC	 Do we have to traverse a symlink when trying to reach path from basedir? @param base base File (dir). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSymlink	TokenNameIdentifier	 is Symlink
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
base	TokenNameIdentifier	 base
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
tokenizedPath	TokenNameIdentifier	 tokenized Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
SYMLINK_UTILS	TokenNameIdentifier	 SYMLINK  UTILS
.	TokenNameDOT	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
tokenizedPath	TokenNameIdentifier	 tokenized Path
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
SYMLINK_UTILS	TokenNameIdentifier	 SYMLINK  UTILS
.	TokenNameDOT	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
tokenizedPath	TokenNameIdentifier	 tokenized Path
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
tokenizedPath	TokenNameIdentifier	 tokenized Path
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"IOException caught while checking "	TokenNameStringLiteral	IOException caught while checking 
+	TokenNamePLUS	
"for links, couldn't get canonical path!"	TokenNameStringLiteral	for links, couldn't get canonical path!
;	TokenNameSEMICOLON	
// will be caught and redirected to Ant's logging system 	TokenNameCOMMENT_LINE	will be caught and redirected to Ant's logging system 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * true if the original paths are equal. */	TokenNameCOMMENT_JAVADOC	 true if the original paths are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From <code>base</code> traverse the filesystem in order to find * a file that matches the given stack of names. * * @param base base File (dir) - must not be null. * @param pathElements array of path elements (dirs...file). * @param cs whether to scan case-sensitively. * @return File object that points to the file in question or null. */	TokenNameCOMMENT_JAVADOC	 From <code>base</code> traverse the filesystem in order to find a file that matches the given stack of names. * @param base base File (dir) - must not be null. @param pathElements array of path elements (dirs...file). @param cs whether to scan case-sensitively. @return File object that points to the file in question or null. 
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
findFile	TokenNameIdentifier	 find File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pathElements	TokenNameIdentifier	 path Elements
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
<	TokenNameLESS	
pathElements	TokenNameIdentifier	 path Elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"IO error scanning directory "	TokenNameStringLiteral	IO error scanning directory 
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matchCase	TokenNameIdentifier	 match Case
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
?	TokenNameQUESTION	
CS_SCAN_ONLY	TokenNameIdentifier	 CS  SCAN  ONLY
:	TokenNameCOLON	
CS_THEN_NON_CS	TokenNameIdentifier	 CS  THEN  NON  CS
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
matchCase	TokenNameIdentifier	 match Case
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchCase	TokenNameIdentifier	 match Case
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
?	TokenNameQUESTION	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pathElements	TokenNameIdentifier	 path Elements
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
pathElements	TokenNameIdentifier	 path Elements
[	TokenNameLBRACKET	
current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pathElements	TokenNameIdentifier	 path Elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a TokenizedPattern from the same tokens that make up * this path. */	TokenNameCOMMENT_JAVADOC	 Creates a TokenizedPattern from the same tokens that make up this path. 
public	TokenNamepublic	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
toPattern	TokenNameIdentifier	 to Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
tokenizedPath	TokenNameIdentifier	 tokenized Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
