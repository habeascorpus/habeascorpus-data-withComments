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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ejb	TokenNameIdentifier	 ejb
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
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
AttributeList	TokenNameIdentifier	 Attribute List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Inner class used by EjbJar to facilitate the parsing of deployment * descriptors and the capture of appropriate information. Extends * HandlerBase so it only implements the methods needed. During parsing * creates a hashtable consisting of entries mapping the name it should be * inserted into an EJB jar as to a File representing the file on disk. This * list can then be accessed through the getFiles() method. */	TokenNameCOMMENT_JAVADOC	 Inner class used by EjbJar to facilitate the parsing of deployment descriptors and the capture of appropriate information. Extends HandlerBase so it only implements the methods needed. During parsing creates a hashtable consisting of entries mapping the name it should be inserted into an EJB jar as to a File representing the file on disk. This list can then be accessed through the getFiles() method. 
public	TokenNamepublic	
class	TokenNameclass	
DescriptorHandler	TokenNameIdentifier	 Descriptor Handler
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
HandlerBase	TokenNameIdentifier	 Handler Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_HASH_TABLE_SIZE	TokenNameIdentifier	 DEFAULT  HASH  TABLE  SIZE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_LOOKING_EJBJAR	TokenNameIdentifier	 STATE  LOOKING  EJBJAR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_IN_EJBJAR	TokenNameIdentifier	 STATE  IN  EJBJAR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_IN_SESSION	TokenNameIdentifier	 STATE  IN  SESSION
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_IN_ENTITY	TokenNameIdentifier	 STATE  IN  ENTITY
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATE_IN_MESSAGE	TokenNameIdentifier	 STATE  IN  MESSAGE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Task	TokenNameIdentifier	 Task
owningTask	TokenNameIdentifier	 owning Task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Bunch of constants used for storing entries in a hashtable, and for * constructing the filenames of various parts of the ejb jar. */	TokenNameCOMMENT_JAVADOC	 Bunch of constants used for storing entries in a hashtable, and for constructing the filenames of various parts of the ejb jar. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_REF	TokenNameIdentifier	 EJB  REF
=	TokenNameEQUAL	
"ejb-ref"	TokenNameStringLiteral	ejb-ref
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_LOCAL_REF	TokenNameIdentifier	 EJB  LOCAL  REF
=	TokenNameEQUAL	
"ejb-local-ref"	TokenNameStringLiteral	ejb-local-ref
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HOME_INTERFACE	TokenNameIdentifier	 HOME  INTERFACE
=	TokenNameEQUAL	
"home"	TokenNameStringLiteral	home
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REMOTE_INTERFACE	TokenNameIdentifier	 REMOTE  INTERFACE
=	TokenNameEQUAL	
"remote"	TokenNameStringLiteral	remote
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCAL_HOME_INTERFACE	TokenNameIdentifier	 LOCAL  HOME  INTERFACE
=	TokenNameEQUAL	
"local-home"	TokenNameStringLiteral	local-home
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOCAL_INTERFACE	TokenNameIdentifier	 LOCAL  INTERFACE
=	TokenNameEQUAL	
"local"	TokenNameStringLiteral	local
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BEAN_CLASS	TokenNameIdentifier	 BEAN  CLASS
=	TokenNameEQUAL	
"ejb-class"	TokenNameStringLiteral	ejb-class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PK_CLASS	TokenNameIdentifier	 PK  CLASS
=	TokenNameEQUAL	
"prim-key-class"	TokenNameStringLiteral	prim-key-class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_NAME	TokenNameIdentifier	 EJB  NAME
=	TokenNameEQUAL	
"ejb-name"	TokenNameStringLiteral	ejb-name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EJB_JAR	TokenNameIdentifier	 EJB  JAR
=	TokenNameEQUAL	
"ejb-jar"	TokenNameStringLiteral	ejb-jar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTERPRISE_BEANS	TokenNameIdentifier	 ENTERPRISE  BEANS
=	TokenNameEQUAL	
"enterprise-beans"	TokenNameStringLiteral	enterprise-beans
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_BEAN	TokenNameIdentifier	 ENTITY  BEAN
=	TokenNameEQUAL	
"entity"	TokenNameStringLiteral	entity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SESSION_BEAN	TokenNameIdentifier	 SESSION  BEAN
=	TokenNameEQUAL	
"session"	TokenNameStringLiteral	session
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_BEAN	TokenNameIdentifier	 MESSAGE  BEAN
=	TokenNameEQUAL	
"message-driven"	TokenNameStringLiteral	message-driven
;	TokenNameSEMICOLON	
/** * The state of the parsing */	TokenNameCOMMENT_JAVADOC	 The state of the parsing 
private	TokenNameprivate	
int	TokenNameint	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_LOOKING_EJBJAR	TokenNameIdentifier	 STATE  LOOKING  EJBJAR
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * Instance variable used to store the name of the current element being * processed by the SAX parser. Accessed by the SAX parser call-back methods * startElement() and endElement(). */	TokenNameCOMMENT_JAVADOC	 Instance variable used to store the name of the current element being processed by the SAX parser. Accessed by the SAX parser call-back methods startElement() and endElement(). 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The text of the current element */	TokenNameCOMMENT_JAVADOC	 The text of the current element 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
currentText	TokenNameIdentifier	 current Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Instance variable that stores the names of the files as they will be * put into the jar file, mapped to File objects Accessed by the SAX * parser call-back method characters(). */	TokenNameCOMMENT_JAVADOC	 Instance variable that stores the names of the files as they will be put into the jar file, mapped to File objects Accessed by the SAX parser call-back method characters(). 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
ejbFiles	TokenNameIdentifier	 ejb Files
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Instance variable that stores the value found in the &lt;ejb-name&gt; element */	TokenNameCOMMENT_JAVADOC	 Instance variable that stores the value found in the &lt;ejb-name&gt; element 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ejbName	TokenNameIdentifier	 ejb Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
fileDTDs	TokenNameIdentifier	 file DT Ds
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
resourceDTDs	TokenNameIdentifier	 resource DT Ds
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
inEJBRef	TokenNameIdentifier	 in EJB Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
urlDTDs	TokenNameIdentifier	 url DT Ds
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * The directory containing the bean classes and interfaces. This is * used for performing dependency file lookups. */	TokenNameCOMMENT_JAVADOC	 The directory containing the bean classes and interfaces. This is used for performing dependency file lookups. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
;	TokenNameSEMICOLON	
/** * Constructor for DescriptorHandler. * @param task the task that owns this desciptor * @param srcDir the source directory */	TokenNameCOMMENT_JAVADOC	 Constructor for DescriptorHandler. @param task the task that owns this desciptor @param srcDir the source directory 
public	TokenNamepublic	
DescriptorHandler	TokenNameIdentifier	 Descriptor Handler
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owningTask	TokenNameIdentifier	 owning Task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
srcDir	TokenNameIdentifier	 src Dir
=	TokenNameEQUAL	
srcDir	TokenNameIdentifier	 src Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register a dtd with a location. * The location is one of a filename, a resource name in the classpath, or * a URL. * @param publicId the public identity of the dtd * @param location the location of the dtd */	TokenNameCOMMENT_JAVADOC	 Register a dtd with a location. The location is one of a filename, a resource name in the classpath, or a URL. @param publicId the public identity of the dtd @param location the location of the dtd 
public	TokenNamepublic	
void	TokenNamevoid	
registerDTD	TokenNameIdentifier	 register DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
fileDTD	TokenNameIdentifier	 file DTD
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fileDTD	TokenNameIdentifier	 file DTD
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resolve relative to project basedir 	TokenNameCOMMENT_LINE	resolve relative to project basedir 
fileDTD	TokenNameIdentifier	 file DTD
=	TokenNameEQUAL	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileDTD	TokenNameIdentifier	 file DTD
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileDTDs	TokenNameIdentifier	 file DT Ds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
fileDTD	TokenNameIdentifier	 file DTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Mapped publicId "	TokenNameStringLiteral	Mapped publicId 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
" to file "	TokenNameStringLiteral	 to file 
+	TokenNamePLUS	
fileDTD	TokenNameIdentifier	 file DTD
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resourceDTDs	TokenNameIdentifier	 resource DT Ds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Mapped publicId "	TokenNameStringLiteral	Mapped publicId 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
" to resource "	TokenNameStringLiteral	 to resource 
+	TokenNamePLUS	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
urldtd	TokenNameIdentifier	 urldtd
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urlDTDs	TokenNameIdentifier	 url DT Ds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
urldtd	TokenNameIdentifier	 urldtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignored 	TokenNameCOMMENT_LINE	ignored 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Resolve the entity. * @see org.xml.sax.EntityResolver#resolveEntity(String, String). * @param publicId The public identifier, or <code>null</code> * if none is available. * @param systemId The system identifier provided in the XML * document. Will not be <code>null</code>. * @return an inputsource for this identifier * @throws SAXException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Resolve the entity. @see org.xml.sax.EntityResolver#resolveEntity(String, String). @param publicId The public identifier, or <code>null</code> if none is available. @param systemId The system identifier provided in the XML document. Will not be <code>null</code>. @return an inputsource for this identifier @throws SAXException if there is a problem. 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
fileDTDs	TokenNameIdentifier	 file DT Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Resolved "	TokenNameStringLiteral	Resolved 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
" to local file "	TokenNameStringLiteral	 to local file 
+	TokenNamePLUS	
dtdFile	TokenNameIdentifier	 dtd File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
dtdResourceName	TokenNameIdentifier	 dtd Resource Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
resourceDTDs	TokenNameIdentifier	 resource DT Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtdResourceName	TokenNameIdentifier	 dtd Resource Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
dtdResourceName	TokenNameIdentifier	 dtd Resource Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Resolved "	TokenNameStringLiteral	Resolved 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
" to local resource "	TokenNameStringLiteral	 to local resource 
+	TokenNamePLUS	
dtdResourceName	TokenNameIdentifier	 dtd Resource Name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
dtdUrl	TokenNameIdentifier	 dtd Url
=	TokenNameEQUAL	
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
)	TokenNameRPAREN	
urlDTDs	TokenNameIdentifier	 url DT Ds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtdUrl	TokenNameIdentifier	 dtd Url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
dtdUrl	TokenNameIdentifier	 dtd Url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Resolved "	TokenNameStringLiteral	Resolved 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
" to url "	TokenNameStringLiteral	 to url 
+	TokenNamePLUS	
dtdUrl	TokenNameIdentifier	 dtd Url
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
owningTask	TokenNameIdentifier	 owning Task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Could not resolve ( publicId: "	TokenNameStringLiteral	Could not resolve ( publicId: 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
", systemId: "	TokenNameStringLiteral	, systemId: 
+	TokenNamePLUS	
systemId	TokenNameIdentifier	 system Id
+	TokenNamePLUS	
") to a local entity"	TokenNameStringLiteral	) to a local entity
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter method that returns the set of files to include in the EJB jar. * @return the map of files */	TokenNameCOMMENT_JAVADOC	 Getter method that returns the set of files to include in the EJB jar. @return the map of files 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ejbFiles	TokenNameIdentifier	 ejb Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ejbFiles	TokenNameIdentifier	 ejb Files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the publicId of the DTD * @return the public id */	TokenNameCOMMENT_JAVADOC	 Get the publicId of the DTD @return the public id 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter method that returns the value of the &lt;ejb-name&gt; element. * @return the ejb name */	TokenNameCOMMENT_JAVADOC	 Getter method that returns the value of the &lt;ejb-name&gt; element. @return the ejb name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEjbName	TokenNameIdentifier	 get Ejb Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ejbName	TokenNameIdentifier	 ejb Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * SAX parser call-back method that is used to initialize the values of some * instance variables to ensure safe operation. * @throws SAXException on error */	TokenNameCOMMENT_JAVADOC	 SAX parser call-back method that is used to initialize the values of some instance variables to ensure safe operation. @throws SAXException on error 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ejbFiles	TokenNameIdentifier	 ejb Files
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
DEFAULT_HASH_TABLE_SIZE	TokenNameIdentifier	 DEFAULT  HASH  TABLE  SIZE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
inEJBRef	TokenNameIdentifier	 in EJB Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * SAX parser call-back method that is invoked when a new element is entered * into. Used to store the context (attribute name) in the currentAttribute * instance variable. * @param name The name of the element being entered. * @param attrs Attributes associated to the element. * @throws SAXException on error */	TokenNameCOMMENT_JAVADOC	 SAX parser call-back method that is invoked when a new element is entered into. Used to store the context (attribute name) in the currentAttribute instance variable. @param name The name of the element being entered. @param attrs Attributes associated to the element. @throws SAXException on error 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AttributeList	TokenNameIdentifier	 Attribute List
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
currentText	TokenNameIdentifier	 current Text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_REF	TokenNameIdentifier	 EJB  REF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_LOCAL_REF	TokenNameIdentifier	 EJB  LOCAL  REF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inEJBRef	TokenNameIdentifier	 in EJB Ref
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_LOOKING_EJBJAR	TokenNameIdentifier	 STATE  LOOKING  EJBJAR
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_JAR	TokenNameIdentifier	 EJB  JAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_EJBJAR	TokenNameIdentifier	 STATE  IN  EJBJAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_EJBJAR	TokenNameIdentifier	 STATE  IN  EJBJAR
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENTERPRISE_BEANS	TokenNameIdentifier	 ENTERPRISE  BEANS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SESSION_BEAN	TokenNameIdentifier	 SESSION  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_SESSION	TokenNameIdentifier	 STATE  IN  SESSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENTITY_BEAN	TokenNameIdentifier	 ENTITY  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_ENTITY	TokenNameIdentifier	 STATE  IN  ENTITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MESSAGE_BEAN	TokenNameIdentifier	 MESSAGE  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_MESSAGE	TokenNameIdentifier	 STATE  IN  MESSAGE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * SAX parser call-back method that is invoked when an element is exited. * Used to blank out (set to the empty string, not nullify) the name of * the currentAttribute. A better method would be to use a stack as an * instance variable, however since we are only interested in leaf-node * data this is a simpler and workable solution. * @param name The name of the attribute being exited. Ignored * in this implementation. * @throws SAXException on error */	TokenNameCOMMENT_JAVADOC	 SAX parser call-back method that is invoked when an element is exited. Used to blank out (set to the empty string, not nullify) the name of the currentAttribute. A better method would be to use a stack as an instance variable, however since we are only interested in leaf-node data this is a simpler and workable solution. @param name The name of the attribute being exited. Ignored in this implementation. @throws SAXException on error 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentText	TokenNameIdentifier	 current Text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentElement	TokenNameIdentifier	 current Element
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_REF	TokenNameIdentifier	 EJB  REF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_LOCAL_REF	TokenNameIdentifier	 EJB  LOCAL  REF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inEJBRef	TokenNameIdentifier	 in EJB Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_ENTITY	TokenNameIdentifier	 STATE  IN  ENTITY
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENTITY_BEAN	TokenNameIdentifier	 ENTITY  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_SESSION	TokenNameIdentifier	 STATE  IN  SESSION
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SESSION_BEAN	TokenNameIdentifier	 SESSION  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_MESSAGE	TokenNameIdentifier	 STATE  IN  MESSAGE
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MESSAGE_BEAN	TokenNameIdentifier	 MESSAGE  BEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_BEANS	TokenNameIdentifier	 STATE  IN  BEANS
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENTERPRISE_BEANS	TokenNameIdentifier	 ENTERPRISE  BEANS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_IN_EJBJAR	TokenNameIdentifier	 STATE  IN  EJBJAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
==	TokenNameEQUAL_EQUAL	
STATE_IN_EJBJAR	TokenNameIdentifier	 STATE  IN  EJBJAR
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_JAR	TokenNameIdentifier	 EJB  JAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseState	TokenNameIdentifier	 parse State
=	TokenNameEQUAL	
STATE_LOOKING_EJBJAR	TokenNameIdentifier	 STATE  LOOKING  EJBJAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * SAX parser call-back method invoked whenever characters are located within * an element. currentAttribute (modified by startElement and endElement) * tells us whether we are in an interesting element (one of the up to four * classes of an EJB). If so then converts the classname from the format * org.apache.tools.ant.Parser to the convention for storing such a class, * org/apache/tools/ant/Parser.class. This is then resolved into a file * object under the srcdir which is stored in a Hashtable. * @param ch A character array containing all the characters in * the element, and maybe others that should be ignored. * @param start An integer marking the position in the char * array to start reading from. * @param length An integer representing an offset into the * char array where the current data terminates. * @throws SAXException on error */	TokenNameCOMMENT_JAVADOC	 SAX parser call-back method invoked whenever characters are located within an element. currentAttribute (modified by startElement and endElement) tells us whether we are in an interesting element (one of the up to four classes of an EJB). If so then converts the classname from the format org.apache.tools.ant.Parser to the convention for storing such a class, org/apache/tools/ant/Parser.class. This is then resolved into a file object under the srcdir which is stored in a Hashtable. @param ch A character array containing all the characters in the element, and maybe others that should be ignored. @param start An integer marking the position in the char array to start reading from. @param length An integer representing an offset into the char array where the current data terminates. @throws SAXException on error 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
currentText	TokenNameIdentifier	 current Text
+=	TokenNamePLUS_EQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when an endelement is seen. * This may be overridden in derived classes. * This updates the ejbfiles if the element is an interface or a bean class. * This updates the ejbname if the element is an ejb name. */	TokenNameCOMMENT_JAVADOC	 Called when an endelement is seen. This may be overridden in derived classes. This updates the ejbfiles if the element is an interface or a bean class. This updates the ejbname if the element is an ejb name. 
protected	TokenNameprotected	
void	TokenNamevoid	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inEJBRef	TokenNameIdentifier	 in EJB Ref
||	TokenNameOR_OR	
(	TokenNameLPAREN	
parseState	TokenNameIdentifier	 parse State
!=	TokenNameNOT_EQUAL	
STATE_IN_ENTITY	TokenNameIdentifier	 STATE  IN  ENTITY
&&	TokenNameAND_AND	
parseState	TokenNameIdentifier	 parse State
!=	TokenNameNOT_EQUAL	
STATE_IN_SESSION	TokenNameIdentifier	 STATE  IN  SESSION
&&	TokenNameAND_AND	
parseState	TokenNameIdentifier	 parse State
!=	TokenNameNOT_EQUAL	
STATE_IN_MESSAGE	TokenNameIdentifier	 STATE  IN  MESSAGE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
HOME_INTERFACE	TokenNameIdentifier	 HOME  INTERFACE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOTE_INTERFACE	TokenNameIdentifier	 REMOTE  INTERFACE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LOCAL_INTERFACE	TokenNameIdentifier	 LOCAL  INTERFACE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
LOCAL_HOME_INTERFACE	TokenNameIdentifier	 LOCAL  HOME  INTERFACE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BEAN_CLASS	TokenNameIdentifier	 BEAN  CLASS
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PK_CLASS	TokenNameIdentifier	 PK  CLASS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the filename into a String object 	TokenNameCOMMENT_LINE	Get the filename into a String object 
File	TokenNameIdentifier	 File
classFile	TokenNameIdentifier	 class File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
currentText	TokenNameIdentifier	 current Text
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If it's a primitive wrapper then we shouldn't try and put 	TokenNameCOMMENT_LINE	If it's a primitive wrapper then we shouldn't try and put 
// it into the jar, so ignore it. 	TokenNameCOMMENT_LINE	it into the jar, so ignore it. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"java."	TokenNameStringLiteral	java.
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"javax."	TokenNameStringLiteral	javax.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Translate periods into path separators, add .class to the 	TokenNameCOMMENT_LINE	Translate periods into path separators, add .class to the 
// name, create the File object and add it to the Hashtable. 	TokenNameCOMMENT_LINE	name, create the File object and add it to the Hashtable. 
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
className	TokenNameIdentifier	 class Name
+=	TokenNamePLUS_EQUAL	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
classFile	TokenNameIdentifier	 class File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ejbFiles	TokenNameIdentifier	 ejb Files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
classFile	TokenNameIdentifier	 class File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Get the value of the <ejb-name> tag. Only the first occurrence. 	TokenNameCOMMENT_LINE	Get the value of the <ejb-name> tag. Only the first occurrence. 
if	TokenNameif	
(	TokenNameLPAREN	
currentElement	TokenNameIdentifier	 current Element
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EJB_NAME	TokenNameIdentifier	 EJB  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ejbName	TokenNameIdentifier	 ejb Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ejbName	TokenNameIdentifier	 ejb Name
=	TokenNameEQUAL	
currentText	TokenNameIdentifier	 current Text
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
