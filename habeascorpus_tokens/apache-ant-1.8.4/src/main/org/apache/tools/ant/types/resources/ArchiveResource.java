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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
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
/** * A Resource representation of an entry inside an archive. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 A Resource representation of an entry inside an archive. @since Ant 1.7 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ArchiveResource	TokenNameIdentifier	 Archive Resource
extends	TokenNameextends	
Resource	TokenNameIdentifier	 Resource
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL_ARCHIVE	TokenNameIdentifier	 NULL  ARCHIVE
=	TokenNameEQUAL	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
getMagicNumber	TokenNameIdentifier	 get Magic Number
(	TokenNameLPAREN	
"null archive"	TokenNameStringLiteral	null archive
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
archive	TokenNameIdentifier	 archive
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveEntry	TokenNameIdentifier	 have Entry
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
modeSet	TokenNameIdentifier	 mode Set
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
protected	TokenNameprotected	
ArchiveResource	TokenNameIdentifier	 Archive Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a ArchiveResource representing the specified * entry in the specified archive. * @param a the archive as File. */	TokenNameCOMMENT_JAVADOC	 Construct a ArchiveResource representing the specified entry in the specified archive. @param a the archive as File. 
protected	TokenNameprotected	
ArchiveResource	TokenNameIdentifier	 Archive Resource
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ArchiveResource representing the specified * entry in the specified archive. * @param a the archive as File. * @param withEntry if the entry has been specified. */	TokenNameCOMMENT_JAVADOC	 Construct a ArchiveResource representing the specified entry in the specified archive. @param a the archive as File. @param withEntry if the entry has been specified. 
protected	TokenNameprotected	
ArchiveResource	TokenNameIdentifier	 Archive Resource
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withEntry	TokenNameIdentifier	 with Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArchive	TokenNameIdentifier	 set Archive
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveEntry	TokenNameIdentifier	 have Entry
=	TokenNameEQUAL	
withEntry	TokenNameIdentifier	 with Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ArchiveResource representing the specified * entry in the specified archive. * @param a the archive as Resource. * @param withEntry if the entry has been specified. */	TokenNameCOMMENT_JAVADOC	 Construct a ArchiveResource representing the specified entry in the specified archive. @param a the archive as Resource. @param withEntry if the entry has been specified. 
protected	TokenNameprotected	
ArchiveResource	TokenNameIdentifier	 Archive Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withEntry	TokenNameIdentifier	 with Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveEntry	TokenNameIdentifier	 have Entry
=	TokenNameEQUAL	
withEntry	TokenNameIdentifier	 with Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the archive that holds this Resource. * @param a the archive as a File. */	TokenNameCOMMENT_JAVADOC	 Set the archive that holds this Resource. @param a the archive as a File. 
public	TokenNamepublic	
void	TokenNamevoid	
setArchive	TokenNameIdentifier	 set Archive
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the file or dir mode for this resource. * @param mode integer representation of Unix permission mask. */	TokenNameCOMMENT_JAVADOC	 Sets the file or dir mode for this resource. @param mode integer representation of Unix permission mask. 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
modeSet	TokenNameIdentifier	 mode Set
=	TokenNameEQUAL	
true	TokenNametrue	
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
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you must not specify more than one"	TokenNameStringLiteral	you must not specify more than one
+	TokenNamePLUS	
" archive"	TokenNameStringLiteral	 archive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only single argument resource collections"	TokenNameStringLiteral	only single argument resource collections
+	TokenNamePLUS	
" are supported as archives"	TokenNameStringLiteral	 are supported as archives
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
archive	TokenNameIdentifier	 archive
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the archive that holds this Resource. * @return the archive as a Resource. */	TokenNameCOMMENT_JAVADOC	 Get the archive that holds this Resource. @return the archive as a Resource. 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
getArchive	TokenNameIdentifier	 get Archive
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
ArchiveResource	TokenNameIdentifier	 Archive Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
archive	TokenNameIdentifier	 archive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last modified date of this Resource. * @return the last modification date. */	TokenNameCOMMENT_JAVADOC	 Get the last modified date of this Resource. @return the last modification date. 
public	TokenNamepublic	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size of this Resource. * @return the long size of this Resource. */	TokenNameCOMMENT_JAVADOC	 Get the size of this Resource. @return the long size of this Resource. 
public	TokenNamepublic	
long	TokenNamelong	
getSize	TokenNameIdentifier	 get Size
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether this Resource represents a directory. * @return boolean flag indicating whether the entry is a directory. */	TokenNameCOMMENT_JAVADOC	 Learn whether this Resource represents a directory. @return boolean flag indicating whether the entry is a directory. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether this Resource represents an existing Resource. * @return boolean existence flag. */	TokenNameCOMMENT_JAVADOC	 Find out whether this Resource represents an existing Resource. @return boolean existence flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExists	TokenNameIdentifier	 is Exists
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file or dir mode for this Resource. * @return integer representation of Unix permission mask. */	TokenNameCOMMENT_JAVADOC	 Get the file or dir mode for this Resource. @return integer representation of Unix permission mask. 
public	TokenNamepublic	
int	TokenNameint	
getMode	TokenNameIdentifier	 get Mode
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
ArchiveResource	TokenNameIdentifier	 Archive Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mode	TokenNameIdentifier	 mode
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
archive	TokenNameIdentifier	 archive
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
modeSet	TokenNameIdentifier	 mode Set
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
/** * Compare this ArchiveResource to another Resource. * @param another the other Resource against which to compare. * @return a negative integer, zero, or a positive integer as this Resource * is less than, equal to, or greater than the specified Resource. */	TokenNameCOMMENT_JAVADOC	 Compare this ArchiveResource to another Resource. @param another the other Resource against which to compare. @return a negative integer, zero, or a positive integer as this Resource is less than, equal to, or greater than the specified Resource. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare another Object to this ArchiveResource for equality. * @param another the other Object to compare. * @return true if another is a Resource representing * the same entry in the same archive. */	TokenNameCOMMENT_JAVADOC	 Compare another Object to this ArchiveResource for equality. @param another the other Object to compare. @return true if another is a Resource representing the same entry in the same archive. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
another	TokenNameIdentifier	 another
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
another	TokenNameIdentifier	 another
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArchiveResource	TokenNameIdentifier	 Archive Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArchiveResource	TokenNameIdentifier	 Archive Resource
)	TokenNameRPAREN	
another	TokenNameIdentifier	 another
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the hash code for this Resource. * @return hash code as int. */	TokenNameCOMMENT_JAVADOC	 Get the hash code for this Resource. @return hash code as int. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
NULL_ARCHIVE	TokenNameIdentifier	 NULL  ARCHIVE
:	TokenNameCOLON	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format this Resource as a String. * @return String representatation of this Resource. */	TokenNameCOMMENT_JAVADOC	 Format this Resource as a String. @return String representatation of this Resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validate settings and ensure that the represented "archive entry" * has been established. */	TokenNameCOMMENT_JAVADOC	 Validate settings and ensure that the represented "archive entry" has been established. 
protected	TokenNameprotected	
final	TokenNamefinal	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
checkEntry	TokenNameIdentifier	 check Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
haveEntry	TokenNameIdentifier	 have Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"entry name not set"	TokenNameStringLiteral	entry name not set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getArchive	TokenNameIdentifier	 get Archive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"archive attribute not set"	TokenNameStringLiteral	archive attribute not set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not exist."	TokenNameStringLiteral	 does not exist.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
" denotes a directory."	TokenNameStringLiteral	 denotes a directory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fetchEntry	TokenNameIdentifier	 fetch Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveEntry	TokenNameIdentifier	 have Entry
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fetch information from the named entry inside the archive. */	TokenNameCOMMENT_JAVADOC	 Fetch information from the named entry inside the archive. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
fetchEntry	TokenNameIdentifier	 fetch Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
archive	TokenNameIdentifier	 archive
,	TokenNameCOMMA	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
