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
/** * This is a utility class that can be used by transcoders that * support transcoding hints and/or error handler. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TranscoderSupport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a utility class that can be used by transcoders that support transcoding hints and/or error handler. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TranscoderSupport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TranscoderSupport	TokenNameIdentifier	 Transcoder Support
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
ErrorHandler	TokenNameIdentifier	 Error Handler
defaultErrorHandler	TokenNameIdentifier	 default Error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The transcoding hints. */	TokenNameCOMMENT_JAVADOC	 The transcoding hints. 
protected	TokenNameprotected	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
new	TokenNamenew	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The error handler used to report warnings and errors. */	TokenNameCOMMENT_JAVADOC	 The error handler used to report warnings and errors. 
protected	TokenNameprotected	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
defaultErrorHandler	TokenNameIdentifier	 default Error Handler
;	TokenNameSEMICOLON	
/** * Constructs a new <tt>TranscoderSupport</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderSupport</tt>. 
public	TokenNamepublic	
TranscoderSupport	TokenNameIdentifier	 Transcoder Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns a copy of the transcoding hints of this transcoder. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the transcoding hints of this transcoder. 
public	TokenNamepublic	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
getTranscodingHints	TokenNameIdentifier	 get Transcoding Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of a single preference for the transcoding process. * @param key the key of the hint to be set * @param value the value indicating preferences for the specified * hint category. */	TokenNameCOMMENT_JAVADOC	 Sets the value of a single preference for the transcoding process. @param key the key of the hint to be set @param value the value indicating preferences for the specified hint category. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the value of a single preference for the transcoding process. * @param key the key of the hint to remove */	TokenNameCOMMENT_JAVADOC	 Removes the value of a single preference for the transcoding process. @param key the key of the hint to remove 
public	TokenNamepublic	
void	TokenNamevoid	
removeTranscodingHint	TokenNameIdentifier	 remove Transcoding Hint
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces the values of all preferences for the transcoding algorithms * with the specified hints. * @param hints the rendering hints to be set */	TokenNameCOMMENT_JAVADOC	 Replaces the values of all preferences for the transcoding algorithms with the specified hints. @param hints the rendering hints to be set 
public	TokenNamepublic	
void	TokenNamevoid	
setTranscodingHints	TokenNameIdentifier	 set Transcoding Hints
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the values of all preferences for the transcoding algorithms * with the specified hints. * @param hints the rendering hints to be set */	TokenNameCOMMENT_JAVADOC	 Sets the values of all preferences for the transcoding algorithms with the specified hints. @param hints the rendering hints to be set 
public	TokenNamepublic	
void	TokenNamevoid	
setTranscodingHints	TokenNameIdentifier	 set Transcoding Hints
(	TokenNameLPAREN	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the error handler this transcoder may use to report * warnings and errors. * @param handler to ErrorHandler to use */	TokenNameCOMMENT_JAVADOC	 Sets the error handler this transcoder may use to report warnings and errors. @param handler to ErrorHandler to use 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the error handler this transcoder uses to report * warnings and errors, or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the error handler this transcoder uses to report warnings and errors, or null if any. 
public	TokenNamepublic	
ErrorHandler	TokenNameIdentifier	 Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
