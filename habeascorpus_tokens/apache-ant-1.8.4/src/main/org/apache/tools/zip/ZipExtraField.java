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
/** * General format of extra field data. * * <p>Extra fields usually appear twice per file, once in the local * file data and once in the central directory. Usually they are the * same, but they don't have to be. {@link * java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream} will * only use the local file data in both places.</p> * */	TokenNameCOMMENT_JAVADOC	 General format of extra field data. * <p>Extra fields usually appear twice per file, once in the local file data and once in the central directory. Usually they are the same, but they don't have to be. {@link java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream} will only use the local file data in both places.</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
{	TokenNameLBRACE	
/** * The Header-ID. * @return the header id * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The Header-ID. @return the header id @since 1.1 
ZipShort	TokenNameIdentifier	 Zip Short
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Length of the extra field in the local file data - without * Header-ID or length specifier. * @return the length of the field in the local file data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Length of the extra field in the local file data - without Header-ID or length specifier. @return the length of the field in the local file data @since 1.1 
ZipShort	TokenNameIdentifier	 Zip Short
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Length of the extra field in the central directory - without * Header-ID or length specifier. * @return the length of the field in the central directory * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Length of the extra field in the central directory - without Header-ID or length specifier. @return the length of the field in the central directory @since 1.1 
ZipShort	TokenNameIdentifier	 Zip Short
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The actual data to put into local file data - without Header-ID * or length specifier. * @return the data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The actual data to put into local file data - without Header-ID or length specifier. @return the data @since 1.1 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The actual data to put into central directory - without Header-ID or * length specifier. * @return the data * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 The actual data to put into central directory - without Header-ID or length specifier. @return the data @since 1.1 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Populate data from this array as if it was in local file data. * @param data an array of bytes * @param offset the start offset * @param length the number of bytes in the array from offset * * @since 1.1 * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in local file data. @param data an array of bytes @param offset the start offset @param length the number of bytes in the array from offset * @since 1.1 @throws ZipException on error 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
