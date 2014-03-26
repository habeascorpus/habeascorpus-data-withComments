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
depend	TokenNameIdentifier	 depend
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipInputStream	TokenNameIdentifier	 Zip Input Stream
;	TokenNameSEMICOLON	
/** * A class file iterator which iterates through the contents of a Java jar * file. * */	TokenNameCOMMENT_JAVADOC	 A class file iterator which iterates through the contents of a Java jar file. 
public	TokenNamepublic	
class	TokenNameclass	
JarFileIterator	TokenNameIdentifier	 Jar File Iterator
implements	TokenNameimplements	
ClassFileIterator	TokenNameIdentifier	 Class File Iterator
{	TokenNameLBRACE	
/** The jar stream from the jar file being iterated over*/	TokenNameCOMMENT_JAVADOC	 The jar stream from the jar file being iterated over
private	TokenNameprivate	
ZipInputStream	TokenNameIdentifier	 Zip Input Stream
jarStream	TokenNameIdentifier	 jar Stream
;	TokenNameSEMICOLON	
/** * Construct an iterator over a jar stream * * @param stream the basic input stream from which the Jar is received * @exception IOException if the jar stream cannot be created */	TokenNameCOMMENT_JAVADOC	 Construct an iterator over a jar stream * @param stream the basic input stream from which the Jar is received @exception IOException if the jar stream cannot be created 
public	TokenNamepublic	
JarFileIterator	TokenNameIdentifier	 Jar File Iterator
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jarStream	TokenNameIdentifier	 jar Stream
=	TokenNameEQUAL	
new	TokenNamenew	
ZipInputStream	TokenNameIdentifier	 Zip Input Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next ClassFile object from the jar * * @return a ClassFile object describing the class from the jar */	TokenNameCOMMENT_JAVADOC	 Get the next ClassFile object from the jar * @return a ClassFile object describing the class from the jar 
public	TokenNamepublic	
ClassFile	TokenNameIdentifier	 Class File
getNextClassFile	TokenNameIdentifier	 get Next Class File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
jarEntry	TokenNameIdentifier	 jar Entry
;	TokenNameSEMICOLON	
ClassFile	TokenNameIdentifier	 Class File
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
jarEntry	TokenNameIdentifier	 jar Entry
=	TokenNameEQUAL	
jarStream	TokenNameIdentifier	 jar Stream
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextElement	TokenNameIdentifier	 next Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
jarEntry	TokenNameIdentifier	 jar Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
entryName	TokenNameIdentifier	 entry Name
=	TokenNameEQUAL	
jarEntry	TokenNameIdentifier	 jar Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
jarEntry	TokenNameIdentifier	 jar Entry
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
entryName	TokenNameIdentifier	 entry Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a data input stream from the jar input stream 	TokenNameCOMMENT_LINE	create a data input stream from the jar input stream 
ClassFile	TokenNameIdentifier	 Class File
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
new	TokenNamenew	
ClassFile	TokenNameIdentifier	 Class File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
jarStream	TokenNameIdentifier	 jar Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
javaClass	TokenNameIdentifier	 java Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
jarEntry	TokenNameIdentifier	 jar Entry
=	TokenNameEQUAL	
jarStream	TokenNameIdentifier	 jar Stream
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
+=	TokenNamePLUS_EQUAL	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Problem reading JAR file: "	TokenNameStringLiteral	Problem reading JAR file: 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nextElement	TokenNameIdentifier	 next Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
