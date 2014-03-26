/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This package is based on the work done by Timothy Gerard Endres * (time@ice.com) to whom the Ant project is very grateful for his great code. */	TokenNameCOMMENT_BLOCK	 This package is based on the work done by Timothy Gerard Endres (time@ice.com) to whom the Ant project is very grateful for his great code. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
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
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * This class represents an entry in a Tar archive. It consists * of the entry's header, as well as the entry's File. Entries * can be instantiated in one of three ways, depending on how * they are to be used. * <p> * TarEntries that are created from the header bytes read from * an archive are instantiated with the TarEntry( byte[] ) * constructor. These entries will be used when extracting from * or listing the contents of an archive. These entries have their * header filled in using the header bytes. They also set the File * to null, since they reference an archive entry not a file. * <p> * TarEntries that are created from Files that are to be written * into an archive are instantiated with the TarEntry( File ) * constructor. These entries have their header filled in using * the File's information. They also keep a reference to the File * for convenience when writing entries. * <p> * Finally, TarEntries can be constructed from nothing but a name. * This allows the programmer to construct the entry by hand, for * instance when only an InputStream is available for writing to * the archive, and the header information is constructed from * other information. In this case the header fields are set to * defaults and the File is set to null. * * <p> * The C structure for a Tar Entry's header is: * <pre> * struct header { * char name[NAMSIZ]; * char mode[8]; * char uid[8]; * char gid[8]; * char size[12]; * char mtime[12]; * char chksum[8]; * char linkflag; * char linkname[NAMSIZ]; * char magic[8]; * char uname[TUNMLEN]; * char gname[TGNMLEN]; * char devmajor[8]; * char devminor[8]; * } header; * </pre> * */	TokenNameCOMMENT_JAVADOC	 This class represents an entry in a Tar archive. It consists of the entry's header, as well as the entry's File. Entries can be instantiated in one of three ways, depending on how they are to be used. <p> TarEntries that are created from the header bytes read from an archive are instantiated with the TarEntry( byte[] ) constructor. These entries will be used when extracting from or listing the contents of an archive. These entries have their header filled in using the header bytes. They also set the File to null, since they reference an archive entry not a file. <p> TarEntries that are created from Files that are to be written into an archive are instantiated with the TarEntry( File ) constructor. These entries have their header filled in using the File's information. They also keep a reference to the File for convenience when writing entries. <p> Finally, TarEntries can be constructed from nothing but a name. This allows the programmer to construct the entry by hand, for instance when only an InputStream is available for writing to the archive, and the header information is constructed from other information. In this case the header fields are set to defaults and the File is set to null. * <p> The C structure for a Tar Entry's header is: <pre> struct header { char name[NAMSIZ]; char mode[8]; char uid[8]; char gid[8]; char size[12]; char mtime[12]; char chksum[8]; char linkflag; char linkname[NAMSIZ]; char magic[8]; char uname[TUNMLEN]; char gname[TGNMLEN]; char devmajor[8]; char devminor[8]; } header; </pre> 
public	TokenNamepublic	
class	TokenNameclass	
TarEntry	TokenNameIdentifier	 Tar Entry
implements	TokenNameimplements	
TarConstants	TokenNameIdentifier	 Tar Constants
{	TokenNameLBRACE	
/** The entry's name. */	TokenNameCOMMENT_JAVADOC	 The entry's name. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** The entry's permission mode. */	TokenNameCOMMENT_JAVADOC	 The entry's permission mode. 
private	TokenNameprivate	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
/** The entry's user id. */	TokenNameCOMMENT_JAVADOC	 The entry's user id. 
private	TokenNameprivate	
int	TokenNameint	
userId	TokenNameIdentifier	 user Id
;	TokenNameSEMICOLON	
/** The entry's group id. */	TokenNameCOMMENT_JAVADOC	 The entry's group id. 
private	TokenNameprivate	
int	TokenNameint	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
/** The entry's size. */	TokenNameCOMMENT_JAVADOC	 The entry's size. 
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** The entry's modification time. */	TokenNameCOMMENT_JAVADOC	 The entry's modification time. 
private	TokenNameprivate	
long	TokenNamelong	
modTime	TokenNameIdentifier	 mod Time
;	TokenNameSEMICOLON	
/** The entry's link flag. */	TokenNameCOMMENT_JAVADOC	 The entry's link flag. 
private	TokenNameprivate	
byte	TokenNamebyte	
linkFlag	TokenNameIdentifier	 link Flag
;	TokenNameSEMICOLON	
/** The entry's link name. */	TokenNameCOMMENT_JAVADOC	 The entry's link name. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
linkName	TokenNameIdentifier	 link Name
;	TokenNameSEMICOLON	
/** The entry's magic tag. */	TokenNameCOMMENT_JAVADOC	 The entry's magic tag. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
magic	TokenNameIdentifier	 magic
;	TokenNameSEMICOLON	
/** The entry's user name. */	TokenNameCOMMENT_JAVADOC	 The entry's user name. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
/** The entry's group name. */	TokenNameCOMMENT_JAVADOC	 The entry's group name. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
groupName	TokenNameIdentifier	 group Name
;	TokenNameSEMICOLON	
/** The entry's major device number. */	TokenNameCOMMENT_JAVADOC	 The entry's major device number. 
private	TokenNameprivate	
int	TokenNameint	
devMajor	TokenNameIdentifier	 dev Major
;	TokenNameSEMICOLON	
/** The entry's minor device number. */	TokenNameCOMMENT_JAVADOC	 The entry's minor device number. 
private	TokenNameprivate	
int	TokenNameint	
devMinor	TokenNameIdentifier	 dev Minor
;	TokenNameSEMICOLON	
/** The entry's file reference */	TokenNameCOMMENT_JAVADOC	 The entry's file reference 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** Maximum length of a user's name in the tar file */	TokenNameCOMMENT_JAVADOC	 Maximum length of a user's name in the tar file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_NAMELEN	TokenNameIdentifier	 MAX  NAMELEN
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default permissions bits for directories */	TokenNameCOMMENT_JAVADOC	 Default permissions bits for directories 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_DIR_MODE	TokenNameIdentifier	 DEFAULT  DIR  MODE
=	TokenNameEQUAL	
040755	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default permissions bits for files */	TokenNameCOMMENT_JAVADOC	 Default permissions bits for files 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_FILE_MODE	TokenNameIdentifier	 DEFAULT  FILE  MODE
=	TokenNameEQUAL	
0100644	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Convert millis to seconds */	TokenNameCOMMENT_JAVADOC	 Convert millis to seconds 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct an empty entry and prepares the header values. */	TokenNameCOMMENT_JAVADOC	 Construct an empty entry and prepares the header values. 
private	TokenNameprivate	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
TMAGIC	TokenNameIdentifier	 TMAGIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkName	TokenNameIdentifier	 link Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.name"	TokenNameStringLiteral	user.name
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
MAX_NAMELEN	TokenNameIdentifier	 MAX  NAMELEN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MAX_NAMELEN	TokenNameIdentifier	 MAX  NAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an entry with only a name. This allows the programmer * to construct the entry's header "by hand". File is set to null. * * @param name the entry name */	TokenNameCOMMENT_JAVADOC	 Construct an entry with only a name. This allows the programmer to construct the entry's header "by hand". File is set to null. * @param name the entry name 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an entry with only a name. This allows the programmer * to construct the entry's header "by hand". File is set to null. * * @param name the entry name * @param preserveLeadingSlashes whether to allow leading slashes * in the name. */	TokenNameCOMMENT_JAVADOC	 Construct an entry with only a name. This allows the programmer to construct the entry's header "by hand". File is set to null. * @param name the entry name @param preserveLeadingSlashes whether to allow leading slashes in the name. 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preserveLeadingSlashes	TokenNameIdentifier	 preserve Leading Slashes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
normalizeFileName	TokenNameIdentifier	 normalize File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
preserveLeadingSlashes	TokenNameIdentifier	 preserve Leading Slashes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDir	TokenNameIdentifier	 is Dir
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMajor	TokenNameIdentifier	 dev Major
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMinor	TokenNameIdentifier	 dev Minor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
isDir	TokenNameIdentifier	 is Dir
?	TokenNameQUESTION	
DEFAULT_DIR_MODE	TokenNameIdentifier	 DEFAULT  DIR  MODE
:	TokenNameCOLON	
DEFAULT_FILE_MODE	TokenNameIdentifier	 DEFAULT  FILE  MODE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkFlag	TokenNameIdentifier	 link Flag
=	TokenNameEQUAL	
isDir	TokenNameIdentifier	 is Dir
?	TokenNameQUESTION	
LF_DIR	TokenNameIdentifier	 LF  DIR
:	TokenNameCOLON	
LF_NORMAL	TokenNameIdentifier	 LF  NORMAL
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkName	TokenNameIdentifier	 link Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMajor	TokenNameIdentifier	 dev Major
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMinor	TokenNameIdentifier	 dev Minor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an entry with a name and a link flag. * * @param name the entry name * @param linkFlag the entry link flag. */	TokenNameCOMMENT_JAVADOC	 Construct an entry with a name and a link flag. * @param name the entry name @param linkFlag the entry link flag. 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
linkFlag	TokenNameIdentifier	 link Flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkFlag	TokenNameIdentifier	 link Flag
=	TokenNameEQUAL	
linkFlag	TokenNameIdentifier	 link Flag
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linkFlag	TokenNameIdentifier	 link Flag
==	TokenNameEQUAL_EQUAL	
LF_GNUTYPE_LONGNAME	TokenNameIdentifier	 LF  GNUTYPE  LONGNAME
)	TokenNameRPAREN	
{	TokenNameLBRACE	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
GNU_TMAGIC	TokenNameIdentifier	 GNU  TMAGIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an entry for a file. File is set to file, and the * header is constructed from information from the file. * * @param file The file that the entry represents. */	TokenNameCOMMENT_JAVADOC	 Construct an entry for a file. File is set to file, and the header is constructed from information from the file. * @param file The file that the entry represents. 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
normalizeFileName	TokenNameIdentifier	 normalize File Name
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkName	TokenNameIdentifier	 link Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
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
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
DEFAULT_DIR_MODE	TokenNameIdentifier	 DEFAULT  DIR  MODE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkFlag	TokenNameIdentifier	 link Flag
=	TokenNameEQUAL	
LF_DIR	TokenNameIdentifier	 LF  DIR
;	TokenNameSEMICOLON	
int	TokenNameint	
nameLength	TokenNameIdentifier	 name Length
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameLength	TokenNameIdentifier	 name Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
nameLength	TokenNameIdentifier	 name Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
DEFAULT_FILE_MODE	TokenNameIdentifier	 DEFAULT  FILE  MODE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
linkFlag	TokenNameIdentifier	 link Flag
=	TokenNameEQUAL	
LF_NORMAL	TokenNameIdentifier	 LF  NORMAL
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMajor	TokenNameIdentifier	 dev Major
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
devMinor	TokenNameIdentifier	 dev Minor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an entry from an archive's header bytes. File is set * to null. * * @param headerBuf The header bytes from a tar archive entry. */	TokenNameCOMMENT_JAVADOC	 Construct an entry from an archive's header bytes. File is set to null. * @param headerBuf The header bytes from a tar archive entry. 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
headerBuf	TokenNameIdentifier	 header Buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseTarHeader	TokenNameIdentifier	 parse Tar Header
(	TokenNameLPAREN	
headerBuf	TokenNameIdentifier	 header Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if the two entries are equal. Equality is determined * by the header names being equal. * * @param it Entry to be checked for equality. * @return True if the entries are equal. */	TokenNameCOMMENT_JAVADOC	 Determine if the two entries are equal. Equality is determined by the header names being equal. * @param it Entry to be checked for equality. @return True if the entries are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TarEntry	TokenNameIdentifier	 Tar Entry
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if the two entries are equal. Equality is determined * by the header names being equal. * * @param it Entry to be checked for equality. * @return True if the entries are equal. */	TokenNameCOMMENT_JAVADOC	 Determine if the two entries are equal. Equality is determined by the header names being equal. * @param it Entry to be checked for equality. @return True if the entries are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarEntry	TokenNameIdentifier	 Tar Entry
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Hashcodes are based on entry names. * * @return the entry hashcode */	TokenNameCOMMENT_JAVADOC	 Hashcodes are based on entry names. * @return the entry hashcode 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine if the given entry is a descendant of this entry. * Descendancy is determined by the name of the descendant * starting with this entry's name. * * @param desc Entry to be checked as a descendent of this. * @return True if entry is a descendant of this. */	TokenNameCOMMENT_JAVADOC	 Determine if the given entry is a descendant of this entry. Descendancy is determined by the name of the descendant starting with this entry's name. * @param desc Entry to be checked as a descendent of this. @return True if entry is a descendant of this. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDescendent	TokenNameIdentifier	 is Descendent
(	TokenNameLPAREN	
TarEntry	TokenNameIdentifier	 Tar Entry
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's name. * * @return This entry's name. */	TokenNameCOMMENT_JAVADOC	 Get this entry's name. * @return This entry's name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's name. * * @param name This entry's new name. */	TokenNameCOMMENT_JAVADOC	 Set this entry's name. * @param name This entry's new name. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
normalizeFileName	TokenNameIdentifier	 normalize File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the mode for this entry * * @param mode the mode for this entry */	TokenNameCOMMENT_JAVADOC	 Set the mode for this entry * @param mode the mode for this entry 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's link name. * * @return This entry's link name. */	TokenNameCOMMENT_JAVADOC	 Get this entry's link name. * @return This entry's link name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLinkName	TokenNameIdentifier	 get Link Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
linkName	TokenNameIdentifier	 link Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's user id. * * @return This entry's user id. */	TokenNameCOMMENT_JAVADOC	 Get this entry's user id. * @return This entry's user id. 
public	TokenNamepublic	
int	TokenNameint	
getUserId	TokenNameIdentifier	 get User Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userId	TokenNameIdentifier	 user Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's user id. * * @param userId This entry's new user id. */	TokenNameCOMMENT_JAVADOC	 Set this entry's user id. * @param userId This entry's new user id. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserId	TokenNameIdentifier	 set User Id
(	TokenNameLPAREN	
int	TokenNameint	
userId	TokenNameIdentifier	 user Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
userId	TokenNameIdentifier	 user Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's group id. * * @return This entry's group id. */	TokenNameCOMMENT_JAVADOC	 Get this entry's group id. * @return This entry's group id. 
public	TokenNamepublic	
int	TokenNameint	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's group id. * * @param groupId This entry's new group id. */	TokenNameCOMMENT_JAVADOC	 Set this entry's group id. * @param groupId This entry's new group id. 
public	TokenNamepublic	
void	TokenNamevoid	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
int	TokenNameint	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's user name. * * @return This entry's user name. */	TokenNameCOMMENT_JAVADOC	 Get this entry's user name. * @return This entry's user name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userName	TokenNameIdentifier	 user Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's user name. * * @param userName This entry's new user name. */	TokenNameCOMMENT_JAVADOC	 Set this entry's user name. * @param userName This entry's new user name. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's group name. * * @return This entry's group name. */	TokenNameCOMMENT_JAVADOC	 Get this entry's group name. * @return This entry's group name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupName	TokenNameIdentifier	 get Group Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupName	TokenNameIdentifier	 group Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's group name. * * @param groupName This entry's new group name. */	TokenNameCOMMENT_JAVADOC	 Set this entry's group name. * @param groupName This entry's new group name. 
public	TokenNamepublic	
void	TokenNamevoid	
setGroupName	TokenNameIdentifier	 set Group Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience method to set this entry's group and user ids. * * @param userId This entry's new user id. * @param groupId This entry's new group id. */	TokenNameCOMMENT_JAVADOC	 Convenience method to set this entry's group and user ids. * @param userId This entry's new user id. @param groupId This entry's new group id. 
public	TokenNamepublic	
void	TokenNamevoid	
setIds	TokenNameIdentifier	 set Ids
(	TokenNameLPAREN	
int	TokenNameint	
userId	TokenNameIdentifier	 user Id
,	TokenNameCOMMA	
int	TokenNameint	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUserId	TokenNameIdentifier	 set User Id
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience method to set this entry's group and user names. * * @param userName This entry's new user name. * @param groupName This entry's new group name. */	TokenNameCOMMENT_JAVADOC	 Convenience method to set this entry's group and user names. * @param userName This entry's new user name. @param groupName This entry's new group name. 
public	TokenNamepublic	
void	TokenNamevoid	
setNames	TokenNameIdentifier	 set Names
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setGroupName	TokenNameIdentifier	 set Group Name
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's modification time. The parameter passed * to this method is in "Java time". * * @param time This entry's new modification time. */	TokenNameCOMMENT_JAVADOC	 Set this entry's modification time. The parameter passed to this method is in "Java time". * @param time This entry's new modification time. 
public	TokenNamepublic	
void	TokenNamevoid	
setModTime	TokenNameIdentifier	 set Mod Time
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
/	TokenNameDIVIDE	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's modification time. * * @param time This entry's new modification time. */	TokenNameCOMMENT_JAVADOC	 Set this entry's modification time. * @param time This entry's new modification time. 
public	TokenNamepublic	
void	TokenNamevoid	
setModTime	TokenNameIdentifier	 set Mod Time
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's modification time. * * @return time This entry's new modification time. */	TokenNameCOMMENT_JAVADOC	 Set this entry's modification time. * @return time This entry's new modification time. 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
getModTime	TokenNameIdentifier	 get Mod Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
modTime	TokenNameIdentifier	 mod Time
*	TokenNameMULTIPLY	
MILLIS_PER_SECOND	TokenNameIdentifier	 MILLIS  PER  SECOND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's file. * * @return This entry's file. */	TokenNameCOMMENT_JAVADOC	 Get this entry's file. * @return This entry's file. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's mode. * * @return This entry's mode. */	TokenNameCOMMENT_JAVADOC	 Get this entry's mode. * @return This entry's mode. 
public	TokenNamepublic	
int	TokenNameint	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this entry's file size. * * @return This entry's file size. */	TokenNameCOMMENT_JAVADOC	 Get this entry's file size. * @return This entry's file size. 
public	TokenNamepublic	
long	TokenNamelong	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set this entry's file size. * * @param size This entry's new file size. */	TokenNameCOMMENT_JAVADOC	 Set this entry's file size. * @param size This entry's new file size. 
public	TokenNamepublic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate if this entry is a GNU long name block * * @return true if this is a long name extension provided by GNU tar */	TokenNameCOMMENT_JAVADOC	 Indicate if this entry is a GNU long name block * @return true if this is a long name extension provided by GNU tar 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGNULongNameEntry	TokenNameIdentifier	 is GNU Long Name Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
linkFlag	TokenNameIdentifier	 link Flag
==	TokenNameEQUAL_EQUAL	
LF_GNUTYPE_LONGNAME	TokenNameIdentifier	 LF  GNUTYPE  LONGNAME
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
GNU_LONGLINK	TokenNameIdentifier	 GNU  LONGLINK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return whether or not this entry represents a directory. * * @return True if this entry is a directory. */	TokenNameCOMMENT_JAVADOC	 Return whether or not this entry represents a directory. * @return True if this entry is a directory. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
linkFlag	TokenNameIdentifier	 link Flag
==	TokenNameEQUAL_EQUAL	
LF_DIR	TokenNameIdentifier	 LF  DIR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this entry represents a file, and the file is a directory, return * an array of TarEntries for this entry's children. * * @return An array of TarEntry's for this entry's children. */	TokenNameCOMMENT_JAVADOC	 If this entry represents a file, and the file is a directory, return an array of TarEntries for this entry's children. * @return An array of TarEntry's for this entry's children. 
public	TokenNamepublic	
TarEntry	TokenNameIdentifier	 Tar Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDirectoryEntries	TokenNameIdentifier	 get Directory Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarEntry	TokenNameIdentifier	 Tar Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write an entry's header information to a header buffer. * * @param outbuf The tar entry header buffer to fill in. */	TokenNameCOMMENT_JAVADOC	 Write an entry's header information to a header buffer. * @param outbuf The tar entry header buffer to fill in. 
public	TokenNamepublic	
void	TokenNamevoid	
writeEntryHeader	TokenNameIdentifier	 write Entry Header
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outbuf	TokenNameIdentifier	 outbuf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
NAMELEN	TokenNameIdentifier	 NAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MODELEN	TokenNameIdentifier	 MODELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
UIDLEN	TokenNameIdentifier	 UIDLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
GIDLEN	TokenNameIdentifier	 GIDLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getLongOctalBytes	TokenNameIdentifier	 get Long Octal Bytes
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
SIZELEN	TokenNameIdentifier	 SIZELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getLongOctalBytes	TokenNameIdentifier	 get Long Octal Bytes
(	TokenNameLPAREN	
modTime	TokenNameIdentifier	 mod Time
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MODTIMELEN	TokenNameIdentifier	 MODTIMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
csOffset	TokenNameIdentifier	 cs Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
CHKSUMLEN	TokenNameIdentifier	 CHKSUMLEN
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outbuf	TokenNameIdentifier	 outbuf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outbuf	TokenNameIdentifier	 outbuf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
linkFlag	TokenNameIdentifier	 link Flag
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
linkName	TokenNameIdentifier	 link Name
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
NAMELEN	TokenNameIdentifier	 NAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
magic	TokenNameIdentifier	 magic
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MAGICLEN	TokenNameIdentifier	 MAGICLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
UNAMELEN	TokenNameIdentifier	 UNAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getNameBytes	TokenNameIdentifier	 get Name Bytes
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
GNAMELEN	TokenNameIdentifier	 GNAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
devMajor	TokenNameIdentifier	 dev Major
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
DEVLEN	TokenNameIdentifier	 DEVLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getOctalBytes	TokenNameIdentifier	 get Octal Bytes
(	TokenNameLPAREN	
devMinor	TokenNameIdentifier	 dev Minor
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
DEVLEN	TokenNameIdentifier	 DEVLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
outbuf	TokenNameIdentifier	 outbuf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outbuf	TokenNameIdentifier	 outbuf
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
chk	TokenNameIdentifier	 chk
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
computeCheckSum	TokenNameIdentifier	 compute Check Sum
(	TokenNameLPAREN	
outbuf	TokenNameIdentifier	 outbuf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
getCheckSumOctalBytes	TokenNameIdentifier	 get Check Sum Octal Bytes
(	TokenNameLPAREN	
chk	TokenNameIdentifier	 chk
,	TokenNameCOMMA	
outbuf	TokenNameIdentifier	 outbuf
,	TokenNameCOMMA	
csOffset	TokenNameIdentifier	 cs Offset
,	TokenNameCOMMA	
CHKSUMLEN	TokenNameIdentifier	 CHKSUMLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse an entry's header information from a header buffer. * * @param header The tar entry header buffer to get information from. */	TokenNameCOMMENT_JAVADOC	 Parse an entry's header information from a header buffer. * @param header The tar entry header buffer to get information from. 
public	TokenNamepublic	
void	TokenNamevoid	
parseTarHeader	TokenNameIdentifier	 parse Tar Header
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
NAMELEN	TokenNameIdentifier	 NAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
NAMELEN	TokenNameIdentifier	 NAMELEN
;	TokenNameSEMICOLON	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MODELEN	TokenNameIdentifier	 MODELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
MODELEN	TokenNameIdentifier	 MODELEN
;	TokenNameSEMICOLON	
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
UIDLEN	TokenNameIdentifier	 UIDLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
UIDLEN	TokenNameIdentifier	 UIDLEN
;	TokenNameSEMICOLON	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
GIDLEN	TokenNameIdentifier	 GIDLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
GIDLEN	TokenNameIdentifier	 GIDLEN
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
SIZELEN	TokenNameIdentifier	 SIZELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
SIZELEN	TokenNameIdentifier	 SIZELEN
;	TokenNameSEMICOLON	
modTime	TokenNameIdentifier	 mod Time
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MODTIMELEN	TokenNameIdentifier	 MODTIMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
MODTIMELEN	TokenNameIdentifier	 MODTIMELEN
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
CHKSUMLEN	TokenNameIdentifier	 CHKSUMLEN
;	TokenNameSEMICOLON	
linkFlag	TokenNameIdentifier	 link Flag
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
linkName	TokenNameIdentifier	 link Name
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
NAMELEN	TokenNameIdentifier	 NAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
NAMELEN	TokenNameIdentifier	 NAMELEN
;	TokenNameSEMICOLON	
magic	TokenNameIdentifier	 magic
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MAGICLEN	TokenNameIdentifier	 MAGICLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
MAGICLEN	TokenNameIdentifier	 MAGICLEN
;	TokenNameSEMICOLON	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
UNAMELEN	TokenNameIdentifier	 UNAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
UNAMELEN	TokenNameIdentifier	 UNAMELEN
;	TokenNameSEMICOLON	
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseName	TokenNameIdentifier	 parse Name
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
GNAMELEN	TokenNameIdentifier	 GNAMELEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
GNAMELEN	TokenNameIdentifier	 GNAMELEN
;	TokenNameSEMICOLON	
devMajor	TokenNameIdentifier	 dev Major
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
DEVLEN	TokenNameIdentifier	 DEVLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
DEVLEN	TokenNameIdentifier	 DEVLEN
;	TokenNameSEMICOLON	
devMinor	TokenNameIdentifier	 dev Minor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
TarUtils	TokenNameIdentifier	 Tar Utils
.	TokenNameDOT	
parseOctal	TokenNameIdentifier	 parse Octal
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
DEVLEN	TokenNameIdentifier	 DEVLEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strips Windows' drive letter as well as any leading slashes, * turns path separators into forward slahes. */	TokenNameCOMMENT_JAVADOC	 Strips Windows' drive letter as well as any leading slashes, turns path separators into forward slahes. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
normalizeFileName	TokenNameIdentifier	 normalize File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
preserveLeadingSlashes	TokenNameIdentifier	 preserve Leading Slashes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
osname	TokenNameIdentifier	 osname
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
osname	TokenNameIdentifier	 osname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Strip off drive letters! 	TokenNameCOMMENT_LINE	Strip off drive letters! 
// REVIEW Would a better check be "(File.separator == '\')"? 	TokenNameCOMMENT_LINE	REVIEW Would a better check be "(File.separator == '\')"? 
if	TokenNameif	
(	TokenNameLPAREN	
osname	TokenNameIdentifier	 osname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"windows"	TokenNameStringLiteral	windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch1	TokenNameIdentifier	 ch1
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch1	TokenNameIdentifier	 ch1
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
osname	TokenNameIdentifier	 osname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
colon	TokenNameIdentifier	 colon
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
colon	TokenNameIdentifier	 colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No absolute pathnames 	TokenNameCOMMENT_LINE	No absolute pathnames 
// Windows (and Posix?) paths can start with "\\NetworkDrive\", 	TokenNameCOMMENT_LINE	Windows (and Posix?) paths can start with "\\NetworkDrive\", 
// so we loop on starting /'s. 	TokenNameCOMMENT_LINE	so we loop on starting /'s. 
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
preserveLeadingSlashes	TokenNameIdentifier	 preserve Leading Slashes
&&	TokenNameAND_AND	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
