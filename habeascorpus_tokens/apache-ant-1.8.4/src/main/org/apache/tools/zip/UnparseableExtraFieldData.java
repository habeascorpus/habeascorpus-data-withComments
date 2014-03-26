/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
/** * Wrapper for extra field data that doesn't conform to the recommended format of header-tag + size + data. * * <p>The header-id is artificial (and not listed as a know ID in * the .ZIP File Format Specification). * Since it isn't used anywhere except to satisfy the * ZipExtraField contract it shouldn't matter anyway.</p> * @see <a href="http://www.pkware.com/documents/casestudies/APPNOTE.TXT * APPNOTE.TXT">.ZIP File Format Specification</a> * @since Ant 1.8.1 */	TokenNameCOMMENT_JAVADOC	 Wrapper for extra field data that doesn't conform to the recommended format of header-tag + size + data. * <p>The header-id is artificial (and not listed as a know ID in the .ZIP File Format Specification). Since it isn't used anywhere except to satisfy the ZipExtraField contract it shouldn't matter anyway.</p> @see <a href="http://www.pkware.com/documents/casestudies/APPNOTE.TXT APPNOTE.TXT">.ZIP File Format Specification</a> @since Ant 1.8.1 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
implements	TokenNameimplements	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
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
0xACC1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
localFileData	TokenNameIdentifier	 local File Data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
;	TokenNameSEMICOLON	
/** * The Header-ID. * * @return a completely arbitrary value that should be ignored. */	TokenNameCOMMENT_JAVADOC	 The Header-ID. * @return a completely arbitrary value that should be ignored. 
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
/** * Length of the complete extra field in the local file data. * * @return The LocalFileDataLength value */	TokenNameCOMMENT_JAVADOC	 Length of the complete extra field in the local file data. * @return The LocalFileDataLength value 
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
localFileData	TokenNameIdentifier	 local File Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
localFileData	TokenNameIdentifier	 local File Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Length of the complete extra field in the central directory. * * @return The CentralDirectoryLength value */	TokenNameCOMMENT_JAVADOC	 Length of the complete extra field in the central directory. * @return The CentralDirectoryLength value 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual data to put into local file data. * * @return The LocalFileDataData value */	TokenNameCOMMENT_JAVADOC	 The actual data to put into local file data. * @return The LocalFileDataData value 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZipUtil	TokenNameIdentifier	 Zip Util
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
localFileData	TokenNameIdentifier	 local File Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual data to put into central directory. * * @return The CentralDirectoryData value */	TokenNameCOMMENT_JAVADOC	 The actual data to put into central directory. * @return The CentralDirectoryData value 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ZipUtil	TokenNameIdentifier	 Zip Util
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populate data from this array as if it was in local file data. * * @param buffer the buffer to read data from * @param offset offset into buffer to read data * @param length the length of data */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in local file data. * @param buffer the buffer to read data from @param offset offset into buffer to read data @param length the length of data 
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
{	TokenNameLBRACE	
localFileData	TokenNameIdentifier	 local File Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
localFileData	TokenNameIdentifier	 local File Data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populate data from this array as if it was in central directory data. * * @param buffer the buffer to read data from * @param offset offset into buffer to read data * @param length the length of data * @exception ZipException on error */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in central directory data. * @param buffer the buffer to read data from @param offset offset into buffer to read data @param length the length of data @exception ZipException on error 
public	TokenNamepublic	
void	TokenNamevoid	
parseFromCentralDirectoryData	TokenNameIdentifier	 parse From Central Directory Data
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
{	TokenNameLBRACE	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
centralDirectoryData	TokenNameIdentifier	 central Directory Data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localFileData	TokenNameIdentifier	 local File Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
