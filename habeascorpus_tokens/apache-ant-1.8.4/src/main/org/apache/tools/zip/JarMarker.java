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
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * If this extra field is added as the very first extra field of the * archive, Solaris will consider it an executable jar file. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 If this extra field is added as the very first extra field of the archive, Solaris will consider it an executable jar file. * @since Ant 1.6.3 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
JarMarker	TokenNameIdentifier	 Jar Marker
implements	TokenNameimplements	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ZipShort	TokenNameIdentifier	 Zip Short
ID	TokenNameIdentifier	 ID
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0xCAFE	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ZipShort	TokenNameIdentifier	 Zip Short
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_BYTES	TokenNameIdentifier	 NO  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
JarMarker	TokenNameIdentifier	 Jar Marker
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
JarMarker	TokenNameIdentifier	 Jar Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** No-arg constructor */	TokenNameCOMMENT_JAVADOC	 No-arg constructor 
public	TokenNamepublic	
JarMarker	TokenNameIdentifier	 Jar Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty 	TokenNameCOMMENT_LINE	empty 
}	TokenNameRBRACE	
/** * Since JarMarker is stateless we can always use the same instance. * @return the DEFAULT jarmaker. */	TokenNameCOMMENT_JAVADOC	 Since JarMarker is stateless we can always use the same instance. @return the DEFAULT jarmaker. 
public	TokenNamepublic	
static	TokenNamestatic	
JarMarker	TokenNameIdentifier	 Jar Marker
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Header-ID. * @return the header id */	TokenNameCOMMENT_JAVADOC	 The Header-ID. @return the header id 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ID	TokenNameIdentifier	 ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Length of the extra field in the local file data - without * Header-ID or length specifier. * @return 0 */	TokenNameCOMMENT_JAVADOC	 Length of the extra field in the local file data - without Header-ID or length specifier. @return 0 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Length of the extra field in the central directory - without * Header-ID or length specifier. * @return 0 */	TokenNameCOMMENT_JAVADOC	 Length of the extra field in the central directory - without Header-ID or length specifier. @return 0 
public	TokenNamepublic	
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual data to put into local file data - without Header-ID * or length specifier. * @return the data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The actual data to put into local file data - without Header-ID or length specifier. @return the data @since 1.1 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_BYTES	TokenNameIdentifier	 NO  BYTES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual data to put central directory - without Header-ID or * length specifier. * @return the data */	TokenNameCOMMENT_JAVADOC	 The actual data to put central directory - without Header-ID or length specifier. @return the data 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NO_BYTES	TokenNameIdentifier	 NO  BYTES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populate data from this array as if it was in local file data. * @param data an array of bytes * @param offset the start offset * @param length the number of bytes in the array from offset * * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in local file data. @param data an array of bytes @param offset the start offset @param length the number of bytes in the array from offset * @throws ZipException on error 
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
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ZipException	TokenNameIdentifier	 Zip Exception
(	TokenNameLPAREN	
"JarMarker doesn't expect any data"	TokenNameStringLiteral	JarMarker doesn't expect any data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
