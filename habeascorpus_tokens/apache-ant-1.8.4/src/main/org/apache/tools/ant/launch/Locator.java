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
launch	TokenNameIdentifier	 launch
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilenameFilter	TokenNameIdentifier	 Filename Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
// CheckStyle:LineLengthCheck OFF - urls are long! 	TokenNameCOMMENT_LINE	CheckStyle:LineLengthCheck OFF - urls are long! 
/** * The Locator is a utility class which is used to find certain items * in the environment. * * It is used at boot time in the launcher, and cannot make use of any of Ant's other classes. * * This is a surprisingly brittle piece of code, and has had lots of bugs filed against it. * {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=42275">running ant off a network share can cause Ant to fail</a>} * {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=8031">use File.toURI().toURL().toExternalForm()</a>} * {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=42222">Locator implementation not encoding URI strings properly: spaces in paths</a>} * It also breaks Eclipse 3.3 Betas * {@link <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=183283">Exception if installation path has spaces</a>} * * Be very careful when making changes to this class, as a break will upset a lot of people. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 The Locator is a utility class which is used to find certain items in the environment. * It is used at boot time in the launcher, and cannot make use of any of Ant's other classes. * This is a surprisingly brittle piece of code, and has had lots of bugs filed against it. {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=42275">running ant off a network share can cause Ant to fail</a>} {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=8031">use File.toURI().toURL().toExternalForm()</a>} {@link <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=42222">Locator implementation not encoding URI strings properly: spaces in paths</a>} It also breaks Eclipse 3.3 Betas {@link <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=183283">Exception if installation path has spaces</a>} * Be very careful when making changes to this class, as a break will upset a lot of people. @since Ant 1.6 
// CheckStyle:LineLengthCheck ON - urls are long! 	TokenNameCOMMENT_LINE	CheckStyle:LineLengthCheck ON - urls are long! 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Locator	TokenNameIdentifier	 Locator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NIBBLE	TokenNameIdentifier	 NIBBLE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NIBBLE_MASK	TokenNameIdentifier	 NIBBLE  MASK
=	TokenNameEQUAL	
0xF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ASCII_SIZE	TokenNameIdentifier	 ASCII  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BYTE_SIZE	TokenNameIdentifier	 BYTE  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD	TokenNameIdentifier	 WORD
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SPACE	TokenNameIdentifier	 SPACE
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEL	TokenNameIdentifier	 DEL
=	TokenNameEQUAL	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * encoding used to represent URIs */	TokenNameCOMMENT_JAVADOC	 encoding used to represent URIs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_ENCODING	TokenNameIdentifier	 URI  ENCODING
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
// stolen from org.apache.xerces.impl.XMLEntityManager#getUserDir() 	TokenNameCOMMENT_LINE	stolen from org.apache.xerces.impl.XMLEntityManager#getUserDir() 
// of the Xerces-J team 	TokenNameCOMMENT_LINE	of the Xerces-J team 
// which ASCII characters need to be escaped 	TokenNameCOMMENT_LINE	which ASCII characters need to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
ASCII_SIZE	TokenNameIdentifier	 ASCII  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the first hex character if a character needs to be escaped 	TokenNameCOMMENT_LINE	the first hex character if a character needs to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ASCII_SIZE	TokenNameIdentifier	 ASCII  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the second hex character if a character needs to be escaped 	TokenNameCOMMENT_LINE	the second hex character if a character needs to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ASCII_SIZE	TokenNameIdentifier	 ASCII  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gHexChs	TokenNameIdentifier	 g Hex Chs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'2'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'3'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'4'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'5'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'6'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'7'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'8'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'E'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Error string used when an invalid uri is seen */	TokenNameCOMMENT_JAVADOC	 Error string used when an invalid uri is seen 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NOT_FILE_URI	TokenNameIdentifier	 ERROR  NOT  FILE  URI
=	TokenNameEQUAL	
"Can only handle valid file: URIs, not "	TokenNameStringLiteral	Can only handle valid file: URIs, not 
;	TokenNameSEMICOLON	
// initialize the above 3 arrays 	TokenNameCOMMENT_LINE	initialize the above 3 arrays 
static	TokenNamestatic	
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
SPACE	TokenNameIdentifier	 SPACE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
NIBBLE	TokenNameIdentifier	 NIBBLE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
&	TokenNameAND	
NIBBLE_MASK	TokenNameIdentifier	 NIBBLE  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
DEL	TokenNameIdentifier	 DEL
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
DEL	TokenNameIdentifier	 DEL
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
DEL	TokenNameIdentifier	 DEL
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'F'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escChs	TokenNameIdentifier	 esc Chs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'<'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'>'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'#'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'%'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'"'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'^'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'~'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'['	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
']'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'`'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
escChs	TokenNameIdentifier	 esc Chs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
escChs	TokenNameIdentifier	 esc Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
NIBBLE	TokenNameIdentifier	 NIBBLE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
NIBBLE_MASK	TokenNameIdentifier	 NIBBLE  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Not instantiable */	TokenNameCOMMENT_JAVADOC	 Not instantiable 
private	TokenNameprivate	
Locator	TokenNameIdentifier	 Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Find the directory or jar file the class has been loaded from. * * @param c the class whose location is required. * @return the file or jar with the class or null if we cannot * determine the location. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Find the directory or jar file the class has been loaded from. * @param c the class whose location is required. @return the file or jar with the class or null if we cannot determine the location. * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getClassSource	TokenNameIdentifier	 get Class Source
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classResource	TokenNameIdentifier	 class Resource
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classResource	TokenNameIdentifier	 class Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the directory or jar a given resource has been loaded from. * * @param c the classloader to be consulted for the source. * @param resource the resource whose location is required. * * @return the file with the resource source or null if * we cannot determine the location. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Find the directory or jar a given resource has been loaded from. * @param c the classloader to be consulted for the source. @param resource the resource whose location is required. * @return the file with the resource source or null if we cannot determine the location. * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getResourceSource	TokenNameIdentifier	 get Resource Source
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Locator	TokenNameIdentifier	 Locator
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResource	TokenNameIdentifier	 get System Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"jar:file:"	TokenNameStringLiteral	jar:file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fromJarURI	TokenNameIdentifier	 from Jar URI
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dirName	TokenNameIdentifier	 dir Name
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tail	TokenNameIdentifier	 tail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//unable to determine the URI for reasons unknown. 	TokenNameCOMMENT_LINE	unable to determine the URI for reasons unknown. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a file path from a <code>file:</code> URI. * * <p>Will be an absolute path if the given URI is absolute.</p> * * <p>Prior to Java 1.4,<!-- XXX is JDK version actually relevant? --> * swallows '%' that are not followed by two characters.</p> * * See <a href="http://www.w3.org/TR/xml11/#dt-sysid">dt-sysid</a> * which makes some mention of how * characters not supported by URI Reference syntax should be escaped. * * @param uri the URI designating a file in the local filesystem. * @return the local file system path for the file. * @throws IllegalArgumentException if the URI is malformed or not a legal file: URL * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Constructs a file path from a <code>file:</code> URI. * <p>Will be an absolute path if the given URI is absolute.</p> * <p>Prior to Java 1.4,<!-- XXX is JDK version actually relevant? --> swallows '%' that are not followed by two characters.</p> * See <a href="http://www.w3.org/TR/xml11/#dt-sysid">dt-sysid</a> which makes some mention of how characters not supported by URI Reference syntax should be escaped. * @param uri the URI designating a file in the local filesystem. @return the local file system path for the file. @throws IllegalArgumentException if the URI is malformed or not a legal file: URL @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fromURIJava13	TokenNameIdentifier	 from URI Java13
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// #buzilla8031: first try Java 1.4. 	TokenNameCOMMENT_LINE	#buzilla8031: first try Java 1.4. 
// XXX should use java.net.URI now that we can rely on 1.4... 	TokenNameCOMMENT_LINE	XXX should use java.net.URI now that we can rely on 1.4... 
// but check for UNC-related regressions, e.g. #42275 	TokenNameCOMMENT_LINE	but check for UNC-related regressions, e.g. #42275 
// (and remember that \\server\share\file -> file:////server/share/file 	TokenNameCOMMENT_LINE	(and remember that \\server\share\file -> file:////server/share/file 
// rather than -> file://server/share/file as it should; 	TokenNameCOMMENT_LINE	rather than -> file://server/share/file as it should; 
// fixed only in JDK 7's java.nio.file.Path.toUri) 	TokenNameCOMMENT_LINE	fixed only in JDK 7's java.nio.file.Path.toUri) 
// return fromUriJava14(uri); 	TokenNameCOMMENT_LINE	return fromUriJava14(uri); 
}	TokenNameRBRACE	
/** * Java1.4+ code to extract the path from the URI. * @param uri * @return null if a conversion was not possible */	TokenNameCOMMENT_JAVADOC	 Java1.4+ code to extract the path from the URI. @param uri @return null if a conversion was not possible 
/* currently unused: private static String fromUriJava14(String uri) { // Also check for properly formed URIs. Ant formerly recommended using // nonsense URIs such as "file:./foo.xml" in XML includes. You shouldn't // do that (just "foo.xml" is correct) but for compatibility we special-case // things when the path is not absolute, and fall back to the old parsing behavior. if (uri.startsWith("file:/")) { try { File f = new File(URI.create(encodeURI(uri))); //bug #42227 forgot to decode before returning return decodeUri(f.getAbsolutePath()); } catch (IllegalArgumentException e) { // Bad URI, pass this on. // no, this is downgraded to a warning after various // JRE bugs surfaced. Hand off // to our built in code on a failure //throw new IllegalArgumentException( // "Bad URI " + uri + ":" + e.getMessage(), e); e.printStackTrace(); } catch (Exception e) { // Unexpected exception? Should not happen. e.printStackTrace(); } } return null; } */	TokenNameCOMMENT_BLOCK	 currently unused: private static String fromUriJava14(String uri) { // Also check for properly formed URIs. Ant formerly recommended using // nonsense URIs such as "file:./foo.xml" in XML includes. You shouldn't // do that (just "foo.xml" is correct) but for compatibility we special-case // things when the path is not absolute, and fall back to the old parsing behavior. if (uri.startsWith("file:/")) { try { File f = new File(URI.create(encodeURI(uri))); //bug #42227 forgot to decode before returning return decodeUri(f.getAbsolutePath()); } catch (IllegalArgumentException e) { // Bad URI, pass this on. // no, this is downgraded to a warning after various // JRE bugs surfaced. Hand off // to our built in code on a failure //throw new IllegalArgumentException( // "Bad URI " + uri + ":" + e.getMessage(), e); e.printStackTrace(); } catch (Exception e) { // Unexpected exception? Should not happen. e.printStackTrace(); } } return null; } 
/** * @param uri uri to expand * @return the decoded URI * @since Ant1.7.1 */	TokenNameCOMMENT_JAVADOC	 @param uri uri to expand @return the decoded URI @since Ant1.7.1 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fromURIJava13	TokenNameIdentifier	 from URI Java13
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fallback method for Java 1.3 or earlier. 	TokenNameCOMMENT_LINE	Fallback method for Java 1.3 or earlier. 
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
emYouEarlEx	TokenNameIdentifier	 em You Earl Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore malformed exception 	TokenNameCOMMENT_LINE	Ignore malformed exception 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
ERROR_NOT_FILE_URI	TokenNameIdentifier	 ERROR  NOT  FILE  URI
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
queryPos	TokenNameIdentifier	 query Pos
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
queryPos	TokenNameIdentifier	 query Pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
queryPos	TokenNameIdentifier	 query Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
==	TokenNameEQUAL_EQUAL	
';'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
decodeUri	TokenNameIdentifier	 decode Uri
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//consider adding the current directory. This is not done when 	TokenNameCOMMENT_LINE	consider adding the current directory. This is not done when 
//the path is a UNC name 	TokenNameCOMMENT_LINE	the path is a UNC name 
String	TokenNameIdentifier	 String
cwd	TokenNameIdentifier	 cwd
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
posi	TokenNameIdentifier	 posi
=	TokenNameEQUAL	
cwd	TokenNameIdentifier	 cwd
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pathStartsWithFileSeparator	TokenNameIdentifier	 path Starts With File Separator
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pathStartsWithUNC	TokenNameIdentifier	 path Starts With UNC
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
posi	TokenNameIdentifier	 posi
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
pathStartsWithFileSeparator	TokenNameIdentifier	 path Starts With File Separator
&&	TokenNameAND_AND	
!	TokenNameNOT	
pathStartsWithUNC	TokenNameIdentifier	 path Starts With UNC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
cwd	TokenNameIdentifier	 cwd
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
posi	TokenNameIdentifier	 posi
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not sure whether this is clean, but this method is 	TokenNameCOMMENT_LINE	not sure whether this is clean, but this method is 
// declared not to throw exceptions. 	TokenNameCOMMENT_LINE	declared not to throw exceptions. 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Could not convert URI "	TokenNameStringLiteral	Could not convert URI 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
" to path: "	TokenNameStringLiteral	 to path: 
+	TokenNamePLUS	
exc	TokenNameIdentifier	 exc
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Crack a JAR URI. * This method is public for testing; we may delete it without any warning -it is not part of Ant's stable API. * @param uri uri to expand; contains jar: somewhere in it * @return the decoded URI * @since Ant1.7.1 */	TokenNameCOMMENT_JAVADOC	 Crack a JAR URI. This method is public for testing; we may delete it without any warning -it is not part of Ant's stable API. @param uri uri to expand; contains jar: somewhere in it @return the decoded URI @since Ant1.7.1 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fromJarURI	TokenNameIdentifier	 from Jar URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pling	TokenNameIdentifier	 pling
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"!/"	TokenNameStringLiteral	!/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
jarName	TokenNameIdentifier	 jar Name
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"jar:"	TokenNameStringLiteral	jar:
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pling	TokenNameIdentifier	 pling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
jarName	TokenNameIdentifier	 jar Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decodes an Uri with % characters. * The URI is escaped * @param uri String with the uri possibly containing % characters. * @return The decoded Uri * @throws UnsupportedEncodingException if UTF-8 is not available * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Decodes an Uri with % characters. The URI is escaped @param uri String with the uri possibly containing % characters. @return The decoded Uri @throws UnsupportedEncodingException if UTF-8 is not available @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
decodeUri	TokenNameIdentifier	 decode Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharacterIterator	TokenNameIdentifier	 Character Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
!=	TokenNameNOT_EQUAL	
CharacterIterator	TokenNameIdentifier	 Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
,	TokenNameCOMMA	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
<<	TokenNameLEFT_SHIFT	
NIBBLE	TokenNameIdentifier	 NIBBLE
)	TokenNameRPAREN	
+	TokenNamePLUS	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0x0000	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x0080	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// #50543 	TokenNameCOMMENT_LINE	#50543 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
URI_ENCODING	TokenNameIdentifier	 URI  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
URI_ENCODING	TokenNameIdentifier	 URI  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes an Uri with % characters. * The URI is escaped * @param path String to encode. * @return The encoded string, according to URI norms * @throws UnsupportedEncodingException if UTF-8 is not available * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Encodes an Uri with % characters. The URI is escaped @param path String to encode. @return The encoded string, according to URI norms @throws UnsupportedEncodingException if UTF-8 is not available @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
encodeURI	TokenNameIdentifier	 encode URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if it's not an ASCII character, break here, and use UTF-8 encoding 	TokenNameCOMMENT_LINE	if it's not an ASCII character, break here, and use UTF-8 encoding 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
ASCII_SIZE	TokenNameIdentifier	 ASCII  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// record the fact that it's escaped 	TokenNameCOMMENT_LINE	record the fact that it's escaped 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we saw some non-ascii character 	TokenNameCOMMENT_LINE	we saw some non-ascii character 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get UTF-8 bytes for the remaining sub-string 	TokenNameCOMMENT_LINE	get UTF-8 bytes for the remaining sub-string 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
URI_ENCODING	TokenNameIdentifier	 URI  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// for each byte 	TokenNameCOMMENT_LINE	for each byte 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// for non-ascii character: make it positive, then escape 	TokenNameCOMMENT_LINE	for non-ascii character: make it positive, then escape 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
BYTE_SIZE	TokenNameIdentifier	 BYTE  SIZE
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
NIBBLE	TokenNameIdentifier	 NIBBLE
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
NIBBLE_MASK	TokenNameIdentifier	 NIBBLE  MASK
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
path	TokenNameIdentifier	 path
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a File to a URL. * File.toURL() does not encode characters like #. * File.toURI() has been introduced in java 1.4, so * Ant cannot use it (except by reflection) <!-- XXX no longer true --> * FileUtils.toURI() cannot be used by Locator.java * Implemented this way. * File.toURL() adds file: and changes '\' to '/' for dos OSes * encodeURI converts characters like ' ' and '#' to %DD * @param file the file to convert * @return URL the converted File * @throws MalformedURLException on error */	TokenNameCOMMENT_JAVADOC	 Convert a File to a URL. File.toURL() does not encode characters like #. File.toURI() has been introduced in java 1.4, so Ant cannot use it (except by reflection) <!-- XXX no longer true --> FileUtils.toURI() cannot be used by Locator.java Implemented this way. File.toURL() adds file: and changes '\' to '/' for dos OSes encodeURI converts characters like ' ' and '#' to %DD @param file the file to convert @return URL the converted File @throws MalformedURLException on error 
public	TokenNamepublic	
static	TokenNamestatic	
URL	TokenNameIdentifier	 URL
fileToURL	TokenNameIdentifier	 file To URL
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
encodeURI	TokenNameIdentifier	 encode URI
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the File necessary to load the Sun compiler tools. If the classes * are available to this class, then no additional URL is required and * null is returned. This may be because the classes are explicitly in the * class path or provided by the JVM directly. * * @return the tools jar as a File if required, null otherwise. */	TokenNameCOMMENT_JAVADOC	 Get the File necessary to load the Sun compiler tools. If the classes are available to this class, then no additional URL is required and null is returned. This may be because the classes are explicitly in the class path or provided by the JVM directly. * @return the tools jar as a File if required, null otherwise. 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getToolsJar	TokenNameIdentifier	 get Tools Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// firstly check if the tools jar is already in the classpath 	TokenNameCOMMENT_LINE	firstly check if the tools jar is already in the classpath 
boolean	TokenNameboolean	
toolsJarAvailable	TokenNameIdentifier	 tools Jar Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// just check whether this throws an exception 	TokenNameCOMMENT_LINE	just check whether this throws an exception 
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"com.sun.tools.javac.Main"	TokenNameStringLiteral	com.sun.tools.javac.Main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toolsJarAvailable	TokenNameIdentifier	 tools Jar Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.tools.javac.Main"	TokenNameStringLiteral	sun.tools.javac.Main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toolsJarAvailable	TokenNameIdentifier	 tools Jar Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toolsJarAvailable	TokenNameIdentifier	 tools Jar Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// couldn't find compiler - try to find tools.jar 	TokenNameCOMMENT_LINE	couldn't find compiler - try to find tools.jar 
// based on java.home setting 	TokenNameCOMMENT_LINE	based on java.home setting 
String	TokenNameIdentifier	 String
libToolsJar	TokenNameIdentifier	 lib Tools Jar
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"lib"	TokenNameStringLiteral	lib
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"tools.jar"	TokenNameStringLiteral	tools.jar
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
javaHome	TokenNameIdentifier	 java Home
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
toolsJar	TokenNameIdentifier	 tools Jar
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
javaHome	TokenNameIdentifier	 java Home
+	TokenNamePLUS	
libToolsJar	TokenNameIdentifier	 lib Tools Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toolsJar	TokenNameIdentifier	 tools Jar
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Found in java.home as given 	TokenNameCOMMENT_LINE	Found in java.home as given 
return	TokenNamereturn	
toolsJar	TokenNameIdentifier	 tools Jar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaHome	TokenNameIdentifier	 java Home
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"jre"	TokenNameStringLiteral	jre
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javaHome	TokenNameIdentifier	 java Home
=	TokenNameEQUAL	
javaHome	TokenNameIdentifier	 java Home
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
javaHome	TokenNameIdentifier	 java Home
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
"/jre"	TokenNameStringLiteral	/jre
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toolsJar	TokenNameIdentifier	 tools Jar
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
javaHome	TokenNameIdentifier	 java Home
+	TokenNamePLUS	
libToolsJar	TokenNameIdentifier	 lib Tools Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
toolsJar	TokenNameIdentifier	 tools Jar
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Unable to locate tools.jar. "	TokenNameStringLiteral	Unable to locate tools.jar. 
+	TokenNamePLUS	
"Expected to find it in "	TokenNameStringLiteral	Expected to find it in 
+	TokenNamePLUS	
toolsJar	TokenNameIdentifier	 tools Jar
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
toolsJar	TokenNameIdentifier	 tools Jar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an array of URLs representing all of the jar files in the * given location. If the location is a file, it is returned as the only * element of the array. If the location is a directory, it is scanned for * jar files. * * @param location the location to scan for Jars. * * @return an array of URLs for all jars in the given location. * * @exception MalformedURLException if the URLs for the jars cannot be * formed. */	TokenNameCOMMENT_JAVADOC	 Get an array of URLs representing all of the jar files in the given location. If the location is a file, it is returned as the only element of the array. If the location is a directory, it is scanned for jar files. * @param location the location to scan for Jars. * @return an array of URLs for all jars in the given location. * @exception MalformedURLException if the URLs for the jars cannot be formed. 
public	TokenNamepublic	
static	TokenNamestatic	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
".jar"	TokenNameStringLiteral	.jar
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an array of URLs representing all of the files of a given set of * extensions in the given location. If the location is a file, it is * returned as the only element of the array. If the location is a * directory, it is scanned for matching files. * * @param location the location to scan for files. * @param extensions an array of extension that are to match in the * directory search. * * @return an array of URLs of matching files. * @exception MalformedURLException if the URLs for the files cannot be * formed. */	TokenNameCOMMENT_JAVADOC	 Get an array of URLs representing all of the files of a given set of extensions in the given location. If the location is a file, it is returned as the only element of the array. If the location is a directory, it is scanned for matching files. * @param location the location to scan for files. @param extensions an array of extension that are to match in the directory search. * @return an array of URLs of matching files. @exception MalformedURLException if the URLs for the files cannot be formed. 
public	TokenNamepublic	
static	TokenNamestatic	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocationURLs	TokenNameIdentifier	 get Location UR Ls
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
urls	TokenNameIdentifier	 urls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
littlePath	TokenNameIdentifier	 little Path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
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
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
littlePath	TokenNameIdentifier	 little Path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urls	TokenNameIdentifier	 urls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fileToURL	TokenNameIdentifier	 file To URL
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
urls	TokenNameIdentifier	 urls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
new	TokenNamenew	
FilenameFilter	TokenNameIdentifier	 Filename Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
littleName	TokenNameIdentifier	 little Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
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
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
littleName	TokenNameIdentifier	 little Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
matches	TokenNameIdentifier	 matches
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
matches	TokenNameIdentifier	 matches
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urls	TokenNameIdentifier	 urls
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fileToURL	TokenNameIdentifier	 file To URL
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
urls	TokenNameIdentifier	 urls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
