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
/** * {@link ZipExtraField ZipExtraField} that knows how to parse central * directory data. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 {@link ZipExtraField ZipExtraField} that knows how to parse central directory data. * @since Ant 1.8.0 
public	TokenNamepublic	
interface	TokenNameinterface	
CentralDirectoryParsingZipExtraField	TokenNameIdentifier	 Central Directory Parsing Zip Extra Field
extends	TokenNameextends	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
{	TokenNameLBRACE	
/** * Populate data from this array as if it was in central directory data. * @param data an array of bytes * @param offset the start offset * @param length the number of bytes in the array from offset * * @throws ZipException on error */	TokenNameCOMMENT_JAVADOC	 Populate data from this array as if it was in central directory data. @param data an array of bytes @param offset the start offset @param length the number of bytes in the array from offset * @throws ZipException on error 
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
throws	TokenNamethrows	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
