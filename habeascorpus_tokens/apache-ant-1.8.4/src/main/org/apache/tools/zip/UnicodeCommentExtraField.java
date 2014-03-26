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
/** * Info-ZIP Unicode Comment Extra Field (0x6375): * * <p>Stores the UTF-8 version of the file comment as stored in the * central directory header.</p> * * <pre> * Value Size Description * ----- ---- ----------- * (UCom) 0x6375 Short tag for this extra block type ("uc") * TSize Short total data size for this block * Version 1 byte version of this extra field, currently 1 * ComCRC32 4 bytes Comment Field CRC32 Checksum * UnicodeCom Variable UTF-8 version of the entry comment * </pre> */	TokenNameCOMMENT_JAVADOC	 Info-ZIP Unicode Comment Extra Field (0x6375): * <p>Stores the UTF-8 version of the file comment as stored in the central directory header.</p> * <pre> Value Size Description ----- ---- ----------- (UCom) 0x6375 Short tag for this extra block type ("uc") TSize Short total data size for this block Version 1 byte version of this extra field, currently 1 ComCRC32 4 bytes Comment Field CRC32 Checksum UnicodeCom Variable UTF-8 version of the entry comment </pre> 
public	TokenNamepublic	
class	TokenNameclass	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
extends	TokenNameextends	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ZipShort	TokenNameIdentifier	 Zip Short
UCOM_ID	TokenNameIdentifier	 UCOM  ID
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0x6375	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Assemble as unicode comment extension from the name given as * text as well as the encoded bytes actually written to the archive. * * @param text The file name * @param bytes the bytes actually written to the archive * @param off The offset of the encoded comment in <code>bytes</code>. * @param len The length of the encoded comment or comment in * <code>bytes</code>. */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode comment extension from the name given as text as well as the encoded bytes actually written to the archive. * @param text The file name @param bytes the bytes actually written to the archive @param off The offset of the encoded comment in <code>bytes</code>. @param len The length of the encoded comment or comment in <code>bytes</code>. 
public	TokenNamepublic	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
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
super	TokenNamesuper	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assemble as unicode comment extension from the comment given as * text as well as the bytes actually written to the archive. * * @param comment The file comment * @param bytes the bytes actually written to the archive */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode comment extension from the comment given as text as well as the bytes actually written to the archive. * @param comment The file comment @param bytes the bytes actually written to the archive 
public	TokenNamepublic	
UnicodeCommentExtraField	TokenNameIdentifier	 Unicode Comment Extra Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UCOM_ID	TokenNameIdentifier	 UCOM  ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
