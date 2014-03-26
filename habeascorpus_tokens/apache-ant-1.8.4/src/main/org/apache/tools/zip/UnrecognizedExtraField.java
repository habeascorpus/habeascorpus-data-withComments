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
/** * Simple placeholder for all those extra fields we don't want to deal * with. * * <p>Assumes local file data and central directory entries are * identical - unless told the opposite.</p> * */	TokenNameCOMMENT_JAVADOC	 Simple placeholder for all those extra fields we don't want to deal with. * <p>Assumes local file data and central directory entries are identical - unless told the opposite.</p> 
public	TokenNamepublic	
class	TokenNameclass	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
implements	TokenNameimplements	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
{	TokenNameLBRACE	
/** * The Header-ID. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The Header-ID. * @since 1.1 
private	TokenNameprivate	
ZipShort	TokenNameIdentifier	 Zip Short
headerId	TokenNameIdentifier	 header Id
;	TokenNameSEMICOLON	
/** * Set the header id. * @param headerId the header id to use */	TokenNameCOMMENT_JAVADOC	 Set the header id. @param headerId the header id to use 
public	TokenNamepublic	
void	TokenNamevoid	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
ZipShort	TokenNameIdentifier	 Zip Short
headerId	TokenNameIdentifier	 header Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
headerId	TokenNameIdentifier	 header Id
=	TokenNameEQUAL	
headerId	TokenNameIdentifier	 header Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the header id. * @return the header id */	TokenNameCOMMENT_JAVADOC	 Get the header id. @return the header id 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
headerId	TokenNameIdentifier	 header Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extra field data in local file data - without * Header-ID or length specifier. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Extra field data in local file data - without Header-ID or length specifier. * @since 1.1 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
localData	TokenNameIdentifier	 local Data
;	TokenNameSEMICOLON	
/** * Set the extra field data in the local file data - * without Header-ID or length specifier. * @param data the field data to use */	TokenNameCOMMENT_JAVADOC	 Set the extra field data in the local file data - without Header-ID or length specifier. @param data the field data to use 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localData	TokenNameIdentifier	 local Data
=	TokenNameEQUAL	
ZipUtil	TokenNameIdentifier	 Zip Util
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the local data. * @return the length of the local data */	TokenNameCOMMENT_JAVADOC	 Get the length of the local data. @return the length of the local data 
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
localData	TokenNameIdentifier	 local Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the local data. * @return the local data */	TokenNameCOMMENT_JAVADOC	 Get the local data. @return the local data 
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
localData	TokenNameIdentifier	 local Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extra field data in central directory - without * Header-ID or length specifier. * * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Extra field data in central directory - without Header-ID or length specifier. * @since 1.1 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
centralData	TokenNameIdentifier	 central Data
;	TokenNameSEMICOLON	
/** * Set the extra field data in central directory. * @param data the data to use */	TokenNameCOMMENT_JAVADOC	 Set the extra field data in central directory. @param data the data to use 
public	TokenNamepublic	
void	TokenNamevoid	
setCentralDirectoryData	TokenNameIdentifier	 set Central Directory Data
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
centralData	TokenNameIdentifier	 central Data
=	TokenNameEQUAL	
ZipUtil	TokenNameIdentifier	 Zip Util
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the central data length. * If there is no central data, get the local file data length. * @return the central data length */	TokenNameCOMMENT_JAVADOC	 Get the central data length. If there is no central data, get the local file data length. @return the central data length 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
centralData	TokenNameIdentifier	 central Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
centralData	TokenNameIdentifier	 central Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the central data. * @return the central data if present, else return the local file data */	TokenNameCOMMENT_JAVADOC	 Get the central data. @return the central data if present, else return the local file data 
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
centralData	TokenNameIdentifier	 central Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ZipUtil	TokenNameIdentifier	 Zip Util
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
centralData	TokenNameIdentifier	 central Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param data the array of bytes. * @param offset the source location in the data array. * @param length the number of bytes to use in the data array. * @see ZipExtraField#parseFromLocalFileData(byte[], int, int) */	TokenNameCOMMENT_JAVADOC	 @param data the array of bytes. @param offset the source location in the data array. @param length the number of bytes to use in the data array. @see ZipExtraField#parseFromLocalFileData(byte[], int, int) 
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
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
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
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param data the array of bytes. * @param offset the source location in the data array. * @param length the number of bytes to use in the data array. */	TokenNameCOMMENT_JAVADOC	 @param data the array of bytes. @param offset the source location in the data array. @param length the number of bytes to use in the data array. 
public	TokenNamepublic	
void	TokenNamevoid	
parseFromCentralDirectoryData	TokenNameIdentifier	 parse From Central Directory Data
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
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
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
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCentralDirectoryData	TokenNameIdentifier	 set Central Directory Data
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localData	TokenNameIdentifier	 local Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
