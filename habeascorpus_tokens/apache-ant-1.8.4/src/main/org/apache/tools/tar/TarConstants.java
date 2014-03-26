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
/** * This interface contains all the definitions used in the package. * */	TokenNameCOMMENT_JAVADOC	 This interface contains all the definitions used in the package. 
// CheckStyle:InterfaceIsTypeCheck OFF (bc) 	TokenNameCOMMENT_LINE	CheckStyle:InterfaceIsTypeCheck OFF (bc) 
public	TokenNamepublic	
interface	TokenNameinterface	
TarConstants	TokenNameIdentifier	 Tar Constants
{	TokenNameLBRACE	
/** * The length of the name field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the name field in a header buffer. 
int	TokenNameint	
NAMELEN	TokenNameIdentifier	 NAMELEN
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the mode field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the mode field in a header buffer. 
int	TokenNameint	
MODELEN	TokenNameIdentifier	 MODELEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the user id field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the user id field in a header buffer. 
int	TokenNameint	
UIDLEN	TokenNameIdentifier	 UIDLEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the group id field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the group id field in a header buffer. 
int	TokenNameint	
GIDLEN	TokenNameIdentifier	 GIDLEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the checksum field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the checksum field in a header buffer. 
int	TokenNameint	
CHKSUMLEN	TokenNameIdentifier	 CHKSUMLEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the size field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the size field in a header buffer. 
int	TokenNameint	
SIZELEN	TokenNameIdentifier	 SIZELEN
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The maximum size of a file in a tar archive (That's 11 sevens, octal). */	TokenNameCOMMENT_JAVADOC	 The maximum size of a file in a tar archive (That's 11 sevens, octal). 
long	TokenNamelong	
MAXSIZE	TokenNameIdentifier	 MAXSIZE
=	TokenNameEQUAL	
077777777777L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The length of the magic field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the magic field in a header buffer. 
int	TokenNameint	
MAGICLEN	TokenNameIdentifier	 MAGICLEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the modification time field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the modification time field in a header buffer. 
int	TokenNameint	
MODTIMELEN	TokenNameIdentifier	 MODTIMELEN
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the user name field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the user name field in a header buffer. 
int	TokenNameint	
UNAMELEN	TokenNameIdentifier	 UNAMELEN
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the group name field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the group name field in a header buffer. 
int	TokenNameint	
GNAMELEN	TokenNameIdentifier	 GNAMELEN
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The length of the devices field in a header buffer. */	TokenNameCOMMENT_JAVADOC	 The length of the devices field in a header buffer. 
int	TokenNameint	
DEVLEN	TokenNameIdentifier	 DEVLEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * LF_ constants represent the "link flag" of an entry, or more commonly, * the "entry type". This is the "old way" of indicating a normal file. */	TokenNameCOMMENT_JAVADOC	 LF_ constants represent the "link flag" of an entry, or more commonly, the "entry type". This is the "old way" of indicating a normal file. 
byte	TokenNamebyte	
LF_OLDNORM	TokenNameIdentifier	 LF  OLDNORM
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Normal file type. */	TokenNameCOMMENT_JAVADOC	 Normal file type. 
byte	TokenNamebyte	
LF_NORMAL	TokenNameIdentifier	 LF  NORMAL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Link file type. */	TokenNameCOMMENT_JAVADOC	 Link file type. 
byte	TokenNamebyte	
LF_LINK	TokenNameIdentifier	 LF  LINK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'1'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Symbolic link file type. */	TokenNameCOMMENT_JAVADOC	 Symbolic link file type. 
byte	TokenNamebyte	
LF_SYMLINK	TokenNameIdentifier	 LF  SYMLINK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'2'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Character device file type. */	TokenNameCOMMENT_JAVADOC	 Character device file type. 
byte	TokenNamebyte	
LF_CHR	TokenNameIdentifier	 LF  CHR
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'3'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Block device file type. */	TokenNameCOMMENT_JAVADOC	 Block device file type. 
byte	TokenNamebyte	
LF_BLK	TokenNameIdentifier	 LF  BLK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'4'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Directory file type. */	TokenNameCOMMENT_JAVADOC	 Directory file type. 
byte	TokenNamebyte	
LF_DIR	TokenNameIdentifier	 LF  DIR
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'5'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * FIFO (pipe) file type. */	TokenNameCOMMENT_JAVADOC	 FIFO (pipe) file type. 
byte	TokenNamebyte	
LF_FIFO	TokenNameIdentifier	 LF  FIFO
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'6'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Contiguous file type. */	TokenNameCOMMENT_JAVADOC	 Contiguous file type. 
byte	TokenNamebyte	
LF_CONTIG	TokenNameIdentifier	 LF  CONTIG
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * The magic tag representing a POSIX tar archive. */	TokenNameCOMMENT_JAVADOC	 The magic tag representing a POSIX tar archive. 
String	TokenNameIdentifier	 String
TMAGIC	TokenNameIdentifier	 TMAGIC
=	TokenNameEQUAL	
"ustar"	TokenNameStringLiteral	ustar
;	TokenNameSEMICOLON	
/** * The magic tag representing a GNU tar archive. */	TokenNameCOMMENT_JAVADOC	 The magic tag representing a GNU tar archive. 
String	TokenNameIdentifier	 String
GNU_TMAGIC	TokenNameIdentifier	 GNU  TMAGIC
=	TokenNameEQUAL	
"ustar "	TokenNameStringLiteral	ustar 
;	TokenNameSEMICOLON	
/** * The namr of the GNU tar entry which contains a long name. */	TokenNameCOMMENT_JAVADOC	 The namr of the GNU tar entry which contains a long name. 
String	TokenNameIdentifier	 String
GNU_LONGLINK	TokenNameIdentifier	 GNU  LONGLINK
=	TokenNameEQUAL	
"././@LongLink"	TokenNameStringLiteral	././@LongLink
;	TokenNameSEMICOLON	
/** * Identifies the *next* file on the tape as having a long name. */	TokenNameCOMMENT_JAVADOC	 Identifies the *next* file on the tape as having a long name. 
byte	TokenNamebyte	
LF_GNUTYPE_LONGNAME	TokenNameIdentifier	 LF  GNUTYPE  LONGNAME
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'L'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
