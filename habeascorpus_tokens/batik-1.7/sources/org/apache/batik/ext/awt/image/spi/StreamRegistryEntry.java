/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This type of Image tag registy entry is used for most normal image * file formats. You are given a markable stream and an opportunity * to check if it is "compatible" if you return true then you will * likely be asked to provide the decoded image next. * @see MagicNumberRegistryEntry * * @version $Id: StreamRegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This type of Image tag registy entry is used for most normal image file formats. You are given a markable stream and an opportunity to check if it is "compatible" if you return true then you will likely be asked to provide the decoded image next. @see MagicNumberRegistryEntry * @version $Id: StreamRegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
StreamRegistryEntry	TokenNameIdentifier	 Stream Registry Entry
extends	TokenNameextends	
RegistryEntry	TokenNameIdentifier	 Registry Entry
{	TokenNameLBRACE	
/** * returns the number of bytes that need to be * supported by mark on the InputStream for this * to check the stream for compatibility. */	TokenNameCOMMENT_JAVADOC	 returns the number of bytes that need to be supported by mark on the InputStream for this to check the stream for compatibility. 
int	TokenNameint	
getReadlimit	TokenNameIdentifier	 get Readlimit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Check if the Stream references an image that can be handled by * this format handler. The input stream passed in should be * assumed to support mark and reset. * * If this method throws a StreamCorruptedException then the * InputStream will be closed and a new one opened (if possible). * * This method should only throw a StreamCorruptedException if it * is unable to restore the state of the InputStream * (i.e. mark/reset fails basically). */	TokenNameCOMMENT_JAVADOC	 Check if the Stream references an image that can be handled by this format handler. The input stream passed in should be assumed to support mark and reset. * If this method throws a StreamCorruptedException then the InputStream will be closed and a new one opened (if possible). * This method should only throw a StreamCorruptedException if it is unable to restore the state of the InputStream (i.e. mark/reset fails basically). 
boolean	TokenNameboolean	
isCompatibleStream	TokenNameIdentifier	 is Compatible Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
;	TokenNameSEMICOLON	
/** * Decode the Stream into a Filter. If the stream turns out not to * be of a format this RegistryEntry can handle you should attempt * to reset the stream, then return null.<P> * * This should only return a broken link image when the image is * clearly of this format, but is unreadable for some reason. * * @param is The input stream that contains the image. * @param origURL The original URL, if any, for documentation * purposes only. This may be null. * @param needRawData If true the image returned should not have * any default color correction the file may * specify applied. */	TokenNameCOMMENT_JAVADOC	 Decode the Stream into a Filter. If the stream turns out not to be of a format this RegistryEntry can handle you should attempt to reset the stream, then return null.<P> * This should only return a broken link image when the image is clearly of this format, but is unreadable for some reason. * @param is The input stream that contains the image. @param origURL The original URL, if any, for documentation purposes only. This may be null. @param needRawData If true the image returned should not have any default color correction the file may specify applied. 
Filter	TokenNameIdentifier	 Filter
handleStream	TokenNameIdentifier	 handle Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
origURL	TokenNameIdentifier	 orig URL
,	TokenNameCOMMA	
boolean	TokenNameboolean	
needRawData	TokenNameIdentifier	 need Raw Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
