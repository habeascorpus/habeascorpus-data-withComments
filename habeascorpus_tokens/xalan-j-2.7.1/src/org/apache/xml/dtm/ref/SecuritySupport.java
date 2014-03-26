/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SecuritySupport.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SecuritySupport.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * This class is duplicated for each Xalan-Java subpackage so keep it in sync. * It is package private and therefore is not exposed as part of the Xalan-Java * API. * * Base class with security related methods that work on JDK 1.1. */	TokenNameCOMMENT_JAVADOC	 This class is duplicated for each Xalan-Java subpackage so keep it in sync. It is package private and therefore is not exposed as part of the Xalan-Java API. * Base class with security related methods that work on JDK 1.1. 
class	TokenNameclass	
SecuritySupport	TokenNameIdentifier	 Security Support
{	TokenNameLBRACE	
/* * Make this of type Object so that the verifier won't try to * prove its type, thus possibly trying to load the SecuritySupport12 * class. */	TokenNameCOMMENT_BLOCK	 Make this of type Object so that the verifier won't try to prove its type, thus possibly trying to load the SecuritySupport12 class. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
securitySupport	TokenNameIdentifier	 security Support
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
SecuritySupport	TokenNameIdentifier	 Security Support
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.security.AccessController"	TokenNameStringLiteral	java.security.AccessController
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if that worked, we're on 1.2. 	TokenNameCOMMENT_LINE	if that worked, we're on 1.2. 
/* // don't reference the class explicitly so it doesn't // get dragged in accidentally. c = Class.forName("javax.mail.SecuritySupport12"); Constructor cons = c.getConstructor(new Class[] { }); ss = (SecuritySupport)cons.newInstance(new Object[] { }); */	TokenNameCOMMENT_BLOCK	 // don't reference the class explicitly so it doesn't // get dragged in accidentally. c = Class.forName("javax.mail.SecuritySupport12"); Constructor cons = c.getConstructor(new Class[] { }); ss = (SecuritySupport)cons.newInstance(new Object[] { }); 
/* * Unfortunately, we can't load the class using reflection * because the class is package private. And the class has * to be package private so the APIs aren't exposed to other * code that could use them to circumvent security. Thus, * we accept the risk that the direct reference might fail * on some JDK 1.1 JVMs, even though we would never execute * this code in such a case. Sigh... */	TokenNameCOMMENT_BLOCK	 Unfortunately, we can't load the class using reflection because the class is package private. And the class has to be package private so the APIs aren't exposed to other code that could use them to circumvent security. Thus, we accept the risk that the direct reference might fail on some JDK 1.1 JVMs, even though we would never execute this code in such a case. Sigh... 
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SecuritySupport12	TokenNameIdentifier	 Security Support12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore it 	TokenNameCOMMENT_LINE	ignore it 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
SecuritySupport	TokenNameIdentifier	 Security Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
securitySupport	TokenNameIdentifier	 security Support
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return an appropriate instance of this class, depending on whether * we're on a JDK 1.1 or J2SE 1.2 (or later) system. */	TokenNameCOMMENT_JAVADOC	 Return an appropriate instance of this class, depending on whether we're on a JDK 1.1 or J2SE 1.2 (or later) system. 
static	TokenNamestatic	
SecuritySupport	TokenNameIdentifier	 Security Support
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SecuritySupport	TokenNameIdentifier	 Security Support
)	TokenNameRPAREN	
securitySupport	TokenNameIdentifier	 security Support
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
getSystemClassLoader	TokenNameIdentifier	 get System Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
getParentClassLoader	TokenNameIdentifier	 get Parent Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propName	TokenNameIdentifier	 prop Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propName	TokenNameIdentifier	 prop Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
getFileInputStream	TokenNameIdentifier	 get File Input Stream
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
ris	TokenNameIdentifier	 ris
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ris	TokenNameIdentifier	 ris
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ris	TokenNameIdentifier	 ris
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ris	TokenNameIdentifier	 ris
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
getFileExists	TokenNameIdentifier	 get File Exists
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
