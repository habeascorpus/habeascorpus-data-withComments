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
resources	TokenNameIdentifier	 resources
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
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
ResourceCollection	TokenNameIdentifier	 Resource Collection
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
Reference	TokenNameIdentifier	 Reference
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
;	TokenNameSEMICOLON	
/** * A Resource representation of an entry in a zipfile. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 A Resource representation of an entry in a zipfile. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
ZipResource	TokenNameIdentifier	 Zip Resource
extends	TokenNameextends	
ArchiveResource	TokenNameIdentifier	 Archive Resource
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extras	TokenNameIdentifier	 extras
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ZipResource	TokenNameIdentifier	 Zip Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a ZipResource representing the specified * entry in the specified zipfile. * @param z the zipfile as File. * @param enc the encoding used for filenames. * @param e the ZipEntry. */	TokenNameCOMMENT_JAVADOC	 Construct a ZipResource representing the specified entry in the specified zipfile. @param z the zipfile as File. @param enc the encoding used for filenames. @param e the ZipEntry. 
public	TokenNamepublic	
ZipResource	TokenNameIdentifier	 Zip Resource
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
,	TokenNameCOMMA	
ZipEntry	TokenNameIdentifier	 Zip Entry
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the zipfile that holds this ZipResource. * @param z the zipfile as a File. */	TokenNameCOMMENT_JAVADOC	 Set the zipfile that holds this ZipResource. @param z the zipfile as a File. 
public	TokenNamepublic	
void	TokenNamevoid	
setZipfile	TokenNameIdentifier	 set Zipfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArchive	TokenNameIdentifier	 set Archive
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the zipfile that holds this ZipResource. * @return the zipfile as a File. */	TokenNameCOMMENT_JAVADOC	 Get the zipfile that holds this ZipResource. @return the zipfile as a File. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getZipfile	TokenNameIdentifier	 get Zipfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileProvider	TokenNameIdentifier	 File Provider
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
)	TokenNameRPAREN	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the archive that holds this as a single element Resource * collection. * @param a the archive as a single element Resource collection. */	TokenNameCOMMENT_JAVADOC	 Sets the archive that holds this as a single element Resource collection. @param a the archive as a single element Resource collection. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only filesystem resources are supported"	TokenNameStringLiteral	only filesystem resources are supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the encoding to use with the zipfile. * @param enc the String encoding. */	TokenNameCOMMENT_JAVADOC	 Set the encoding to use with the zipfile. @param enc the String encoding. 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the encoding to use with the zipfile. * @return String encoding. */	TokenNameCOMMENT_JAVADOC	 Get the encoding to use with the zipfile. @return String encoding. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipResource	TokenNameIdentifier	 Zip Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides the super version. * @param r the Reference to set. */	TokenNameCOMMENT_JAVADOC	 Overrides the super version. @param r the Reference to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an InputStream for reading the contents of this Resource. * @return an InputStream object. * @throws IOException if the zip file cannot be opened, * or the entry cannot be read. */	TokenNameCOMMENT_JAVADOC	 Return an InputStream for reading the contents of this Resource. @return an InputStream object. @throws IOException if the zip file cannot be opened, or the entry cannot be read. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ZipFile	TokenNameIdentifier	 Zip File
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
getZipfile	TokenNameIdentifier	 get Zipfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"no entry "	TokenNameStringLiteral	no entry 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FilterInputStream	TokenNameIdentifier	 Filter Input Stream
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an OutputStream for the Resource. * @return an OutputStream to which content can be written. * @throws IOException if unable to provide the content of this * Resource as a stream. * @throws UnsupportedOperationException if OutputStreams are not * supported for this Resource type. */	TokenNameCOMMENT_JAVADOC	 Get an OutputStream for the Resource. @return an OutputStream to which content can be written. @throws IOException if unable to provide the content of this Resource as a stream. @throws UnsupportedOperationException if OutputStreams are not supported for this Resource type. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Use the zip task for zip output."	TokenNameStringLiteral	Use the zip task for zip output.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves extra fields. * @return an array of the extra fields * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Retrieves extra fields. @return an array of the extra fields @since Ant 1.8.0 
public	TokenNamepublic	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipResource	TokenNameIdentifier	 Zip Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extras	TokenNameIdentifier	 extras
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
extras	TokenNameIdentifier	 extras
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The compression method that has been used. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The compression method that has been used. @since Ant 1.8.0 
public	TokenNamepublic	
int	TokenNameint	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * fetches information from the named entry inside the archive. */	TokenNameCOMMENT_JAVADOC	 fetches information from the named entry inside the archive. 
protected	TokenNameprotected	
void	TokenNamevoid	
fetchEntry	TokenNameIdentifier	 fetch Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
getZipfile	TokenNameIdentifier	 get Zipfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setEntry	TokenNameIdentifier	 set Entry
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getUnixMode	TokenNameIdentifier	 get Unix Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extras	TokenNameIdentifier	 extras
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
