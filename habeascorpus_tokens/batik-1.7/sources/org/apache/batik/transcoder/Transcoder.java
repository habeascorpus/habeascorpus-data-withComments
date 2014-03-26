/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * This class defines an API for transcoding. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: Transcoder.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class defines an API for transcoding. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: Transcoder.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Transcoder	TokenNameIdentifier	 Transcoder
{	TokenNameLBRACE	
/** * Transcodes the specified input in the specified output. * @param input the input to transcode * @param output the ouput where to transcode * @exception TranscoderException if an error occured while transcoding */	TokenNameCOMMENT_JAVADOC	 Transcodes the specified input in the specified output. @param input the input to transcode @param output the ouput where to transcode @exception TranscoderException if an error occured while transcoding 
void	TokenNamevoid	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
;	TokenNameSEMICOLON	
/** * Returns the transcoding hints of this transcoder. */	TokenNameCOMMENT_JAVADOC	 Returns the transcoding hints of this transcoder. 
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
getTranscodingHints	TokenNameIdentifier	 get Transcoding Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value of a single preference for the transcoding process. * @param key the key of the hint to be set * @param value the value indicating preferences for the specified * hint category. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a single preference for the transcoding process. @param key the key of the hint to be set @param value the value indicating preferences for the specified hint category. 
void	TokenNamevoid	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the value of a single preference for the transcoding process. * @param key the key of the hint to remove */	TokenNameCOMMENT_JAVADOC	 Removes the value of a single preference for the transcoding process. @param key the key of the hint to remove 
void	TokenNamevoid	
removeTranscodingHint	TokenNameIdentifier	 remove Transcoding Hint
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Replaces the values of all preferences for the transcoding algorithms * with the specified hints. * @param hints the rendering hints to be set */	TokenNameCOMMENT_JAVADOC	 Replaces the values of all preferences for the transcoding algorithms with the specified hints. @param hints the rendering hints to be set 
void	TokenNamevoid	
setTranscodingHints	TokenNameIdentifier	 set Transcoding Hints
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the values of all preferences for the transcoding algorithms * with the specified hints. * @param hints the rendering hints to be set */	TokenNameCOMMENT_JAVADOC	 Sets the values of all preferences for the transcoding algorithms with the specified hints. @param hints the rendering hints to be set 
void	TokenNamevoid	
setTranscodingHints	TokenNameIdentifier	 set Transcoding Hints
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the error handler this transcoder may use to report * warnings and errors. * @param handler to ErrorHandler to use */	TokenNameCOMMENT_JAVADOC	 Sets the error handler this transcoder may use to report warnings and errors. @param handler to ErrorHandler to use 
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the error handler this transcoder uses to report * warnings and errors, or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the error handler this transcoder uses to report warnings and errors, or null if any. 
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
