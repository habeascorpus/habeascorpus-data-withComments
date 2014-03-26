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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * A ZipFileSet is a FileSet with extra attributes useful in the context of * Zip/Jar tasks. * * A ZipFileSet extends FileSets with the ability to extract a subset of the * entries of a Zip file for inclusion in another Zip file. It also includes * a prefix attribute which is prepended to each entry in the output Zip file. * * Since ant 1.6 ZipFileSet can be defined with an id and referenced in packaging tasks * */	TokenNameCOMMENT_JAVADOC	 A ZipFileSet is a FileSet with extra attributes useful in the context of Zip/Jar tasks. * A ZipFileSet extends FileSets with the ability to extract a subset of the entries of a Zip file for inclusion in another Zip file. It also includes a prefix attribute which is prepended to each entry in the output Zip file. * Since ant 1.6 ZipFileSet can be defined with an id and referenced in packaging tasks 
public	TokenNamepublic	
class	TokenNameclass	
ZipFileSet	TokenNameIdentifier	 Zip File Set
extends	TokenNameextends	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Constructor for ZipFileSet */	TokenNameCOMMENT_JAVADOC	 Constructor for ZipFileSet 
public	TokenNamepublic	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a fileset arguement. * @param fileset the fileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a fileset arguement. @param fileset the fileset to use 
protected	TokenNameprotected	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a zipfileset arguement. * @param fileset the zipfileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a zipfileset arguement. @param fileset the zipfileset to use 
protected	TokenNameprotected	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the encoding used for this ZipFileSet. * @param enc encoding as String. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Set the encoding used for this ZipFileSet. @param enc encoding as String. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkZipFileSetAttributesAllowed	TokenNameIdentifier	 check Zip File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the encoding used for this ZipFileSet. * @return String encoding. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the encoding used for this ZipFileSet. @return String encoding. @since Ant 1.7 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
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
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
instanceof	TokenNameinstanceof	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a new archive scanner based on this one. * @return a new ZipScanner with the same encoding as this one. */	TokenNameCOMMENT_JAVADOC	 Return a new archive scanner based on this one. @return a new ZipScanner with the same encoding as this one. 
protected	TokenNameprotected	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
newArchiveScanner	TokenNameIdentifier	 new Archive Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipScanner	TokenNameIdentifier	 Zip Scanner
zs	TokenNameIdentifier	 zs
=	TokenNameEQUAL	
new	TokenNamenew	
ZipScanner	TokenNameIdentifier	 Zip Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zs	TokenNameIdentifier	 zs
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
zs	TokenNameIdentifier	 zs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A ZipFileset accepts another ZipFileSet or a FileSet as reference * FileSets are often used by the war task for the lib attribute * @param p the project to use * @return the abstract fileset instance */	TokenNameCOMMENT_JAVADOC	 A ZipFileset accepts another ZipFileSet or a FileSet as reference FileSets are often used by the war task for the lib attribute @param p the project to use @return the abstract fileset instance 
protected	TokenNameprotected	
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipFileSet	TokenNameIdentifier	 Zip File Set
zfs	TokenNameIdentifier	 zfs
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configureFileSet	TokenNameIdentifier	 configure File Set
(	TokenNameLPAREN	
zfs	TokenNameIdentifier	 zfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
zfs	TokenNameIdentifier	 zfs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't denote a zipfileset or a fileset"	TokenNameStringLiteral	 doesn't denote a zipfileset or a fileset
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a ZipFileSet that has the same properties * as this one. * @return the cloned zipFileSet */	TokenNameCOMMENT_JAVADOC	 Return a ZipFileSet that has the same properties as this one. @return the cloned zipFileSet 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
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
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A check attributes for zipFileSet. * If there is a reference, and * it is a ZipFileSet, the zip fileset attributes * cannot be used. */	TokenNameCOMMENT_JAVADOC	 A check attributes for zipFileSet. If there is a reference, and it is a ZipFileSet, the zip fileset attributes cannot be used. 
private	TokenNameprivate	
void	TokenNamevoid	
checkZipFileSetAttributesAllowed	TokenNameIdentifier	 check Zip File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
