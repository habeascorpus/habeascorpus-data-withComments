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
IOException	TokenNameIdentifier	 IO Exception
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
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileProvider	TokenNameIdentifier	 File Provider
;	TokenNameSEMICOLON	
/** * Describes a "File-like" resource (File, ZipEntry, etc.). * * This class is meant to be used by classes needing to record path * and date/time information about a file, a zip entry or some similar * resource (URL, archive in a version control repository, ...). * * @since Ant 1.5.2 * @see org.apache.tools.ant.types.resources.Touchable */	TokenNameCOMMENT_JAVADOC	 Describes a "File-like" resource (File, ZipEntry, etc.). * This class is meant to be used by classes needing to record path and date/time information about a file, a zip entry or some similar resource (URL, archive in a version control repository, ...). * @since Ant 1.5.2 @see org.apache.tools.ant.types.resources.Touchable 
public	TokenNamepublic	
class	TokenNameclass	
Resource	TokenNameIdentifier	 Resource
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Comparable	TokenNameIdentifier	 Comparable
,	TokenNameCOMMA	
ResourceCollection	TokenNameIdentifier	 Resource Collection
{	TokenNameLBRACE	
/** Constant unknown size */	TokenNameCOMMENT_JAVADOC	 Constant unknown size 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constant unknown datetime for getLastModified */	TokenNameCOMMENT_JAVADOC	 Constant unknown datetime for getLastModified 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Magic number */	TokenNameCOMMENT_JAVADOC	 Magic number 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAGIC	TokenNameIdentifier	 MAGIC
=	TokenNameEQUAL	
getMagicNumber	TokenNameIdentifier	 get Magic Number
(	TokenNameLPAREN	
"Resource"	TokenNameStringLiteral	Resource
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL_NAME	TokenNameIdentifier	 NULL  NAME
=	TokenNameEQUAL	
getMagicNumber	TokenNameIdentifier	 get Magic Number
(	TokenNameLPAREN	
"null name"	TokenNameStringLiteral	null name
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a "magic number" for use in hashCode calculations. * @param seed byte[] to seed with. * @return a magic number as int. */	TokenNameCOMMENT_JAVADOC	 Create a "magic number" for use in hashCode calculations. @param seed byte[] to seed with. @return a magic number as int. 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getMagicNumber	TokenNameIdentifier	 get Magic Number
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
exists	TokenNameIdentifier	 exists
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
lastmodified	TokenNameIdentifier	 lastmodified
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Only sets the name. * * <p>This is a dummy, used for not existing resources.</p> * * @param name relative path of the resource. Expects * &quot;/&quot; to be used as the directory separator. */	TokenNameCOMMENT_JAVADOC	 Only sets the name. * <p>This is a dummy, used for not existing resources.</p> * @param name relative path of the resource. Expects &quot;/&quot; to be used as the directory separator. 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name, lastmodified flag, and exists flag. * * @param name relative path of the resource. Expects * &quot;/&quot; to be used as the directory separator. * @param exists if true, this resource exists. * @param lastmodified the last modification time of this resource. */	TokenNameCOMMENT_JAVADOC	 Sets the name, lastmodified flag, and exists flag. * @param name relative path of the resource. Expects &quot;/&quot; to be used as the directory separator. @param exists if true, this resource exists. @param lastmodified the last modification time of this resource. 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
,	TokenNameCOMMA	
long	TokenNamelong	
lastmodified	TokenNameIdentifier	 lastmodified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
exists	TokenNameIdentifier	 exists
,	TokenNameCOMMA	
lastmodified	TokenNameIdentifier	 lastmodified
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name, lastmodified flag, exists flag, and directory flag. * * @param name relative path of the resource. Expects * &quot;/&quot; to be used as the directory separator. * @param exists if true the resource exists * @param lastmodified the last modification time of the resource * @param directory if true, this resource is a directory */	TokenNameCOMMENT_JAVADOC	 Sets the name, lastmodified flag, exists flag, and directory flag. * @param name relative path of the resource. Expects &quot;/&quot; to be used as the directory separator. @param exists if true the resource exists @param lastmodified the last modification time of the resource @param directory if true, this resource is a directory 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
,	TokenNameCOMMA	
long	TokenNamelong	
lastmodified	TokenNameIdentifier	 lastmodified
,	TokenNameCOMMA	
boolean	TokenNameboolean	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
exists	TokenNameIdentifier	 exists
,	TokenNameCOMMA	
lastmodified	TokenNameIdentifier	 lastmodified
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name, lastmodified flag, exists flag, directory flag, and size. * * @param name relative path of the resource. Expects * &quot;/&quot; to be used as the directory separator. * @param exists if true the resource exists * @param lastmodified the last modification time of the resource * @param directory if true, this resource is a directory * @param size the size of this resource. */	TokenNameCOMMENT_JAVADOC	 Sets the name, lastmodified flag, exists flag, directory flag, and size. * @param name relative path of the resource. Expects &quot;/&quot; to be used as the directory separator. @param exists if true the resource exists @param lastmodified the last modification time of the resource @param directory if true, this resource is a directory @param size the size of this resource. 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
,	TokenNameCOMMA	
long	TokenNamelong	
lastmodified	TokenNameIdentifier	 lastmodified
,	TokenNameCOMMA	
boolean	TokenNameboolean	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
exists	TokenNameIdentifier	 exists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
lastmodified	TokenNameIdentifier	 lastmodified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Name attribute will contain the path of a file relative to the * root directory of its fileset or the recorded path of a zip * entry. * * <p>example for a file with fullpath /var/opt/adm/resource.txt * in a file set with root dir /var/opt it will be * adm/resource.txt.</p> * * <p>&quot;/&quot; will be used as the directory separator.</p> * @return the name of this resource. */	TokenNameCOMMENT_JAVADOC	 Name attribute will contain the path of a file relative to the root directory of its fileset or the recorded path of a zip entry. * <p>example for a file with fullpath /var/opt/adm/resource.txt in a file set with root dir /var/opt it will be adm/resource.txt.</p> * <p>&quot;/&quot; will be used as the directory separator.</p> @return the name of this resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of this Resource. * @param name relative path of the resource. Expects * &quot;/&quot; to be used as the directory separator. */	TokenNameCOMMENT_JAVADOC	 Set the name of this Resource. @param name relative path of the resource. Expects &quot;/&quot; to be used as the directory separator. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The exists attribute tells whether a resource exists. * @return true if this resource exists. */	TokenNameCOMMENT_JAVADOC	 The exists attribute tells whether a resource exists. @return true if this resource exists. 
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
//default true: 	TokenNameCOMMENT_LINE	default true: 
return	TokenNamereturn	
exists	TokenNameIdentifier	 exists
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
exists	TokenNameIdentifier	 exists
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the exists attribute. * @param exists if true, this resource exists. */	TokenNameCOMMENT_JAVADOC	 Set the exists attribute. @param exists if true, this resource exists. 
public	TokenNamepublic	
void	TokenNamevoid	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
=	TokenNameEQUAL	
exists	TokenNameIdentifier	 exists
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells the modification time in milliseconds since 01.01.1970 (the "epoch"). * * @return the modification time, if that is meaningful * (e.g. for a file resource which exists); * 0 if the resource does not exist, to mirror the behavior * of {@link java.io.File#lastModified}; * or 0 if the notion of modification time is meaningless for this class * of resource (e.g. an inline string) */	TokenNameCOMMENT_JAVADOC	 Tells the modification time in milliseconds since 01.01.1970 (the "epoch"). * @return the modification time, if that is meaningful (e.g. for a file resource which exists); 0 if the resource does not exist, to mirror the behavior of {@link java.io.File#lastModified}; or 0 if the notion of modification time is meaningless for this class of resource (e.g. an inline string) 
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
lastmodified	TokenNameIdentifier	 lastmodified
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
lastmodified	TokenNameIdentifier	 lastmodified
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
?	TokenNameQUESTION	
UNKNOWN_DATETIME	TokenNameIdentifier	 UNKNOWN  DATETIME
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the last modification attribute. * @param lastmodified the modification time in milliseconds since 01.01.1970. */	TokenNameCOMMENT_JAVADOC	 Set the last modification attribute. @param lastmodified the modification time in milliseconds since 01.01.1970. 
public	TokenNamepublic	
void	TokenNamevoid	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
long	TokenNamelong	
lastmodified	TokenNameIdentifier	 lastmodified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastmodified	TokenNameIdentifier	 lastmodified
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
lastmodified	TokenNameIdentifier	 lastmodified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the resource is a directory. * @return boolean flag indicating if the resource is a directory. */	TokenNameCOMMENT_JAVADOC	 Tells if the resource is a directory. @return boolean flag indicating if the resource is a directory. 
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
//default false: 	TokenNameCOMMENT_LINE	default false: 
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the directory attribute. * @param directory if true, this resource is a directory. */	TokenNameCOMMENT_JAVADOC	 Set the directory attribute. @param directory if true, this resource is a directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
boolean	TokenNameboolean	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the size of this Resource. * @param size the size, as a long. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Set the size of this Resource. @param size the size, as a long. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
?	TokenNameQUESTION	
size	TokenNameIdentifier	 size
:	TokenNameCOLON	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size of this Resource. * @return the size, as a long, 0 if the Resource does not exist (for * compatibility with java.io.File), or UNKNOWN_SIZE if not known. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Get the size of this Resource. @return the size, as a long, 0 if the Resource does not exist (for compatibility with java.io.File), or UNKNOWN_SIZE if not known. @since Ant 1.6.3 
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
return	TokenNamereturn	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
size	TokenNameIdentifier	 size
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
)	TokenNameRPAREN	
:	TokenNameCOLON	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone this Resource. * @return copy of this. */	TokenNameCOMMENT_JAVADOC	 Clone this Resource. @return copy of this. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"CloneNotSupportedException for a Resource caught. "	TokenNameStringLiteral	CloneNotSupportedException for a Resource caught. 
+	TokenNamePLUS	
"Derived classes must support cloning."	TokenNameStringLiteral	Derived classes must support cloning.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegates to a comparison of names. * @param other the object to compare to. * @return a negative integer, zero, or a positive integer as this Resource * is less than, equal to, or greater than the specified Resource. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Delegates to a comparison of names. @param other the object to compare to. @return a negative integer, zero, or a positive integer as this Resource is less than, equal to, or greater than the specified Resource. @since Ant 1.6 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
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
Comparable	TokenNameIdentifier	 Comparable
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Can only be compared with Resources"	TokenNameStringLiteral	Can only be compared with Resources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement basic Resource equality. * @param other the object to check against. * @return true if the specified Object is equal to this Resource. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Implement basic Resource equality. @param other the object to check against. @return true if the specified Object is equal to this Resource. @since Ant 1.7 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
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
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
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
&&	TokenNameAND_AND	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the hash code for this Resource. * @return hash code as int. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the hash code for this Resource. @return hash code as int. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
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
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
MAGIC	TokenNameIdentifier	 MAGIC
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
NULL_NAME	TokenNameIdentifier	 NULL  NAME
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an InputStream for the Resource. * @return an InputStream containing this Resource's content. * @throws IOException if unable to provide the content of this * Resource as a stream. * @throws UnsupportedOperationException if InputStreams are not * supported for this Resource type. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get an InputStream for the Resource. @return an InputStream containing this Resource's content. @throws IOException if unable to provide the content of this Resource as a stream. @throws UnsupportedOperationException if InputStreams are not supported for this Resource type. @since Ant 1.7 
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an OutputStream for the Resource. * @return an OutputStream to which content can be written. * @throws IOException if unable to provide the content of this * Resource as a stream. * @throws UnsupportedOperationException if OutputStreams are not * supported for this Resource type. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get an OutputStream for the Resource. @return an OutputStream to which content can be written. @throws IOException if unable to provide the content of this Resource as a stream. @throws UnsupportedOperationException if OutputStreams are not supported for this Resource type. @since Ant 1.7 
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return an Iterator of Resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return an Iterator of Resources. @since Ant 1.7 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return the size of this ResourceCollection. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return the size of this ResourceCollection. @since Ant 1.7 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return whether this Resource is a FileProvider. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return whether this Resource is a FileProvider. @since Ant 1.7 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string representation of this Resource. * @return this Resource formatted as a String. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the string representation of this Resource. @return this Resource formatted as a String. @since Ant 1.7 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
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
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"(anonymous)"	TokenNameStringLiteral	(anonymous)
:	TokenNameCOLON	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a long String representation of this Resource. * This typically should be the value of <code>toString()</code> * prefixed by a type description. * @return this Resource formatted as a long String. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get a long String representation of this Resource. This typically should be the value of <code>toString()</code> prefixed by a type description. @return this Resource formatted as a long String. @since Ant 1.7 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toLongString	TokenNameIdentifier	 to Long String
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
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLongString	TokenNameIdentifier	 to Long String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ""	TokenNameStringLiteral	 "
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'"'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides the base version. * @param r the Reference to set. */	TokenNameCOMMENT_JAVADOC	 Overrides the base version. @param r the Reference to set. 
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
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
exists	TokenNameIdentifier	 exists
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lastmodified	TokenNameIdentifier	 lastmodified
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
size	TokenNameIdentifier	 size
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
/** * Returns a view of this resource that implements the interface * given as the argument or null if there is no such view. * * <p>This allows extension interfaces to be added to resources * without growing the number of permutations of interfaces * decorators/adapters need to implement.</p> * * <p>This implementation of the method will return the current * instance itself if it can be assigned to the given class.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns a view of this resource that implements the interface given as the argument or null if there is no such view. * <p>This allows extension interfaces to be added to resources without growing the number of permutations of interfaces decorators/adapters need to implement.</p> * <p>This implementation of the method will return the current instance itself if it can be assigned to the given class.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
