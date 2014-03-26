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
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
/** * Reads input from a property file, the file name is read from the * system property ant.input.properties, the prompt is the key for input. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Reads input from a property file, the file name is read from the system property ant.input.properties, the prompt is the key for input. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
implements	TokenNameimplements	
InputHandler	TokenNameIdentifier	 Input Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Name of the system property we expect to hold the file name. */	TokenNameCOMMENT_JAVADOC	 Name of the system property we expect to hold the file name. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_NAME_KEY	TokenNameIdentifier	 FILE  NAME  KEY
=	TokenNameEQUAL	
"ant.input.properties"	TokenNameStringLiteral	ant.input.properties
;	TokenNameSEMICOLON	
/** * Empty no-arg constructor. */	TokenNameCOMMENT_JAVADOC	 Empty no-arg constructor. 
public	TokenNamepublic	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Picks up the input from a property, using the prompt as the * name of the property. * @param request an input request. * * @exception BuildException if no property of that name can be found. */	TokenNameCOMMENT_JAVADOC	 Picks up the input from a property, using the prompt as the name of the property. @param request an input request. * @exception BuildException if no property of that name can be found. 
public	TokenNamepublic	
void	TokenNamevoid	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
InputRequest	TokenNameIdentifier	 Input Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
readProps	TokenNameIdentifier	 read Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to find input for '"	TokenNameStringLiteral	Unable to find input for '
+	TokenNamePLUS	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isInputValid	TokenNameIdentifier	 is Input Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Found invalid input "	TokenNameStringLiteral	Found invalid input 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" for '"	TokenNameStringLiteral	 for '
+	TokenNamePLUS	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reads the properties file if it hasn't already been read. */	TokenNameCOMMENT_JAVADOC	 Reads the properties file if it hasn't already been read. 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
readProps	TokenNameIdentifier	 read Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
propsFile	TokenNameIdentifier	 props File
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
FILE_NAME_KEY	TokenNameIdentifier	 FILE  NAME  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propsFile	TokenNameIdentifier	 props File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"System property "	TokenNameStringLiteral	System property 
+	TokenNamePLUS	
FILE_NAME_KEY	TokenNameIdentifier	 FILE  NAME  KEY
+	TokenNamePLUS	
" for PropertyFileInputHandler not"	TokenNameStringLiteral	 for PropertyFileInputHandler not
+	TokenNamePLUS	
" set"	TokenNameStringLiteral	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
propsFile	TokenNameIdentifier	 props File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Couldn't load "	TokenNameStringLiteral	Couldn't load 
+	TokenNamePLUS	
propsFile	TokenNameIdentifier	 props File
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
