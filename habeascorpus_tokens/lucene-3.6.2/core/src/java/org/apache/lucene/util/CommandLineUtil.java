package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
FSDirectory	TokenNameIdentifier	 FS Directory
;	TokenNameSEMICOLON	
/** * Class containing some useful methods used by command line tools * */	TokenNameCOMMENT_JAVADOC	 Class containing some useful methods used by command line tools 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
{	TokenNameLBRACE	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a specific FSDirectory instance starting from its class name * @param clazzName The name of the FSDirectory class to load * @param file The file to be used as parameter constructor * @return the new FSDirectory instance */	TokenNameCOMMENT_JAVADOC	 Creates a specific FSDirectory instance starting from its class name @param clazzName The name of the FSDirectory class to load @param file The file to be used as parameter constructor @return the new FSDirectory instance 
public	TokenNamepublic	
static	TokenNamestatic	
FSDirectory	TokenNameIdentifier	 FS Directory
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clazzName	TokenNameIdentifier	 clazz Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
loadFSDirectoryClass	TokenNameIdentifier	 load FS Directory Class
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" implementation not found: "	TokenNameStringLiteral	 implementation not found: 
+	TokenNamePLUS	
clazzName	TokenNameIdentifier	 clazz Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
+	TokenNamePLUS	
" is not a "	TokenNameStringLiteral	 is not a 
+	TokenNamePLUS	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" implementation"	TokenNameStringLiteral	 implementation
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
+	TokenNamePLUS	
" constructor with "	TokenNameStringLiteral	 constructor with 
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" as parameter not found"	TokenNameStringLiteral	 as parameter not found
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Error creating "	TokenNameStringLiteral	Error creating 
+	TokenNamePLUS	
clazzName	TokenNameIdentifier	 clazz Name
+	TokenNamePLUS	
" instance"	TokenNameStringLiteral	 instance
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Loads a specific Directory implementation * @param clazzName The name of the Directory class to load * @return The Directory class loaded * @throws ClassNotFoundException */	TokenNameCOMMENT_JAVADOC	 Loads a specific Directory implementation @param clazzName The name of the Directory class to load @return The Directory class loaded @throws ClassNotFoundException 
public	TokenNamepublic	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Directory	TokenNameIdentifier	 Directory
>	TokenNameGREATER	
loadDirectoryClass	TokenNameIdentifier	 load Directory Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
adjustDirectoryClassName	TokenNameIdentifier	 adjust Directory Class Name
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Loads a specific FSDirectory implementation * @param clazzName The name of the FSDirectory class to load * @return The FSDirectory class loaded * @throws ClassNotFoundException */	TokenNameCOMMENT_JAVADOC	 Loads a specific FSDirectory implementation @param clazzName The name of the FSDirectory class to load @return The FSDirectory class loaded @throws ClassNotFoundException 
public	TokenNamepublic	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
>	TokenNameGREATER	
loadFSDirectoryClass	TokenNameIdentifier	 load FS Directory Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
adjustDirectoryClassName	TokenNameIdentifier	 adjust Directory Class Name
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
adjustDirectoryClassName	TokenNameIdentifier	 adjust Directory Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clazzName	TokenNameIdentifier	 clazz Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
clazzName	TokenNameIdentifier	 clazz Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The "	TokenNameStringLiteral	The 
+	TokenNamePLUS	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" implementation cannot be null or empty"	TokenNameStringLiteral	 implementation cannot be null or empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazzName	TokenNameIdentifier	 clazz Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if not fully qualified, assume .store 	TokenNameCOMMENT_LINE	if not fully qualified, assume .store 
clazzName	TokenNameIdentifier	 clazz Name
=	TokenNameEQUAL	
Directory	TokenNameIdentifier	 Directory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
clazzName	TokenNameIdentifier	 clazz Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clazzName	TokenNameIdentifier	 clazz Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new specific FSDirectory instance * @param clazz The class of the object to be created * @param file The file to be used as parameter constructor * @return The new FSDirectory instance * @throws NoSuchMethodException * @throws InstantiationException * @throws IllegalAccessException * @throws InvocationTargetException */	TokenNameCOMMENT_JAVADOC	 Creates a new specific FSDirectory instance @param clazz The class of the object to be created @param file The file to be used as parameter constructor @return The new FSDirectory instance @throws NoSuchMethodException @throws InstantiationException @throws IllegalAccessException @throws InvocationTargetException 
public	TokenNamepublic	
static	TokenNamestatic	
FSDirectory	TokenNameIdentifier	 FS Directory
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
{	TokenNameLBRACE	
// Assuming every FSDirectory has a ctor(File): 	TokenNameCOMMENT_LINE	Assuming every FSDirectory has a ctor(File): 
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
>	TokenNameGREATER	
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ctor	TokenNameIdentifier	 ctor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
