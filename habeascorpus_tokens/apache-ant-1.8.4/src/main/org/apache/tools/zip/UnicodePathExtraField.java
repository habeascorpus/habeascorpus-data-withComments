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
/** * Info-ZIP Unicode Path Extra Field (0x7075): * * <p>Stores the UTF-8 version of the file name field as stored in the * local header and central directory header.</p> * * <pre> * Value Size Description * ----- ---- ----------- * (UPath) 0x7075 Short tag for this extra block type ("up") * TSize Short total data size for this block * Version 1 byte version of this extra field, currently 1 * NameCRC32 4 bytes File Name Field CRC32 Checksum * UnicodeName Variable UTF-8 version of the entry File Name * </pre> */	TokenNameCOMMENT_JAVADOC	 Info-ZIP Unicode Path Extra Field (0x7075): * <p>Stores the UTF-8 version of the file name field as stored in the local header and central directory header.</p> * <pre> Value Size Description ----- ---- ----------- (UPath) 0x7075 Short tag for this extra block type ("up") TSize Short total data size for this block Version 1 byte version of this extra field, currently 1 NameCRC32 4 bytes File Name Field CRC32 Checksum UnicodeName Variable UTF-8 version of the entry File Name </pre> 
public	TokenNamepublic	
class	TokenNameclass	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
extends	TokenNameextends	
AbstractUnicodeExtraField	TokenNameIdentifier	 Abstract Unicode Extra Field
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ZipShort	TokenNameIdentifier	 Zip Short
UPATH_ID	TokenNameIdentifier	 UPATH  ID
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0x7075	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Assemble as unicode path extension from the name given as * text as well as the encoded bytes actually written to the archive. * * @param text The file name * @param bytes the bytes actually written to the archive * @param off The offset of the encoded filename in <code>bytes</code>. * @param len The length of the encoded filename or comment in * <code>bytes</code>. */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode path extension from the name given as text as well as the encoded bytes actually written to the archive. * @param text The file name @param bytes the bytes actually written to the archive @param off The offset of the encoded filename in <code>bytes</code>. @param len The length of the encoded filename or comment in <code>bytes</code>. 
public	TokenNamepublic	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
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
/** * Assemble as unicode path extension from the name given as * text as well as the encoded bytes actually written to the archive. * * @param name The file name * @param bytes the bytes actually written to the archive */	TokenNameCOMMENT_JAVADOC	 Assemble as unicode path extension from the name given as text as well as the encoded bytes actually written to the archive. * @param name The file name @param bytes the bytes actually written to the archive 
public	TokenNamepublic	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
UPATH_ID	TokenNameIdentifier	 UPATH  ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
