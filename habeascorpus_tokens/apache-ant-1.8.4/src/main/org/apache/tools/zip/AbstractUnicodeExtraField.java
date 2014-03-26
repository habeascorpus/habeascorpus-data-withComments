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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
/** * A common base class for Unicode extra information extra fields. */	TokenNameCOMMENT_JAVADOC	 A common base class for Unicode extra information extra fields. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
implements	TokenNameimplements	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
nameCRC32	TokenNameIdentifier	 name CR C32
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unicodeName	TokenNameIdentifier	 unicode Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Assemble as unicode extension from the name/comment and * encoding of the orginal zip entry. * * @param text The file name or comment. * @param bytes The encoded of the filename or comment in the zip * file. * @param off The offset of the encoded filename or comment in * <code>bytes</code>. * @param len The length of the encoded filename or commentin * <code>bytes</code>. */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode extension from the name/comment and encoding of the orginal zip entry. * @param text The file name or comment. @param bytes The encoded of the filename or comment in the zip file. @param off The offset of the encoded filename or comment in <code>bytes</code>. @param len The length of the encoded filename or commentin <code>bytes</code>. 
protected	TokenNameprotected	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CRC32	TokenNameIdentifier	 CR C32
crc32	TokenNameIdentifier	 crc32
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc32	TokenNameIdentifier	 crc32
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameCRC32	TokenNameIdentifier	 name CR C32
=	TokenNameEQUAL	
crc32	TokenNameIdentifier	 crc32
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
unicodeName	TokenNameIdentifier	 unicode Name
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"FATAL: UTF-8 encoding not supported."	TokenNameStringLiteral	FATAL: UTF-8 encoding not supported.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assemble as unicode extension from the name/comment and * encoding of the orginal zip entry. * * @param text The file name or comment. * @param bytes The encoded of the filename or comment in the zip * file. */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode extension from the name/comment and encoding of the orginal zip entry. * @param text The file name or comment. @param bytes The encoded of the filename or comment in the zip file. 
protected	TokenNameprotected	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assembleData	TokenNameIdentifier	 assemble Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unicodeName	TokenNameIdentifier	 unicode Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
unicodeName	TokenNameIdentifier	 unicode Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// version 1 	TokenNameCOMMENT_LINE	version 1 
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
nameCRC32	TokenNameIdentifier	 name CR C32
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
unicodeName	TokenNameIdentifier	 unicode Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unicodeName	TokenNameIdentifier	 unicode Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The CRC32 checksum of the filename or comment as * encoded in the central directory of the zip file. */	TokenNameCOMMENT_JAVADOC	 @return The CRC32 checksum of the filename or comment as encoded in the central directory of the zip file. 
public	TokenNamepublic	
long	TokenNamelong	
getNameCRC32	TokenNameIdentifier	 get Name CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nameCRC32	TokenNameIdentifier	 name CR C32
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param nameCRC32 The CRC32 checksum of the filename as encoded * in the central directory of the zip file to set. */	TokenNameCOMMENT_JAVADOC	 @param nameCRC32 The CRC32 checksum of the filename as encoded in the central directory of the zip file to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setNameCRC32	TokenNameIdentifier	 set Name CR C32
(	TokenNameLPAREN	
long	TokenNamelong	
nameCRC32	TokenNameIdentifier	 name CR C32
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nameCRC32	TokenNameIdentifier	 name CR C32
=	TokenNameEQUAL	
nameCRC32	TokenNameIdentifier	 name CR C32
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The utf-8 encoded name. */	TokenNameCOMMENT_JAVADOC	 @return The utf-8 encoded name. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getUnicodeName	TokenNameIdentifier	 get Unicode Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unicodeName	TokenNameIdentifier	 unicode Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param unicodeName The utf-8 encoded name to set. */	TokenNameCOMMENT_JAVADOC	 @param unicodeName The utf-8 encoded name to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnicodeName	TokenNameIdentifier	 set Unicode Name
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unicodeName	TokenNameIdentifier	 unicode Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unicodeName	TokenNameIdentifier	 unicode Name
=	TokenNameEQUAL	
unicodeName	TokenNameIdentifier	 unicode Name
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
assembleData	TokenNameIdentifier	 assemble Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assembleData	TokenNameIdentifier	 assemble Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
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
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"UniCode path extra data must have at least"	TokenNameStringLiteral	UniCode path extra data must have at least
+	TokenNamePLUS	
" 5 bytes."	TokenNameStringLiteral	 5 bytes.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"Unsupported version ["	TokenNameStringLiteral	Unsupported version [
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
"] for UniCode path extra data."	TokenNameStringLiteral	] for UniCode path extra data.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nameCRC32	TokenNameIdentifier	 name CR C32
=	TokenNameEQUAL	
ZipLong	TokenNameIdentifier	 Zip Long
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unicodeName	TokenNameIdentifier	 unicode Name
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unicodeName	TokenNameIdentifier	 unicode Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
