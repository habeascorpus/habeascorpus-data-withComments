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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Selector that selects a certain kind of file: directory or regular. * * @since 1.6 */	TokenNameCOMMENT_JAVADOC	 Selector that selects a certain kind of file: directory or regular. * @since 1.6 
public	TokenNamepublic	
class	TokenNameclass	
TypeSelector	TokenNameIdentifier	 Type Selector
extends	TokenNameextends	
BaseExtendSelector	TokenNameIdentifier	 Base Extend Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Key to used for parameterized custom selector */	TokenNameCOMMENT_JAVADOC	 Key to used for parameterized custom selector 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_KEY	TokenNameIdentifier	 TYPE  KEY
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
;	TokenNameSEMICOLON	
/** * Creates a new <code>TypeSelector</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>TypeSelector</code> instance. 
public	TokenNamepublic	
TypeSelector	TokenNameIdentifier	 Type Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a string describing this object */	TokenNameCOMMENT_JAVADOC	 @return a string describing this object 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"{typeselector type: "	TokenNameStringLiteral	{typeselector type: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
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
/** * Set the type of file to require. * @param fileTypes the type of file - file or dir */	TokenNameCOMMENT_JAVADOC	 Set the type of file to require. @param fileTypes the type of file - file or dir 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
FileType	TokenNameIdentifier	 File Type
fileTypes	TokenNameIdentifier	 file Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fileTypes	TokenNameIdentifier	 file Types
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When using this as a custom selector, this method will be called. * It translates each parameter into the appropriate setXXX() call. * * @param parameters the complete set of parameters for this selector */	TokenNameCOMMENT_JAVADOC	 When using this as a custom selector, this method will be called. It translates each parameter into the appropriate setXXX() call. * @param parameters the complete set of parameters for this selector 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
paramname	TokenNameIdentifier	 paramname
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
TYPE_KEY	TokenNameIdentifier	 TYPE  KEY
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileType	TokenNameIdentifier	 File Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
FileType	TokenNameIdentifier	 File Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Invalid parameter "	TokenNameStringLiteral	Invalid parameter 
+	TokenNamePLUS	
paramname	TokenNameIdentifier	 paramname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks to make sure all settings are kosher. In this case, it * means that the pattern attribute has been set. * */	TokenNameCOMMENT_JAVADOC	 Checks to make sure all settings are kosher. In this case, it means that the pattern attribute has been set. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The type attribute is required"	TokenNameStringLiteral	The type attribute is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The heart of the matter. This is where the selector gets to decide * on the inclusion of a file in a particular fileset. * * @param basedir the base directory the scan is being done from * @param filename is the name of the file to check * @param file is a java.io.File object the selector can use * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 The heart of the matter. This is where the selector gets to decide on the inclusion of a file in a particular fileset. * @param basedir the base directory the scan is being done from @param filename is the name of the file to check @param file is a java.io.File object the selector can use @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw BuildException on error 	TokenNameCOMMENT_LINE	throw BuildException on error 
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FileType	TokenNameIdentifier	 File Type
.	TokenNameDOT	
DIR	TokenNameIdentifier	 DIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FileType	TokenNameIdentifier	 File Type
.	TokenNameDOT	
FILE	TokenNameIdentifier	 FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Enumerated attribute with the values for types of file */	TokenNameCOMMENT_JAVADOC	 Enumerated attribute with the values for types of file 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FileType	TokenNameIdentifier	 File Type
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** the string value for file */	TokenNameCOMMENT_JAVADOC	 the string value for file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE	TokenNameIdentifier	 FILE
=	TokenNameEQUAL	
"file"	TokenNameStringLiteral	file
;	TokenNameSEMICOLON	
/** the string value for dir */	TokenNameCOMMENT_JAVADOC	 the string value for dir 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DIR	TokenNameIdentifier	 DIR
=	TokenNameEQUAL	
"dir"	TokenNameStringLiteral	dir
;	TokenNameSEMICOLON	
/** * @return the values as an array of strings */	TokenNameCOMMENT_JAVADOC	 @return the values as an array of strings 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FILE	TokenNameIdentifier	 FILE
,	TokenNameCOMMA	
DIR	TokenNameIdentifier	 DIR
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
