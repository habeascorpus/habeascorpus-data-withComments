/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * Adds Unix file permission and UID/GID fields as well as symbolic * link handling. * * <p>This class uses the ASi extra field in the format: * <pre> * Value Size Description * ----- ---- ----------- * (Unix3) 0x756e Short tag for this extra block type * TSize Short total data size for this block * CRC Long CRC-32 of the remaining data * Mode Short file permissions * SizDev Long symlink'd size OR major/minor dev num * UID Short user ID * GID Short group ID * (var.) variable symbolic link filename * </pre> * taken from appnote.iz (Info-ZIP note, 981119) found at <a * href="ftp://ftp.uu.net/pub/archiving/zip/doc/">ftp://ftp.uu.net/pub/archiving/zip/doc/</a></p> * * <p>Short is two bytes and Long is four bytes in big endian byte and * word order, device numbers are currently not supported.</p> * */	TokenNameCOMMENT_JAVADOC	 Adds Unix file permission and UID/GID fields as well as symbolic link handling. * <p>This class uses the ASi extra field in the format: <pre> Value Size Description ----- ---- ----------- (Unix3) 0x756e Short tag for this extra block type TSize Short total data size for this block CRC Long CRC-32 of the remaining data Mode Short file permissions SizDev Long symlink'd size OR major/minor dev num UID Short user ID GID Short group ID (var.) variable symbolic link filename </pre> taken from appnote.iz (Info-ZIP note, 981119) found at <a href="ftp://ftp.uu.net/pub/archiving/zip/doc/">ftp://ftp.uu.net/pub/archiving/zip/doc/</a></p> * <p>Short is two bytes and Long is four bytes in big endian byte and word order, device numbers are currently not supported.</p> 
public	TokenNamepublic	
class	TokenNameclass	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
implements	TokenNameimplements	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
,	TokenNameCOMMA	
UnixStat	TokenNameIdentifier	 Unix Stat
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ZipShort	TokenNameIdentifier	 Zip Short
HEADER_ID	TokenNameIdentifier	 HEADER  ID
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0x756E	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD	TokenNameIdentifier	 WORD
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Standard Unix stat(2) file mode. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Standard Unix stat(2) file mode. * @since 1.1 
private	TokenNameprivate	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * User ID. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 User ID. * @since 1.1 
private	TokenNameprivate	
int	TokenNameint	
uid	TokenNameIdentifier	 uid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Group ID. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Group ID. * @since 1.1 
private	TokenNameprivate	
int	TokenNameint	
gid	TokenNameIdentifier	 gid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * File this entry points to, if it is a symbolic link. * * <p>empty string - if entry is not a symbolic link.</p> * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 File this entry points to, if it is a symbolic link. * <p>empty string - if entry is not a symbolic link.</p> * @since 1.1 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Is this an entry for a directory? * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Is this an entry for a directory? * @since 1.1 
private	TokenNameprivate	
boolean	TokenNameboolean	
dirFlag	TokenNameIdentifier	 dir Flag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Instance used to calculate checksums. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Instance used to calculate checksums. * @since 1.1 
private	TokenNameprivate	
CRC32	TokenNameIdentifier	 CR C32
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Constructor for AsiExtraField. */	TokenNameCOMMENT_JAVADOC	 Constructor for AsiExtraField. 
public	TokenNamepublic	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The Header-ID. * @return the value for the header id for this extrafield * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The Header-ID. @return the value for the header id for this extrafield @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
HEADER_ID	TokenNameIdentifier	 HEADER  ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Length of the extra field in the local file data - without * Header-ID or length specifier. * @return a <code>ZipShort</code> for the length of the data of this extra field * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Length of the extra field in the local file data - without Header-ID or length specifier. @return a <code>ZipShort</code> for the length of the data of this extra field @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
WORD	TokenNameIdentifier	 WORD
// CRC 	TokenNameCOMMENT_LINE	CRC 
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
// Mode 	TokenNameCOMMENT_LINE	Mode 
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
// SizDev 	TokenNameCOMMENT_LINE	SizDev 
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
// UID 	TokenNameCOMMENT_LINE	UID 
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
// GID 	TokenNameCOMMENT_LINE	GID 
+	TokenNamePLUS	
getLinkedFile	TokenNameIdentifier	 get Linked File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegate to local file data. * @return the centralDirectory length * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Delegate to local file data. @return the centralDirectory length @since 1.1 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual data to put into local file data - without Header-ID * or length specifier. * @return get the data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The actual data to put into local file data - without Header-ID or length specifier. @return get the data @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CRC will be added later 	TokenNameCOMMENT_LINE	CRC will be added later 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
linkArray	TokenNameIdentifier	 link Array
=	TokenNameEQUAL	
getLinkedFile	TokenNameIdentifier	 get Linked File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
linkArray	TokenNameIdentifier	 link Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
getUserId	TokenNameIdentifier	 get User Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
linkArray	TokenNameIdentifier	 link Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
linkArray	TokenNameIdentifier	 link Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
checksum	TokenNameIdentifier	 checksum
=	TokenNameEQUAL	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
checksum	TokenNameIdentifier	 checksum
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegate to local file data. * @return the local file data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Delegate to local file data. @return the local file data @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user id. * @param uid the user id * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Set the user id. @param uid the user id @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setUserId	TokenNameIdentifier	 set User Id
(	TokenNameLPAREN	
int	TokenNameint	
uid	TokenNameIdentifier	 uid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uid	TokenNameIdentifier	 uid
=	TokenNameEQUAL	
uid	TokenNameIdentifier	 uid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the user id. * @return the user id * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get the user id. @return the user id @since 1.1 
public	TokenNamepublic	
int	TokenNameint	
getUserId	TokenNameIdentifier	 get User Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uid	TokenNameIdentifier	 uid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the group id. * @param gid the group id * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Set the group id. @param gid the group id @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
int	TokenNameint	
gid	TokenNameIdentifier	 gid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gid	TokenNameIdentifier	 gid
=	TokenNameEQUAL	
gid	TokenNameIdentifier	 gid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the group id. * @return the group id * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get the group id. @return the group id @since 1.1 
public	TokenNamepublic	
int	TokenNameint	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gid	TokenNameIdentifier	 gid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate that this entry is a symbolic link to the given filename. * * @param name Name of the file this entry links to, empty String * if it is not a symbolic link. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Indicate that this entry is a symbolic link to the given filename. * @param name Name of the file this entry links to, empty String if it is not a symbolic link. * @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setLinkedFile	TokenNameIdentifier	 set Linked File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Name of linked file * * @return name of the file this entry links to if it is a * symbolic link, the empty string otherwise. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Name of linked file * @return name of the file this entry links to if it is a symbolic link, the empty string otherwise. * @since 1.1 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLinkedFile	TokenNameIdentifier	 get Linked File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
link	TokenNameIdentifier	 link
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is this entry a symbolic link? * @return true if this is a symbolic link * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Is this entry a symbolic link? @return true if this is a symbolic link @since 1.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLink	TokenNameIdentifier	 is Link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLinkedFile	TokenNameIdentifier	 get Linked File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * File mode of this file. * @param mode the file mode * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 File mode of this file. @param mode the file mode @since 1.1 
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
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * File mode of this file. * @return the file mode * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 File mode of this file. @return the file mode @since 1.1 
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
/** * Indicate whether this entry is a directory. * @param dirFlag if true, this entry is a directory * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Indicate whether this entry is a directory. @param dirFlag if true, this entry is a directory @since 1.1 
public	TokenNamepublic	
void	TokenNamevoid	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
boolean	TokenNameboolean	
dirFlag	TokenNameIdentifier	 dir Flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dirFlag	TokenNameIdentifier	 dir Flag
=	TokenNameEQUAL	
dirFlag	TokenNameIdentifier	 dir Flag
;	TokenNameSEMICOLON	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is this entry a directory? * @return true if this entry is a directory * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Is this entry a directory? @return true if this entry is a directory @since 1.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dirFlag	TokenNameIdentifier	 dir Flag
&&	TokenNameAND_AND	
!	TokenNameNOT	
isLink	TokenNameIdentifier	 is Link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populate data from this array as if it was in local file data. * @param data an array of bytes * @param offset the start offset * @param length the number of bytes in the array from offset * @since 1.1 * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in local file data. @param data an array of bytes @param offset the start offset @param length the number of bytes in the array from offset @since 1.1 @throws ZipException on error 
public	TokenNamepublic	
void	TokenNamevoid	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
{	TokenNameLBRACE	
long	TokenNamelong	
givenChecksum	TokenNameIdentifier	 given Checksum
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
WORD	TokenNameIdentifier	 WORD
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
WORD	TokenNameIdentifier	 WORD
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
WORD	TokenNameIdentifier	 WORD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
realChecksum	TokenNameIdentifier	 real Checksum
=	TokenNameEQUAL	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
givenChecksum	TokenNameIdentifier	 given Checksum
!=	TokenNameNOT_EQUAL	
realChecksum	TokenNameIdentifier	 real Checksum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"bad CRC checksum "	TokenNameStringLiteral	bad CRC checksum 
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
givenChecksum	TokenNameIdentifier	 given Checksum
)	TokenNameRPAREN	
+	TokenNamePLUS	
" instead of "	TokenNameStringLiteral	 instead of 
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
realChecksum	TokenNameIdentifier	 real Checksum
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
newMode	TokenNameIdentifier	 new Mode
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
linkArray	TokenNameIdentifier	 link Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
uid	TokenNameIdentifier	 uid
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gid	TokenNameIdentifier	 gid
=	TokenNameEQUAL	
ZipShort	TokenNameIdentifier	 Zip Short
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linkArray	TokenNameIdentifier	 link Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
linkArray	TokenNameIdentifier	 link Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
linkArray	TokenNameIdentifier	 link Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
link	TokenNameIdentifier	 link
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
linkArray	TokenNameIdentifier	 link Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newMode	TokenNameIdentifier	 new Mode
&	TokenNameAND	
DIR_FLAG	TokenNameIdentifier	 DIR  FLAG
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
newMode	TokenNameIdentifier	 new Mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the file mode for given permissions with the correct file type. * @param mode the mode * @return the type with the mode * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get the file mode for given permissions with the correct file type. @param mode the mode @return the type with the mode @since 1.1 
protected	TokenNameprotected	
int	TokenNameint	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
FILE_FLAG	TokenNameIdentifier	 FILE  FLAG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLink	TokenNameIdentifier	 is Link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LINK_FLAG	TokenNameIdentifier	 LINK  FLAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DIR_FLAG	TokenNameIdentifier	 DIR  FLAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
|	TokenNameOR	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
&	TokenNameAND	
PERM_MASK	TokenNameIdentifier	 PERM  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cloned	TokenNameIdentifier	 cloned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// impossible 	TokenNameCOMMENT_LINE	impossible 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
